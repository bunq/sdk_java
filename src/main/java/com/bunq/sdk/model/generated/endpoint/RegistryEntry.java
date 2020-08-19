package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to manage Slice group payment.
 */
public class RegistryEntry extends BunqModel {

    /**
     * Field constants.
     */
    public static final String FIELD_ALIAS_OWNER = "alias_owner";
    public static final String FIELD_AMOUNT = "amount";
    public static final String FIELD_OBJECT_REFERENCE = "object_reference";
    public static final String FIELD_DESCRIPTION = "description";
    public static final String FIELD_ALLOCATIONS = "allocations";
    public static final String FIELD_ATTACHMENT = "attachment";
    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_CREATE = "user/%s/registry/%s/registry-entry";
    protected static final String ENDPOINT_URL_UPDATE = "user/%s/registry/%s/registry-entry/%s";
    protected static final String ENDPOINT_URL_LISTING = "user/%s/registry/%s/registry-entry";
    protected static final String ENDPOINT_URL_READ = "user/%s/registry/%s/registry-entry/%s";
    protected static final String ENDPOINT_URL_DELETE = "user/%s/registry/%s/registry-entry/%s";
    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_GET = "RegistryEntry";

    /**
     * The id of the RegistryEntry.
     */
    @Expose
    @SerializedName("id")
    private Integer id;

    /**
     * The timestamp of the MonetaryAccountBank's creation.
     */
    @Expose
    @SerializedName("created")
    private String created;

    /**
     * The timestamp of the MonetaryAccountBank's last update.
     */
    @Expose
    @SerializedName("updated")
    private String updated;

    /**
     * The id of the Registry.
     */
    @Expose
    @SerializedName("registry_id")
    private Integer registryId;

    /**
     * The status of the RegistryEntry.
     */
    @Expose
    @SerializedName("status")
    private String status;

    /**
     * The Amount of the RegistryEntry.
     */
    @Expose
    @SerializedName("amount")
    private Amount amount;

    /**
     * A description about the RegistryEntry.
     */
    @Expose
    @SerializedName("description")
    private String description;

    /**
     * The RegistryEntry type. AUTO if created by Auto Slice, MANUAL for manually added entries.
     */
    @Expose
    @SerializedName("type")
    private String type;

    /**
     * The LabelUser with the public information of the party of this RegistryEntry.
     */
    @Expose
    @SerializedName("alias")
    private LabelUser alias;

    /**
     * The LabelUser with the public information of the counter party of this RegistryEntry.
     */
    @Expose
    @SerializedName("counterparty_alias")
    private LabelUser counterpartyAlias;

    /**
     * The LabelUser with the public information of the User that created the RegistryEntry.
     */
    @Expose
    @SerializedName("user_alias_created")
    private LabelUser userAliasCreated;

    /**
     * The membership of the creator.
     */
    @Expose
    @SerializedName("membership_created")
    private RegistryMembership membershipCreated;

    /**
     * The membership of the owner.
     */
    @Expose
    @SerializedName("membership_owned")
    private RegistryMembership membershipOwned;

    /**
     * An array of AllocationItems.
     */
    @Expose
    @SerializedName("allocations")
    private List<AllocationItem> allocations;

    /**
     * The attachments attached to the payment.
     */
    @Expose
    @SerializedName("attachment")
    private List<RegistryEntryAttachment> attachment;

    /**
     * The Alias of the party we are allocating money for.
     */
    @Expose
    @SerializedName("alias_owner_field_for_request")
    private Pointer aliasOwnerFieldForRequest;

    /**
     * The Amount of the RegistryEntry.
     */
    @Expose
    @SerializedName("amount_field_for_request")
    private Amount amountFieldForRequest;

    /**
     * The object linked to the RegistryEntry.
     */
    @Expose
    @SerializedName("object_reference_field_for_request")
    private RegistryEntryReference objectReferenceFieldForRequest;

    /**
     * A description about the RegistryEntry.
     */
    @Expose
    @SerializedName("description_field_for_request")
    private String descriptionFieldForRequest;

    /**
     * An array of AllocationItems.
     */
    @Expose
    @SerializedName("allocations_field_for_request")
    private List<AllocationItem> allocationsFieldForRequest;

    /**
     * The attachments attached to the payment.
     */
    @Expose
    @SerializedName("attachment_field_for_request")
    private List<RegistryEntryAttachment> attachmentFieldForRequest;

    public RegistryEntry() {
        this(null, null, null, null, null, null);
    }

    public RegistryEntry(Amount amount) {
        this(amount, null, null, null, null, null);
    }

    public RegistryEntry(Amount amount, List<AllocationItem> allocations) {
        this(amount, allocations, null, null, null, null);
    }

    public RegistryEntry(Amount amount, List<AllocationItem> allocations, Pointer aliasOwner) {
        this(amount, allocations, aliasOwner, null, null, null);
    }

