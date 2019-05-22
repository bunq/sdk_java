package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.stream.JsonReader;

import java.util.Map;

/**
 * Endpoint for operations over the current session.
 */
public class Session extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_DELETE = "session/%s";

  /**
   * Deletes the current session.
   */
  public static BunqResponse<Session> delete(Integer sessionId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, sessionId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<Session> delete(Integer sessionId) {
    return delete(sessionId, null);
  }

  /**
   */
  public static Session fromJsonReader(JsonReader reader) {
    return fromJsonReader(Session.class, reader);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

}
