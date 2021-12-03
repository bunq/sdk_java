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
public class AttachmentUrl extends BunqModel {

  /**
   * The file type of attachment.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The URL where the attachment can be downloaded.
   */
  @Expose
  @SerializedName("url")
  private String url;

  /**
   * The file type of attachment.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The URL where the attachment can be downloaded.
   */
  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.type != null) {
      return false;
    }

    if (this.url != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static AttachmentUrl fromJsonReader(JsonReader reader) {
    return fromJsonReader(AttachmentUrl.class, reader);
  }

}