    public RegistryEntry(Amount amount, List<AllocationItem> allocations, Pointer aliasOwner, RegistryEntryReference objectReference) {
        this(amount, allocations, aliasOwner, objectReference, null, null);
    }

    public RegistryEntry(Amount amount, List<AllocationItem> allocations, Pointer aliasOwner, RegistryEntryReference objectReference, String description) {
        this(amount, allocations, aliasOwner, objectReference, description, null);
    }

    public RegistryEntry(Amount amount, List<AllocationItem> allocations, Pointer aliasOwner, RegistryEntryReference objectReference, String description, List<RegistryEntryAttachment> attachment) {
        this.aliasOwnerFieldForRequest = aliasOwner;
        this.amountFieldForRequest = amount;
        this.objectReferenceFieldForRequest = objectReference;
        this.descriptionFieldForRequest = description;
        this.allocationsFieldForRequest = allocations;
        this.attachmentFieldForRequest = attachment;
    }

    /**
     * Create a new Slice group payment.
     *
     * @param amount          The Amount of the RegistryEntry.
     * @param allocations     An array of AllocationItems.
     * @param aliasOwner      The Alias of the party we are allocating money for.
     * @param objectReference The object linked to the RegistryEntry.
     * @param description     A description about the RegistryEntry.
     * @param attachment      The attachments attached to the payment.
     */
    public static BunqResponse<Integer> create(Integer registryId, Amount amount, List<AllocationItem> allocations, Pointer aliasOwner, RegistryEntryReference objectReference, String description, List<RegistryEntryAttachment> attachment, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_ALIAS_OWNER, aliasOwner);
        requestMap.put(FIELD_AMOUNT, amount);
        requestMap.put(FIELD_OBJECT_REFERENCE, objectReference);
        requestMap.put(FIELD_DESCRIPTION, description);
        requestMap.put(FIELD_ALLOCATIONS, allocations);
        requestMap.put(FIELD_ATTACHMENT, attachment);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), registryId), requestBytes, customHeaders);

        return processForId(responseRaw);
    }

    public static BunqResponse<Integer> create() {
        return create(null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer registryId) {
        return create(registryId, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer registryId, Amount amount) {
        return create(registryId, amount, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer registryId, Amount amount, List<AllocationItem> allocations) {
        return create(registryId, amount, allocations, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer registryId, Amount amount, List<AllocationItem> allocations, Pointer aliasOwner) {
        return create(registryId, amount, allocations, aliasOwner, null, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer registryId, Amount amount, List<AllocationItem> allocations, Pointer aliasOwner, RegistryEntryReference objectReference) {
        return create(registryId, amount, allocations, aliasOwner, objectReference, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer registryId, Amount amount, List<AllocationItem> allocations, Pointer aliasOwner, RegistryEntryReference objectReference, String description) {
        return create(registryId, amount, allocations, aliasOwner, objectReference, description, null, null);
    }

    public static BunqResponse<Integer> create(Integer registryId, Amount amount, List<AllocationItem> allocations, Pointer aliasOwner, RegistryEntryReference objectReference, String description, List<RegistryEntryAttachment> attachment) {
        return create(registryId, amount, allocations, aliasOwner, objectReference, description, attachment, null);
    }

    /**
     * Update a specific Slice group payment.
     *
     * @param description A description about the RegistryEntry.
     * @param allocations An array of AllocationItems.
     * @param attachment  The attachments attached to the payment.
     */
    public static BunqResponse<Integer> update(Integer registryId, Integer registryEntryId, String description, List<AllocationItem> allocations, List<RegistryEntryAttachment> attachment, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_DESCRIPTION, description);
        requestMap.put(FIELD_ALLOCATIONS, allocations);
        requestMap.put(FIELD_ATTACHMENT, attachment);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), registryId, registryEntryId), requestBytes, customHeaders);

        return processForId(responseRaw);
    }

    public static BunqResponse<Integer> update(Integer registryId) {
        return update(registryId, null, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer registryId, Integer registryEntryId) {
        return update(registryId, registryEntryId, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer registryId, Integer registryEntryId, String description) {
        return update(registryId, registryEntryId, description, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer registryId, Integer registryEntryId, String description, List<AllocationItem> allocations) {
        return update(registryId, registryEntryId, description, allocations, null, null);
    }

    public static BunqResponse<Integer> update(Integer registryId, Integer registryEntryId, String description, List<AllocationItem> allocations, List<RegistryEntryAttachment> attachment) {
        return update(registryId, registryEntryId, description, allocations, attachment, null);
    }

    /**
     * Get a listing of all Slice group payments.
     */
    public static BunqResponse<List<RegistryEntry>> list(Integer registryId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), registryId), params, customHeaders);

        return fromJsonList(RegistryEntry.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<List<RegistryEntry>> list() {
        return list(null, null, null);
    }

    public static BunqResponse<List<RegistryEntry>> list(Integer registryId) {
        return list(registryId, null, null);
    }

    public static BunqResponse<List<RegistryEntry>> list(Integer registryId, Map<String, String> params) {
        return list(registryId, params, null);
    }

    /**
     * Get a specific Slice group payment.
     */
    public static BunqResponse<RegistryEntry> get(Integer registryId, Integer registryEntryId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), registryId, registryEntryId), params, customHeaders);

        return fromJson(RegistryEntry.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<RegistryEntry> get() {
        return get(null, null, null, null);
    }

    public static BunqResponse<RegistryEntry> get(Integer registryId) {
        return get(registryId, null, null, null);
    }

    public static BunqResponse<RegistryEntry> get(Integer registryId, Integer registryEntryId) {
        return get(registryId, registryEntryId, null, null);
    }

    public static BunqResponse<RegistryEntry> get(Integer registryId, Integer registryEntryId, Map<String, String> params) {
        return get(registryId, registryEntryId, params, null);
    }

    /**
     * Delete a specific Slice group payment.
     */
    public static BunqResponse<RegistryEntry> delete(Integer registryId, Integer registryEntryId, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), registryId, registryEntryId), customHeaders);

        return new BunqResponse<>(null, responseRaw.getHeaders());
    }

    public static BunqResponse<RegistryEntry> delete(Integer registryId) {
        return delete(registryId, null, null);
    }

    public static BunqResponse<RegistryEntry> delete(Integer registryId, Integer registryEntryId) {
        return delete(registryId, registryEntryId, null);
    }

    /**
     *
     */
    public static RegistryEntry fromJsonReader(JsonReader reader) {
        return fromJsonReader(RegistryEntry.class, reader);
    }

    /**
     * The id of the RegistryEntry.
     */
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The timestamp of the MonetaryAccountBank's creation.
     */
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * The timestamp of the MonetaryAccountBank's last update.
     */
    public String getUpdated() {
        return this.updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    /**
     * The id of the Registry.
     */
    public Integer getRegistryId() {
        return this.registryId;
    }

    public void setRegistryId(Integer registryId) {
        this.registryId = registryId;
    }

    /**
     * The status of the RegistryEntry.
     */
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * The Amount of the RegistryEntry.
     */
    public Amount getAmount() {
        return this.amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    /**
     * A description about the RegistryEntry.
     */
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The RegistryEntry type. AUTO if created by Auto Slice, MANUAL for manually added entries.
     */
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * The LabelUser with the public information of the party of this RegistryEntry.
     */
    public LabelUser getAlias() {
        return this.alias;
    }

    public void setAlias(LabelUser alias) {
        this.alias = alias;
    }

    /**
     * The LabelUser with the public information of the counter party of this RegistryEntry.
     */
    public LabelUser getCounterpartyAlias() {
        return this.counterpartyAlias;
    }

    public void setCounterpartyAlias(LabelUser counterpartyAlias) {
        this.counterpartyAlias = counterpartyAlias;
    }

    /**
     * The LabelUser with the public information of the User that created the RegistryEntry.
     */
    public LabelUser getUserAliasCreated() {
        return this.userAliasCreated;
    }

    public void setUserAliasCreated(LabelUser userAliasCreated) {
        this.userAliasCreated = userAliasCreated;
    }

    /**
     * The membership of the creator.
     */
    public RegistryMembership getMembershipCreated() {
        return this.membershipCreated;
    }

    public void setMembershipCreated(RegistryMembership membershipCreated) {
        this.membershipCreated = membershipCreated;
    }

    /**
     * The membership of the owner.
     */
    public RegistryMembership getMembershipOwned() {
        return this.membershipOwned;
    }

    public void setMembershipOwned(RegistryMembership membershipOwned) {
        this.membershipOwned = membershipOwned;
    }

    /**
     * An array of AllocationItems.
     */
    public List<AllocationItem> getAllocations() {
        return this.allocations;
    }

    public void setAllocations(List<AllocationItem> allocations) {
        this.allocations = allocations;
    }

    /**
     * The attachments attached to the payment.
     */
    public List<RegistryEntryAttachment> getAttachment() {
        return this.attachment;
    }

    public void setAttachment(List<RegistryEntryAttachment> attachment) {
        this.attachment = attachment;
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

        if (this.registryId != null) {
            return false;
        }

        if (this.status != null) {
            return false;
        }

        if (this.amount != null) {
            return false;
        }

        if (this.description != null) {
            return false;
        }

        if (this.type != null) {
            return false;
        }

        if (this.alias != null) {
            return false;
        }

        if (this.counterpartyAlias != null) {
            return false;
        }

        if (this.userAliasCreated != null) {
            return false;
        }

        if (this.membershipCreated != null) {
            return false;
        }

        if (this.membershipOwned != null) {
            return false;
        }

        if (this.allocations != null) {
            return false;
        }

        if (this.attachment != null) {
            return false;
        }

        return true;
    }

}
