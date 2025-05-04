package com.bunq.sdk.http;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.context.ApiEnvironmentType;
import com.bunq.sdk.context.BunqContext;
import com.bunq.sdk.context.InstallationContext;
import com.bunq.sdk.exception.ApiException;
import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.exception.ExceptionFactory;
import com.bunq.sdk.exception.UncaughtExceptionError;
import com.bunq.sdk.json.BunqGsonBuilder;
import com.bunq.sdk.security.SecurityUtils;
import com.google.gson.*;
import okhttp3.*;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/**
 * API Client encapsulates the basic operations for the API, such as HTTP requests to API, setting
 * default headers or signing the requests with your API key.
 */
public class ApiClient {

    /**
     * Error constants.
     */
    private static final String ERROR_COULD_NOT_DETERMINE_PINNED_KEY =
            "Could not determine pinned key.";

    /**
     * Endpoints not requiring active session for the request to succeed.
     */
    private static final String DEVICE_SERVER_URL = "device-server";
    private static final String INSTALLATION_URL = "installation";
    private static final String SESSION_SERVER_URL = "session-server";
    private static final String PAYMENT_SERVICE_PROVIDER_CREDENTIAL_URL = "payment-service-provider-credential";

    private static final List<String> URIS_NOT_REQUIRING_ACTIVE_SESSION = Arrays.asList(
            DEVICE_SERVER_URL,
            INSTALLATION_URL,
            SESSION_SERVER_URL,
            PAYMENT_SERVICE_PROVIDER_CREDENTIAL_URL
    );

    /**
     * Field constants.
     */
    private static final String FIELD_ERROR = "Error";
    private static final String FIELD_ERROR_DESCRIPTION = "error_description";

    private static final String SCHEME_HTTPS = "https";

    /**
     * Time out constants.
     */
    private static final int TIMEOUT_SECONDS = 30;
    private static final String OK_STATUS_CODE_RANGE = "2[0-9]{2}";

    /**
     * Response code to use in case the response code is null due to unforeseen circumstances.
     */
    private static final int DUMMY_RESPONSE_CODE = 0;

    /**
     * Private variables.
     */
    private final OkHttpClient httpClient;
    private final ApiContext apiContext;

    /**
     * @param apiContext API context to make the calls in.
     */
    public ApiClient(ApiContext apiContext) {
        this.apiContext = apiContext;
        this.httpClient = buildOkHttpClient();
    }

    /**
     *
     */
    private OkHttpClient buildOkHttpClient() {
        OkHttpClient.Builder clientBuilder;

        clientBuilder = new OkHttpClient().newBuilder()
                .connectTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                .readTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
                .writeTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS);

        if (shouldEnableCertificatePinning()) {
            clientBuilder.certificatePinner(
                    determineCertificateToPin(this.apiContext.getEnvironmentType())
            );
        }

        setProxyIfNeeded(clientBuilder);

