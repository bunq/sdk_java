package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
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
 * Manage the IPs which may be used for a credential of a user for server authentication.
 */
public class PermittedIpApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/credential-password-ip/%s/ip/%s";
  protected static final String ENDPOINT_URL_CREATE = "user/%s/credential-password-ip/%s/ip";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/credential-password-ip/%s/ip";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/credential-password-ip/%s/ip/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_IP = "ip";
  public static final String FIELD_STATUS = "status";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "PermittedIp";

  /**
   * The IP address.
   */
  @Expose
  @SerializedName("ip")
  private String ip;

  /**
   * The status of the IP. May be "ACTIVE" or "INACTIVE". It is only possible to make requests
   * from "ACTIVE" IP addresses. Only "ACTIVE" IPs will be billed.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The IP address.
   */
  @Expose
  @SerializedName("ip_field_for_request")
  private String ipFieldForRequest;

  /**
   * The status of the IP. May be "ACTIVE" or "INACTIVE". It is only possible to make requests
   * from "ACTIVE" IP addresses. Only "ACTIVE" IPs will be billed.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  public PermittedIpApiObject() {
  this(null, null);
  }

  public PermittedIpApiObject(String ip) {
  this(ip, null);
  }

  public PermittedIpApiObject(String ip, String status) {
    this.ipFieldForRequest = ip;
    this.statusFieldForRequest = status;
  }  /**
   */
  public static BunqResponse<PermittedIpApiObject> get(Integer credentialPasswordIpId, Integer permittedIpId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), credentialPasswordIpId, permittedIpId), params, customHeaders);

    return fromJson(PermittedIpApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<PermittedIpApiObject> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<PermittedIpApiObject> get(Integer credentialPasswordIpId) {
    return get(credentialPasswordIpId, null, null, null);
  }

  public static BunqResponse<PermittedIpApiObject> get(Integer credentialPasswordIpId, Integer permittedIpId) {
    return get(credentialPasswordIpId, permittedIpId, null, null);
  }

  public static BunqResponse<PermittedIpApiObject> get(Integer credentialPasswordIpId, Integer permittedIpId, Map<String, String> params) {
    return get(credentialPasswordIpId, permittedIpId, params, null);
  }

  /**
   * @param ip The IP address.
   * @param status The status of the IP. May be "ACTIVE" or "INACTIVE". It is only possible to
   * make requests from "ACTIVE" IP addresses. Only "ACTIVE" IPs will be billed.
   */
  public static BunqResponse<Integer> create(Integer credentialPasswordIpId, String ip, String status, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_IP, ip);
requestMap.put(FIELD_STATUS, status);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), credentialPasswordIpId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer credentialPasswordIpId) {
    return create(credentialPasswordIpId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer credentialPasswordIpId, String ip) {
    return create(credentialPasswordIpId, ip, null, null);
  }

  public static BunqResponse<Integer> create(Integer credentialPasswordIpId, String ip, String status) {
    return create(credentialPasswordIpId, ip, status, null);
  }

  /**
   */
  public static BunqResponse<List<PermittedIpApiObject>> list(Integer credentialPasswordIpId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), credentialPasswordIpId), params, customHeaders);

    return fromJsonList(PermittedIpApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<PermittedIpApiObject>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<PermittedIpApiObject>> list(Integer credentialPasswordIpId) {
    return list(credentialPasswordIpId, null, null);
  }

  public static BunqResponse<List<PermittedIpApiObject>> list(Integer credentialPasswordIpId, Map<String, String> params) {
    return list(credentialPasswordIpId, params, null);
  }

  /**
   * @param status The status of the IP. May be "ACTIVE" or "INACTIVE". It is only possible to
   * make requests from "ACTIVE" IP addresses. Only "ACTIVE" IPs will be billed.
   */
  public static BunqResponse<Integer> update(Integer credentialPasswordIpId, Integer permittedIpId, String status, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_STATUS, status);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), credentialPasswordIpId, permittedIpId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer credentialPasswordIpId) {
    return update(credentialPasswordIpId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer credentialPasswordIpId, Integer permittedIpId) {
    return update(credentialPasswordIpId, permittedIpId, null, null);
  }

  public static BunqResponse<Integer> update(Integer credentialPasswordIpId, Integer permittedIpId, String status) {
    return update(credentialPasswordIpId, permittedIpId, status, null);
  }

  /**
   * The IP address.
   */
  public String getIp() {
    return this.ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  /**
   * The status of the IP. May be "ACTIVE" or "INACTIVE". It is only possible to make requests
   * from "ACTIVE" IP addresses. Only "ACTIVE" IPs will be billed.
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
  public static PermittedIpApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(PermittedIpApiObject.class, reader);
  }

}
