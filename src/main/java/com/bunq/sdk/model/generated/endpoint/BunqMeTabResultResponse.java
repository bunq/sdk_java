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
 * Used to view bunq.me TabResultResponse objects belonging to a tab. A TabResultResponse is an
 * object that holds details on a tab which has been paid from the provided monetary account.
 */
public class BunqMeTabResultResponse extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/bunqme-tab-result-response/%s";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "BunqMeTabResultResponse";

  /**
   * The payment made for the bunq.me tab.
   */
  @Expose
  @SerializedName("payment")
  private Payment payment;

  /**
   */
  public static BunqResponse<BunqMeTabResultResponse> get(Integer bunqMeTabResultResponseId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), bunqMeTabResultResponseId), params, customHeaders);

    return fromJson(BunqMeTabResultResponse.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<BunqMeTabResultResponse> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<BunqMeTabResultResponse> get(Integer bunqMeTabResultResponseId) {
    return get(bunqMeTabResultResponseId, null, null, null);
  }

  public static BunqResponse<BunqMeTabResultResponse> get(Integer bunqMeTabResultResponseId, Integer monetaryAccountId) {
    return get(bunqMeTabResultResponseId, monetaryAccountId, null, null);
  }

  public static BunqResponse<BunqMeTabResultResponse> get(Integer bunqMeTabResultResponseId, Integer monetaryAccountId, Map<String, String> params) {
    return get(bunqMeTabResultResponseId, monetaryAccountId, params, null);
  }

  /**
   * The payment made for the bunq.me tab.
   */
  public Payment getPayment() {
    return this.payment;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.payment != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static BunqMeTabResultResponse fromJsonReader(JsonReader reader) {
    return fromJsonReader(BunqMeTabResultResponse.class, reader);
  }

}
