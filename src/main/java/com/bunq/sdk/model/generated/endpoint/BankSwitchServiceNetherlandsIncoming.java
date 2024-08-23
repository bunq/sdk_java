package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Attachment;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.bunq.sdk.model.generated.object.Pointer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Endpoint for using the Equens Bank Switch Service.
 */
public class BankSwitchServiceNetherlandsIncoming extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_ALIAS = "alias";
  public static final String FIELD_COUNTERPARTY_ALIAS = "counterparty_alias";
  public static final String FIELD_STATUS = "status";

  /**
   * The label of the user creator of this switch service.
   */
  @Expose
  @SerializedName("user_alias")
  private LabelUser userAlias;

  /**
   * The label of the monetary of this switch service.
   */
  @Expose
  @SerializedName("alias")
  private LabelMonetaryAccount alias;

  /**
   * The IBAN alias that's displayed for this switch service.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private LabelMonetaryAccount counterpartyAlias;

  /**
   * The status of the switch service.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The sub status of the switch service.
   */
  @Expose
  @SerializedName("sub_status")
  private String subStatus;

  /**
   * The timestamp when the switch service desired to be start.
   */
  @Expose
  @SerializedName("time_start_desired")
  private String timeStartDesired;

  /**
   * The timestamp when the switch service actually starts.
   */
  @Expose
  @SerializedName("time_start_actual")
  private String timeStartActual;

  /**
   * The timestamp when the switch service ends.
   */
  @Expose
  @SerializedName("time_end")
  private String timeEnd;

  /**
   * Reference to the bank transfer form for this switch-service.
   */
  @Expose
  @SerializedName("attachment")
  private Attachment attachment;

  /**
   * Rejection reason enum.
   */
  @Expose
  @SerializedName("rejection_reason")
  private String rejectionReason;

  /**
   * Rejection reason description to be shown to the user.
   */
  @Expose
  @SerializedName("rejection_reason_description")
  private String rejectionReasonDescription;

  /**
   * Rejection reason description to be shown to the user, translated.
   */
  @Expose
  @SerializedName("rejection_reason_description_translated")
  private String rejectionReasonDescriptionTranslated;

  /**
   * Rejection reason together URL.
   */
  @Expose
  @SerializedName("rejection_reason_together_url")
  private String rejectionReasonTogetherUrl;

  /**
   * The alias of the Monetary Account this switch service is for.
   */
  @Expose
  @SerializedName("alias_field_for_request")
  private Pointer aliasFieldForRequest;

  /**
   * The Alias of the party we are switching from. Can only be an Alias of type IBAN (external
   * bank account).
   */
  @Expose
  @SerializedName("counterparty_alias_field_for_request")
  private Pointer counterpartyAliasFieldForRequest;

  /**
   * The status of the switch service. Ignored in POST requests (always set to REQUESTED) can be
   * CANCELLED in PUT requests to cancel the switch service. Admin can set this to ACCEPTED, or
   * REJECTED.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  public BankSwitchServiceNetherlandsIncoming() {
  this(null, null, null);
  }

  public BankSwitchServiceNetherlandsIncoming(Pointer alias) {
  this(alias, null, null);
  }

  public BankSwitchServiceNetherlandsIncoming(Pointer alias, Pointer counterpartyAlias) {
  this(alias, counterpartyAlias, null);
  }

  public BankSwitchServiceNetherlandsIncoming(Pointer alias, Pointer counterpartyAlias, String status) {
    this.aliasFieldForRequest = alias;
    this.counterpartyAliasFieldForRequest = counterpartyAlias;
    this.statusFieldForRequest = status;
  }

  /**
   * The label of the user creator of this switch service.
   */
  public LabelUser getUserAlias() {
    return this.userAlias;
  }

  public void setUserAlias(LabelUser userAlias) {
    this.userAlias = userAlias;
  }

  /**
   * The label of the monetary of this switch service.
   */
  public LabelMonetaryAccount getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccount alias) {
    this.alias = alias;
  }

  /**
   * The IBAN alias that's displayed for this switch service.
   */
  public LabelMonetaryAccount getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(LabelMonetaryAccount counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * The status of the switch service.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The sub status of the switch service.
   */
  public String getSubStatus() {
    return this.subStatus;
  }

  public void setSubStatus(String subStatus) {
    this.subStatus = subStatus;
  }

  /**
   * The timestamp when the switch service desired to be start.
   */
  public String getTimeStartDesired() {
    return this.timeStartDesired;
  }

  public void setTimeStartDesired(String timeStartDesired) {
    this.timeStartDesired = timeStartDesired;
  }

  /**
   * The timestamp when the switch service actually starts.
   */
  public String getTimeStartActual() {
    return this.timeStartActual;
  }

  public void setTimeStartActual(String timeStartActual) {
    this.timeStartActual = timeStartActual;
  }

  /**
   * The timestamp when the switch service ends.
   */
  public String getTimeEnd() {
    return this.timeEnd;
  }

  public void setTimeEnd(String timeEnd) {
    this.timeEnd = timeEnd;
  }

  /**
   * Reference to the bank transfer form for this switch-service.
   */
  public Attachment getAttachment() {
    return this.attachment;
  }

  public void setAttachment(Attachment attachment) {
    this.attachment = attachment;
  }

  /**
   * Rejection reason enum.
   */
  public String getRejectionReason() {
    return this.rejectionReason;
  }

  public void setRejectionReason(String rejectionReason) {
    this.rejectionReason = rejectionReason;
  }

  /**
   * Rejection reason description to be shown to the user.
   */
  public String getRejectionReasonDescription() {
    return this.rejectionReasonDescription;
  }

  public void setRejectionReasonDescription(String rejectionReasonDescription) {
    this.rejectionReasonDescription = rejectionReasonDescription;
  }

  /**
   * Rejection reason description to be shown to the user, translated.
   */
  public String getRejectionReasonDescriptionTranslated() {
    return this.rejectionReasonDescriptionTranslated;
  }

  public void setRejectionReasonDescriptionTranslated(String rejectionReasonDescriptionTranslated) {
    this.rejectionReasonDescriptionTranslated = rejectionReasonDescriptionTranslated;
  }

  /**
   * Rejection reason together URL.
   */
  public String getRejectionReasonTogetherUrl() {
    return this.rejectionReasonTogetherUrl;
  }

  public void setRejectionReasonTogetherUrl(String rejectionReasonTogetherUrl) {
    this.rejectionReasonTogetherUrl = rejectionReasonTogetherUrl;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.userAlias != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.counterpartyAlias != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.subStatus != null) {
      return false;
    }

    if (this.timeStartDesired != null) {
      return false;
    }

    if (this.timeStartActual != null) {
      return false;
    }

    if (this.timeEnd != null) {
      return false;
    }

    if (this.attachment != null) {
      return false;
    }

    if (this.rejectionReason != null) {
      return false;
    }

    if (this.rejectionReasonDescription != null) {
      return false;
    }

    if (this.rejectionReasonDescriptionTranslated != null) {
      return false;
    }

    if (this.rejectionReasonTogetherUrl != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static BankSwitchServiceNetherlandsIncoming fromJsonReader(JsonReader reader) {
    return fromJsonReader(BankSwitchServiceNetherlandsIncoming.class, reader);
  }

}
