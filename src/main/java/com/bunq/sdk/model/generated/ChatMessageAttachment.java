package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.BunqResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/**
 * Create new messages holding file attachments.
 */
public class ChatMessageAttachment extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_CLIENT_MESSAGE_UUID = "client_message_uuid";
  public static final String FIELD_ATTACHMENT = "attachment";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/chat-conversation/%s/message-attachment";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "Id";

  /**
   * The id of the newly created chat message.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer chatConversationId) {
    return create(apiContext, requestMap, userId, chatConversationId, new HashMap<>());
  }

  /**
   * Create a new message holding a file attachment to a specific conversation.
   */
  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer chatConversationId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient
        .post(String.format(ENDPOINT_URL_CREATE, userId, chatConversationId), requestBytes,
            customHeaders);

    return processForId(responseRaw);
  }

  /**
   * The id of the newly created chat message.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

}
