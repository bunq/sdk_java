package com.bunq.sdk.model.core;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.generated.endpoint.DeviceServer;

import java.util.HashMap;
import java.util.List;

public class DeviceServerInternal extends DeviceServer {
  public static BunqResponse<Integer> create(
      ApiContext apiContext,
      String description,
      String secret,
      List<String> permittedIps
  ) {
    ApiClient apiClient = new ApiClient(apiContext);
    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_DESCRIPTION, description);
    requestMap.put(FIELD_SECRET, secret);
    requestMap.put(FIELD_PERMITTED_IPS, permittedIps);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(
        ENDPOINT_URL_CREATE,
        requestBytes,
        new HashMap<String, String>()
    );

    return processForId(responseRaw);
  }
}
