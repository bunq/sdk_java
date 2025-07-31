package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AmountObject;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccountObject;
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
 * Create a payment batch, or show the payment batches of a monetary account.
 */
public class PaymentBatchApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/payment-batch";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/payment-batch/%s";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/payment-batch/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/payment-batch";

  /**
   * Field constants.
   */
  public static final String FIELD_PAYMENTS = "payments";
  public static final String FIELD_EXECUTION_TYPE = "execution_type";
  public static final String FIELD_STATUS = "status";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "PaymentBatch";

  /**
   * The ID of the monetary account that this payment batch belongs to.
   */
  @Expose
  @SerializedName("monetary_account_id")
  private Long monetaryAccountId;

  /**
   * Whether the payment batch should be executed synchronously or asynchronously.
   */
  @Expose
  @SerializedName("execution_type")
  private String executionType;

  /**
   * The status of the payment batch.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The label to display for the monetary account.
   */
  @Expose
  @SerializedName("label")
  private LabelMonetaryAccountObject label;

  /**
   * The total amount of the payment batch.
   */
  @Expose
  @SerializedName("amount_total")
  private AmountObject amountTotal;

  /**
   * The total amount of the successful payments in the batch.
   */
  @Expose
  @SerializedName("amount_successful")
  private AmountObject amountSuccessful;

  /**
   * The ID of the latest event for the payment batch.
   */
  @Expose
  @SerializedName("event_id")
  private Long eventId;

  /**
   * The list of mutations that were made.
   */
  @Expose
  @SerializedName("payments")
  private List<PaymentApiObject> payments;

  /**
   * The entries that are part of this batch.
   */
  @Expose
  @SerializedName("entries")
  private List<PaymentBatchEntryApiObject> entries;

  /**
   * The list of payments we want to send in a single batch.
   */
  @Expose
  @SerializedName("payments_field_for_request")
  private List<PaymentApiObject> paymentsFieldForRequest;

  /**
   * Whether the payment batch should be executed synchronously or asynchronously.
   */
  @Expose
  @SerializedName("execution_type_field_for_request")
  private String executionTypeFieldForRequest;

  /**
   * The status of the payment batch, used to retry failed payments.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  public PaymentBatchApiObject() {
  this(null, null, null);
  }

  public PaymentBatchApiObject(List<PaymentApiObject> payments) {
  this(payments, null, null);
  }

  public PaymentBatchApiObject(List<PaymentApiObject> payments, String executionType) {
  this(payments, executionType, null);
  }

  public PaymentBatchApiObject(List<PaymentApiObject> payments, String executionType, String status) {
    this.paymentsFieldForRequest = payments;
    this.executionTypeFieldForRequest = executionType;
    this.statusFieldForRequest = status;
  }  /**
   * Create a payment batch by sending an array of single payment objects, that will become part
   * of the batch.
   * @param payments The list of payments we want to send in a single batch.
   * @param executionType Whether the payment batch should be executed synchronously or
   * asynchronously.
   * @param status The status of the payment batch, used to retry failed payments.
   */
  public static BunqResponse<Long> create(List<PaymentApiObject> payments, Long monetaryAccountId, String executionType, String status, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_PAYMENTS, payments);
