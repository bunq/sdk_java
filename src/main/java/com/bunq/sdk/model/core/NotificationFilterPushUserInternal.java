package com.bunq.sdk.model.core;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.generated.endpoint.NotificationFilterPushUser;
import com.bunq.sdk.model.generated.object.NotificationFilterPush;
import com.bunq.sdk.model.generated.object.NotificationFilterUrl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationFilterPushUserInternal extends NotificationFilterPushUser {
    /**
     * Field constants.
     */
    private static final String OBJECT_TYPE = "NotificationFilterPush";

    /**
     * Create notification filters with list response type.
     */
    public static BunqResponse<List<NotificationFilterPush>> createWithListResponse() {
        return createWithListResponse(new ArrayList<NotificationFilterPush>(), null);
    }

    /**
     * Create notification filters with list response type.
     */
    public static BunqResponse<List<NotificationFilterPush>> createWithListResponse(
            List<NotificationFilterPush> allNotificationFilter
    ) {
        return createWithListResponse(allNotificationFilter, null);
    }

    /**
     * Create notification filters with list response type.
     */
    public static BunqResponse<List<NotificationFilterPush>> createWithListResponse(
            List<NotificationFilterPush> allNotificationFilter,
            Map<String, String> customHeaders
    ) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_NOTIFICATION_FILTERS, allNotificationFilter);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

        return NotificationFilterUrl.fromJsonList(NotificationFilterPush.class, responseRaw, OBJECT_TYPE);
    }
}
