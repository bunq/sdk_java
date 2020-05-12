package com.bunq.sdk.model.core;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.context.BunqContext;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.http.Pagination;
import com.bunq.sdk.json.BunqGsonBuilder;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

abstract public class BunqModel {

  /**
   * Field constants.
   */
  private static final String FIELD_RESPONSE = "Response";
  private static final String FIELD_ID = "Id";
  private static final String FIELD_UUID = "Uuid";
  private static final String FIELD_PAGINATION = "Pagination";

  /**
   * Index of the very first item in an array.
   */
  private static final int INDEX_FIRST = 0;

  /**
   * String format constants.
   */
  private static final String STRING_EMPTY = "";

  /**
   * Regex constants.
   */
  private static final String REGEX_FIELD_FOR_REQUEST = "(_field_for_request)";

  /**
   * Gson builder for serialization.
   */
  protected static Gson gson = BunqGsonBuilder.buildDefault().create();

  protected BunqModel() {
  }

  /**
   */
  public static <T> T fromJsonReader(Class<T> tClass, JsonReader reader) {
    return gson.fromJson(
        reader,
        tClass
    );
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
    JsonObject responseItemObject = getResponseItemObject(responseRaw);
    JsonObject responseItemObjectUnwrapped = getWrappedContent(responseItemObject, FIELD_ID);
    Integer responseValue = gson.fromJson(responseItemObjectUnwrapped, Id.class).getId();

    return new BunqResponse<>(responseValue, responseRaw.getHeaders());
  }

  private static JsonObject getResponseItemObject(BunqResponseRaw responseRaw) {
    JsonObject responseItemObject = deserializeResponseObject(responseRaw);

    return responseItemObject.getAsJsonArray(FIELD_RESPONSE).get(INDEX_FIRST).getAsJsonObject();
  }

  private static JsonObject getWrappedContent(JsonObject json, String wrapper) {
    return json.getAsJsonObject(wrapper);
  }

  /**
   * De-serialize an object from JSON.
   */
  protected static <T> BunqResponse<T> fromJson(Class<T> classOfObject, BunqResponseRaw responseRaw,
      String wrapper) {
    JsonObject responseItemObject = getResponseItemObject(responseRaw);
    JsonObject responseItemObjectUnwrapped = getWrappedContent(responseItemObject, wrapper);
    T responseValue = gson.fromJson(responseItemObjectUnwrapped, classOfObject);

    return new BunqResponse<>(responseValue, responseRaw.getHeaders());
  }

  protected static <T> BunqResponse<T> fromJson(Class<T> classOfObject,
      BunqResponseRaw responseRaw) {
    JsonObject responseItemObject = getResponseItemObject(responseRaw);
    T responseValue = gson.fromJson(responseItemObject, classOfObject);

    return new BunqResponse<>(responseValue, responseRaw.getHeaders());
  }

  /**
   * De-serializes a list from JSON.
   */
  protected static <T> BunqResponse<List<T>> fromJsonList(Class<T> classOfListItem,
      BunqResponseRaw responseRaw,
      String wrapper) {
    JsonObject responseObject = deserializeResponseObject(responseRaw);
    JsonArray response = responseObject.getAsJsonArray(FIELD_RESPONSE);
    List<T> list = new ArrayList<>();

    for (JsonElement responseItemWrapped : response) {
      JsonObject responseItemObject = getWrappedContent(responseItemWrapped.getAsJsonObject(),
          wrapper);
      list.add(gson.fromJson(responseItemObject, classOfListItem));
    }

    JsonElement paginationObject = responseObject.get(FIELD_PAGINATION);
    Pagination pagination = gson.fromJson(paginationObject, Pagination.class);

    return new BunqResponse<>(list, responseRaw.getHeaders(), pagination);
  }

  protected static <T> BunqResponse<List<T>> fromJsonList(Class<T> classOfListItem,
      BunqResponseRaw responseRaw) {
    JsonObject responseObject = deserializeResponseObject(responseRaw);
    JsonArray response = responseObject.getAsJsonArray(FIELD_RESPONSE);
    List<T> objects = new ArrayList<>();

    for (JsonElement responseItem : response) {
      objects.add(gson.fromJson(responseItem, classOfListItem));
    }

    JsonElement paginationObject = responseObject.get(FIELD_PAGINATION);
    Pagination pagination = gson.fromJson(paginationObject, Pagination.class);

    return new BunqResponse<>(objects, responseRaw.getHeaders(), pagination);
  }

  protected static JsonObject deserializeResponseObject(BunqResponseRaw responseRaw) {
    String json = new String(responseRaw.getBodyBytes());

    return gson.fromJson(json, JsonObject.class);
  }

  /**
   * De-serializes an UUID object and returns its string value.
   */
  protected static BunqResponse<String> processForUuid(BunqResponseRaw responseRaw) {
    JsonObject responseItemObject = getResponseItemObject(responseRaw);
    JsonObject responseItemObjectUnwrapped = getWrappedContent(responseItemObject, FIELD_UUID);
    String responseValue = gson.fromJson(responseItemObjectUnwrapped, Uuid.class).getUuid();

    return new BunqResponse<>(responseValue, responseRaw.getHeaders());
  }

  public String toString() {
    return gson.toJson(this);
  }

  /**
   */
  abstract public boolean isAllFieldNull();

  protected static ApiContext getApiContext() {
    return BunqContext.getApiContext();
  }

  protected static Integer determineUserId() {
    return BunqContext.getUserContext().getUserId();
  }

  protected static Integer determineMonetaryAccountId(Integer id) {
    if (id == null) {
      return BunqContext.getUserContext().getPrimaryMonetaryAccountBank().getId();
    } else {
      return id;
    }
  }

  protected static byte[] determineAllRequestByte(HashMap<String, Object> requestMap) {
    String requestString = gson.toJson(requestMap);

    return requestString.replaceAll(REGEX_FIELD_FOR_REQUEST, STRING_EMPTY).getBytes();
  }
  
  abstract public Integer getId();

}
