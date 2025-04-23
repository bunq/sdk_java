package com.bunq.sdk.model.core;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.generated.endpoint.NotificationFilterUrlMonetaryAccountApiObject;
import com.bunq.sdk.model.generated.object.NotificationFilterUrlObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationFilterUrlMonetaryAccountInternal extends NotificationFilterUrlMonetaryAccountApiObject {
    /**
     * Field constants.
     */
    private static final String OBJECT_TYPE = "NotificationFilterUrl";

    /**
     * Create notification filters with list response type.
     */
    public static BunqResponse<List<NotificationFilterUrlObject>> createWithListResponse() {
        return createWithListResponse(null, new ArrayList<NotificationFilterUrlObject>());
    }

    /**
     * Create notification filters with list response type.
     */
    public static BunqResponse<List<NotificationFilterUrlObject>> createWithListResponse(
            Integer monetaryAccountId,
            List<NotificationFilterUrlObject> allNotificationFilter
    ) {
        return createWithListResponse(monetaryAccountId, allNotificationFilter, null);
    }

    /**
     * Create notification filters with list response type.
     */
    public static BunqResponse<List<NotificationFilterUrlObject>> createWithListResponse(
            Integer monetaryAccountId,
            List<NotificationFilterUrlObject> allNotificationFilter,
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

        return NotificationFilterUrlObject.fromJsonList(NotificationFilterUrlObject.class, responseRaw, OBJECT_TYPE);
    }
}
