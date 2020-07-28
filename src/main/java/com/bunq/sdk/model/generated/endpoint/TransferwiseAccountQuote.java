package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.TransferwiseRequirementField;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to manage recipient accounts with Transferwise.
 */
public class TransferwiseAccountQuote extends BunqModel {

    /**
     * Field constants.
     */
    public static final String FIELD_COUNTRY = "country";
    public static final String FIELD_NAME_ACCOUNT_HOLDER = "name_account_holder";
    public static final String FIELD_TYPE = "type";
    public static final String FIELD_DETAIL = "detail";
    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_CREATE = "user/%s/transferwise-quote/%s/transferwise-recipient";
    protected static final String ENDPOINT_URL_READ = "user/%s/transferwise-quote/%s/transferwise-recipient/%s";
    protected static final String ENDPOINT_URL_LISTING = "user/%s/transferwise-quote/%s/transferwise-recipient";
    protected static final String ENDPOINT_URL_DELETE = "user/%s/transferwise-quote/%s/transferwise-recipient/%s";
    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_GET = "TransferwiseRecipient";

    /**
     * Transferwise's id of the account.
     */
    @Expose
    @SerializedName("account_id")
    private String accountId;

    /**
     * The currency the account.
     */
    @Expose
    @SerializedName("currency")
    private String currency;

    /**
     * The country of the account.
     */
    @Expose
    @SerializedName("country")
    private String country;

    /**
     * The name of the account holder.
     */
    @Expose
    @SerializedName("name_account_holder")
    private String nameAccountHolder;

    /**
     * The account number.
     */
    @Expose
    @SerializedName("account_number")
    private String accountNumber;

    /**
     * The bank code.
     */
    @Expose
    @SerializedName("bank_code")
    private String bankCode;

    /**
     * The country of the receiving account.
     */
    @Expose
    @SerializedName("country_field_for_request")
    private String countryFieldForRequest;

    /**
     * The name of the account holder.
     */
    @Expose
    @SerializedName("name_account_holder_field_for_request")
    private String nameAccountHolderFieldForRequest;

    /**
     * The chosen recipient account type. The possible options are provided dynamically in the
     * response endpoint.
     */
    @Expose
    @SerializedName("type_field_for_request")
    private String typeFieldForRequest;

    /**
     * The fields which were specified as "required" and have since been filled by the user. Always
     * provide the full list.
     */
    @Expose
    @SerializedName("detail_field_for_request")
    private List<TransferwiseRequirementField> detailFieldForRequest;

    public TransferwiseAccountQuote() {
        this(null, null, null, null);
    }

    public TransferwiseAccountQuote(String nameAccountHolder) {
        this(nameAccountHolder, null, null, null);
    }

    public TransferwiseAccountQuote(String nameAccountHolder, String type) {
        this(nameAccountHolder, type, null, null);
    }

    public TransferwiseAccountQuote(String nameAccountHolder, String type, String country) {
        this(nameAccountHolder, type, country, null);
    }

    public TransferwiseAccountQuote(String nameAccountHolder, String type, String country, List<TransferwiseRequirementField> detail) {
        this.countryFieldForRequest = country;
        this.nameAccountHolderFieldForRequest = nameAccountHolder;
        this.typeFieldForRequest = type;
        this.detailFieldForRequest = detail;
    }

