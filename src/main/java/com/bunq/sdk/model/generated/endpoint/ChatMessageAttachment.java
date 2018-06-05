package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.BunqId;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.Map;

/**
 * Create new messages holding file attachments.
 */
public class ChatMessageAttachment extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/chat-conversation/%s/message-attachment";

  /**
   * Field constants.
   */
  public static final String FIELD_ATTACHMENT = "attachment";

  /**
   * The id of the newly created chat message.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The attachment contained in this message.
   */
  @Expose
  @SerializedName("attachment_field_for_request")
  private BunqId attachmentFieldForRequest;

  public ChatMessageAttachment() {
    this(null);
  }

  public ChatMessageAttachment(BunqId attachment) {
    this.attachmentFieldForRequest = attachment;
  }

  /**
   * Create a new message holding a file attachment to a specific conversation.
   * @param attachment The attachment contained in this message.
   */
  public static BunqResponse<Integer> create(Integer chatConversationId, BunqId attachment, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_ATTACHMENT, attachment);

    byte[] requestBytes = determineRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), chatConversationId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null);
  }

  public static BunqResponse<Integer> create(Integer chatConversationId) {
    return create(chatConversationId, null, null);
  }

  public static BunqResponse<Integer> create(Integer chatConversationId, BunqId attachment) {
    return create(chatConversationId, attachment, null);
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

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static ChatMessageAttachment fromJsonReader(JsonReader reader) {
    return fromJsonReader(ChatMessageAttachment.class, reader);
  }

}
