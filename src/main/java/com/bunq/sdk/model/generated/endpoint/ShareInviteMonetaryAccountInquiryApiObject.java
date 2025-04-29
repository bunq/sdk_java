package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccountObject;
import com.bunq.sdk.model.generated.object.LabelUserObject;
import com.bunq.sdk.model.generated.object.PointerObject;
import com.bunq.sdk.model.generated.object.ShareDetailObject;
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
public class ShareInviteMonetaryAccountInquiryApiObject extends BunqModel {

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
  public static final String FIELD_ACCESS_TYPE = "access_type";
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
  private LabelMonetaryAccountObject alias;

  /**
   * The user who created the share.
   */
  @Expose
  @SerializedName("user_alias_created")
  private LabelUserObject userAliasCreated;

  /**
   * The user who revoked the share.
   */
  @Expose
  @SerializedName("user_alias_revoked")
  private LabelUserObject userAliasRevoked;

  /**
   * The label of the user to share with.
   */
  @Expose
  @SerializedName("counter_user_alias")
  private LabelUserObject counterUserAlias;

  /**
   * The id of the monetary account the share applies to.
   */
  @Expose
  @SerializedName("monetary_account_id")
  private Integer monetaryAccountId;

  /**
   * The status of the share. Can be ACTIVE, REVOKED, REJECTED.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * Type of access that is in place.
   */
  @Expose
  @SerializedName("access_type")
  private String accessType;

  /**
   * The relationship: COMPANY_DIRECTOR, COMPANY_EMPLOYEE, etc
   */
  @Expose
  @SerializedName("relationship")
  private String relationship;

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
  private PointerObject counterUserAliasFieldForRequest;

  /**
   * Type of access that is wanted, one of VIEW_BALANCE, VIEW_TRANSACTION, DRAFT_PAYMENT or
   * FULL_TRANSIENT
   */
  @Expose
  @SerializedName("access_type_field_for_request")
  private String accessTypeFieldForRequest;

  /**
   * DEPRECATED: USE `access_type` INSTEAD | The id of the draft share invite bank.
   */
  @Expose
  @SerializedName("draft_share_invite_bank_id_field_for_request")
  private Integer draftShareInviteBankIdFieldForRequest;

  /**
   * DEPRECATED: USE `access_type` INSTEAD | The share details. Only one of these objects may be
   * passed.
   */
  @Expose
  @SerializedName("share_detail_field_for_request")
  private ShareDetailObject shareDetailFieldForRequest;

  /**
   * The status of the share. Can be ACTIVE, REVOKED, REJECTED.
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
   * DEPRECATED: USE `access_type` INSTEAD | The share type, either STANDARD or MUTUAL.
   */
  @Expose
  @SerializedName("share_type_field_for_request")
  private String shareTypeFieldForRequest;

  /**
   * DEPRECATED: USE `access_type` INSTEAD | The start date of this share.
   */
  @Expose
  @SerializedName("start_date_field_for_request")
  private String startDateFieldForRequest;

  /**
   * DEPRECATED: USE `access_type` INSTEAD | The expiration date of this share.
   */
  @Expose
  @SerializedName("end_date_field_for_request")
  private String endDateFieldForRequest;

  public ShareInviteMonetaryAccountInquiryApiObject() {
  this(null, null, null, null, null, null, null, null, null);
  }

  public ShareInviteMonetaryAccountInquiryApiObject(PointerObject counterUserAlias) {
  this(counterUserAlias, null, null, null, null, null, null, null, null);
  }

  public ShareInviteMonetaryAccountInquiryApiObject(PointerObject counterUserAlias, String accessType) {
  this(counterUserAlias, accessType, null, null, null, null, null, null, null);
  }

  public ShareInviteMonetaryAccountInquiryApiObject(PointerObject counterUserAlias, String accessType, Integer draftShareInviteBankId) {
  this(counterUserAlias, accessType, draftShareInviteBankId, null, null, null, null, null, null);
  }

