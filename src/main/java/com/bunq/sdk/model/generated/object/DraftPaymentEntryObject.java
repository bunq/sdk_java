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
public class DraftPaymentEntryObject extends BunqModel {

  /**
   * The id of the draft payment entry.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The amount of the payment.
   */
  @Expose
  @SerializedName("amount")
  private AmountObject amount;

  /**
   * The LabelMonetaryAccount containing the public information of 'this' (party) side of the
   * DraftPayment.
   */
  @Expose
  @SerializedName("alias")
  private LabelMonetaryAccountObject alias;

  /**
   * The LabelMonetaryAccount containing the public information of the other (counterparty) side
   * of the DraftPayment.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private LabelMonetaryAccountObject counterpartyAlias;

  /**
   * The description for the DraftPayment. Maximum 140 characters for DraftPayments to external
   * IBANs, 9000 characters for DraftPayments to only other bunq MonetaryAccounts.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * Optional data to be included with the Payment specific to the merchant.
   */
  @Expose
  @SerializedName("merchant_reference")
  private String merchantReference;

  /**
   * The type of the draft payment entry.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The Attachments attached to the DraftPayment.
   */
  @Expose
  @SerializedName("attachment")
  private List<AttachmentMonetaryAccountPaymentObject> attachment;

  /**
   * The amount of the payment.
   */
  @Expose
  @SerializedName("amount_field_for_request")
  private AmountObject amountFieldForRequest;

  /**
   * The Alias of the party we are transferring the money to. Can be an Alias of type EMAIL or
   * PHONE_NUMBER (for bunq MonetaryAccounts or bunq.to payments) or IBAN (for external bank
   * account).
   */
  @Expose
  @SerializedName("counterparty_alias_field_for_request")
  private PointerObject counterpartyAliasFieldForRequest;

  /**
   * The description for the DraftPayment. Maximum 140 characters for DraftPayments to external
   * IBANs, 9000 characters for DraftPayments to only other bunq MonetaryAccounts. Field is
   * required but can be an empty string.
   */
  @Expose
  @SerializedName("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * Optional data to be included with the Payment specific to the merchant.
   */
  @Expose
  @SerializedName("merchant_reference_field_for_request")
  private String merchantReferenceFieldForRequest;

  /**
   * The Attachments to attach to the DraftPayment.
   */
  @Expose
  @SerializedName("attachment_field_for_request")
  private List<AttachmentMonetaryAccountPaymentObject> attachmentFieldForRequest;

  public DraftPaymentEntryObject() {
  this(null, null, null, null, null);
  }

  public DraftPaymentEntryObject(AmountObject amount) {
  this(amount, null, null, null, null);
  }

  public DraftPaymentEntryObject(AmountObject amount, PointerObject counterpartyAlias) {
  this(amount, counterpartyAlias, null, null, null);
  }

  public DraftPaymentEntryObject(AmountObject amount, PointerObject counterpartyAlias, String description) {
  this(amount, counterpartyAlias, description, null, null);
  }

  public DraftPaymentEntryObject(AmountObject amount, PointerObject counterpartyAlias, String description, String merchantReference) {
  this(amount, counterpartyAlias, description, merchantReference, null);
  }

  public DraftPaymentEntryObject(AmountObject amount, PointerObject counterpartyAlias, String description, String merchantReference, List<AttachmentMonetaryAccountPaymentObject> attachment) {
    this.amountFieldForRequest = amount;
    this.counterpartyAliasFieldForRequest = counterpartyAlias;
    this.descriptionFieldForRequest = description;
    this.merchantReferenceFieldForRequest = merchantReference;
    this.attachmentFieldForRequest = attachment;
  }

  /**
   * The id of the draft payment entry.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The amount of the payment.
   */
  public AmountObject getAmount() {
    return this.amount;
  }

  public void setAmount(AmountObject amount) {
    this.amount = amount;
  }

  /**
   * The LabelMonetaryAccount containing the public information of 'this' (party) side of the
   * DraftPayment.
   */
  public LabelMonetaryAccountObject getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccountObject alias) {
    this.alias = alias;
  }

  /**
   * The LabelMonetaryAccount containing the public information of the other (counterparty) side
   * of the DraftPayment.
   */
  public LabelMonetaryAccountObject getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(LabelMonetaryAccountObject counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * The description for the DraftPayment. Maximum 140 characters for DraftPayments to external
   * IBANs, 9000 characters for DraftPayments to only other bunq MonetaryAccounts.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Optional data to be included with the Payment specific to the merchant.
   */
  public String getMerchantReference() {
    return this.merchantReference;
  }

  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }

  /**
   * The type of the draft payment entry.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The Attachments attached to the DraftPayment.
   */
  public List<AttachmentMonetaryAccountPaymentObject> getAttachment() {
    return this.attachment;
  }

  public void setAttachment(List<AttachmentMonetaryAccountPaymentObject> attachment) {
    this.attachment = attachment;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
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

    if (this.merchantReference != null) {
      return false;
    }

    if (this.type != null) {
      return false;
    }

    if (this.attachment != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static DraftPaymentEntryObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(DraftPaymentEntryObject.class, reader);
  }

}
