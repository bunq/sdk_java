package com.bunq.sdk.model.core;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.generated.endpoint.NotificationFilterUrlMonetaryAccount;
import com.bunq.sdk.model.generated.object.NotificationFilterUrl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationFilterUrlMonetaryAccountInternal extends NotificationFilterUrlMonetaryAccount {
    /**
     * Field constants.
     */
    private static final String OBJECT_TYPE = "NotificationFilterUrl";

    /**
     * Create notification filters with list response type.
     */
    public static BunqResponse<List<NotificationFilterUrl>> createWithListResponse() {
        return createWithListResponse(null, new ArrayList<NotificationFilterUrl>());
    }

    /**
     * Create notification filters with list response type.
     */
    public static BunqResponse<List<NotificationFilterUrl>> createWithListResponse(
            Integer monetaryAccountId,
            List<NotificationFilterUrl> allNotificationFilter
    ) {
        return createWithListResponse(monetaryAccountId, allNotificationFilter, null);
    }

    /**
     * Create notification filters with list response type.
     */
    public static BunqResponse<List<NotificationFilterUrl>> createWithListResponse(
            Integer monetaryAccountId,
            List<NotificationFilterUrl> allNotificationFilter,
            Map<String, String> customHeaders
    ) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_NOTIFICATION_FILTERS, allNotificationFilter);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

        return NotificationFilterUrl.fromJsonList(NotificationFilterUrl.class, responseRaw, OBJECT_TYPE);
    }
}
