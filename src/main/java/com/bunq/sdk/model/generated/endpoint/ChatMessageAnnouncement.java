package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.ChatMessageContent;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Endpoint for retrieving the messages that are part of a conversation.
 */
public class ChatMessageAnnouncement extends BunqModel {

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "ChatMessageAnnouncement";

  /**
   * The id of the message.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp when the message was created.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp when the message was last updated.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The id of the conversation this message belongs to.
   */
  @Expose
  @SerializedName("conversation_id")
  private Integer conversationId;

  /**
   * The user who initiated the action that caused this message to appear.
   */
  @Expose
  @SerializedName("creator")
  private LabelUser creator;

  /**
   * The content of this message.
   */
  @Expose
  @SerializedName("content")
  private ChatMessageContent content;

  /**
   * The id of the message.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp when the message was created.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp when the message was last updated.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The id of the conversation this message belongs to.
   */
  public Integer getConversationId() {
    return this.conversationId;
  }

  public void setConversationId(Integer conversationId) {
    this.conversationId = conversationId;
  }

  /**
   * The user who initiated the action that caused this message to appear.
   */
  public LabelUser getCreator() {
    return this.creator;
  }

  public void setCreator(LabelUser creator) {
    this.creator = creator;
  }

  /**
   * The content of this message.
   */
  public ChatMessageContent getContent() {
    return this.content;
  }

  public void setContent(ChatMessageContent content) {
    this.content = content;
  }

}
