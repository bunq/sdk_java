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
import com.google.gson.stream.JsonReader;
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
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/schedule-payment";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/schedule-payment/%s";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/schedule-payment/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/schedule-payment";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/schedule-payment/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_PAYMENT = "payment";
  public static final String FIELD_SCHEDULE = "schedule";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "ScheduledPayment";
  protected static final String OBJECT_TYPE_PUT = "ScheduledPayment";

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

  /**
   * The schedule status, options: ACTIVE, FINISHED, CANCELLED.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The payment details.
   */
  @Expose
  @SerializedName("payment_field_for_request")
  private SchedulePaymentEntry paymentFieldForRequest;

  /**
   * The schedule details when creating or updating a scheduled payment.
   */
  @Expose
  @SerializedName("schedule_field_for_request")
  private Schedule scheduleFieldForRequest;

  public SchedulePayment() {
  this(null, null);
  }

  public SchedulePayment(SchedulePaymentEntry payment) {
  this(payment, null);
  }

  public SchedulePayment(SchedulePaymentEntry payment, Schedule schedule) {
    this.paymentFieldForRequest = payment;
    this.scheduleFieldForRequest = schedule;
  }  /**
   * @param payment The payment details.
   * @param schedule The schedule details when creating or updating a scheduled payment.
   */
  public static BunqResponse<Integer> create(SchedulePaymentEntry payment, Schedule schedule, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_PAYMENT, payment);
requestMap.put(FIELD_SCHEDULE, schedule);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null);
  }

  public static BunqResponse<Integer> create(SchedulePaymentEntry payment) {
    return create(payment, null, null, null);
  }

  public static BunqResponse<Integer> create(SchedulePaymentEntry payment, Schedule schedule) {
    return create(payment, schedule, null, null);
  }

  public static BunqResponse<Integer> create(SchedulePaymentEntry payment, Schedule schedule, Integer monetaryAccountId) {
    return create(payment, schedule, monetaryAccountId, null);
  }

  /**
   */
  public static BunqResponse<SchedulePayment> delete(Integer schedulePaymentId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<SchedulePayment> delete(Integer schedulePaymentId) {
    return delete(schedulePaymentId, null, null);
  }

  public static BunqResponse<SchedulePayment> delete(Integer schedulePaymentId, Integer monetaryAccountId) {
    return delete(schedulePaymentId, monetaryAccountId, null);
  }

  /**
   */
  public static BunqResponse<SchedulePayment> get(Integer schedulePaymentId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentId), params, customHeaders);

    return fromJson(SchedulePayment.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<SchedulePayment> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<SchedulePayment> get(Integer schedulePaymentId) {
    return get(schedulePaymentId, null, null, null);
  }

  public static BunqResponse<SchedulePayment> get(Integer schedulePaymentId, Integer monetaryAccountId) {
    return get(schedulePaymentId, monetaryAccountId, null, null);
  }

  public static BunqResponse<SchedulePayment> get(Integer schedulePaymentId, Integer monetaryAccountId, Map<String, String> params) {
    return get(schedulePaymentId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<List<SchedulePayment>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(SchedulePayment.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<SchedulePayment>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<SchedulePayment>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<SchedulePayment>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   * @param payment The payment details.
   * @param schedule The schedule details when creating or updating a scheduled payment.
   */
  public static BunqResponse<SchedulePayment> update(Integer schedulePaymentId, Integer monetaryAccountId, SchedulePaymentEntry payment, Schedule schedule, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_PAYMENT, payment);
requestMap.put(FIELD_SCHEDULE, schedule);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentId), requestBytes, customHeaders);

    return fromJson(SchedulePayment.class, responseRaw, OBJECT_TYPE_PUT);
  }

  public static BunqResponse<SchedulePayment> update(Integer schedulePaymentId) {
    return update(schedulePaymentId, null, null, null, null);
  }

  public static BunqResponse<SchedulePayment> update(Integer schedulePaymentId, Integer monetaryAccountId) {
    return update(schedulePaymentId, monetaryAccountId, null, null, null);
  }

  public static BunqResponse<SchedulePayment> update(Integer schedulePaymentId, Integer monetaryAccountId, SchedulePaymentEntry payment) {
    return update(schedulePaymentId, monetaryAccountId, payment, null, null);
  }

  public static BunqResponse<SchedulePayment> update(Integer schedulePaymentId, Integer monetaryAccountId, SchedulePaymentEntry payment, Schedule schedule) {
    return update(schedulePaymentId, monetaryAccountId, payment, schedule, null);
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

  /**
   * The schedule status, options: ACTIVE, FINISHED, CANCELLED.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.payment != null) {
      return false;
    }

    if (this.schedule != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static SchedulePayment fromJsonReader(JsonReader reader) {
    return fromJsonReader(SchedulePayment.class, reader);
  }

}
