package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.Amount;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to manage Slice groups.
 */
public class Registry extends BunqModel {

    /**
     * Field constants.
     */
    public static final String FIELD_CURRENCY = "currency";
    public static final String FIELD_TITLE = "title";
    public static final String FIELD_DESCRIPTION = "description";
    public static final String FIELD_STATUS = "status";
    public static final String FIELD_LAST_REGISTRY_ENTRY_SEEN_ID = "last_registry_entry_seen_id";
    public static final String FIELD_PREVIOUS_UPDATED_TIMESTAMP = "previous_updated_timestamp";
    public static final String FIELD_MEMBERSHIPS = "memberships";
    public static final String FIELD_MEMBERSHIPS_PREVIOUS = "memberships_previous";
    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_CREATE = "user/%s/registry";
    protected static final String ENDPOINT_URL_UPDATE = "user/%s/registry/%s";
    protected static final String ENDPOINT_URL_LISTING = "user/%s/registry";
    protected static final String ENDPOINT_URL_READ = "user/%s/registry/%s";
    protected static final String ENDPOINT_URL_DELETE = "user/%s/registry/%s";
    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_GET = "Registry";

    /**
     * The id of the Registry.
     */
    @Expose
    @SerializedName("id")
    private Integer id;

    /**
     * The timestamp of the Registry's creation.
     */
    @Expose
    @SerializedName("created")
    private String created;

    /**
     * The timestamp of the Registry's last update.
     */
    @Expose
    @SerializedName("updated")
    private String updated;

    /**
     * The currency for the Registry as an ISO 4217 formatted currency code.
     */
    @Expose
    @SerializedName("currency")
    private String currency;

    /**
     * The title of the Registry.
     */
    @Expose
    @SerializedName("title")
    private String title;

    /**
     * The status of the Registry.
     */
    @Expose
    @SerializedName("status")
    private String status;

    /**
     * The number of RegistryEntries in this Registry that the user has not seen.
     */
    @Expose
    @SerializedName("unseen_entries_count")
    private Integer unseenEntriesCount;

    /**
     * The total amount spent in this Registry since the last settlement.
     */
    @Expose
    @SerializedName("total_amount_spent")
    private Amount totalAmountSpent;

    /**
     * Whether the Registry has previously been settled.
     */
    @Expose
    @SerializedName("is_previously_settled")
    private Boolean isPreviouslySettled;

    /**
     * List of memberships to replace the current one.
     */
    @Expose
    @SerializedName("memberships")
    private List<RegistryMembership> memberships;

    /**
     * The settings for this Registry.
     */
    @Expose
    @SerializedName("setting")
    private RegistrySetting setting;

    /**
     * The ID of the registry that currently has auto_add_card_transaction set to ALL.
     */
    @Expose
    @SerializedName("registry_auto_add_card_transaction_enabled_id")
    private Integer registryAutoAddCardTransactionEnabledId;

    /**
     * The currency for the Registry as an ISO 4217 formatted currency code.
     */
    @Expose
    @SerializedName("currency_field_for_request")
    private String currencyFieldForRequest;

    /**
     * The title of the Registry.
     */
    @Expose
    @SerializedName("title_field_for_request")
    private String titleFieldForRequest;

    /**
     * A description about the Registry.
     */
    @Expose
    @SerializedName("description_field_for_request")
    private String descriptionFieldForRequest;

    /**
     * The status of the Registry.
     */
    @Expose
    @SerializedName("status_field_for_request")
    private String statusFieldForRequest;

    /**
     * The id of the last RegistryEntry that the user has seen.
     */
    @Expose
    @SerializedName("last_registry_entry_seen_id_field_for_request")
    private Integer lastRegistryEntrySeenIdFieldForRequest;

    /**
     * The previous updated timestamp that you received for this Registry.
     */
    @Expose
    @SerializedName("previous_updated_timestamp_field_for_request")
    private String previousUpdatedTimestampFieldForRequest;

