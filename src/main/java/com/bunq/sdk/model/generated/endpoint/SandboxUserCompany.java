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
 * Used to create a sandbox userCompany.
 */
public class SandboxUserCompany extends BunqModel {

    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_CREATE = "sandbox-user-company";

    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_POST = "ApiKey";

    /**
     * The API key of the newly created sandbox userCompany.
     */
    @Expose
    @SerializedName("api_key")
    private String apiKey;

    /**
     *
     */
    public static BunqResponse<SandboxUserCompany> create(Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.post(ENDPOINT_URL_CREATE, requestBytes, customHeaders);

        return fromJson(SandboxUserCompany.class, responseRaw, OBJECT_TYPE_POST);
    }

    public static BunqResponse<SandboxUserCompany> create() {
        return create(null);
    }

    /**
     *
     */
    public static SandboxUserCompany fromJsonReader(JsonReader reader) {
        return fromJsonReader(SandboxUserCompany.class, reader);
    }

    /**
     * The API key of the newly created sandbox userCompany.
     */
    public String getApiKey() {
        return this.apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.apiKey != null) {
            return false;
        }

        return true;
    }

}
