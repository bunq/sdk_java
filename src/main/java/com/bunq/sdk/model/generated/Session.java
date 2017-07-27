package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.model.BunqModel;
import java.util.HashMap;
import java.util.Map;

/**
 * Endpoint for operations over the current session.
 */
public class Session extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_DELETE = "session/%s";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "Session";

  public static void delete(ApiContext apiContext, Integer sessionId) {
    delete(apiContext, sessionId, new HashMap<>());
  }

  /**
   * Deletes the current session. No response is returned for this request.
   */
  public static void delete(ApiContext apiContext, Integer sessionId,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    apiClient.delete(String.format(ENDPOINT_URL_DELETE, sessionId), customHeaders);
  }

}