    /**
     * New list of memberships.
     */
    @Expose
    @SerializedName("memberships_field_for_request")
    private List<RegistryMembership> membershipsFieldForRequest;

    /**
     * Previous list of memberships.
     */
    @Expose
    @SerializedName("memberships_previous_field_for_request")
    private List<RegistryMembership> membershipsPreviousFieldForRequest;

    public Registry() {
        this(null, null, null, null, null, null, null, null);
    }

    public Registry(String currency) {
        this(currency, null, null, null, null, null, null, null);
    }

    public Registry(String currency, String title) {
        this(currency, title, null, null, null, null, null, null);
    }

    public Registry(String currency, String title, String description) {
        this(currency, title, description, null, null, null, null, null);
    }

    public Registry(String currency, String title, String description, String status) {
        this(currency, title, description, status, null, null, null, null);
    }

    public Registry(String currency, String title, String description, String status, Integer lastRegistryEntrySeenId) {
        this(currency, title, description, status, lastRegistryEntrySeenId, null, null, null);
    }

    public Registry(String currency, String title, String description, String status, Integer lastRegistryEntrySeenId, String previousUpdatedTimestamp) {
        this(currency, title, description, status, lastRegistryEntrySeenId, previousUpdatedTimestamp, null, null);
    }

    public Registry(String currency, String title, String description, String status, Integer lastRegistryEntrySeenId, String previousUpdatedTimestamp, List<RegistryMembership> memberships) {
        this(currency, title, description, status, lastRegistryEntrySeenId, previousUpdatedTimestamp, memberships, null);
    }

    public Registry(String currency, String title, String description, String status, Integer lastRegistryEntrySeenId, String previousUpdatedTimestamp, List<RegistryMembership> memberships, List<RegistryMembership> membershipsPrevious) {
        this.currencyFieldForRequest = currency;
        this.titleFieldForRequest = title;
        this.descriptionFieldForRequest = description;
        this.statusFieldForRequest = status;
        this.lastRegistryEntrySeenIdFieldForRequest = lastRegistryEntrySeenId;
        this.previousUpdatedTimestampFieldForRequest = previousUpdatedTimestamp;
        this.membershipsFieldForRequest = memberships;
        this.membershipsPreviousFieldForRequest = membershipsPrevious;
    }

    /**
     * Create a new Slice group.
     *
     * @param currency                 The currency for the Registry as an ISO 4217 formatted currency code.
     * @param title                    The title of the Registry.
     * @param description              A description about the Registry.
     * @param status                   The status of the Registry.
     * @param lastRegistryEntrySeenId  The id of the last RegistryEntry that the user has seen.
     * @param previousUpdatedTimestamp The previous updated timestamp that you received for this
     *                                 Registry.
     * @param memberships              New list of memberships.
     * @param membershipsPrevious      Previous list of memberships.
     */
    public static BunqResponse<Integer> create(String currency, String title, String description, String status, Integer lastRegistryEntrySeenId, String previousUpdatedTimestamp, List<RegistryMembership> memberships, List<RegistryMembership> membershipsPrevious, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_CURRENCY, currency);
        requestMap.put(FIELD_TITLE, title);
        requestMap.put(FIELD_DESCRIPTION, description);
        requestMap.put(FIELD_STATUS, status);
        requestMap.put(FIELD_LAST_REGISTRY_ENTRY_SEEN_ID, lastRegistryEntrySeenId);
        requestMap.put(FIELD_PREVIOUS_UPDATED_TIMESTAMP, previousUpdatedTimestamp);
        requestMap.put(FIELD_MEMBERSHIPS, memberships);
        requestMap.put(FIELD_MEMBERSHIPS_PREVIOUS, membershipsPrevious);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

