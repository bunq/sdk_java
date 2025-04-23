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
import com.google.gson.stream.JsonReader;
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
public class DeviceApiObject extends BunqModel implements AnchorObjectInterface {

  /**
   * Error constants.
   */
  protected static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "device/%s";
  protected static final String ENDPOINT_URL_LISTING = "device";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "Device";

  /**
   */
  @Expose
  @SerializedName("DeviceServer")
  private DeviceServerApiObject deviceServer;

  /**
   * Get a single Device. A Device is either a DevicePhone or a DeviceServer.
   */
  public static BunqResponse<DeviceApiObject> get(Integer deviceId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, deviceId), params, customHeaders);

    return fromJson(DeviceApiObject.class, responseRaw);
  }

  public static BunqResponse<DeviceApiObject> get() {
    return get(null, null, null);
  }

  public static BunqResponse<DeviceApiObject> get(Integer deviceId) {
    return get(deviceId, null, null);
  }

  public static BunqResponse<DeviceApiObject> get(Integer deviceId, Map<String, String> params) {
    return get(deviceId, params, null);
  }

  /**
   * Get a collection of Devices. A Device is either a DevicePhone or a DeviceServer.
   */
  public static BunqResponse<List<DeviceApiObject>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(ENDPOINT_URL_LISTING, params, customHeaders);

    return fromJsonList(DeviceApiObject.class, responseRaw);
  }

  public static BunqResponse<List<DeviceApiObject>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<DeviceApiObject>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   */
  public DeviceServerApiObject getDeviceServer() {
    return this.deviceServer;
  }

  public void setDeviceServer(DeviceServerApiObject deviceServer) {
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
  public boolean isAllFieldNull() {
    if (this.deviceServer != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static DeviceApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(DeviceApiObject.class, reader);
  }

}
