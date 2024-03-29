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
public class SandboxUserPerson extends BunqModel {

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
   */
  public static BunqResponse<SandboxUserPerson> create(Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(ENDPOINT_URL_CREATE, requestBytes, customHeaders);

    return fromJson(SandboxUserPerson.class, responseRaw, OBJECT_TYPE_POST);
  }

  public static BunqResponse<SandboxUserPerson> create() {
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
   */
  public boolean isAllFieldNull() {
    if (this.apiKey != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static SandboxUserPerson fromJsonReader(JsonReader reader) {
    return fromJsonReader(SandboxUserPerson.class, reader);
  }

}
