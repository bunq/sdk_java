package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.Map;

/**
 * Used to manage Slice group settings.
 */
public class RegistrySetting extends BunqModel {

    /**
     * Field constants.
     */
    public static final String FIELD_AUTO_ADD_CARD_TRANSACTION = "auto_add_card_transaction";
    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_UPDATE = "user/%s/registry/%s/registry-setting/%s";
    protected static final String ENDPOINT_URL_READ = "user/%s/registry/%s/registry-setting/%s";
    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_GET = "RegistrySetting";

    /**
     * The setting for for adding automatically card transactions to the registry.
     */
    @Expose
    @SerializedName("auto_add_card_transaction")
    private String autoAddCardTransaction;

    /**
     * The setting for for adding automatically card transactions to the registry.
     */
    @Expose
    @SerializedName("auto_add_card_transaction_field_for_request")
    private String autoAddCardTransactionFieldForRequest;

    public RegistrySetting() {
        this(null);
    }

    public RegistrySetting(String autoAddCardTransaction) {
        this.autoAddCardTransactionFieldForRequest = autoAddCardTransaction;
    }

    /**
     * Update a specific Slice group setting.
     *
     * @param autoAddCardTransaction The setting for for adding automatically card transactions to
     *                               the registry.
     */
    public static BunqResponse<Integer> update(Integer registryId, Integer registrySettingId, String autoAddCardTransaction, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_AUTO_ADD_CARD_TRANSACTION, autoAddCardTransaction);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), registryId, registrySettingId), requestBytes, customHeaders);

        return processForId(responseRaw);
    }

    public static BunqResponse<Integer> update(Integer registryId) {
        return update(registryId, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer registryId, Integer registrySettingId) {
        return update(registryId, registrySettingId, null, null);
    }

    public static BunqResponse<Integer> update(Integer registryId, Integer registrySettingId, String autoAddCardTransaction) {
        return update(registryId, registrySettingId, autoAddCardTransaction, null);
    }

    /**
     * Get a specific Slice group setting.
     */
    public static BunqResponse<RegistrySetting> get(Integer registryId, Integer registrySettingId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), registryId, registrySettingId), params, customHeaders);

        return fromJson(RegistrySetting.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<RegistrySetting> get() {
        return get(null, null, null, null);
    }

    public static BunqResponse<RegistrySetting> get(Integer registryId) {
        return get(registryId, null, null, null);
    }

    public static BunqResponse<RegistrySetting> get(Integer registryId, Integer registrySettingId) {
        return get(registryId, registrySettingId, null, null);
    }

    public static BunqResponse<RegistrySetting> get(Integer registryId, Integer registrySettingId, Map<String, String> params) {
        return get(registryId, registrySettingId, params, null);
    }

    /**
     *
     */
    public static RegistrySetting fromJsonReader(JsonReader reader) {
        return fromJsonReader(RegistrySetting.class, reader);
    }

    /**
     * The setting for for adding automatically card transactions to the registry.
     */
    public String getAutoAddCardTransaction() {
        return this.autoAddCardTransaction;
    }

    public void setAutoAddCardTransaction(String autoAddCardTransaction) {
        this.autoAddCardTransaction = autoAddCardTransaction;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.autoAddCardTransaction != null) {
            return false;
        }

        return true;
    }

}
