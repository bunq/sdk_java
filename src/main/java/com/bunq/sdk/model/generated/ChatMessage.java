package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.bunq.sdk.model.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * Endpoint for retrieving the messages that are part of a conversation.
 */
public class ChatMessage extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_LISTING = "user/%s/chat-conversation/%s/message";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "ChatMessage";

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
   * The id of the ticket this message is linked with, if any.
   */
  @Expose
  @SerializedName("ticket_id")
  private Integer ticketId;

  /**
   * The user who initiated the action that caused this message to appear.
   */
  @Expose
  @SerializedName("creator")
  private LabelUser creator;

  /**
   * The user displayed as the sender of this message.
   */
  @Expose
  @SerializedName("displayed_sender")
  private LabelUser displayedSender;

  /**
   * The content of this message.
   */
  @Expose
  @SerializedName("content")
  private BunqModel content;

  public static BunqResponse<List<ChatMessage>> list(ApiContext apiContext, Integer userId, Integer chatConversationId) {
    return list(apiContext, userId, chatConversationId, new HashMap<>());
  }

  public static BunqResponse<List<ChatMessage>> list(ApiContext apiContext, Integer userId, Integer chatConversationId, Map<String, String> params) {
    return list(apiContext, userId, chatConversationId, params, new HashMap<>());
  }

  /**
   * Get all the messages that are part of a specific conversation.
   */
  public static BunqResponse<List<ChatMessage>> list(ApiContext apiContext, Integer userId, Integer chatConversationId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId, chatConversationId), params, customHeaders);

    return fromJsonList(ChatMessage.class, responseRaw, OBJECT_TYPE);
  }

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
   * The id of the ticket this message is linked with, if any.
   */
  public Integer getTicketId() {
    return this.ticketId;
  }

  public void setTicketId(Integer ticketId) {
    this.ticketId = ticketId;
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
   * The user displayed as the sender of this message.
   */
  public LabelUser getDisplayedSender() {
    return this.displayedSender;
  }

  public void setDisplayedSender(LabelUser displayedSender) {
    this.displayedSender = displayedSender;
  }

  /**
   * The content of this message.
   */
  public BunqModel getContent() {
    return this.content;
  }

  public void setContent(BunqModel content) {
    this.content = content;
  }

}
