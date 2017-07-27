package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.model.BunqModel;
import java.util.HashMap;
import java.util.Map;

/**
 * Fetch the raw content of an attachment with given ID. The raw content is the base64 of a
 * file, without any JSON wrapping.
 */
public class AttachmentConversationContent extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_LISTING = "user/%s/chat-conversation/%s/attachment/%s/content";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "AttachmentConversationContent";

  public static byte[] list(ApiContext apiContext, Integer userId, Integer chatConversationId,
      Integer attachmentId) {
    return list(apiContext, userId, chatConversationId, attachmentId, new HashMap<>());
  }

  /**
   * Get the raw content of a specific attachment.
   */
  public static byte[] list(ApiContext apiContext, Integer userId, Integer chatConversationId,
      Integer attachmentId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);

    return apiClient
        .get(String.format(ENDPOINT_URL_LISTING, userId, chatConversationId, attachmentId),
            customHeaders);
  }

}