        return clientBuilder.build();
    }

    /**
     *
     */
    private void setProxyIfNeeded(OkHttpClient.Builder httpClientBuilder) {
        String proxyString = apiContext.getProxy();

        if (proxyString != null) {
            URL url = Objects.requireNonNull(HttpUrl.parse(proxyString)).url();
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(url.getHost(), url.getPort()));
            httpClientBuilder.proxy(proxy);
        }
    }

    /**
     *
     */
    private boolean shouldEnableCertificatePinning() {
        return this.apiContext.getEnvironmentType().getPinnedKey() != null;
    }

    private static CertificatePinner determineCertificateToPin(ApiEnvironmentType environmentType) {
        if (environmentType != null && environmentType.getPinnedKey() != null) {
            return new CertificatePinner.Builder()
                    .add(
                            environmentType.getBaseUri(),
                            environmentType.getPinnedKey()
                    )
                    .build();
        } else {
            throw new BunqException(ERROR_COULD_NOT_DETERMINE_PINNED_KEY);
        }
    }

    /**
     * Execute a POST request.
     *
     * @return The raw response of the POST request.
     */
    public BunqResponseRaw post(
            String uri,
            byte[] requestBodyBytes,
            Map<String, String> customHeaders
    ) {
        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        BunqRequestBody bunqRequestBody = BunqRequestBody.create(
                ContentType.JSON.getMediaType(),
                requestBodyBytes
        );

        if (customHeaders.containsKey(BunqHeader.CONTENT_TYPE.getHeaderName())) {
            bunqRequestBody = BunqRequestBody.create(
                    MediaType.parse(customHeaders.get(BunqHeader.CONTENT_TYPE.getHeaderName())),
                    requestBodyBytes
            );
        }

        try {
            BunqRequestBuilder requestBuilder = new BunqRequestBuilder()
                    .url(determineFullUri(uri))
                    .post(bunqRequestBody);
            Response response = executeRequest(requestBuilder, customHeaders, uri);

            return createBunqResponseRaw(response);
        } catch (IOException exception) {
            throw new UncaughtExceptionError(exception);
        }
    }

    /**
     *
     */
    private HttpUrl determineFullUri(String uri) {
        return determineFullUri(uri, new HashMap<String, String>());
    }

    /**
     *
     */
    private HttpUrl determineFullUri(String uri, Map<String, String> params) {
        HttpUrl.Builder urlBuilder = new HttpUrl.Builder()
                .scheme(SCHEME_HTTPS)
                .host(apiContext.getBaseUri())
                .addPathSegment(apiContext.getApiVersion())
                .addPathSegments(uri);

        SortedMap<String, String> paramsSorted = new TreeMap<>(params);

        for (Map.Entry<String, String> param : paramsSorted.entrySet()) {
            urlBuilder.addQueryParameter(param.getKey(), param.getValue());
        }

        return urlBuilder.build();
    }

    /**
     *
     */
    private Response executeRequest(
            BunqRequestBuilder request,
            Map<String, String> customHeaders,
            String uri
    ) throws IOException {
        if (!URIS_NOT_REQUIRING_ACTIVE_SESSION.contains(uri) && apiContext.ensureSessionActive()) {
            BunqContext.updateApiContext(apiContext);
        }

        setHeaders(request, customHeaders);

        return httpClient.newCall(request.build()).execute();
    }

    /**
     *
     */
    private void setHeaders(BunqRequestBuilder requestBuilder, Map<String, String> customHeaders) {
        setDefaultHeaders(requestBuilder);
        setCustomHeaders(requestBuilder, customHeaders);
        setSessionHeaders(requestBuilder);
    }

    /**
     *
     */
    private void setDefaultHeaders(BunqRequestBuilder httpEntity) {
        BunqHeader.CACHE_CONTROL.addTo(httpEntity);
        BunqHeader.USER_AGENT.addTo(httpEntity);
        BunqHeader.LANGUAGE.addTo(httpEntity);
        BunqHeader.REGION.addTo(httpEntity);
        BunqHeader.CLIENT_REQUEST_ID.addTo(httpEntity, UUID.randomUUID().toString());
        BunqHeader.GEOLOCATION.addTo(httpEntity);
    }

    /**
     *
     */
    private void setCustomHeaders(Request.Builder requestBuilder, Map<String, String> customHeaders) {
        for (Map.Entry<String, String> entry : customHeaders.entrySet()) {
            requestBuilder.header(entry.getKey(), entry.getValue());
        }
    }

    /**
     *
     */
    private void setSessionHeaders(BunqRequestBuilder requestBuilder) {
        String sessionToken = apiContext.getSessionToken();

        if (sessionToken != null) {
            BunqHeader.CLIENT_AUTHENTICATION.addTo(requestBuilder, sessionToken);
            BunqHeader.CLIENT_SIGNATURE.addTo(requestBuilder, generateSignature(requestBuilder));
        }
    }

    /**
     *
     */
    private String generateSignature(BunqRequestBuilder requestBuilder) {
        return SecurityUtils.generateSignature(requestBuilder,
                apiContext.getInstallationContext().getKeyPairClient());
    }

    /**
     *
     */
    private BunqResponseRaw createBunqResponseRaw(Response response)
            throws IOException {
        int responseCode = response.code();
        byte[] responseBodyBytes = Objects.requireNonNull(response.body()).bytes();

        assertResponseSuccess(responseCode, responseBodyBytes, getResponseId(response));
        validateResponseSignature(responseCode, responseBodyBytes, response);

        return new BunqResponseRaw(responseBodyBytes, getHeadersMap(response));
    }

    /**
     *
     */
    private static String getResponseId(Response response) {
        Map<String, String> headerMap = getHeadersMap(response);

        return BunqHeader.CLIENT_RESPONSE_ID.getHeaderValueOrDefault(headerMap);
    }

    /**
     *
     */
    private static void assertResponseSuccess(Integer responseCode, byte[] responseBodyBytes, String responseId) {
        if (responseCode == null) {
            responseCode = DUMMY_RESPONSE_CODE;
        }

        if (!Pattern.matches(OK_STATUS_CODE_RANGE, responseCode.toString())) {
            throw createApiExceptionRequestUnsuccessful(responseCode, new String(responseBodyBytes), responseId);
        }
    }

    /**
     *
     */
    private static ApiException createApiExceptionRequestUnsuccessful(
            Integer responseCode,
            String responseBody,
            String responseId
    ) {
        List<String> allErrorDescription = new ArrayList<>();

        try {
            allErrorDescription.addAll(fetchAllErrorDescription(responseBody));
        } catch (JsonSyntaxException exception) {
            allErrorDescription.add(responseBody);
        }

        return ExceptionFactory.createExceptionForResponse(responseCode, allErrorDescription, responseId);
    }

    /**
     *
     */
    private static List<String> fetchAllErrorDescription(String responseBody)
            throws JsonSyntaxException {
        List<String> errorDescriptions = new ArrayList<>();
        GsonBuilder gsonBuilder = BunqGsonBuilder.buildDefault();
        JsonObject responseBodyJson = gsonBuilder.create().fromJson(responseBody, JsonObject.class);

        if (responseBodyJson.getAsJsonObject().has(FIELD_ERROR)) {
            errorDescriptions.addAll(fetchAllErrorDescription(responseBodyJson));
        } else {
            errorDescriptions.add(responseBody);
        }

        return errorDescriptions;
    }

    /**
     *
     */
    private static List<String> fetchAllErrorDescription(JsonObject responseBodyJson) {
        List<String> errorDescriptions = new ArrayList<>();
        JsonArray exceptionBodies = responseBodyJson.getAsJsonObject().getAsJsonArray(FIELD_ERROR);

        for (JsonElement exceptionBody : exceptionBodies) {
            JsonObject exceptionBodyJson = exceptionBody.getAsJsonObject();
            errorDescriptions.add(exceptionBodyJson.get(FIELD_ERROR_DESCRIPTION).getAsString());
        }

        return errorDescriptions;
    }

    /**
     *
     */
    private void validateResponseSignature(
            int responseCode,
            byte[] responseBodyBytes,
            Response response
    ) {
        InstallationContext installationContext = apiContext.getInstallationContext();

        if (installationContext != null) {
            SecurityUtils.validateResponseSignature(responseCode, responseBodyBytes, response,
                    installationContext.getPublicKeyServer());
        }
    }

    /**
     *
     */
    protected static Map<String, String> getHeadersMap(Response response) {
        HashMap<String, String> headersMap = new HashMap<>();

        for (String headerName : response.headers().names()) {
            headersMap.put(headerName, response.headers().get(headerName));
        }

        return headersMap;
    }

    /**
     * Execute a GET request.
     *
     * @return The raw response of the GET request.
     */
    public BunqResponseRaw get(
            String uri,
            Map<String, String> params,
            Map<String, String> customHeaders
    ) {
        if (params == null) {
            params = new HashMap<>();
        }

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        try {
            BunqRequestBuilder requestBuilder = new BunqRequestBuilder()
                    .get()
                    .url(determineFullUri(uri, params));
            Response response = executeRequest(requestBuilder, customHeaders, uri);

            return createBunqResponseRaw(response);
        } catch (IOException exception) {
            throw new UncaughtExceptionError(exception);
        }
    }

    /**
     * Execute a PUT request.
     *
     * @return The raw response of the PUT request.
     */
    public BunqResponseRaw put(
            String uri,
            byte[] requestBodyBytes,
            Map<String, String> customHeaders
    ) {
        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        try {
            BunqRequestBuilder requestBuilder = new BunqRequestBuilder()
                    .put(BunqRequestBody.create(ContentType.JSON.getMediaType(), requestBodyBytes))
                    .url(determineFullUri(uri));
            Response response = executeRequest(requestBuilder, customHeaders, uri);

            return createBunqResponseRaw(response);
        } catch (IOException exception) {
            throw new UncaughtExceptionError(exception);
        }
    }

    /**
     * Execute a DELETE request.
     *
     * @return The response of the DELETE request.
     */
    public BunqResponseRaw delete(String uri, Map<String, String> customHeaders) {
        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        try {
            BunqRequestBuilder requestBuilder = new BunqRequestBuilder()
                    .delete()
                    .url(determineFullUri(uri));
            Response response = executeRequest(requestBuilder, customHeaders, uri);

            return createBunqResponseRaw(response);
        } catch (IOException exception) {
            throw new UncaughtExceptionError(exception);
        }
    }
}
