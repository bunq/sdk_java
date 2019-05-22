package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 */
public class Image extends BunqModel {

  /**
   * The public UUID of the public attachment containing the image.
   */
  @Expose
  @SerializedName("attachment_public_uuid")
  private String attachmentPublicUuid;

  /**
   * The content-type as a MIME filetype.
   */
  @Expose
  @SerializedName("content_type")
  private String contentType;

  /**
   * The image height in pixels.
   */
  @Expose
  @SerializedName("height")
  private Integer height;

  /**
   * The image width in pixels.
   */
  @Expose
  @SerializedName("width")
  private Integer width;

  /**
   */
  public static Image fromJsonReader(JsonReader reader) {
    return fromJsonReader(Image.class, reader);
  }

  /**
   * The public UUID of the public attachment containing the image.
   */
  public String getAttachmentPublicUuid() {
    return this.attachmentPublicUuid;
  }

  public void setAttachmentPublicUuid(String attachmentPublicUuid) {
    this.attachmentPublicUuid = attachmentPublicUuid;
  }

  /**
   * The content-type as a MIME filetype.
   */
  public String getContentType() {
    return this.contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  /**
   * The image height in pixels.
   */
  public Integer getHeight() {
    return this.height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * The image width in pixels.
   */
  public Integer getWidth() {
    return this.width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.attachmentPublicUuid != null) {
      return false;
    }

    if (this.contentType != null) {
      return false;
    }

    if (this.height != null) {
      return false;
    }

    if (this.width != null) {
      return false;
    }

    return true;
  }

}