requestMap.put(FIELD_EXECUTION_TYPE, executionType);
requestMap.put(FIELD_STATUS, status);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Long> create() {
    return create(null, null, null, null, null);
  }

  public static BunqResponse<Long> create(List<PaymentApiObject> payments) {
    return create(payments, null, null, null, null);
  }

  public static BunqResponse<Long> create(List<PaymentApiObject> payments, Long monetaryAccountId) {
    return create(payments, monetaryAccountId, null, null, null);
  }

  public static BunqResponse<Long> create(List<PaymentApiObject> payments, Long monetaryAccountId, String executionType) {
    return create(payments, monetaryAccountId, executionType, null, null);
  }

  public static BunqResponse<Long> create(List<PaymentApiObject> payments, Long monetaryAccountId, String executionType, String status) {
    return create(payments, monetaryAccountId, executionType, status, null);
  }

  /**
   * Revoke a bunq.to payment batch. The status of all the payments will be set to REVOKED.
   * @param status The status of the payment batch, used to retry failed payments.
   */
  public static BunqResponse<Long> update(Long paymentBatchId, Long monetaryAccountId, String status, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_STATUS, status);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), paymentBatchId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Long> update(Long paymentBatchId) {
    return update(paymentBatchId, null, null, null);
  }

  public static BunqResponse<Long> update(Long paymentBatchId, Long monetaryAccountId) {
    return update(paymentBatchId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Long> update(Long paymentBatchId, Long monetaryAccountId, String status) {
    return update(paymentBatchId, monetaryAccountId, status, null);
  }

  /**
   * Return the details of a specific payment batch.
   */
  public static BunqResponse<PaymentBatchApiObject> get(Long paymentBatchId, Long monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), paymentBatchId), params, customHeaders);

    return fromJson(PaymentBatchApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<PaymentBatchApiObject> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<PaymentBatchApiObject> get(Long paymentBatchId) {
    return get(paymentBatchId, null, null, null);
  }

  public static BunqResponse<PaymentBatchApiObject> get(Long paymentBatchId, Long monetaryAccountId) {
    return get(paymentBatchId, monetaryAccountId, null, null);
  }

  public static BunqResponse<PaymentBatchApiObject> get(Long paymentBatchId, Long monetaryAccountId, Map<String, String> params) {
    return get(paymentBatchId, monetaryAccountId, params, null);
  }

  /**
   * Return all the payment batches for a monetary account.
   */
  public static BunqResponse<List<PaymentBatchApiObject>> list(Long monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(PaymentBatchApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<PaymentBatchApiObject>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<PaymentBatchApiObject>> list(Long monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<PaymentBatchApiObject>> list(Long monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   * The ID of the monetary account that this payment batch belongs to.
   */
  public Long getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(Long monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   * Whether the payment batch should be executed synchronously or asynchronously.
   */
  public String getExecutionType() {
    return this.executionType;
  }

  public void setExecutionType(String executionType) {
    this.executionType = executionType;
  }

  /**
   * The status of the payment batch.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The label to display for the monetary account.
   */
  public LabelMonetaryAccountObject getLabel() {
    return this.label;
  }

  public void setLabel(LabelMonetaryAccountObject label) {
    this.label = label;
  }

  /**
   * The total amount of the payment batch.
   */
  public AmountObject getAmountTotal() {
    return this.amountTotal;
  }

  public void setAmountTotal(AmountObject amountTotal) {
    this.amountTotal = amountTotal;
  }

  /**
   * The total amount of the successful payments in the batch.
   */
  public AmountObject getAmountSuccessful() {
    return this.amountSuccessful;
  }

  public void setAmountSuccessful(AmountObject amountSuccessful) {
    this.amountSuccessful = amountSuccessful;
  }

  /**
   * The ID of the latest event for the payment batch.
   */
  public Long getEventId() {
    return this.eventId;
  }

  public void setEventId(Long eventId) {
    this.eventId = eventId;
  }

  /**
   * The list of mutations that were made.
   */
  public List<PaymentApiObject> getPayments() {
    return this.payments;
  }

  public void setPayments(List<PaymentApiObject> payments) {
    this.payments = payments;
  }

  /**
   * The entries that are part of this batch.
   */
  public List<PaymentBatchEntryApiObject> getEntries() {
    return this.entries;
  }

  public void setEntries(List<PaymentBatchEntryApiObject> entries) {
    this.entries = entries;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.monetaryAccountId != null) {
      return false;
    }

    if (this.executionType != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.label != null) {
      return false;
    }

    if (this.amountTotal != null) {
      return false;
    }

    if (this.amountSuccessful != null) {
      return false;
    }

    if (this.eventId != null) {
      return false;
    }

    if (this.payments != null) {
      return false;
    }

    if (this.entries != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static PaymentBatchApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(PaymentBatchApiObject.class, reader);
  }

}
