package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.NotificationFilterPush;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Manage the push notification filters for a user.
 */
public class NotificationFilterPushUser extends BunqModel {

    /**
     * Field constants.
     */
    public static final String FIELD_NOTIFICATION_FILTERS = "notification_filters";
    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_CREATE = "user/%s/notification-filter-push";
    protected static final String ENDPOINT_URL_LISTING = "user/%s/notification-filter-push";
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
    private List<NotificationFilterPush> notificationFilters;

    /**
     * The types of notifications that will result in a push notification for this user.
     */
    @Expose
    @SerializedName("notification_filters_field_for_request")
    private List<NotificationFilterPush> notificationFiltersFieldForRequest;

    public NotificationFilterPushUser() {
        this(null);
    }

    public NotificationFilterPushUser(List<NotificationFilterPush> notificationFilters) {
        this.notificationFiltersFieldForRequest = notificationFilters;
    }

    /**
     * @param notificationFilters The types of notifications that will result in a push notification
     *                            for this user.
     */
    public static BunqResponse<NotificationFilterPushUser> create(List<NotificationFilterPush> notificationFilters, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_NOTIFICATION_FILTERS, notificationFilters);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

        return fromJson(NotificationFilterPushUser.class, responseRaw, OBJECT_TYPE_POST);
    }

    public static BunqResponse<NotificationFilterPushUser> create() {
        return create(null, null);
    }

    public static BunqResponse<NotificationFilterPushUser> create(List<NotificationFilterPush> notificationFilters) {
        return create(notificationFilters, null);
    }

    /**
     *
     */
    public static BunqResponse<List<NotificationFilterPushUser>> list(Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

        return fromJsonList(NotificationFilterPushUser.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<List<NotificationFilterPushUser>> list() {
        return list(null, null);
    }

    public static BunqResponse<List<NotificationFilterPushUser>> list(Map<String, String> params) {
        return list(params, null);
    }

    /**
     *
     */
    public static NotificationFilterPushUser fromJsonReader(JsonReader reader) {
        return fromJsonReader(NotificationFilterPushUser.class, reader);
    }

    /**
     * The types of notifications that will result in a push notification for this user.
     */
    public List<NotificationFilterPush> getNotificationFilters() {
        return this.notificationFilters;
    }

    public void setNotificationFilters(List<NotificationFilterPush> notificationFilters) {
        this.notificationFilters = notificationFilters;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.notificationFilters != null) {
            return false;
        }

        return true;
    }

}
