package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.Error;
import com.bunq.sdk.model.generated.object.RequestInquiryReference;
import com.bunq.sdk.model.generated.object.ScheduleAnchorObject;
import com.bunq.sdk.model.generated.object.ScheduleInstanceAnchorObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * view for reading, updating and listing the scheduled instance.
 */
public class ScheduleInstance extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/schedule/%s/schedule-instance/%s";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/schedule/%s/schedule-instance/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/schedule/%s/schedule-instance";

  /**
   * Field constants.
   */
  public static final String FIELD_STATE = "state";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "ScheduledInstance";

  /**
   * The state of the scheduleInstance. (FINISHED_SUCCESSFULLY, RETRY, FAILED_USER_ERROR)
   */
  @Expose
  @SerializedName("state")
  private String state;

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
   * The message when the scheduled instance has run and failed due to user error.
   */
  @Expose
  @SerializedName("error_message")
  private List<Error> errorMessage;

  /**
   * The scheduled object. (Payment, PaymentBatch)
   */
  @Expose
  @SerializedName("scheduled_object")
  private ScheduleAnchorObject scheduledObject;

  /**
   * The result object of this schedule instance. (Payment, PaymentBatch)
   */
  @Expose
  @SerializedName("result_object")
  private ScheduleInstanceAnchorObject resultObject;

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  @Expose
  @SerializedName("request_reference_split_the_bill")
  private List<RequestInquiryReference> requestReferenceSplitTheBill;

  /**
   */
  public static BunqResponse<ScheduleInstance> get(Integer scheduleId, Integer scheduleInstanceId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleId, scheduleInstanceId), params, customHeaders);

    return fromJson(ScheduleInstance.class, responseRaw, OBJECT_TYPE_GET);
  }
  public static BunqResponse<ScheduleInstance> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<ScheduleInstance> get(Integer scheduleId) {
    return get(scheduleId, null, null, null, null);
  }

  public static BunqResponse<ScheduleInstance> get(Integer scheduleId, Integer scheduleInstanceId) {
    return get(scheduleId, scheduleInstanceId, null, null, null);
  }

  public static BunqResponse<ScheduleInstance> get(Integer scheduleId, Integer scheduleInstanceId, Integer monetaryAccountId) {
    return get(scheduleId, scheduleInstanceId, monetaryAccountId, null, null);
  }

  public static BunqResponse<ScheduleInstance> get(Integer scheduleId, Integer scheduleInstanceId, Integer monetaryAccountId, Map<String, String> params) {
    return get(scheduleId, scheduleInstanceId, monetaryAccountId, params, null);
  }

  /**
   * @param state Change the state of the scheduleInstance from FAILED_USER_ERROR to RETRY.
   */
  public static BunqResponse<Integer> update(Integer scheduleId, Integer scheduleInstanceId, Integer monetaryAccountId, String state, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_STATE, state);

    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleId, scheduleInstanceId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update() {
    return update(null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer scheduleId) {
    return update(scheduleId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer scheduleId, Integer scheduleInstanceId) {
    return update(scheduleId, scheduleInstanceId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer scheduleId, Integer scheduleInstanceId, Integer monetaryAccountId) {
    return update(scheduleId, scheduleInstanceId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer scheduleId, Integer scheduleInstanceId, Integer monetaryAccountId, String state) {
    return update(scheduleId, scheduleInstanceId, monetaryAccountId, state, null);
  }

  /**
   */
  public static BunqResponse<List<ScheduleInstance>> list(Integer scheduleId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), scheduleId), params, customHeaders);

    return fromJsonList(ScheduleInstance.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<ScheduleInstance>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<ScheduleInstance>> list(Integer scheduleId) {
    return list(scheduleId, null, null, null);
  }

  public static BunqResponse<List<ScheduleInstance>> list(Integer scheduleId, Integer monetaryAccountId) {
    return list(scheduleId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<ScheduleInstance>> list(Integer scheduleId, Integer monetaryAccountId, Map<String, String> params) {
    return list(scheduleId, monetaryAccountId, params, null);
  }

  /**
   * The state of the scheduleInstance. (FINISHED_SUCCESSFULLY, RETRY, FAILED_USER_ERROR)
   */
  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
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
   * The message when the scheduled instance has run and failed due to user error.
   */
  public List<Error> getErrorMessage() {
    return this.errorMessage;
  }

  public void setErrorMessage(List<Error> errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * The scheduled object. (Payment, PaymentBatch)
   */
  public ScheduleAnchorObject getScheduledObject() {
    return this.scheduledObject;
  }

  public void setScheduledObject(ScheduleAnchorObject scheduledObject) {
    this.scheduledObject = scheduledObject;
  }

  /**
   * The result object of this schedule instance. (Payment, PaymentBatch)
   */
  public ScheduleInstanceAnchorObject getResultObject() {
    return this.resultObject;
  }

  public void setResultObject(ScheduleInstanceAnchorObject resultObject) {
    this.resultObject = resultObject;
  }

  /**
   * The reference to the object used for split the bill. Can be RequestInquiry or
   * RequestInquiryBatch
   */
  public List<RequestInquiryReference> getRequestReferenceSplitTheBill() {
    return this.requestReferenceSplitTheBill;
  }

  public void setRequestReferenceSplitTheBill(List<RequestInquiryReference> requestReferenceSplitTheBill) {
    this.requestReferenceSplitTheBill = requestReferenceSplitTheBill;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.state != null) {
      return false;
    }

    if (this.timeStart != null) {
      return false;
    }

    if (this.timeEnd != null) {
      return false;
    }

    if (this.errorMessage != null) {
      return false;
    }

    if (this.scheduledObject != null) {
      return false;
    }

    if (this.resultObject != null) {
      return false;
    }

    if (this.requestReferenceSplitTheBill != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static ScheduleInstance fromJsonReader(JsonReader reader) {
    return fromJsonReader(ScheduleInstance.class, reader);
  }

}
