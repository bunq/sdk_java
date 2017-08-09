package com.bunq.sdk.model;

import com.bunq.sdk.http.BunqResponseRaw;
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
  static <T> BunqResponse<T> fromJsonArrayNested(Class<T> classOfObject,
      BunqResponseRaw responseRaw) {
    String json = new String(responseRaw.getBodyBytes());
    JsonObject values = gson.fromJson(json, JsonObject.class);
    JsonArray jsonArrayNested = values.getAsJsonArray(FIELD_RESPONSE);
    T responseValue = gson.fromJson(jsonArrayNested, classOfObject);

    return new BunqResponse<>(responseValue, responseRaw.getHeaders());
  }

  /**
   * De-serializes an ID object and returns its integer value.
   */
  protected static BunqResponse<Integer> processForId(BunqResponseRaw responseRaw) {
    JsonObject responseContent = getResponseContent(responseRaw);
    JsonObject objectContent = getWrappedContent(responseContent, FIELD_ID);
    Integer responseValue = gson.fromJson(objectContent, Id.class).getId();

    return new BunqResponse<>(responseValue, responseRaw.getHeaders());
  }

  private static JsonObject getResponseContent(BunqResponseRaw responseRaw) {
    String json = new String(responseRaw.getBodyBytes());
    JsonObject responseWithWrapper = gson.fromJson(json, JsonObject.class);

    return responseWithWrapper.getAsJsonArray(FIELD_RESPONSE).get(INDEX_FIRST).getAsJsonObject();
  }

  private static JsonObject getWrappedContent(JsonObject json, String wrapper) {
    return json.getAsJsonObject(wrapper);
  }

  /**
   * De-serialize an object from JSON.
   */
  protected static <T> BunqResponse<T> fromJson(Class<T> classOfObject, BunqResponseRaw responseRaw,
      String wrapper) {
    JsonObject responseContent = getResponseContent(responseRaw);
    JsonObject objectContent = getWrappedContent(responseContent, wrapper);
    T responseValue = gson.fromJson(objectContent, classOfObject);

    return new BunqResponse<>(responseValue, responseRaw.getHeaders());
  }

  protected static <T> BunqResponse<T> fromJson(Class<T> classOfObject,
      BunqResponseRaw responseRaw) {
    JsonObject responseContent = getResponseContent(responseRaw);
    T responseValue = gson.fromJson(responseContent, classOfObject);

    return new BunqResponse<>(responseValue, responseRaw.getHeaders());
  }

  /**
   * De-serializes a list from JSON.
   */
  protected static <T> BunqResponse<List<T>> fromJsonList(Class<T> classOfListItem,
      BunqResponseRaw responseRaw,
      String wrapper) {
    JsonArray responseObjectArray = getResponseContentArray(responseRaw);
    List<T> list = new ArrayList<>();

    for (JsonElement objectContentWithWrapper : responseObjectArray) {
      JsonObject objectContent = getWrappedContent(objectContentWithWrapper.getAsJsonObject(),
          wrapper);
      list.add(gson.fromJson(objectContent, classOfListItem));
    }

    return new BunqResponse<>(list, responseRaw.getHeaders());
  }

  protected static <T> BunqResponse<List<T>> fromJsonList(Class<T> classOfListItem,
      BunqResponseRaw responseRaw) {
    JsonArray responseObjectsArray = getResponseContentArray(responseRaw);
    List<T> objects = new ArrayList<>();

    for (JsonElement responseObject : responseObjectsArray) {
      objects.add(gson.fromJson(responseObject, classOfListItem));
    }

    return new BunqResponse<>(objects, responseRaw.getHeaders());
  }

  private static JsonArray getResponseContentArray(BunqResponseRaw responseRaw) {
    String json = new String(responseRaw.getBodyBytes());
    JsonObject responseWithWrapper = gson.fromJson(json, JsonObject.class);

    return responseWithWrapper.getAsJsonArray(FIELD_RESPONSE);
  }

  /**
   * De-serializes an UUID object and returns its string value.
   */
  protected static BunqResponse<String> processForUuid(BunqResponseRaw responseRaw) {
    JsonObject responseContent = getResponseContent(responseRaw);
    JsonObject objectContent = getWrappedContent(responseContent, FIELD_UUID);
    String responseValue = gson.fromJson(objectContent, Uuid.class).getUuid();

    return new BunqResponse<>(responseValue, responseRaw.getHeaders());
  }

  public String toString() {
    return gson.toJson(this);
  }

}
