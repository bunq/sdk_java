package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * View for requesting Bancontact transactions and polling their status.
 */
public class BancontactMerchantTransaction extends BunqModel {

    /**
     * Field constants.
     */
    public static final String FIELD_AMOUNT_REQUESTED = "amount_requested";
    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/bancontact-merchant-transaction";
    protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/bancontact-merchant-transaction/%s";
    protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/bancontact-merchant-transaction";
    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_GET = "BancontactMerchantTransaction";

    /**
     * The id of the monetary account this bancontact merchant transaction links to.
     */
    @Expose
    @SerializedName("monetary_account_id")
    private Integer monetaryAccountId;

    /**
     * The alias of the monetary account to add money to.
     */
    @Expose
    @SerializedName("alias")
    private LabelMonetaryAccount alias;

    /**
     * The requested amount of money to add.
     */
    @Expose
    @SerializedName("amount_requested")
    private Amount amountRequested;

    /**
     * When the transaction will expire.
     */
    @Expose
    @SerializedName("expiration")
    private String expiration;

    /**
     * The URL to visit complete the bancontact transaction.
     */
    @Expose
    @SerializedName("url_redirect")
    private String urlRedirect;

    /**
     * The deep link to visit complete the bancontact transaction.
     */
    @Expose
    @SerializedName("url_deep_link")
    private String urlDeepLink;

    /**
     * The status of the transaction.
     */
    @Expose
    @SerializedName("status")
    private String status;

    /**
     * When the status was last updated.
     */
    @Expose
    @SerializedName("status_timestamp")
    private String statusTimestamp;

    /**
     * The transaction ID of the bancontact transaction.
     */
    @Expose
    @SerializedName("transaction_id")
    private String transactionId;

    /**
     * The requested amount of money to add.
     */
    @Expose
    @SerializedName("amount_requested_field_for_request")
    private Amount amountRequestedFieldForRequest;

    public BancontactMerchantTransaction() {
        this(null);
    }

    public BancontactMerchantTransaction(Amount amountRequested) {
        this.amountRequestedFieldForRequest = amountRequested;
    }

    /**
     * @param amountRequested The requested amount of money to add.
     */
    public static BunqResponse<Integer> create(Amount amountRequested, Integer monetaryAccountId, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_AMOUNT_REQUESTED, amountRequested);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

        return processForId(responseRaw);
    }

    public static BunqResponse<Integer> create() {
        return create(null, null, null);
    }

    public static BunqResponse<Integer> create(Amount amountRequested) {
        return create(amountRequested, null, null);
    }

    public static BunqResponse<Integer> create(Amount amountRequested, Integer monetaryAccountId) {
        return create(amountRequested, monetaryAccountId, null);
    }

    /**
     *
     */
    public static BunqResponse<BancontactMerchantTransaction> get(Integer bancontactMerchantTransactionId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), bancontactMerchantTransactionId), params, customHeaders);

        return fromJson(BancontactMerchantTransaction.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<BancontactMerchantTransaction> get() {
        return get(null, null, null, null);
    }

    public static BunqResponse<BancontactMerchantTransaction> get(Integer bancontactMerchantTransactionId) {
        return get(bancontactMerchantTransactionId, null, null, null);
    }

    public static BunqResponse<BancontactMerchantTransaction> get(Integer bancontactMerchantTransactionId, Integer monetaryAccountId) {
        return get(bancontactMerchantTransactionId, monetaryAccountId, null, null);
    }

    public static BunqResponse<BancontactMerchantTransaction> get(Integer bancontactMerchantTransactionId, Integer monetaryAccountId, Map<String, String> params) {
        return get(bancontactMerchantTransactionId, monetaryAccountId, params, null);
    }

    /**
     *
     */
    public static BunqResponse<List<BancontactMerchantTransaction>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

        return fromJsonList(BancontactMerchantTransaction.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<List<BancontactMerchantTransaction>> list() {
        return list(null, null, null);
    }

    public static BunqResponse<List<BancontactMerchantTransaction>> list(Integer monetaryAccountId) {
        return list(monetaryAccountId, null, null);
    }

    public static BunqResponse<List<BancontactMerchantTransaction>> list(Integer monetaryAccountId, Map<String, String> params) {
        return list(monetaryAccountId, params, null);
    }

    /**
     *
     */
    public static BancontactMerchantTransaction fromJsonReader(JsonReader reader) {
        return fromJsonReader(BancontactMerchantTransaction.class, reader);
    }

    /**
     * The id of the monetary account this bancontact merchant transaction links to.
     */
    public Integer getMonetaryAccountId() {
        return this.monetaryAccountId;
    }

    public void setMonetaryAccountId(Integer monetaryAccountId) {
        this.monetaryAccountId = monetaryAccountId;
    }

    /**
     * The alias of the monetary account to add money to.
     */
    public LabelMonetaryAccount getAlias() {
        return this.alias;
    }

    public void setAlias(LabelMonetaryAccount alias) {
        this.alias = alias;
    }

    /**
     * The requested amount of money to add.
     */
    public Amount getAmountRequested() {
        return this.amountRequested;
    }

    public void setAmountRequested(Amount amountRequested) {
        this.amountRequested = amountRequested;
    }

    /**
     * When the transaction will expire.
     */
    public String getExpiration() {
        return this.expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    /**
     * The URL to visit complete the bancontact transaction.
     */
    public String getUrlRedirect() {
        return this.urlRedirect;
    }

    public void setUrlRedirect(String urlRedirect) {
        this.urlRedirect = urlRedirect;
    }

    /**
     * The deep link to visit complete the bancontact transaction.
     */
    public String getUrlDeepLink() {
        return this.urlDeepLink;
    }

    public void setUrlDeepLink(String urlDeepLink) {
        this.urlDeepLink = urlDeepLink;
    }

    /**
     * The status of the transaction.
     */
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * When the status was last updated.
     */
    public String getStatusTimestamp() {
        return this.statusTimestamp;
    }

    public void setStatusTimestamp(String statusTimestamp) {
        this.statusTimestamp = statusTimestamp;
    }

    /**
     * The transaction ID of the bancontact transaction.
     */
    public String getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.monetaryAccountId != null) {
            return false;
        }

        if (this.alias != null) {
            return false;
        }

        if (this.amountRequested != null) {
            return false;
        }

        if (this.expiration != null) {
            return false;
        }

        if (this.urlRedirect != null) {
            return false;
        }

        if (this.urlDeepLink != null) {
            return false;
        }

        if (this.status != null) {
            return false;
        }

        if (this.statusTimestamp != null) {
            return false;
        }

        if (this.transactionId != null) {
            return false;
        }

        return true;
    }

}
