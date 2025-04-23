package com.bunq.sdk.model.core;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.generated.endpoint.UserApiKeyApiObject;
import com.bunq.sdk.model.generated.endpoint.UserCompanyApiObject;
import com.bunq.sdk.model.generated.endpoint.UserPaymentServiceProviderApiObject;
import com.bunq.sdk.model.generated.endpoint.UserPersonApiObject;
import com.bunq.sdk.util.BunqUtil;

import java.util.HashMap;

public class SessionServer extends BunqModel {
    /**
     * Endpoint name.
     */
    private static final String ENDPOINT_URL_POST = "session-server";

    /**
     * Field constants.
     */
    private static final String FIELD_SECRET = "secret";

    private final Id id;
    private final SessionToken sessionToken;
    private UserCompanyApiObject userCompany;
    private UserPersonApiObject userPerson;
    private UserApiKeyApiObject userApiKey;
    private UserPaymentServiceProviderApiObject userPaymentServiceProvider;

    public SessionServer(Id id, SessionToken sessionToken, UserCompanyApiObject userCompany) {
        this.id = id;
        this.sessionToken = sessionToken;
        this.userCompany = userCompany;
    }

    public SessionServer(Id id, SessionToken sessionToken, UserPersonApiObject userPerson) {
        this.id = id;
        this.sessionToken = sessionToken;
        this.userPerson = userPerson;
    }

    public SessionServer(Id id, SessionToken sessionToken, UserPaymentServiceProviderApiObject userPaymentServiceProvider) {
        this.id = id;
        this.sessionToken = sessionToken;
        this.userPaymentServiceProvider = userPaymentServiceProvider;
    }

    public SessionServer(Id id, SessionToken sessionToken, UserApiKeyApiObject userApiKey) {
        this.id = id;
        this.sessionToken = sessionToken;
        this.userApiKey = userApiKey;
    }

    /**
     * Create a new session for a DeviceServer. Provide the Installation token
     * in the "X-Bunq-Client-Authentication" header. And don't forget to create
     * the "X-Bunq-Client-Signature" header. The response contains a Session
     * token that should be used for as the "X-Bunq-Client-Authentication" header
     * for all future API calls. The ip address making this call needs to match
     * the ip address bound to your API key.
     */
    public static BunqResponse<SessionServer> create(ApiContext apiContext) {
        ApiClient apiClient = new ApiClient(apiContext);
        byte[] requestBytes = generateRequestBodyBytes(apiContext.getApiKey());
        BunqResponseRaw responseRaw = apiClient.post(
                ENDPOINT_URL_POST,
                requestBytes,
                new HashMap<String, String>()
        );

        return fromJsonArrayNested(SessionServer.class, responseRaw);
    }

    private static byte[] generateRequestBodyBytes(String apiKey) {
        HashMap<String, Object> sessionServerRequestBody = new HashMap<>();
        sessionServerRequestBody.put(FIELD_SECRET, apiKey);

        return gson.toJson(sessionServerRequestBody).getBytes();
    }

    public Id getId() {
        return id;
    }

    public SessionToken getSessionToken() {
        return sessionToken;
    }

    public UserPersonApiObject getUserPersonOrNull() {
        return userPerson;
    }

    public UserCompanyApiObject getUserCompanyOrNull() {
        return userCompany;
    }

    public UserApiKeyApiObject getUserApiKeyOrNull() {
        return userApiKey;
    }

    public UserPaymentServiceProviderApiObject getUserPaymentServiceProviderOrNull() {
        return userPaymentServiceProvider;
    }

    @Override
    public boolean isAllFieldNull() {
        if (this.id == null) {
            return false;
        }

        if (this.sessionToken != null) {
            return false;
        }

        if (this.userCompany != null) {
            return false;
        }

        if (this.userPerson != null) {
            return false;
        }

        return this.userApiKey == null;
    }

    public BunqModel getReferencedUser() {
        return BunqUtil.getReferencedUser(userPerson, userCompany, userApiKey, userPaymentServiceProvider);
    }
}
