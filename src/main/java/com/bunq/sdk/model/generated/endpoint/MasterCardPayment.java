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
 * MasterCard transaction view.
 */
public class MasterCardPayment extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/mastercard-action/%s/payment";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "Payment";

  /**
   */
  public static BunqResponse<List<MasterCardPayment>> list(Integer mastercardActionId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), mastercardActionId), params, customHeaders);

    return fromJsonList(MasterCardPayment.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<MasterCardPayment>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<MasterCardPayment>> list(Integer mastercardActionId) {
    return list(mastercardActionId, null, null, null);
  }

  public static BunqResponse<List<MasterCardPayment>> list(Integer mastercardActionId, Integer monetaryAccountId) {
    return list(mastercardActionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<MasterCardPayment>> list(Integer mastercardActionId, Integer monetaryAccountId, Map<String, String> params) {
    return list(mastercardActionId, monetaryAccountId, params, null);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static MasterCardPayment fromJsonReader(JsonReader reader) {
    return fromJsonReader(MasterCardPayment.class, reader);
  }

}
