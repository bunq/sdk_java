package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

  public AttachmentMonetaryAccountPayment(Integer id) {
    this.id = id;
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

}
