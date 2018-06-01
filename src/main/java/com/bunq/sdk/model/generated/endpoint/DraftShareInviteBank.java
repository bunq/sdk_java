package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.DraftShareInviteEntry;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to create a draft share invite for a monetary account with another bunq user, as in the
 * 'Connect' feature in the bunq app. The user that accepts the invite can share one of their
 * MonetaryAccounts with the user that created the invite.
 */
public class DraftShareInviteBank extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/draft-share-invite-bank";
  protected static final String ENDPOINT_URL_READ = "user/%s/draft-share-invite-bank/%s";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/draft-share-invite-bank/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/draft-share-invite-bank";

  /**
   * Field constants.
   */
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_EXPIRATION = "expiration";
  public static final String FIELD_DRAFT_SHARE_SETTINGS = "draft_share_settings";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "DraftShareInviteBank";

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
   * The moment when this draft share invite expires.
   */
  @Expose
  @SerializedName("expiration")
  private String expiration;

  /**
   * The id of the share invite bank response this draft share belongs to.
   */
  @Expose
  @SerializedName("share_invite_bank_response_id")
  private Integer shareInviteBankResponseId;

  /**
   * The URL redirecting user to the draft share invite in the app. Only works on mobile devices.
   */
  @Expose
  @SerializedName("draft_share_url")
  private String draftShareUrl;

  /**
   * The draft share invite details.
   */
  @Expose
  @SerializedName("draft_share_settings")
  private DraftShareInviteEntry draftShareSettings;

  /**
   * The id of the newly created draft share invite.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * @param expiration The moment when this draft share invite expires.
   * @param draftShareSettings The draft share invite details.
   * @param status The status of the draft share invite. Can be CANCELLED (the user cancels the
   * draft share before it's used).
   */
  public static BunqResponse<Integer> create(String expiration, DraftShareInviteEntry draftShareSettings, String status, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_STATUS, status);
    requestMap.put(FIELD_EXPIRATION, expiration);
    requestMap.put(FIELD_DRAFT_SHARE_SETTINGS, draftShareSettings);

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

  public static BunqResponse<Integer> create(String expiration, DraftShareInviteEntry draftShareSettings) {
    return create(expiration, draftShareSettings, null, null);
  }

  public static BunqResponse<Integer> create(String expiration, DraftShareInviteEntry draftShareSettings, String status) {
    return create(expiration, draftShareSettings, status, null);
  }

  /**
   * Get the details of a specific draft of a share invite.
   */
  public static BunqResponse<DraftShareInviteBank> get(Integer draftShareInviteBankId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), draftShareInviteBankId), params, customHeaders);

    return fromJson(DraftShareInviteBank.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<DraftShareInviteBank> get() {
    return get(null, null, null);
  }

  public static BunqResponse<DraftShareInviteBank> get(Integer draftShareInviteBankId) {
    return get(draftShareInviteBankId, null, null);
  }

  public static BunqResponse<DraftShareInviteBank> get(Integer draftShareInviteBankId, Map<String, String> params) {
    return get(draftShareInviteBankId, params, null);
  }

  /**
   * Update a draft share invite. When sending status CANCELLED it is possible to cancel the draft
   * share invite.
   * @param status The status of the draft share invite. Can be CANCELLED (the user cancels the
   * draft share before it's used).
   * @param expiration The moment when this draft share invite expires.
   * @param draftShareSettings The draft share invite details.
   */
  public static BunqResponse<Integer> update(Integer draftShareInviteBankId, String status, String expiration, DraftShareInviteEntry draftShareSettings, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_STATUS, status);
    requestMap.put(FIELD_EXPIRATION, expiration);
    requestMap.put(FIELD_DRAFT_SHARE_SETTINGS, draftShareSettings);

    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), draftShareInviteBankId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer draftShareInviteBankId) {
    return update(draftShareInviteBankId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer draftShareInviteBankId, String status) {
    return update(draftShareInviteBankId, status, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer draftShareInviteBankId, String status, String expiration) {
    return update(draftShareInviteBankId, status, expiration, null, null);
  }

  public static BunqResponse<Integer> update(Integer draftShareInviteBankId, String status, String expiration, DraftShareInviteEntry draftShareSettings) {
    return update(draftShareInviteBankId, status, expiration, draftShareSettings, null);
  }

  /**
   */
  public static BunqResponse<List<DraftShareInviteBank>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(DraftShareInviteBank.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<DraftShareInviteBank>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<DraftShareInviteBank>> list(Map<String, String> params) {
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
   * The moment when this draft share invite expires.
   */
  public String getExpiration() {
    return this.expiration;
  }

  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }

  /**
   * The id of the share invite bank response this draft share belongs to.
   */
  public Integer getShareInviteBankResponseId() {
    return this.shareInviteBankResponseId;
  }

  public void setShareInviteBankResponseId(Integer shareInviteBankResponseId) {
    this.shareInviteBankResponseId = shareInviteBankResponseId;
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
   * The draft share invite details.
   */
  public DraftShareInviteEntry getDraftShareSettings() {
    return this.draftShareSettings;
  }

  public void setDraftShareSettings(DraftShareInviteEntry draftShareSettings) {
    this.draftShareSettings = draftShareSettings;
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

    if (this.expiration != null) {
      return false;
    }

    if (this.shareInviteBankResponseId != null) {
      return false;
    }

    if (this.draftShareUrl != null) {
      return false;
    }

    if (this.draftShareSettings != null) {
      return false;
    }

    if (this.id != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static DraftShareInviteBank fromJsonReader(JsonReader reader) {
    return fromJsonReader(DraftShareInviteBank.class, reader);
  }

}
