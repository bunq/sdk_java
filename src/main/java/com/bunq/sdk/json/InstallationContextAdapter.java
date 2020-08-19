package com.bunq.sdk.json;

import com.bunq.sdk.context.InstallationContext;
import com.bunq.sdk.security.SecurityUtils;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.security.KeyPair;
import java.security.PublicKey;

/**
 * Custom (de)serialization of InstallationContext required due to presence in it of the encryption
 * keys which should be formatted when serialized in a special way.
 */
public class InstallationContextAdapter
        implements JsonSerializer<InstallationContext>, JsonDeserializer<InstallationContext> {

    private static final String FIELD_TOKEN = "token";
    private static final String FIELD_PUBLIC_KEY_CLIENT = "public_key_client";
    private static final String FIELD_PRIVATE_KEY_CLIENT = "private_key_client";
    private static final String FIELD_PUBLIC_KEY_SERVER = "public_key_server";

    @Override
    public JsonElement serialize(InstallationContext installationContext, Type typeOfSrc,
                                 JsonSerializationContext context) {
        JsonObject jsonObject = new JsonObject();

        String installationToken = installationContext.getToken();
        jsonObject.addProperty(FIELD_TOKEN, installationToken);

        KeyPair keyPairClient = installationContext.getKeyPairClient();
        String publicKeyClientString = SecurityUtils.getPublicKeyFormattedString(keyPairClient);
        jsonObject.addProperty(FIELD_PUBLIC_KEY_CLIENT, publicKeyClientString);
        String privateKeyClientString = SecurityUtils.getPrivateKeyFormattedString(keyPairClient);
        jsonObject.addProperty(FIELD_PRIVATE_KEY_CLIENT, privateKeyClientString);

        PublicKey publicKeyServer = installationContext.getPublicKeyServer();
        String publicKeyServerString = SecurityUtils.getPublicKeyFormattedString(publicKeyServer);
        jsonObject.addProperty(FIELD_PUBLIC_KEY_SERVER, publicKeyServerString);

        return jsonObject;
    }

    @Override
    public InstallationContext deserialize(
            JsonElement jsonElement,
            Type typeOfT,
            JsonDeserializationContext context
    ) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();

        String installationToken = jsonObject.get(FIELD_TOKEN).getAsString();

        KeyPair keyPairClient = SecurityUtils.createKeyPairFromFormattedStrings(
                jsonObject.get(FIELD_PUBLIC_KEY_CLIENT).getAsString(),
                jsonObject.get(FIELD_PRIVATE_KEY_CLIENT).getAsString()
        );

        PublicKey publicKeyServer = SecurityUtils.createPublicKeyFromFormattedString(
                jsonObject.get(FIELD_PUBLIC_KEY_SERVER).getAsString()
        );

        return new InstallationContext(installationToken, keyPairClient, publicKeyServer);
    }
}