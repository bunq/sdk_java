package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.RegistrySettlementItem;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to settle a Slice group.
 */
public class RegistrySettlement extends BunqModel {

    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_CREATE = "user/%s/registry/%s/registry-settlement";
    protected static final String ENDPOINT_URL_READ = "user/%s/registry/%s/registry-settlement/%s";
    protected static final String ENDPOINT_URL_LISTING = "user/%s/registry/%s/registry-settlement";

    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_GET = "RegistrySettlement";

    /**
     * The id of the RegistrySettlement.
     */
    @Expose
    @SerializedName("id")
    private Integer id;

    /**
     * The timestamp of the RegistrySettlement's creation.
     */
    @Expose
    @SerializedName("created")
    private String created;

    /**
     * The timestamp of the RegistrySettlement's last update.
     */
    @Expose
    @SerializedName("updated")
    private String updated;

    /**
     * The timestamp of the Registry's settlement.
     */
    @Expose
    @SerializedName("settlement_time")
    private String settlementTime;

    /**
     * The total amount spent for the RegistrySettlement.
     */
    @Expose
    @SerializedName("total_amount_spent")
    private Amount totalAmountSpent;

    /**
     * The number of RegistryEntry's associated with this RegistrySettlement.
     */
    @Expose
    @SerializedName("number_of_entries")
    private Integer numberOfEntries;

    /**
     * The membership of the user that settled the Registry.
     */
    @Expose
    @SerializedName("settled_by_alias")
    private RegistryMembership settledByAlias;

    /**
     * The membership of the user that has settled the registry.
     */
    @Expose
    @SerializedName("membership_settled")
    private RegistryMembership membershipSettled;

    /**
     * List of RegistrySettlementItems
     */
    @Expose
    @SerializedName("items")
    private List<RegistrySettlementItem> items;

    /**
     * Create a new Slice group settlement.
     */
    public static BunqResponse<Integer> create(Integer registryId, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), registryId), requestBytes, customHeaders);

        return processForId(responseRaw);
    }

    public static BunqResponse<Integer> create() {
        return create(null, null);
    }

    public static BunqResponse<Integer> create(Integer registryId) {
        return create(registryId, null);
    }

    /**
     * Get a specific Slice group settlement.
     */
    public static BunqResponse<RegistrySettlement> get(Integer registryId, Integer registrySettlementId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), registryId, registrySettlementId), params, customHeaders);

        return fromJson(RegistrySettlement.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<RegistrySettlement> get() {
        return get(null, null, null, null);
    }

    public static BunqResponse<RegistrySettlement> get(Integer registryId) {
        return get(registryId, null, null, null);
    }

    public static BunqResponse<RegistrySettlement> get(Integer registryId, Integer registrySettlementId) {
        return get(registryId, registrySettlementId, null, null);
    }

    public static BunqResponse<RegistrySettlement> get(Integer registryId, Integer registrySettlementId, Map<String, String> params) {
        return get(registryId, registrySettlementId, params, null);
    }

    /**
     * Get a listing of all Slice group settlements.
     */
    public static BunqResponse<List<RegistrySettlement>> list(Integer registryId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), registryId), params, customHeaders);

        return fromJsonList(RegistrySettlement.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<List<RegistrySettlement>> list() {
        return list(null, null, null);
    }

    public static BunqResponse<List<RegistrySettlement>> list(Integer registryId) {
        return list(registryId, null, null);
    }

    public static BunqResponse<List<RegistrySettlement>> list(Integer registryId, Map<String, String> params) {
        return list(registryId, params, null);
    }

    /**
     *
     */
    public static RegistrySettlement fromJsonReader(JsonReader reader) {
        return fromJsonReader(RegistrySettlement.class, reader);
    }

    /**
     * The id of the RegistrySettlement.
     */
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The timestamp of the RegistrySettlement's creation.
     */
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * The timestamp of the RegistrySettlement's last update.
     */
    public String getUpdated() {
        return this.updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    /**
     * The timestamp of the Registry's settlement.
     */
    public String getSettlementTime() {
        return this.settlementTime;
    }

    public void setSettlementTime(String settlementTime) {
        this.settlementTime = settlementTime;
    }

    /**
     * The total amount spent for the RegistrySettlement.
     */
    public Amount getTotalAmountSpent() {
        return this.totalAmountSpent;
    }

    public void setTotalAmountSpent(Amount totalAmountSpent) {
        this.totalAmountSpent = totalAmountSpent;
    }

    /**
     * The number of RegistryEntry's associated with this RegistrySettlement.
     */
    public Integer getNumberOfEntries() {
        return this.numberOfEntries;
    }

    public void setNumberOfEntries(Integer numberOfEntries) {
        this.numberOfEntries = numberOfEntries;
    }

    /**
     * The membership of the user that settled the Registry.
     */
    public RegistryMembership getSettledByAlias() {
        return this.settledByAlias;
    }

    public void setSettledByAlias(RegistryMembership settledByAlias) {
        this.settledByAlias = settledByAlias;
    }

    /**
     * The membership of the user that has settled the registry.
     */
    public RegistryMembership getMembershipSettled() {
        return this.membershipSettled;
    }

    public void setMembershipSettled(RegistryMembership membershipSettled) {
        this.membershipSettled = membershipSettled;
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
        if (this.id != null) {
            return false;
        }

        if (this.created != null) {
            return false;
        }

        if (this.updated != null) {
            return false;
        }

        if (this.settlementTime != null) {
            return false;
        }

        if (this.totalAmountSpent != null) {
            return false;
        }

        if (this.numberOfEntries != null) {
            return false;
        }

        if (this.settledByAlias != null) {
            return false;
        }

        if (this.membershipSettled != null) {
            return false;
        }

        if (this.items != null) {
            return false;
        }

        return true;
    }

}
