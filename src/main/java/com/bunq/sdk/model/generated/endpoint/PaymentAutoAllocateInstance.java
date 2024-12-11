package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Error;
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
 * List all the times a users payment was automatically allocated.
 */
public class PaymentAutoAllocateInstance extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/payment-auto-allocate/%s/instance";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/payment-auto-allocate/%s/instance/%s";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "PaymentAutoAllocateInstance";

  /**
   * The id of the PaymentAutoAllocateInstance.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp when the PaymentAutoAllocateInstance was created.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp when the PaymentAutoAllocateInstance was last updated.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The ID of the payment auto allocate this instance belongs to.
   */
  @Expose
  @SerializedName("payment_auto_allocate_id")
  private Integer paymentAutoAllocateId;

  /**
   * The status of the payment auto allocate instance. SUCCEEDED or FAILED.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The error message, if the payment auto allocating failed.
   */
  @Expose
  @SerializedName("error_message")
  private List<Error> errorMessage;

  /**
   * The payment batch allocating all the payments.
   */
  @Expose
  @SerializedName("payment_batch")
  private PaymentBatch paymentBatch;

  /**
   * The ID of the payment that triggered the allocating of the payments.
   */
  @Expose
  @SerializedName("payment_id")
  private Integer paymentId;

  /**
   * All Ginmon transaction orders executed with this instance.
   */
  @Expose
  @SerializedName("all_ginmon_transaction_order")
  private List<GinmonTransaction> allGinmonTransactionOrder;

  /**
   */
  public static BunqResponse<List<PaymentAutoAllocateInstance>> list(Integer paymentAutoAllocateId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), paymentAutoAllocateId), params, customHeaders);

    return fromJsonList(PaymentAutoAllocateInstance.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<PaymentAutoAllocateInstance>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<PaymentAutoAllocateInstance>> list(Integer paymentAutoAllocateId) {
    return list(paymentAutoAllocateId, null, null, null);
  }

  public static BunqResponse<List<PaymentAutoAllocateInstance>> list(Integer paymentAutoAllocateId, Integer monetaryAccountId) {
    return list(paymentAutoAllocateId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<PaymentAutoAllocateInstance>> list(Integer paymentAutoAllocateId, Integer monetaryAccountId, Map<String, String> params) {
    return list(paymentAutoAllocateId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<PaymentAutoAllocateInstance> get(Integer paymentAutoAllocateId, Integer paymentAutoAllocateInstanceId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), paymentAutoAllocateId, paymentAutoAllocateInstanceId), params, customHeaders);

    return fromJson(PaymentAutoAllocateInstance.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<PaymentAutoAllocateInstance> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<PaymentAutoAllocateInstance> get(Integer paymentAutoAllocateId) {
    return get(paymentAutoAllocateId, null, null, null, null);
  }

  public static BunqResponse<PaymentAutoAllocateInstance> get(Integer paymentAutoAllocateId, Integer paymentAutoAllocateInstanceId) {
    return get(paymentAutoAllocateId, paymentAutoAllocateInstanceId, null, null, null);
  }

  public static BunqResponse<PaymentAutoAllocateInstance> get(Integer paymentAutoAllocateId, Integer paymentAutoAllocateInstanceId, Integer monetaryAccountId) {
    return get(paymentAutoAllocateId, paymentAutoAllocateInstanceId, monetaryAccountId, null, null);
  }

  public static BunqResponse<PaymentAutoAllocateInstance> get(Integer paymentAutoAllocateId, Integer paymentAutoAllocateInstanceId, Integer monetaryAccountId, Map<String, String> params) {
    return get(paymentAutoAllocateId, paymentAutoAllocateInstanceId, monetaryAccountId, params, null);
  }

  /**
   * The id of the PaymentAutoAllocateInstance.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp when the PaymentAutoAllocateInstance was created.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp when the PaymentAutoAllocateInstance was last updated.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The ID of the payment auto allocate this instance belongs to.
   */
  public Integer getPaymentAutoAllocateId() {
    return this.paymentAutoAllocateId;
  }

  public void setPaymentAutoAllocateId(Integer paymentAutoAllocateId) {
    this.paymentAutoAllocateId = paymentAutoAllocateId;
  }

  /**
   * The status of the payment auto allocate instance. SUCCEEDED or FAILED.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The error message, if the payment auto allocating failed.
   */
  public List<Error> getErrorMessage() {
    return this.errorMessage;
  }

  public void setErrorMessage(List<Error> errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * The payment batch allocating all the payments.
   */
  public PaymentBatch getPaymentBatch() {
    return this.paymentBatch;
  }

  public void setPaymentBatch(PaymentBatch paymentBatch) {
    this.paymentBatch = paymentBatch;
  }

  /**
   * The ID of the payment that triggered the allocating of the payments.
   */
  public Integer getPaymentId() {
    return this.paymentId;
  }

  public void setPaymentId(Integer paymentId) {
    this.paymentId = paymentId;
  }

  /**
   * All Ginmon transaction orders executed with this instance.
   */
  public List<GinmonTransaction> getAllGinmonTransactionOrder() {
    return this.allGinmonTransactionOrder;
  }

  public void setAllGinmonTransactionOrder(List<GinmonTransaction> allGinmonTransactionOrder) {
    this.allGinmonTransactionOrder = allGinmonTransactionOrder;
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

    if (this.paymentAutoAllocateId != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.errorMessage != null) {
      return false;
    }

    if (this.paymentBatch != null) {
      return false;
    }

    if (this.paymentId != null) {
      return false;
    }

    if (this.allGinmonTransactionOrder != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static PaymentAutoAllocateInstance fromJsonReader(JsonReader reader) {
    return fromJsonReader(PaymentAutoAllocateInstance.class, reader);
  }

}
