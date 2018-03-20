package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.stream.JsonReader;

import java.util.List;
import java.util.Map;

/**
 * view for reading the scheduled definitions.
 */
public class ScheduleUser extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/schedule";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "ScheduleUser";

  /**
   * Get a collection of scheduled definition for all accessible monetary accounts of the user.
   * You can add the parameter type to filter the response. When
   * type={SCHEDULE_DEFINITION_PAYMENT,SCHEDULE_DEFINITION_PAYMENT_BATCH} is provided only
   * schedule definition object that relate to these definitions are returned.
   */
  public static BunqResponse<List<ScheduleUser>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(ScheduleUser.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<ScheduleUser>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<ScheduleUser>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static ScheduleUser fromJsonReader(JsonReader reader) {
    return fromJsonReader(ScheduleUser.class, reader);
  }

}
