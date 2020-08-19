package com.bunq.sdk.json;

import com.bunq.sdk.model.core.Id;
import com.bunq.sdk.model.core.Installation;
import com.bunq.sdk.model.core.PublicKeyServer;
import com.bunq.sdk.model.core.SessionToken;
import com.google.gson.*;

import java.lang.reflect.Type;

/**
 * Custom (de)serialization of Installation required due to the unconventional structure of the
 * Installation POST response.
 */
public class InstallationAdapter implements JsonDeserializer<Installation> {

    private static final int INDEX_ID = 0;
    private static final String FIELD_ID = "Id";

    private static final int INDEX_TOKEN = 1;
    private static final String FIELD_TOKEN = "Token";

    private static final int INDEX_SERVER_PUBLIC_KEY = 2;
    private static final String FIELD_SERVER_PUBLIC_KEY = "ServerPublicKey";

    @Override
    public Installation deserialize(JsonElement json, Type typeOfT,
                                    JsonDeserializationContext context) throws JsonParseException {
        JsonArray values = json.getAsJsonArray();

        Id id = context.deserialize(
                getByIndexAndFieldName(values, INDEX_ID, FIELD_ID),
                Id.class
        );
        SessionToken token = context.deserialize(
                getByIndexAndFieldName(values, INDEX_TOKEN, FIELD_TOKEN),
                SessionToken.class
        );
        PublicKeyServer publicKeyServer = context.deserialize(
                getByIndexAndFieldName(values, INDEX_SERVER_PUBLIC_KEY, FIELD_SERVER_PUBLIC_KEY),
                PublicKeyServer.class
        );

        return new Installation(id, token, publicKeyServer);
    }

    private JsonElement getByIndexAndFieldName(JsonArray values, int index, String fieldName) {
        return values.get(index).getAsJsonObject().get(fieldName);
    }
}
