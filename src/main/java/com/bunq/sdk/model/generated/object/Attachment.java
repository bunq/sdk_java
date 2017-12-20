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
public class Attachment extends BunqModel {

  /**
   * The description of the attachment.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The content type of the attachment's file.
   */
  @Expose
  @SerializedName("content_type")
  private String contentType;

  /**
   * The description of the attachment.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The content type of the attachment's file.
   */
  public String getContentType() {
    return this.contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.description != null) {
      return false;
    }

    if (this.contentType != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static Attachment fromJsonReader(JsonReader reader) {
    return fromJsonReader(Attachment.class, reader);
  }

}
