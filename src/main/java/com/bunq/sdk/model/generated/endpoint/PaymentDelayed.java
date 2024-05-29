package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.AnchorObjectInterface;
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
 * Payments that are not processed yet.
 */
public class PaymentDelayed extends BunqModel implements AnchorObjectInterface {

  /**
   * Error constants.
   */
  protected static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/payment-delayed/%s";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "PaymentDelayed";

  /**
   */
  @Expose
  @SerializedName("PaymentDelayedIncoming")
  private PaymentDelayedIncoming paymentDelayedIncoming;

  /**
   */
  public static BunqResponse<PaymentDelayed> get(Integer paymentDelayedId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), paymentDelayedId), params, customHeaders);

    return fromJson(PaymentDelayed.class, responseRaw);
  }

  public static BunqResponse<PaymentDelayed> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<PaymentDelayed> get(Integer paymentDelayedId) {
    return get(paymentDelayedId, null, null, null);
  }

  public static BunqResponse<PaymentDelayed> get(Integer paymentDelayedId, Integer monetaryAccountId) {
    return get(paymentDelayedId, monetaryAccountId, null, null);
  }

  public static BunqResponse<PaymentDelayed> get(Integer paymentDelayedId, Integer monetaryAccountId, Map<String, String> params) {
    return get(paymentDelayedId, monetaryAccountId, params, null);
  }

  /**
   */
  public PaymentDelayedIncoming getPaymentDelayedIncoming() {
    return this.paymentDelayedIncoming;
  }

  public void setPaymentDelayedIncoming(PaymentDelayedIncoming paymentDelayedIncoming) {
    this.paymentDelayedIncoming = paymentDelayedIncoming;
  }

  /**
   */
  public BunqModel getReferencedObject() {
    if (this.paymentDelayedIncoming != null) {
      return this.paymentDelayedIncoming;
    }

    throw new BunqException(ERROR_NULL_FIELDS);
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.paymentDelayedIncoming != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static PaymentDelayed fromJsonReader(JsonReader reader) {
    return fromJsonReader(PaymentDelayed.class, reader);
  }

}
