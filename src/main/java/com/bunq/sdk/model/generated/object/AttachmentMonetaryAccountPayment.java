package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 */
public class AttachmentMonetaryAccountPayment extends BunqModel {

  /**
   * The id of the attached Attachment.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The id of the MonetaryAccount this Attachment is attached from.
   */
  @Expose
  @SerializedName("monetary_account_id")
  private Integer monetaryAccountId;

  /**
   * The id of the Attachment to attach to the MonetaryAccount.
   */
  @Expose
  @SerializedName("id_field_for_request")
  private Integer idFieldForRequest;

  public AttachmentMonetaryAccountPayment() {
    this(null);
  }

  public AttachmentMonetaryAccountPayment(Integer id) {
    this.idFieldForRequest = id;
  }

  /**
   * The id of the attached Attachment.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The id of the MonetaryAccount this Attachment is attached from.
   */
  public Integer getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(Integer monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.monetaryAccountId != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static AttachmentMonetaryAccountPayment fromJsonReader(JsonReader reader) {
    return fromJsonReader(AttachmentMonetaryAccountPayment.class, reader);
  }

}
