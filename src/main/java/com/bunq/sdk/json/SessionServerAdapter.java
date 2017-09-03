package com.bunq.sdk.json;

import com.bunq.sdk.model.Id;
import com.bunq.sdk.model.SessionServer;
import com.bunq.sdk.model.SessionToken;
import com.bunq.sdk.model.generated.UserCompany;
import com.bunq.sdk.model.generated.UserPerson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/**
 * Custom (de)serialization of SessionServer required due to the unconventional structure of the
 * SessionServer POST response.
 */
public class SessionServerAdapter implements JsonDeserializer<SessionServer> {

  private static final int INDEX_ID = 0;
  private static final String FIELD_ID = "Id";

  private static final int INDEX_TOKEN = 1;
  private static final String FIELD_TOKEN = "Token";

  private static final int INDEX_USER = 2;
  private static final String FIELD_USER_COMPANY = "UserCompany";
  private static final String FIELD_USER_PERSON = "UserPerson";

  @Override
  public SessionServer deserialize(JsonElement json, Type typeOfT,
      JsonDeserializationContext context) throws JsonParseException {
    System.out.println(json);
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
    } else {
      UserPerson userPerson = context.deserialize(
          userBody.get(FIELD_USER_PERSON),
          UserPerson.class
      );

      return new SessionServer(id, token, userPerson);
    }
  }

  private static JsonElement getByIndexAndFieldName(JsonArray values, int index, String fieldName) {
    return values.get(index).getAsJsonObject().get(fieldName);
  }

}
