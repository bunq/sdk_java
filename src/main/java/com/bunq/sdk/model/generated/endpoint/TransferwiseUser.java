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
 * Used to manage Transferwise users.
 */
public class TransferwiseUser extends BunqModel {

    /**
     * Field constants.
     */
    public static final String FIELD_OAUTH_CODE = "oauth_code";
    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_CREATE = "user/%s/transferwise-user";
    protected static final String ENDPOINT_URL_LISTING = "user/%s/transferwise-user";
    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_GET = "TransferwiseUser";

    /**
     * The id of the TransferwiseUser.
     */
    @Expose
    @SerializedName("id")
    private Integer id;

    /**
     * The timestamp of the TransferwiseUser's creation.
     */
    @Expose
    @SerializedName("created")
    private String created;

    /**
     * The timestamp of the TransferwiseUser's last update.
     */
    @Expose
    @SerializedName("updated")
    private String updated;

    /**
     * The name the user is registered with at TransferWise.
     */
    @Expose
    @SerializedName("name")
    private String name;

    /**
     * The email the user is registered with at TransferWise.
     */
    @Expose
    @SerializedName("email")
    private String email;

    /**
     * The OAuth code returned by Transferwise we should be using to gain access to the user's
     * Transferwise account.
     */
    @Expose
    @SerializedName("oauth_code_field_for_request")
    private String oauthCodeFieldForRequest;

    public TransferwiseUser() {
        this(null);
    }

    public TransferwiseUser(String oauthCode) {
        this.oauthCodeFieldForRequest = oauthCode;
    }

    /**
     * @param oauthCode The OAuth code returned by Transferwise we should be using to gain access to
     *                  the user's Transferwise account.
     */
    public static BunqResponse<Integer> create(String oauthCode, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_OAUTH_CODE, oauthCode);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

        return processForId(responseRaw);
    }

    public static BunqResponse<Integer> create() {
        return create(null, null);
    }

    public static BunqResponse<Integer> create(String oauthCode) {
        return create(oauthCode, null);
    }

    /**
     *
     */
    public static BunqResponse<List<TransferwiseUser>> list(Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

        return fromJsonList(TransferwiseUser.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<List<TransferwiseUser>> list() {
        return list(null, null);
    }

    public static BunqResponse<List<TransferwiseUser>> list(Map<String, String> params) {
        return list(params, null);
    }

    /**
     *
     */
    public static TransferwiseUser fromJsonReader(JsonReader reader) {
        return fromJsonReader(TransferwiseUser.class, reader);
    }

    /**
     * The id of the TransferwiseUser.
     */
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The timestamp of the TransferwiseUser's creation.
     */
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * The timestamp of the TransferwiseUser's last update.
     */
    public String getUpdated() {
        return this.updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    /**
     * The name the user is registered with at TransferWise.
     */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The email the user is registered with at TransferWise.
     */
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.id != null) {
            return false;
        }

        if (this.created != null) {
            return false;
        }

        if (this.updated != null) {
            return false;
        }

        if (this.name != null) {
            return false;
        }

        if (this.email != null) {
            return false;
        }

        return true;
    }

}
