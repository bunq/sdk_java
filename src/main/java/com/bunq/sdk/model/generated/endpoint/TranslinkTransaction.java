package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Error;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.bunq.sdk.model.generated.object.PaymentBatchAnchoredPayment;
import com.bunq.sdk.model.generated.object.TranslinkTransactionEntry;
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
 * Used to create translink transactions.
 */
public class TranslinkTransaction extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/translink-transaction";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/translink-transaction/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/translink-transaction";

  /**
   * Field constants.
   */
  public static final String FIELD_TYPE = "type";
  public static final String FIELD_REFERENCE = "reference";
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_PAYMENTS = "payments";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "TranslinkTransaction";

  /**
   * Type of transaction, can be TRIP, REFUND, WITHDRAWAL or TOP_UP.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The status of the transaction. Can be CREATED, SETTLED or FAILED.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The reason why the transaction FAILED processing.
   */
  @Expose
  @SerializedName("failure_reason")
  private List<Error> failureReason;

  /**
   * The list of mutations that were made.
   */
  @Expose
  @SerializedName("payments")
  private PaymentBatchAnchoredPayment payments;

  /**
   * The list of entries in the transaction.
   */
  @Expose
  @SerializedName("entries")
  private List<TranslinkTransactionEntry> entries;

  /**
   * The total amount of the transaction.
   */
  @Expose
  @SerializedName("amount")
  private Amount amount;

  /**
   * The LabelMonetaryAccount containing the public information of 'this' (party) side of the
   * Payment.
   */
  @Expose
  @SerializedName("alias")
  private LabelMonetaryAccount alias;

  /**
   * The request reference.
   */
  @Expose
  @SerializedName("reference")
  private String reference;

  /**
   * Description of the payment request.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * Type of transaction, can be TRIP, REFUND, WITHDRAWAL or TOP_UP.
   */
  @Expose
  @SerializedName("type_field_for_request")
  private String typeFieldForRequest;

  /**
   * The request reference.
   */
  @Expose
  @SerializedName("reference_field_for_request")
  private String referenceFieldForRequest;

  /**
   * Description of the payment request.
   */
  @Expose
  @SerializedName("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The list of payments we want to send in a single transaction.
   */
  @Expose
  @SerializedName("payments_field_for_request")
  private List<Payment> paymentsFieldForRequest;

  public TranslinkTransaction() {
  this(null, null, null, null);
  }

  public TranslinkTransaction(String type) {
  this(type, null, null, null);
  }

  public TranslinkTransaction(String type, String reference) {
  this(type, reference, null, null);
  }

  public TranslinkTransaction(String type, String reference, String description) {
  this(type, reference, description, null);
  }

  public TranslinkTransaction(String type, String reference, String description, List<Payment> payments) {
    this.typeFieldForRequest = type;
    this.referenceFieldForRequest = reference;
    this.descriptionFieldForRequest = description;
    this.paymentsFieldForRequest = payments;
  }  /**
   * @param type Type of transaction, can be TRIP, REFUND, WITHDRAWAL or TOP_UP.
   * @param reference The request reference.
   * @param description Description of the payment request.
   * @param payments The list of payments we want to send in a single transaction.
   */
  public static BunqResponse<Integer> create(String type, String reference, String description, List<Payment> payments, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_TYPE, type);
requestMap.put(FIELD_REFERENCE, reference);
requestMap.put(FIELD_DESCRIPTION, description);
requestMap.put(FIELD_PAYMENTS, payments);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String type) {
    return create(type, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String type, String reference) {
    return create(type, reference, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String type, String reference, String description) {
    return create(type, reference, description, null, null, null);
  }

  public static BunqResponse<Integer> create(String type, String reference, String description, List<Payment> payments) {
    return create(type, reference, description, payments, null, null);
  }

  public static BunqResponse<Integer> create(String type, String reference, String description, List<Payment> payments, Integer monetaryAccountId) {
    return create(type, reference, description, payments, monetaryAccountId, null);
  }

  /**
   */
  public static BunqResponse<TranslinkTransaction> get(Integer translinkTransactionId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), translinkTransactionId), params, customHeaders);

    return fromJson(TranslinkTransaction.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<TranslinkTransaction> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<TranslinkTransaction> get(Integer translinkTransactionId) {
    return get(translinkTransactionId, null, null, null);
  }

  public static BunqResponse<TranslinkTransaction> get(Integer translinkTransactionId, Integer monetaryAccountId) {
    return get(translinkTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<TranslinkTransaction> get(Integer translinkTransactionId, Integer monetaryAccountId, Map<String, String> params) {
    return get(translinkTransactionId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<List<TranslinkTransaction>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(TranslinkTransaction.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<TranslinkTransaction>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<TranslinkTransaction>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<TranslinkTransaction>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   * Type of transaction, can be TRIP, REFUND, WITHDRAWAL or TOP_UP.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The status of the transaction. Can be CREATED, SETTLED or FAILED.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The reason why the transaction FAILED processing.
   */
  public List<Error> getFailureReason() {
    return this.failureReason;
  }

  public void setFailureReason(List<Error> failureReason) {
    this.failureReason = failureReason;
  }

  /**
   * The list of mutations that were made.
   */
  public PaymentBatchAnchoredPayment getPayments() {
    return this.payments;
  }

  public void setPayments(PaymentBatchAnchoredPayment payments) {
    this.payments = payments;
  }

  /**
   * The list of entries in the transaction.
   */
  public List<TranslinkTransactionEntry> getEntries() {
    return this.entries;
  }

  public void setEntries(List<TranslinkTransactionEntry> entries) {
    this.entries = entries;
  }

  /**
   * The total amount of the transaction.
   */
  public Amount getAmount() {
    return this.amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  /**
   * The LabelMonetaryAccount containing the public information of 'this' (party) side of the
   * Payment.
   */
  public LabelMonetaryAccount getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccount alias) {
    this.alias = alias;
  }

  /**
   * The request reference.
   */
  public String getReference() {
    return this.reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * Description of the payment request.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.type != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.failureReason != null) {
      return false;
    }

    if (this.payments != null) {
      return false;
    }

    if (this.entries != null) {
      return false;
    }

    if (this.amount != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.reference != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static TranslinkTransaction fromJsonReader(JsonReader reader) {
    return fromJsonReader(TranslinkTransaction.class, reader);
  }

}
