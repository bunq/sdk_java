package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.OauthCallbackUrl;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used for managing OAuth Clients.
 */
public class OauthClient extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_STATUS = "status";
  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/oauth-client/%s";
  protected static final String ENDPOINT_URL_CREATE = "user/%s/oauth-client";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/oauth-client/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/oauth-client";
  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "OauthClient";

  /**
   * Id of the client.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The status of the pack group, can be ACTIVE, CANCELLED or CANCELLED_PENDING.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The Client ID associated with this Oauth Client
   */
  @Expose
  @SerializedName("client_id")
  private String clientId;

  /**
   * Secret associated with this Oauth Client
   */
  @Expose
  @SerializedName("secret")
  private String secret;

  /**
   * The callback URLs which are bound to this Oauth Client
   */
  @Expose
  @SerializedName("callback_url")
  private List<OauthCallbackUrl> callbackUrl;

  /**
   * The status of the Oauth Client, can be ACTIVE or CANCELLED.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  public OauthClient() {
    this(null);
  }

  public OauthClient(String status) {
    this.statusFieldForRequest = status;
  }

  /**
   */
  public static BunqResponse<OauthClient> get(Integer oauthClientId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), oauthClientId), params, customHeaders);

    return fromJson(OauthClient.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<OauthClient> get() {
    return get(null, null, null);
  }

  public static BunqResponse<OauthClient> get(Integer oauthClientId) {
    return get(oauthClientId, null, null);
  }

  public static BunqResponse<OauthClient> get(Integer oauthClientId, Map<String, String> params) {
    return get(oauthClientId, params, null);
  }

  /**
   * @param status The status of the Oauth Client, can be ACTIVE or CANCELLED.
   */
  public static BunqResponse<Integer> create(String status, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_STATUS, status);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null);
  }

  public static BunqResponse<Integer> create(String status) {
    return create(status, null);
  }

  /**
   * @param status The status of the Oauth Client, can be ACTIVE or CANCELLED.
   */
  public static BunqResponse<Integer> update(Integer oauthClientId, String status, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_STATUS, status);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), oauthClientId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer oauthClientId) {
    return update(oauthClientId, null, null);
  }

  public static BunqResponse<Integer> update(Integer oauthClientId, String status) {
    return update(oauthClientId, status, null);
  }

  /**
   */
  public static BunqResponse<List<OauthClient>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(OauthClient.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<OauthClient>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<OauthClient>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   */
  public static OauthClient fromJsonReader(JsonReader reader) {
    return fromJsonReader(OauthClient.class, reader);
  }

  /**
   * Id of the client.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The status of the pack group, can be ACTIVE, CANCELLED or CANCELLED_PENDING.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The Client ID associated with this Oauth Client
   */
  public String getClientId() {
    return this.clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  /**
   * Secret associated with this Oauth Client
   */
  public String getSecret() {
    return this.secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  /**
   * The callback URLs which are bound to this Oauth Client
   */
  public List<OauthCallbackUrl> getCallbackUrl() {
    return this.callbackUrl;
  }

  public void setCallbackUrl(List<OauthCallbackUrl> callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.clientId != null) {
      return false;
    }

    if (this.secret != null) {
      return false;
    }

    if (this.callbackUrl != null) {
      return false;
    }

    return true;
  }

}
