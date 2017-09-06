package com.bunq.sdk.http;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.context.InstallationContext;
import com.bunq.sdk.exception.ApiException;
import com.bunq.sdk.exception.UncaughtExceptionError;
import com.bunq.sdk.json.BunqGsonBuilder;
import com.bunq.sdk.security.SecurityUtils;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.sun.jndi.toolkit.url.Uri;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.UUID;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.util.EntityUtils;

/**
 * API Client encapsulates the basic operations for the API, such as HTTP requests to API, setting
 * default headers or signing the requests with your API key.
 */
public class ApiClient {

  /**
   * Header constants.
   */
  public static final String HEADER_ATTACHMENT_DESCRIPTION = "X-Bunq-Attachment-Description";
  public static final String HEADER_CONTENT_TYPE = "Content-Type";
  public static final String HEADER_USER_AGENT = "User-Agent";
  public static final String HEADER_CACHE_CONTROL = "Cache-Control";
  private static final String HEADER_LANGUAGE = "X-Bunq-Language";
  private static final String HEADER_REGION = "X-Bunq-Region";
  private static final String HEADER_REQUEST_ID = "X-Bunq-Client-Request-Id";
  private static final String HEADER_GEOLOCATION = "X-Bunq-Geolocation";
  private static final String HEADER_SIGNATURE = "X-Bunq-Client-Signature";
  private static final String HEADER_AUTHENTICATION = "X-Bunq-Client-Authentication";

  /**
   * Field constants.
   */
  private static final String FIELD_ERROR = "Error";
  private static final String FIELD_ERROR_DESCRIPTION = "error_description";

  /**
   * Header value to disable the cache control.
   */
  private static final String CACHE_CONTROL_NONE = "no-cache";

  /**
   * Prefix for bunq's own headers.
   */
  private static final String USER_AGENT_BUNQ = "bunq-sdk-java/0.11.0";
  private static final String LANGUAGE_EN_US = "en_US";
  private static final String REGION_NL_NL = "nl_NL";
  private static final String GEOLOCATION_ZERO = "0 0 0 0 000";

  /**
   * Private variables.
   */
  private CloseableHttpClient httpClient;
  private ApiContext apiContext;

  /**
   * @param apiContext API context to make the calls in.
   */
  public ApiClient(ApiContext apiContext) {
    this.apiContext = apiContext;
    this.httpClient = buildHttpClient();
  }

  private CloseableHttpClient buildHttpClient() {
    try {
      // TODO: Fix SSL handling
      SSLContextBuilder builder = new SSLContextBuilder();
      SSLConnectionSocketFactory sslConnectionSocketFactory =
          new SSLConnectionSocketFactory(builder.build());
      HttpClientBuilder httpClientBuilder = HttpClients
          .custom()
          .setSSLSocketFactory(sslConnectionSocketFactory);
      setProxyIfNeeded(httpClientBuilder);

      return httpClientBuilder.build();
    } catch (NoSuchAlgorithmException | KeyManagementException | MalformedURLException exception) {
      throw new UncaughtExceptionError(exception);
    }
  }

  private void setProxyIfNeeded(HttpClientBuilder httpClientBuilder)
      throws MalformedURLException {
    String proxyString = apiContext.getProxy();

    if (proxyString != null) {
      Uri proxyUri = new Uri(proxyString);
      HttpHost proxy = new HttpHost(proxyUri.getHost(), proxyUri.getPort(), proxyUri.getScheme());
      httpClientBuilder.setProxy(proxy);
    }
  }

  /**
   * Execute a POST request.
   *
   * @return The raw response of the POST request.
   */
  public BunqResponseRaw post(String uri, byte[] requestBodyBytes,
      Map<String, String> customHeaders) {
    try {
      HttpPost httpPost = new HttpPost(determineFullUri(uri));
      httpPost.setEntity(new ByteArrayEntity(requestBodyBytes, ContentType.APPLICATION_JSON));
      CloseableHttpResponse response = executeRequest(httpPost, customHeaders);

      return createBunqResponseRaw(response);
    } catch (IOException | URISyntaxException exception) {
      throw new UncaughtExceptionError(exception);
    }
  }

