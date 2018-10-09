package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 */
public class AttachmentTab extends BunqModel {

  /**
   * The id of the attachment.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

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
   * The id of the attachment.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

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
    if (this.id != null) {
      return false;
    }

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
  public static AttachmentTab fromJsonReader(JsonReader reader) {
    return fromJsonReader(AttachmentTab.class, reader);
  }

}
