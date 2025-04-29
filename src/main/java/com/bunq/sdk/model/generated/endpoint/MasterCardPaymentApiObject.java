package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AddressObject;
import com.bunq.sdk.model.generated.object.AmountObject;
import com.bunq.sdk.model.generated.object.AttachmentMonetaryAccountPaymentObject;
import com.bunq.sdk.model.generated.object.GeolocationObject;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccountObject;
import com.bunq.sdk.model.generated.object.PaymentArrivalExpectedObject;
import com.bunq.sdk.model.generated.object.PaymentFeeObject;
import com.bunq.sdk.model.generated.object.RequestInquiryReferenceObject;
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
 * MasterCard transaction view.
 */
public class MasterCardPaymentApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/mastercard-action/%s/payment";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "Payment";

  /**
   * The id of the Payment.
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
  private AmountObject amount;

  /**
   * The LabelMonetaryAccount containing the public information of 'this' (party) side of the
   * Payment.
   */
  @Expose
  @SerializedName("alias")
  private LabelMonetaryAccountObject alias;

  /**
   * The LabelMonetaryAccount containing the public information of the other (counterparty) side
   * of the Payment.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private LabelMonetaryAccountObject counterpartyAlias;

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
  private PaymentArrivalExpectedObject paymentArrivalExpected;

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
  private List<AttachmentMonetaryAccountPaymentObject> attachment;

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
  private AddressObject addressShipping;

  /**
   * A billing Address provided with the Payment, currently unused.
   */
  @Expose
  @SerializedName("address_billing")
  private AddressObject addressBilling;

  /**
   * The Geolocation where the Payment was done from.
   */
  @Expose
  @SerializedName("geolocation")
  private GeolocationObject geolocation;

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  @Expose
  @SerializedName("request_reference_split_the_bill")
  private List<RequestInquiryReferenceObject> requestReferenceSplitTheBill;

  /**
   * The new balance of the monetary account after the mutation.
   */
  @Expose
  @SerializedName("balance_after_mutation")
  private AmountObject balanceAfterMutation;

  /**
   * A reference to the PaymentAutoAllocateInstance if it exists.
   */
  @Expose
  @SerializedName("payment_auto_allocate_instance")
  private PaymentAutoAllocateInstanceApiObject paymentAutoAllocateInstance;

  /**
   * A reference to the PaymentSuspendedOutgoing if it exists.
   */
  @Expose
  @SerializedName("payment_suspended_outgoing")
  private PaymentSuspendedOutgoingApiObject paymentSuspendedOutgoing;

  /**
   * Incurred fee for the payment.
   */
  @Expose
  @SerializedName("payment_fee")
  private PaymentFeeObject paymentFee;

  /**
   */
  public static BunqResponse<List<MasterCardPaymentApiObject>> list(Integer mastercardActionId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), mastercardActionId), params, customHeaders);

    return fromJsonList(MasterCardPaymentApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<MasterCardPaymentApiObject>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<MasterCardPaymentApiObject>> list(Integer mastercardActionId) {
    return list(mastercardActionId, null, null, null);
  }

  public static BunqResponse<List<MasterCardPaymentApiObject>> list(Integer mastercardActionId, Integer monetaryAccountId) {
    return list(mastercardActionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<MasterCardPaymentApiObject>> list(Integer mastercardActionId, Integer monetaryAccountId, Map<String, String> params) {
    return list(mastercardActionId, monetaryAccountId, params, null);
  }

  /**
   * The id of the Payment.
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
  public AmountObject getAmount() {
    return this.amount;
  }

  public void setAmount(AmountObject amount) {
    this.amount = amount;
  }

  /**
   * The LabelMonetaryAccount containing the public information of 'this' (party) side of the
   * Payment.
   */
  public LabelMonetaryAccountObject getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccountObject alias) {
    this.alias = alias;
  }

  /**
   * The LabelMonetaryAccount containing the public information of the other (counterparty) side
   * of the Payment.
   */
  public LabelMonetaryAccountObject getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(LabelMonetaryAccountObject counterpartyAlias) {
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
  public PaymentArrivalExpectedObject getPaymentArrivalExpected() {
    return this.paymentArrivalExpected;
  }

  public void setPaymentArrivalExpected(PaymentArrivalExpectedObject paymentArrivalExpected) {
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
  public List<AttachmentMonetaryAccountPaymentObject> getAttachment() {
    return this.attachment;
  }

  public void setAttachment(List<AttachmentMonetaryAccountPaymentObject> attachment) {
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
  public AddressObject getAddressShipping() {
    return this.addressShipping;
  }

  public void setAddressShipping(AddressObject addressShipping) {
    this.addressShipping = addressShipping;
  }

  /**
   * A billing Address provided with the Payment, currently unused.
   */
  public AddressObject getAddressBilling() {
    return this.addressBilling;
  }

  public void setAddressBilling(AddressObject addressBilling) {
    this.addressBilling = addressBilling;
  }

  /**
   * The Geolocation where the Payment was done from.
   */
  public GeolocationObject getGeolocation() {
    return this.geolocation;
  }

  public void setGeolocation(GeolocationObject geolocation) {
    this.geolocation = geolocation;
  }

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  public List<RequestInquiryReferenceObject> getRequestReferenceSplitTheBill() {
    return this.requestReferenceSplitTheBill;
  }

  public void setRequestReferenceSplitTheBill(List<RequestInquiryReferenceObject> requestReferenceSplitTheBill) {
    this.requestReferenceSplitTheBill = requestReferenceSplitTheBill;
  }

  /**
   * The new balance of the monetary account after the mutation.
   */
  public AmountObject getBalanceAfterMutation() {
    return this.balanceAfterMutation;
  }

  public void setBalanceAfterMutation(AmountObject balanceAfterMutation) {
    this.balanceAfterMutation = balanceAfterMutation;
  }

  /**
   * A reference to the PaymentAutoAllocateInstance if it exists.
   */
  public PaymentAutoAllocateInstanceApiObject getPaymentAutoAllocateInstance() {
    return this.paymentAutoAllocateInstance;
  }

  public void setPaymentAutoAllocateInstance(PaymentAutoAllocateInstanceApiObject paymentAutoAllocateInstance) {
    this.paymentAutoAllocateInstance = paymentAutoAllocateInstance;
  }

  /**
   * A reference to the PaymentSuspendedOutgoing if it exists.
   */
  public PaymentSuspendedOutgoingApiObject getPaymentSuspendedOutgoing() {
    return this.paymentSuspendedOutgoing;
  }

  public void setPaymentSuspendedOutgoing(PaymentSuspendedOutgoingApiObject paymentSuspendedOutgoing) {
    this.paymentSuspendedOutgoing = paymentSuspendedOutgoing;
  }

  /**
   * Incurred fee for the payment.
   */
  public PaymentFeeObject getPaymentFee() {
    return this.paymentFee;
  }

  public void setPaymentFee(PaymentFeeObject paymentFee) {
    this.paymentFee = paymentFee;
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

    if (this.paymentFee != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MasterCardPaymentApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(MasterCardPaymentApiObject.class, reader);
  }

}
