package com.bunq.sdk.json;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.Id;
import com.bunq.sdk.model.core.SessionServer;
import com.bunq.sdk.model.core.SessionToken;
import com.bunq.sdk.model.generated.endpoint.UserApiKey;
import com.bunq.sdk.model.generated.endpoint.UserCompany;
import com.bunq.sdk.model.generated.endpoint.UserPaymentServiceProvider;
import com.bunq.sdk.model.generated.endpoint.UserPerson;
import com.google.gson.*;

import java.lang.reflect.Type;

/**
 * Custom (de)serialization of SessionServer required due to the unconventional structure of the
 * SessionServer POST response.
 */
public class SessionServerAdapter implements JsonDeserializer<SessionServer> {
    /**
     * Error constants.
     */
    private static final String ERROR_COULD_NOT_DETERMINE_USER = "Could not determine user.";

    private static final int INDEX_ID = 0;
    private static final String FIELD_ID = "Id";

    private static final int INDEX_TOKEN = 1;
    private static final String FIELD_TOKEN = "Token";

    private static final int INDEX_USER = 2;
    private static final String FIELD_USER_COMPANY = "UserCompany";
    private static final String FIELD_USER_PERSON = "UserPerson";
    private static final String FIELD_USER_API_KEY = "UserApiKey";
    private static final String FIELD_USER_PAYMENT_SERVER_PROVIDER = "UserPaymentServiceProvider";

    @Override
    public SessionServer deserialize(JsonElement json, Type typeOfT,
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
        JsonObject userBody = values.get(INDEX_USER).getAsJsonObject();

        if (userBody.has(FIELD_USER_COMPANY)) {
            UserCompany userCompany = context.deserialize(
                    userBody.get(FIELD_USER_COMPANY),
                    UserCompany.class
            );

            return new SessionServer(id, token, userCompany);
        } else if (userBody.has(FIELD_USER_PERSON)) {
            UserPerson userPerson = context.deserialize(
                    userBody.get(FIELD_USER_PERSON),
                    UserPerson.class
            );

            return new SessionServer(id, token, userPerson);
        } else if (userBody.has(FIELD_USER_API_KEY)) {
            UserApiKey userApiKey = context.deserialize(
                    userBody.get(FIELD_USER_API_KEY),
                    UserApiKey.class
            );

            return new SessionServer(id, token, userApiKey);
        } else if (userBody.has(FIELD_USER_PAYMENT_SERVER_PROVIDER)) {
            UserPaymentServiceProvider userPaymentServiceProvider = context.deserialize(
                    userBody.get(FIELD_USER_PAYMENT_SERVER_PROVIDER),
                    UserPaymentServiceProvider.class
            );

            return new SessionServer(id, token, userPaymentServiceProvider);
        } else {
            throw new BunqException(ERROR_COULD_NOT_DETERMINE_USER);
        }
    }

    private static JsonElement getByIndexAndFieldName(JsonArray values, int index, String fieldName) {
        return values.get(index).getAsJsonObject().get(fieldName);
    }
}
