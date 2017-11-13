package com.bunq.sdk.model.generated.endpoint;

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
 * Manages user's support conversation.
 */
public class ChatConversationSupportExternal extends BunqModel {

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "ChatConversationSupportExternal";

  /**
   * The id of this conversation.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the support conversation's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the support conversation's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The last message posted to this conversation if any.
   */
  @Expose
  @SerializedName("last_message")
  private ChatMessage lastMessage;

  /**
   * The id of this conversation.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the support conversation's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the support conversation's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The last message posted to this conversation if any.
   */
  public ChatMessage getLastMessage() {
    return this.lastMessage;
  }

  public void setLastMessage(ChatMessage lastMessage) {
    this.lastMessage = lastMessage;
  }

}
