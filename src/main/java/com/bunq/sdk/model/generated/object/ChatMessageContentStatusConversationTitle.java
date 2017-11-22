package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class ChatMessageContentStatusConversationTitle extends BunqModel {

  /**
   * The new title of a conversation.
   */
  @Expose
  @SerializedName("title")
  private String title;

  /**
   * The new title of a conversation.
   */
  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   */
  public boolean areAllFieldNull() {
    if (this.title != null) {
      return false;
    }

    return true;
  }

}
