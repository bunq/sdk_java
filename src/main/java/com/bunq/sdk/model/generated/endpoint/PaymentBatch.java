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
 * Create a payment batch, or show the payment batches of a monetary account.
 */
public class PaymentBatch extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/payment-batch";
  private static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/payment-batch/%s";
  private static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/payment-batch/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/payment-batch";

  /**
   * Field constants.
   */
  public static final String FIELD_PAYMENTS = "payments";
  public static final String FIELD_BUNQTO_STATUS = "bunqto_status";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "PaymentBatch";

  /**
   * The list of mutations that were made.
   */
  @Expose
  @SerializedName("payments")
  private List<Payment> payments;

  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId) {
    return create(apiContext, requestMap, userId, monetaryAccountId, new HashMap<>());
  }

  /**
   * Create a payment batch by sending an array of single payment objects, that will become part
   * of the batch.
   */
  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, userId, monetaryAccountId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer paymentBatchId) {
    return update(apiContext, requestMap, userId, monetaryAccountId, paymentBatchId, new HashMap<>());
  }

  /**
   * Revoke a bunq.to payment batch. The status of all the payments will be set to REVOKED.
   */
  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer paymentBatchId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, userId, monetaryAccountId, paymentBatchId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<PaymentBatch> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer paymentBatchId) {
    return get(apiContext, userId, monetaryAccountId, paymentBatchId, new HashMap<>());
  }

  /**
   * Return the details of a specific payment batch.
   */
  public static BunqResponse<PaymentBatch> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer paymentBatchId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userId, monetaryAccountId, paymentBatchId), new HashMap<>(), customHeaders);

    return fromJson(PaymentBatch.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<List<PaymentBatch>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId) {
    return list(apiContext, userId, monetaryAccountId, new HashMap<>());
  }

  public static BunqResponse<List<PaymentBatch>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Map<String, String> params) {
    return list(apiContext, userId, monetaryAccountId, params, new HashMap<>());
  }

  /**
   * Return all the payment batches for a monetary account.
   */
  public static BunqResponse<List<PaymentBatch>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId), params, customHeaders);

    return fromJsonList(PaymentBatch.class, responseRaw, OBJECT_TYPE);
  }

  /**
   * The list of mutations that were made.
   */
  public List<Payment> getPayments() {
    return this.payments;
  }

  public void setPayments(List<Payment> payments) {
    this.payments = payments;
  }

  /**
   */
  public boolean areAllFieldNull() {
    if (this.payments != null) {
      return false;
    }

    return true;
  }

}
