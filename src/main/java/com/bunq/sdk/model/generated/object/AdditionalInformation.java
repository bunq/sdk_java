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
public class AdditionalInformation extends BunqModel {

  /**
   * The category of the refund, required for chargeback.
   */
  @Expose
  @SerializedName("category")
  private String category;

  /**
   * The reason to refund, required for chargeback.
   */
  @Expose
  @SerializedName("reason")
  private String reason;

  /**
   * Comment about the refund.
   */
  @Expose
  @SerializedName("comment")
  private String comment;

  /**
   * The Attachments to attach to the refund request.
   */
  @Expose
  @SerializedName("attachment")
  private List<AttachmentMasterCardActionRefund> attachment;

  /**
   * Proof that the user acknowledged the terms and conditions for chargebacks.
   */
  @Expose
  @SerializedName("terms_and_conditions")
  private String termsAndConditions;

  /**
   * The category of the refund, required for chargeback.
   */
  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * The reason to refund, required for chargeback.
   */
  public String getReason() {
    return this.reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * Comment about the refund.
   */
  public String getComment() {
    return this.comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  /**
   * The Attachments to attach to the refund request.
   */
  public List<AttachmentMasterCardActionRefund> getAttachment() {
    return this.attachment;
  }

  public void setAttachment(List<AttachmentMasterCardActionRefund> attachment) {
    this.attachment = attachment;
  }

  /**
   * Proof that the user acknowledged the terms and conditions for chargebacks.
   */
  public String getTermsAndConditions() {
    return this.termsAndConditions;
  }

  public void setTermsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.category != null) {
      return false;
    }

    if (this.reason != null) {
      return false;
    }

    if (this.comment != null) {
      return false;
    }

    if (this.attachment != null) {
      return false;
    }

    if (this.termsAndConditions != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static AdditionalInformation fromJsonReader(JsonReader reader) {
    return fromJsonReader(AdditionalInformation.class, reader);
  }

}