  public ShareInviteMonetaryAccountInquiryApiObject(PointerObject counterUserAlias, String accessType, Integer draftShareInviteBankId, ShareDetailObject shareDetail) {
  this(counterUserAlias, accessType, draftShareInviteBankId, shareDetail, null, null, null, null, null);
  }

  public ShareInviteMonetaryAccountInquiryApiObject(PointerObject counterUserAlias, String accessType, Integer draftShareInviteBankId, ShareDetailObject shareDetail, String status) {
  this(counterUserAlias, accessType, draftShareInviteBankId, shareDetail, status, null, null, null, null);
  }

  public ShareInviteMonetaryAccountInquiryApiObject(PointerObject counterUserAlias, String accessType, Integer draftShareInviteBankId, ShareDetailObject shareDetail, String status, String relationship) {
  this(counterUserAlias, accessType, draftShareInviteBankId, shareDetail, status, relationship, null, null, null);
  }

  public ShareInviteMonetaryAccountInquiryApiObject(PointerObject counterUserAlias, String accessType, Integer draftShareInviteBankId, ShareDetailObject shareDetail, String status, String relationship, String shareType) {
  this(counterUserAlias, accessType, draftShareInviteBankId, shareDetail, status, relationship, shareType, null, null);
  }

  public ShareInviteMonetaryAccountInquiryApiObject(PointerObject counterUserAlias, String accessType, Integer draftShareInviteBankId, ShareDetailObject shareDetail, String status, String relationship, String shareType, String startDate) {
  this(counterUserAlias, accessType, draftShareInviteBankId, shareDetail, status, relationship, shareType, startDate, null);
  }

