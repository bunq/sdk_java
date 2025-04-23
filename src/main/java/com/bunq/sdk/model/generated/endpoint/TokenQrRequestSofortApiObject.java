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
public class TokenQrRequestSofortApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/token-qr-request-sofort";

  /**
   * Field constants.
   */
  public static final String FIELD_TOKEN = "token";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_POST = "RequestResponse";

  /**
   * The token passed from a site or read from a QR code.
   */
  @Expose
  @SerializedName("token_field_for_request")
  private String tokenFieldForRequest;

  public TokenQrRequestSofortApiObject() {
  this(null);
  }

  public TokenQrRequestSofortApiObject(String token) {
    this.tokenFieldForRequest = token;
  }  /**
   * Create a request from an SOFORT transaction.
   * @param token The token passed from a site or read from a QR code.
   */
  public static BunqResponse<TokenQrRequestSofortApiObject> create(String token, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_TOKEN, token);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return fromJson(TokenQrRequestSofortApiObject.class, responseRaw, OBJECT_TYPE_POST);
  }

  public static BunqResponse<TokenQrRequestSofortApiObject> create() {
    return create(null, null);
  }

  public static BunqResponse<TokenQrRequestSofortApiObject> create(String token) {
    return create(token, null);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static TokenQrRequestSofortApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(TokenQrRequestSofortApiObject.class, reader);
  }

}
