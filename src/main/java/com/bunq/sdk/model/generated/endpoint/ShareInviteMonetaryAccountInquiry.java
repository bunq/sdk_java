package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.bunq.sdk.model.generated.object.Pointer;
import com.bunq.sdk.model.generated.object.ShareDetail;
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
 * [DEPRECATED - use /share-invite-monetary-account-response] Used to share a monetary account
 * with another bunq user, as in the 'Connect' feature in the bunq app. Allow the creation of
 * share inquiries that, in the same way as request inquiries, can be revoked by the user
 * creating them or accepted/rejected by the other party.
 */
public class ShareInviteMonetaryAccountInquiry extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/share-invite-monetary-account-inquiry";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/share-invite-monetary-account-inquiry/%s";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/share-invite-monetary-account-inquiry/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/share-invite-monetary-account-inquiry";

  /**
   * Field constants.
   */
  public static final String FIELD_COUNTER_USER_ALIAS = "counter_user_alias";
  public static final String FIELD_DRAFT_SHARE_INVITE_BANK_ID = "draft_share_invite_bank_id";
  public static final String FIELD_SHARE_DETAIL = "share_detail";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_RELATIONSHIP = "relationship";
  public static final String FIELD_SHARE_TYPE = "share_type";
  public static final String FIELD_START_DATE = "start_date";
  public static final String FIELD_END_DATE = "end_date";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "ShareInviteMonetaryAccountInquiry";

  /**
   * The label of the monetary account that's being shared.
   */
  @Expose
  @SerializedName("alias")
  private LabelMonetaryAccount alias;

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
   * The relationship: COMPANY_DIRECTOR, COMPANY_EMPLOYEE, etc
   */
  @Expose
  @SerializedName("relationship")
  private String relationship;

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
   * The pointer of the user to share with.
   */
  @Expose
  @SerializedName("counter_user_alias_field_for_request")
  private Pointer counterUserAliasFieldForRequest;

  /**
   * The id of the draft share invite bank.
   */
  @Expose
  @SerializedName("draft_share_invite_bank_id_field_for_request")
  private Integer draftShareInviteBankIdFieldForRequest;

  /**
   * The share details. Only one of these objects may be passed.
   */
  @Expose
  @SerializedName("share_detail_field_for_request")
  private ShareDetail shareDetailFieldForRequest;

  /**
   * The status of the share. Can be PENDING, REVOKED (the user deletes the share inquiry before
   * it's accepted), ACCEPTED, CANCELLED (the user deletes an active share) or
   * CANCELLATION_PENDING, CANCELLATION_ACCEPTED, CANCELLATION_REJECTED (for canceling mutual
   * connects).
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The relationship: COMPANY_DIRECTOR, COMPANY_EMPLOYEE, etc
   */
  @Expose
  @SerializedName("relationship_field_for_request")
  private String relationshipFieldForRequest;

  /**
   * The share type, either STANDARD or MUTUAL.
   */
  @Expose
  @SerializedName("share_type_field_for_request")
  private String shareTypeFieldForRequest;

  /**
   * The start date of this share.
   */
  @Expose
  @SerializedName("start_date_field_for_request")
  private String startDateFieldForRequest;

  /**
   * The expiration date of this share.
   */
  @Expose
  @SerializedName("end_date_field_for_request")
  private String endDateFieldForRequest;

  public ShareInviteMonetaryAccountInquiry() {
  this(null, null, null, null, null, null, null, null);
  }

  public ShareInviteMonetaryAccountInquiry(Pointer counterUserAlias) {
  this(counterUserAlias, null, null, null, null, null, null, null);
  }

  public ShareInviteMonetaryAccountInquiry(Pointer counterUserAlias, ShareDetail shareDetail) {
  this(counterUserAlias, shareDetail, null, null, null, null, null, null);
  }

  public ShareInviteMonetaryAccountInquiry(Pointer counterUserAlias, ShareDetail shareDetail, String status) {
  this(counterUserAlias, shareDetail, status, null, null, null, null, null);
  }

  public ShareInviteMonetaryAccountInquiry(Pointer counterUserAlias, ShareDetail shareDetail, String status, Integer draftShareInviteBankId) {
  this(counterUserAlias, shareDetail, status, draftShareInviteBankId, null, null, null, null);
  }

  public ShareInviteMonetaryAccountInquiry(Pointer counterUserAlias, ShareDetail shareDetail, String status, Integer draftShareInviteBankId, String relationship) {
  this(counterUserAlias, shareDetail, status, draftShareInviteBankId, relationship, null, null, null);
  }

  public ShareInviteMonetaryAccountInquiry(Pointer counterUserAlias, ShareDetail shareDetail, String status, Integer draftShareInviteBankId, String relationship, String shareType) {
  this(counterUserAlias, shareDetail, status, draftShareInviteBankId, relationship, shareType, null, null);
  }

  public ShareInviteMonetaryAccountInquiry(Pointer counterUserAlias, ShareDetail shareDetail, String status, Integer draftShareInviteBankId, String relationship, String shareType, String startDate) {
  this(counterUserAlias, shareDetail, status, draftShareInviteBankId, relationship, shareType, startDate, null);
  }

  public ShareInviteMonetaryAccountInquiry(Pointer counterUserAlias, ShareDetail shareDetail, String status, Integer draftShareInviteBankId, String relationship, String shareType, String startDate, String endDate) {
    this.counterUserAliasFieldForRequest = counterUserAlias;
    this.draftShareInviteBankIdFieldForRequest = draftShareInviteBankId;
    this.shareDetailFieldForRequest = shareDetail;
    this.statusFieldForRequest = status;
    this.relationshipFieldForRequest = relationship;
    this.shareTypeFieldForRequest = shareType;
    this.startDateFieldForRequest = startDate;
    this.endDateFieldForRequest = endDate;
  }  /**
   * [DEPRECATED - use /share-invite-monetary-account-response] Create a new share inquiry for a
   * monetary account, specifying the permission the other bunq user will have on it.
   * @param counterUserAlias The pointer of the user to share with.
   * @param shareDetail The share details. Only one of these objects may be passed.
   * @param status The status of the share. Can be PENDING, REVOKED (the user deletes the share
   * inquiry before it's accepted), ACCEPTED, CANCELLED (the user deletes an active share) or
   * CANCELLATION_PENDING, CANCELLATION_ACCEPTED, CANCELLATION_REJECTED (for canceling mutual
   * connects).
   * @param draftShareInviteBankId The id of the draft share invite bank.
   * @param relationship The relationship: COMPANY_DIRECTOR, COMPANY_EMPLOYEE, etc
   * @param shareType The share type, either STANDARD or MUTUAL.
   * @param startDate The start date of this share.
   * @param endDate The expiration date of this share.
   */
  public static BunqResponse<Integer> create(Pointer counterUserAlias, ShareDetail shareDetail, String status, Integer monetaryAccountId, Integer draftShareInviteBankId, String relationship, String shareType, String startDate, String endDate, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_COUNTER_USER_ALIAS, counterUserAlias);
