package com.bunq.sdk.model.core;

import com.google.gson.annotations.SerializedName;

/**
 * Public Key returned by the server as a response to the Installation call.
 */
public class PublicKeyServer {

    @SerializedName("server_public_key")
    private String serverPublicKey;

    public PublicKeyServer() {
    }

    public PublicKeyServer(String serverPublicKey) {
        this.serverPublicKey = serverPublicKey;
    }

    public String getPublicKeyServer() {
        return serverPublicKey;
    }
}