package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.Map;

/**
 * An incoming payment made towards an account of an external bank and redirected to a bunq
 * account via switch service.
 */
public class BankSwitchServiceNetherlandsIncomingPayment extends BunqModel {

    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/switch-service-payment/%s";

    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_GET = "BankSwitchServiceNetherlandsIncomingPayment";

    /**
     * The bank switch service details.
     */
    @Expose
    @SerializedName("bank_switch_service")
    private BankSwitchServiceNetherlandsIncoming bankSwitchService;

    /**
     * The payment made using bank switch service.
     */
    @Expose
    @SerializedName("payment")
    private Payment payment;

    /**
     *
     */
    public static BunqResponse<BankSwitchServiceNetherlandsIncomingPayment> get(Integer bankSwitchServiceNetherlandsIncomingPaymentId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), bankSwitchServiceNetherlandsIncomingPaymentId), params, customHeaders);

        return fromJson(BankSwitchServiceNetherlandsIncomingPayment.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<BankSwitchServiceNetherlandsIncomingPayment> get() {
        return get(null, null, null, null);
    }

    public static BunqResponse<BankSwitchServiceNetherlandsIncomingPayment> get(Integer bankSwitchServiceNetherlandsIncomingPaymentId) {
        return get(bankSwitchServiceNetherlandsIncomingPaymentId, null, null, null);
    }

    public static BunqResponse<BankSwitchServiceNetherlandsIncomingPayment> get(Integer bankSwitchServiceNetherlandsIncomingPaymentId, Integer monetaryAccountId) {
        return get(bankSwitchServiceNetherlandsIncomingPaymentId, monetaryAccountId, null, null);
    }

    public static BunqResponse<BankSwitchServiceNetherlandsIncomingPayment> get(Integer bankSwitchServiceNetherlandsIncomingPaymentId, Integer monetaryAccountId, Map<String, String> params) {
        return get(bankSwitchServiceNetherlandsIncomingPaymentId, monetaryAccountId, params, null);
    }

    /**
     *
     */
    public static BankSwitchServiceNetherlandsIncomingPayment fromJsonReader(JsonReader reader) {
        return fromJsonReader(BankSwitchServiceNetherlandsIncomingPayment.class, reader);
    }

    /**
     * The bank switch service details.
     */
    public BankSwitchServiceNetherlandsIncoming getBankSwitchService() {
        return this.bankSwitchService;
    }

    public void setBankSwitchService(BankSwitchServiceNetherlandsIncoming bankSwitchService) {
        this.bankSwitchService = bankSwitchService;
    }

    /**
     * The payment made using bank switch service.
     */
    public Payment getPayment() {
        return this.payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.bankSwitchService != null) {
            return false;
        }

        if (this.payment != null) {
            return false;
        }

        return true;
    }

}
