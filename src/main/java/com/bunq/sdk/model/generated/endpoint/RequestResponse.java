package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Address;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Attachment;
import com.bunq.sdk.model.generated.object.Geolocation;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.bunq.sdk.model.generated.object.RequestInquiryReference;
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
 * A RequestResponse is what a user on the other side of a RequestInquiry gets when he is sent
 * one. So a RequestInquiry is the initiator and visible for the user that sent it and that
 * wants to receive the money. A RequestResponse is what the other side sees, i.e. the user that
 * pays the money to accept the request. The content is almost identical.
 */
public class RequestResponse extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/request-response/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/request-response";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/request-response/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_AMOUNT_RESPONDED = "amount_responded";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_ADDRESS_SHIPPING = "address_shipping";
  public static final String FIELD_ADDRESS_BILLING = "address_billing";
  public static final String FIELD_CURRENCY_CONVERSION_QUOTE_ID = "currency_conversion_quote_id";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_PUT = "RequestResponse";
  protected static final String OBJECT_TYPE_GET = "RequestResponse";

  /**
   * The id of the Request Response.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp when the Request Response was created.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp when the Request Response was last updated (will be updated when chat messages
   * are received).
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The timestamp of when the RequestResponse was responded to.
   */
  @Expose
  @SerializedName("time_responded")
  private String timeResponded;

  /**
   * The timestamp of when the RequestResponse expired or will expire.
   */
  @Expose
  @SerializedName("time_expiry")
  private String timeExpiry;

  /**
   * The timestamp of when a refund request for the RequestResponse was claimed.
   */
  @Expose
  @SerializedName("time_refund_requested")
  private String timeRefundRequested;

  /**
   * The timestamp of when the RequestResponse was refunded.
   */
  @Expose
  @SerializedName("time_refunded")
  private String timeRefunded;

  /**
   * The label of the user that requested the refund.
   */
  @Expose
  @SerializedName("user_refund_requested")
  private LabelUser userRefundRequested;

  /**
   * The id of the MonetaryAccount the RequestResponse was received on.
   */
  @Expose
  @SerializedName("monetary_account_id")
  private Integer monetaryAccountId;

  /**
   * The requested Amount.
   */
  @Expose
  @SerializedName("amount_inquired")
  private Amount amountInquired;

  /**
   * The Amount the RequestResponse was accepted with.
   */
  @Expose
  @SerializedName("amount_responded")
  private Amount amountResponded;

  /**
   * The status of the RequestResponse. Can be ACCEPTED, PENDING, REJECTED, REFUND_REQUESTED,
   * REFUNDED or REVOKED.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The description for the RequestResponse provided by the requesting party. Maximum 9000
   * characters.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The LabelMonetaryAccount with the public information of the MonetaryAccount this
   * RequestResponse was received on.
   */
  @Expose
  @SerializedName("alias")
  private LabelMonetaryAccount alias;

  /**
   * The LabelMonetaryAccount with the public information of the MonetaryAccount that is
   * requesting money with this RequestResponse.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private LabelMonetaryAccount counterpartyAlias;

  /**
   * The Attachments attached to the RequestResponse.
   */
  @Expose
  @SerializedName("attachment")
  private List<Attachment> attachment;

  /**
   * The minimum age the user accepting the RequestResponse must have.
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
   * The Geolocation where the RequestResponse was created.
   */
  @Expose
  @SerializedName("geolocation")
  private Geolocation geolocation;

  /**
   * The type of the RequestInquiry. Can be DIRECT_DEBIT, DIRECT_DEBIT_B2B, IDEAL, SOFORT or
   * INTERNAL.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The subtype of the RequestInquiry. Can be ONCE or RECURRING for DIRECT_DEBIT RequestInquiries
   * and NONE for all other.
   */
  @Expose
  @SerializedName("sub_type")
  private String subType;

  /**
   * The URL which the user is sent to after accepting or rejecting the Request.
   */
  @Expose
  @SerializedName("redirect_url")
  private String redirectUrl;

  /**
   * The billing address provided by the accepting user if an address was requested.
   */
  @Expose
  @SerializedName("address_billing")
  private Address addressBilling;

  /**
   * The shipping address provided by the accepting user if an address was requested.
   */
  @Expose
  @SerializedName("address_shipping")
  private Address addressShipping;

  /**
   * The credit scheme id provided by the counterparty for DIRECT_DEBIT inquiries.
   */
  @Expose
  @SerializedName("credit_scheme_identifier")
  private String creditSchemeIdentifier;

  /**
   * The mandate id provided by the counterparty for DIRECT_DEBIT inquiries.
   */
  @Expose
  @SerializedName("mandate_identifier")
  private String mandateIdentifier;

  /**
   * Recommended registration action after IdealIssuerTransaction from iDEAL issuer transaction.
   */
  @Expose
  @SerializedName("registration_action")
  private String registrationAction;

  /**
   * The whitelist id for this action or null.
   */
  @Expose
  @SerializedName("eligible_whitelist_id")
  private Integer eligibleWhitelistId;

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  @Expose
  @SerializedName("request_reference_split_the_bill")
  private List<RequestInquiryReference> requestReferenceSplitTheBill;

  /**
   * The ID of the latest event for the request.
   */
  @Expose
  @SerializedName("event_id")
  private Integer eventId;

  /**
   * The ID of the monetary account this user prefers to pay the request from.
   */
  @Expose
  @SerializedName("monetary_account_preferred_id")
  private Integer monetaryAccountPreferredId;

  /**
   * The Amount the user decides to pay.
   */
  @Expose
  @SerializedName("amount_responded_field_for_request")
  private Amount amountRespondedFieldForRequest;

  /**
   * The responding status of the RequestResponse. Can be ACCEPTED or REJECTED.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The shipping Address to return to the user who created the RequestInquiry. Should only be
   * provided if 'require_address' is set to SHIPPING, BILLING_SHIPPING or OPTIONAL.
   */
  @Expose
  @SerializedName("address_shipping_field_for_request")
  private Address addressShippingFieldForRequest;

  /**
   * The billing Address to return to the user who created the RequestInquiry. Should only be
   * provided if 'require_address' is set to BILLING, BILLING_SHIPPING or OPTIONAL.
   */
  @Expose
  @SerializedName("address_billing_field_for_request")
  private Address addressBillingFieldForRequest;

  /**
   * When the request is accepted on a monetary account with a different currency, a quote is
   * expected to convert.
   */
  @Expose
  @SerializedName("currency_conversion_quote_id_field_for_request")
  private Integer currencyConversionQuoteIdFieldForRequest;

  public RequestResponse() {
  this(null, null, null, null, null);
  }

  public RequestResponse(String status) {
  this(status, null, null, null, null);
  }

  public RequestResponse(String status, Amount amountResponded) {
  this(status, amountResponded, null, null, null);
  }

  public RequestResponse(String status, Amount amountResponded, Address addressShipping) {
  this(status, amountResponded, addressShipping, null, null);
  }

  public RequestResponse(String status, Amount amountResponded, Address addressShipping, Address addressBilling) {
  this(status, amountResponded, addressShipping, addressBilling, null);
  }

  public RequestResponse(String status, Amount amountResponded, Address addressShipping, Address addressBilling, Integer currencyConversionQuoteId) {
    this.amountRespondedFieldForRequest = amountResponded;
    this.statusFieldForRequest = status;
    this.addressShippingFieldForRequest = addressShipping;
    this.addressBillingFieldForRequest = addressBilling;
    this.currencyConversionQuoteIdFieldForRequest = currencyConversionQuoteId;
  }  /**
   * Update the status to accept or reject the RequestResponse.
   * @param amountResponded The Amount the user decides to pay.
   * @param status The responding status of the RequestResponse. Can be ACCEPTED or REJECTED.
   * @param addressShipping The shipping Address to return to the user who created the
   * RequestInquiry. Should only be provided if 'require_address' is set to SHIPPING,
   * BILLING_SHIPPING or OPTIONAL.
   * @param addressBilling The billing Address to return to the user who created the
   * RequestInquiry. Should only be provided if 'require_address' is set to BILLING,
   * BILLING_SHIPPING or OPTIONAL.
   * @param currencyConversionQuoteId When the request is accepted on a monetary account with a
   * different currency, a quote is expected to convert.
   */
  public static BunqResponse<RequestResponse> update(Integer requestResponseId, Integer monetaryAccountId, Amount amountResponded, String status, Address addressShipping, Address addressBilling, Integer currencyConversionQuoteId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_AMOUNT_RESPONDED, amountResponded);
