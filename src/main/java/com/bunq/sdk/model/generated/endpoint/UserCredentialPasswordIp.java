package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.PermittedDevice;
import com.bunq.sdk.security.SecurityUtils;
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
 * Create a credential of a user for server authentication, or delete the credential of a user
 * for server authentication.
 */
public class UserCredentialPasswordIp extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_READ = "user/%s/credential-password-ip/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/credential-password-ip";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE_GET = "CredentialPasswordIp";

  /**
   * The id of the credential.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the credential object's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the credential object's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The status of the credential.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * When the status is PENDING_FIRST_USE: when the credential expires.
   */
  @Expose
  @SerializedName("expiry_time")
  private String expiryTime;

  /**
   * When the status is PENDING_FIRST_USE: the value of the token.
   */
  @Expose
  @SerializedName("token_value")
  private String tokenValue;

  /**
   * When the status is ACTIVE: the details of the device that may use the credential.
   */
  @Expose
  @SerializedName("permitted_device")
  private PermittedDevice permittedDevice;

  public static BunqResponse<UserCredentialPasswordIp> get(ApiContext apiContext, Integer userId, Integer userCredentialPasswordIpId) {
    return get(apiContext, userId, userCredentialPasswordIpId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<UserCredentialPasswordIp> get(ApiContext apiContext, Integer userId, Integer userCredentialPasswordIpId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userId, userCredentialPasswordIpId), new HashMap<>(), customHeaders);

    return fromJson(UserCredentialPasswordIp.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<UserCredentialPasswordIp>> list(ApiContext apiContext, Integer userId) {
    return list(apiContext, userId, new HashMap<>());
  }

  public static BunqResponse<List<UserCredentialPasswordIp>> list(ApiContext apiContext, Integer userId, Map<String, String> params) {
    return list(apiContext, userId, params, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<List<UserCredentialPasswordIp>> list(ApiContext apiContext, Integer userId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId), params, customHeaders);

    return fromJsonList(UserCredentialPasswordIp.class, responseRaw, OBJECT_TYPE_GET);
  }

  /**
   * The id of the credential.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the credential object's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the credential object's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The status of the credential.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * When the status is PENDING_FIRST_USE: when the credential expires.
   */
  public String getExpiryTime() {
    return this.expiryTime;
  }

  public void setExpiryTime(String expiryTime) {
    this.expiryTime = expiryTime;
  }

  /**
   * When the status is PENDING_FIRST_USE: the value of the token.
   */
  public String getTokenValue() {
    return this.tokenValue;
  }

  public void setTokenValue(String tokenValue) {
    this.tokenValue = tokenValue;
  }

  /**
   * When the status is ACTIVE: the details of the device that may use the credential.
   */
  public PermittedDevice getPermittedDevice() {
    return this.permittedDevice;
  }

  public void setPermittedDevice(PermittedDevice permittedDevice) {
    this.permittedDevice = permittedDevice;
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

    if (this.status != null) {
      return false;
    }

    if (this.expiryTime != null) {
      return false;
    }

    if (this.tokenValue != null) {
      return false;
    }

    if (this.permittedDevice != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static UserCredentialPasswordIp fromJsonReader(JsonReader reader) {
    return fromJsonReader(UserCredentialPasswordIp.class, reader);
  }

}
