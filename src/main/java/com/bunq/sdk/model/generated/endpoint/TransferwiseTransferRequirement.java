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
 * Used to determine the account requirements for Transferwise transfers.
 */
public class TransferwiseTransferRequirement extends BunqModel {

    /**
     * Field constants.
     */
    public static final String FIELD_RECIPIENT_ID = "recipient_id";
    public static final String FIELD_DETAIL = "detail";
    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_CREATE = "user/%s/transferwise-quote/%s/transferwise-transfer-requirement";
    /**
     * A possible transfer type.
     */
    @Expose
    @SerializedName("type")
    private String type;

    /**
     * The label of the possible transfer type to show to the user.
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
     * The id of the target account.
     */
    @Expose
    @SerializedName("recipient_id_field_for_request")
    private String recipientIdFieldForRequest;

    /**
     * The fields which were specified as "required" and have since been filled by the user. Always
     * provide the full list.
     */
    @Expose
    @SerializedName("detail_field_for_request")
    private List<TransferwiseRequirementField> detailFieldForRequest;

    public TransferwiseTransferRequirement() {
        this(null, null);
    }

    public TransferwiseTransferRequirement(String recipientId) {
        this(recipientId, null);
    }

    public TransferwiseTransferRequirement(String recipientId, List<TransferwiseRequirementField> detail) {
        this.recipientIdFieldForRequest = recipientId;
        this.detailFieldForRequest = detail;
    }

    /**
     * @param recipientId The id of the target account.
     * @param detail      The fields which were specified as "required" and have since been filled by the
     *                    user. Always provide the full list.
     */
    public static BunqResponse<Integer> create(Integer transferwiseQuoteId, String recipientId, List<TransferwiseRequirementField> detail, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_RECIPIENT_ID, recipientId);
        requestMap.put(FIELD_DETAIL, detail);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), transferwiseQuoteId), requestBytes, customHeaders);

        return processForId(responseRaw);
    }

    public static BunqResponse<Integer> create() {
        return create(null, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer transferwiseQuoteId) {
        return create(transferwiseQuoteId, null, null, null);
    }

    public static BunqResponse<Integer> create(Integer transferwiseQuoteId, String recipientId) {
        return create(transferwiseQuoteId, recipientId, null, null);
    }

    public static BunqResponse<Integer> create(Integer transferwiseQuoteId, String recipientId, List<TransferwiseRequirementField> detail) {
        return create(transferwiseQuoteId, recipientId, detail, null);
    }

    /**
     *
     */
    public static TransferwiseTransferRequirement fromJsonReader(JsonReader reader) {
        return fromJsonReader(TransferwiseTransferRequirement.class, reader);
    }

    /**
     * A possible transfer type.
     */
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * The label of the possible transfer type to show to the user.
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
