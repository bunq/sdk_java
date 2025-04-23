package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.OauthCallbackUrlObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * Used for managing OAuth Clients.
 */
public class OauthClientApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/oauth-client/%s";
  protected static final String ENDPOINT_URL_CREATE = "user/%s/oauth-client";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/oauth-client/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/oauth-client";

  /**
   * Field constants.
   */
  public static final String FIELD_STATUS = "status";

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
   * The display name of this Oauth Client
   */
  @Expose
  @SerializedName("display_name")
  private String displayName;

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
  private List<OauthCallbackUrlObject> callbackUrl;

  /**
   * The status of the Oauth Client, can be ACTIVE or CANCELLED.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  public OauthClientApiObject() {
  this(null);
  }

  public OauthClientApiObject(String status) {
    this.statusFieldForRequest = status;
  }  /**
   */
  public static BunqResponse<OauthClientApiObject> get(Integer oauthClientId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), oauthClientId), params, customHeaders);

    return fromJson(OauthClientApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<OauthClientApiObject> get() {
    return get(null, null, null);
  }

  public static BunqResponse<OauthClientApiObject> get(Integer oauthClientId) {
    return get(oauthClientId, null, null);
  }

  public static BunqResponse<OauthClientApiObject> get(Integer oauthClientId, Map<String, String> params) {
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
  public static BunqResponse<List<OauthClientApiObject>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(OauthClientApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<OauthClientApiObject>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<OauthClientApiObject>> list(Map<String, String> params) {
    return list(params, null);
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
   * The display name of this Oauth Client
   */
  public String getDisplayName() {
    return this.displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
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
  public List<OauthCallbackUrlObject> getCallbackUrl() {
    return this.callbackUrl;
  }

  public void setCallbackUrl(List<OauthCallbackUrlObject> callbackUrl) {
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

    if (this.displayName != null) {
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

  /**
   */
  public static OauthClientApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(OauthClientApiObject.class, reader);
  }

}
