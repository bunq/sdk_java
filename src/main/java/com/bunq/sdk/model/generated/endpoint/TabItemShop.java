package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.AttachmentPublic;
import com.bunq.sdk.model.generated.object.AttachmentTab;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * After you’ve created a Tab using /tab-usage-single or /tab-usage-multiple you can add items
 * and attachments using tab-item. You can only add or modify TabItems of a Tab which status is
 * OPEN. The amount of the TabItems will not influence the total_amount of the corresponding
 * Tab. However, if you've created any TabItems for a Tab the sum of the amounts of these items
 * must be equal to the total_amount of the Tab when you change its status to
 * PAYABLE/WAITING_FOR_PAYMENT.
 */
public class TabItemShop extends BunqModel {

    /**
     * Field constants.
     */
    public static final String FIELD_DESCRIPTION = "description";
    public static final String FIELD_EAN_CODE = "ean_code";
    public static final String FIELD_AVATAR_ATTACHMENT_UUID = "avatar_attachment_uuid";
    public static final String FIELD_TAB_ATTACHMENT = "tab_attachment";
    public static final String FIELD_QUANTITY = "quantity";
    public static final String FIELD_AMOUNT = "amount";
    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/cash-register/%s/tab/%s/tab-item";
    protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/cash-register/%s/tab/%s/tab-item/%s";
    protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/cash-register/%s/tab/%s/tab-item/%s";
    protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/cash-register/%s/tab/%s/tab-item";
    protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/cash-register/%s/tab/%s/tab-item/%s";
    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_GET = "TabItem";

    /**
     * The id of the created TabItem.
     */
    @Expose
    @SerializedName("id")
    private Integer id;

    /**
     * The TabItem's brief description.
     */
    @Expose
    @SerializedName("description")
    private String description;

    /**
     * The TabItem's EAN code.
     */
    @Expose
    @SerializedName("ean_code")
    private String eanCode;

    /**
     * A struct with an AttachmentPublic UUID that used as an avatar for the TabItem.
     */
    @Expose
    @SerializedName("avatar_attachment")
    private AttachmentPublic avatarAttachment;

    /**
     * A list of AttachmentTab attached to the TabItem.
     */
    @Expose
    @SerializedName("tab_attachment")
    private List<AttachmentTab> tabAttachment;

    /**
     * The quantity of the TabItem.
     */
    @Expose
    @SerializedName("quantity")
    private BigDecimal quantity;

    /**
     * The money amount of the TabItem.
     */
    @Expose
    @SerializedName("amount")
    private Amount amount;

    /**
     * The TabItem's brief description. Can't be empty and must be no longer than 100 characters
     */
    @Expose
    @SerializedName("description_field_for_request")
    private String descriptionFieldForRequest;

    /**
     * The TabItem's EAN code.
     */
    @Expose
    @SerializedName("ean_code_field_for_request")
    private String eanCodeFieldForRequest;

    /**
     * An AttachmentPublic UUID that used as an avatar for the TabItem.
     */
    @Expose
    @SerializedName("avatar_attachment_uuid_field_for_request")
    private String avatarAttachmentUuidFieldForRequest;

    /**
     * A list of AttachmentTab attached to the TabItem.
     */
    @Expose
    @SerializedName("tab_attachment_field_for_request")
    private List<Integer> tabAttachmentFieldForRequest;

    /**
     * The quantity of the TabItem. Formatted as a number containing up to 15 digits, up to 15
     * decimals and using a dot.
     */
    @Expose
    @SerializedName("quantity_field_for_request")
    private String quantityFieldForRequest;

    /**
     * The money amount of the TabItem. Will not change the value of the corresponding Tab.
     */
    @Expose
    @SerializedName("amount_field_for_request")
    private Amount amountFieldForRequest;

    public TabItemShop() {
        this(null, null, null, null, null, null);
    }

    public TabItemShop(String description) {
        this(description, null, null, null, null, null);
    }

    public TabItemShop(String description, String eanCode) {
        this(description, eanCode, null, null, null, null);
    }

    public TabItemShop(String description, String eanCode, String avatarAttachmentUuid) {
        this(description, eanCode, avatarAttachmentUuid, null, null, null);
    }

    public TabItemShop(String description, String eanCode, String avatarAttachmentUuid, List<Integer> tabAttachment) {
        this(description, eanCode, avatarAttachmentUuid, tabAttachment, null, null);
    }

