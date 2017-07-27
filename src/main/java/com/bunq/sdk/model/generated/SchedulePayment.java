package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.generated.object.Schedule;
import com.bunq.sdk.model.generated.object.SchedulePaymentEntry;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Endpoint for schedule payments.
 */
public class SchedulePayment extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_PAYMENT = "payment";
  public static final String FIELD_SCHEDULE = "schedule";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/schedule-payment";
  private static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/schedule-payment/%s";
  private static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/schedule-payment/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/schedule-payment";
  private static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/schedule-payment/%s";

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

  public static Integer create(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer monetaryAccountId) {
    return create(apiContext, requestMap, userId, monetaryAccountId, new HashMap<>());
  }

  /**
   */
  public static Integer create(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    byte[] responseBytes = apiClient
        .post(String.format(ENDPOINT_URL_CREATE, userId, monetaryAccountId), requestBytes,
            customHeaders);

    return processForId(new String(responseBytes));
  }

  public static void delete(ApiContext apiContext, Integer userId, Integer monetaryAccountId,
      Integer schedulePaymentId) {
    delete(apiContext, userId, monetaryAccountId, schedulePaymentId, new HashMap<>());
  }

  /**
   */
  public static void delete(ApiContext apiContext, Integer userId, Integer monetaryAccountId,
      Integer schedulePaymentId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    apiClient
        .delete(String.format(ENDPOINT_URL_DELETE, userId, monetaryAccountId, schedulePaymentId),
            customHeaders);
  }

  public static SchedulePayment get(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId, Integer schedulePaymentId) {
    return get(apiContext, userId, monetaryAccountId, schedulePaymentId, new HashMap<>());
  }

  /**
   */
  public static SchedulePayment get(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId, Integer schedulePaymentId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] responseBytes = apiClient
        .get(String.format(ENDPOINT_URL_READ, userId, monetaryAccountId, schedulePaymentId),
            customHeaders);

    return fromJson(SchedulePayment.class, new String(responseBytes), OBJECT_TYPE);
  }

  public static List<SchedulePayment> list(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId) {
    return list(apiContext, userId, monetaryAccountId, new HashMap<>());
  }

  /**
   */
  public static List<SchedulePayment> list(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] responseBytes = apiClient
        .get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId), customHeaders);

    return fromJsonList(SchedulePayment.class, new String(responseBytes), OBJECT_TYPE);
  }

  public static Integer update(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer monetaryAccountId, Integer schedulePaymentId) {
    return update(apiContext, requestMap, userId, monetaryAccountId, schedulePaymentId,
        new HashMap<>());
  }

  /**
   */
  public static Integer update(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer monetaryAccountId, Integer schedulePaymentId,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    byte[] responseBytes = apiClient
        .put(String.format(ENDPOINT_URL_UPDATE, userId, monetaryAccountId, schedulePaymentId),
            requestBytes, customHeaders);

    return processForId(new String(responseBytes));
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
