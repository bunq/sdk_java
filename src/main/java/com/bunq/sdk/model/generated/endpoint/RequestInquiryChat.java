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
 * Manage the chat connected to a request inquiry. In the same way a request inquiry and a
 * request response are created together, so that each side of the interaction can work on a
 * different object, also a request inquiry chat and a request response chat are created at the
 * same time. See 'request-response-chat' for the chat endpoint for the responding user.
 */
public class RequestInquiryChat extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/request-inquiry/%s/chat";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/request-inquiry/%s/chat/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/request-inquiry/%s/chat";

  /**
   * Field constants.
   */
  public static final String FIELD_LAST_READ_MESSAGE_ID = "last_read_message_id";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "RequestInquiryChat";

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

  public RequestInquiryChat() {
    this(null);
  }

  public RequestInquiryChat(Integer lastReadMessageId) {
    this.lastReadMessageIdFieldForRequest = lastReadMessageId;
  }

  /**
   * Create a chat for a specific request inquiry.
   * @param lastReadMessageId The id of the last read message.
   */
  public static BunqResponse<Integer> create(Integer requestInquiryId, Integer monetaryAccountId, Integer lastReadMessageId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_LAST_READ_MESSAGE_ID, lastReadMessageId);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestInquiryId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer requestInquiryId) {
    return create(requestInquiryId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer requestInquiryId, Integer monetaryAccountId) {
    return create(requestInquiryId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer requestInquiryId, Integer monetaryAccountId, Integer lastReadMessageId) {
    return create(requestInquiryId, monetaryAccountId, lastReadMessageId, null);
  }

  /**
   * Update the last read message in the chat of a specific request inquiry.
   * @param lastReadMessageId The id of the last read message.
   */
  public static BunqResponse<Integer> update(Integer requestInquiryId, Integer requestInquiryChatId, Integer monetaryAccountId, Integer lastReadMessageId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_LAST_READ_MESSAGE_ID, lastReadMessageId);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestInquiryId, requestInquiryChatId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer requestInquiryId) {
    return update(requestInquiryId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer requestInquiryId, Integer requestInquiryChatId) {
    return update(requestInquiryId, requestInquiryChatId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer requestInquiryId, Integer requestInquiryChatId, Integer monetaryAccountId) {
    return update(requestInquiryId, requestInquiryChatId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer requestInquiryId, Integer requestInquiryChatId, Integer monetaryAccountId, Integer lastReadMessageId) {
    return update(requestInquiryId, requestInquiryChatId, monetaryAccountId, lastReadMessageId, null);
  }

  /**
   * Get the chat for a specific request inquiry.
   */
  public static BunqResponse<List<RequestInquiryChat>> list(Integer requestInquiryId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), requestInquiryId), params, customHeaders);

    return fromJsonList(RequestInquiryChat.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<RequestInquiryChat>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<RequestInquiryChat>> list(Integer requestInquiryId) {
    return list(requestInquiryId, null, null, null);
  }

  public static BunqResponse<List<RequestInquiryChat>> list(Integer requestInquiryId, Integer monetaryAccountId) {
    return list(requestInquiryId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<RequestInquiryChat>> list(Integer requestInquiryId, Integer monetaryAccountId, Map<String, String> params) {
    return list(requestInquiryId, monetaryAccountId, params, null);
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
  public static RequestInquiryChat fromJsonReader(JsonReader reader) {
    return fromJsonReader(RequestInquiryChat.class, reader);
  }

}
