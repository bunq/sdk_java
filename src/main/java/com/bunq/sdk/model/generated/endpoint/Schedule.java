package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.ScheduleAnchorObject;
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
 * view for reading the scheduled definitions.
 */
public class Schedule extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/schedule/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/schedule";

  /**
   * Field constants.
   */
  public static final String FIELD_TIME_START = "time_start";
  public static final String FIELD_TIME_END = "time_end";
  public static final String FIELD_RECURRENCE_UNIT = "recurrence_unit";
  public static final String FIELD_RECURRENCE_SIZE = "recurrence_size";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "Schedule";

  /**
   * The schedule start time (UTC).
   */
  @Expose
  @SerializedName("time_start")
  private String timeStart;

  /**
   * The schedule end time (UTC).
   */
  @Expose
  @SerializedName("time_end")
  private String timeEnd;

  /**
   * The schedule recurrence unit, options: ONCE, HOURLY, DAILY, WEEKLY, MONTHLY, YEARLY
   */
  @Expose
  @SerializedName("recurrence_unit")
  private String recurrenceUnit;

  /**
   * The schedule recurrence size. For example size 4 and unit WEEKLY means the recurrence is
   * every 4 weeks.
   */
  @Expose
  @SerializedName("recurrence_size")
  private Integer recurrenceSize;

  /**
   * The schedule status, options: ACTIVE, FINISHED, CANCELLED.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The scheduled object. (Payment, PaymentBatch)
   */
  @Expose
  @SerializedName("object")
  private ScheduleAnchorObject object;

  public static BunqResponse<Schedule> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer scheduleId) {
    return get(apiContext, userId, monetaryAccountId, scheduleId, new HashMap<>());
  }

  /**
   * Get a specific schedule definition for a given monetary account.
   */
  public static BunqResponse<Schedule> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer scheduleId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userId, monetaryAccountId, scheduleId), new HashMap<>(), customHeaders);

    return fromJson(Schedule.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<List<Schedule>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId) {
    return list(apiContext, userId, monetaryAccountId, new HashMap<>());
  }

  public static BunqResponse<List<Schedule>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Map<String, String> params) {
    return list(apiContext, userId, monetaryAccountId, params, new HashMap<>());
  }

  /**
   * Get a collection of scheduled definition for a given monetary account. You can add the
   * parameter type to filter the response. When
   * type={SCHEDULE_DEFINITION_PAYMENT,SCHEDULE_DEFINITION_PAYMENT_BATCH} is provided only
   * schedule definition object that relate to these definitions are returned.
   */
  public static BunqResponse<List<Schedule>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId), params, customHeaders);

    return fromJsonList(Schedule.class, responseRaw, OBJECT_TYPE);
  }

  /**
   * The schedule start time (UTC).
   */
  public String getTimeStart() {
    return this.timeStart;
  }

  public void setTimeStart(String timeStart) {
    this.timeStart = timeStart;
  }

  /**
   * The schedule end time (UTC).
   */
  public String getTimeEnd() {
    return this.timeEnd;
  }

  public void setTimeEnd(String timeEnd) {
    this.timeEnd = timeEnd;
  }

  /**
   * The schedule recurrence unit, options: ONCE, HOURLY, DAILY, WEEKLY, MONTHLY, YEARLY
   */
  public String getRecurrenceUnit() {
    return this.recurrenceUnit;
  }

  public void setRecurrenceUnit(String recurrenceUnit) {
    this.recurrenceUnit = recurrenceUnit;
  }

  /**
   * The schedule recurrence size. For example size 4 and unit WEEKLY means the recurrence is
   * every 4 weeks.
   */
  public Integer getRecurrenceSize() {
    return this.recurrenceSize;
  }

  public void setRecurrenceSize(Integer recurrenceSize) {
    this.recurrenceSize = recurrenceSize;
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
   * The scheduled object. (Payment, PaymentBatch)
   */
  public ScheduleAnchorObject getObject() {
    return this.object;
  }

  public void setObject(ScheduleAnchorObject object) {
    this.object = object;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.timeStart != null) {
      return false;
    }

    if (this.timeEnd != null) {
      return false;
    }

    if (this.recurrenceUnit != null) {
      return false;
    }

    if (this.recurrenceSize != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.object != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static Schedule fromJsonReader(JsonReader reader) {
    return fromJsonReader(Schedule.class, reader);
  }

}
