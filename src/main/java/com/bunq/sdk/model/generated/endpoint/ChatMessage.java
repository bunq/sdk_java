package com.bunq.sdk.model.generated.endpoint;

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
 * Endpoint for retrieving the messages that are part of a conversation.
 */
public class ChatMessage extends BunqModel {

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static ChatMessage fromJsonReader(JsonReader reader) {
    return fromJsonReader(ChatMessage.class, reader);
  }

}
