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
public class ChatMessageContentStatusConversation extends BunqModel {

  /**
   * Action which occurred over a conversation. Always CONVERSATION_CREATED
   */
  @Expose
  @SerializedName("action")
  private String action;

  /**
   * Action which occurred over a conversation. Always CONVERSATION_CREATED
   */
  public String getAction() {
    return this.action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.action != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static ChatMessageContentStatusConversation fromJsonReader(JsonReader reader) {
    return fromJsonReader(ChatMessageContentStatusConversation.class, reader);
  }

}
