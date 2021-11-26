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
public class AttachmentMasterCardActionRefund extends BunqModel {

  /**
   * The id of the attached Attachment.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The id of the Attachment.
   */
  @Expose
  @SerializedName("id_field_for_request")
  private Integer idFieldForRequest;

  public AttachmentMasterCardActionRefund() {
  this(null);
  }

  public AttachmentMasterCardActionRefund(Integer id) {
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
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static AttachmentMasterCardActionRefund fromJsonReader(JsonReader reader) {
    return fromJsonReader(AttachmentMasterCardActionRefund.class, reader);
  }

}
