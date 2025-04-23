package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.NotificationFilterObject;
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
 * Manage the url notification filters for a user.
 */
public class NotificationFilterFailureApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/notification-filter-failure";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/notification-filter-failure";

  /**
   * Field constants.
   */
  public static final String FIELD_NOTIFICATION_FILTER_FAILED_IDS = "notification_filter_failed_ids";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "NotificationFilterFailure";

  /**
   * The types of notifications that will result in a url notification for this user.
   */
  @Expose
  @SerializedName("notification_filters")
  private List<NotificationFilterObject> notificationFilters;

  /**
   * The category of the failed notification.
   */
  @Expose
  @SerializedName("category")
  private String category;

  /**
   * The event type of the failed notification.
   */
  @Expose
  @SerializedName("event_type")
  private String eventType;

  /**
   * The object id used to generate the body of the notification.
   */
  @Expose
  @SerializedName("object_id")
  private Integer objectId;

  /**
   * The exception bunq encountered when processing the callback.
   */
  @Expose
  @SerializedName("exception_message")
  private String exceptionMessage;

  /**
   * The response code (or null) received from the endpoint.
   */
  @Expose
  @SerializedName("response_code")
  private Integer responseCode;

  /**
   * The IDs to retry.
   */
  @Expose
  @SerializedName("notification_filter_failed_ids_field_for_request")
  private String notificationFilterFailedIdsFieldForRequest;

  public NotificationFilterFailureApiObject() {
  this(null);
  }

  public NotificationFilterFailureApiObject(String notificationFilterFailedIds) {
    this.notificationFilterFailedIdsFieldForRequest = notificationFilterFailedIds;
  }  /**
   * @param notificationFilterFailedIds The IDs to retry.
   */
  public static BunqResponse<Integer> create(String notificationFilterFailedIds, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_NOTIFICATION_FILTER_FAILED_IDS, notificationFilterFailedIds);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null);
  }

  public static BunqResponse<Integer> create(String notificationFilterFailedIds) {
    return create(notificationFilterFailedIds, null);
  }

  /**
   */
  public static BunqResponse<List<NotificationFilterFailureApiObject>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(NotificationFilterFailureApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NotificationFilterFailureApiObject>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<NotificationFilterFailureApiObject>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The types of notifications that will result in a url notification for this user.
   */
  public List<NotificationFilterObject> getNotificationFilters() {
    return this.notificationFilters;
  }

  public void setNotificationFilters(List<NotificationFilterObject> notificationFilters) {
    this.notificationFilters = notificationFilters;
  }

  /**
   * The category of the failed notification.
   */
  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * The event type of the failed notification.
   */
  public String getEventType() {
    return this.eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  /**
   * The object id used to generate the body of the notification.
   */
  public Integer getObjectId() {
    return this.objectId;
  }

  public void setObjectId(Integer objectId) {
    this.objectId = objectId;
  }

  /**
   * The exception bunq encountered when processing the callback.
   */
  public String getExceptionMessage() {
    return this.exceptionMessage;
  }

  public void setExceptionMessage(String exceptionMessage) {
    this.exceptionMessage = exceptionMessage;
  }

  /**
   * The response code (or null) received from the endpoint.
   */
  public Integer getResponseCode() {
    return this.responseCode;
  }

  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.notificationFilters != null) {
      return false;
    }

    if (this.category != null) {
      return false;
    }

    if (this.eventType != null) {
      return false;
    }

    if (this.objectId != null) {
      return false;
    }

    if (this.exceptionMessage != null) {
      return false;
    }

    if (this.responseCode != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static NotificationFilterFailureApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(NotificationFilterFailureApiObject.class, reader);
  }

}
