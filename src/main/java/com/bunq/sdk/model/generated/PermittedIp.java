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
 * Manage the IPs which may be used for a credential of a user for server authentication.
 */
public class PermittedIp extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_IP = "ip";
  public static final String FIELD_STATUS = "status";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_READ = "user/%s/credential-password-ip/%s/ip/%s";
  private static final String ENDPOINT_URL_CREATE = "user/%s/credential-password-ip/%s/ip";
  private static final String ENDPOINT_URL_LISTING = "user/%s/credential-password-ip/%s/ip";
  private static final String ENDPOINT_URL_UPDATE = "user/%s/credential-password-ip/%s/ip/%s";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "PermittedIp";

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

  public static PermittedIp get(ApiContext apiContext, Integer userId,
      Integer credentialPasswordIpId, Integer permittedIpId) {
    return get(apiContext, userId, credentialPasswordIpId, permittedIpId, new HashMap<>());
  }

  /**
   */
  public static PermittedIp get(ApiContext apiContext, Integer userId,
      Integer credentialPasswordIpId, Integer permittedIpId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] responseBytes = apiClient
        .get(String.format(ENDPOINT_URL_READ, userId, credentialPasswordIpId, permittedIpId),
            customHeaders);

    return fromJson(PermittedIp.class, new String(responseBytes), OBJECT_TYPE);
  }

  public static Integer create(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer credentialPasswordIpId) {
    return create(apiContext, requestMap, userId, credentialPasswordIpId, new HashMap<>());
  }

  /**
   */
  public static Integer create(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer credentialPasswordIpId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    byte[] responseBytes = apiClient
        .post(String.format(ENDPOINT_URL_CREATE, userId, credentialPasswordIpId), requestBytes,
            customHeaders);

    return processForId(new String(responseBytes));
  }

  public static List<PermittedIp> list(ApiContext apiContext, Integer userId,
      Integer credentialPasswordIpId) {
    return list(apiContext, userId, credentialPasswordIpId, new HashMap<>());
  }

  /**
   */
  public static List<PermittedIp> list(ApiContext apiContext, Integer userId,
      Integer credentialPasswordIpId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] responseBytes = apiClient
        .get(String.format(ENDPOINT_URL_LISTING, userId, credentialPasswordIpId), customHeaders);

    return fromJsonList(PermittedIp.class, new String(responseBytes), OBJECT_TYPE);
  }

  public static Integer update(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer credentialPasswordIpId, Integer permittedIpId) {
    return update(apiContext, requestMap, userId, credentialPasswordIpId, permittedIpId,
        new HashMap<>());
  }

  /**
   */
  public static Integer update(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer credentialPasswordIpId, Integer permittedIpId,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    byte[] responseBytes = apiClient
        .put(String.format(ENDPOINT_URL_UPDATE, userId, credentialPasswordIpId, permittedIpId),
            requestBytes, customHeaders);

    return processForId(new String(responseBytes));
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

}