        return processForId(responseRaw);
    }

    public static BunqResponse<Integer> create() {
        return create(null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(String currency) {
        return create(currency, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(String currency, String title) {
        return create(currency, title, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(String currency, String title, String description) {
        return create(currency, title, description, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(String currency, String title, String description, String status) {
        return create(currency, title, description, status, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(String currency, String title, String description, String status, Integer lastRegistryEntrySeenId) {
        return create(currency, title, description, status, lastRegistryEntrySeenId, null, null, null, null);
    }

    public static BunqResponse<Integer> create(String currency, String title, String description, String status, Integer lastRegistryEntrySeenId, String previousUpdatedTimestamp) {
        return create(currency, title, description, status, lastRegistryEntrySeenId, previousUpdatedTimestamp, null, null, null);
    }

    public static BunqResponse<Integer> create(String currency, String title, String description, String status, Integer lastRegistryEntrySeenId, String previousUpdatedTimestamp, List<RegistryMembership> memberships) {
        return create(currency, title, description, status, lastRegistryEntrySeenId, previousUpdatedTimestamp, memberships, null, null);
    }

    public static BunqResponse<Integer> create(String currency, String title, String description, String status, Integer lastRegistryEntrySeenId, String previousUpdatedTimestamp, List<RegistryMembership> memberships, List<RegistryMembership> membershipsPrevious) {
        return create(currency, title, description, status, lastRegistryEntrySeenId, previousUpdatedTimestamp, memberships, membershipsPrevious, null);
    }

    /**
     * Update a specific Slice group.
     *
     * @param title                    The title of the Registry.
     * @param description              A description about the Registry.
     * @param status                   The status of the Registry.
     * @param lastRegistryEntrySeenId  The id of the last RegistryEntry that the user has seen.
     * @param previousUpdatedTimestamp The previous updated timestamp that you received for this
     *                                 Registry.
     * @param memberships              New list of memberships.
     * @param membershipsPrevious      Previous list of memberships.
     */
    public static BunqResponse<Integer> update(Integer registryId, String title, String description, String status, Integer lastRegistryEntrySeenId, String previousUpdatedTimestamp, List<RegistryMembership> memberships, List<RegistryMembership> membershipsPrevious, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_TITLE, title);
        requestMap.put(FIELD_DESCRIPTION, description);
        requestMap.put(FIELD_STATUS, status);
        requestMap.put(FIELD_LAST_REGISTRY_ENTRY_SEEN_ID, lastRegistryEntrySeenId);
        requestMap.put(FIELD_PREVIOUS_UPDATED_TIMESTAMP, previousUpdatedTimestamp);
        requestMap.put(FIELD_MEMBERSHIPS, memberships);
        requestMap.put(FIELD_MEMBERSHIPS_PREVIOUS, membershipsPrevious);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), registryId), requestBytes, customHeaders);

        return processForId(responseRaw);
    }

    public static BunqResponse<Integer> update(Integer registryId) {
        return update(registryId, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer registryId, String title) {
        return update(registryId, title, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer registryId, String title, String description) {
        return update(registryId, title, description, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer registryId, String title, String description, String status) {
        return update(registryId, title, description, status, null, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer registryId, String title, String description, String status, Integer lastRegistryEntrySeenId) {
        return update(registryId, title, description, status, lastRegistryEntrySeenId, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer registryId, String title, String description, String status, Integer lastRegistryEntrySeenId, String previousUpdatedTimestamp) {
        return update(registryId, title, description, status, lastRegistryEntrySeenId, previousUpdatedTimestamp, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer registryId, String title, String description, String status, Integer lastRegistryEntrySeenId, String previousUpdatedTimestamp, List<RegistryMembership> memberships) {
        return update(registryId, title, description, status, lastRegistryEntrySeenId, previousUpdatedTimestamp, memberships, null, null);
    }

    public static BunqResponse<Integer> update(Integer registryId, String title, String description, String status, Integer lastRegistryEntrySeenId, String previousUpdatedTimestamp, List<RegistryMembership> memberships, List<RegistryMembership> membershipsPrevious) {
        return update(registryId, title, description, status, lastRegistryEntrySeenId, previousUpdatedTimestamp, memberships, membershipsPrevious, null);
    }

    /**
     * Get a listing of all Slice groups.
     */
    public static BunqResponse<List<Registry>> list(Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

        return fromJsonList(Registry.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<List<Registry>> list() {
        return list(null, null);
    }

    public static BunqResponse<List<Registry>> list(Map<String, String> params) {
        return list(params, null);
    }

    /**
     * Get a specific Slice group.
     */
    public static BunqResponse<Registry> get(Integer registryId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), registryId), params, customHeaders);

        return fromJson(Registry.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<Registry> get() {
        return get(null, null, null);
    }

    public static BunqResponse<Registry> get(Integer registryId) {
        return get(registryId, null, null);
    }

    public static BunqResponse<Registry> get(Integer registryId, Map<String, String> params) {
        return get(registryId, params, null);
    }

    /**
     * Delete a specific Slice group.
     */
    public static BunqResponse<Registry> delete(Integer registryId, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), registryId), customHeaders);

        return new BunqResponse<>(null, responseRaw.getHeaders());
    }

    public static BunqResponse<Registry> delete(Integer registryId) {
        return delete(registryId, null);
    }

    /**
     *
     */
    public static Registry fromJsonReader(JsonReader reader) {
        return fromJsonReader(Registry.class, reader);
    }

    /**
     * The id of the Registry.
     */
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The timestamp of the Registry's creation.
     */
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * The timestamp of the Registry's last update.
     */
    public String getUpdated() {
        return this.updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    /**
     * The currency for the Registry as an ISO 4217 formatted currency code.
     */
    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * The title of the Registry.
     */
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * The status of the Registry.
     */
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * The number of RegistryEntries in this Registry that the user has not seen.
     */
    public Integer getUnseenEntriesCount() {
        return this.unseenEntriesCount;
    }

    public void setUnseenEntriesCount(Integer unseenEntriesCount) {
        this.unseenEntriesCount = unseenEntriesCount;
    }

    /**
     * The total amount spent in this Registry since the last settlement.
     */
    public Amount getTotalAmountSpent() {
        return this.totalAmountSpent;
    }

    public void setTotalAmountSpent(Amount totalAmountSpent) {
        this.totalAmountSpent = totalAmountSpent;
    }

    /**
     * Whether the Registry has previously been settled.
     */
    public Boolean getIsPreviouslySettled() {
        return this.isPreviouslySettled;
    }

    public void setIsPreviouslySettled(Boolean isPreviouslySettled) {
        this.isPreviouslySettled = isPreviouslySettled;
    }

    /**
     * List of memberships to replace the current one.
     */
    public List<RegistryMembership> getMemberships() {
        return this.memberships;
    }

    public void setMemberships(List<RegistryMembership> memberships) {
        this.memberships = memberships;
    }

    /**
     * The settings for this Registry.
     */
    public RegistrySetting getSetting() {
        return this.setting;
    }

    public void setSetting(RegistrySetting setting) {
        this.setting = setting;
    }

    /**
     * The ID of the registry that currently has auto_add_card_transaction set to ALL.
     */
    public Integer getRegistryAutoAddCardTransactionEnabledId() {
        return this.registryAutoAddCardTransactionEnabledId;
    }

    public void setRegistryAutoAddCardTransactionEnabledId(Integer registryAutoAddCardTransactionEnabledId) {
        this.registryAutoAddCardTransactionEnabledId = registryAutoAddCardTransactionEnabledId;
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

        if (this.currency != null) {
            return false;
        }

        if (this.title != null) {
            return false;
        }

        if (this.status != null) {
            return false;
        }

        if (this.unseenEntriesCount != null) {
            return false;
        }

        if (this.totalAmountSpent != null) {
            return false;
        }

        if (this.isPreviouslySettled != null) {
            return false;
        }

        if (this.memberships != null) {
            return false;
        }

        if (this.setting != null) {
            return false;
        }

        if (this.registryAutoAddCardTransactionEnabledId != null) {
            return false;
        }

        return true;
    }

}
