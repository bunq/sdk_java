package com.bunq.sdk.model.core;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;

import java.util.HashMap;

public class Installation extends BunqModel {

    /**
     * Endpoint name.
     */
    private static final String ENDPOINT_URL_POST = "installation";

    /**
     * Field constants.
     */
    private static final String FIELD_CLIENT_PUBLIC_KEY = "client_public_key";

    private final Id id;
    private final SessionToken sessionToken;
    private final PublicKeyServer publicKeyServer;

    public Installation(Id id, SessionToken sessionToken, PublicKeyServer publicKeyServer) {
        this.id = id;
        this.sessionToken = sessionToken;
        this.publicKeyServer = publicKeyServer;
    }

    /**
     * This is the only API call that does not require you to use the
     * "X-Bunq-Client-Authentication" and "X-Bunq-Client-Signature" headers. You
     * provide the server with the public part of the key pair that you are going
     * to use to create the value of the signature header for all future API
     * calls. The server creates an installation for you. Store the Installation
     * Token and ServerPublicKey from the response. This token is used in the
     * "X-Bunq-Client-Authentication" header for the creation of a DeviceServer
     * and SessionServer.
     */
    public static BunqResponse<Installation> create(ApiContext apiContext,
                                                    String publicKeyClientString) {
        ApiClient apiClient = new ApiClient(apiContext);
        byte[] requestBytes = generateRequestBodyBytes(publicKeyClientString);
        BunqResponseRaw responseRaw = apiClient.post(
                ENDPOINT_URL_POST,
                requestBytes,
                new HashMap<String, String>()
        );

        return fromJsonArrayNested(Installation.class, responseRaw);
    }

    private static byte[] generateRequestBodyBytes(String publicKeyClientString) {
        HashMap<String, Object> installationRequestBody = new HashMap<>();
        installationRequestBody.put(FIELD_CLIENT_PUBLIC_KEY, publicKeyClientString);

        return gson.toJson(installationRequestBody).getBytes();
    }

    public Integer getId() {
        return id.getId();
    }

    public SessionToken getSessionToken() {
        return sessionToken;
    }

    public String getPublicKeyServer() {
        return publicKeyServer.getPublicKeyServer();
    }

    @Override
    public boolean isAllFieldNull() {
        if (this.id == null) {
            return false;
        }

        if (this.sessionToken == null) {
            return false;
        }

        return this.publicKeyServer != null;
    }
}
