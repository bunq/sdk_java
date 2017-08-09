package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Address;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.BunqId;
import com.bunq.sdk.model.generated.object.Geolocation;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RequestInquiry, aka 'RFP' (Request for Payment), is one of the innovative features that bunq
 * offers. To request payment from another bunq account a new Request Inquiry is created. As
 * with payments you can add attachments to a RFP. Requests for Payment are the foundation for a
 * number of consumer features like 'Split the bill' and 'Request forwarding'. We invite you to
 * invent your own based on the bunq api!
 */
public class RequestInquiry extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_AMOUNT_INQUIRED = "amount_inquired";
  public static final String FIELD_COUNTERPARTY_ALIAS = "counterparty_alias";
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_ATTACHMENT = "attachment";
  public static final String FIELD_MERCHANT_REFERENCE = "merchant_reference";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_MINIMUM_AGE = "minimum_age";
  public static final String FIELD_REQUIRE_ADDRESS = "require_address";
  public static final String FIELD_WANT_TIP = "want_tip";
  public static final String FIELD_ALLOW_AMOUNT_LOWER = "allow_amount_lower";
  public static final String FIELD_ALLOW_AMOUNT_HIGHER = "allow_amount_higher";
  public static final String FIELD_ALLOW_BUNQME = "allow_bunqme";
  public static final String FIELD_REDIRECT_URL = "redirect_url";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/request-inquiry";
  private static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/request-inquiry/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/request-inquiry";
  private static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/request-inquiry/%s";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "RequestInquiry";

  /**
   * The id of the created RequestInquiry.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the payment request's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the payment request's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The timestamp of when the payment request was responded to.
   */
  @Expose
  @SerializedName("time_responded")
  private String timeResponded;

  /**
   * The timestamp of when the payment request expired.
   */
  @Expose
  @SerializedName("time_expiry")
  private String timeExpiry;

  /**
   * The id of the monetary account the request response applies to.
   */
  @Expose
  @SerializedName("monetary_account_id")
  private Integer monetaryAccountId;

  /**
   * The requested amount.
   */
  @Expose
  @SerializedName("amount_inquired")
  private Amount amountInquired;

  /**
   * The responded amount.
   */
  @Expose
  @SerializedName("amount_responded")
  private Amount amountResponded;

  /**
   * The label that's displayed to the counterparty with the mutation. Includes user.
   */
  @Expose
  @SerializedName("user_alias_created")
  private LabelUser userAliasCreated;

  /**
   * The label that's displayed to the counterparty with the mutation. Includes user.
   */
  @Expose
  @SerializedName("user_alias_revoked")
  private LabelUser userAliasRevoked;

  /**
   * The LabelMonetaryAccount with the public information of the MonetaryAccount the money was
   * requested from.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private MonetaryAccountReference counterpartyAlias;

  /**
   * The description of the inquiry.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The client's custom reference that was attached to the request and the mutation.
   */
  @Expose
  @SerializedName("merchant_reference")
  private String merchantReference;

  /**
   * The attachments attached to the payment.
   */
  @Expose
  @SerializedName("attachment")
  private List<BunqId> attachment;

  /**
   * The status of the request.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The id of the batch if the request was part of a batch.
   */
  @Expose
  @SerializedName("batch_id")
  private Integer batchId;

  /**
   * The id of the scheduled job if the request was scheduled.
   */
  @Expose
  @SerializedName("scheduled_id")
  private Integer scheduledId;

  /**
   * The minimum age the user accepting the RequestInquiry must have.
   */
  @Expose
  @SerializedName("minimum_age")
  private Integer minimumAge;

  /**
   * Whether or not an address must be provided on accept.
   */
  @Expose
  @SerializedName("require_address")
  private String requireAddress;

  /**
   * The url that points to the bunq.me request.
   */
  @Expose
  @SerializedName("bunqme_share_url")
  private String bunqmeShareUrl;

  /**
   * The URL which the user is sent to after accepting or rejecting the Request.
   */
  @Expose
  @SerializedName("redirect_url")
  private String redirectUrl;

  /**
   * The shipping address provided by the accepting user if an address was requested.
   */
  @Expose
  @SerializedName("address_shipping")
  private Address addressShipping;

  /**
   * The billing address provided by the accepting user if an address was requested.
   */
  @Expose
  @SerializedName("address_billing")
  private Address addressBilling;

  /**
   * The geolocation where the payment was done.
   */
  @Expose
  @SerializedName("geolocation")
  private Geolocation geolocation;

  /**
   * Whether or not chat messages are allowed.
   */
  @Expose
  @SerializedName("allow_chat")
  private Boolean allowChat;

  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer monetaryAccountId) {
    return create(apiContext, requestMap, userId, monetaryAccountId, new HashMap<>());
  }

  /**
   * Create a new payment request.
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

  public static BunqResponse<RequestInquiry> update(ApiContext apiContext,
      Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId,
      Integer requestInquiryId) {
    return update(apiContext, requestMap, userId, monetaryAccountId, requestInquiryId,
        new HashMap<>());
  }

  /**
   * Revoke a request for payment, by updating the status to REVOKED.
   */
  public static BunqResponse<RequestInquiry> update(ApiContext apiContext,
      Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId,
      Integer requestInquiryId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient
        .put(String.format(ENDPOINT_URL_UPDATE, userId, monetaryAccountId, requestInquiryId),
            requestBytes, customHeaders);

    return fromJson(RequestInquiry.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<List<RequestInquiry>> list(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId) {
    return list(apiContext, userId, monetaryAccountId, new HashMap<>());
  }

  /**
   * Get all payment requests for a user's monetary account.
   */
  public static BunqResponse<List<RequestInquiry>> list(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId), customHeaders);

    return fromJsonList(RequestInquiry.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<RequestInquiry> get(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId, Integer requestInquiryId) {
    return get(apiContext, userId, monetaryAccountId, requestInquiryId, new HashMap<>());
  }

  /**
   * Get the details of a specific payment request, including its status.
   */
  public static BunqResponse<RequestInquiry> get(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId, Integer requestInquiryId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_READ, userId, monetaryAccountId, requestInquiryId),
            customHeaders);

    return fromJson(RequestInquiry.class, responseRaw, OBJECT_TYPE);
  }

  /**
   * The id of the created RequestInquiry.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the payment request's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the payment request's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The timestamp of when the payment request was responded to.
   */
  public String getTimeResponded() {
    return this.timeResponded;
  }

  public void setTimeResponded(String timeResponded) {
    this.timeResponded = timeResponded;
  }

  /**
   * The timestamp of when the payment request expired.
   */
  public String getTimeExpiry() {
    return this.timeExpiry;
  }

  public void setTimeExpiry(String timeExpiry) {
    this.timeExpiry = timeExpiry;
  }

  /**
   * The id of the monetary account the request response applies to.
   */
  public Integer getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(Integer monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   * The requested amount.
   */
  public Amount getAmountInquired() {
    return this.amountInquired;
  }

  public void setAmountInquired(Amount amountInquired) {
    this.amountInquired = amountInquired;
  }

  /**
   * The responded amount.
   */
  public Amount getAmountResponded() {
    return this.amountResponded;
  }

  public void setAmountResponded(Amount amountResponded) {
    this.amountResponded = amountResponded;
  }

  /**
   * The label that's displayed to the counterparty with the mutation. Includes user.
   */
  public LabelUser getUserAliasCreated() {
    return this.userAliasCreated;
  }

  public void setUserAliasCreated(LabelUser userAliasCreated) {
    this.userAliasCreated = userAliasCreated;
  }

  /**
   * The label that's displayed to the counterparty with the mutation. Includes user.
   */
  public LabelUser getUserAliasRevoked() {
    return this.userAliasRevoked;
  }

  public void setUserAliasRevoked(LabelUser userAliasRevoked) {
    this.userAliasRevoked = userAliasRevoked;
  }

  /**
   * The LabelMonetaryAccount with the public information of the MonetaryAccount the money was
   * requested from.
   */
  public MonetaryAccountReference getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(MonetaryAccountReference counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * The description of the inquiry.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The client's custom reference that was attached to the request and the mutation.
   */
  public String getMerchantReference() {
    return this.merchantReference;
  }

  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }

  /**
   * The attachments attached to the payment.
   */
  public List<BunqId> getAttachment() {
    return this.attachment;
  }

  public void setAttachment(List<BunqId> attachment) {
    this.attachment = attachment;
  }

  /**
   * The status of the request.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The id of the batch if the request was part of a batch.
   */
  public Integer getBatchId() {
    return this.batchId;
  }

  public void setBatchId(Integer batchId) {
    this.batchId = batchId;
  }

  /**
   * The id of the scheduled job if the request was scheduled.
   */
  public Integer getScheduledId() {
    return this.scheduledId;
  }

  public void setScheduledId(Integer scheduledId) {
    this.scheduledId = scheduledId;
  }

  /**
   * The minimum age the user accepting the RequestInquiry must have.
   */
  public Integer getMinimumAge() {
    return this.minimumAge;
  }

  public void setMinimumAge(Integer minimumAge) {
    this.minimumAge = minimumAge;
  }

  /**
   * Whether or not an address must be provided on accept.
   */
  public String getRequireAddress() {
    return this.requireAddress;
  }

  public void setRequireAddress(String requireAddress) {
    this.requireAddress = requireAddress;
  }

  /**
   * The url that points to the bunq.me request.
   */
  public String getBunqmeShareUrl() {
    return this.bunqmeShareUrl;
  }

  public void setBunqmeShareUrl(String bunqmeShareUrl) {
    this.bunqmeShareUrl = bunqmeShareUrl;
  }

  /**
   * The URL which the user is sent to after accepting or rejecting the Request.
   */
  public String getRedirectUrl() {
    return this.redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  /**
   * The shipping address provided by the accepting user if an address was requested.
   */
  public Address getAddressShipping() {
    return this.addressShipping;
  }

  public void setAddressShipping(Address addressShipping) {
    this.addressShipping = addressShipping;
  }

  /**
   * The billing address provided by the accepting user if an address was requested.
   */
  public Address getAddressBilling() {
    return this.addressBilling;
  }

  public void setAddressBilling(Address addressBilling) {
    this.addressBilling = addressBilling;
  }

  /**
   * The geolocation where the payment was done.
   */
  public Geolocation getGeolocation() {
    return this.geolocation;
  }

  public void setGeolocation(Geolocation geolocation) {
    this.geolocation = geolocation;
  }

  /**
   * Whether or not chat messages are allowed.
   */
  public Boolean getAllowChat() {
    return this.allowChat;
  }

  public void setAllowChat(Boolean allowChat) {
    this.allowChat = allowChat;
  }

}
