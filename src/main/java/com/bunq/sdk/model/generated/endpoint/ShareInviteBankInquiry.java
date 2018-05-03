package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.bunq.sdk.model.generated.object.Pointer;
import com.bunq.sdk.model.generated.object.ShareDetail;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

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
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/share-invite-bank-inquiry";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/share-invite-bank-inquiry/%s";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/share-invite-bank-inquiry/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/share-invite-bank-inquiry";

  /**
   * Field constants.
   */
  public static final String FIELD_COUNTER_USER_ALIAS = "counter_user_alias";
  public static final String FIELD_DRAFT_SHARE_INVITE_BANK_ID = "draft_share_invite_bank_id";
  public static final String FIELD_SHARE_DETAIL = "share_detail";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_SHARE_TYPE = "share_type";
  public static final String FIELD_START_DATE = "start_date";
  public static final String FIELD_END_DATE = "end_date";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "ShareInviteBankInquiry";

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
   * it's accepted), ACCEPTED, CANCELLED (the user deletes an active share) or
   * CANCELLATION_PENDING, CANCELLATION_ACCEPTED, CANCELLATION_REJECTED (for canceling mutual
   * connects)
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The share type, either STANDARD or MUTUAL.
   */
  @Expose
  @SerializedName("share_type")
  private String shareType;

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

  /**
   * Create a new share inquiry for a monetary account, specifying the permission the other bunq
   * user will have on it.
   * @param counterUserAlias The pointer of the user to share with.
   * @param shareDetail The share details. Only one of these objects may be passed.
   * @param status The status of the share. Can be PENDING, REVOKED (the user deletes the share
   * inquiry before it's accepted), ACCEPTED, CANCELLED (the user deletes an active share) or
   * CANCELLATION_PENDING, CANCELLATION_ACCEPTED, CANCELLATION_REJECTED (for canceling mutual
   * connects).
   * @param draftShareInviteBankId The id of the draft share invite bank.
   * @param shareType The share type, either STANDARD or MUTUAL.
   * @param startDate The start date of this share.
   * @param endDate The expiration date of this share.
   */
  public static BunqResponse<Integer> create(Pointer counterUserAlias, ShareDetail shareDetail, String status, Integer monetaryAccountId, Integer draftShareInviteBankId, String shareType, String startDate, String endDate, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_COUNTER_USER_ALIAS, counterUserAlias);
    requestMap.put(FIELD_DRAFT_SHARE_INVITE_BANK_ID, draftShareInviteBankId);
    requestMap.put(FIELD_SHARE_DETAIL, shareDetail);
    requestMap.put(FIELD_STATUS, status);
    requestMap.put(FIELD_SHARE_TYPE, shareType);
    requestMap.put(FIELD_START_DATE, startDate);
    requestMap.put(FIELD_END_DATE, endDate);

    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

    return processForId(responseRaw);
  }
  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Pointer counterUserAlias) {
    return create(counterUserAlias, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Pointer counterUserAlias, ShareDetail shareDetail) {
    return create(counterUserAlias, shareDetail, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Pointer counterUserAlias, ShareDetail shareDetail, String status) {
    return create(counterUserAlias, shareDetail, status, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Pointer counterUserAlias, ShareDetail shareDetail, String status, Integer monetaryAccountId) {
    return create(counterUserAlias, shareDetail, status, monetaryAccountId, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Pointer counterUserAlias, ShareDetail shareDetail, String status, Integer monetaryAccountId, Integer draftShareInviteBankId) {
    return create(counterUserAlias, shareDetail, status, monetaryAccountId, draftShareInviteBankId, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Pointer counterUserAlias, ShareDetail shareDetail, String status, Integer monetaryAccountId, Integer draftShareInviteBankId, String shareType) {
    return create(counterUserAlias, shareDetail, status, monetaryAccountId, draftShareInviteBankId, shareType, null, null, null);
  }

  public static BunqResponse<Integer> create(Pointer counterUserAlias, ShareDetail shareDetail, String status, Integer monetaryAccountId, Integer draftShareInviteBankId, String shareType, String startDate) {
    return create(counterUserAlias, shareDetail, status, monetaryAccountId, draftShareInviteBankId, shareType, startDate, null, null);
  }

  public static BunqResponse<Integer> create(Pointer counterUserAlias, ShareDetail shareDetail, String status, Integer monetaryAccountId, Integer draftShareInviteBankId, String shareType, String startDate, String endDate) {
    return create(counterUserAlias, shareDetail, status, monetaryAccountId, draftShareInviteBankId, shareType, startDate, endDate, null);
  }

  /**
   * Get the details of a specific share inquiry.
   */
  public static BunqResponse<ShareInviteBankInquiry> get(Integer shareInviteBankInquiryId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), shareInviteBankInquiryId), params, customHeaders);

    return fromJson(ShareInviteBankInquiry.class, responseRaw, OBJECT_TYPE_GET);
  }
  public static BunqResponse<ShareInviteBankInquiry> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<ShareInviteBankInquiry> get(Integer shareInviteBankInquiryId) {
    return get(shareInviteBankInquiryId, null, null, null);
  }

  public static BunqResponse<ShareInviteBankInquiry> get(Integer shareInviteBankInquiryId, Integer monetaryAccountId) {
    return get(shareInviteBankInquiryId, monetaryAccountId, null, null);
  }

  public static BunqResponse<ShareInviteBankInquiry> get(Integer shareInviteBankInquiryId, Integer monetaryAccountId, Map<String, String> params) {
    return get(shareInviteBankInquiryId, monetaryAccountId, params, null);
  }

  /**
   * Update the details of a share. This includes updating status (revoking or cancelling it),
   * granted permission and validity period of this share.
   * @param shareDetail The share details. Only one of these objects may be passed.
   * @param status The status of the share. Can be PENDING, REVOKED (the user deletes the share
   * inquiry before it's accepted), ACCEPTED, CANCELLED (the user deletes an active share) or
   * CANCELLATION_PENDING, CANCELLATION_ACCEPTED, CANCELLATION_REJECTED (for canceling mutual
   * connects).
   * @param startDate The start date of this share.
   * @param endDate The expiration date of this share.
   */
  public static BunqResponse<Integer> update(Integer shareInviteBankInquiryId, Integer monetaryAccountId, ShareDetail shareDetail, String status, String startDate, String endDate, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_SHARE_DETAIL, shareDetail);
    requestMap.put(FIELD_STATUS, status);
    requestMap.put(FIELD_START_DATE, startDate);
    requestMap.put(FIELD_END_DATE, endDate);

    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), shareInviteBankInquiryId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update() {
    return update(null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer shareInviteBankInquiryId) {
    return update(shareInviteBankInquiryId, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer shareInviteBankInquiryId, Integer monetaryAccountId) {
    return update(shareInviteBankInquiryId, monetaryAccountId, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer shareInviteBankInquiryId, Integer monetaryAccountId, ShareDetail shareDetail) {
    return update(shareInviteBankInquiryId, monetaryAccountId, shareDetail, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer shareInviteBankInquiryId, Integer monetaryAccountId, ShareDetail shareDetail, String status) {
    return update(shareInviteBankInquiryId, monetaryAccountId, shareDetail, status, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer shareInviteBankInquiryId, Integer monetaryAccountId, ShareDetail shareDetail, String status, String startDate) {
    return update(shareInviteBankInquiryId, monetaryAccountId, shareDetail, status, startDate, null, null);
  }

  public static BunqResponse<Integer> update(Integer shareInviteBankInquiryId, Integer monetaryAccountId, ShareDetail shareDetail, String status, String startDate, String endDate) {
    return update(shareInviteBankInquiryId, monetaryAccountId, shareDetail, status, startDate, endDate, null);
  }

  /**
   * Get a list with all the share inquiries for a monetary account, only if the requesting user
   * has permission to change the details of the various ones.
   */
  public static BunqResponse<List<ShareInviteBankInquiry>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(ShareInviteBankInquiry.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<ShareInviteBankInquiry>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<ShareInviteBankInquiry>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<ShareInviteBankInquiry>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
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
   * it's accepted), ACCEPTED, CANCELLED (the user deletes an active share) or
   * CANCELLATION_PENDING, CANCELLATION_ACCEPTED, CANCELLATION_REJECTED (for canceling mutual
   * connects)
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The share type, either STANDARD or MUTUAL.
   */
  public String getShareType() {
    return this.shareType;
  }

  public void setShareType(String shareType) {
    this.shareType = shareType;
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

  /**
   */
  public boolean isAllFieldNull() {
    if (this.alias != null) {
      return false;
    }

    if (this.userAliasCreated != null) {
      return false;
    }

    if (this.userAliasRevoked != null) {
      return false;
    }

    if (this.counterUserAlias != null) {
      return false;
    }

    if (this.monetaryAccountId != null) {
      return false;
    }

    if (this.draftShareInviteBankId != null) {
      return false;
    }

    if (this.shareDetail != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.shareType != null) {
      return false;
    }

    if (this.startDate != null) {
      return false;
    }

    if (this.endDate != null) {
      return false;
    }

    if (this.id != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static ShareInviteBankInquiry fromJsonReader(JsonReader reader) {
    return fromJsonReader(ShareInviteBankInquiry.class, reader);
  }

}
