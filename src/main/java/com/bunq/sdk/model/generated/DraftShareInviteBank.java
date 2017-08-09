package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.BunqResponse;
import com.bunq.sdk.model.generated.object.DraftShareInviteBankEntry;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
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
   * Field constants.
   */
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_EXPIRATION = "expiration";
  public static final String FIELD_DRAFT_SHARE_SETTINGS = "draft_share_settings";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/draft-share-invite-bank";
  private static final String ENDPOINT_URL_READ = "user/%s/draft-share-invite-bank/%s";
  private static final String ENDPOINT_URL_UPDATE = "user/%s/draft-share-invite-bank/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/draft-share-invite-bank";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "DraftShareInviteBank";

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
  private DraftShareInviteBankEntry draftShareSettings;

  /**
   * The id of the newly created draft share invite.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId) {
    return create(apiContext, requestMap, userId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient
        .post(String.format(ENDPOINT_URL_CREATE, userId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<DraftShareInviteBank> get(ApiContext apiContext, Integer userId,
      Integer draftShareInviteBankId) {
    return get(apiContext, userId, draftShareInviteBankId, new HashMap<>());
  }

  /**
   * Get the details of a specific draft of a share invite.
   */
  public static BunqResponse<DraftShareInviteBank> get(ApiContext apiContext, Integer userId,
      Integer draftShareInviteBankId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_READ, userId, draftShareInviteBankId), customHeaders);

    return fromJson(DraftShareInviteBank.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<DraftShareInviteBank> update(ApiContext apiContext,
      Map<String, Object> requestMap, Integer userId, Integer draftShareInviteBankId) {
    return update(apiContext, requestMap, userId, draftShareInviteBankId, new HashMap<>());
  }

  /**
   * Update a draft share invite. When sending status CANCELLED it is possible to cancel the draft
   * share invite.
   */
  public static BunqResponse<DraftShareInviteBank> update(ApiContext apiContext,
      Map<String, Object> requestMap, Integer userId, Integer draftShareInviteBankId,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient
        .put(String.format(ENDPOINT_URL_UPDATE, userId, draftShareInviteBankId), requestBytes,
            customHeaders);

    return fromJson(DraftShareInviteBank.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<List<DraftShareInviteBank>> list(ApiContext apiContext,
      Integer userId) {
    return list(apiContext, userId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<List<DraftShareInviteBank>> list(ApiContext apiContext, Integer userId,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_LISTING, userId), customHeaders);

    return fromJsonList(DraftShareInviteBank.class, responseRaw, OBJECT_TYPE);
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
  public DraftShareInviteBankEntry getDraftShareSettings() {
    return this.draftShareSettings;
  }

  public void setDraftShareSettings(DraftShareInviteBankEntry draftShareSettings) {
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

}
