package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.SchedulePaymentEntry;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

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
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/schedule-payment-batch";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/schedule-payment-batch/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/schedule-payment-batch/%s";
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

  /**
   * The payment details.
   */
  @Expose
  @SerializedName("payments_field_for_request")
  private List<SchedulePaymentEntry> paymentsFieldForRequest;

  /**
   * The schedule details when creating a scheduled payment.
   */
  @Expose
  @SerializedName("schedule_field_for_request")
  private Schedule scheduleFieldForRequest;

  public SchedulePaymentBatch() {
    this(null, null);
  }

  public SchedulePaymentBatch(List<SchedulePaymentEntry> payments) {
    this(payments, null);
  }

  public SchedulePaymentBatch(List<SchedulePaymentEntry> payments, Schedule schedule) {
    this.paymentsFieldForRequest = payments;
    this.scheduleFieldForRequest = schedule;
  }

  /**
   * @param payments The payment details.
   * @param schedule The schedule details when creating a scheduled payment.
   */
  public static BunqResponse<Integer> create(List<SchedulePaymentEntry> payments, Schedule schedule, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_PAYMENTS, payments);
    requestMap.put(FIELD_SCHEDULE, schedule);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null);
  }

  public static BunqResponse<Integer> create(List<SchedulePaymentEntry> payments) {
    return create(payments, null, null, null);
  }

  public static BunqResponse<Integer> create(List<SchedulePaymentEntry> payments, Schedule schedule) {
    return create(payments, schedule, null, null);
  }

  public static BunqResponse<Integer> create(List<SchedulePaymentEntry> payments, Schedule schedule, Integer monetaryAccountId) {
    return create(payments, schedule, monetaryAccountId, null);
  }

  /**
   * @param payments The payment details.
   * @param schedule The schedule details when creating a scheduled payment.
   */
  public static BunqResponse<Integer> update(Integer schedulePaymentBatchId, Integer monetaryAccountId, List<SchedulePaymentEntry> payments, Schedule schedule, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_PAYMENTS, payments);
    requestMap.put(FIELD_SCHEDULE, schedule);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentBatchId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer schedulePaymentBatchId) {
    return update(schedulePaymentBatchId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer schedulePaymentBatchId, Integer monetaryAccountId) {
    return update(schedulePaymentBatchId, monetaryAccountId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer schedulePaymentBatchId, Integer monetaryAccountId, List<SchedulePaymentEntry> payments) {
    return update(schedulePaymentBatchId, monetaryAccountId, payments, null, null);
  }

  public static BunqResponse<Integer> update(Integer schedulePaymentBatchId, Integer monetaryAccountId, List<SchedulePaymentEntry> payments, Schedule schedule) {
    return update(schedulePaymentBatchId, monetaryAccountId, payments, schedule, null);
  }

  /**
   */
  public static BunqResponse<SchedulePaymentBatch> delete(Integer schedulePaymentBatchId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentBatchId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<SchedulePaymentBatch> delete(Integer schedulePaymentBatchId) {
    return delete(schedulePaymentBatchId, null, null);
  }

  public static BunqResponse<SchedulePaymentBatch> delete(Integer schedulePaymentBatchId, Integer monetaryAccountId) {
    return delete(schedulePaymentBatchId, monetaryAccountId, null);
  }

  /**
   */
  public static SchedulePaymentBatch fromJsonReader(JsonReader reader) {
    return fromJsonReader(SchedulePaymentBatch.class, reader);
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

  /**
   */
  public boolean isAllFieldNull() {
    if (this.payments != null) {
      return false;
    }

    if (this.schedule != null) {
      return false;
    }

    return true;
  }

}
