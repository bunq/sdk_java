package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.RegistrySettlementItem;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.List;
import java.util.Map;

/**
 * Used to manage pending Slice group settlements.
 */
public class RegistrySettlementPending extends BunqModel {

    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_LISTING = "user/%s/registry/%s/registry-settlement-pending";

    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_GET = "RegistrySettlementPending";

    /**
     * List of RegistrySettlementItems
     */
    @Expose
    @SerializedName("items")
    private List<RegistrySettlementItem> items;

    /**
     * Get a listing of all pending Slice group settlements.
     */
    public static BunqResponse<List<RegistrySettlementPending>> list(Integer registryId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), registryId), params, customHeaders);

        return fromJsonList(RegistrySettlementPending.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<List<RegistrySettlementPending>> list() {
        return list(null, null, null);
    }

    public static BunqResponse<List<RegistrySettlementPending>> list(Integer registryId) {
        return list(registryId, null, null);
    }

    public static BunqResponse<List<RegistrySettlementPending>> list(Integer registryId, Map<String, String> params) {
        return list(registryId, params, null);
    }

    /**
     *
     */
    public static RegistrySettlementPending fromJsonReader(JsonReader reader) {
        return fromJsonReader(RegistrySettlementPending.class, reader);
    }

    /**
     * List of RegistrySettlementItems
     */
    public List<RegistrySettlementItem> getItems() {
        return this.items;
    }

    public void setItems(List<RegistrySettlementItem> items) {
        this.items = items;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.items != null) {
            return false;
        }

        return true;
    }

}
