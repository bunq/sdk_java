package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.stream.JsonReader;

import java.util.Map;

/**
 * Fetch the raw content of an attachment with given ID. The raw content is the base64 of a
 * file, without any JSON wrapping.
 */
public class AttachmentConversationContent extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/chat-conversation/%s/attachment/%s/content";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "AttachmentConversationContent";

  /**
   * Get the raw content of a specific attachment.
   */
  public static BunqResponse<byte[]> list(Integer chatConversationId, Integer attachmentId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), chatConversationId, attachmentId), params, customHeaders);

    return new BunqResponse<>(responseRaw.getBodyBytes(), responseRaw.getHeaders());
  }
  public static BunqResponse<byte[]> list() {
    return list(null, null, null, null);
  }
  public static BunqResponse<byte[]> list(Integer chatConversationId) {
    return list(chatConversationId, null, null, null);
  }
  public static BunqResponse<byte[]> list(Integer chatConversationId, Integer attachmentId) {
    return list(chatConversationId, attachmentId, null, null);
  }
  public static BunqResponse<byte[]> list(Integer chatConversationId, Integer attachmentId, Map<String, String> params) {
    return list(chatConversationId, attachmentId, params, null);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static AttachmentConversationContent fromJsonReader(JsonReader reader) {
    return fromJsonReader(AttachmentConversationContent.class, reader);
  }

}
