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
public class AttachmentScheduleRequestInquiryEntry extends BunqModel {

  /**
   * The id of the attached Attachment.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  public AttachmentScheduleRequestInquiryEntry(Integer id) {
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

}
