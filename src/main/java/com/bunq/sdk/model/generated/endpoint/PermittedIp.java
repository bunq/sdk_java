package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
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
 * Manage the IPs which may be used for a credential of a user for server authentication.
 */
public class PermittedIp extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_READ = "user/%s/credential-password-ip/%s/ip/%s";
  private static final String ENDPOINT_URL_CREATE = "user/%s/credential-password-ip/%s/ip";
  private static final String ENDPOINT_URL_LISTING = "user/%s/credential-password-ip/%s/ip";
  private static final String ENDPOINT_URL_UPDATE = "user/%s/credential-password-ip/%s/ip/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_IP = "ip";
  public static final String FIELD_STATUS = "status";

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

  public static BunqResponse<PermittedIp> get(ApiContext apiContext, Integer userId, Integer credentialPasswordIpId, Integer permittedIpId) {
    return get(apiContext, userId, credentialPasswordIpId, permittedIpId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<PermittedIp> get(ApiContext apiContext, Integer userId, Integer credentialPasswordIpId, Integer permittedIpId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userId, credentialPasswordIpId, permittedIpId), new HashMap<>(), customHeaders);

    return fromJson(PermittedIp.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer credentialPasswordIpId) {
    return create(apiContext, requestMap, userId, credentialPasswordIpId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer credentialPasswordIpId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, userId, credentialPasswordIpId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<List<PermittedIp>> list(ApiContext apiContext, Integer userId, Integer credentialPasswordIpId) {
    return list(apiContext, userId, credentialPasswordIpId, new HashMap<>());
  }

  public static BunqResponse<List<PermittedIp>> list(ApiContext apiContext, Integer userId, Integer credentialPasswordIpId, Map<String, String> params) {
    return list(apiContext, userId, credentialPasswordIpId, params, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<List<PermittedIp>> list(ApiContext apiContext, Integer userId, Integer credentialPasswordIpId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId, credentialPasswordIpId), params, customHeaders);

    return fromJsonList(PermittedIp.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer credentialPasswordIpId, Integer permittedIpId) {
    return update(apiContext, requestMap, userId, credentialPasswordIpId, permittedIpId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer credentialPasswordIpId, Integer permittedIpId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, userId, credentialPasswordIpId, permittedIpId), requestBytes, customHeaders);

    return processForId(responseRaw);
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
  public boolean areAllFieldNull() {
    if (this.ip != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    return true;
  }

}
