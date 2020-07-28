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
 * View for requesting iDEAL transactions and polling their status.
 */
public class IdealMerchantTransaction extends BunqModel {

    /**
     * Field constants.
     */
    public static final String FIELD_AMOUNT_REQUESTED = "amount_requested";
    public static final String FIELD_ISSUER = "issuer";
    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/ideal-merchant-transaction";
    protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/ideal-merchant-transaction/%s";
    protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/ideal-merchant-transaction";
    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_GET = "IdealMerchantTransaction";

    /**
     * The id of the monetary account this ideal merchant transaction links to.
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
     * The alias of the monetary account the money comes from.
     */
    @Expose
    @SerializedName("counterparty_alias")
    private LabelMonetaryAccount counterpartyAlias;

    /**
     * In case of a successful transaction, the amount of money that will be transferred.
     */
    @Expose
    @SerializedName("amount_guaranteed")
    private Amount amountGuaranteed;

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
     * The BIC of the issuer.
     */
    @Expose
    @SerializedName("issuer")
    private String issuer;

    /**
     * The Name of the issuer.
     */
    @Expose
    @SerializedName("issuer_name")
    private String issuerName;

    /**
     * The URL to visit to
     */
    @Expose
    @SerializedName("issuer_authentication_url")
    private String issuerAuthenticationUrl;

    /**
     * The 'purchase ID' of the iDEAL transaction.
     */
    @Expose
    @SerializedName("purchase_identifier")
    private String purchaseIdentifier;

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
     * The 'transaction ID' of the iDEAL transaction.
     */
    @Expose
    @SerializedName("transaction_identifier")
    private String transactionIdentifier;

    /**
     * The requested amount of money to add.
     */
    @Expose
    @SerializedName("amount_requested_field_for_request")
    private Amount amountRequestedFieldForRequest;

    /**
     * The BIC of the issuing bank to ask for money.
     */
    @Expose
    @SerializedName("issuer_field_for_request")
    private String issuerFieldForRequest;

    public IdealMerchantTransaction() {
        this(null, null);
    }

    public IdealMerchantTransaction(Amount amountRequested) {
        this(amountRequested, null);
    }

    public IdealMerchantTransaction(Amount amountRequested, String issuer) {
        this.amountRequestedFieldForRequest = amountRequested;
        this.issuerFieldForRequest = issuer;
    }

    /**
     * @param amountRequested The requested amount of money to add.
     * @param issuer          The BIC of the issuing bank to ask for money.
     */
    public static BunqResponse<Integer> create(Amount amountRequested, String issuer, Integer monetaryAccountId, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_AMOUNT_REQUESTED, amountRequested);
        requestMap.put(FIELD_ISSUER, issuer);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

        return processForId(responseRaw);
    }

    public static BunqResponse<Integer> create() {
        return create(null, null, null, null);
    }

    public static BunqResponse<Integer> create(Amount amountRequested) {
        return create(amountRequested, null, null, null);
    }

    public static BunqResponse<Integer> create(Amount amountRequested, String issuer) {
        return create(amountRequested, issuer, null, null);
    }

    public static BunqResponse<Integer> create(Amount amountRequested, String issuer, Integer monetaryAccountId) {
        return create(amountRequested, issuer, monetaryAccountId, null);
    }

    /**
     *
     */
    public static BunqResponse<IdealMerchantTransaction> get(Integer idealMerchantTransactionId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), idealMerchantTransactionId), params, customHeaders);

        return fromJson(IdealMerchantTransaction.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<IdealMerchantTransaction> get() {
        return get(null, null, null, null);
    }

    public static BunqResponse<IdealMerchantTransaction> get(Integer idealMerchantTransactionId) {
        return get(idealMerchantTransactionId, null, null, null);
    }

    public static BunqResponse<IdealMerchantTransaction> get(Integer idealMerchantTransactionId, Integer monetaryAccountId) {
        return get(idealMerchantTransactionId, monetaryAccountId, null, null);
    }

    public static BunqResponse<IdealMerchantTransaction> get(Integer idealMerchantTransactionId, Integer monetaryAccountId, Map<String, String> params) {
        return get(idealMerchantTransactionId, monetaryAccountId, params, null);
    }

    /**
     *
     */
    public static BunqResponse<List<IdealMerchantTransaction>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

        return fromJsonList(IdealMerchantTransaction.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<List<IdealMerchantTransaction>> list() {
        return list(null, null, null);
    }

    public static BunqResponse<List<IdealMerchantTransaction>> list(Integer monetaryAccountId) {
        return list(monetaryAccountId, null, null);
    }

    public static BunqResponse<List<IdealMerchantTransaction>> list(Integer monetaryAccountId, Map<String, String> params) {
        return list(monetaryAccountId, params, null);
    }

    /**
     *
     */
    public static IdealMerchantTransaction fromJsonReader(JsonReader reader) {
        return fromJsonReader(IdealMerchantTransaction.class, reader);
    }

    /**
     * The id of the monetary account this ideal merchant transaction links to.
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
     * The alias of the monetary account the money comes from.
     */
    public LabelMonetaryAccount getCounterpartyAlias() {
        return this.counterpartyAlias;
    }

    public void setCounterpartyAlias(LabelMonetaryAccount counterpartyAlias) {
        this.counterpartyAlias = counterpartyAlias;
    }

    /**
     * In case of a successful transaction, the amount of money that will be transferred.
     */
    public Amount getAmountGuaranteed() {
        return this.amountGuaranteed;
    }

    public void setAmountGuaranteed(Amount amountGuaranteed) {
        this.amountGuaranteed = amountGuaranteed;
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
     * The BIC of the issuer.
     */
    public String getIssuer() {
        return this.issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * The Name of the issuer.
     */
    public String getIssuerName() {
        return this.issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    /**
     * The URL to visit to
     */
    public String getIssuerAuthenticationUrl() {
        return this.issuerAuthenticationUrl;
    }

    public void setIssuerAuthenticationUrl(String issuerAuthenticationUrl) {
        this.issuerAuthenticationUrl = issuerAuthenticationUrl;
    }

    /**
     * The 'purchase ID' of the iDEAL transaction.
     */
    public String getPurchaseIdentifier() {
        return this.purchaseIdentifier;
    }

    public void setPurchaseIdentifier(String purchaseIdentifier) {
        this.purchaseIdentifier = purchaseIdentifier;
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
     * The 'transaction ID' of the iDEAL transaction.
     */
    public String getTransactionIdentifier() {
        return this.transactionIdentifier;
    }

    public void setTransactionIdentifier(String transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
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

        if (this.counterpartyAlias != null) {
            return false;
        }

        if (this.amountGuaranteed != null) {
            return false;
        }

        if (this.amountRequested != null) {
            return false;
        }

        if (this.expiration != null) {
            return false;
        }

        if (this.issuer != null) {
            return false;
        }

        if (this.issuerName != null) {
            return false;
        }

        if (this.issuerAuthenticationUrl != null) {
            return false;
        }

        if (this.purchaseIdentifier != null) {
            return false;
        }

        if (this.status != null) {
            return false;
        }

        if (this.statusTimestamp != null) {
            return false;
        }

        if (this.transactionIdentifier != null) {
            return false;
        }

        return true;
    }

}
