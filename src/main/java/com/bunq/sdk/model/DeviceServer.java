package com.bunq.sdk.model;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import java.util.HashMap;
import java.util.List;

public class DeviceServer extends BunqModel {

  /**
   * Endpoint name.
   */
  private static final String ENDPOINT_URL_POST = "device-server";

  /**
   * Field constants.
   */
  private static final String FIELD_DESCRIPTION = "description";
  private static final String FIELD_SECRET = "secret";
  private static final String FIELD_PERMITTED_IPS = "permitted_ips";

  /**
   * Create a new DeviceServer. Provide the Installation token in the
   * "X-Bunq-Client-Authentication" header. And sign this request with the key
   * of which you used the public part to create the Installation. Your API key
   * will be bound to the ip address of this DeviceServer.
   */
  public static Integer create(ApiContext apiContext, String description,
      List<String> permittedIps) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = generateRequestBodyBytes(description,
        apiContext.getApiKey(), permittedIps);
    byte[] responseBytes = apiClient.post(ENDPOINT_URL_POST, requestBytes, new HashMap<>());

    return processForId(new String(responseBytes));
  }

  private static byte[] generateRequestBodyBytes(String description,
      String apiKey, List<String> permittedIps) {
    HashMap<String, Object> deviceServerRequestBody = new HashMap<>();
    deviceServerRequestBody.put(FIELD_DESCRIPTION, description);
    deviceServerRequestBody.put(FIELD_SECRET, apiKey);
    deviceServerRequestBody.put(FIELD_PERMITTED_IPS, permittedIps);

    return gson.toJson(deviceServerRequestBody).getBytes();
  }

}
