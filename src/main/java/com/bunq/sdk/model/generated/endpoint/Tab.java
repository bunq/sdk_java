package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.AnchorObjectInterface;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.List;
import java.util.Map;

/**
 * Once your CashRegister has been activated you can use it to create Tabs. A Tab is a template
 * for a payment. In contrast to requests a Tab is not pointed towards a specific user. Any user
 * can pay the Tab as long as it is made visible by you. The creation of a Tab happens with
 * /tab-usage-single or /tab-usage-multiple. A TabUsageSingle is a Tab that can be paid once. A
 * TabUsageMultiple is a Tab that can be paid multiple times by different users.
 */
public class Tab extends BunqModel implements AnchorObjectInterface {

    /**
     * Error constants.
     */
    protected static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/cash-register/%s/tab/%s";
    protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/cash-register/%s/tab";

    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_GET = "Tab";

    /**
     *
     */
    @Expose
    @SerializedName("TabUsageSingle")
    private TabUsageSingle tabUsageSingle;

    /**
     *
     */
    @Expose
    @SerializedName("TabUsageMultiple")
    private TabUsageMultiple tabUsageMultiple;

    /**
     * Get a specific tab. This returns a TabUsageSingle or TabUsageMultiple.
     */
    public static BunqResponse<Tab> get(Integer cashRegisterId, String tabUuid, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId, tabUuid), params, customHeaders);

        return fromJson(Tab.class, responseRaw);
    }

    public static BunqResponse<Tab> get() {
        return get(null, null, null, null, null);
    }

    public static BunqResponse<Tab> get(Integer cashRegisterId) {
        return get(cashRegisterId, null, null, null, null);
    }

    public static BunqResponse<Tab> get(Integer cashRegisterId, String tabUuid) {
        return get(cashRegisterId, tabUuid, null, null, null);
    }

    public static BunqResponse<Tab> get(Integer cashRegisterId, String tabUuid, Integer monetaryAccountId) {
        return get(cashRegisterId, tabUuid, monetaryAccountId, null, null);
    }

    public static BunqResponse<Tab> get(Integer cashRegisterId, String tabUuid, Integer monetaryAccountId, Map<String, String> params) {
        return get(cashRegisterId, tabUuid, monetaryAccountId, params, null);
    }

    /**
     * Get a collection of tabs.
     */
    public static BunqResponse<List<Tab>> list(Integer cashRegisterId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId), params, customHeaders);

        return fromJsonList(Tab.class, responseRaw);
    }

    public static BunqResponse<List<Tab>> list() {
        return list(null, null, null, null);
    }

    public static BunqResponse<List<Tab>> list(Integer cashRegisterId) {
        return list(cashRegisterId, null, null, null);
    }

    public static BunqResponse<List<Tab>> list(Integer cashRegisterId, Integer monetaryAccountId) {
        return list(cashRegisterId, monetaryAccountId, null, null);
    }

    public static BunqResponse<List<Tab>> list(Integer cashRegisterId, Integer monetaryAccountId, Map<String, String> params) {
        return list(cashRegisterId, monetaryAccountId, params, null);
    }

    /**
     *
     */
    public static Tab fromJsonReader(JsonReader reader) {
        return fromJsonReader(Tab.class, reader);
    }

    /**
     *
     */
    public TabUsageSingle getTabUsageSingle() {
        return this.tabUsageSingle;
    }

    public void setTabUsageSingle(TabUsageSingle tabUsageSingle) {
        this.tabUsageSingle = tabUsageSingle;
    }

    /**
     *
     */
    public TabUsageMultiple getTabUsageMultiple() {
        return this.tabUsageMultiple;
    }

    public void setTabUsageMultiple(TabUsageMultiple tabUsageMultiple) {
        this.tabUsageMultiple = tabUsageMultiple;
    }

    /**
     *
     */
    public BunqModel getReferencedObject() {
        if (this.tabUsageSingle != null) {
            return this.tabUsageSingle;
        }

        if (this.tabUsageMultiple != null) {
            return this.tabUsageMultiple;
        }

        throw new BunqException(ERROR_NULL_FIELDS);
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.tabUsageSingle != null) {
            return false;
        }

        if (this.tabUsageMultiple != null) {
            return false;
        }

        return true;
    }

}
