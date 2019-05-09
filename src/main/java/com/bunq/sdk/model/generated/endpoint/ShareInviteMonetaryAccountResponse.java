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
public class ShareInviteMonetaryAccountResponse extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/share-invite-monetary-account-response/%s";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/share-invite-monetary-account-response/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/share-invite-monetary-account-response";

  /**
   * Field constants.
   */
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_CARD_ID = "card_id";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "ShareInviteMonetaryAccountResponse";

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

  /**
   * The card to link to the shared monetary account. Used only if share_detail is
   * ShareDetailCardPayment.
   */
  @Expose
  @SerializedName("card_id_field_for_request")
  private Integer cardIdFieldForRequest;

  public ShareInviteMonetaryAccountResponse() {
    this(null, null);
  }

  public ShareInviteMonetaryAccountResponse(String status) {
    this(status, null);
  }

  public ShareInviteMonetaryAccountResponse(String status, Integer cardId) {
    this.statusFieldForRequest = status;
    this.cardIdFieldForRequest = cardId;
  }

  /**
   * Return the details of a specific share a user was invited to.
   */
  public static BunqResponse<ShareInviteMonetaryAccountResponse> get(Integer shareInviteMonetaryAccountResponseId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), shareInviteMonetaryAccountResponseId), params, customHeaders);

    return fromJson(ShareInviteMonetaryAccountResponse.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<ShareInviteMonetaryAccountResponse> get() {
    return get(null, null, null);
  }

  public static BunqResponse<ShareInviteMonetaryAccountResponse> get(Integer shareInviteMonetaryAccountResponseId) {
    return get(shareInviteMonetaryAccountResponseId, null, null);
  }

  public static BunqResponse<ShareInviteMonetaryAccountResponse> get(Integer shareInviteMonetaryAccountResponseId, Map<String, String> params) {
    return get(shareInviteMonetaryAccountResponseId, params, null);
  }

  /**
   * Accept or reject a share a user was invited to.
   *
   * @param status The status of the share. Can be PENDING, REVOKED (the user deletes the share
   *               inquiry before it's accepted), ACCEPTED, CANCELLED (the user deletes an active share) or
   *               CANCELLATION_PENDING, CANCELLATION_ACCEPTED, CANCELLATION_REJECTED (for canceling mutual
   *               connects)
   * @param cardId The card to link to the shared monetary account. Used only if share_detail is
   *               ShareDetailCardPayment.
   */
  public static BunqResponse<Integer> update(Integer shareInviteMonetaryAccountResponseId, String status, Integer cardId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_STATUS, status);
    requestMap.put(FIELD_CARD_ID, cardId);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), shareInviteMonetaryAccountResponseId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer shareInviteMonetaryAccountResponseId) {
    return update(shareInviteMonetaryAccountResponseId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer shareInviteMonetaryAccountResponseId, String status) {
    return update(shareInviteMonetaryAccountResponseId, status, null, null);
  }

  public static BunqResponse<Integer> update(Integer shareInviteMonetaryAccountResponseId, String status, Integer cardId) {
    return update(shareInviteMonetaryAccountResponseId, status, cardId, null);
  }

  /**
   * Return all the shares a user was invited to.
   */
  public static BunqResponse<List<ShareInviteMonetaryAccountResponse>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(ShareInviteMonetaryAccountResponse.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<ShareInviteMonetaryAccountResponse>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<ShareInviteMonetaryAccountResponse>> list(Map<String, String> params) {
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
  public static ShareInviteMonetaryAccountResponse fromJsonReader(JsonReader reader) {
    return fromJsonReader(ShareInviteMonetaryAccountResponse.class, reader);
  }

}
