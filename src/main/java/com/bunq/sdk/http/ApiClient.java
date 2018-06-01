package com.bunq.sdk.http;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.context.BunqContext;
import com.bunq.sdk.context.InstallationContext;
import com.bunq.sdk.exception.ApiException;
import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.exception.ExceptionFactory;
import com.bunq.sdk.exception.UncaughtExceptionError;
import com.bunq.sdk.json.BunqGsonBuilder;
import com.bunq.sdk.security.SecurityUtils;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import okhttp3.CertificatePinner;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.UUID;
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
  private static final String ERROR_AMI_ENVIRONMENT_NOT_EXPECTED = "ApiEnvironment type \"%s\" is unexpected";
  private static final String ERROR_COULD_NOT_DETERMINE_RESPONSE_ID = "Could not determine response id.";

  /**
   * Endpoints not requiring active session for the request to succeed.
   */
  private static final String DEVICE_SERVER_URL = "device-server";
  private static final String INSTALLATION_URL = "installation";
  private static final String SESSION_SERVER_URL = "session-server";
  private static final List<String> URIS_NOT_REQUIRING_ACTIVE_SESSION = Arrays.asList(
      DEVICE_SERVER_URL,
      INSTALLATION_URL,
      SESSION_SERVER_URL
  );

  /**
   * Header constants.
   */
  public static final String HEADER_ATTACHMENT_DESCRIPTION = "X-Bunq-Attachment-Description";
  public static final String HEADER_CONTENT_TYPE = "Content-Type";
  public static final String HEADER_USER_AGENT = "User-Agent";
  public static final String HEADER_CACHE_CONTROL = "Cache-Control";
  public static final String HEADER_LANGUAGE = "X-Bunq-Language";
  public static final String HEADER_REGION = "X-Bunq-Region";
  public static final String HEADER_REQUEST_ID = "X-Bunq-Client-Request-Id";
  public static final String HEADER_GEOLOCATION = "X-Bunq-Geolocation";
  private static final String HEADER_SIGNATURE = "X-Bunq-Client-Signature";
  private static final String HEADER_AUTHENTICATION = "X-Bunq-Client-Authentication";
  private static final String HEADER_RESPONSE_ID_LOWER_CASE = "x-bunq-client-response-id";
  private static final String HEADER_RESPONSE_ID_UPPER_CASE = "X-Bunq-Client-Response-Id";

  /**
   * Field constants.
   */
  private static final String FIELD_ERROR = "Error";
  private static final String FIELD_ERROR_DESCRIPTION = "error_description";

  /**
   * Header value to disable the cache control.
   */
  public static final String CACHE_CONTROL_NONE = "no-cache";

  /**
   * Prefix for bunq's own headers.
   */
  private static final String USER_AGENT_BUNQ = "bunq-sdk-java/0.13.1";
  private static final String LANGUAGE_EN_US = "en_US";
  private static final String REGION_NL_NL = "nl_NL";
  private static final String GEOLOCATION_ZERO = "0 0 0 0 000";
  private static final String SCHEME_HTTPS = "https";

  /**
   * Pinned keys.
   */
  private static final String PINNED_KEY_SANDBOX = "sha256/GhNvDokiMyXzhGft+xXWFGchUmmh8R5dQEnO4xu81NY=";
  private static final String PINNED_KEY_PRODUCTION = "sha256/nI/T/sDfioCBHB5mVppDPyLi2HXYanwk2arpZuHLOu0=";

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
  private OkHttpClient httpClient;
  private ApiContext apiContext;

  /**
   * @param apiContext API context to make the calls in.
   */
  public ApiClient(ApiContext apiContext) {
    this.apiContext = apiContext;
    this.httpClient = buildOkHttpClient();
  }

  /**
   */
  private OkHttpClient buildOkHttpClient() {
    OkHttpClient.Builder clientBuilder;

    clientBuilder = new OkHttpClient().newBuilder()
        .certificatePinner(determineCertificateToPin())
        .connectTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
        .readTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
        .writeTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS);

    setProxyIfNeeded(clientBuilder);

    return clientBuilder.build();
  }

  /**
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
   */
  private CertificatePinner determineCertificateToPin() {
    CertificatePinner.Builder certificateBuilder = new CertificatePinner.Builder();

    switch (apiContext.getEnvironmentType()) {
      case PRODUCTION:
        return certificateBuilder.add(
            apiContext.getBaseUri(), PINNED_KEY_PRODUCTION
        ).build();
      case SANDBOX:
        return certificateBuilder.add(
            apiContext.getBaseUri(), PINNED_KEY_SANDBOX
        ).build();
      default:
        throw new BunqException(
            String.format(ERROR_AMI_ENVIRONMENT_NOT_EXPECTED, apiContext.getEnvironmentType().toString())
        );
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

    BunqRequestBody bunqRequestBody = BunqRequestBody.create(ContentType.JSON.getMediaType(), requestBodyBytes);

    if (customHeaders.containsKey(HEADER_CONTENT_TYPE)) {
      bunqRequestBody = BunqRequestBody.create(
          MediaType.parse(customHeaders.get(HEADER_CONTENT_TYPE)),
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
   */
  private HttpUrl determineFullUri(String uri) {
    return determineFullUri(uri, new HashMap<>());
  }

  /**
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
   */
  private void setHeaders(BunqRequestBuilder requestBuilder, Map<String, String> customHeaders) {
    setDefaultHeaders(requestBuilder);
    setCustomHeaders(requestBuilder, customHeaders);
    setSessionHeaders(requestBuilder);
  }

  /**
   */
  private void setDefaultHeaders(Request.Builder httpEntity) {
    httpEntity.addHeader(HEADER_CACHE_CONTROL, CACHE_CONTROL_NONE);
    httpEntity.addHeader(HEADER_USER_AGENT, getVersion());
    httpEntity.addHeader(HEADER_LANGUAGE, LANGUAGE_EN_US);
    httpEntity.addHeader(HEADER_REGION, REGION_NL_NL);
    httpEntity.addHeader(HEADER_REQUEST_ID, UUID.randomUUID().toString());
    httpEntity.addHeader(HEADER_GEOLOCATION, GEOLOCATION_ZERO);
  }

  /**
   */
  private void setCustomHeaders(Request.Builder requestBuilder, Map<String, String> customHeaders) {
    for (Map.Entry<String, String> entry : customHeaders.entrySet()) {
      requestBuilder.addHeader(entry.getKey(), entry.getValue());
    }
  }

  /**
   */
  private void setSessionHeaders(BunqRequestBuilder requestBuilder) {
    String sessionToken = apiContext.getSessionToken();

    if (sessionToken != null) {
      requestBuilder.addHeader(HEADER_AUTHENTICATION, sessionToken);
      requestBuilder.addHeader(HEADER_SIGNATURE, generateSignature(requestBuilder));
    }
  }

  /**
   */
  private String generateSignature(BunqRequestBuilder requestBuilder) {
    return SecurityUtils.generateSignature(requestBuilder,
        apiContext.getInstallationContext().getKeyPairClient());
  }

  /**
   */
  private String getVersion() {
    return USER_AGENT_BUNQ;
  }

  /**
   */
  private BunqResponseRaw createBunqResponseRaw(Response response)
      throws IOException {
    Integer responseCode = response.code();
    byte[] responseBodyBytes = Objects.requireNonNull(response.body()).bytes();

    assertResponseSuccess(responseCode, responseBodyBytes, getResponseId(response));
    validateResponseSignature(responseCode, responseBodyBytes, response);

    return new BunqResponseRaw(responseBodyBytes, getHeadersMap(response));
  }

  /**
   */
  private static String getResponseId(Response response) {
    Map<String, String> headerMap = getHeadersMap(response);

    if (headerMap.containsKey(HEADER_RESPONSE_ID_LOWER_CASE)) {
      return headerMap.get(HEADER_RESPONSE_ID_LOWER_CASE);
    } else return headerMap.getOrDefault(HEADER_RESPONSE_ID_UPPER_CASE, ERROR_COULD_NOT_DETERMINE_RESPONSE_ID);
  }

  /**
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
   */
  private static Map<String, String> getHeadersMap(Response response) {
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
