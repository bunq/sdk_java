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
public class AttachmentMonetaryAccountPaymentObject extends BunqModel {

  /**
   * The id of the attached Attachment.
   */
  @Expose
  @SerializedName("id")
  private Long id;

  /**
   * The id of the MonetaryAccount this Attachment is attached from.
   */
  @Expose
  @SerializedName("monetary_account_id")
  private Long monetaryAccountId;

  /**
   * The id of the Attachment to attach to the MonetaryAccount.
   */
  @Expose
  @SerializedName("id_field_for_request")
  private Long idFieldForRequest;

  public AttachmentMonetaryAccountPaymentObject() {
  this(null);
  }

  public AttachmentMonetaryAccountPaymentObject(Long id) {
    this.idFieldForRequest = id;
  }

  /**
   * The id of the attached Attachment.
   */
  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  /**
   * The id of the MonetaryAccount this Attachment is attached from.
   */
  public Long getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(Long monetaryAccountId) {
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
  public static AttachmentMonetaryAccountPaymentObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(AttachmentMonetaryAccountPaymentObject.class, reader);
  }

}
