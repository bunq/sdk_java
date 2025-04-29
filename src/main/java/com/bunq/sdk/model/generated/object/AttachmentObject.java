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
public class AttachmentObject extends BunqModel {

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
   * The URLs where the file can be downloaded.
   */
  @Expose
  @SerializedName("urls")
  private List<AttachmentUrlObject> urls;

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
   * The URLs where the file can be downloaded.
   */
  public List<AttachmentUrlObject> getUrls() {
    return this.urls;
  }

  public void setUrls(List<AttachmentUrlObject> urls) {
    this.urls = urls;
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

    if (this.urls != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static AttachmentObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(AttachmentObject.class, reader);
  }

}
