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
 * Used to determine the recipient account requirements for Transferwise transfers.
 */
public class TransferwiseAccountRequirement extends BunqModel {

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
    protected static final String ENDPOINT_URL_CREATE = "user/%s/transferwise-quote/%s/transferwise-recipient-requirement";
    protected static final String ENDPOINT_URL_LISTING = "user/%s/transferwise-quote/%s/transferwise-recipient-requirement";
    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_GET = "TransferwiseRequirement";

    /**
     * A possible recipient account type.
     */
    @Expose
    @SerializedName("type")
    private String type;

    /**
     * The label of the possible recipient account type to show to the user.
     */
    @Expose
    @SerializedName("label")
    private String label;

    /**
     * The fields which the user needs to fill.
     */
    @Expose
    @SerializedName("fields")
    private List<TransferwiseRequirementField> fields;

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

    public TransferwiseAccountRequirement() {
        this(null, null, null, null);
    }

    public TransferwiseAccountRequirement(String nameAccountHolder) {
        this(nameAccountHolder, null, null, null);
    }

    public TransferwiseAccountRequirement(String nameAccountHolder, String type) {
        this(nameAccountHolder, type, null, null);
    }

    public TransferwiseAccountRequirement(String nameAccountHolder, String type, String country) {
        this(nameAccountHolder, type, country, null);
    }

    public TransferwiseAccountRequirement(String nameAccountHolder, String type, String country, List<TransferwiseRequirementField> detail) {
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
    public static BunqResponse<List<TransferwiseAccountRequirement>> list(Integer transferwiseQuoteId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), transferwiseQuoteId), params, customHeaders);

        return fromJsonList(TransferwiseAccountRequirement.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<List<TransferwiseAccountRequirement>> list() {
        return list(null, null, null);
    }

    public static BunqResponse<List<TransferwiseAccountRequirement>> list(Integer transferwiseQuoteId) {
        return list(transferwiseQuoteId, null, null);
    }

    public static BunqResponse<List<TransferwiseAccountRequirement>> list(Integer transferwiseQuoteId, Map<String, String> params) {
        return list(transferwiseQuoteId, params, null);
    }

    /**
     *
     */
    public static TransferwiseAccountRequirement fromJsonReader(JsonReader reader) {
        return fromJsonReader(TransferwiseAccountRequirement.class, reader);
    }

    /**
     * A possible recipient account type.
     */
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * The label of the possible recipient account type to show to the user.
     */
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * The fields which the user needs to fill.
     */
    public List<TransferwiseRequirementField> getFields() {
        return this.fields;
    }

    public void setFields(List<TransferwiseRequirementField> fields) {
        this.fields = fields;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.type != null) {
            return false;
        }

        if (this.label != null) {
            return false;
        }

        if (this.fields != null) {
            return false;
        }

        return true;
    }

}
