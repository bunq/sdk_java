package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.security.SecurityUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * Endpoint for generating and retrieving a new CVC2 code.
 */
public class CardGeneratedCvc2 extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/card/%s/generated-cvc2";
  private static final String ENDPOINT_URL_READ = "user/%s/card/%s/generated-cvc2/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/card/%s/generated-cvc2";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "CardGeneratedCvc2";

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

  public static BunqResponse<CardGeneratedCvc2> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer cardId) {
    return create(apiContext, requestMap, userId, cardId, new HashMap<>());
  }

  /**
   * Generate a new CVC2 code for a card.
   */
  public static BunqResponse<CardGeneratedCvc2> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer cardId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    requestBytes = SecurityUtils.encrypt(apiContext, requestBytes, customHeaders);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, userId, cardId), requestBytes, customHeaders);

    return fromJson(CardGeneratedCvc2.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<CardGeneratedCvc2> get(ApiContext apiContext, Integer userId, Integer cardId, Integer cardGeneratedCvc2Id) {
    return get(apiContext, userId, cardId, cardGeneratedCvc2Id, new HashMap<>());
  }

  /**
   * Get the details for a specific generated CVC2 code.
   */
  public static BunqResponse<CardGeneratedCvc2> get(ApiContext apiContext, Integer userId, Integer cardId, Integer cardGeneratedCvc2Id, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userId, cardId, cardGeneratedCvc2Id), new HashMap<>(), customHeaders);

    return fromJson(CardGeneratedCvc2.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<List<CardGeneratedCvc2>> list(ApiContext apiContext, Integer userId, Integer cardId) {
    return list(apiContext, userId, cardId, new HashMap<>());
  }

  public static BunqResponse<List<CardGeneratedCvc2>> list(ApiContext apiContext, Integer userId, Integer cardId, Map<String, String> params) {
    return list(apiContext, userId, cardId, params, new HashMap<>());
  }

  /**
   * Get all generated CVC2 codes for a card.
   */
  public static BunqResponse<List<CardGeneratedCvc2>> list(ApiContext apiContext, Integer userId, Integer cardId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId, cardId), params, customHeaders);

    return fromJsonList(CardGeneratedCvc2.class, responseRaw, OBJECT_TYPE);
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

}