requestMap.put(FIELD_DRAFT_SHARE_INVITE_BANK_ID, draftShareInviteBankId);
requestMap.put(FIELD_SHARE_DETAIL, shareDetail);
requestMap.put(FIELD_STATUS, status);
requestMap.put(FIELD_RELATIONSHIP, relationship);
requestMap.put(FIELD_SHARE_TYPE, shareType);
requestMap.put(FIELD_START_DATE, startDate);
requestMap.put(FIELD_END_DATE, endDate);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Pointer counterUserAlias) {
    return create(counterUserAlias, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Pointer counterUserAlias, ShareDetail shareDetail) {
    return create(counterUserAlias, shareDetail, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Pointer counterUserAlias, ShareDetail shareDetail, String status) {
    return create(counterUserAlias, shareDetail, status, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Pointer counterUserAlias, ShareDetail shareDetail, String status, Integer monetaryAccountId) {
    return create(counterUserAlias, shareDetail, status, monetaryAccountId, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Pointer counterUserAlias, ShareDetail shareDetail, String status, Integer monetaryAccountId, Integer draftShareInviteBankId) {
    return create(counterUserAlias, shareDetail, status, monetaryAccountId, draftShareInviteBankId, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Pointer counterUserAlias, ShareDetail shareDetail, String status, Integer monetaryAccountId, Integer draftShareInviteBankId, String relationship) {
    return create(counterUserAlias, shareDetail, status, monetaryAccountId, draftShareInviteBankId, relationship, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Pointer counterUserAlias, ShareDetail shareDetail, String status, Integer monetaryAccountId, Integer draftShareInviteBankId, String relationship, String shareType) {
    return create(counterUserAlias, shareDetail, status, monetaryAccountId, draftShareInviteBankId, relationship, shareType, null, null, null);
  }

  public static BunqResponse<Integer> create(Pointer counterUserAlias, ShareDetail shareDetail, String status, Integer monetaryAccountId, Integer draftShareInviteBankId, String relationship, String shareType, String startDate) {
    return create(counterUserAlias, shareDetail, status, monetaryAccountId, draftShareInviteBankId, relationship, shareType, startDate, null, null);
  }

  public static BunqResponse<Integer> create(Pointer counterUserAlias, ShareDetail shareDetail, String status, Integer monetaryAccountId, Integer draftShareInviteBankId, String relationship, String shareType, String startDate, String endDate) {
    return create(counterUserAlias, shareDetail, status, monetaryAccountId, draftShareInviteBankId, relationship, shareType, startDate, endDate, null);
  }

  /**
   * [DEPRECATED - use /share-invite-monetary-account-response] Get the details of a specific
   * share inquiry.
   */
  public static BunqResponse<ShareInviteMonetaryAccountInquiry> get(Integer shareInviteMonetaryAccountInquiryId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), shareInviteMonetaryAccountInquiryId), params, customHeaders);

    return fromJson(ShareInviteMonetaryAccountInquiry.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<ShareInviteMonetaryAccountInquiry> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<ShareInviteMonetaryAccountInquiry> get(Integer shareInviteMonetaryAccountInquiryId) {
    return get(shareInviteMonetaryAccountInquiryId, null, null, null);
  }

  public static BunqResponse<ShareInviteMonetaryAccountInquiry> get(Integer shareInviteMonetaryAccountInquiryId, Integer monetaryAccountId) {
    return get(shareInviteMonetaryAccountInquiryId, monetaryAccountId, null, null);
  }

  public static BunqResponse<ShareInviteMonetaryAccountInquiry> get(Integer shareInviteMonetaryAccountInquiryId, Integer monetaryAccountId, Map<String, String> params) {
    return get(shareInviteMonetaryAccountInquiryId, monetaryAccountId, params, null);
  }

  /**
   * [DEPRECATED - use /share-invite-monetary-account-response] Update the details of a share.
   * This includes updating status (revoking or cancelling it), granted permission and validity
   * period of this share.
   * @param shareDetail The share details. Only one of these objects may be passed.
   * @param status The status of the share. Can be PENDING, REVOKED (the user deletes the share
   * inquiry before it's accepted), ACCEPTED, CANCELLED (the user deletes an active share) or
   * CANCELLATION_PENDING, CANCELLATION_ACCEPTED, CANCELLATION_REJECTED (for canceling mutual
   * connects).
   * @param startDate The start date of this share.
   * @param endDate The expiration date of this share.
   */
  public static BunqResponse<Integer> update(Integer shareInviteMonetaryAccountInquiryId, Integer monetaryAccountId, ShareDetail shareDetail, String status, String startDate, String endDate, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_SHARE_DETAIL, shareDetail);
requestMap.put(FIELD_STATUS, status);
requestMap.put(FIELD_START_DATE, startDate);
requestMap.put(FIELD_END_DATE, endDate);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), shareInviteMonetaryAccountInquiryId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer shareInviteMonetaryAccountInquiryId) {
    return update(shareInviteMonetaryAccountInquiryId, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer shareInviteMonetaryAccountInquiryId, Integer monetaryAccountId) {
    return update(shareInviteMonetaryAccountInquiryId, monetaryAccountId, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer shareInviteMonetaryAccountInquiryId, Integer monetaryAccountId, ShareDetail shareDetail) {
    return update(shareInviteMonetaryAccountInquiryId, monetaryAccountId, shareDetail, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer shareInviteMonetaryAccountInquiryId, Integer monetaryAccountId, ShareDetail shareDetail, String status) {
    return update(shareInviteMonetaryAccountInquiryId, monetaryAccountId, shareDetail, status, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer shareInviteMonetaryAccountInquiryId, Integer monetaryAccountId, ShareDetail shareDetail, String status, String startDate) {
    return update(shareInviteMonetaryAccountInquiryId, monetaryAccountId, shareDetail, status, startDate, null, null);
  }

  public static BunqResponse<Integer> update(Integer shareInviteMonetaryAccountInquiryId, Integer monetaryAccountId, ShareDetail shareDetail, String status, String startDate, String endDate) {
    return update(shareInviteMonetaryAccountInquiryId, monetaryAccountId, shareDetail, status, startDate, endDate, null);
  }

  /**
   * [DEPRECATED - use /share-invite-monetary-account-response] Get a list with all the share
   * inquiries for a monetary account, only if the requesting user has permission to change the
   * details of the various ones.
   */
  public static BunqResponse<List<ShareInviteMonetaryAccountInquiry>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(ShareInviteMonetaryAccountInquiry.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<ShareInviteMonetaryAccountInquiry>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<ShareInviteMonetaryAccountInquiry>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<ShareInviteMonetaryAccountInquiry>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   * The label of the monetary account that's being shared.
   */
  public LabelMonetaryAccount getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccount alias) {
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
   * The relationship: COMPANY_DIRECTOR, COMPANY_EMPLOYEE, etc
   */
  public String getRelationship() {
    return this.relationship;
  }

  public void setRelationship(String relationship) {
    this.relationship = relationship;
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

    if (this.relationship != null) {
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
  public static ShareInviteMonetaryAccountInquiry fromJsonReader(JsonReader reader) {
    return fromJsonReader(ShareInviteMonetaryAccountInquiry.class, reader);
  }

}