requestMap.put(FIELD_STATUS, status);
requestMap.put(FIELD_ADDRESS_SHIPPING, addressShipping);
requestMap.put(FIELD_ADDRESS_BILLING, addressBilling);
requestMap.put(FIELD_CURRENCY_CONVERSION_QUOTE_ID, currencyConversionQuoteId);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestResponseId), requestBytes, customHeaders);

    return fromJson(RequestResponse.class, responseRaw, OBJECT_TYPE_PUT);
  }

  public static BunqResponse<RequestResponse> update(Integer requestResponseId) {
    return update(requestResponseId, null, null, null, null, null, null, null);
  }

  public static BunqResponse<RequestResponse> update(Integer requestResponseId, Integer monetaryAccountId) {
    return update(requestResponseId, monetaryAccountId, null, null, null, null, null, null);
  }

  public static BunqResponse<RequestResponse> update(Integer requestResponseId, Integer monetaryAccountId, Amount amountResponded) {
    return update(requestResponseId, monetaryAccountId, amountResponded, null, null, null, null, null);
  }

  public static BunqResponse<RequestResponse> update(Integer requestResponseId, Integer monetaryAccountId, Amount amountResponded, String status) {
    return update(requestResponseId, monetaryAccountId, amountResponded, status, null, null, null, null);
  }

  public static BunqResponse<RequestResponse> update(Integer requestResponseId, Integer monetaryAccountId, Amount amountResponded, String status, Address addressShipping) {
    return update(requestResponseId, monetaryAccountId, amountResponded, status, addressShipping, null, null, null);
  }

  public static BunqResponse<RequestResponse> update(Integer requestResponseId, Integer monetaryAccountId, Amount amountResponded, String status, Address addressShipping, Address addressBilling) {
    return update(requestResponseId, monetaryAccountId, amountResponded, status, addressShipping, addressBilling, null, null);
  }

  public static BunqResponse<RequestResponse> update(Integer requestResponseId, Integer monetaryAccountId, Amount amountResponded, String status, Address addressShipping, Address addressBilling, Integer currencyConversionQuoteId) {
    return update(requestResponseId, monetaryAccountId, amountResponded, status, addressShipping, addressBilling, currencyConversionQuoteId, null);
  }

  /**
   * Get all RequestResponses for a MonetaryAccount.
   */
  public static BunqResponse<List<RequestResponse>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(RequestResponse.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<RequestResponse>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<RequestResponse>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<RequestResponse>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   * Get the details for a specific existing RequestResponse.
   */
  public static BunqResponse<RequestResponse> get(Integer requestResponseId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestResponseId), params, customHeaders);

    return fromJson(RequestResponse.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<RequestResponse> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<RequestResponse> get(Integer requestResponseId) {
    return get(requestResponseId, null, null, null);
  }

  public static BunqResponse<RequestResponse> get(Integer requestResponseId, Integer monetaryAccountId) {
    return get(requestResponseId, monetaryAccountId, null, null);
  }

  public static BunqResponse<RequestResponse> get(Integer requestResponseId, Integer monetaryAccountId, Map<String, String> params) {
    return get(requestResponseId, monetaryAccountId, params, null);
  }

  /**
   * The id of the Request Response.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp when the Request Response was created.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp when the Request Response was last updated (will be updated when chat messages
   * are received).
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The timestamp of when the RequestResponse was responded to.
   */
  public String getTimeResponded() {
    return this.timeResponded;
  }

  public void setTimeResponded(String timeResponded) {
    this.timeResponded = timeResponded;
  }

  /**
   * The timestamp of when the RequestResponse expired or will expire.
   */
  public String getTimeExpiry() {
    return this.timeExpiry;
  }

  public void setTimeExpiry(String timeExpiry) {
    this.timeExpiry = timeExpiry;
  }

  /**
   * The timestamp of when a refund request for the RequestResponse was claimed.
   */
  public String getTimeRefundRequested() {
    return this.timeRefundRequested;
  }

  public void setTimeRefundRequested(String timeRefundRequested) {
    this.timeRefundRequested = timeRefundRequested;
  }

  /**
   * The timestamp of when the RequestResponse was refunded.
   */
  public String getTimeRefunded() {
    return this.timeRefunded;
  }

  public void setTimeRefunded(String timeRefunded) {
    this.timeRefunded = timeRefunded;
  }

  /**
   * The label of the user that requested the refund.
   */
  public LabelUser getUserRefundRequested() {
    return this.userRefundRequested;
  }

  public void setUserRefundRequested(LabelUser userRefundRequested) {
    this.userRefundRequested = userRefundRequested;
  }

  /**
   * The id of the MonetaryAccount the RequestResponse was received on.
   */
  public Integer getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(Integer monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   * The requested Amount.
   */
  public Amount getAmountInquired() {
    return this.amountInquired;
  }

  public void setAmountInquired(Amount amountInquired) {
    this.amountInquired = amountInquired;
  }

  /**
   * The Amount the RequestResponse was accepted with.
   */
  public Amount getAmountResponded() {
    return this.amountResponded;
  }

  public void setAmountResponded(Amount amountResponded) {
    this.amountResponded = amountResponded;
  }

  /**
   * The status of the RequestResponse. Can be ACCEPTED, PENDING, REJECTED, REFUND_REQUESTED,
   * REFUNDED or REVOKED.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The description for the RequestResponse provided by the requesting party. Maximum 9000
   * characters.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The LabelMonetaryAccount with the public information of the MonetaryAccount this
   * RequestResponse was received on.
   */
  public LabelMonetaryAccount getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccount alias) {
    this.alias = alias;
  }

  /**
   * The LabelMonetaryAccount with the public information of the MonetaryAccount that is
   * requesting money with this RequestResponse.
   */
  public LabelMonetaryAccount getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(LabelMonetaryAccount counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * The Attachments attached to the RequestResponse.
   */
  public List<Attachment> getAttachment() {
    return this.attachment;
  }

  public void setAttachment(List<Attachment> attachment) {
    this.attachment = attachment;
  }

  /**
   * The minimum age the user accepting the RequestResponse must have.
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
   * The Geolocation where the RequestResponse was created.
   */
  public Geolocation getGeolocation() {
    return this.geolocation;
  }

  public void setGeolocation(Geolocation geolocation) {
    this.geolocation = geolocation;
  }

  /**
   * The type of the RequestInquiry. Can be DIRECT_DEBIT, DIRECT_DEBIT_B2B, IDEAL, SOFORT or
   * INTERNAL.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The subtype of the RequestInquiry. Can be ONCE or RECURRING for DIRECT_DEBIT RequestInquiries
   * and NONE for all other.
   */
  public String getSubType() {
    return this.subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
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
   * The billing address provided by the accepting user if an address was requested.
   */
  public Address getAddressBilling() {
    return this.addressBilling;
  }

  public void setAddressBilling(Address addressBilling) {
    this.addressBilling = addressBilling;
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
   * The credit scheme id provided by the counterparty for DIRECT_DEBIT inquiries.
   */
  public String getCreditSchemeIdentifier() {
    return this.creditSchemeIdentifier;
  }

  public void setCreditSchemeIdentifier(String creditSchemeIdentifier) {
    this.creditSchemeIdentifier = creditSchemeIdentifier;
  }

  /**
   * The mandate id provided by the counterparty for DIRECT_DEBIT inquiries.
   */
  public String getMandateIdentifier() {
    return this.mandateIdentifier;
  }

  public void setMandateIdentifier(String mandateIdentifier) {
    this.mandateIdentifier = mandateIdentifier;
  }

  /**
   * Recommended registration action after IdealIssuerTransaction from iDEAL issuer transaction.
   */
  public String getRegistrationAction() {
    return this.registrationAction;
  }

  public void setRegistrationAction(String registrationAction) {
    this.registrationAction = registrationAction;
  }

  /**
   * The whitelist id for this action or null.
   */
  public Integer getEligibleWhitelistId() {
    return this.eligibleWhitelistId;
  }

  public void setEligibleWhitelistId(Integer eligibleWhitelistId) {
    this.eligibleWhitelistId = eligibleWhitelistId;
  }

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  public List<RequestInquiryReference> getRequestReferenceSplitTheBill() {
    return this.requestReferenceSplitTheBill;
  }

  public void setRequestReferenceSplitTheBill(List<RequestInquiryReference> requestReferenceSplitTheBill) {
    this.requestReferenceSplitTheBill = requestReferenceSplitTheBill;
  }

  /**
   * The ID of the latest event for the request.
   */
  public Integer getEventId() {
    return this.eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  /**
   * The ID of the monetary account this user prefers to pay the request from.
   */
  public Integer getMonetaryAccountPreferredId() {
    return this.monetaryAccountPreferredId;
  }

  public void setMonetaryAccountPreferredId(Integer monetaryAccountPreferredId) {
    this.monetaryAccountPreferredId = monetaryAccountPreferredId;
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

    if (this.timeRefundRequested != null) {
      return false;
    }

    if (this.timeRefunded != null) {
      return false;
    }

    if (this.userRefundRequested != null) {
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

    if (this.status != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.counterpartyAlias != null) {
      return false;
    }

    if (this.attachment != null) {
      return false;
    }

    if (this.minimumAge != null) {
      return false;
    }

    if (this.requireAddress != null) {
      return false;
    }

    if (this.geolocation != null) {
      return false;
    }

    if (this.type != null) {
      return false;
    }

    if (this.subType != null) {
      return false;
    }

    if (this.redirectUrl != null) {
      return false;
    }

    if (this.addressBilling != null) {
      return false;
    }

    if (this.addressShipping != null) {
      return false;
    }

    if (this.creditSchemeIdentifier != null) {
      return false;
    }

    if (this.mandateIdentifier != null) {
      return false;
    }

    if (this.registrationAction != null) {
      return false;
    }

    if (this.eligibleWhitelistId != null) {
      return false;
    }

    if (this.requestReferenceSplitTheBill != null) {
      return false;
    }

    if (this.eventId != null) {
      return false;
    }

    if (this.monetaryAccountPreferredId != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static RequestResponse fromJsonReader(JsonReader reader) {
    return fromJsonReader(RequestResponse.class, reader);
  }

}
