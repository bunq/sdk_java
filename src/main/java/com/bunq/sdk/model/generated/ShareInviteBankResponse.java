package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
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
 * Used to view or respond to shares a user was invited to. See 'share-invite-bank-inquiry' for
 * more information about the inquiring endpoint.
 */
public class ShareInviteBankResponse extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_STATUS = "status";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_READ = "user/%s/share-invite-bank-response/%s";
  private static final String ENDPOINT_URL_UPDATE = "user/%s/share-invite-bank-response/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/share-invite-bank-response";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "ShareInviteBankResponse";

  /**
   * The monetary account and user who created the share.
   */
  @Expose
  @SerializedName("counter_alias")
  private MonetaryAccountReference counterAlias;

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
   * The status of the share. Can be ACCEPTED (other user scans the QR and accepts the share),
   * REVOKED (other user scans the QR but denies the share), CANCELLED (other user cancels an
   * existing share), EXPIRED (other user did not react before expiration), PENDING (share is
   * waiting for reply by the other user) or REJECTED (share initiated by other user but
   * rejected). Once the share's status becomes REVOKED, CANCELLED, EXPIRED or REJECTED, its
   * status can no longer be updated.
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
   * The description of this share. It is basically the monetary account description.
   */
  @Expose
  @SerializedName("description")
  private String description;

  public static ShareInviteBankResponse get(ApiContext apiContext, Integer userId,
      Integer shareInviteBankResponseId) {
    return get(apiContext, userId, shareInviteBankResponseId, new HashMap<>());
  }

  /**
   * Return the details of a specific share a user was invited to.
   */
  public static ShareInviteBankResponse get(ApiContext apiContext, Integer userId,
      Integer shareInviteBankResponseId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] responseBytes = apiClient
        .get(String.format(ENDPOINT_URL_READ, userId, shareInviteBankResponseId), customHeaders);

    return fromJson(ShareInviteBankResponse.class, new String(responseBytes), OBJECT_TYPE);
  }

  public static ShareInviteBankResponse update(ApiContext apiContext,
      Map<String, Object> requestMap, Integer userId, Integer shareInviteBankResponseId) {
    return update(apiContext, requestMap, userId, shareInviteBankResponseId, new HashMap<>());
  }

  /**
   * Accept or reject a share a user was invited to.
   */
  public static ShareInviteBankResponse update(ApiContext apiContext,
      Map<String, Object> requestMap, Integer userId, Integer shareInviteBankResponseId,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    byte[] responseBytes = apiClient
        .put(String.format(ENDPOINT_URL_UPDATE, userId, shareInviteBankResponseId), requestBytes,
            customHeaders);

    return fromJson(ShareInviteBankResponse.class, new String(responseBytes), OBJECT_TYPE);
  }

  public static List<ShareInviteBankResponse> list(ApiContext apiContext, Integer userId) {
    return list(apiContext, userId, new HashMap<>());
  }

  /**
   * Return all the shares a user was invited to.
   */
  public static List<ShareInviteBankResponse> list(ApiContext apiContext, Integer userId,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] responseBytes = apiClient
        .get(String.format(ENDPOINT_URL_LISTING, userId), customHeaders);

    return fromJsonList(ShareInviteBankResponse.class, new String(responseBytes), OBJECT_TYPE);
  }

  /**
   * The monetary account and user who created the share.
   */
  public MonetaryAccountReference getCounterAlias() {
    return this.counterAlias;
  }

  public void setCounterAlias(MonetaryAccountReference counterAlias) {
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
   * The status of the share. Can be ACCEPTED (other user scans the QR and accepts the share),
   * REVOKED (other user scans the QR but denies the share), CANCELLED (other user cancels an
   * existing share), EXPIRED (other user did not react before expiration), PENDING (share is
   * waiting for reply by the other user) or REJECTED (share initiated by other user but
   * rejected). Once the share's status becomes REVOKED, CANCELLED, EXPIRED or REJECTED, its
   * status can no longer be updated.
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
   * The description of this share. It is basically the monetary account description.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
