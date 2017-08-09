package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.BunqResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to get a Device or a listing of Devices. Creating a DeviceServer should happen via
 * /device-server
 */
public class Device extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_READ = "device/%s";
  private static final String ENDPOINT_URL_LISTING = "device";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "Device";

  /**
   */
  @Expose
  @SerializedName("DevicePhone")
  private DevicePhone devicePhone;

  /**
   */
  @Expose
  @SerializedName("DeviceServer")
  private DeviceServer deviceServer;

  public static BunqResponse<Device> get(ApiContext apiContext, Integer deviceId) {
    return get(apiContext, deviceId, new HashMap<>());
  }

  /**
   * Get a single Device. A Device is either a DevicePhone or a DeviceServer.
   */
  public static BunqResponse<Device> get(ApiContext apiContext, Integer deviceId,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_READ, deviceId), customHeaders);

    return fromJson(Device.class, responseRaw);
  }

  public static BunqResponse<List<Device>> list(ApiContext apiContext) {
    return list(apiContext, new HashMap<>());
  }

  /**
   * Get a collection of Devices. A Device is either a DevicePhone or a DeviceServer.
   */
  public static BunqResponse<List<Device>> list(ApiContext apiContext,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(ENDPOINT_URL_LISTING, customHeaders);

    return fromJsonList(Device.class, responseRaw);
  }

  /**
   */
  public DevicePhone getDevicePhone() {
    return this.devicePhone;
  }

  public void setDevicePhone(DevicePhone devicePhone) {
    this.devicePhone = devicePhone;
  }

  /**
   */
  public DeviceServer getDeviceServer() {
    return this.deviceServer;
  }

  public void setDeviceServer(DeviceServer deviceServer) {
    this.deviceServer = deviceServer;
  }

}
