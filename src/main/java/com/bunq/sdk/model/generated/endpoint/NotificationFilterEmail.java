package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.NotificationFilterEmail;
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
 * Manage the email notification filters for a user.
 */
public class NotificationFilterEmail extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/notification-filter-email";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/notification-filter-email";

  /**
   * Field constants.
   */
  public static final String FIELD_NOTIFICATION_FILTERS = "notification_filters";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_POST = "NotificationFilterEmail";
  protected static final String OBJECT_TYPE_GET = "NotificationFilterEmail";

  /**
   * The types of notifications that will result in a email notification for this user.
   */
  @Expose
  @SerializedName("notification_filters")
  private List<NotificationFilterEmail> notificationFilters;

  /**
   * The types of notifications that will result in a email notification for this user.
   */
  @Expose
  @SerializedName("notification_filters_field_for_request")
  private List<NotificationFilterEmail> notificationFiltersFieldForRequest;

  public NotificationFilterEmail() {
  this(null);
  }

  public NotificationFilterEmail(List<NotificationFilterEmail> notificationFilters) {
    this.notificationFiltersFieldForRequest = notificationFilters;
  }  /**
   * @param notificationFilters The types of notifications that will result in a email
   * notification for this user.
   */
  public static BunqResponse<NotificationFilterEmail> create(List<NotificationFilterEmail> notificationFilters, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_NOTIFICATION_FILTERS, notificationFilters);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return fromJson(NotificationFilterEmail.class, responseRaw, OBJECT_TYPE_POST);
  }

  public static BunqResponse<NotificationFilterEmail> create() {
    return create(null, null);
  }

  public static BunqResponse<NotificationFilterEmail> create(List<NotificationFilterEmail> notificationFilters) {
    return create(notificationFilters, null);
  }

  /**
   */
  public static BunqResponse<List<NotificationFilterEmail>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(NotificationFilterEmail.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NotificationFilterEmail>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<NotificationFilterEmail>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The types of notifications that will result in a email notification for this user.
   */
  public List<NotificationFilterEmail> getNotificationFilters() {
    return this.notificationFilters;
  }

  public void setNotificationFilters(List<NotificationFilterEmail> notificationFilters) {
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
  public static NotificationFilterEmail fromJsonReader(JsonReader reader) {
    return fromJsonReader(NotificationFilterEmail.class, reader);
  }

}
