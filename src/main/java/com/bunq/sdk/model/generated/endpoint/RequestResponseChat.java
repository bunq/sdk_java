package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Manage the chat connected to a request response. In the same way a request inquiry and a
 * request response are created together, so that each side of the interaction can work on a
 * different object, also a request inquiry chat and a request response chat are created at the
 * same time. See 'request-inquiry-chat' for the chat endpoint for the inquiring user.
 */
public class RequestResponseChat extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/request-response/%s/chat";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/request-response/%s/chat/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/request-response/%s/chat";

  /**
   * Field constants.
   */
  public static final String FIELD_LAST_READ_MESSAGE_ID = "last_read_message_id";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "RequestResponseChat";

  /**
   * The id of the newly created chat conversation.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp when the chat was created.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp when the chat was last updated.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The total number of messages in this conversation.
   */
  @Expose
  @SerializedName("unread_message_count")
  private Integer unreadMessageCount;

  /**
   * The id of the last read message.
   */
  @Expose
  @SerializedName("last_read_message_id_field_for_request")
  private Integer lastReadMessageIdFieldForRequest;

  public RequestResponseChat() {
    this(null);
  }

  public RequestResponseChat(Integer lastReadMessageId) {
    this.lastReadMessageIdFieldForRequest = lastReadMessageId;
  }

  /**
   * Create a chat for a specific request response.
   * @param lastReadMessageId The id of the last read message.
   */
  public static BunqResponse<Integer> create(Integer requestResponseId, Integer monetaryAccountId, Integer lastReadMessageId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_LAST_READ_MESSAGE_ID, lastReadMessageId);

    byte[] requestBytes = determineRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestResponseId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer requestResponseId) {
    return create(requestResponseId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer requestResponseId, Integer monetaryAccountId) {
    return create(requestResponseId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer requestResponseId, Integer monetaryAccountId, Integer lastReadMessageId) {
    return create(requestResponseId, monetaryAccountId, lastReadMessageId, null);
  }

  /**
   * Update the last read message in the chat of a specific request response.
   * @param lastReadMessageId The id of the last read message.
   */
  public static BunqResponse<Integer> update(Integer requestResponseId, Integer requestResponseChatId, Integer monetaryAccountId, Integer lastReadMessageId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_LAST_READ_MESSAGE_ID, lastReadMessageId);

    byte[] requestBytes = determineRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestResponseId, requestResponseChatId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer requestResponseId) {
    return update(requestResponseId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer requestResponseId, Integer requestResponseChatId) {
    return update(requestResponseId, requestResponseChatId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer requestResponseId, Integer requestResponseChatId, Integer monetaryAccountId) {
    return update(requestResponseId, requestResponseChatId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer requestResponseId, Integer requestResponseChatId, Integer monetaryAccountId, Integer lastReadMessageId) {
    return update(requestResponseId, requestResponseChatId, monetaryAccountId, lastReadMessageId, null);
  }

  /**
   * Get the chat for a specific request response.
   */
  public static BunqResponse<List<RequestResponseChat>> list(Integer requestResponseId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestResponseId), params, customHeaders);

    return fromJsonList(RequestResponseChat.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<RequestResponseChat>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<RequestResponseChat>> list(Integer requestResponseId) {
    return list(requestResponseId, null, null, null);
  }

  public static BunqResponse<List<RequestResponseChat>> list(Integer requestResponseId, Integer monetaryAccountId) {
    return list(requestResponseId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<RequestResponseChat>> list(Integer requestResponseId, Integer monetaryAccountId, Map<String, String> params) {
    return list(requestResponseId, monetaryAccountId, params, null);
  }

  /**
   * The id of the newly created chat conversation.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp when the chat was created.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp when the chat was last updated.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The total number of messages in this conversation.
   */
  public Integer getUnreadMessageCount() {
    return this.unreadMessageCount;
  }

  public void setUnreadMessageCount(Integer unreadMessageCount) {
    this.unreadMessageCount = unreadMessageCount;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.created != null) {
      return false;
    }

    if (this.updated != null) {
      return false;
    }

    if (this.unreadMessageCount != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static RequestResponseChat fromJsonReader(JsonReader reader) {
    return fromJsonReader(RequestResponseChat.class, reader);
  }

}
