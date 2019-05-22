package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used for managing OAuth Client Callback URLs.
 */
public class OauthCallbackUrl extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_URL = "url";
  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/oauth-client/%s/callback-url/%s";
  protected static final String ENDPOINT_URL_CREATE = "user/%s/oauth-client/%s/callback-url";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/oauth-client/%s/callback-url/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/oauth-client/%s/callback-url";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/oauth-client/%s/callback-url/%s";
  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "OauthCallbackUrl";

  /**
   * The URL for this callback.
   */
  @Expose
  @SerializedName("url")
  private String url;

  /**
   * The URL for this callback.
   */
  @Expose
  @SerializedName("url_field_for_request")
  private String urlFieldForRequest;

  public OauthCallbackUrl() {
    this(null);
  }

  public OauthCallbackUrl(String url) {
    this.urlFieldForRequest = url;
  }

  /**
   */
  public static BunqResponse<OauthCallbackUrl> get(Integer oauthClientId, Integer oauthCallbackUrlId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), oauthClientId, oauthCallbackUrlId), params, customHeaders);

    return fromJson(OauthCallbackUrl.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<OauthCallbackUrl> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<OauthCallbackUrl> get(Integer oauthClientId) {
    return get(oauthClientId, null, null, null);
  }

  public static BunqResponse<OauthCallbackUrl> get(Integer oauthClientId, Integer oauthCallbackUrlId) {
    return get(oauthClientId, oauthCallbackUrlId, null, null);
  }

  public static BunqResponse<OauthCallbackUrl> get(Integer oauthClientId, Integer oauthCallbackUrlId, Map<String, String> params) {
    return get(oauthClientId, oauthCallbackUrlId, params, null);
  }

  /**
   * @param url The URL for this callback.
   */
  public static BunqResponse<Integer> create(Integer oauthClientId, String url, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_URL, url);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), oauthClientId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null);
  }

  public static BunqResponse<Integer> create(Integer oauthClientId) {
    return create(oauthClientId, null, null);
  }

  public static BunqResponse<Integer> create(Integer oauthClientId, String url) {
    return create(oauthClientId, url, null);
  }

  /**
   * @param url The URL for this callback.
   */
  public static BunqResponse<Integer> update(Integer oauthClientId, Integer oauthCallbackUrlId, String url, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_URL, url);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), oauthClientId, oauthCallbackUrlId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer oauthClientId) {
    return update(oauthClientId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer oauthClientId, Integer oauthCallbackUrlId) {
    return update(oauthClientId, oauthCallbackUrlId, null, null);
  }

  public static BunqResponse<Integer> update(Integer oauthClientId, Integer oauthCallbackUrlId, String url) {
    return update(oauthClientId, oauthCallbackUrlId, url, null);
  }

  /**
   */
  public static BunqResponse<List<OauthCallbackUrl>> list(Integer oauthClientId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), oauthClientId), params, customHeaders);

    return fromJsonList(OauthCallbackUrl.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<OauthCallbackUrl>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<OauthCallbackUrl>> list(Integer oauthClientId) {
    return list(oauthClientId, null, null);
  }

  public static BunqResponse<List<OauthCallbackUrl>> list(Integer oauthClientId, Map<String, String> params) {
    return list(oauthClientId, params, null);
  }

  /**
   */
  public static BunqResponse<OauthCallbackUrl> delete(Integer oauthClientId, Integer oauthCallbackUrlId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), oauthClientId, oauthCallbackUrlId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<OauthCallbackUrl> delete(Integer oauthClientId) {
    return delete(oauthClientId, null, null);
  }

  public static BunqResponse<OauthCallbackUrl> delete(Integer oauthClientId, Integer oauthCallbackUrlId) {
    return delete(oauthClientId, oauthCallbackUrlId, null);
  }

  /**
   */
  public static OauthCallbackUrl fromJsonReader(JsonReader reader) {
    return fromJsonReader(OauthCallbackUrl.class, reader);
  }

  /**
   * The URL for this callback.
   */
  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.url != null) {
      return false;
    }

    return true;
  }

}
