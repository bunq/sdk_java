package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.Map;

/**
 * Endpoint for the type of chat message that carries text.
 */
public class ChatMessageText extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/chat-conversation/%s/message-text";

  /**
   * Field constants.
   */
  public static final String FIELD_TEXT = "text";

  /**
   * The id of the newly created chat message.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The textual content of this message. Cannot be empty.
   */
  @Expose
  @SerializedName("text_field_for_request")
  private String textFieldForRequest;

  public ChatMessageText() {
    this(null);
  }

  public ChatMessageText(String text) {
    this.textFieldForRequest = text;
  }

  /**
   * Add a new text message to a specific conversation.
   * @param text The textual content of this message. Cannot be empty.
   */
  public static BunqResponse<Integer> create(Integer chatConversationId, String text, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_TEXT, text);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), chatConversationId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null);
  }

  public static BunqResponse<Integer> create(Integer chatConversationId) {
    return create(chatConversationId, null, null);
  }

  public static BunqResponse<Integer> create(Integer chatConversationId, String text) {
    return create(chatConversationId, text, null);
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
  public static ChatMessageText fromJsonReader(JsonReader reader) {
    return fromJsonReader(ChatMessageText.class, reader);
  }

}
