package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Using Payment, you can send payments to bunq and non-bunq users from your bunq
 * MonetaryAccounts. This can be done using bunq Aliases or IBAN Aliases. When transferring
 * money to other bunq MonetaryAccounts you can also refer to Attachments. These will be
 * received by the counter-party as part of the Payment. You can also retrieve a single Payment
 * or all executed Payments of a specific monetary account.
 */
public class Payment extends BunqModel {
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
  private MonetaryAccountReference alias;

  /**
   * The LabelMonetaryAccount containing the public information of the other (counterparty) side
   * of the Payment.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private MonetaryAccountReference counterpartyAlias;

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
   * Whether or not chat messages are allowed.
   */
  @Expose
  @SerializedName("allow_chat")
  private Boolean allowChat;

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  @Expose
  @SerializedName("request_reference_split_the_bill")
  private List<RequestInquiryReference> requestReferenceSplitTheBill;

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
  public MonetaryAccountReference getAlias() {
    return this.alias;
  }

  public void setAlias(MonetaryAccountReference alias) {
    this.alias = alias;
  }

  /**
   * The LabelMonetaryAccount containing the public information of the other (counterparty) side
   * of the Payment.
   */
  public MonetaryAccountReference getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(MonetaryAccountReference counterpartyAlias) {
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
   * Whether or not chat messages are allowed.
   */
  public Boolean getAllowChat() {
    return this.allowChat;
  }

  public void setAllowChat(Boolean allowChat) {
    this.allowChat = allowChat;
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

    if (this.allowChat != null) {
      return false;
    }

    if (this.requestReferenceSplitTheBill != null) {
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