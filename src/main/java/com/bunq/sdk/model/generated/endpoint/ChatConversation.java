package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.AnchorObjectInterface;
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
import javax.lang.model.type.NullType;

/**
 * Manages user's conversations.
 */
public class ChatConversation extends BunqModel implements AnchorObjectInterface {

  /**
   * Error constants.
   */
  private static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_LISTING = "user/%s/chat-conversation";
  private static final String ENDPOINT_URL_READ = "user/%s/chat-conversation/%s";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "ChatConversation";

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

  public static BunqResponse<List<ChatConversation>> list(ApiContext apiContext, Integer userId) {
    return list(apiContext, userId, new HashMap<>());
  }

  public static BunqResponse<List<ChatConversation>> list(ApiContext apiContext, Integer userId, Map<String, String> params) {
    return list(apiContext, userId, params, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<List<ChatConversation>> list(ApiContext apiContext, Integer userId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId), params, customHeaders);

    return fromJsonList(ChatConversation.class, responseRaw);
  }

  public static BunqResponse<ChatConversation> get(ApiContext apiContext, Integer userId, Integer chatConversationId) {
    return get(apiContext, userId, chatConversationId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<ChatConversation> get(ApiContext apiContext, Integer userId, Integer chatConversationId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userId, chatConversationId), new HashMap<>(), customHeaders);

    return fromJson(ChatConversation.class, responseRaw);
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
