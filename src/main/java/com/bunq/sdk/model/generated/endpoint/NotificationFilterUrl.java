package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.NotificationFilterUrlObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Manage the url notification filters for a user.
 */
public class NotificationFilterUrl extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/notification-filter-url";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/notification-filter-url";

  /**
   * Field constants.
   */
  public static final String FIELD_NOTIFICATION_FILTERS = "notification_filters";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "NotificationFilterUrl";

  /**
   * The types of notifications that will result in a url notification for this user.
   */
  @Expose
  @SerializedName("notification_filters")
  private List<NotificationFilterUrl> notificationFilters;

  /**
   * The types of notifications that will result in a url notification for this user.
   */
  @Expose
  @SerializedName("notification_filters_field_for_request")
  private List<NotificationFilterUrl> notificationFiltersFieldForRequest;

  public NotificationFilterUrl() {
  this(null);
  }

  public NotificationFilterUrl(List<NotificationFilterUrl> notificationFilters) {
    this.notificationFiltersFieldForRequest = notificationFilters;
  }  /**
   * @param notificationFilters The types of notifications that will result in a url notification
   * for this user.
   */
  public static BunqResponse<Integer> create(List<NotificationFilterUrl> notificationFilters, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_NOTIFICATION_FILTERS, notificationFilters);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null);
  }

  public static BunqResponse<Integer> create(List<NotificationFilterUrl> notificationFilters) {
    return create(notificationFilters, null);
  }

  /**
   */
  public static BunqResponse<List<NotificationFilterUrlObject>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(NotificationFilterUrlObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NotificationFilterUrlObject>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<NotificationFilterUrlObject>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The types of notifications that will result in a url notification for this user.
   */
  public List<NotificationFilterUrl> getNotificationFilters() {
    return this.notificationFilters;
  }

  public void setNotificationFilters(List<NotificationFilterUrl> notificationFilters) {
    this.notificationFilters = notificationFilters;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.notificationFilters != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static NotificationFilterUrlObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(NotificationFilterUrlObject.class, reader);
  }

}
