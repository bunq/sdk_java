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
 * Endpoint for schedule payment batches.
 */
public class SchedulePaymentBatch extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_PAYMENTS = "payments";
  public static final String FIELD_SCHEDULE = "schedule";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/schedule-payment-batch";
  private static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/schedule-payment-batch/%s";
  private static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/schedule-payment-batch/%s";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "SchedulePaymentBatch";

  /**
   * The payment details.
   */
  @Expose
  @SerializedName("payments")
  private List<SchedulePaymentEntry> payments;

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

  public static Integer update(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer monetaryAccountId, Integer schedulePaymentBatchId) {
    return update(apiContext, requestMap, userId, monetaryAccountId, schedulePaymentBatchId,
        new HashMap<>());
  }

  /**
   */
  public static Integer update(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer monetaryAccountId, Integer schedulePaymentBatchId,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    byte[] responseBytes = apiClient
        .put(String.format(ENDPOINT_URL_UPDATE, userId, monetaryAccountId, schedulePaymentBatchId),
            requestBytes, customHeaders);

    return processForId(new String(responseBytes));
  }

  public static void delete(ApiContext apiContext, Integer userId, Integer monetaryAccountId,
      Integer schedulePaymentBatchId) {
    delete(apiContext, userId, monetaryAccountId, schedulePaymentBatchId, new HashMap<>());
  }

  /**
   */
  public static void delete(ApiContext apiContext, Integer userId, Integer monetaryAccountId,
      Integer schedulePaymentBatchId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    apiClient.delete(
        String.format(ENDPOINT_URL_DELETE, userId, monetaryAccountId, schedulePaymentBatchId),
        customHeaders);
  }

  /**
   * The payment details.
   */
  public List<SchedulePaymentEntry> getPayments() {
    return this.payments;
  }

  public void setPayments(List<SchedulePaymentEntry> payments) {
    this.payments = payments;
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
