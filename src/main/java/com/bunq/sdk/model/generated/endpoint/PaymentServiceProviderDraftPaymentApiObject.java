package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AmountObject;
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
 * Manage the PaymentServiceProviderDraftPayment's for a PISP.
 */
public class PaymentServiceProviderDraftPaymentApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/payment-service-provider-draft-payment";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/payment-service-provider-draft-payment/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/payment-service-provider-draft-payment";
  protected static final String ENDPOINT_URL_READ = "user/%s/payment-service-provider-draft-payment/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_SENDER_IBAN = "sender_iban";
  public static final String FIELD_SENDER_NAME = "sender_name";
  public static final String FIELD_COUNTERPARTY_IBAN = "counterparty_iban";
  public static final String FIELD_COUNTERPARTY_NAME = "counterparty_name";
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_AMOUNT = "amount";
  public static final String FIELD_STATUS = "status";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "PaymentServiceProviderDraftPayment";

  /**
   * The sender IBAN.
   */
  @Expose
  @SerializedName("sender_iban")
  private String senderIban;

  /**
   * The sender IBAN.
   */
  @Expose
  @SerializedName("receiver_iban")
  private String receiverIban;

  /**
   * The amount of the draft payment
   */
  @Expose
  @SerializedName("amount")
  private AmountObject amount;

  /**
   * The status of the draft payment
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The IBAN of the sender.
   */
  @Expose
  @SerializedName("sender_iban_field_for_request")
  private String senderIbanFieldForRequest;

  /**
   * The name of the sender.
   */
  @Expose
  @SerializedName("sender_name_field_for_request")
  private String senderNameFieldForRequest;

  /**
   * The IBAN of the counterparty.
   */
  @Expose
  @SerializedName("counterparty_iban_field_for_request")
  private String counterpartyIbanFieldForRequest;

  /**
   * The name of the counterparty.
   */
  @Expose
  @SerializedName("counterparty_name_field_for_request")
  private String counterpartyNameFieldForRequest;

  /**
   * Description of the payment.
   */
  @Expose
  @SerializedName("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The Amount to transfer with the Payment. Must be bigger than 0.
   */
  @Expose
  @SerializedName("amount_field_for_request")
  private AmountObject amountFieldForRequest;

  /**
   * The new status of the Draft Payment. Can only be set to REJECTED or CANCELLED by update.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  public PaymentServiceProviderDraftPaymentApiObject() {
  this(null, null, null, null, null, null, null);
  }

  public PaymentServiceProviderDraftPaymentApiObject(String senderIban) {
  this(senderIban, null, null, null, null, null, null);
  }

  public PaymentServiceProviderDraftPaymentApiObject(String senderIban, String counterpartyIban) {
  this(senderIban, counterpartyIban, null, null, null, null, null);
  }

  public PaymentServiceProviderDraftPaymentApiObject(String senderIban, String counterpartyIban, String counterpartyName) {
  this(senderIban, counterpartyIban, counterpartyName, null, null, null, null);
  }

  public PaymentServiceProviderDraftPaymentApiObject(String senderIban, String counterpartyIban, String counterpartyName, String description) {
  this(senderIban, counterpartyIban, counterpartyName, description, null, null, null);
  }

  public PaymentServiceProviderDraftPaymentApiObject(String senderIban, String counterpartyIban, String counterpartyName, String description, AmountObject amount) {
  this(senderIban, counterpartyIban, counterpartyName, description, amount, null, null);
  }

  public PaymentServiceProviderDraftPaymentApiObject(String senderIban, String counterpartyIban, String counterpartyName, String description, AmountObject amount, String senderName) {
  this(senderIban, counterpartyIban, counterpartyName, description, amount, senderName, null);
  }

  public PaymentServiceProviderDraftPaymentApiObject(String senderIban, String counterpartyIban, String counterpartyName, String description, AmountObject amount, String senderName, String status) {
    this.senderIbanFieldForRequest = senderIban;
    this.senderNameFieldForRequest = senderName;
    this.counterpartyIbanFieldForRequest = counterpartyIban;
    this.counterpartyNameFieldForRequest = counterpartyName;
    this.descriptionFieldForRequest = description;
    this.amountFieldForRequest = amount;
    this.statusFieldForRequest = status;
  }  /**
   * @param senderIban The IBAN of the sender.
   * @param counterpartyIban The IBAN of the counterparty.
   * @param counterpartyName The name of the counterparty.
   * @param description Description of the payment.
   * @param amount The Amount to transfer with the Payment. Must be bigger than 0.
   * @param senderName The name of the sender.
   * @param status The new status of the Draft Payment. Can only be set to REJECTED or CANCELLED
   * by update.
   */
  public static BunqResponse<Integer> create(String senderIban, String counterpartyIban, String counterpartyName, String description, AmountObject amount, String senderName, String status, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_SENDER_IBAN, senderIban);
requestMap.put(FIELD_SENDER_NAME, senderName);
requestMap.put(FIELD_COUNTERPARTY_IBAN, counterpartyIban);
requestMap.put(FIELD_COUNTERPARTY_NAME, counterpartyName);
requestMap.put(FIELD_DESCRIPTION, description);
requestMap.put(FIELD_AMOUNT, amount);
requestMap.put(FIELD_STATUS, status);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String senderIban) {
    return create(senderIban, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String senderIban, String counterpartyIban) {
    return create(senderIban, counterpartyIban, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String senderIban, String counterpartyIban, String counterpartyName) {
    return create(senderIban, counterpartyIban, counterpartyName, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String senderIban, String counterpartyIban, String counterpartyName, String description) {
    return create(senderIban, counterpartyIban, counterpartyName, description, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String senderIban, String counterpartyIban, String counterpartyName, String description, AmountObject amount) {
    return create(senderIban, counterpartyIban, counterpartyName, description, amount, null, null, null);
  }

  public static BunqResponse<Integer> create(String senderIban, String counterpartyIban, String counterpartyName, String description, AmountObject amount, String senderName) {
    return create(senderIban, counterpartyIban, counterpartyName, description, amount, senderName, null, null);
  }

  public static BunqResponse<Integer> create(String senderIban, String counterpartyIban, String counterpartyName, String description, AmountObject amount, String senderName, String status) {
    return create(senderIban, counterpartyIban, counterpartyName, description, amount, senderName, status, null);
  }

  /**
   * @param status The new status of the Draft Payment. Can only be set to REJECTED or CANCELLED
   * by update.
   */
  public static BunqResponse<Integer> update(Integer paymentServiceProviderDraftPaymentId, String status, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_STATUS, status);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), paymentServiceProviderDraftPaymentId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer paymentServiceProviderDraftPaymentId) {
    return update(paymentServiceProviderDraftPaymentId, null, null);
  }

  public static BunqResponse<Integer> update(Integer paymentServiceProviderDraftPaymentId, String status) {
    return update(paymentServiceProviderDraftPaymentId, status, null);
  }

  /**
   */
  public static BunqResponse<List<PaymentServiceProviderDraftPaymentApiObject>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(PaymentServiceProviderDraftPaymentApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<PaymentServiceProviderDraftPaymentApiObject>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<PaymentServiceProviderDraftPaymentApiObject>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   */
  public static BunqResponse<PaymentServiceProviderDraftPaymentApiObject> get(Integer paymentServiceProviderDraftPaymentId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), paymentServiceProviderDraftPaymentId), params, customHeaders);

    return fromJson(PaymentServiceProviderDraftPaymentApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<PaymentServiceProviderDraftPaymentApiObject> get() {
    return get(null, null, null);
  }

  public static BunqResponse<PaymentServiceProviderDraftPaymentApiObject> get(Integer paymentServiceProviderDraftPaymentId) {
    return get(paymentServiceProviderDraftPaymentId, null, null);
  }

  public static BunqResponse<PaymentServiceProviderDraftPaymentApiObject> get(Integer paymentServiceProviderDraftPaymentId, Map<String, String> params) {
    return get(paymentServiceProviderDraftPaymentId, params, null);
  }

  /**
   * The sender IBAN.
   */
  public String getSenderIban() {
    return this.senderIban;
  }

  public void setSenderIban(String senderIban) {
    this.senderIban = senderIban;
  }

  /**
   * The sender IBAN.
   */
  public String getReceiverIban() {
    return this.receiverIban;
  }

  public void setReceiverIban(String receiverIban) {
    this.receiverIban = receiverIban;
  }

  /**
   * The amount of the draft payment
   */
  public AmountObject getAmount() {
    return this.amount;
  }

  public void setAmount(AmountObject amount) {
    this.amount = amount;
  }

  /**
   * The status of the draft payment
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.senderIban != null) {
      return false;
    }

    if (this.receiverIban != null) {
      return false;
    }

    if (this.amount != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static PaymentServiceProviderDraftPaymentApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(PaymentServiceProviderDraftPaymentApiObject.class, reader);
  }

}
