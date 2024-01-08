package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
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
 * Manage a users automatic payment auto allocated settings.
 */
public class PaymentAutoAllocate extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/payment-auto-allocate";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/payment-auto-allocate/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/payment-auto-allocate";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/payment-auto-allocate/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/payment-auto-allocate/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_PAYMENT_ID = "payment_id";
  public static final String FIELD_TYPE = "type";
  public static final String FIELD_DEFINITION = "definition";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "PaymentAutoAllocate";

  /**
   * The id of the PaymentAutoAllocate.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp when the PaymentAutoAllocate was created.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp when the PaymentAutoAllocate was last updated.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The type.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The status.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The amount on which this payment auto allocate will be triggered.
   */
  @Expose
  @SerializedName("trigger_amount")
  private Amount triggerAmount;

  /**
   * DEPRECATED: superseded by `payment_original` and `payment_latest`
   */
  @Expose
  @SerializedName("payment")
  private Payment payment;

  /**
   * The payment that was used to define the triggers for this payment auto allocate.
   */
  @Expose
  @SerializedName("payment_original")
  private Payment paymentOriginal;

  /**
   * The latest payment allocated using this payment auto allocate.
   */
  @Expose
  @SerializedName("payment_latest")
  private Payment paymentLatest;

  /**
   * The payment that should be used to define the triggers for the payment auto allocate.
   */
  @Expose
  @SerializedName("payment_id_field_for_request")
  private Integer paymentIdFieldForRequest;

  /**
   * Whether a payment should be sorted ONCE or RECURRING.
   */
  @Expose
  @SerializedName("type_field_for_request")
  private String typeFieldForRequest;

  /**
   * The definition of how the money should be allocated.
   */
  @Expose
  @SerializedName("definition_field_for_request")
  private List<PaymentAutoAllocateDefinition> definitionFieldForRequest;

  public PaymentAutoAllocate() {
  this(null, null, null);
  }

  public PaymentAutoAllocate(Integer paymentId) {
  this(paymentId, null, null);
  }

  public PaymentAutoAllocate(Integer paymentId, String type) {
  this(paymentId, type, null);
  }

  public PaymentAutoAllocate(Integer paymentId, String type, List<PaymentAutoAllocateDefinition> definition) {
    this.paymentIdFieldForRequest = paymentId;
    this.typeFieldForRequest = type;
    this.definitionFieldForRequest = definition;
  }  /**
   * @param paymentId The payment that should be used to define the triggers for the payment auto
   * allocate.
   * @param type Whether a payment should be sorted ONCE or RECURRING.
   * @param definition The definition of how the money should be allocated.
   */
  public static BunqResponse<Integer> create(Integer paymentId, String type, List<PaymentAutoAllocateDefinition> definition, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_PAYMENT_ID, paymentId);
requestMap.put(FIELD_TYPE, type);
requestMap.put(FIELD_DEFINITION, definition);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer paymentId) {
    return create(paymentId, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer paymentId, String type) {
    return create(paymentId, type, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer paymentId, String type, List<PaymentAutoAllocateDefinition> definition) {
    return create(paymentId, type, definition, null, null);
  }

  public static BunqResponse<Integer> create(Integer paymentId, String type, List<PaymentAutoAllocateDefinition> definition, Integer monetaryAccountId) {
    return create(paymentId, type, definition, monetaryAccountId, null);
  }

  /**
   */
  public static BunqResponse<PaymentAutoAllocate> get(Integer paymentAutoAllocateId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), paymentAutoAllocateId), params, customHeaders);

    return fromJson(PaymentAutoAllocate.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<PaymentAutoAllocate> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<PaymentAutoAllocate> get(Integer paymentAutoAllocateId) {
    return get(paymentAutoAllocateId, null, null, null);
  }

  public static BunqResponse<PaymentAutoAllocate> get(Integer paymentAutoAllocateId, Integer monetaryAccountId) {
    return get(paymentAutoAllocateId, monetaryAccountId, null, null);
  }

  public static BunqResponse<PaymentAutoAllocate> get(Integer paymentAutoAllocateId, Integer monetaryAccountId, Map<String, String> params) {
    return get(paymentAutoAllocateId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<List<PaymentAutoAllocate>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(PaymentAutoAllocate.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<PaymentAutoAllocate>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<PaymentAutoAllocate>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<PaymentAutoAllocate>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   * @param definition The definition of how the money should be allocated.
   */
  public static BunqResponse<Integer> update(Integer paymentAutoAllocateId, Integer monetaryAccountId, List<PaymentAutoAllocateDefinition> definition, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_DEFINITION, definition);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), paymentAutoAllocateId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer paymentAutoAllocateId) {
    return update(paymentAutoAllocateId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer paymentAutoAllocateId, Integer monetaryAccountId) {
    return update(paymentAutoAllocateId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer paymentAutoAllocateId, Integer monetaryAccountId, List<PaymentAutoAllocateDefinition> definition) {
    return update(paymentAutoAllocateId, monetaryAccountId, definition, null);
  }

  /**
   */
  public static BunqResponse<PaymentAutoAllocate> delete(Integer paymentAutoAllocateId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), paymentAutoAllocateId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<PaymentAutoAllocate> delete(Integer paymentAutoAllocateId) {
    return delete(paymentAutoAllocateId, null, null);
  }

  public static BunqResponse<PaymentAutoAllocate> delete(Integer paymentAutoAllocateId, Integer monetaryAccountId) {
    return delete(paymentAutoAllocateId, monetaryAccountId, null);
  }

  /**
   * The id of the PaymentAutoAllocate.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp when the PaymentAutoAllocate was created.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp when the PaymentAutoAllocate was last updated.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The type.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The status.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The amount on which this payment auto allocate will be triggered.
   */
  public Amount getTriggerAmount() {
    return this.triggerAmount;
  }

  public void setTriggerAmount(Amount triggerAmount) {
    this.triggerAmount = triggerAmount;
  }

  /**
   * DEPRECATED: superseded by `payment_original` and `payment_latest`
   */
  public Payment getPayment() {
    return this.payment;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
  }

  /**
   * The payment that was used to define the triggers for this payment auto allocate.
   */
  public Payment getPaymentOriginal() {
    return this.paymentOriginal;
  }

  public void setPaymentOriginal(Payment paymentOriginal) {
    this.paymentOriginal = paymentOriginal;
  }

  /**
   * The latest payment allocated using this payment auto allocate.
   */
  public Payment getPaymentLatest() {
    return this.paymentLatest;
  }

  public void setPaymentLatest(Payment paymentLatest) {
    this.paymentLatest = paymentLatest;
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

    if (this.type != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.triggerAmount != null) {
      return false;
    }

    if (this.payment != null) {
      return false;
    }

    if (this.paymentOriginal != null) {
      return false;
    }

    if (this.paymentLatest != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static PaymentAutoAllocate fromJsonReader(JsonReader reader) {
    return fromJsonReader(PaymentAutoAllocate.class, reader);
  }

}
