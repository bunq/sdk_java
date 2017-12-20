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
public class ChatMessageContentAttachment extends BunqModel {

  /**
   * An attachment.
   */
  @Expose
  @SerializedName("attachment")
  private Attachment attachment;

  /**
   * An attachment.
   */
  public Attachment getAttachment() {
    return this.attachment;
  }

  public void setAttachment(Attachment attachment) {
    this.attachment = attachment;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.attachment != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static ChatMessageContentAttachment fromJsonReader(JsonReader reader) {
    return fromJsonReader(ChatMessageContentAttachment.class, reader);
  }

}
