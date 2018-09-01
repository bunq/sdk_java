package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.security.SecurityUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Endpoint for generating and retrieving a new CVC2 code.
 */
public class CardGeneratedCvc2 extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/card/%s/generated-cvc2";
  protected static final String ENDPOINT_URL_READ = "user/%s/card/%s/generated-cvc2/%s";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/card/%s/generated-cvc2/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/card/%s/generated-cvc2";

  /**
   * Field constants.
   */
  public static final String FIELD_TYPE = "type";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "CardGeneratedCvc2";

  /**
   * The id of the cvc code.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the cvc code's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the cvc code's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The type of generated cvc2. Can be STATIC or GENERATED.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The cvc2 code.
   */
  @Expose
  @SerializedName("cvc2")
  private String cvc2;

  /**
   * The status of the cvc2. Can be AVAILABLE, USED, EXPIRED, BLOCKED.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * Expiry time of the cvc2.
   */
  @Expose
  @SerializedName("expiry_time")
  private String expiryTime;

  /**
   * The type of generated cvc2. Can be STATIC or GENERATED.
   */
  @Expose
  @SerializedName("type_field_for_request")
  private String typeFieldForRequest;

  public CardGeneratedCvc2() {
    this(null);
  }

  public CardGeneratedCvc2(String type) {
    this.typeFieldForRequest = type;
  }

  /**
   * Generate a new CVC2 code for a card.
   * @param type The type of generated cvc2. Can be STATIC or GENERATED.
   */
  public static BunqResponse<Integer> create(Integer cardId, String type, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_TYPE, type);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    requestBytes = SecurityUtils.encrypt(getApiContext(), requestBytes, customHeaders);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), cardId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null);
  }

  public static BunqResponse<Integer> create(Integer cardId) {
    return create(cardId, null, null);
  }

  public static BunqResponse<Integer> create(Integer cardId, String type) {
    return create(cardId, type, null);
  }

  /**
   * Get the details for a specific generated CVC2 code.
   */
  public static BunqResponse<CardGeneratedCvc2> get(Integer cardId, Integer cardGeneratedCvc2Id, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), cardId, cardGeneratedCvc2Id), params, customHeaders);

    return fromJson(CardGeneratedCvc2.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<CardGeneratedCvc2> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<CardGeneratedCvc2> get(Integer cardId) {
    return get(cardId, null, null, null);
  }

  public static BunqResponse<CardGeneratedCvc2> get(Integer cardId, Integer cardGeneratedCvc2Id) {
    return get(cardId, cardGeneratedCvc2Id, null, null);
  }

  public static BunqResponse<CardGeneratedCvc2> get(Integer cardId, Integer cardGeneratedCvc2Id, Map<String, String> params) {
    return get(cardId, cardGeneratedCvc2Id, params, null);
  }

  /**
   * @param type The type of generated cvc2. Can be STATIC or GENERATED.
   */
  public static BunqResponse<Integer> update(Integer cardId, Integer cardGeneratedCvc2Id, String type, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_TYPE, type);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    requestBytes = SecurityUtils.encrypt(getApiContext(), requestBytes, customHeaders);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), cardId, cardGeneratedCvc2Id), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer cardId) {
    return update(cardId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer cardId, Integer cardGeneratedCvc2Id) {
    return update(cardId, cardGeneratedCvc2Id, null, null);
  }

  public static BunqResponse<Integer> update(Integer cardId, Integer cardGeneratedCvc2Id, String type) {
    return update(cardId, cardGeneratedCvc2Id, type, null);
  }

  /**
   * Get all generated CVC2 codes for a card.
   */
  public static BunqResponse<List<CardGeneratedCvc2>> list(Integer cardId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), cardId), params, customHeaders);

    return fromJsonList(CardGeneratedCvc2.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<CardGeneratedCvc2>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<CardGeneratedCvc2>> list(Integer cardId) {
    return list(cardId, null, null);
  }

  public static BunqResponse<List<CardGeneratedCvc2>> list(Integer cardId, Map<String, String> params) {
    return list(cardId, params, null);
  }

  /**
   * The id of the cvc code.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the cvc code's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the cvc code's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The type of generated cvc2. Can be STATIC or GENERATED.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The cvc2 code.
   */
  public String getCvc2() {
    return this.cvc2;
  }

  public void setCvc2(String cvc2) {
    this.cvc2 = cvc2;
  }

  /**
   * The status of the cvc2. Can be AVAILABLE, USED, EXPIRED, BLOCKED.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Expiry time of the cvc2.
   */
  public String getExpiryTime() {
    return this.expiryTime;
  }

  public void setExpiryTime(String expiryTime) {
    this.expiryTime = expiryTime;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.created != null) {
      return false;
    }

    if (this.updated != null) {
      return false;
    }

    if (this.type != null) {
      return false;
    }

    if (this.cvc2 != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.expiryTime != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CardGeneratedCvc2 fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardGeneratedCvc2.class, reader);
  }

}
