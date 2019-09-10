package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.ScheduleAnchorObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.List;
import java.util.Map;

/**
 * view for reading the scheduled definitions.
 */
public class Schedule extends BunqModel {

    /**
     * Field constants.
     */
    public static final String FIELD_TIME_START = "time_start";
    public static final String FIELD_TIME_END = "time_end";
    public static final String FIELD_RECURRENCE_UNIT = "recurrence_unit";
    public static final String FIELD_RECURRENCE_SIZE = "recurrence_size";
    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/schedule/%s";
    protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/schedule";
    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_GET = "Schedule";

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

    /**
     * The schedule start time (UTC).
     */
    @Expose
    @SerializedName("time_start_field_for_request")
    private String timeStartFieldForRequest;

    /**
     * The schedule end time (UTC).
     */
    @Expose
    @SerializedName("time_end_field_for_request")
    private String timeEndFieldForRequest;

    /**
     * The schedule recurrence unit, options: ONCE, HOURLY, DAILY, WEEKLY, MONTHLY, YEARLY
     */
    @Expose
    @SerializedName("recurrence_unit_field_for_request")
    private String recurrenceUnitFieldForRequest;

    /**
     * The schedule recurrence size. For example size 4 and unit WEEKLY means the recurrence is
     * every 4 weeks.
     */
    @Expose
    @SerializedName("recurrence_size_field_for_request")
    private Integer recurrenceSizeFieldForRequest;

    public Schedule() {
        this(null, null, null, null);
    }

    public Schedule(String timeStart) {
        this(timeStart, null, null, null);
    }

    public Schedule(String timeStart, String recurrenceUnit) {
        this(timeStart, recurrenceUnit, null, null);
    }

    public Schedule(String timeStart, String recurrenceUnit, Integer recurrenceSize) {
        this(timeStart, recurrenceUnit, recurrenceSize, null);
    }

    public Schedule(String timeStart, String recurrenceUnit, Integer recurrenceSize, String timeEnd) {
        this.timeStartFieldForRequest = timeStart;
        this.timeEndFieldForRequest = timeEnd;
        this.recurrenceUnitFieldForRequest = recurrenceUnit;
        this.recurrenceSizeFieldForRequest = recurrenceSize;
    }

    /**
     * Get a specific schedule definition for a given monetary account.
     */
    public static BunqResponse<Schedule> get(Integer scheduleId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleId), params, customHeaders);

        return fromJson(Schedule.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<Schedule> get() {
        return get(null, null, null, null);
    }

    public static BunqResponse<Schedule> get(Integer scheduleId) {
        return get(scheduleId, null, null, null);
    }

    public static BunqResponse<Schedule> get(Integer scheduleId, Integer monetaryAccountId) {
        return get(scheduleId, monetaryAccountId, null, null);
    }

    public static BunqResponse<Schedule> get(Integer scheduleId, Integer monetaryAccountId, Map<String, String> params) {
        return get(scheduleId, monetaryAccountId, params, null);
    }

    /**
     * Get a collection of scheduled definition for a given monetary account. You can add the
     * parameter type to filter the response. When
     * type={SCHEDULE_DEFINITION_PAYMENT,SCHEDULE_DEFINITION_PAYMENT_BATCH} is provided only
     * schedule definition object that relate to these definitions are returned.
     */
    public static BunqResponse<List<Schedule>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

        return fromJsonList(Schedule.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<List<Schedule>> list() {
        return list(null, null, null);
    }

    public static BunqResponse<List<Schedule>> list(Integer monetaryAccountId) {
        return list(monetaryAccountId, null, null);
    }

    public static BunqResponse<List<Schedule>> list(Integer monetaryAccountId, Map<String, String> params) {
        return list(monetaryAccountId, params, null);
    }

    /**
     *
     */
    public static Schedule fromJsonReader(JsonReader reader) {
        return fromJsonReader(Schedule.class, reader);
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
     *
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

}
