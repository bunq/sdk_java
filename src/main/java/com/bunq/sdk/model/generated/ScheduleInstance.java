package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.generated.object.Error;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * view for reading, updating and listing the scheduled instance.
 */
public class ScheduleInstance extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_STATE = "state";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/schedule/%s/schedule-instance/%s";
  private static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/schedule/%s/schedule-instance/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/schedule/%s/schedule-instance";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "ScheduleInstance";

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
   * The scheduled object.
   */
  @Expose
  @SerializedName("scheduled_object")
  private BunqModel scheduledObject;

  /**
   * The result object of this schedule instance. (payment, payment batch)
   */
  @Expose
  @SerializedName("result_object")
  private BunqModel resultObject;

  public static BunqResponse<ScheduleInstance> get(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId, Integer scheduleId, Integer scheduleInstanceId) {
    return get(apiContext, userId, monetaryAccountId, scheduleId, scheduleInstanceId,
        new HashMap<>());
  }

  /**
   */
  public static BunqResponse<ScheduleInstance> get(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId, Integer scheduleId, Integer scheduleInstanceId,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(
        String.format(ENDPOINT_URL_READ, userId, monetaryAccountId, scheduleId, scheduleInstanceId),
        customHeaders);

    return fromJson(ScheduleInstance.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer monetaryAccountId, Integer scheduleId, Integer scheduleInstanceId) {
    return update(apiContext, requestMap, userId, monetaryAccountId, scheduleId, scheduleInstanceId,
        new HashMap<>());
  }

  /**
   */
  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer monetaryAccountId, Integer scheduleId, Integer scheduleInstanceId,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.put(String
            .format(ENDPOINT_URL_UPDATE, userId, monetaryAccountId, scheduleId, scheduleInstanceId),
        requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<List<ScheduleInstance>> list(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId, Integer scheduleId) {
    return list(apiContext, userId, monetaryAccountId, scheduleId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<List<ScheduleInstance>> list(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId, Integer scheduleId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId, scheduleId),
            customHeaders);

    return fromJsonList(ScheduleInstance.class, responseRaw, OBJECT_TYPE);
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
   * The scheduled object.
   */
  public BunqModel getScheduledObject() {
    return this.scheduledObject;
  }

  public void setScheduledObject(BunqModel scheduledObject) {
    this.scheduledObject = scheduledObject;
  }

  /**
   * The result object of this schedule instance. (payment, payment batch)
   */
  public BunqModel getResultObject() {
    return this.resultObject;
  }

  public void setResultObject(BunqModel resultObject) {
    this.resultObject = resultObject;
  }

}