  private URI determineFullUri(String uri) throws URISyntaxException {
    return determineFullUri(uri, new HashMap<>());
  }

  private URI determineFullUri(String uri, Map<String, String> params) throws URISyntaxException {
    URIBuilder builder = new URIBuilder(apiContext.getBaseUri().toString() + uri);
    SortedMap<String, String> paramsSorted = new TreeMap<>(params);

    for (Map.Entry<String, String> param : paramsSorted.entrySet()) {
      builder.addParameter(param.getKey(), param.getValue());
    }

    return builder.build();
  }

  private CloseableHttpResponse executeRequest(HttpUriRequest request,
      Map<String, String> customHeaders) throws IOException {
    apiContext.ensureSessionActive();
    setHeaders(request, customHeaders);

    return httpClient.execute(request);
  }

  private void setHeaders(HttpUriRequest httpEntity, Map<String, String> customHeaders) {
    setDefaultHeaders(httpEntity);
    setCustomHeaders(httpEntity, customHeaders);
    setSessionHeaders(httpEntity);
  }

  private void setDefaultHeaders(HttpUriRequest httpEntity) {
    httpEntity.setHeader(HEADER_CACHE_CONTROL, CACHE_CONTROL_NONE);
    httpEntity.setHeader(HEADER_USER_AGENT, getVersion());
    httpEntity.setHeader(HEADER_LANGUAGE, LANGUAGE_EN_US);
    httpEntity.setHeader(HEADER_REGION, REGION_NL_NL);
    httpEntity.setHeader(HEADER_REQUEST_ID, UUID.randomUUID().toString());
    httpEntity.setHeader(HEADER_GEOLOCATION, GEOLOCATION_ZERO);
  }

  private void setCustomHeaders(HttpUriRequest httpEntity, Map<String, String> customHeaders) {
    for (Map.Entry<String, String> entry : customHeaders.entrySet()) {
      httpEntity.setHeader(entry.getKey(), entry.getValue());
    }
  }

  private void setSessionHeaders(HttpUriRequest httpEntity) {
    String sessionToken = apiContext.getSessionToken();

    if (sessionToken != null) {
      httpEntity.setHeader(HEADER_AUTHENTICATION, sessionToken);
      httpEntity.setHeader(HEADER_SIGNATURE, generateSignature(httpEntity));
    }
  }

  private String generateSignature(HttpUriRequest httpEntity) {
    return SecurityUtils.generateSignature(httpEntity,
        apiContext.getInstallationContext().getKeyPairClient());
  }

  private String getVersion() {
    return USER_AGENT_BUNQ;
  }

  private BunqResponseRaw createBunqResponseRaw(CloseableHttpResponse response)
      throws IOException {
    byte[] responseBodyBytes = getBodyBytes(response);

    return new BunqResponseRaw(responseBodyBytes, getHeadersMap(response));
  }

  private byte[] getBodyBytes(CloseableHttpResponse response) throws IOException {
    Integer responseCode = response.getStatusLine().getStatusCode();
    byte[] responseBodyBytes = EntityUtils.toByteArray(response.getEntity());

    assertResponseSuccess(responseCode, responseBodyBytes);
    validateResponseSignature(responseCode, responseBodyBytes, response);

    return responseBodyBytes;
  }

  private static void assertResponseSuccess(int responseCode, byte[] responseBodyBytes) {
    if (responseCode != HttpStatus.SC_OK) {
      throw createApiExceptionRequestUnsuccessful(responseCode, new String(responseBodyBytes));
    }
  }

