package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.AnchorObjectInterface;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * Used to get a Device or a listing of Devices. Creating a DeviceServer should happen via
 * /device-server
 */
public class Device extends BunqModel implements AnchorObjectInterface {

  /**
   * Error constants.
   */
  private static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

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
  @SerializedName("DeviceServer")
  private DeviceServer deviceServer;

  public static BunqResponse<Device> get(ApiContext apiContext, Integer deviceId) {
    return get(apiContext, deviceId, new HashMap<>());
  }

  /**
   * Get a single Device. A Device is either a DevicePhone or a DeviceServer.
   */
  public static BunqResponse<Device> get(ApiContext apiContext, Integer deviceId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, deviceId), new HashMap<>(), customHeaders);

    return fromJson(Device.class, responseRaw);
  }

  public static BunqResponse<List<Device>> list(ApiContext apiContext) {
    return list(apiContext, new HashMap<>());
  }

  public static BunqResponse<List<Device>> list(ApiContext apiContext, Map<String, String> params) {
    return list(apiContext, params, new HashMap<>());
  }

  /**
   * Get a collection of Devices. A Device is either a DevicePhone or a DeviceServer.
   */
  public static BunqResponse<List<Device>> list(ApiContext apiContext, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(ENDPOINT_URL_LISTING, params, customHeaders);

    return fromJsonList(Device.class, responseRaw);
  }

  /**
   */
  public DeviceServer getDeviceServer() {
    return this.deviceServer;
  }

  public void setDeviceServer(DeviceServer deviceServer) {
    this.deviceServer = deviceServer;
  }

  /**
   */
  public BunqModel getReferencedObject() {
    if (this.deviceServer != null) {
      return this.deviceServer;
    }

    throw new BunqException(ERROR_NULL_FIELDS);
  }

  /**
   */
  public boolean areAllFieldNull() {
    if (this.deviceServer != null) {
      return false;
    }

    return true;
  }

}
