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
 * Used to create a sandbox userPerson.
 */
public class SandboxUserPersonApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "sandbox-user-person";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_POST = "ApiKey";

  /**
   * The API key of the newly created sandbox userPerson.
   */
  @Expose
  @SerializedName("api_key")
  private String apiKey;

  /**
   * The user which was created.
   */
  @Expose
  @SerializedName("user")
  private UserApiObject user;

  /**
   * The login code which the developer can use to log into their sandbox user.
   */
  @Expose
  @SerializedName("login_code")
  private String loginCode;

  /**
   */
  public static BunqResponse<SandboxUserPersonApiObject> create(Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(ENDPOINT_URL_CREATE, requestBytes, customHeaders);

    return fromJson(SandboxUserPersonApiObject.class, responseRaw, OBJECT_TYPE_POST);
  }

  public static BunqResponse<SandboxUserPersonApiObject> create() {
    return create(null);
  }

  /**
   * The API key of the newly created sandbox userPerson.
   */
  public String getApiKey() {
    return this.apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  /**
   * The user which was created.
   */
  public UserApiObject getUser() {
    return this.user;
  }

  public void setUser(UserApiObject user) {
    this.user = user;
  }

  /**
   * The login code which the developer can use to log into their sandbox user.
   */
  public String getLoginCode() {
    return this.loginCode;
  }

  public void setLoginCode(String loginCode) {
    this.loginCode = loginCode;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.apiKey != null) {
      return false;
    }

    if (this.user != null) {
      return false;
    }

    if (this.loginCode != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static SandboxUserPersonApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(SandboxUserPersonApiObject.class, reader);
  }

}