  private static ApiException createApiExceptionRequestUnsuccessful(Integer responseCode,
      String responseBody) {
    List<String> errorDescriptions = new ArrayList<>();

    try {
      errorDescriptions.addAll(fetchErrorDescriptions(responseBody));
    } catch (JsonSyntaxException exception) {
      errorDescriptions.add(responseBody);
    }

    return new ApiException(responseCode, errorDescriptions);
  }

  private static List<String> fetchErrorDescriptions(String responseBody)
      throws JsonSyntaxException {
    List<String> errorDescriptions = new ArrayList<>();
    GsonBuilder gsonBuilder = BunqGsonBuilder.buildDefault();
    JsonObject responseBodyJson = gsonBuilder.create().fromJson(responseBody, JsonObject.class);

    if (responseBodyJson.getAsJsonObject().has(FIELD_ERROR)) {
      errorDescriptions.addAll(fetchErrorDescriptions(responseBodyJson));
    } else {
      errorDescriptions.add(responseBody);
    }

    return errorDescriptions;
  }

  private static List<String> fetchErrorDescriptions(JsonObject responseBodyJson) {
    List<String> errorDescriptions = new ArrayList<>();
    JsonArray exceptionBodies = responseBodyJson.getAsJsonObject().getAsJsonArray(FIELD_ERROR);

    for (JsonElement exceptionBody : exceptionBodies) {
      JsonObject exceptionBodyJson = exceptionBody.getAsJsonObject();
      errorDescriptions.add(exceptionBodyJson.get(FIELD_ERROR_DESCRIPTION).getAsString());
    }

    return errorDescriptions;
  }

  private void validateResponseSignature(int responseCode, byte[] responseBodyBytes,
      HttpResponse response) {
    InstallationContext installationContext = apiContext.getInstallationContext();

    if (installationContext != null) {
      SecurityUtils.validateResponseSignature(responseCode, responseBodyBytes, response,
          installationContext.getPublicKeyServer());
    }
  }

  private static Map<String, String> getHeadersMap(CloseableHttpResponse response) {
    HashMap<String, String> headersMap = new HashMap<>();

    for (Header header : response.getAllHeaders()) {
      headersMap.put(header.getName(), header.getValue());
    }

    return headersMap;
  }

  /**
   * Execute a GET request.
   *
   * @return The raw response of the GET request.
   */
  public BunqResponseRaw get(String uri, Map<String, String> params,
      Map<String, String> customHeaders) {
    try {
      HttpGet httpGet = new HttpGet(determineFullUri(uri, params));
      CloseableHttpResponse response = executeRequest(httpGet, customHeaders);

      return createBunqResponseRaw(response);
    } catch (IOException | URISyntaxException exception) {
      throw new UncaughtExceptionError(exception);
    }
  }

  /**
   * Execute a PUT request.
   *
   * @return The raw response of the PUT request.
   */
  public BunqResponseRaw put(String uri, byte[] requestBodyBytes,
      Map<String, String> customHeaders) {
    try {
      HttpPut httpPut = new HttpPut(determineFullUri(uri));
      httpPut.setEntity(new ByteArrayEntity(requestBodyBytes, ContentType.APPLICATION_JSON));
      CloseableHttpResponse response = executeRequest(httpPut, customHeaders);

      return createBunqResponseRaw(response);
    } catch (IOException | URISyntaxException exception) {
      throw new UncaughtExceptionError(exception);
    }
  }

  /**
   * Execute a DELETE request.
   *
   * @return The response of the DELETE request.
   */
  public BunqResponseRaw delete(String uri, Map<String, String> customHeaders) {
    try {
      HttpDelete httpDelete = new HttpDelete(determineFullUri(uri));
      CloseableHttpResponse response = executeRequest(httpDelete, customHeaders);

      return createBunqResponseRaw(response);
    } catch (IOException | URISyntaxException exception) {
      throw new UncaughtExceptionError(exception);
    }
  }

}
