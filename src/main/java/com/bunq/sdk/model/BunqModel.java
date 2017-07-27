package com.bunq.sdk.model;

import com.bunq.sdk.json.BunqGsonBuilder;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;

abstract public class BunqModel {

  /**
   * Field constants.
   */
  private static final String FIELD_RESPONSE = "Response";
  private static final String FIELD_ID = "Id";
  private static final String FIELD_UUID = "Uuid";

  /**
   * Index of the very first item in an array.
   */
  private static final int INDEX_FIRST = 0;

  /**
   * Gson builder for serialization.
   */
  protected static Gson gson = BunqGsonBuilder.buildDefault().create();

  protected BunqModel() {
  }

  /**
   * De-serializes an object from a JSON format specific to Installation and SessionServer.
   */
  static <T> T fromJsonArrayNested(Class<T> classOfObject, String json) {
    JsonObject values = gson.fromJson(json, JsonObject.class);
    JsonArray jsonArrayNested = values.getAsJsonArray(FIELD_RESPONSE);

    return gson.fromJson(jsonArrayNested, classOfObject);
  }

  /**
   * De-serializes an ID object and returns its integer value.
   */
  protected static Integer processForId(String json) {
    JsonObject responseContent = getResponseContent(json);
    JsonObject objectContent = getWrappedContent(responseContent, FIELD_ID);

    return gson.fromJson(objectContent, Id.class).getId();
  }

  private static JsonObject getResponseContent(String json) {
    JsonObject responseWithWrapper = gson.fromJson(json, JsonObject.class);

    return responseWithWrapper.getAsJsonArray(FIELD_RESPONSE).get(INDEX_FIRST).getAsJsonObject();
  }

  private static JsonObject getWrappedContent(JsonObject json, String wrapper) {
    return json.getAsJsonObject(wrapper);
  }

  /**
   * De-serialize an object from JSON.
   */
  protected static <T> T fromJson(Class<T> classOfObject, String json, String wrapper) {
    JsonObject responseContent = getResponseContent(json);
    JsonObject objectContent = getWrappedContent(responseContent, wrapper);

    return gson.fromJson(objectContent, classOfObject);
  }

  protected static <T> T fromJson(Class<T> classOfObject, String json) {
    JsonObject responseContent = getResponseContent(json);

    return gson.fromJson(responseContent, classOfObject);
  }

  /**
   * De-serializes a list from JSON.
   */
  protected static <T> List<T> fromJsonList(Class<T> classOfListItem, String json, String wrapper) {
    JsonArray responseObjectArray = getResponseContentArray(json);
    List<T> list = new ArrayList<>();

    for (JsonElement objectContentWithWrapper : responseObjectArray) {
      JsonObject objectContent = getWrappedContent(objectContentWithWrapper.getAsJsonObject(),
          wrapper);
      list.add(gson.fromJson(objectContent, classOfListItem));
    }

    return list;
  }

  protected static <T> List<T> fromJsonList(Class<T> classOfListItem, String json) {
    JsonArray responseObjectsArray = getResponseContentArray(json);
    List<T> objects = new ArrayList<>();

    for (JsonElement responseObject : responseObjectsArray) {
      objects.add(gson.fromJson(responseObject, classOfListItem));
    }

    return objects;
  }

  private static JsonArray getResponseContentArray(String json) {
    JsonObject responseWithWrapper = gson.fromJson(json, JsonObject.class);

    return responseWithWrapper.getAsJsonArray(FIELD_RESPONSE);
  }

  /**
   * De-serializes an UUID object and returns its string value.
   */
  protected static String processForUuid(String json) {
    JsonObject responseContent = getResponseContent(json);
    JsonObject objectContent = getWrappedContent(responseContent, FIELD_UUID);

    return gson.fromJson(objectContent, Uuid.class).getUuid();
  }

  public String toString() {
    return gson.toJson(this);
  }

}
