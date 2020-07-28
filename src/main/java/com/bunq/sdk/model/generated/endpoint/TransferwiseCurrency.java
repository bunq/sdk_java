package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.List;
import java.util.Map;

/**
 * Used to get a list of supported currencies for Transferwise.
 */
public class TransferwiseCurrency extends BunqModel {

    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_LISTING = "user/%s/transferwise-currency";

    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_GET = "TransferwiseCurrency";

    /**
     * The currency code.
     */
    @Expose
    @SerializedName("currency")
    private String currency;

    /**
     * The currency name.
     */
    @Expose
    @SerializedName("name")
    private String name;

    /**
     * The country code associated with the currency.
     */
    @Expose
    @SerializedName("country")
    private String country;

    /**
     *
     */
    public static BunqResponse<List<TransferwiseCurrency>> list(Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

        return fromJsonList(TransferwiseCurrency.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<List<TransferwiseCurrency>> list() {
        return list(null, null);
    }

    public static BunqResponse<List<TransferwiseCurrency>> list(Map<String, String> params) {
        return list(params, null);
    }

    /**
     *
     */
    public static TransferwiseCurrency fromJsonReader(JsonReader reader) {
        return fromJsonReader(TransferwiseCurrency.class, reader);
    }

    /**
     * The currency code.
     */
    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * The currency name.
     */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The country code associated with the currency.
     */
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.currency != null) {
            return false;
        }

        if (this.name != null) {
            return false;
        }

        if (this.country != null) {
            return false;
        }

        return true;
    }

}
