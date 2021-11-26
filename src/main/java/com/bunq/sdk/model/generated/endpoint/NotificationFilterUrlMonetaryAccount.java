package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.NotificationFilterUrl;
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
public class NotificationFilterUrlMonetaryAccount extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/notification-filter-url";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/notification-filter-url";

  /**
   * Field constants.
   */
  public static final String FIELD_NOTIFICATION_FILTERS = "notification_filters";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "NotificationFilterUrl";

  /**
   * The types of notifications that will result in a url notification for this monetary account.
   */
  @Expose
  @SerializedName("notification_filters")
  private List<NotificationFilterUrl> notificationFilters;

  /**
   * The types of notifications that will result in a url notification for this monetary account.
   */
  @Expose
  @SerializedName("notification_filters_field_for_request")
  private List<NotificationFilterUrl> notificationFiltersFieldForRequest;

  public NotificationFilterUrlMonetaryAccount() {
  this(null);
  }

  public NotificationFilterUrlMonetaryAccount(List<NotificationFilterUrl> notificationFilters) {
    this.notificationFiltersFieldForRequest = notificationFilters;
  }  /**
   * @param notificationFilters The types of notifications that will result in a url notification
   * for this monetary account.
   */
  public static BunqResponse<Integer> create(Integer monetaryAccountId, List<NotificationFilterUrl> notificationFilters, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_NOTIFICATION_FILTERS, notificationFilters);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null);
  }

  public static BunqResponse<Integer> create(Integer monetaryAccountId) {
    return create(monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer monetaryAccountId, List<NotificationFilterUrl> notificationFilters) {
    return create(monetaryAccountId, notificationFilters, null);
  }

  /**
   */
  public static BunqResponse<List<NotificationFilterUrlMonetaryAccount>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(NotificationFilterUrlMonetaryAccount.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NotificationFilterUrlMonetaryAccount>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<NotificationFilterUrlMonetaryAccount>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NotificationFilterUrlMonetaryAccount>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   * The types of notifications that will result in a url notification for this monetary account.
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
  public static NotificationFilterUrlMonetaryAccount fromJsonReader(JsonReader reader) {
    return fromJsonReader(NotificationFilterUrlMonetaryAccount.class, reader);
  }

}
