package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.model.BunqModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
   * Object type.
   */
  private static final String OBJECT_TYPE = "Schedule";

  public static Schedule get(ApiContext apiContext, Integer userId, Integer monetaryAccountId,
      Integer scheduleId) {
    return get(apiContext, userId, monetaryAccountId, scheduleId, new HashMap<>());
  }

  /**
   * Get a specific schedule definition for a given monetary account.
   */
  public static Schedule get(ApiContext apiContext, Integer userId, Integer monetaryAccountId,
      Integer scheduleId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] responseBytes = apiClient
        .get(String.format(ENDPOINT_URL_READ, userId, monetaryAccountId, scheduleId),
            customHeaders);

    return fromJson(Schedule.class, new String(responseBytes), OBJECT_TYPE);
  }

  public static List<Schedule> list(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId) {
    return list(apiContext, userId, monetaryAccountId, new HashMap<>());
  }

  /**
   * Get a collection of scheduled definition for a given monetary account. You can add the
   * parameter type to filter the response. When
   * type={SCHEDULE_DEFINITION_PAYMENT,SCHEDULE_DEFINITION_PAYMENT_BATCH} is provided only
   * schedule definition object that relate to these definitions are returned.
   */
  public static List<Schedule> list(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] responseBytes = apiClient
        .get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId), customHeaders);

    return fromJsonList(Schedule.class, new String(responseBytes), OBJECT_TYPE);
  }

}
