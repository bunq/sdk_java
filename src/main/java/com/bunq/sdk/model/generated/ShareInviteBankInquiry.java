package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.bunq.sdk.model.generated.object.ShareDetail;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to share a monetary account with another bunq user, as in the 'Connect' feature in the
 * bunq app. Allow the creation of share inquiries that, in the same way as request inquiries,
 * can be revoked by the user creating them or accepted/rejected by the other party.
 */
public class ShareInviteBankInquiry extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_COUNTER_USER_ALIAS = "counter_user_alias";
  public static final String FIELD_DRAFT_SHARE_INVITE_BANK_ID = "draft_share_invite_bank_id";
  public static final String FIELD_SHARE_DETAIL = "share_detail";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_START_DATE = "start_date";
  public static final String FIELD_END_DATE = "end_date";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/share-invite-bank-inquiry";
  private static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/share-invite-bank-inquiry/%s";
  private static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/share-invite-bank-inquiry/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/share-invite-bank-inquiry";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "ShareInviteBankInquiry";

  /**
   * The label of the monetary account that's being shared.
   */
  @Expose
  @SerializedName("alias")
  private MonetaryAccountReference alias;

  /**
   * The user who created the share.
   */
  @Expose
  @SerializedName("user_alias_created")
  private LabelUser userAliasCreated;

  /**
   * The user who revoked the share.
   */
  @Expose
  @SerializedName("user_alias_revoked")
  private LabelUser userAliasRevoked;

  /**
   * The label of the user to share with.
   */
  @Expose
  @SerializedName("counter_user_alias")
  private LabelUser counterUserAlias;

  /**
   * The id of the monetary account the share applies to.
   */
  @Expose
  @SerializedName("monetary_account_id")
  private Integer monetaryAccountId;

  /**
   * The id of the draft share invite bank.
   */
  @Expose
  @SerializedName("draft_share_invite_bank_id")
  private Integer draftShareInviteBankId;

  /**
   * The share details. Only one of these objects is returned.
   */
  @Expose
  @SerializedName("share_detail")
  private ShareDetail shareDetail;

  /**
   * The status of the share. Can be PENDING, REVOKED (the user deletes the share inquiry before
   * it's accepted) or CANCELLED (the user deletes an active share).
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The start date of this share.
   */
  @Expose
  @SerializedName("start_date")
  private String startDate;

  /**
   * The expiration date of this share.
   */
  @Expose
  @SerializedName("end_date")
  private String endDate;

  /**
   * The id of the newly created share invite.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer monetaryAccountId) {
    return create(apiContext, requestMap, userId, monetaryAccountId, new HashMap<>());
  }

  /**
   * Create a new share inquiry for a monetary account, specifying the permission the other bunq
   * user will have on it.
   */
  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient
        .post(String.format(ENDPOINT_URL_CREATE, userId, monetaryAccountId), requestBytes,
            customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<ShareInviteBankInquiry> get(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId, Integer shareInviteBankInquiryId) {
    return get(apiContext, userId, monetaryAccountId, shareInviteBankInquiryId, new HashMap<>());
  }

  /**
   * Get the details of a specific share inquiry.
   */
  public static BunqResponse<ShareInviteBankInquiry> get(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId, Integer shareInviteBankInquiryId,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_READ, userId, monetaryAccountId, shareInviteBankInquiryId),
            new HashMap<>(), customHeaders);

    return fromJson(ShareInviteBankInquiry.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<ShareInviteBankInquiry> update(ApiContext apiContext,
      Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId,
      Integer shareInviteBankInquiryId) {
    return update(apiContext, requestMap, userId, monetaryAccountId, shareInviteBankInquiryId,
        new HashMap<>());
  }

  /**
   * Update the details of a share. This includes updating status (revoking or cancelling it),
   * granted permission and validity period of this share.
   */
  public static BunqResponse<ShareInviteBankInquiry> update(ApiContext apiContext,
      Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId,
      Integer shareInviteBankInquiryId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.put(
        String.format(ENDPOINT_URL_UPDATE, userId, monetaryAccountId, shareInviteBankInquiryId),
        requestBytes, customHeaders);

    return fromJson(ShareInviteBankInquiry.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<List<ShareInviteBankInquiry>> list(ApiContext apiContext,
      Integer userId, Integer monetaryAccountId) {
    return list(apiContext, userId, monetaryAccountId, new HashMap<>());
  }

  public static BunqResponse<List<ShareInviteBankInquiry>> list(ApiContext apiContext,
      Integer userId, Integer monetaryAccountId, Map<String, String> params) {
    return list(apiContext, userId, monetaryAccountId, params, new HashMap<>());
  }

  /**
   * Get a list with all the share inquiries for a monetary account, only if the requesting user
   * has permission to change the details of the various ones.
   */
  public static BunqResponse<List<ShareInviteBankInquiry>> list(ApiContext apiContext,
      Integer userId, Integer monetaryAccountId, Map<String, String> params,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId), params, customHeaders);

    return fromJsonList(ShareInviteBankInquiry.class, responseRaw, OBJECT_TYPE);
  }

  /**
   * The label of the monetary account that's being shared.
   */
  public MonetaryAccountReference getAlias() {
    return this.alias;
  }

  public void setAlias(MonetaryAccountReference alias) {
    this.alias = alias;
  }

  /**
   * The user who created the share.
   */
  public LabelUser getUserAliasCreated() {
    return this.userAliasCreated;
  }

  public void setUserAliasCreated(LabelUser userAliasCreated) {
    this.userAliasCreated = userAliasCreated;
  }

  /**
   * The user who revoked the share.
   */
  public LabelUser getUserAliasRevoked() {
    return this.userAliasRevoked;
  }

  public void setUserAliasRevoked(LabelUser userAliasRevoked) {
    this.userAliasRevoked = userAliasRevoked;
  }

  /**
   * The label of the user to share with.
   */
  public LabelUser getCounterUserAlias() {
    return this.counterUserAlias;
  }

  public void setCounterUserAlias(LabelUser counterUserAlias) {
    this.counterUserAlias = counterUserAlias;
  }

  /**
   * The id of the monetary account the share applies to.
   */
  public Integer getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(Integer monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   * The id of the draft share invite bank.
   */
  public Integer getDraftShareInviteBankId() {
    return this.draftShareInviteBankId;
  }

  public void setDraftShareInviteBankId(Integer draftShareInviteBankId) {
    this.draftShareInviteBankId = draftShareInviteBankId;
  }

  /**
   * The share details. Only one of these objects is returned.
   */
  public ShareDetail getShareDetail() {
    return this.shareDetail;
  }

  public void setShareDetail(ShareDetail shareDetail) {
    this.shareDetail = shareDetail;
  }

  /**
   * The status of the share. Can be PENDING, REVOKED (the user deletes the share inquiry before
   * it's accepted) or CANCELLED (the user deletes an active share).
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The start date of this share.
   */
  public String getStartDate() {
    return this.startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * The expiration date of this share.
   */
  public String getEndDate() {
    return this.endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * The id of the newly created share invite.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

}
