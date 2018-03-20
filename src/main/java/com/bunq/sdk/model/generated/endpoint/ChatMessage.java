package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.AnchorObjectInterface;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.List;
import java.util.Map;

/**
 * Endpoint for retrieving the messages that are part of a conversation.
 */
public class ChatMessage extends BunqModel implements AnchorObjectInterface {

  /**
   * Error constants.
   */
  protected static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/chat-conversation/%s/message";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "ChatMessage";

  /**
   */
  @Expose
  @SerializedName("ChatMessageAnnouncement")
  private ChatMessageAnnouncement chatMessageAnnouncement;

  /**
   */
  @Expose
  @SerializedName("ChatMessageStatus")
  private ChatMessageStatus chatMessageStatus;

  /**
   */
  @Expose
  @SerializedName("ChatMessageUser")
  private ChatMessageUser chatMessageUser;

  /**
   * Get all the messages that are part of a specific conversation.
   */
  public static BunqResponse<List<ChatMessage>> list(Integer chatConversationId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), chatConversationId), params, customHeaders);

    return fromJsonList(ChatMessage.class, responseRaw);
  }

  public static BunqResponse<List<ChatMessage>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<ChatMessage>> list(Integer chatConversationId) {
    return list(chatConversationId, null, null);
  }

  public static BunqResponse<List<ChatMessage>> list(Integer chatConversationId, Map<String, String> params) {
    return list(chatConversationId, params, null);
  }

  /**
   */
  public ChatMessageAnnouncement getChatMessageAnnouncement() {
    return this.chatMessageAnnouncement;
  }

  public void setChatMessageAnnouncement(ChatMessageAnnouncement chatMessageAnnouncement) {
    this.chatMessageAnnouncement = chatMessageAnnouncement;
  }

  /**
   */
  public ChatMessageStatus getChatMessageStatus() {
    return this.chatMessageStatus;
  }

  public void setChatMessageStatus(ChatMessageStatus chatMessageStatus) {
    this.chatMessageStatus = chatMessageStatus;
  }

  /**
   */
  public ChatMessageUser getChatMessageUser() {
    return this.chatMessageUser;
  }

  public void setChatMessageUser(ChatMessageUser chatMessageUser) {
    this.chatMessageUser = chatMessageUser;
  }

  /**
   */
  public BunqModel getReferencedObject() {
    if (this.chatMessageAnnouncement != null) {
      return this.chatMessageAnnouncement;
    }

    if (this.chatMessageStatus != null) {
      return this.chatMessageStatus;
    }

    if (this.chatMessageUser != null) {
      return this.chatMessageUser;
    }

    throw new BunqException(ERROR_NULL_FIELDS);
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.chatMessageAnnouncement != null) {
      return false;
    }

    if (this.chatMessageStatus != null) {
      return false;
    }

    if (this.chatMessageUser != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static ChatMessage fromJsonReader(JsonReader reader) {
    return fromJsonReader(ChatMessage.class, reader);
  }

}