    public TabItemShop(String description, String eanCode, String avatarAttachmentUuid, List<Integer> tabAttachment, String quantity) {
        this(description, eanCode, avatarAttachmentUuid, tabAttachment, quantity, null);
    }

    public TabItemShop(String description, String eanCode, String avatarAttachmentUuid, List<Integer> tabAttachment, String quantity, Amount amount) {
        this.descriptionFieldForRequest = description;
        this.eanCodeFieldForRequest = eanCode;
        this.avatarAttachmentUuidFieldForRequest = avatarAttachmentUuid;
        this.tabAttachmentFieldForRequest = tabAttachment;
        this.quantityFieldForRequest = quantity;
        this.amountFieldForRequest = amount;
    }

    /**
     * Create a new TabItem for a given Tab.
     *
     * @param description          The TabItem's brief description. Can't be empty and must be no longer than
     *                             100 characters
     * @param eanCode              The TabItem's EAN code.
     * @param avatarAttachmentUuid An AttachmentPublic UUID that used as an avatar for the TabItem.
     * @param tabAttachment        A list of AttachmentTab attached to the TabItem.
     * @param quantity             The quantity of the TabItem. Formatted as a number containing up to 15
     *                             digits, up to 15 decimals and using a dot.
     * @param amount               The money amount of the TabItem. Will not change the value of the corresponding
     *                             Tab.
     */
    public static BunqResponse<Integer> create(Integer cashRegisterId, String tabUuid, String description, Integer monetaryAccountId, String eanCode, String avatarAttachmentUuid, List<Integer> tabAttachment, String quantity, Amount amount, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_DESCRIPTION, description);
        requestMap.put(FIELD_EAN_CODE, eanCode);
        requestMap.put(FIELD_AVATAR_ATTACHMENT_UUID, avatarAttachmentUuid);
        requestMap.put(FIELD_TAB_ATTACHMENT, tabAttachment);
        requestMap.put(FIELD_QUANTITY, quantity);
        requestMap.put(FIELD_AMOUNT, amount);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId, tabUuid), requestBytes, customHeaders);

        return processForId(responseRaw);
    }

    public static BunqResponse<Integer> create() {
        return create(null, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer cashRegisterId) {
        return create(cashRegisterId, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer cashRegisterId, String tabUuid) {
        return create(cashRegisterId, tabUuid, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer cashRegisterId, String tabUuid, String description) {
        return create(cashRegisterId, tabUuid, description, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer cashRegisterId, String tabUuid, String description, Integer monetaryAccountId) {
        return create(cashRegisterId, tabUuid, description, monetaryAccountId, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer cashRegisterId, String tabUuid, String description, Integer monetaryAccountId, String eanCode) {
        return create(cashRegisterId, tabUuid, description, monetaryAccountId, eanCode, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer cashRegisterId, String tabUuid, String description, Integer monetaryAccountId, String eanCode, String avatarAttachmentUuid) {
        return create(cashRegisterId, tabUuid, description, monetaryAccountId, eanCode, avatarAttachmentUuid, null, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer cashRegisterId, String tabUuid, String description, Integer monetaryAccountId, String eanCode, String avatarAttachmentUuid, List<Integer> tabAttachment) {
        return create(cashRegisterId, tabUuid, description, monetaryAccountId, eanCode, avatarAttachmentUuid, tabAttachment, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer cashRegisterId, String tabUuid, String description, Integer monetaryAccountId, String eanCode, String avatarAttachmentUuid, List<Integer> tabAttachment, String quantity) {
        return create(cashRegisterId, tabUuid, description, monetaryAccountId, eanCode, avatarAttachmentUuid, tabAttachment, quantity, null, null);
    }

    public static BunqResponse<Integer> create(Integer cashRegisterId, String tabUuid, String description, Integer monetaryAccountId, String eanCode, String avatarAttachmentUuid, List<Integer> tabAttachment, String quantity, Amount amount) {
        return create(cashRegisterId, tabUuid, description, monetaryAccountId, eanCode, avatarAttachmentUuid, tabAttachment, quantity, amount, null);
    }

    /**
     * Modify a TabItem from a given Tab.
     *
     * @param description          The TabItem's brief description. Can't be empty and must be no longer than
     *                             100 characters
     * @param eanCode              The TabItem's EAN code.
     * @param avatarAttachmentUuid An AttachmentPublic UUID that used as an avatar for the TabItem.
     * @param tabAttachment        A list of AttachmentTab attached to the TabItem.
     * @param quantity             The quantity of the TabItem. Formatted as a number containing up to 15
     *                             digits, up to 15 decimals and using a dot.
     * @param amount               The money amount of the TabItem. Will not change the value of the corresponding
     *                             Tab.
     */
    public static BunqResponse<Integer> update(Integer cashRegisterId, String tabUuid, Integer tabItemShopId, Integer monetaryAccountId, String description, String eanCode, String avatarAttachmentUuid, List<Integer> tabAttachment, String quantity, Amount amount, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_DESCRIPTION, description);
        requestMap.put(FIELD_EAN_CODE, eanCode);
        requestMap.put(FIELD_AVATAR_ATTACHMENT_UUID, avatarAttachmentUuid);
        requestMap.put(FIELD_TAB_ATTACHMENT, tabAttachment);
        requestMap.put(FIELD_QUANTITY, quantity);
        requestMap.put(FIELD_AMOUNT, amount);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId, tabUuid, tabItemShopId), requestBytes, customHeaders);

        return processForId(responseRaw);
    }

    public static BunqResponse<Integer> update(Integer cashRegisterId) {
        return update(cashRegisterId, null, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer cashRegisterId, String tabUuid) {
        return update(cashRegisterId, tabUuid, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer cashRegisterId, String tabUuid, Integer tabItemShopId) {
        return update(cashRegisterId, tabUuid, tabItemShopId, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer cashRegisterId, String tabUuid, Integer tabItemShopId, Integer monetaryAccountId) {
        return update(cashRegisterId, tabUuid, tabItemShopId, monetaryAccountId, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer cashRegisterId, String tabUuid, Integer tabItemShopId, Integer monetaryAccountId, String description) {
        return update(cashRegisterId, tabUuid, tabItemShopId, monetaryAccountId, description, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer cashRegisterId, String tabUuid, Integer tabItemShopId, Integer monetaryAccountId, String description, String eanCode) {
        return update(cashRegisterId, tabUuid, tabItemShopId, monetaryAccountId, description, eanCode, null, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer cashRegisterId, String tabUuid, Integer tabItemShopId, Integer monetaryAccountId, String description, String eanCode, String avatarAttachmentUuid) {
        return update(cashRegisterId, tabUuid, tabItemShopId, monetaryAccountId, description, eanCode, avatarAttachmentUuid, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer cashRegisterId, String tabUuid, Integer tabItemShopId, Integer monetaryAccountId, String description, String eanCode, String avatarAttachmentUuid, List<Integer> tabAttachment) {
        return update(cashRegisterId, tabUuid, tabItemShopId, monetaryAccountId, description, eanCode, avatarAttachmentUuid, tabAttachment, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer cashRegisterId, String tabUuid, Integer tabItemShopId, Integer monetaryAccountId, String description, String eanCode, String avatarAttachmentUuid, List<Integer> tabAttachment, String quantity) {
        return update(cashRegisterId, tabUuid, tabItemShopId, monetaryAccountId, description, eanCode, avatarAttachmentUuid, tabAttachment, quantity, null, null);
    }

    public static BunqResponse<Integer> update(Integer cashRegisterId, String tabUuid, Integer tabItemShopId, Integer monetaryAccountId, String description, String eanCode, String avatarAttachmentUuid, List<Integer> tabAttachment, String quantity, Amount amount) {
        return update(cashRegisterId, tabUuid, tabItemShopId, monetaryAccountId, description, eanCode, avatarAttachmentUuid, tabAttachment, quantity, amount, null);
    }

    /**
     * Delete a specific TabItem from a Tab.
     */
    public static BunqResponse<TabItemShop> delete(Integer cashRegisterId, String tabUuid, Integer tabItemShopId, Integer monetaryAccountId, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId, tabUuid, tabItemShopId), customHeaders);

        return new BunqResponse<>(null, responseRaw.getHeaders());
    }

    public static BunqResponse<TabItemShop> delete(Integer cashRegisterId) {
        return delete(cashRegisterId, null, null, null, null);
    }

    public static BunqResponse<TabItemShop> delete(Integer cashRegisterId, String tabUuid) {
        return delete(cashRegisterId, tabUuid, null, null, null);
    }

    public static BunqResponse<TabItemShop> delete(Integer cashRegisterId, String tabUuid, Integer tabItemShopId) {
        return delete(cashRegisterId, tabUuid, tabItemShopId, null, null);
    }

    public static BunqResponse<TabItemShop> delete(Integer cashRegisterId, String tabUuid, Integer tabItemShopId, Integer monetaryAccountId) {
        return delete(cashRegisterId, tabUuid, tabItemShopId, monetaryAccountId, null);
    }

    /**
     * Get a collection of TabItems from a given Tab.
     */
    public static BunqResponse<List<TabItemShop>> list(Integer cashRegisterId, String tabUuid, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId, tabUuid), params, customHeaders);

        return fromJsonList(TabItemShop.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<List<TabItemShop>> list() {
        return list(null, null, null, null, null);
    }

    public static BunqResponse<List<TabItemShop>> list(Integer cashRegisterId) {
        return list(cashRegisterId, null, null, null, null);
    }

    public static BunqResponse<List<TabItemShop>> list(Integer cashRegisterId, String tabUuid) {
        return list(cashRegisterId, tabUuid, null, null, null);
    }

    public static BunqResponse<List<TabItemShop>> list(Integer cashRegisterId, String tabUuid, Integer monetaryAccountId) {
        return list(cashRegisterId, tabUuid, monetaryAccountId, null, null);
    }

    public static BunqResponse<List<TabItemShop>> list(Integer cashRegisterId, String tabUuid, Integer monetaryAccountId, Map<String, String> params) {
        return list(cashRegisterId, tabUuid, monetaryAccountId, params, null);
    }

    /**
     * Get a specific TabItem from a given Tab.
     */
    public static BunqResponse<TabItemShop> get(Integer cashRegisterId, String tabUuid, Integer tabItemShopId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId, tabUuid, tabItemShopId), params, customHeaders);

        return fromJson(TabItemShop.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<TabItemShop> get() {
        return get(null, null, null, null, null, null);
    }

    public static BunqResponse<TabItemShop> get(Integer cashRegisterId) {
        return get(cashRegisterId, null, null, null, null, null);
    }

    public static BunqResponse<TabItemShop> get(Integer cashRegisterId, String tabUuid) {
        return get(cashRegisterId, tabUuid, null, null, null, null);
    }

    public static BunqResponse<TabItemShop> get(Integer cashRegisterId, String tabUuid, Integer tabItemShopId) {
        return get(cashRegisterId, tabUuid, tabItemShopId, null, null, null);
    }

    public static BunqResponse<TabItemShop> get(Integer cashRegisterId, String tabUuid, Integer tabItemShopId, Integer monetaryAccountId) {
        return get(cashRegisterId, tabUuid, tabItemShopId, monetaryAccountId, null, null);
    }

    public static BunqResponse<TabItemShop> get(Integer cashRegisterId, String tabUuid, Integer tabItemShopId, Integer monetaryAccountId, Map<String, String> params) {
        return get(cashRegisterId, tabUuid, tabItemShopId, monetaryAccountId, params, null);
    }

    /**
     *
     */
    public static TabItemShop fromJsonReader(JsonReader reader) {
        return fromJsonReader(TabItemShop.class, reader);
    }

    /**
     * The id of the created TabItem.
     */
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The TabItem's brief description.
     */
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The TabItem's EAN code.
     */
    public String getEanCode() {
        return this.eanCode;
    }

    public void setEanCode(String eanCode) {
        this.eanCode = eanCode;
    }

    /**
     * A struct with an AttachmentPublic UUID that used as an avatar for the TabItem.
     */
    public AttachmentPublic getAvatarAttachment() {
        return this.avatarAttachment;
    }

    public void setAvatarAttachment(AttachmentPublic avatarAttachment) {
        this.avatarAttachment = avatarAttachment;
    }

    /**
     * A list of AttachmentTab attached to the TabItem.
     */
    public List<AttachmentTab> getTabAttachment() {
        return this.tabAttachment;
    }

    public void setTabAttachment(List<AttachmentTab> tabAttachment) {
        this.tabAttachment = tabAttachment;
    }

    /**
     * The quantity of the TabItem.
     */
    public BigDecimal getQuantity() {
        return this.quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    /**
     * The money amount of the TabItem.
     */
    public Amount getAmount() {
        return this.amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.id != null) {
            return false;
        }

        if (this.description != null) {
            return false;
        }

        if (this.eanCode != null) {
            return false;
        }

        if (this.avatarAttachment != null) {
            return false;
        }

        if (this.tabAttachment != null) {
            return false;
        }

        if (this.quantity != null) {
            return false;
        }

        if (this.amount != null) {
            return false;
        }

        return true;
    }

}
