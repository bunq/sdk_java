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
 * Manages user's conversations.
 */
public class ChatConversation extends BunqModel implements AnchorObjectInterface {

  /**
   * Error constants.
   */
  protected static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/chat-conversation";
  protected static final String ENDPOINT_URL_READ = "user/%s/chat-conversation/%s";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "ChatConversation";

  /**
   */
  @Expose
  @SerializedName("SupportConversationExternal")
  private ChatConversationSupportExternal supportConversationExternal;

  /**
   */
  @Expose
  @SerializedName("ChatConversationReference")
  private ChatConversationReference chatConversationReference;

  /**
   */
  public static BunqResponse<List<ChatConversation>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(ChatConversation.class, responseRaw);
  }

  public static BunqResponse<List<ChatConversation>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<ChatConversation>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   */
  public static BunqResponse<ChatConversation> get(Integer chatConversationId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), chatConversationId), params, customHeaders);

    return fromJson(ChatConversation.class, responseRaw);
  }
  public static BunqResponse<ChatConversation> get() {
    return get(null, null, null);
  }

  public static BunqResponse<ChatConversation> get(Integer chatConversationId) {
    return get(chatConversationId, null, null);
  }

  public static BunqResponse<ChatConversation> get(Integer chatConversationId, Map<String, String> params) {
    return get(chatConversationId, params, null);
  }

  /**
   */
  public ChatConversationSupportExternal getSupportConversationExternal() {
    return this.supportConversationExternal;
  }

  public void setSupportConversationExternal(ChatConversationSupportExternal supportConversationExternal) {
    this.supportConversationExternal = supportConversationExternal;
  }

  /**
   */
  public ChatConversationReference getChatConversationReference() {
    return this.chatConversationReference;
  }

  public void setChatConversationReference(ChatConversationReference chatConversationReference) {
    this.chatConversationReference = chatConversationReference;
  }

  /**
   */
  public BunqModel getReferencedObject() {
    if (this.supportConversationExternal != null) {
      return this.supportConversationExternal;
    }

    if (this.chatConversationReference != null) {
      return this.chatConversationReference;
    }

    throw new BunqException(ERROR_NULL_FIELDS);
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.supportConversationExternal != null) {
      return false;
    }

    if (this.chatConversationReference != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static ChatConversation fromJsonReader(JsonReader reader) {
    return fromJsonReader(ChatConversation.class, reader);
  }

}
