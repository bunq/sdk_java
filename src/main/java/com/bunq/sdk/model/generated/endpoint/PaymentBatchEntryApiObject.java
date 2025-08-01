package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AmountObject;
import com.bunq.sdk.model.generated.object.ErrorObject;
import com.bunq.sdk.model.generated.object.PointerObject;
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
 * Manage entries inside of a payment batch.
 */
public class PaymentBatchEntryApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/payment-batch/%s/entry/%s";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/payment-batch/%s/entry/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_STATUS = "status";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "PaymentBatchEntry";

  /**
   * The ID of the monetary account from which the payment was made.
   */
  @Expose
  @SerializedName("monetary_account_id")
  private Long monetaryAccountId;

  /**
   * The ID of the Payment Batch Entry.
   */
  @Expose
  @SerializedName("payment_batch_id")
  private Long paymentBatchId;

  /**
   * The status of the Payment.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The amount.
   */
  @Expose
  @SerializedName("amount")
  private AmountObject amount;

  /**
   * The pointer to the party where the payment should be made to.
   */
  @Expose
  @SerializedName("counter_pointer")
  private PointerObject counterPointer;

  /**
   * The description for the Payment.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The payment, if it was made.
   */
  @Expose
  @SerializedName("payment")
  private PaymentApiObject payment;

  /**
   * The errors encountered while executing the payment.
   */
  @Expose
  @SerializedName("errors")
  private List<ErrorObject> errors;

  /**
   * The status of the payment batch, used to retry.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  public PaymentBatchEntryApiObject() {
  this(null);
  }

  public PaymentBatchEntryApiObject(String status) {
    this.statusFieldForRequest = status;
  }  /**
   */
  public static BunqResponse<PaymentBatchEntryApiObject> get(Long paymentBatchId, Long paymentBatchEntryId, Long monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), paymentBatchId, paymentBatchEntryId), params, customHeaders);

    return fromJson(PaymentBatchEntryApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<PaymentBatchEntryApiObject> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<PaymentBatchEntryApiObject> get(Long paymentBatchId) {
    return get(paymentBatchId, null, null, null, null);
  }

  public static BunqResponse<PaymentBatchEntryApiObject> get(Long paymentBatchId, Long paymentBatchEntryId) {
    return get(paymentBatchId, paymentBatchEntryId, null, null, null);
  }

  public static BunqResponse<PaymentBatchEntryApiObject> get(Long paymentBatchId, Long paymentBatchEntryId, Long monetaryAccountId) {
    return get(paymentBatchId, paymentBatchEntryId, monetaryAccountId, null, null);
  }

  public static BunqResponse<PaymentBatchEntryApiObject> get(Long paymentBatchId, Long paymentBatchEntryId, Long monetaryAccountId, Map<String, String> params) {
    return get(paymentBatchId, paymentBatchEntryId, monetaryAccountId, params, null);
  }

  /**
   * @param status The status of the payment batch, used to retry.
   */
  public static BunqResponse<Long> update(Long paymentBatchId, Long paymentBatchEntryId, Long monetaryAccountId, String status, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_STATUS, status);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), paymentBatchId, paymentBatchEntryId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Long> update(Long paymentBatchId) {
    return update(paymentBatchId, null, null, null, null);
  }

  public static BunqResponse<Long> update(Long paymentBatchId, Long paymentBatchEntryId) {
    return update(paymentBatchId, paymentBatchEntryId, null, null, null);
  }

  public static BunqResponse<Long> update(Long paymentBatchId, Long paymentBatchEntryId, Long monetaryAccountId) {
    return update(paymentBatchId, paymentBatchEntryId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Long> update(Long paymentBatchId, Long paymentBatchEntryId, Long monetaryAccountId, String status) {
    return update(paymentBatchId, paymentBatchEntryId, monetaryAccountId, status, null);
  }

  /**
   * The ID of the monetary account from which the payment was made.
   */
  public Long getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(Long monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   * The ID of the Payment Batch Entry.
   */
  public Long getPaymentBatchId() {
    return this.paymentBatchId;
  }

  public void setPaymentBatchId(Long paymentBatchId) {
    this.paymentBatchId = paymentBatchId;
  }

  /**
   * The status of the Payment.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The amount.
   */
  public AmountObject getAmount() {
    return this.amount;
  }

  public void setAmount(AmountObject amount) {
    this.amount = amount;
  }

  /**
   * The pointer to the party where the payment should be made to.
   */
  public PointerObject getCounterPointer() {
    return this.counterPointer;
  }

  public void setCounterPointer(PointerObject counterPointer) {
    this.counterPointer = counterPointer;
  }

  /**
   * The description for the Payment.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The payment, if it was made.
   */
  public PaymentApiObject getPayment() {
    return this.payment;
  }

  public void setPayment(PaymentApiObject payment) {
    this.payment = payment;
  }

  /**
   * The errors encountered while executing the payment.
   */
  public List<ErrorObject> getErrors() {
    return this.errors;
  }

  public void setErrors(List<ErrorObject> errors) {
    this.errors = errors;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.monetaryAccountId != null) {
      return false;
    }

    if (this.paymentBatchId != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.amount != null) {
      return false;
    }

    if (this.counterPointer != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.payment != null) {
      return false;
    }

    if (this.errors != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static PaymentBatchEntryApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(PaymentBatchEntryApiObject.class, reader);
  }

}
