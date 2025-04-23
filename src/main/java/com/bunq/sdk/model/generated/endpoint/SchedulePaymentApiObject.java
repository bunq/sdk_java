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
 * Endpoint for schedule payments.
 */
public class SchedulePaymentApiObject extends BunqModel {

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
  public static final String FIELD_PURPOSE = "purpose";

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
  private SchedulePaymentEntryObject payment;

  /**
   * The schedule details.
   */
  @Expose
  @SerializedName("schedule")
  private ScheduleApiObject schedule;

  /**
   * The schedule status, options: ACTIVE, FINISHED, CANCELLED.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The schedule purpose.
   */
  @Expose
  @SerializedName("purpose")
  private String purpose;

  /**
   * The payment details.
   */
  @Expose
  @SerializedName("payment_field_for_request")
  private SchedulePaymentEntryObject paymentFieldForRequest;

  /**
   * The schedule details when creating or updating a scheduled payment.
   */
  @Expose
  @SerializedName("schedule_field_for_request")
  private ScheduleApiObject scheduleFieldForRequest;

  /**
   * The purpose of this scheduled payment.
   */
  @Expose
  @SerializedName("purpose_field_for_request")
  private String purposeFieldForRequest;

  public SchedulePaymentApiObject() {
  this(null, null, null);
  }

  public SchedulePaymentApiObject(SchedulePaymentEntryObject payment) {
  this(payment, null, null);
  }

  public SchedulePaymentApiObject(SchedulePaymentEntryObject payment, ScheduleApiObject schedule) {
  this(payment, schedule, null);
  }

  public SchedulePaymentApiObject(SchedulePaymentEntryObject payment, ScheduleApiObject schedule, String purpose) {
    this.paymentFieldForRequest = payment;
    this.scheduleFieldForRequest = schedule;
    this.purposeFieldForRequest = purpose;
  }  /**
   * @param payment The payment details.
   * @param schedule The schedule details when creating or updating a scheduled payment.
   * @param purpose The purpose of this scheduled payment.
   */
  public static BunqResponse<Integer> create(SchedulePaymentEntryObject payment, ScheduleApiObject schedule, Integer monetaryAccountId, String purpose, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_PAYMENT, payment);
requestMap.put(FIELD_SCHEDULE, schedule);
requestMap.put(FIELD_PURPOSE, purpose);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(SchedulePaymentEntryObject payment) {
    return create(payment, null, null, null, null);
  }

  public static BunqResponse<Integer> create(SchedulePaymentEntryObject payment, ScheduleApiObject schedule) {
    return create(payment, schedule, null, null, null);
  }

  public static BunqResponse<Integer> create(SchedulePaymentEntryObject payment, ScheduleApiObject schedule, Integer monetaryAccountId) {
    return create(payment, schedule, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(SchedulePaymentEntryObject payment, ScheduleApiObject schedule, Integer monetaryAccountId, String purpose) {
    return create(payment, schedule, monetaryAccountId, purpose, null);
  }

  /**
   */
  public static BunqResponse<SchedulePaymentApiObject> delete(Integer schedulePaymentId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<SchedulePaymentApiObject> delete(Integer schedulePaymentId) {
    return delete(schedulePaymentId, null, null);
  }

  public static BunqResponse<SchedulePaymentApiObject> delete(Integer schedulePaymentId, Integer monetaryAccountId) {
    return delete(schedulePaymentId, monetaryAccountId, null);
  }

  /**
   */
  public static BunqResponse<SchedulePaymentApiObject> get(Integer schedulePaymentId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentId), params, customHeaders);

    return fromJson(SchedulePaymentApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<SchedulePaymentApiObject> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<SchedulePaymentApiObject> get(Integer schedulePaymentId) {
    return get(schedulePaymentId, null, null, null);
  }

  public static BunqResponse<SchedulePaymentApiObject> get(Integer schedulePaymentId, Integer monetaryAccountId) {
    return get(schedulePaymentId, monetaryAccountId, null, null);
  }

  public static BunqResponse<SchedulePaymentApiObject> get(Integer schedulePaymentId, Integer monetaryAccountId, Map<String, String> params) {
    return get(schedulePaymentId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<List<SchedulePaymentApiObject>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(SchedulePaymentApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<SchedulePaymentApiObject>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<SchedulePaymentApiObject>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<SchedulePaymentApiObject>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   * @param payment The payment details.
   * @param schedule The schedule details when creating or updating a scheduled payment.
   */
  public static BunqResponse<SchedulePaymentApiObject> update(Integer schedulePaymentId, Integer monetaryAccountId, SchedulePaymentEntryObject payment, ScheduleApiObject schedule, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_PAYMENT, payment);
requestMap.put(FIELD_SCHEDULE, schedule);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentId), requestBytes, customHeaders);

    return fromJson(SchedulePaymentApiObject.class, responseRaw, OBJECT_TYPE_PUT);
  }

  public static BunqResponse<SchedulePaymentApiObject> update(Integer schedulePaymentId) {
    return update(schedulePaymentId, null, null, null, null);
  }

  public static BunqResponse<SchedulePaymentApiObject> update(Integer schedulePaymentId, Integer monetaryAccountId) {
    return update(schedulePaymentId, monetaryAccountId, null, null, null);
  }

  public static BunqResponse<SchedulePaymentApiObject> update(Integer schedulePaymentId, Integer monetaryAccountId, SchedulePaymentEntryObject payment) {
    return update(schedulePaymentId, monetaryAccountId, payment, null, null);
  }

  public static BunqResponse<SchedulePaymentApiObject> update(Integer schedulePaymentId, Integer monetaryAccountId, SchedulePaymentEntryObject payment, ScheduleApiObject schedule) {
    return update(schedulePaymentId, monetaryAccountId, payment, schedule, null);
  }

  /**
   * The payment details.
   */
  public SchedulePaymentEntryObject getPayment() {
    return this.payment;
  }

  public void setPayment(SchedulePaymentEntryObject payment) {
    this.payment = payment;
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
   * The schedule status, options: ACTIVE, FINISHED, CANCELLED.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The schedule purpose.
   */
  public String getPurpose() {
    return this.purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
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

    if (this.purpose != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static SchedulePaymentApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(SchedulePaymentApiObject.class, reader);
  }

}
