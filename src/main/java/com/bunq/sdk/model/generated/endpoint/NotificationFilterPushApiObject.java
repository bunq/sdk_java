package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.NotificationFilterPushObject;
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
 * Manage the push notification filters for a user.
 */
public class NotificationFilterPushApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/notification-filter-push";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/notification-filter-push";

  /**
   * Field constants.
   */
  public static final String FIELD_NOTIFICATION_FILTERS = "notification_filters";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_POST = "NotificationFilterPush";
  protected static final String OBJECT_TYPE_GET = "NotificationFilterPush";

  /**
   * The types of notifications that will result in a push notification for this user.
   */
  @Expose
  @SerializedName("notification_filters")
  private List<NotificationFilterPushObject> notificationFilters;

  /**
   * The types of notifications that will result in a push notification for this user.
   */
  @Expose
  @SerializedName("notification_filters_field_for_request")
  private List<NotificationFilterPushObject> notificationFiltersFieldForRequest;

  public NotificationFilterPushApiObject() {
  this(null);
  }

  public NotificationFilterPushApiObject(List<NotificationFilterPushObject> notificationFilters) {
    this.notificationFiltersFieldForRequest = notificationFilters;
  }  /**
   * @param notificationFilters The types of notifications that will result in a push notification
   * for this user.
   */
  public static BunqResponse<NotificationFilterPushApiObject> create(List<NotificationFilterPushObject> notificationFilters, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_NOTIFICATION_FILTERS, notificationFilters);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return fromJson(NotificationFilterPushApiObject.class, responseRaw, OBJECT_TYPE_POST);
  }

  public static BunqResponse<NotificationFilterPushApiObject> create() {
    return create(null, null);
  }

  public static BunqResponse<NotificationFilterPushApiObject> create(List<NotificationFilterPushObject> notificationFilters) {
    return create(notificationFilters, null);
  }

  /**
   */
  public static BunqResponse<List<NotificationFilterPushApiObject>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(NotificationFilterPushApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NotificationFilterPushApiObject>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<NotificationFilterPushApiObject>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The types of notifications that will result in a push notification for this user.
   */
  public List<NotificationFilterPushObject> getNotificationFilters() {
    return this.notificationFilters;
  }

  public void setNotificationFilters(List<NotificationFilterPushObject> notificationFilters) {
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
  public static NotificationFilterPushApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(NotificationFilterPushApiObject.class, reader);
  }

}
