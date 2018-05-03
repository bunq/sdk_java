package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to create a draft share invite for a user with another bunq user. The user that accepts
 * the invite can share his MAs with the user that created the invite.
 */
public class DraftShareInviteApiKey extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/draft-share-invite-api-key";
  protected static final String ENDPOINT_URL_READ = "user/%s/draft-share-invite-api-key/%s";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/draft-share-invite-api-key/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/draft-share-invite-api-key";

  /**
   * Field constants.
   */
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_SUB_STATUS = "sub_status";
  public static final String FIELD_EXPIRATION = "expiration";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "DraftShareInviteApiKey";
  protected static final String OBJECT_TYPE_PUT = "DraftShareInviteApiKey";

  /**
   * The user who created the draft share invite.
   */
  @Expose
  @SerializedName("user_alias_created")
  private LabelUser userAliasCreated;

  /**
   * The status of the draft share invite. Can be USED, CANCELLED and PENDING.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The sub-status of the draft share invite. Can be NONE, ACCEPTED or REJECTED.
   */
  @Expose
  @SerializedName("sub_status")
  private String subStatus;

  /**
   * The moment when this draft share invite expires.
   */
  @Expose
  @SerializedName("expiration")
  private String expiration;

  /**
   * The URL redirecting user to the draft share invite in the app. Only works on mobile devices.
   */
  @Expose
  @SerializedName("draft_share_url")
  private String draftShareUrl;

  /**
   * The API key generated for this DraftShareInviteApiKey.
   */
  @Expose
  @SerializedName("api_key")
  private String apiKey;

  /**
   * The id of the newly created draft share invite.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * @param expiration The moment when this draft share invite expires.
   * @param status The status of the draft share invite. Can be CANCELLED (the user cancels the
   * draft share before it's used).
   * @param subStatus The sub-status of the draft share invite. Can be NONE, ACCEPTED or REJECTED.
   */
  public static BunqResponse<Integer> create(String expiration, String status, String subStatus, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_STATUS, status);
requestMap.put(FIELD_SUB_STATUS, subStatus);
requestMap.put(FIELD_EXPIRATION, expiration);

    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return processForId(responseRaw);
  }
  public static BunqResponse<Integer> create() {
    return create(null, null, null, null);
  }

  public static BunqResponse<Integer> create(String expiration) {
    return create(expiration, null, null, null);
  }

  public static BunqResponse<Integer> create(String expiration, String status) {
    return create(expiration, status, null, null);
  }

  public static BunqResponse<Integer> create(String expiration, String status, String subStatus) {
    return create(expiration, status, subStatus, null);
  }

  /**
   * Get the details of a specific draft of a share invite.
   */
  public static BunqResponse<DraftShareInviteApiKey> get(Integer draftShareInviteApiKeyId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), draftShareInviteApiKeyId), params, customHeaders);

    return fromJson(DraftShareInviteApiKey.class, responseRaw, OBJECT_TYPE_GET);
  }
  public static BunqResponse<DraftShareInviteApiKey> get() {
    return get(null, null, null);
  }

  public static BunqResponse<DraftShareInviteApiKey> get(Integer draftShareInviteApiKeyId) {
    return get(draftShareInviteApiKeyId, null, null);
  }

  public static BunqResponse<DraftShareInviteApiKey> get(Integer draftShareInviteApiKeyId, Map<String, String> params) {
    return get(draftShareInviteApiKeyId, params, null);
  }

  /**
   * Update a draft share invite. When sending status CANCELLED it is possible to cancel the draft
   * share invite.
   * @param status The status of the draft share invite. Can be CANCELLED (the user cancels the
   * draft share before it's used).
   * @param subStatus The sub-status of the draft share invite. Can be NONE, ACCEPTED or REJECTED.
   * @param expiration The moment when this draft share invite expires.
   */
  public static BunqResponse<DraftShareInviteApiKey> update(Integer draftShareInviteApiKeyId, String status, String subStatus, String expiration, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_STATUS, status);
requestMap.put(FIELD_SUB_STATUS, subStatus);
requestMap.put(FIELD_EXPIRATION, expiration);

    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), draftShareInviteApiKeyId), requestBytes, customHeaders);

    return fromJson(DraftShareInviteApiKey.class, responseRaw, OBJECT_TYPE_PUT);
  }

  public static BunqResponse<DraftShareInviteApiKey> update() {
    return update(null, null, null, null, null);
  }

  public static BunqResponse<DraftShareInviteApiKey> update(Integer draftShareInviteApiKeyId) {
    return update(draftShareInviteApiKeyId, null, null, null, null);
  }

  public static BunqResponse<DraftShareInviteApiKey> update(Integer draftShareInviteApiKeyId, String status) {
    return update(draftShareInviteApiKeyId, status, null, null, null);
  }

  public static BunqResponse<DraftShareInviteApiKey> update(Integer draftShareInviteApiKeyId, String status, String subStatus) {
    return update(draftShareInviteApiKeyId, status, subStatus, null, null);
  }

  public static BunqResponse<DraftShareInviteApiKey> update(Integer draftShareInviteApiKeyId, String status, String subStatus, String expiration) {
    return update(draftShareInviteApiKeyId, status, subStatus, expiration, null);
  }

  /**
   */
  public static BunqResponse<List<DraftShareInviteApiKey>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(DraftShareInviteApiKey.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<DraftShareInviteApiKey>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<DraftShareInviteApiKey>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The user who created the draft share invite.
   */
  public LabelUser getUserAliasCreated() {
    return this.userAliasCreated;
  }

  public void setUserAliasCreated(LabelUser userAliasCreated) {
    this.userAliasCreated = userAliasCreated;
  }

  /**
   * The status of the draft share invite. Can be USED, CANCELLED and PENDING.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The sub-status of the draft share invite. Can be NONE, ACCEPTED or REJECTED.
   */
  public String getSubStatus() {
    return this.subStatus;
  }

  public void setSubStatus(String subStatus) {
    this.subStatus = subStatus;
  }

  /**
   * The moment when this draft share invite expires.
   */
  public String getExpiration() {
    return this.expiration;
  }

  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }

  /**
   * The URL redirecting user to the draft share invite in the app. Only works on mobile devices.
   */
  public String getDraftShareUrl() {
    return this.draftShareUrl;
  }

  public void setDraftShareUrl(String draftShareUrl) {
    this.draftShareUrl = draftShareUrl;
  }

  /**
   * The API key generated for this DraftShareInviteApiKey.
   */
  public String getApiKey() {
    return this.apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  /**
   * The id of the newly created draft share invite.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.userAliasCreated != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.subStatus != null) {
      return false;
    }

    if (this.expiration != null) {
      return false;
    }

    if (this.draftShareUrl != null) {
      return false;
    }

    if (this.apiKey != null) {
      return false;
    }

    if (this.id != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static DraftShareInviteApiKey fromJsonReader(JsonReader reader) {
    return fromJsonReader(DraftShareInviteApiKey.class, reader);
  }

}
