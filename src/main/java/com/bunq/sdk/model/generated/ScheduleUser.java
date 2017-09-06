package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * view for reading the scheduled definitions.
 */
public class ScheduleUser extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_LISTING = "user/%s/schedule";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "ScheduleUser";

  public static BunqResponse<List<ScheduleUser>> list(ApiContext apiContext, Integer userId) {
    return list(apiContext, userId, new HashMap<>());
  }

  public static BunqResponse<List<ScheduleUser>> list(ApiContext apiContext, Integer userId,
      Map<String, String> params) {
    return list(apiContext, userId, params, new HashMap<>());
  }

  /**
   * Get a collection of scheduled definition for all accessible monetary accounts of the user.
   * You can add the parameter type to filter the response. When
   * type={SCHEDULE_DEFINITION_PAYMENT,SCHEDULE_DEFINITION_PAYMENT_BATCH} is provided only
   * schedule definition object that relate to these definitions are returned.
   */
  public static BunqResponse<List<ScheduleUser>> list(ApiContext apiContext, Integer userId,
      Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_LISTING, userId), params, customHeaders);

    return fromJsonList(ScheduleUser.class, responseRaw, OBJECT_TYPE);
  }

}
