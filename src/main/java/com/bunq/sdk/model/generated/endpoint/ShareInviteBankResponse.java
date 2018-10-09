package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.bunq.sdk.model.generated.object.ShareDetail;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to view or respond to shares a user was invited to. See 'share-invite-bank-inquiry' for
 * more information about the inquiring endpoint.
 */
public class ShareInviteBankResponse extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/share-invite-bank-response/%s";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/share-invite-bank-response/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/share-invite-bank-response";

  /**
   * Field constants.
   */
  public static final String FIELD_STATUS = "status";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "ShareInviteBankResponse";

  /**
   * The id of the ShareInviteBankResponse.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the ShareInviteBankResponse creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the ShareInviteBankResponse last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The monetary account and user who created the share.
   */
  @Expose
  @SerializedName("counter_alias")
  private LabelMonetaryAccount counterAlias;

  /**
   * The user who cancelled the share if it has been revoked or rejected.
   */
  @Expose
  @SerializedName("user_alias_cancelled")
  private LabelUser userAliasCancelled;

  /**
   * The id of the monetary account the ACCEPTED share applies to. null otherwise.
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
   * The share details.
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
   * The description of this share. It is basically the monetary account description.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The status of the share. Can be PENDING, REVOKED (the user deletes the share inquiry before
   * it's accepted), ACCEPTED, CANCELLED (the user deletes an active share) or
   * CANCELLATION_PENDING, CANCELLATION_ACCEPTED, CANCELLATION_REJECTED (for canceling mutual
   * connects)
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  public ShareInviteBankResponse() {
    this(null);
  }

  public ShareInviteBankResponse(String status) {
    this.statusFieldForRequest = status;
  }

  /**
   * Return the details of a specific share a user was invited to.
   */
  public static BunqResponse<ShareInviteBankResponse> get(Integer shareInviteBankResponseId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), shareInviteBankResponseId), params, customHeaders);

    return fromJson(ShareInviteBankResponse.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<ShareInviteBankResponse> get() {
    return get(null, null, null);
  }

  public static BunqResponse<ShareInviteBankResponse> get(Integer shareInviteBankResponseId) {
    return get(shareInviteBankResponseId, null, null);
  }

  public static BunqResponse<ShareInviteBankResponse> get(Integer shareInviteBankResponseId, Map<String, String> params) {
    return get(shareInviteBankResponseId, params, null);
  }

  /**
   * Accept or reject a share a user was invited to.
   * @param status The status of the share. Can be PENDING, REVOKED (the user deletes the share
   * inquiry before it's accepted), ACCEPTED, CANCELLED (the user deletes an active share) or
   * CANCELLATION_PENDING, CANCELLATION_ACCEPTED, CANCELLATION_REJECTED (for canceling mutual
   * connects)
   */
  public static BunqResponse<Integer> update(Integer shareInviteBankResponseId, String status, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_STATUS, status);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), shareInviteBankResponseId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer shareInviteBankResponseId) {
    return update(shareInviteBankResponseId, null, null);
  }

  public static BunqResponse<Integer> update(Integer shareInviteBankResponseId, String status) {
    return update(shareInviteBankResponseId, status, null);
  }

  /**
   * Return all the shares a user was invited to.
   */
  public static BunqResponse<List<ShareInviteBankResponse>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(ShareInviteBankResponse.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<ShareInviteBankResponse>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<ShareInviteBankResponse>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The id of the ShareInviteBankResponse.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the ShareInviteBankResponse creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the ShareInviteBankResponse last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The monetary account and user who created the share.
   */
  public LabelMonetaryAccount getCounterAlias() {
    return this.counterAlias;
  }

  public void setCounterAlias(LabelMonetaryAccount counterAlias) {
    this.counterAlias = counterAlias;
  }

  /**
   * The user who cancelled the share if it has been revoked or rejected.
   */
  public LabelUser getUserAliasCancelled() {
    return this.userAliasCancelled;
  }

  public void setUserAliasCancelled(LabelUser userAliasCancelled) {
    this.userAliasCancelled = userAliasCancelled;
  }

  /**
   * The id of the monetary account the ACCEPTED share applies to. null otherwise.
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
   * The share details.
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
   * The description of this share. It is basically the monetary account description.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.created != null) {
      return false;
    }

    if (this.updated != null) {
      return false;
    }

    if (this.counterAlias != null) {
      return false;
    }

    if (this.userAliasCancelled != null) {
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

    if (this.description != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static ShareInviteBankResponse fromJsonReader(JsonReader reader) {
    return fromJsonReader(ShareInviteBankResponse.class, reader);
  }

}
