package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * After having created an Installation you can now create a DeviceServer. A DeviceServer is
 * needed to do a login call with session-server.
 */
public class DeviceServer extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "device-server";
  protected static final String ENDPOINT_URL_READ = "device-server/%s";
  protected static final String ENDPOINT_URL_LISTING = "device-server";

  /**
   * Field constants.
   */
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_SECRET = "secret";
  public static final String FIELD_PERMITTED_IPS = "permitted_ips";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "DeviceServer";

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

  /**
   * Create a new DeviceServer providing the installation token in the header and signing the
   * request with the private part of the key you used to create the installation. The API Key
   * that you are using will be bound to the IP address of the DeviceServer which you have
   * created.<br/><br/>Using a Wildcard API Key gives you the freedom to make API calls even if
   * the IP address has changed after the POST device-server.<br/><br/>Find out more at this link
   * <a href="https://bunq.com/en/apikey-dynamic-ip"
   * target="_blank">https://bunq.com/en/apikey-dynamic-ip</a>.
   * @param description The description of the DeviceServer. This is only for your own reference
   * when reading the DeviceServer again.
   * @param secret The API key. You can request an API key in the bunq app.
   * @param permittedIps An array of IPs (v4 or v6) this DeviceServer will be able to do calls
   * from. These will be linked to the API key.
   */
  public static BunqResponse<Integer> create(String description, String secret, List<String> permittedIps, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_DESCRIPTION, description);
    requestMap.put(FIELD_SECRET, secret);
    requestMap.put(FIELD_PERMITTED_IPS, permittedIps);

    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(ENDPOINT_URL_CREATE, requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null);
  }

  public static BunqResponse<Integer> create(String description) {
    return create(description, null, null, null);
  }

  public static BunqResponse<Integer> create(String description, String secret) {
    return create(description, secret, null, null);
  }

  public static BunqResponse<Integer> create(String description, String secret, List<String> permittedIps) {
    return create(description, secret, permittedIps, null);
  }

  /**
   * Get one of your DeviceServers.
   */
  public static BunqResponse<DeviceServer> get(Integer deviceServerId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, deviceServerId), params, customHeaders);

    return fromJson(DeviceServer.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<DeviceServer> get() {
    return get(null, null, null);
  }

  public static BunqResponse<DeviceServer> get(Integer deviceServerId) {
    return get(deviceServerId, null, null);
  }

  public static BunqResponse<DeviceServer> get(Integer deviceServerId, Map<String, String> params) {
    return get(deviceServerId, params, null);
  }

  /**
   * Get a collection of all the DeviceServers you have created.
   */
  public static BunqResponse<List<DeviceServer>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(ENDPOINT_URL_LISTING, params, customHeaders);

    return fromJsonList(DeviceServer.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<DeviceServer>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<DeviceServer>> list(Map<String, String> params) {
    return list(params, null);
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

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.created != null) {
      return false;
    }

    if (this.updated != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.ip != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static DeviceServer fromJsonReader(JsonReader reader) {
    return fromJsonReader(DeviceServer.class, reader);
  }

}
