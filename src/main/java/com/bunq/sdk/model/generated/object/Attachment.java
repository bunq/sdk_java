package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

}
