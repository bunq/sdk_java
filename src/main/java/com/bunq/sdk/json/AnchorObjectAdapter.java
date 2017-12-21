package com.bunq.sdk.json;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.AnchorObjectInterface;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.Gson;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class AnchorObjectAdapter implements JsonDeserializer<AnchorObjectInterface> {
  @Override
  public AnchorObjectInterface deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws
      JsonParseException {
    AnchorObjectInterface model = new Gson().fromJson(json, typeOfT);

    if (model.isAllFieldNull()) {
      Field[] allFields = model.getClass().getDeclaredFields();

      for(Field field : allFields) {
        if (!BunqModel.class.isAssignableFrom(field.getType())) {
          continue;
        }

        BunqModel content = new Gson().fromJson(json, (Type) field.getType());
        field.setAccessible(true);

        try {
          if (content.isAllFieldNull()) {
            field.set(model, null);
          } else {
            field.set(model, content);
          }
        } catch (IllegalAccessException e) {
          throw new BunqException(e.getMessage());
        }

        field.setAccessible(false);
      }
    }

    return model;
  }
}
