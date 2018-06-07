package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.Address;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.BunqId;
import com.bunq.sdk.model.generated.object.Geolocation;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.bunq.sdk.model.generated.object.Pointer;
import com.bunq.sdk.model.generated.object.RequestReferenceSplitTheBillAnchorObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

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
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/request-inquiry";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/request-inquiry/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/request-inquiry";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/request-inquiry/%s";

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
  public static final String FIELD_EVENT_ID = "event_id";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_PUT = "RequestInquiry";
  protected static final String OBJECT_TYPE_GET = "RequestInquiry";

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
  private LabelMonetaryAccount counterpartyAlias;

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

  /**
   * The reference to the object used for split the bill. Can be Payment, PaymentBatch,
   * ScheduleInstance, RequestResponse and MasterCardAction
   */
  @Expose
  @SerializedName("reference_split_the_bill")
  private RequestReferenceSplitTheBillAnchorObject referenceSplitTheBill;

  /**
   * The Amount requested to be paid by the person the RequestInquiry is sent to. Must be bigger
   * than 0.
   */
  @Expose
  @SerializedName("amount_inquired_field_for_request")
  private Amount amountInquiredFieldForRequest;

  /**
   * The Alias of the party we are requesting the money from. Can be an Alias of type EMAIL,
   * PHONE_NUMBER or IBAN. In case the EMAIL or PHONE_NUMBER Alias does not refer to a bunq
   * monetary account, 'allow_bunqme' needs to be 'true' in order to trigger the creation of a
   * bunq.me request. Otherwise no request inquiry will be sent.
   */
  @Expose
  @SerializedName("counterparty_alias_field_for_request")
  private Pointer counterpartyAliasFieldForRequest;

  /**
   * The description for the RequestInquiry. Maximum 9000 characters. Field is required but can be
   * an empty string.
   */
  @Expose
  @SerializedName("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The Attachments to attach to the RequestInquiry.
   */
  @Expose
  @SerializedName("attachment_field_for_request")
  private List<BunqId> attachmentFieldForRequest;

  /**
   * Optional data to be included with the RequestInquiry specific to the merchant. Has to be
   * unique for the same source MonetaryAccount.
   */
  @Expose
  @SerializedName("merchant_reference_field_for_request")
  private String merchantReferenceFieldForRequest;

  /**
   * The status of the RequestInquiry. Ignored in POST requests but can be used for revoking
   * (cancelling) the RequestInquiry by setting REVOKED with a PUT request.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The minimum age the user accepting the RequestInquiry must have. Defaults to not checking. If
   * set, must be between 12 and 100 inclusive.
   */
  @Expose
  @SerializedName("minimum_age_field_for_request")
  private Integer minimumAgeFieldForRequest;

  /**
   * Whether a billing and shipping address must be provided when paying the request. Possible
   * values are: BILLING, SHIPPING, BILLING_SHIPPING, NONE, OPTIONAL. Default is NONE.
   */
  @Expose
  @SerializedName("require_address_field_for_request")
  private String requireAddressFieldForRequest;

  /**
   * [DEPRECATED] Whether or not the accepting user can give an extra tip on top of the requested
   * Amount. Defaults to false.
   */
  @Expose
  @SerializedName("want_tip_field_for_request")
  private Boolean wantTipFieldForRequest;

  /**
   * [DEPRECATED] Whether or not the accepting user can choose to accept with a lower amount than
   * requested. Defaults to false.
   */
  @Expose
  @SerializedName("allow_amount_lower_field_for_request")
  private Boolean allowAmountLowerFieldForRequest;

  /**
   * [DEPRECATED] Whether or not the accepting user can choose to accept with a higher amount than
   * requested. Defaults to false.
   */
  @Expose
  @SerializedName("allow_amount_higher_field_for_request")
  private Boolean allowAmountHigherFieldForRequest;

  /**
   * Whether or not sending a bunq.me request is allowed.
   */
  @Expose
  @SerializedName("allow_bunqme_field_for_request")
  private Boolean allowBunqmeFieldForRequest;

  /**
   * The URL which the user is sent to after accepting or rejecting the Request.
   */
  @Expose
  @SerializedName("redirect_url_field_for_request")
  private String redirectUrlFieldForRequest;

  /**
   * The ID of the associated event if the request was made using 'split the bill'.
   */
  @Expose
  @SerializedName("event_id_field_for_request")
  private Integer eventIdFieldForRequest;

  public RequestInquiry() {
    this(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public RequestInquiry(Amount amountInquired) {
    this(amountInquired, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public RequestInquiry(Amount amountInquired, Pointer counterpartyAlias) {
    this(amountInquired, counterpartyAlias, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public RequestInquiry(Amount amountInquired, Pointer counterpartyAlias, String description) {
    this(amountInquired, counterpartyAlias, description, null, null, null, null, null, null, null, null, null, null, null);
  }

  public RequestInquiry(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme) {
    this(amountInquired, counterpartyAlias, description, allowBunqme, null, null, null, null, null, null, null, null, null, null);
  }

  public RequestInquiry(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme, List<BunqId> attachment) {
    this(amountInquired, counterpartyAlias, description, allowBunqme, attachment, null, null, null, null, null, null, null, null, null);
  }

  public RequestInquiry(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme, List<BunqId> attachment, String merchantReference) {
    this(amountInquired, counterpartyAlias, description, allowBunqme, attachment, merchantReference, null, null, null, null, null, null, null, null);
  }

  public RequestInquiry(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme, List<BunqId> attachment, String merchantReference, String status) {
    this(amountInquired, counterpartyAlias, description, allowBunqme, attachment, merchantReference, status, null, null, null, null, null, null, null);
  }

  public RequestInquiry(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme, List<BunqId> attachment, String merchantReference, String status, Integer minimumAge) {
    this(amountInquired, counterpartyAlias, description, allowBunqme, attachment, merchantReference, status, minimumAge, null, null, null, null, null, null);
  }

  public RequestInquiry(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme, List<BunqId> attachment, String merchantReference, String status, Integer minimumAge, String requireAddress) {
    this(amountInquired, counterpartyAlias, description, allowBunqme, attachment, merchantReference, status, minimumAge, requireAddress, null, null, null, null, null);
  }

  public RequestInquiry(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme, List<BunqId> attachment, String merchantReference, String status, Integer minimumAge, String requireAddress, Boolean wantTip) {
    this(amountInquired, counterpartyAlias, description, allowBunqme, attachment, merchantReference, status, minimumAge, requireAddress, wantTip, null, null, null, null);
  }

  public RequestInquiry(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme, List<BunqId> attachment, String merchantReference, String status, Integer minimumAge, String requireAddress, Boolean wantTip, Boolean allowAmountLower) {
    this(amountInquired, counterpartyAlias, description, allowBunqme, attachment, merchantReference, status, minimumAge, requireAddress, wantTip, allowAmountLower, null, null, null);
  }

  public RequestInquiry(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme, List<BunqId> attachment, String merchantReference, String status, Integer minimumAge, String requireAddress, Boolean wantTip, Boolean allowAmountLower, Boolean allowAmountHigher) {
    this(amountInquired, counterpartyAlias, description, allowBunqme, attachment, merchantReference, status, minimumAge, requireAddress, wantTip, allowAmountLower, allowAmountHigher, null, null);
  }

  public RequestInquiry(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme, List<BunqId> attachment, String merchantReference, String status, Integer minimumAge, String requireAddress, Boolean wantTip, Boolean allowAmountLower, Boolean allowAmountHigher, String redirectUrl) {
    this(amountInquired, counterpartyAlias, description, allowBunqme, attachment, merchantReference, status, minimumAge, requireAddress, wantTip, allowAmountLower, allowAmountHigher, redirectUrl, null);
  }

  public RequestInquiry(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme, List<BunqId> attachment, String merchantReference, String status, Integer minimumAge, String requireAddress, Boolean wantTip, Boolean allowAmountLower, Boolean allowAmountHigher, String redirectUrl, Integer eventId) {
    this.amountInquiredFieldForRequest = amountInquired;
    this.counterpartyAliasFieldForRequest = counterpartyAlias;
    this.descriptionFieldForRequest = description;
    this.attachmentFieldForRequest = attachment;
    this.merchantReferenceFieldForRequest = merchantReference;
    this.statusFieldForRequest = status;
    this.minimumAgeFieldForRequest = minimumAge;
    this.requireAddressFieldForRequest = requireAddress;
    this.wantTipFieldForRequest = wantTip;
    this.allowAmountLowerFieldForRequest = allowAmountLower;
    this.allowAmountHigherFieldForRequest = allowAmountHigher;
    this.allowBunqmeFieldForRequest = allowBunqme;
    this.redirectUrlFieldForRequest = redirectUrl;
    this.eventIdFieldForRequest = eventId;
  }

  /**
   * Create a new payment request.
   * @param amountInquired The Amount requested to be paid by the person the RequestInquiry is
   * sent to. Must be bigger than 0.
   * @param counterpartyAlias The Alias of the party we are requesting the money from. Can be an
   * Alias of type EMAIL, PHONE_NUMBER or IBAN. In case the EMAIL or PHONE_NUMBER Alias does not
   * refer to a bunq monetary account, 'allow_bunqme' needs to be 'true' in order to trigger the
   * creation of a bunq.me request. Otherwise no request inquiry will be sent.
   * @param description The description for the RequestInquiry. Maximum 9000 characters. Field is
   * required but can be an empty string.
   * @param allowBunqme Whether or not sending a bunq.me request is allowed.
   * @param attachment The Attachments to attach to the RequestInquiry.
   * @param merchantReference Optional data to be included with the RequestInquiry specific to the
   * merchant. Has to be unique for the same source MonetaryAccount.
   * @param status The status of the RequestInquiry. Ignored in POST requests but can be used for
   * revoking (cancelling) the RequestInquiry by setting REVOKED with a PUT request.
   * @param minimumAge The minimum age the user accepting the RequestInquiry must have. Defaults
   * to not checking. If set, must be between 12 and 100 inclusive.
   * @param requireAddress Whether a billing and shipping address must be provided when paying the
   * request. Possible values are: BILLING, SHIPPING, BILLING_SHIPPING, NONE, OPTIONAL. Default is
   * NONE.
   * @param wantTip [DEPRECATED] Whether or not the accepting user can give an extra tip on top of
   * the requested Amount. Defaults to false.
   * @param allowAmountLower [DEPRECATED] Whether or not the accepting user can choose to accept
   * with a lower amount than requested. Defaults to false.
   * @param allowAmountHigher [DEPRECATED] Whether or not the accepting user can choose to accept
   * with a higher amount than requested. Defaults to false.
   * @param redirectUrl The URL which the user is sent to after accepting or rejecting the
   * Request.
   * @param eventId The ID of the associated event if the request was made using 'split the bill'.
   */
  public static BunqResponse<Integer> create(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme, Integer monetaryAccountId, List<BunqId> attachment, String merchantReference, String status, Integer minimumAge, String requireAddress, Boolean wantTip, Boolean allowAmountLower, Boolean allowAmountHigher, String redirectUrl, Integer eventId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_AMOUNT_INQUIRED, amountInquired);
    requestMap.put(FIELD_COUNTERPARTY_ALIAS, counterpartyAlias);
    requestMap.put(FIELD_DESCRIPTION, description);
    requestMap.put(FIELD_ATTACHMENT, attachment);
    requestMap.put(FIELD_MERCHANT_REFERENCE, merchantReference);
    requestMap.put(FIELD_STATUS, status);
    requestMap.put(FIELD_MINIMUM_AGE, minimumAge);
    requestMap.put(FIELD_REQUIRE_ADDRESS, requireAddress);
    requestMap.put(FIELD_WANT_TIP, wantTip);
    requestMap.put(FIELD_ALLOW_AMOUNT_LOWER, allowAmountLower);
    requestMap.put(FIELD_ALLOW_AMOUNT_HIGHER, allowAmountHigher);
    requestMap.put(FIELD_ALLOW_BUNQME, allowBunqme);
    requestMap.put(FIELD_REDIRECT_URL, redirectUrl);
    requestMap.put(FIELD_EVENT_ID, eventId);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amountInquired) {
    return create(amountInquired, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amountInquired, Pointer counterpartyAlias) {
    return create(amountInquired, counterpartyAlias, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amountInquired, Pointer counterpartyAlias, String description) {
    return create(amountInquired, counterpartyAlias, description, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme) {
    return create(amountInquired, counterpartyAlias, description, allowBunqme, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme, Integer monetaryAccountId) {
    return create(amountInquired, counterpartyAlias, description, allowBunqme, monetaryAccountId, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme, Integer monetaryAccountId, List<BunqId> attachment) {
    return create(amountInquired, counterpartyAlias, description, allowBunqme, monetaryAccountId, attachment, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme, Integer monetaryAccountId, List<BunqId> attachment, String merchantReference) {
    return create(amountInquired, counterpartyAlias, description, allowBunqme, monetaryAccountId, attachment, merchantReference, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme, Integer monetaryAccountId, List<BunqId> attachment, String merchantReference, String status) {
    return create(amountInquired, counterpartyAlias, description, allowBunqme, monetaryAccountId, attachment, merchantReference, status, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme, Integer monetaryAccountId, List<BunqId> attachment, String merchantReference, String status, Integer minimumAge) {
    return create(amountInquired, counterpartyAlias, description, allowBunqme, monetaryAccountId, attachment, merchantReference, status, minimumAge, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme, Integer monetaryAccountId, List<BunqId> attachment, String merchantReference, String status, Integer minimumAge, String requireAddress) {
    return create(amountInquired, counterpartyAlias, description, allowBunqme, monetaryAccountId, attachment, merchantReference, status, minimumAge, requireAddress, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme, Integer monetaryAccountId, List<BunqId> attachment, String merchantReference, String status, Integer minimumAge, String requireAddress, Boolean wantTip) {
    return create(amountInquired, counterpartyAlias, description, allowBunqme, monetaryAccountId, attachment, merchantReference, status, minimumAge, requireAddress, wantTip, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme, Integer monetaryAccountId, List<BunqId> attachment, String merchantReference, String status, Integer minimumAge, String requireAddress, Boolean wantTip, Boolean allowAmountLower) {
    return create(amountInquired, counterpartyAlias, description, allowBunqme, monetaryAccountId, attachment, merchantReference, status, minimumAge, requireAddress, wantTip, allowAmountLower, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme, Integer monetaryAccountId, List<BunqId> attachment, String merchantReference, String status, Integer minimumAge, String requireAddress, Boolean wantTip, Boolean allowAmountLower, Boolean allowAmountHigher) {
    return create(amountInquired, counterpartyAlias, description, allowBunqme, monetaryAccountId, attachment, merchantReference, status, minimumAge, requireAddress, wantTip, allowAmountLower, allowAmountHigher, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme, Integer monetaryAccountId, List<BunqId> attachment, String merchantReference, String status, Integer minimumAge, String requireAddress, Boolean wantTip, Boolean allowAmountLower, Boolean allowAmountHigher, String redirectUrl) {
    return create(amountInquired, counterpartyAlias, description, allowBunqme, monetaryAccountId, attachment, merchantReference, status, minimumAge, requireAddress, wantTip, allowAmountLower, allowAmountHigher, redirectUrl, null, null);
  }

  public static BunqResponse<Integer> create(Amount amountInquired, Pointer counterpartyAlias, String description, Boolean allowBunqme, Integer monetaryAccountId, List<BunqId> attachment, String merchantReference, String status, Integer minimumAge, String requireAddress, Boolean wantTip, Boolean allowAmountLower, Boolean allowAmountHigher, String redirectUrl, Integer eventId) {
    return create(amountInquired, counterpartyAlias, description, allowBunqme, monetaryAccountId, attachment, merchantReference, status, minimumAge, requireAddress, wantTip, allowAmountLower, allowAmountHigher, redirectUrl, eventId, null);
  }

  /**
   * Revoke a request for payment, by updating the status to REVOKED.
   * @param status The status of the RequestInquiry. Ignored in POST requests but can be used for
   * revoking (cancelling) the RequestInquiry by setting REVOKED with a PUT request.
   */
  public static BunqResponse<RequestInquiry> update(Integer requestInquiryId, Integer monetaryAccountId, String status, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_STATUS, status);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestInquiryId), requestBytes, customHeaders);

    return fromJson(RequestInquiry.class, responseRaw, OBJECT_TYPE_PUT);
  }

  public static BunqResponse<RequestInquiry> update(Integer requestInquiryId) {
    return update(requestInquiryId, null, null, null);
  }

  public static BunqResponse<RequestInquiry> update(Integer requestInquiryId, Integer monetaryAccountId) {
    return update(requestInquiryId, monetaryAccountId, null, null);
  }

  public static BunqResponse<RequestInquiry> update(Integer requestInquiryId, Integer monetaryAccountId, String status) {
    return update(requestInquiryId, monetaryAccountId, status, null);
  }

  /**
   * Get all payment requests for a user's monetary account.
   */
  public static BunqResponse<List<RequestInquiry>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(RequestInquiry.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<RequestInquiry>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<RequestInquiry>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<RequestInquiry>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   * Get the details of a specific payment request, including its status.
   */
  public static BunqResponse<RequestInquiry> get(Integer requestInquiryId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestInquiryId), params, customHeaders);

    return fromJson(RequestInquiry.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<RequestInquiry> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<RequestInquiry> get(Integer requestInquiryId) {
    return get(requestInquiryId, null, null, null);
  }

  public static BunqResponse<RequestInquiry> get(Integer requestInquiryId, Integer monetaryAccountId) {
    return get(requestInquiryId, monetaryAccountId, null, null);
  }

  public static BunqResponse<RequestInquiry> get(Integer requestInquiryId, Integer monetaryAccountId, Map<String, String> params) {
    return get(requestInquiryId, monetaryAccountId, params, null);
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
  public LabelMonetaryAccount getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(LabelMonetaryAccount counterpartyAlias) {
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

  /**
   * The reference to the object used for split the bill. Can be Payment, PaymentBatch,
   * ScheduleInstance, RequestResponse and MasterCardAction
   */
  public RequestReferenceSplitTheBillAnchorObject getReferenceSplitTheBill() {
    return this.referenceSplitTheBill;
  }

  public void setReferenceSplitTheBill(RequestReferenceSplitTheBillAnchorObject referenceSplitTheBill) {
    this.referenceSplitTheBill = referenceSplitTheBill;
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

    if (this.timeResponded != null) {
      return false;
    }

    if (this.timeExpiry != null) {
      return false;
    }

    if (this.monetaryAccountId != null) {
      return false;
    }

    if (this.amountInquired != null) {
      return false;
    }

    if (this.amountResponded != null) {
      return false;
    }

    if (this.userAliasCreated != null) {
      return false;
    }

    if (this.userAliasRevoked != null) {
      return false;
    }

    if (this.counterpartyAlias != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.merchantReference != null) {
      return false;
    }

    if (this.attachment != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.batchId != null) {
      return false;
    }

    if (this.scheduledId != null) {
      return false;
    }

    if (this.minimumAge != null) {
      return false;
    }

    if (this.requireAddress != null) {
      return false;
    }

    if (this.bunqmeShareUrl != null) {
      return false;
    }

    if (this.redirectUrl != null) {
      return false;
    }

    if (this.addressShipping != null) {
      return false;
    }

    if (this.addressBilling != null) {
      return false;
    }

    if (this.geolocation != null) {
      return false;
    }

    if (this.allowChat != null) {
      return false;
    }

    if (this.referenceSplitTheBill != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static RequestInquiry fromJsonReader(JsonReader reader) {
    return fromJsonReader(RequestInquiry.class, reader);
  }

}
