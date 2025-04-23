package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AdditionalInformationObject;
import com.bunq.sdk.model.generated.object.AmountObject;
import com.bunq.sdk.model.generated.object.AttachmentMasterCardActionRefundObject;
import com.bunq.sdk.model.generated.object.LabelCardObject;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccountObject;
import com.bunq.sdk.model.generated.object.LabelUserObject;
import com.bunq.sdk.model.generated.object.MasterCardActionReferenceObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Endpoint for creating a refund request for a masterCard transaction.
 */
public class MasterCardActionRefundApiObject extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_TYPE = "type";
  public static final String FIELD_SUB_TYPE = "sub_type";
  public static final String FIELD_AMOUNT = "amount";
  public static final String FIELD_CATEGORY = "category";
  public static final String FIELD_REASON = "reason";
  public static final String FIELD_COMMENT = "comment";
  public static final String FIELD_ATTACHMENT = "attachment";
  public static final String FIELD_TERMS_AND_CONDITIONS = "terms_and_conditions";

  /**
   * The id of the refund.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the refund's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the refund's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The label of the user who created this note.
   */
  @Expose
  @SerializedName("label_user_creator")
  private LabelUserObject labelUserCreator;

  /**
   * The status of the refunded mastercard action. Can be AUTO_APPROVED,
   * AUTO_APPROVED_WAITING_FOR_EXPIRY, PENDING_APPROVAL, APPROVED, REFUNDED, DENIED or FAILED
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The reference to the object this refund applies to.
   */
  @Expose
  @SerializedName("reference_mastercard_action_event")
  private List<MasterCardActionReferenceObject> referenceMastercardActionEvent;

  /**
   * The id of mastercard action being refunded.
   */
  @Expose
  @SerializedName("mastercard_action_id")
  private Integer mastercardActionId;

  /**
   * Type of this refund. Can de REFUND or CHARGEBACK
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The sub type of this refund indicating whether the chargeback will be FULL or PARTIAL.
   */
  @Expose
  @SerializedName("sub_type")
  private String subType;

  /**
   * The reason of the refund. Can be REFUND_EXPIRED_TRANSACTION, REFUND_REQUESTED,
   * REFUND_MERCHANT, REFUND_CHARGEBACK.
   */
  @Expose
  @SerializedName("reason")
  private String reason;

  /**
   * The amount to refund.
   */
  @Expose
  @SerializedName("amount")
  private AmountObject amount;

  /**
   * The monetary account label of the account that this action is created for.
   */
  @Expose
  @SerializedName("alias")
  private LabelMonetaryAccountObject alias;

  /**
   * The monetary account label of the counterparty.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private LabelMonetaryAccountObject counterpartyAlias;

  /**
   * The description for this transaction to display.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The label of the card.
   */
  @Expose
  @SerializedName("label_card")
  private LabelCardObject labelCard;

  /**
   * The time the refund will take place.
   */
  @Expose
  @SerializedName("time_refund")
  private String timeRefund;

  /**
   * All additional information provided by the user.
   */
  @Expose
  @SerializedName("additional_information")
  private AdditionalInformationObject additionalInformation;

  /**
   * Description of the refund's current status.
   */
  @Expose
  @SerializedName("status_description")
  private String statusDescription;

  /**
   * Description of the refund's current status, translated in user's language.
   */
  @Expose
  @SerializedName("status_description_translated")
  private String statusDescriptionTranslated;

  /**
   * Together topic concerning the refund's current status.
   */
  @Expose
  @SerializedName("status_together_url")
  private String statusTogetherUrl;

  /**
   * Type of this refund. Can de REFUND or CHARGEBACK. DEPRECATED: This is now determined by
   * backend.
   */
  @Expose
  @SerializedName("type_field_for_request")
  private String typeFieldForRequest;

  /**
   * The sub type of this refund indicating whether the chargeback will be FULL or PARTIAL.
   */
  @Expose
  @SerializedName("sub_type_field_for_request")
  private String subTypeFieldForRequest;

  /**
   * The amount to refund.
   */
  @Expose
  @SerializedName("amount_field_for_request")
  private AmountObject amountFieldForRequest;

  /**
   * The category of the refund, required for chargeback.
   */
  @Expose
  @SerializedName("category_field_for_request")
  private String categoryFieldForRequest;

  /**
   * The reason to refund, required for chargeback.
   */
  @Expose
  @SerializedName("reason_field_for_request")
  private String reasonFieldForRequest;

  /**
   * Comment about the refund.
   */
  @Expose
  @SerializedName("comment_field_for_request")
  private String commentFieldForRequest;

  /**
   * The Attachments to attach to the refund request.
   */
  @Expose
  @SerializedName("attachment_field_for_request")
  private List<AttachmentMasterCardActionRefundObject> attachmentFieldForRequest;

  /**
   * Proof that the user acknowledged the terms and conditions for chargebacks.
   */
  @Expose
  @SerializedName("terms_and_conditions_field_for_request")
  private String termsAndConditionsFieldForRequest;

  public MasterCardActionRefundApiObject() {
  this(null, null, null, null, null, null, null, null);
  }

  public MasterCardActionRefundApiObject(String subType) {
  this(subType, null, null, null, null, null, null, null);
  }

  public MasterCardActionRefundApiObject(String subType, AmountObject amount) {
  this(subType, amount, null, null, null, null, null, null);
  }

  public MasterCardActionRefundApiObject(String subType, AmountObject amount, String type) {
  this(subType, amount, type, null, null, null, null, null);
  }

  public MasterCardActionRefundApiObject(String subType, AmountObject amount, String type, String category) {
  this(subType, amount, type, category, null, null, null, null);
  }

  public MasterCardActionRefundApiObject(String subType, AmountObject amount, String type, String category, String reason) {
  this(subType, amount, type, category, reason, null, null, null);
  }

  public MasterCardActionRefundApiObject(String subType, AmountObject amount, String type, String category, String reason, String comment) {
  this(subType, amount, type, category, reason, comment, null, null);
  }

  public MasterCardActionRefundApiObject(String subType, AmountObject amount, String type, String category, String reason, String comment, List<AttachmentMasterCardActionRefundObject> attachment) {
  this(subType, amount, type, category, reason, comment, attachment, null);
  }

  public MasterCardActionRefundApiObject(String subType, AmountObject amount, String type, String category, String reason, String comment, List<AttachmentMasterCardActionRefundObject> attachment, String termsAndConditions) {
    this.typeFieldForRequest = type;
    this.subTypeFieldForRequest = subType;
    this.amountFieldForRequest = amount;
    this.categoryFieldForRequest = category;
    this.reasonFieldForRequest = reason;
    this.commentFieldForRequest = comment;
    this.attachmentFieldForRequest = attachment;
    this.termsAndConditionsFieldForRequest = termsAndConditions;
  }

  /**
   * The id of the refund.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the refund's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the refund's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The label of the user who created this note.
   */
  public LabelUserObject getLabelUserCreator() {
    return this.labelUserCreator;
  }

  public void setLabelUserCreator(LabelUserObject labelUserCreator) {
    this.labelUserCreator = labelUserCreator;
  }

  /**
   * The status of the refunded mastercard action. Can be AUTO_APPROVED,
   * AUTO_APPROVED_WAITING_FOR_EXPIRY, PENDING_APPROVAL, APPROVED, REFUNDED, DENIED or FAILED
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The reference to the object this refund applies to.
   */
  public List<MasterCardActionReferenceObject> getReferenceMastercardActionEvent() {
    return this.referenceMastercardActionEvent;
  }

  public void setReferenceMastercardActionEvent(List<MasterCardActionReferenceObject> referenceMastercardActionEvent) {
    this.referenceMastercardActionEvent = referenceMastercardActionEvent;
  }

  /**
   * The id of mastercard action being refunded.
   */
  public Integer getMastercardActionId() {
    return this.mastercardActionId;
  }

  public void setMastercardActionId(Integer mastercardActionId) {
    this.mastercardActionId = mastercardActionId;
  }

  /**
   * Type of this refund. Can de REFUND or CHARGEBACK
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The sub type of this refund indicating whether the chargeback will be FULL or PARTIAL.
   */
  public String getSubType() {
    return this.subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

  /**
   * The reason of the refund. Can be REFUND_EXPIRED_TRANSACTION, REFUND_REQUESTED,
   * REFUND_MERCHANT, REFUND_CHARGEBACK.
   */
  public String getReason() {
    return this.reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * The amount to refund.
   */
  public AmountObject getAmount() {
    return this.amount;
  }

  public void setAmount(AmountObject amount) {
    this.amount = amount;
  }

  /**
   * The monetary account label of the account that this action is created for.
   */
  public LabelMonetaryAccountObject getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccountObject alias) {
    this.alias = alias;
  }

  /**
   * The monetary account label of the counterparty.
   */
  public LabelMonetaryAccountObject getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(LabelMonetaryAccountObject counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * The description for this transaction to display.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The label of the card.
   */
  public LabelCardObject getLabelCard() {
    return this.labelCard;
  }

  public void setLabelCard(LabelCardObject labelCard) {
    this.labelCard = labelCard;
  }

  /**
   * The time the refund will take place.
   */
  public String getTimeRefund() {
    return this.timeRefund;
  }

  public void setTimeRefund(String timeRefund) {
    this.timeRefund = timeRefund;
  }

  /**
   * All additional information provided by the user.
   */
  public AdditionalInformationObject getAdditionalInformation() {
    return this.additionalInformation;
  }

  public void setAdditionalInformation(AdditionalInformationObject additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  /**
   * Description of the refund's current status.
   */
  public String getStatusDescription() {
    return this.statusDescription;
  }

  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }

  /**
   * Description of the refund's current status, translated in user's language.
   */
  public String getStatusDescriptionTranslated() {
    return this.statusDescriptionTranslated;
  }

  public void setStatusDescriptionTranslated(String statusDescriptionTranslated) {
    this.statusDescriptionTranslated = statusDescriptionTranslated;
  }

  /**
   * Together topic concerning the refund's current status.
   */
  public String getStatusTogetherUrl() {
    return this.statusTogetherUrl;
  }

  public void setStatusTogetherUrl(String statusTogetherUrl) {
    this.statusTogetherUrl = statusTogetherUrl;
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

    if (this.labelUserCreator != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.referenceMastercardActionEvent != null) {
      return false;
    }

    if (this.mastercardActionId != null) {
      return false;
    }

    if (this.type != null) {
      return false;
    }

    if (this.subType != null) {
      return false;
    }

    if (this.reason != null) {
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

    if (this.labelCard != null) {
      return false;
    }

    if (this.timeRefund != null) {
      return false;
    }

    if (this.additionalInformation != null) {
      return false;
    }

    if (this.statusDescription != null) {
      return false;
    }

    if (this.statusDescriptionTranslated != null) {
      return false;
    }

    if (this.statusTogetherUrl != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MasterCardActionRefundApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(MasterCardActionRefundApiObject.class, reader);
  }

}
