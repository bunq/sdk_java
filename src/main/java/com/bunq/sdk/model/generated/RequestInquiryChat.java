package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.BunqResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
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
   * Field constants.
   */
  public static final String FIELD_LAST_READ_MESSAGE_ID = "last_read_message_id";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/request-inquiry/%s/chat";
  private static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/request-inquiry/%s/chat/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/request-inquiry/%s/chat";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "RequestInquiryChat";

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

  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer monetaryAccountId, Integer requestInquiryId) {
    return create(apiContext, requestMap, userId, monetaryAccountId, requestInquiryId,
        new HashMap<>());
  }

  /**
   * Create a chat for a specific request inquiry.
   */
  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer monetaryAccountId, Integer requestInquiryId,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient
        .post(String.format(ENDPOINT_URL_CREATE, userId, monetaryAccountId, requestInquiryId),
            requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<RequestInquiryChat> update(ApiContext apiContext,
      Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId,
      Integer requestInquiryId, Integer requestInquiryChatId) {
    return update(apiContext, requestMap, userId, monetaryAccountId, requestInquiryId,
        requestInquiryChatId, new HashMap<>());
  }

  /**
   * Update the last read message in the chat of a specific request inquiry.
   */
  public static BunqResponse<RequestInquiryChat> update(ApiContext apiContext,
      Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId,
      Integer requestInquiryId, Integer requestInquiryChatId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.put(String
        .format(ENDPOINT_URL_UPDATE, userId, monetaryAccountId, requestInquiryId,
            requestInquiryChatId), requestBytes, customHeaders);

    return fromJson(RequestInquiryChat.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<List<RequestInquiryChat>> list(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId, Integer requestInquiryId) {
    return list(apiContext, userId, monetaryAccountId, requestInquiryId, new HashMap<>());
  }

  /**
   * Get the chat for a specific request inquiry.
   */
  public static BunqResponse<List<RequestInquiryChat>> list(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId, Integer requestInquiryId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId, requestInquiryId),
            customHeaders);

    return fromJsonList(RequestInquiryChat.class, responseRaw, OBJECT_TYPE);
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

}