  public ShareInviteMonetaryAccountInquiryApiObject(PointerObject counterUserAlias, String accessType, Integer draftShareInviteBankId, ShareDetailObject shareDetail, String status, String relationship, String shareType, String startDate, String endDate) {
    this.counterUserAliasFieldForRequest = counterUserAlias;
    this.accessTypeFieldForRequest = accessType;
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
   * @param accessType Type of access that is wanted, one of VIEW_BALANCE, VIEW_TRANSACTION,
   * DRAFT_PAYMENT or FULL_TRANSIENT
   * @param draftShareInviteBankId DEPRECATED: USE `access_type` INSTEAD | The id of the draft
   * share invite bank.
   * @param shareDetail DEPRECATED: USE `access_type` INSTEAD | The share details. Only one of
   * these objects may be passed.
   * @param status The status of the share. Can be ACTIVE, REVOKED, REJECTED.
   * @param relationship The relationship: COMPANY_DIRECTOR, COMPANY_EMPLOYEE, etc
   * @param shareType DEPRECATED: USE `access_type` INSTEAD | The share type, either STANDARD or
   * MUTUAL.
   * @param startDate DEPRECATED: USE `access_type` INSTEAD | The start date of this share.
   * @param endDate DEPRECATED: USE `access_type` INSTEAD | The expiration date of this share.
   */
  public static BunqResponse<Integer> create(PointerObject counterUserAlias, Integer monetaryAccountId, String accessType, Integer draftShareInviteBankId, ShareDetailObject shareDetail, String status, String relationship, String shareType, String startDate, String endDate, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_COUNTER_USER_ALIAS, counterUserAlias);
requestMap.put(FIELD_ACCESS_TYPE, accessType);
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
    return create(null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(PointerObject counterUserAlias) {
    return create(counterUserAlias, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(PointerObject counterUserAlias, Integer monetaryAccountId) {
    return create(counterUserAlias, monetaryAccountId, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(PointerObject counterUserAlias, Integer monetaryAccountId, String accessType) {
    return create(counterUserAlias, monetaryAccountId, accessType, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(PointerObject counterUserAlias, Integer monetaryAccountId, String accessType, Integer draftShareInviteBankId) {
    return create(counterUserAlias, monetaryAccountId, accessType, draftShareInviteBankId, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(PointerObject counterUserAlias, Integer monetaryAccountId, String accessType, Integer draftShareInviteBankId, ShareDetailObject shareDetail) {
    return create(counterUserAlias, monetaryAccountId, accessType, draftShareInviteBankId, shareDetail, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(PointerObject counterUserAlias, Integer monetaryAccountId, String accessType, Integer draftShareInviteBankId, ShareDetailObject shareDetail, String status) {
    return create(counterUserAlias, monetaryAccountId, accessType, draftShareInviteBankId, shareDetail, status, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(PointerObject counterUserAlias, Integer monetaryAccountId, String accessType, Integer draftShareInviteBankId, ShareDetailObject shareDetail, String status, String relationship) {
    return create(counterUserAlias, monetaryAccountId, accessType, draftShareInviteBankId, shareDetail, status, relationship, null, null, null, null);
  }

  public static BunqResponse<Integer> create(PointerObject counterUserAlias, Integer monetaryAccountId, String accessType, Integer draftShareInviteBankId, ShareDetailObject shareDetail, String status, String relationship, String shareType) {
    return create(counterUserAlias, monetaryAccountId, accessType, draftShareInviteBankId, shareDetail, status, relationship, shareType, null, null, null);
  }

  public static BunqResponse<Integer> create(PointerObject counterUserAlias, Integer monetaryAccountId, String accessType, Integer draftShareInviteBankId, ShareDetailObject shareDetail, String status, String relationship, String shareType, String startDate) {
    return create(counterUserAlias, monetaryAccountId, accessType, draftShareInviteBankId, shareDetail, status, relationship, shareType, startDate, null, null);
  }

  public static BunqResponse<Integer> create(PointerObject counterUserAlias, Integer monetaryAccountId, String accessType, Integer draftShareInviteBankId, ShareDetailObject shareDetail, String status, String relationship, String shareType, String startDate, String endDate) {
    return create(counterUserAlias, monetaryAccountId, accessType, draftShareInviteBankId, shareDetail, status, relationship, shareType, startDate, endDate, null);
  }

  /**
   * [DEPRECATED - use /share-invite-monetary-account-response] Get the details of a specific
   * share inquiry.
   */
  public static BunqResponse<ShareInviteMonetaryAccountInquiryApiObject> get(Integer shareInviteMonetaryAccountInquiryId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), shareInviteMonetaryAccountInquiryId), params, customHeaders);

    return fromJson(ShareInviteMonetaryAccountInquiryApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<ShareInviteMonetaryAccountInquiryApiObject> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<ShareInviteMonetaryAccountInquiryApiObject> get(Integer shareInviteMonetaryAccountInquiryId) {
    return get(shareInviteMonetaryAccountInquiryId, null, null, null);
  }

  public static BunqResponse<ShareInviteMonetaryAccountInquiryApiObject> get(Integer shareInviteMonetaryAccountInquiryId, Integer monetaryAccountId) {
    return get(shareInviteMonetaryAccountInquiryId, monetaryAccountId, null, null);
  }

  public static BunqResponse<ShareInviteMonetaryAccountInquiryApiObject> get(Integer shareInviteMonetaryAccountInquiryId, Integer monetaryAccountId, Map<String, String> params) {
    return get(shareInviteMonetaryAccountInquiryId, monetaryAccountId, params, null);
  }

  /**
   * [DEPRECATED - use /share-invite-monetary-account-response] Update the details of a share.
   * This includes updating status (revoking or cancelling it), granted permission and validity
   * period of this share.
   * @param accessType Type of access that is wanted, one of VIEW_BALANCE, VIEW_TRANSACTION,
   * DRAFT_PAYMENT or FULL_TRANSIENT
   * @param shareDetail DEPRECATED: USE `access_type` INSTEAD | The share details. Only one of
   * these objects may be passed.
   * @param status The status of the share. Can be ACTIVE, REVOKED, REJECTED.
   * @param startDate DEPRECATED: USE `access_type` INSTEAD | The start date of this share.
   * @param endDate DEPRECATED: USE `access_type` INSTEAD | The expiration date of this share.
   */
  public static BunqResponse<Integer> update(Integer shareInviteMonetaryAccountInquiryId, Integer monetaryAccountId, String accessType, ShareDetailObject shareDetail, String status, String startDate, String endDate, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_ACCESS_TYPE, accessType);
requestMap.put(FIELD_SHARE_DETAIL, shareDetail);
requestMap.put(FIELD_STATUS, status);
requestMap.put(FIELD_START_DATE, startDate);
requestMap.put(FIELD_END_DATE, endDate);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), shareInviteMonetaryAccountInquiryId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer shareInviteMonetaryAccountInquiryId) {
    return update(shareInviteMonetaryAccountInquiryId, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer shareInviteMonetaryAccountInquiryId, Integer monetaryAccountId) {
    return update(shareInviteMonetaryAccountInquiryId, monetaryAccountId, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer shareInviteMonetaryAccountInquiryId, Integer monetaryAccountId, String accessType) {
    return update(shareInviteMonetaryAccountInquiryId, monetaryAccountId, accessType, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer shareInviteMonetaryAccountInquiryId, Integer monetaryAccountId, String accessType, ShareDetailObject shareDetail) {
    return update(shareInviteMonetaryAccountInquiryId, monetaryAccountId, accessType, shareDetail, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer shareInviteMonetaryAccountInquiryId, Integer monetaryAccountId, String accessType, ShareDetailObject shareDetail, String status) {
    return update(shareInviteMonetaryAccountInquiryId, monetaryAccountId, accessType, shareDetail, status, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer shareInviteMonetaryAccountInquiryId, Integer monetaryAccountId, String accessType, ShareDetailObject shareDetail, String status, String startDate) {
    return update(shareInviteMonetaryAccountInquiryId, monetaryAccountId, accessType, shareDetail, status, startDate, null, null);
  }

  public static BunqResponse<Integer> update(Integer shareInviteMonetaryAccountInquiryId, Integer monetaryAccountId, String accessType, ShareDetailObject shareDetail, String status, String startDate, String endDate) {
    return update(shareInviteMonetaryAccountInquiryId, monetaryAccountId, accessType, shareDetail, status, startDate, endDate, null);
  }

  /**
   * [DEPRECATED - use /share-invite-monetary-account-response] Get a list with all the share
   * inquiries for a monetary account, only if the requesting user has permission to change the
   * details of the various ones.
   */
  public static BunqResponse<List<ShareInviteMonetaryAccountInquiryApiObject>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(ShareInviteMonetaryAccountInquiryApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<ShareInviteMonetaryAccountInquiryApiObject>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<ShareInviteMonetaryAccountInquiryApiObject>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<ShareInviteMonetaryAccountInquiryApiObject>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   * The label of the monetary account that's being shared.
   */
  public LabelMonetaryAccountObject getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccountObject alias) {
    this.alias = alias;
  }

  /**
   * The user who created the share.
   */
  public LabelUserObject getUserAliasCreated() {
    return this.userAliasCreated;
  }

  public void setUserAliasCreated(LabelUserObject userAliasCreated) {
    this.userAliasCreated = userAliasCreated;
  }

  /**
   * The user who revoked the share.
   */
  public LabelUserObject getUserAliasRevoked() {
    return this.userAliasRevoked;
  }

  public void setUserAliasRevoked(LabelUserObject userAliasRevoked) {
    this.userAliasRevoked = userAliasRevoked;
  }

  /**
   * The label of the user to share with.
   */
  public LabelUserObject getCounterUserAlias() {
    return this.counterUserAlias;
  }

  public void setCounterUserAlias(LabelUserObject counterUserAlias) {
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
   * The status of the share. Can be ACTIVE, REVOKED, REJECTED.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Type of access that is in place.
   */
  public String getAccessType() {
    return this.accessType;
  }

  public void setAccessType(String accessType) {
    this.accessType = accessType;
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

    if (this.status != null) {
      return false;
    }

    if (this.accessType != null) {
      return false;
    }

    if (this.relationship != null) {
      return false;
    }

    if (this.id != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static ShareInviteMonetaryAccountInquiryApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(ShareInviteMonetaryAccountInquiryApiObject.class, reader);
  }

}
