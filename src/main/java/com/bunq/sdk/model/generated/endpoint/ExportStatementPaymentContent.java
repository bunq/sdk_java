package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.stream.JsonReader;

import java.util.Map;

/**
 * Fetch the raw content of a payment statement export.
 */
public class ExportStatementPaymentContent extends BunqModel {

    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/event/%s/statement/%s/content";

    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_GET = "ExportStatementPayment";

    /**
     *
     */
    public static BunqResponse<byte[]> list(Integer eventId, Integer statementId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), eventId, statementId), params, customHeaders);

        return new BunqResponse<>(responseRaw.getBodyBytes(), responseRaw.getHeaders());
    }

    public static BunqResponse<byte[]> list() {
        return list(null, null, null, null, null);
    }

    public static BunqResponse<byte[]> list(Integer eventId) {
        return list(eventId, null, null, null, null);
    }

    public static BunqResponse<byte[]> list(Integer eventId, Integer statementId) {
        return list(eventId, statementId, null, null, null);
    }

    public static BunqResponse<byte[]> list(Integer eventId, Integer statementId, Integer monetaryAccountId) {
        return list(eventId, statementId, monetaryAccountId, null, null);
    }

    public static BunqResponse<byte[]> list(Integer eventId, Integer statementId, Integer monetaryAccountId, Map<String, String> params) {
        return list(eventId, statementId, monetaryAccountId, params, null);
    }

    /**
     *
     */
    public static ExportStatementPaymentContent fromJsonReader(JsonReader reader) {
        return fromJsonReader(ExportStatementPaymentContent.class, reader);
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        return true;
    }

}
