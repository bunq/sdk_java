package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.SchedulePaymentEntryObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * Endpoint for schedule payment batches.
 */
public class SchedulePaymentBatchApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/schedule-payment-batch/%s";
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/schedule-payment-batch";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/schedule-payment-batch/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/schedule-payment-batch/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_PAYMENTS = "payments";
  public static final String FIELD_SCHEDULE = "schedule";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "ScheduledPaymentBatch";

  /**
   * The payment details.
   */
  @Expose
  @SerializedName("payments")
  private List<SchedulePaymentEntryObject> payments;

  /**
   * The schedule details.
   */
  @Expose
  @SerializedName("schedule")
  private ScheduleApiObject schedule;

  /**
   * The payment details.
   */
  @Expose
  @SerializedName("payments_field_for_request")
  private List<SchedulePaymentEntryObject> paymentsFieldForRequest;

  /**
   * The schedule details when creating a scheduled payment.
   */
  @Expose
  @SerializedName("schedule_field_for_request")
  private ScheduleApiObject scheduleFieldForRequest;

  public SchedulePaymentBatchApiObject() {
  this(null, null);
  }

  public SchedulePaymentBatchApiObject(List<SchedulePaymentEntryObject> payments) {
  this(payments, null);
  }

  public SchedulePaymentBatchApiObject(List<SchedulePaymentEntryObject> payments, ScheduleApiObject schedule) {
    this.paymentsFieldForRequest = payments;
    this.scheduleFieldForRequest = schedule;
  }  /**
   */
  public static BunqResponse<SchedulePaymentBatchApiObject> get(Integer schedulePaymentBatchId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentBatchId), params, customHeaders);

    return fromJson(SchedulePaymentBatchApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<SchedulePaymentBatchApiObject> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<SchedulePaymentBatchApiObject> get(Integer schedulePaymentBatchId) {
    return get(schedulePaymentBatchId, null, null, null);
  }

  public static BunqResponse<SchedulePaymentBatchApiObject> get(Integer schedulePaymentBatchId, Integer monetaryAccountId) {
    return get(schedulePaymentBatchId, monetaryAccountId, null, null);
  }

  public static BunqResponse<SchedulePaymentBatchApiObject> get(Integer schedulePaymentBatchId, Integer monetaryAccountId, Map<String, String> params) {
    return get(schedulePaymentBatchId, monetaryAccountId, params, null);
  }

  /**
   * @param payments The payment details.
   * @param schedule The schedule details when creating a scheduled payment.
   */
  public static BunqResponse<Integer> create(List<SchedulePaymentEntryObject> payments, ScheduleApiObject schedule, Integer monetaryAccountId, Map<String, String> customHeaders) {
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

  public static BunqResponse<Integer> create(List<SchedulePaymentEntryObject> payments) {
    return create(payments, null, null, null);
  }

  public static BunqResponse<Integer> create(List<SchedulePaymentEntryObject> payments, ScheduleApiObject schedule) {
    return create(payments, schedule, null, null);
  }

  public static BunqResponse<Integer> create(List<SchedulePaymentEntryObject> payments, ScheduleApiObject schedule, Integer monetaryAccountId) {
    return create(payments, schedule, monetaryAccountId, null);
  }

  /**
   * @param payments The payment details.
   * @param schedule The schedule details when creating a scheduled payment.
   */
  public static BunqResponse<Integer> update(Integer schedulePaymentBatchId, Integer monetaryAccountId, List<SchedulePaymentEntryObject> payments, ScheduleApiObject schedule, Map<String, String> customHeaders) {
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

  public static BunqResponse<Integer> update(Integer schedulePaymentBatchId, Integer monetaryAccountId, List<SchedulePaymentEntryObject> payments) {
    return update(schedulePaymentBatchId, monetaryAccountId, payments, null, null);
  }

  public static BunqResponse<Integer> update(Integer schedulePaymentBatchId, Integer monetaryAccountId, List<SchedulePaymentEntryObject> payments, ScheduleApiObject schedule) {
    return update(schedulePaymentBatchId, monetaryAccountId, payments, schedule, null);
  }

  /**
   */
  public static BunqResponse<SchedulePaymentBatchApiObject> delete(Integer schedulePaymentBatchId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentBatchId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<SchedulePaymentBatchApiObject> delete(Integer schedulePaymentBatchId) {
    return delete(schedulePaymentBatchId, null, null);
  }

  public static BunqResponse<SchedulePaymentBatchApiObject> delete(Integer schedulePaymentBatchId, Integer monetaryAccountId) {
    return delete(schedulePaymentBatchId, monetaryAccountId, null);
  }

  /**
   * The payment details.
   */
  public List<SchedulePaymentEntryObject> getPayments() {
    return this.payments;
  }

  public void setPayments(List<SchedulePaymentEntryObject> payments) {
    this.payments = payments;
  }

  /**
   * The schedule details.
   */
  public ScheduleApiObject getSchedule() {
    return this.schedule;
  }

  public void setSchedule(ScheduleApiObject schedule) {
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

  /**
   */
  public static SchedulePaymentBatchApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(SchedulePaymentBatchApiObject.class, reader);
  }

}
