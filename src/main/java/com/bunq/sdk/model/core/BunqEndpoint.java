package com.bunq.sdk.model.core;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.context.BunqContext;
import com.bunq.sdk.context.UserContext;
import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.http.ApiClient;
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
import java.util.List;
import java.util.Objects;

abstract public class BunqEndpoint<T extends BunqModel> {

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
   * Gson builder for serialization.
   */
  protected final Gson gson = BunqGsonBuilder.buildDefault().create();
  private final ApiContext apiContext;
  private final UserContext userContext;
  private final Class<T> type;

  protected BunqEndpoint(ApiContext apiContext, Class<T> type) {
    if(apiContext==null) {
      throw new BunqException(BunqContext.ERROR_API_CONTEXT_HAS_NOT_BEEN_SET);
    }
    this.type = Objects.requireNonNull(type);
    this.apiContext = apiContext;
    this.userContext = new UserContext(this.apiContext.getSessionContext().getUserId());
    this.userContext.initMainMonetaryAccount();
  }

  protected ApiClient getApiClient() {
    return new ApiClient(getApiContext());
  }

  protected T fromJsonReader(JsonReader reader) {
    return gson.fromJson(reader,type);
  }

  /**
   * De-serializes an object from a JSON format specific to Installation and SessionServer.
   */
  protected BunqResponse<T> fromJsonArrayNested(BunqResponseRaw responseRaw) {
    String json = new String(responseRaw.getBodyBytes());
    JsonObject values = this.gson.fromJson(json, JsonObject.class);
    JsonArray jsonArrayNested = values.getAsJsonArray(FIELD_RESPONSE);
    T responseValue = this.gson.fromJson(jsonArrayNested, this.type);
    return new BunqResponse<>(responseValue, responseRaw.getHeaders());
  }

  /**
   * De-serializes an ID object and returns its integer value.
   */
  protected BunqResponse<Integer> processForId(BunqResponseRaw responseRaw) {
    JsonObject responseItemObject = getResponseItemObject(responseRaw);
    JsonObject responseItemObjectUnwrapped = getWrappedContent(responseItemObject, FIELD_ID);
    Integer responseValue = this.gson.fromJson(responseItemObjectUnwrapped, Id.class).getId();
    return new BunqResponse<>(responseValue, responseRaw.getHeaders());
  }

  private JsonObject getResponseItemObject(BunqResponseRaw responseRaw) {
    JsonObject responseItemObject = deserializeResponseObject(responseRaw);
    return responseItemObject.getAsJsonArray(FIELD_RESPONSE).get(INDEX_FIRST).getAsJsonObject();
  }

  private JsonObject getWrappedContent(JsonObject json, String wrapper) {
    return json.getAsJsonObject(wrapper);
  }

  /**
   * De-serialize an object from JSON.
   */
  protected BunqResponse<T> fromJson(BunqResponseRaw responseRaw,
      String wrapper) {
    JsonObject responseItemObject = getResponseItemObject(responseRaw);
    JsonObject responseItemObjectUnwrapped = getWrappedContent(responseItemObject, wrapper);
    T responseValue = this.gson.fromJson(responseItemObjectUnwrapped, this.type);

    return new BunqResponse<>(responseValue, responseRaw.getHeaders());
  }

  protected BunqResponse<T> fromJson(BunqResponseRaw responseRaw) {
    JsonObject responseItemObject = getResponseItemObject(responseRaw);
    T responseValue = this.gson.fromJson(responseItemObject, this.type);
    return new BunqResponse<>(responseValue, responseRaw.getHeaders());
  }

  /**
   * De-serializes a list from JSON.
   */
  protected BunqResponse<List<T>> fromJsonList(BunqResponseRaw responseRaw,String wrapper) {
    JsonObject responseObject = deserializeResponseObject(responseRaw);
    JsonArray response = responseObject.getAsJsonArray(FIELD_RESPONSE);
    List<T> list = new ArrayList<>();

    for (JsonElement responseItemWrapped : response) {
      JsonObject responseItemObject = getWrappedContent(responseItemWrapped.getAsJsonObject(),
          wrapper);
      list.add(this.gson.fromJson(responseItemObject, this.type));
    }

    JsonElement paginationObject = responseObject.get(FIELD_PAGINATION);
    Pagination pagination = this.gson.fromJson(paginationObject, Pagination.class);

    return new BunqResponse<>(list, responseRaw.getHeaders(), pagination);
  }

  protected BunqResponse<List<T>> fromJsonList(BunqResponseRaw responseRaw) {
    JsonObject responseObject = deserializeResponseObject(responseRaw);
    JsonArray response = responseObject.getAsJsonArray(FIELD_RESPONSE);
    List<T> objects = new ArrayList<>();

    for (JsonElement responseItem : response) {
      objects.add(this.gson.fromJson(responseItem, this.type));
    }

    JsonElement paginationObject = responseObject.get(FIELD_PAGINATION);
    Pagination pagination = gson.fromJson(paginationObject, Pagination.class);

    return new BunqResponse<>(objects, responseRaw.getHeaders(), pagination);
  }

  private JsonObject deserializeResponseObject(BunqResponseRaw responseRaw) {
    String json = new String(responseRaw.getBodyBytes());
    return this.gson.fromJson(json, JsonObject.class);
  }

  /**
   * De-serializes an UUID object and returns its string value.
   */
  protected BunqResponse<String> processForUuid(BunqResponseRaw responseRaw) {
    JsonObject responseItemObject = getResponseItemObject(responseRaw);
    JsonObject responseItemObjectUnwrapped = getWrappedContent(responseItemObject, FIELD_UUID);
    String responseValue = this.gson.fromJson(responseItemObjectUnwrapped, Uuid.class).getUuid();

    return new BunqResponse<>(responseValue, responseRaw.getHeaders());
  }

  protected ApiContext getApiContext() {
    return this.apiContext;
  }

  protected Integer determineUserId() {
    return this.userContext.getUserId();
  }

  protected Integer determineMonetaryAccountId(Integer id) {
    if (id == null) {
      return this.userContext.getPrimaryMonetaryAccountBank().getId();
    } else {
      return id;
    }
  }
}
