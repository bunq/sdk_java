package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class SchedulePaymentEntryObject extends BunqModel {

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
   * The Amount to transfer with the Payment. Must be bigger 0 and smaller than the
   * MonetaryAccount's balance.
   */
  @Expose
  @SerializedName("amount_field_for_request")
  private AmountObject amountFieldForRequest;

  /**
   * The Alias of the party we are transferring the money to. Can be an Alias of type EMAIL or
   * PHONE (for bunq MonetaryAccounts) or IBAN (for external bank account).
   */
  @Expose
  @SerializedName("counterparty_alias_field_for_request")
  private PointerObject counterpartyAliasFieldForRequest;

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
  private List<BunqIdObject> attachmentFieldForRequest;

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

  public SchedulePaymentEntryObject() {
  this(null, null, null, null, null, null);
  }

  public SchedulePaymentEntryObject(AmountObject amount) {
  this(amount, null, null, null, null, null);
  }

  public SchedulePaymentEntryObject(AmountObject amount, PointerObject counterpartyAlias) {
  this(amount, counterpartyAlias, null, null, null, null);
  }

  public SchedulePaymentEntryObject(AmountObject amount, PointerObject counterpartyAlias, String description) {
  this(amount, counterpartyAlias, description, null, null, null);
  }

  public SchedulePaymentEntryObject(AmountObject amount, PointerObject counterpartyAlias, String description, List<BunqIdObject> attachment) {
  this(amount, counterpartyAlias, description, attachment, null, null);
  }

  public SchedulePaymentEntryObject(AmountObject amount, PointerObject counterpartyAlias, String description, List<BunqIdObject> attachment, String merchantReference) {
  this(amount, counterpartyAlias, description, attachment, merchantReference, null);
  }

  public SchedulePaymentEntryObject(AmountObject amount, PointerObject counterpartyAlias, String description, List<BunqIdObject> attachment, String merchantReference, Boolean allowBunqto) {
    this.amountFieldForRequest = amount;
    this.counterpartyAliasFieldForRequest = counterpartyAlias;
    this.descriptionFieldForRequest = description;
    this.attachmentFieldForRequest = attachment;
    this.merchantReferenceFieldForRequest = merchantReference;
    this.allowBunqtoFieldForRequest = allowBunqto;
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
   */
  public boolean isAllFieldNull() {
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

    if (this.attachment != null) {
      return false;
    }

    if (this.merchantReference != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static SchedulePaymentEntryObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(SchedulePaymentEntryObject.class, reader);
  }

}
