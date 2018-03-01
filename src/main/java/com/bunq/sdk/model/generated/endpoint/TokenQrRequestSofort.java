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
 * Using this call you can create a SOFORT Request assigned to your User by providing the Token
 * of the request.
 */
public class TokenQrRequestSofort extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/token-qr-request-sofort";

  /**
   * Field constants.
   */
  public static final String FIELD_TOKEN = "token";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE_POST = "RequestResponse";

  public static BunqResponse<TokenQrRequestSofort> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId) {
    return create(apiContext, requestMap, userId, new HashMap<>());
  }

  /**
   * Create a request from an SOFORT transaction.
   */
  public static BunqResponse<TokenQrRequestSofort> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, userId), requestBytes, customHeaders);

    return fromJson(TokenQrRequestSofort.class, responseRaw, OBJECT_TYPE_POST);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static TokenQrRequestSofort fromJsonReader(JsonReader reader) {
    return fromJsonReader(TokenQrRequestSofort.class, reader);
  }

}