    /**
     * @param nameAccountHolder The name of the account holder.
     * @param type              The chosen recipient account type. The possible options are provided dynamically
     *                          in the response endpoint.
     * @param country           The country of the receiving account.
     * @param detail            The fields which were specified as "required" and have since been filled by the
     *                          user. Always provide the full list.
     */
    public static BunqResponse<Integer> create(Integer transferwiseQuoteId, String nameAccountHolder, String type, String country, List<TransferwiseRequirementField> detail, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_COUNTRY, country);
        requestMap.put(FIELD_NAME_ACCOUNT_HOLDER, nameAccountHolder);
        requestMap.put(FIELD_TYPE, type);
        requestMap.put(FIELD_DETAIL, detail);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), transferwiseQuoteId), requestBytes, customHeaders);

        return processForId(responseRaw);
    }

    public static BunqResponse<Integer> create() {
        return create(null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer transferwiseQuoteId) {
        return create(transferwiseQuoteId, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer transferwiseQuoteId, String nameAccountHolder) {
        return create(transferwiseQuoteId, nameAccountHolder, null, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer transferwiseQuoteId, String nameAccountHolder, String type) {
        return create(transferwiseQuoteId, nameAccountHolder, type, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer transferwiseQuoteId, String nameAccountHolder, String type, String country) {
        return create(transferwiseQuoteId, nameAccountHolder, type, country, null, null);
    }

    public static BunqResponse<Integer> create(Integer transferwiseQuoteId, String nameAccountHolder, String type, String country, List<TransferwiseRequirementField> detail) {
        return create(transferwiseQuoteId, nameAccountHolder, type, country, detail, null);
    }

    /**
     *
     */
    public static BunqResponse<TransferwiseAccountQuote> get(Integer transferwiseQuoteId, Integer transferwiseAccountQuoteId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), transferwiseQuoteId, transferwiseAccountQuoteId), params, customHeaders);

        return fromJson(TransferwiseAccountQuote.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<TransferwiseAccountQuote> get() {
        return get(null, null, null, null);
    }

    public static BunqResponse<TransferwiseAccountQuote> get(Integer transferwiseQuoteId) {
        return get(transferwiseQuoteId, null, null, null);
    }

    public static BunqResponse<TransferwiseAccountQuote> get(Integer transferwiseQuoteId, Integer transferwiseAccountQuoteId) {
        return get(transferwiseQuoteId, transferwiseAccountQuoteId, null, null);
    }

    public static BunqResponse<TransferwiseAccountQuote> get(Integer transferwiseQuoteId, Integer transferwiseAccountQuoteId, Map<String, String> params) {
        return get(transferwiseQuoteId, transferwiseAccountQuoteId, params, null);
    }

    /**
     *
     */
    public static BunqResponse<List<TransferwiseAccountQuote>> list(Integer transferwiseQuoteId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), transferwiseQuoteId), params, customHeaders);

        return fromJsonList(TransferwiseAccountQuote.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<List<TransferwiseAccountQuote>> list() {
        return list(null, null, null);
    }

    public static BunqResponse<List<TransferwiseAccountQuote>> list(Integer transferwiseQuoteId) {
        return list(transferwiseQuoteId, null, null);
    }

    public static BunqResponse<List<TransferwiseAccountQuote>> list(Integer transferwiseQuoteId, Map<String, String> params) {
        return list(transferwiseQuoteId, params, null);
    }

    /**
     *
     */
    public static BunqResponse<TransferwiseAccountQuote> delete(Integer transferwiseQuoteId, Integer transferwiseAccountQuoteId, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), transferwiseQuoteId, transferwiseAccountQuoteId), customHeaders);

        return new BunqResponse<>(null, responseRaw.getHeaders());
    }

    public static BunqResponse<TransferwiseAccountQuote> delete(Integer transferwiseQuoteId) {
        return delete(transferwiseQuoteId, null, null);
    }

    public static BunqResponse<TransferwiseAccountQuote> delete(Integer transferwiseQuoteId, Integer transferwiseAccountQuoteId) {
        return delete(transferwiseQuoteId, transferwiseAccountQuoteId, null);
    }

    /**
     *
     */
    public static TransferwiseAccountQuote fromJsonReader(JsonReader reader) {
        return fromJsonReader(TransferwiseAccountQuote.class, reader);
    }

    /**
     * Transferwise's id of the account.
     */
    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * The currency the account.
     */
    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * The country of the account.
     */
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * The name of the account holder.
     */
    public String getNameAccountHolder() {
        return this.nameAccountHolder;
    }

    public void setNameAccountHolder(String nameAccountHolder) {
        this.nameAccountHolder = nameAccountHolder;
    }

    /**
     * The account number.
     */
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * The bank code.
     */
    public String getBankCode() {
        return this.bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.accountId != null) {
            return false;
        }

        if (this.currency != null) {
            return false;
        }

        if (this.country != null) {
            return false;
        }

        if (this.nameAccountHolder != null) {
            return false;
        }

        if (this.accountNumber != null) {
            return false;
        }

        if (this.bankCode != null) {
            return false;
        }

        return true;
    }

}
