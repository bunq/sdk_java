package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.SchedulePaymentEntry;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * Endpoint for schedule payments.
 */
public class SchedulePayment extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/schedule-payment";
  private static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/schedule-payment/%s";
  private static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/schedule-payment/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/schedule-payment";
  private static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/schedule-payment/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_PAYMENT = "payment";
  public static final String FIELD_SCHEDULE = "schedule";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "SchedulePayment";

  /**
   * The payment details.
   */
  @Expose
  @SerializedName("payment")
  private SchedulePaymentEntry payment;

  /**
   * The schedule details.
   */
  @Expose
  @SerializedName("schedule")
  private Schedule schedule;

  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId) {
    return create(apiContext, requestMap, userId, monetaryAccountId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, userId, monetaryAccountId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<NullType> delete(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer schedulePaymentId) {
    return delete(apiContext, userId, monetaryAccountId, schedulePaymentId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<NullType> delete(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer schedulePaymentId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, userId, monetaryAccountId, schedulePaymentId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<SchedulePayment> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer schedulePaymentId) {
    return get(apiContext, userId, monetaryAccountId, schedulePaymentId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<SchedulePayment> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer schedulePaymentId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userId, monetaryAccountId, schedulePaymentId), new HashMap<>(), customHeaders);

    return fromJson(SchedulePayment.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<List<SchedulePayment>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId) {
    return list(apiContext, userId, monetaryAccountId, new HashMap<>());
  }

  public static BunqResponse<List<SchedulePayment>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Map<String, String> params) {
    return list(apiContext, userId, monetaryAccountId, params, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<List<SchedulePayment>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId), params, customHeaders);

    return fromJsonList(SchedulePayment.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer schedulePaymentId) {
    return update(apiContext, requestMap, userId, monetaryAccountId, schedulePaymentId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer schedulePaymentId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, userId, monetaryAccountId, schedulePaymentId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  /**
   * The payment details.
   */
  public SchedulePaymentEntry getPayment() {
    return this.payment;
  }

  public void setPayment(SchedulePaymentEntry payment) {
    this.payment = payment;
  }

  /**
   * The schedule details.
   */
  public Schedule getSchedule() {
    return this.schedule;
  }

  public void setSchedule(Schedule schedule) {
    this.schedule = schedule;
  }

}
