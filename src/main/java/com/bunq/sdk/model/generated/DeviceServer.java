package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.model.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * After having created an Installation you can now create a DeviceServer. A DeviceServer is
 * needed to do a login call with session-server.
 */
public class DeviceServer extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_SECRET = "secret";
  public static final String FIELD_PERMITTED_IPS = "permitted_ips";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "device-server";
  private static final String ENDPOINT_URL_READ = "device-server/%s";
  private static final String ENDPOINT_URL_LISTING = "device-server";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "DeviceServer";

  /**
   * The id of the DeviceServer as created on the server.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the DeviceServer's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the DeviceServer's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The description of the DeviceServer.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The ip address which was used to create the DeviceServer.
   */
  @Expose
  @SerializedName("ip")
  private String ip;

  /**
   * The status of the DeviceServer. Can be ACTIVE, BLOCKED, NEEDS_CONFIRMATION or OBSOLETE.
   */
  @Expose
  @SerializedName("status")
  private String status;

  public static Integer create(ApiContext apiContext, Map<String, Object> requestMap) {
    return create(apiContext, requestMap, new HashMap<>());
  }

  /**
   * Create a new DeviceServer. Provide the Installation token in the
   * "X-Bunq-Client-Authentication" header. And sign this request with the key of which you used
   * the public part to create the Installation. Your API key will be bound to the ip address of
   * this DeviceServer.
   */
  public static Integer create(ApiContext apiContext, Map<String, Object> requestMap,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    byte[] responseBytes = apiClient.post(ENDPOINT_URL_CREATE, requestBytes, customHeaders);

    return processForId(new String(responseBytes));
  }

  public static DeviceServer get(ApiContext apiContext, Integer deviceServerId) {
    return get(apiContext, deviceServerId, new HashMap<>());
  }

  /**
   * Get one of your DeviceServers.
   */
  public static DeviceServer get(ApiContext apiContext, Integer deviceServerId,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] responseBytes = apiClient
        .get(String.format(ENDPOINT_URL_READ, deviceServerId), customHeaders);

    return fromJson(DeviceServer.class, new String(responseBytes), OBJECT_TYPE);
  }

  public static List<DeviceServer> list(ApiContext apiContext) {
    return list(apiContext, new HashMap<>());
  }

  /**
   * Get a collection of all the DeviceServers you have created.
   */
  public static List<DeviceServer> list(ApiContext apiContext, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] responseBytes = apiClient.get(ENDPOINT_URL_LISTING, customHeaders);

    return fromJsonList(DeviceServer.class, new String(responseBytes), OBJECT_TYPE);
  }

  /**
   * The id of the DeviceServer as created on the server.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the DeviceServer's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the DeviceServer's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The description of the DeviceServer.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The ip address which was used to create the DeviceServer.
   */
  public String getIp() {
    return this.ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  /**
   * The status of the DeviceServer. Can be ACTIVE, BLOCKED, NEEDS_CONFIRMATION or OBSOLETE.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}
