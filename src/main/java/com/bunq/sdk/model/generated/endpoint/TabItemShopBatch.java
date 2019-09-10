package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create a batch of tab items.
 */
public class TabItemShopBatch extends BunqModel {

    /**
     * Field constants.
     */
    public static final String FIELD_TAB_ITEMS = "tab_items";
    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/cash-register/%s/tab/%s/tab-item-batch";
    /**
     * The list of tab items in the batch.
     */
    @Expose
    @SerializedName("tab_items")
    private List<TabItemShop> tabItems;

    /**
     * The list of tab items we want to create in a single batch. Limited to 50 items per batch.
     */
    @Expose
    @SerializedName("tab_items_field_for_request")
    private List<TabItemShop> tabItemsFieldForRequest;

    public TabItemShopBatch() {
        this(null);
    }

    public TabItemShopBatch(List<TabItemShop> tabItems) {
        this.tabItemsFieldForRequest = tabItems;
    }

    /**
     * Create tab items as a batch.
     *
     * @param tabItems The list of tab items we want to create in a single batch. Limited to 50
     *                 items per batch.
     */
    public static BunqResponse<Integer> create(Integer cashRegisterId, String tabUuid, List<TabItemShop> tabItems, Integer monetaryAccountId, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_TAB_ITEMS, tabItems);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId, tabUuid), requestBytes, customHeaders);

        return processForId(responseRaw);
    }

    public static BunqResponse<Integer> create() {
        return create(null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer cashRegisterId) {
        return create(cashRegisterId, null, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer cashRegisterId, String tabUuid) {
        return create(cashRegisterId, tabUuid, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer cashRegisterId, String tabUuid, List<TabItemShop> tabItems) {
        return create(cashRegisterId, tabUuid, tabItems, null, null);
    }

    public static BunqResponse<Integer> create(Integer cashRegisterId, String tabUuid, List<TabItemShop> tabItems, Integer monetaryAccountId) {
        return create(cashRegisterId, tabUuid, tabItems, monetaryAccountId, null);
    }

    /**
     *
     */
    public static TabItemShopBatch fromJsonReader(JsonReader reader) {
        return fromJsonReader(TabItemShopBatch.class, reader);
    }

    /**
     * The list of tab items in the batch.
     */
    public List<TabItemShop> getTabItems() {
        return this.tabItems;
    }

    public void setTabItems(List<TabItemShop> tabItems) {
        this.tabItems = tabItems;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.tabItems != null) {
            return false;
        }

        return true;
    }

}
