package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.AttachmentMonetaryAccountPayment;
import com.bunq.sdk.model.generated.object.Geolocation;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.bunq.sdk.model.generated.object.PaymentArrivalExpected;
import com.bunq.sdk.model.generated.object.Pointer;
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
 * Using Payment, you can send payments to bunq and non-bunq users from your bunq
 * MonetaryAccounts. This can be done using bunq Aliases or IBAN Aliases. When transferring
 * money to other bunq MonetaryAccounts you can also refer to Attachments. These will be
 * received by the counter-party as part of the Payment. You can also retrieve a single Payment
 * or all executed Payments of a specific monetary account.
 */
public class Payment extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/payment";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/payment/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/payment";

  /**
   * Field constants.
   */
  public static final String FIELD_AMOUNT = "amount";
  public static final String FIELD_COUNTERPARTY_ALIAS = "counterparty_alias";
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_ATTACHMENT = "attachment";
  public static final String FIELD_MERCHANT_REFERENCE = "merchant_reference";
  public static final String FIELD_ALLOW_BUNQTO = "allow_bunqto";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "Payment";

  /**
   * The id of the created Payment.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp when the Payment was done.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp when the Payment was last updated (will be updated when chat messages are
   * received).
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The id of the MonetaryAccount the Payment was made to or from (depending on whether this is
   * an incoming or outgoing Payment).
   */
  @Expose
  @SerializedName("monetary_account_id")
  private Integer monetaryAccountId;

  /**
   * The Amount transferred by the Payment. Will be negative for outgoing Payments and positive
   * for incoming Payments (relative to the MonetaryAccount indicated by monetary_account_id).
   */
  @Expose
  @SerializedName("amount")
  private Amount amount;

  /**
   * The LabelMonetaryAccount containing the public information of 'this' (party) side of the
   * Payment.
   */
  @Expose
  @SerializedName("alias")
  private LabelMonetaryAccount alias;

  /**
   * The LabelMonetaryAccount containing the public information of the other (counterparty) side
   * of the Payment.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private LabelMonetaryAccount counterpartyAlias;

  /**
   * The description for the Payment. Maximum 140 characters for Payments to external IBANs, 9000
   * characters for Payments to only other bunq MonetaryAccounts.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The type of Payment, can be BUNQ, EBA_SCT, EBA_SDD, IDEAL, SWIFT or FIS (card).
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The sub-type of the Payment, can be PAYMENT, WITHDRAWAL, REVERSAL, REQUEST, BILLING, SCT, SDD
   * or NLO.
   */
  @Expose
  @SerializedName("sub_type")
  private String subType;

  /**
   * Information about the expected arrival of the payment.
   */
  @Expose
  @SerializedName("payment_arrival_expected")
  private PaymentArrivalExpected paymentArrivalExpected;

  /**
   * The status of the bunq.to payment.
   */
  @Expose
  @SerializedName("bunqto_status")
  private String bunqtoStatus;

  /**
   * The sub status of the bunq.to payment.
   */
  @Expose
  @SerializedName("bunqto_sub_status")
  private String bunqtoSubStatus;

  /**
   * The status of the bunq.to payment.
   */
  @Expose
  @SerializedName("bunqto_share_url")
  private String bunqtoShareUrl;

  /**
   * When bunq.to payment is about to expire.
   */
  @Expose
  @SerializedName("bunqto_expiry")
  private String bunqtoExpiry;

  /**
   * The timestamp of when the bunq.to payment was responded to.
   */
  @Expose
  @SerializedName("bunqto_time_responded")
  private String bunqtoTimeResponded;

  /**
   * The Attachments attached to the Payment.
   */
  @Expose
  @SerializedName("attachment")
  private List<AttachmentMonetaryAccountPayment> attachment;

  /**
   * Optional data included with the Payment specific to the merchant.
   */
  @Expose
  @SerializedName("merchant_reference")
  private String merchantReference;

  /**
   * The id of the PaymentBatch if this Payment was part of one.
   */
  @Expose
  @SerializedName("batch_id")
  private Integer batchId;

  /**
   * The id of the JobScheduled if the Payment was scheduled.
   */
  @Expose
  @SerializedName("scheduled_id")
  private Integer scheduledId;

  /**
   * A shipping Address provided with the Payment, currently unused.
   */
  @Expose
  @SerializedName("address_shipping")
  private Address addressShipping;

  /**
   * A billing Address provided with the Payment, currently unused.
   */
  @Expose
  @SerializedName("address_billing")
  private Address addressBilling;

  /**
   * The Geolocation where the Payment was done from.
   */
  @Expose
  @SerializedName("geolocation")
  private Geolocation geolocation;

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  @Expose
  @SerializedName("request_reference_split_the_bill")
  private List<RequestInquiryReference> requestReferenceSplitTheBill;

  /**
   * The new balance of the monetary account after the mutation.
   */
  @Expose
  @SerializedName("balance_after_mutation")
  private Amount balanceAfterMutation;

  /**
   * A reference to the PaymentAutoAllocateInstance if it exists.
   */
  @Expose
  @SerializedName("payment_auto_allocate_instance")
  private PaymentAutoAllocateInstance paymentAutoAllocateInstance;

  /**
   * A reference to the PaymentSuspendedOutgoing if it exists.
   */
  @Expose
  @SerializedName("payment_suspended_outgoing")
  private PaymentSuspendedOutgoing paymentSuspendedOutgoing;

  /**
   * The Amount to transfer with the Payment. Must be bigger than 0 and smaller than the
   * MonetaryAccount's balance.
   */
  @Expose
  @SerializedName("amount_field_for_request")
  private Amount amountFieldForRequest;

  /**
   * The Alias of the party we are transferring the money to. Can be an Alias of type EMAIL or
   * PHONE_NUMBER (for bunq MonetaryAccounts or bunq.to payments) or IBAN (for external bank
   * account).
   */
  @Expose
  @SerializedName("counterparty_alias_field_for_request")
  private Pointer counterpartyAliasFieldForRequest;

  /**
   * The description for the Payment. Maximum 140 characters for Payments to external IBANs, 9000
   * characters for Payments to only other bunq MonetaryAccounts. Field is required but can be an
   * empty string.
   */
  @Expose
  @SerializedName("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The Attachments to attach to the Payment.
   */
  @Expose
  @SerializedName("attachment_field_for_request")
  private List<AttachmentMonetaryAccountPayment> attachmentFieldForRequest;

  /**
   * Optional data to be included with the Payment specific to the merchant.
   */
  @Expose
  @SerializedName("merchant_reference_field_for_request")
  private String merchantReferenceFieldForRequest;

  /**
   * Whether or not sending a bunq.to payment is allowed.
   */
  @Expose
  @SerializedName("allow_bunqto_field_for_request")
  private Boolean allowBunqtoFieldForRequest;

  public Payment() {
  this(null, null, null, null, null, null);
  }

  public Payment(Amount amount) {
  this(amount, null, null, null, null, null);
  }

  public Payment(Amount amount, Pointer counterpartyAlias) {
  this(amount, counterpartyAlias, null, null, null, null);
  }

  public Payment(Amount amount, Pointer counterpartyAlias, String description) {
  this(amount, counterpartyAlias, description, null, null, null);
  }

  public Payment(Amount amount, Pointer counterpartyAlias, String description, List<AttachmentMonetaryAccountPayment> attachment) {
  this(amount, counterpartyAlias, description, attachment, null, null);
  }

  public Payment(Amount amount, Pointer counterpartyAlias, String description, List<AttachmentMonetaryAccountPayment> attachment, String merchantReference) {
  this(amount, counterpartyAlias, description, attachment, merchantReference, null);
  }

  public Payment(Amount amount, Pointer counterpartyAlias, String description, List<AttachmentMonetaryAccountPayment> attachment, String merchantReference, Boolean allowBunqto) {
    this.amountFieldForRequest = amount;
    this.counterpartyAliasFieldForRequest = counterpartyAlias;
    this.descriptionFieldForRequest = description;
    this.attachmentFieldForRequest = attachment;
    this.merchantReferenceFieldForRequest = merchantReference;
    this.allowBunqtoFieldForRequest = allowBunqto;
  }  /**
   * Create a new Payment.
   * @param amount The Amount to transfer with the Payment. Must be bigger than 0 and smaller than
   * the MonetaryAccount's balance.
   * @param counterpartyAlias The Alias of the party we are transferring the money to. Can be an
   * Alias of type EMAIL or PHONE_NUMBER (for bunq MonetaryAccounts or bunq.to payments) or IBAN
   * (for external bank account).
   * @param description The description for the Payment. Maximum 140 characters for Payments to
   * external IBANs, 9000 characters for Payments to only other bunq MonetaryAccounts. Field is
   * required but can be an empty string.
   * @param attachment The Attachments to attach to the Payment.
   * @param merchantReference Optional data to be included with the Payment specific to the
   * merchant.
   * @param allowBunqto Whether or not sending a bunq.to payment is allowed.
   */
  public static BunqResponse<Integer> create(Amount amount, Pointer counterpartyAlias, String description, Integer monetaryAccountId, List<AttachmentMonetaryAccountPayment> attachment, String merchantReference, Boolean allowBunqto, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_AMOUNT, amount);
requestMap.put(FIELD_COUNTERPARTY_ALIAS, counterpartyAlias);
requestMap.put(FIELD_DESCRIPTION, description);
requestMap.put(FIELD_ATTACHMENT, attachment);
requestMap.put(FIELD_MERCHANT_REFERENCE, merchantReference);
requestMap.put(FIELD_ALLOW_BUNQTO, allowBunqto);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amount) {
    return create(amount, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amount, Pointer counterpartyAlias) {
    return create(amount, counterpartyAlias, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amount, Pointer counterpartyAlias, String description) {
    return create(amount, counterpartyAlias, description, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amount, Pointer counterpartyAlias, String description, Integer monetaryAccountId) {
    return create(amount, counterpartyAlias, description, monetaryAccountId, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amount, Pointer counterpartyAlias, String description, Integer monetaryAccountId, List<AttachmentMonetaryAccountPayment> attachment) {
    return create(amount, counterpartyAlias, description, monetaryAccountId, attachment, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amount, Pointer counterpartyAlias, String description, Integer monetaryAccountId, List<AttachmentMonetaryAccountPayment> attachment, String merchantReference) {
    return create(amount, counterpartyAlias, description, monetaryAccountId, attachment, merchantReference, null, null);
  }

  public static BunqResponse<Integer> create(Amount amount, Pointer counterpartyAlias, String description, Integer monetaryAccountId, List<AttachmentMonetaryAccountPayment> attachment, String merchantReference, Boolean allowBunqto) {
    return create(amount, counterpartyAlias, description, monetaryAccountId, attachment, merchantReference, allowBunqto, null);
  }

  /**
   * Get a specific previous Payment.
   */
  public static BunqResponse<Payment> get(Integer paymentId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), paymentId), params, customHeaders);

    return fromJson(Payment.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<Payment> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<Payment> get(Integer paymentId) {
    return get(paymentId, null, null, null);
  }

  public static BunqResponse<Payment> get(Integer paymentId, Integer monetaryAccountId) {
    return get(paymentId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Payment> get(Integer paymentId, Integer monetaryAccountId, Map<String, String> params) {
    return get(paymentId, monetaryAccountId, params, null);
  }

  /**
   * Get a listing of all Payments performed on a given MonetaryAccount (incoming and outgoing).
   */
  public static BunqResponse<List<Payment>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(Payment.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<Payment>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<Payment>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<Payment>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   * The id of the created Payment.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp when the Payment was done.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp when the Payment was last updated (will be updated when chat messages are
   * received).
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The id of the MonetaryAccount the Payment was made to or from (depending on whether this is
   * an incoming or outgoing Payment).
   */
  public Integer getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(Integer monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   * The Amount transferred by the Payment. Will be negative for outgoing Payments and positive
   * for incoming Payments (relative to the MonetaryAccount indicated by monetary_account_id).
   */
  public Amount getAmount() {
    return this.amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  /**
   * The LabelMonetaryAccount containing the public information of 'this' (party) side of the
   * Payment.
   */
  public LabelMonetaryAccount getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccount alias) {
    this.alias = alias;
  }

  /**
   * The LabelMonetaryAccount containing the public information of the other (counterparty) side
   * of the Payment.
   */
  public LabelMonetaryAccount getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(LabelMonetaryAccount counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * The description for the Payment. Maximum 140 characters for Payments to external IBANs, 9000
   * characters for Payments to only other bunq MonetaryAccounts.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The type of Payment, can be BUNQ, EBA_SCT, EBA_SDD, IDEAL, SWIFT or FIS (card).
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The sub-type of the Payment, can be PAYMENT, WITHDRAWAL, REVERSAL, REQUEST, BILLING, SCT, SDD
   * or NLO.
   */
  public String getSubType() {
    return this.subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

  /**
   * Information about the expected arrival of the payment.
   */
  public PaymentArrivalExpected getPaymentArrivalExpected() {
    return this.paymentArrivalExpected;
  }

  public void setPaymentArrivalExpected(PaymentArrivalExpected paymentArrivalExpected) {
    this.paymentArrivalExpected = paymentArrivalExpected;
  }

  /**
   * The status of the bunq.to payment.
   */
  public String getBunqtoStatus() {
    return this.bunqtoStatus;
  }

  public void setBunqtoStatus(String bunqtoStatus) {
    this.bunqtoStatus = bunqtoStatus;
  }

  /**
   * The sub status of the bunq.to payment.
   */
  public String getBunqtoSubStatus() {
    return this.bunqtoSubStatus;
  }

  public void setBunqtoSubStatus(String bunqtoSubStatus) {
    this.bunqtoSubStatus = bunqtoSubStatus;
  }

  /**
   * The status of the bunq.to payment.
   */
  public String getBunqtoShareUrl() {
    return this.bunqtoShareUrl;
  }

  public void setBunqtoShareUrl(String bunqtoShareUrl) {
    this.bunqtoShareUrl = bunqtoShareUrl;
  }

  /**
   * When bunq.to payment is about to expire.
   */
  public String getBunqtoExpiry() {
    return this.bunqtoExpiry;
  }

  public void setBunqtoExpiry(String bunqtoExpiry) {
    this.bunqtoExpiry = bunqtoExpiry;
  }

  /**
   * The timestamp of when the bunq.to payment was responded to.
   */
  public String getBunqtoTimeResponded() {
    return this.bunqtoTimeResponded;
  }

  public void setBunqtoTimeResponded(String bunqtoTimeResponded) {
    this.bunqtoTimeResponded = bunqtoTimeResponded;
  }

  /**
   * The Attachments attached to the Payment.
   */
  public List<AttachmentMonetaryAccountPayment> getAttachment() {
    return this.attachment;
  }

  public void setAttachment(List<AttachmentMonetaryAccountPayment> attachment) {
    this.attachment = attachment;
  }

  /**
   * Optional data included with the Payment specific to the merchant.
   */
  public String getMerchantReference() {
    return this.merchantReference;
  }

  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }

  /**
   * The id of the PaymentBatch if this Payment was part of one.
   */
  public Integer getBatchId() {
    return this.batchId;
  }

  public void setBatchId(Integer batchId) {
    this.batchId = batchId;
  }

  /**
   * The id of the JobScheduled if the Payment was scheduled.
   */
  public Integer getScheduledId() {
    return this.scheduledId;
  }

  public void setScheduledId(Integer scheduledId) {
    this.scheduledId = scheduledId;
  }

  /**
   * A shipping Address provided with the Payment, currently unused.
   */
  public Address getAddressShipping() {
    return this.addressShipping;
  }

  public void setAddressShipping(Address addressShipping) {
    this.addressShipping = addressShipping;
  }

  /**
   * A billing Address provided with the Payment, currently unused.
   */
  public Address getAddressBilling() {
    return this.addressBilling;
  }

  public void setAddressBilling(Address addressBilling) {
    this.addressBilling = addressBilling;
  }

  /**
   * The Geolocation where the Payment was done from.
   */
  public Geolocation getGeolocation() {
    return this.geolocation;
  }

  public void setGeolocation(Geolocation geolocation) {
    this.geolocation = geolocation;
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
   * The new balance of the monetary account after the mutation.
   */
  public Amount getBalanceAfterMutation() {
    return this.balanceAfterMutation;
  }

  public void setBalanceAfterMutation(Amount balanceAfterMutation) {
    this.balanceAfterMutation = balanceAfterMutation;
  }

  /**
   * A reference to the PaymentAutoAllocateInstance if it exists.
   */
  public PaymentAutoAllocateInstance getPaymentAutoAllocateInstance() {
    return this.paymentAutoAllocateInstance;
  }

  public void setPaymentAutoAllocateInstance(PaymentAutoAllocateInstance paymentAutoAllocateInstance) {
    this.paymentAutoAllocateInstance = paymentAutoAllocateInstance;
  }

  /**
   * A reference to the PaymentSuspendedOutgoing if it exists.
   */
  public PaymentSuspendedOutgoing getPaymentSuspendedOutgoing() {
    return this.paymentSuspendedOutgoing;
  }

  public void setPaymentSuspendedOutgoing(PaymentSuspendedOutgoing paymentSuspendedOutgoing) {
    this.paymentSuspendedOutgoing = paymentSuspendedOutgoing;
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

    if (this.monetaryAccountId != null) {
      return false;
    }

    if (this.amount != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.counterpartyAlias != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.type != null) {
      return false;
    }

    if (this.subType != null) {
      return false;
    }

    if (this.paymentArrivalExpected != null) {
      return false;
    }

    if (this.bunqtoStatus != null) {
      return false;
    }

    if (this.bunqtoSubStatus != null) {
      return false;
    }

    if (this.bunqtoShareUrl != null) {
      return false;
    }

    if (this.bunqtoExpiry != null) {
      return false;
    }

    if (this.bunqtoTimeResponded != null) {
      return false;
    }

    if (this.attachment != null) {
      return false;
    }

    if (this.merchantReference != null) {
      return false;
    }

    if (this.batchId != null) {
      return false;
    }

    if (this.scheduledId != null) {
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

    if (this.requestReferenceSplitTheBill != null) {
      return false;
    }

    if (this.balanceAfterMutation != null) {
      return false;
    }

    if (this.paymentAutoAllocateInstance != null) {
      return false;
    }

    if (this.paymentSuspendedOutgoing != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static Payment fromJsonReader(JsonReader reader) {
    return fromJsonReader(Payment.class, reader);
  }

}
