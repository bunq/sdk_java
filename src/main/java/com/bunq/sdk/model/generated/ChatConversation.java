package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Manages user's conversations.
 */
public class ChatConversation extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_LISTING = "user/%s/chat-conversation";
  private static final String ENDPOINT_URL_READ = "user/%s/chat-conversation/%s";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "ChatConversation";

  public static BunqResponse<List<ChatConversation>> list(ApiContext apiContext, Integer userId) {
    return list(apiContext, userId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<List<ChatConversation>> list(ApiContext apiContext, Integer userId,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_LISTING, userId), customHeaders);

    return fromJsonList(ChatConversation.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<ChatConversation> get(ApiContext apiContext, Integer userId,
      Integer chatConversationId) {
    return get(apiContext, userId, chatConversationId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<ChatConversation> get(ApiContext apiContext, Integer userId,
      Integer chatConversationId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_READ, userId, chatConversationId), customHeaders);

    return fromJson(ChatConversation.class, responseRaw, OBJECT_TYPE);
  }

}
