package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AmountObject;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccountObject;
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
 * The endpoint for payment service provider issuer transactions
 */
public class PaymentServiceProviderIssuerTransactionApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/payment-service-provider-issuer-transaction";
  protected static final String ENDPOINT_URL_READ = "user/%s/payment-service-provider-issuer-transaction/%s";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/payment-service-provider-issuer-transaction/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/payment-service-provider-issuer-transaction";

  /**
   * Field constants.
   */
  public static final String FIELD_COUNTERPARTY_ALIAS = "counterparty_alias";
  public static final String FIELD_AMOUNT = "amount";
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_URL_REDIRECT = "url_redirect";
  public static final String FIELD_TIME_EXPIRY = "time_expiry";
  public static final String FIELD_STATUS = "status";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "PaymentServiceProviderIssuerTransaction";

  /**
   * The id of this transaction.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The time this transaction was created.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The time this transaction was last updated.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The public uuid used to identify this transaction.
   */
  @Expose
  @SerializedName("public_uuid")
  private String publicUuid;

  /**
   * The counter party this transaction should be sent to.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private LabelMonetaryAccountObject counterpartyAlias;

  /**
   * The money amount of this transaction
   */
  @Expose
  @SerializedName("amount")
  private AmountObject amount;

  /**
   * The description of this transaction, to be shown to the user and to the counter party.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The url to which the user should be redirected once the transaction is accepted or rejected.
   */
  @Expose
  @SerializedName("url_redirect")
  private String urlRedirect;

  /**
   * The (optional) expiration time of the transaction. Defaults to 10 minutes.
   */
  @Expose
  @SerializedName("time_expiry")
  private String timeExpiry;

  /**
   * The status of the transaction. Can only be used for cancelling the transaction.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The monetary account this transaction is made from.
   */
  @Expose
  @SerializedName("alias")
  private LabelMonetaryAccountObject alias;

  /**
   * The counter party this transaction should be sent to.
   */
  @Expose
  @SerializedName("counterparty_alias_field_for_request")
  private PointerObject counterpartyAliasFieldForRequest;

  /**
   * The money amount of this transaction
   */
  @Expose
  @SerializedName("amount_field_for_request")
  private AmountObject amountFieldForRequest;

  /**
   * The description of this transaction, to be shown to the user and to the counter party.
   */
  @Expose
  @SerializedName("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The url to which the user should be redirected once the transaction is accepted or rejected.
   */
  @Expose
  @SerializedName("url_redirect_field_for_request")
  private String urlRedirectFieldForRequest;

  /**
   * The (optional) expiration time of the transaction. Defaults to 10 minutes.
   */
  @Expose
  @SerializedName("time_expiry_field_for_request")
  private String timeExpiryFieldForRequest;

  /**
   * The status of the transaction. Can only be used for cancelling the transaction.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  public PaymentServiceProviderIssuerTransactionApiObject() {
  this(null, null, null, null, null, null);
  }

  public PaymentServiceProviderIssuerTransactionApiObject(PointerObject counterpartyAlias) {
  this(counterpartyAlias, null, null, null, null, null);
  }

  public PaymentServiceProviderIssuerTransactionApiObject(PointerObject counterpartyAlias, AmountObject amount) {
  this(counterpartyAlias, amount, null, null, null, null);
  }

  public PaymentServiceProviderIssuerTransactionApiObject(PointerObject counterpartyAlias, AmountObject amount, String description) {
  this(counterpartyAlias, amount, description, null, null, null);
  }

  public PaymentServiceProviderIssuerTransactionApiObject(PointerObject counterpartyAlias, AmountObject amount, String description, String urlRedirect) {
  this(counterpartyAlias, amount, description, urlRedirect, null, null);
  }

  public PaymentServiceProviderIssuerTransactionApiObject(PointerObject counterpartyAlias, AmountObject amount, String description, String urlRedirect, String timeExpiry) {
  this(counterpartyAlias, amount, description, urlRedirect, timeExpiry, null);
  }

  public PaymentServiceProviderIssuerTransactionApiObject(PointerObject counterpartyAlias, AmountObject amount, String description, String urlRedirect, String timeExpiry, String status) {
    this.counterpartyAliasFieldForRequest = counterpartyAlias;
    this.amountFieldForRequest = amount;
    this.descriptionFieldForRequest = description;
    this.urlRedirectFieldForRequest = urlRedirect;
    this.timeExpiryFieldForRequest = timeExpiry;
    this.statusFieldForRequest = status;
  }  /**
   * @param counterpartyAlias The counter party this transaction should be sent to.
   * @param amount The money amount of this transaction
   * @param description The description of this transaction, to be shown to the user and to the
   * counter party.
   * @param urlRedirect The url to which the user should be redirected once the transaction is
   * accepted or rejected.
   * @param timeExpiry The (optional) expiration time of the transaction. Defaults to 10 minutes.
   * @param status The status of the transaction. Can only be used for cancelling the transaction.
   */
  public static BunqResponse<Integer> create(PointerObject counterpartyAlias, AmountObject amount, String description, String urlRedirect, String timeExpiry, String status, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_COUNTERPARTY_ALIAS, counterpartyAlias);
requestMap.put(FIELD_AMOUNT, amount);
requestMap.put(FIELD_DESCRIPTION, description);
requestMap.put(FIELD_URL_REDIRECT, urlRedirect);
requestMap.put(FIELD_TIME_EXPIRY, timeExpiry);
requestMap.put(FIELD_STATUS, status);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(PointerObject counterpartyAlias) {
    return create(counterpartyAlias, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(PointerObject counterpartyAlias, AmountObject amount) {
    return create(counterpartyAlias, amount, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(PointerObject counterpartyAlias, AmountObject amount, String description) {
    return create(counterpartyAlias, amount, description, null, null, null, null);
  }

  public static BunqResponse<Integer> create(PointerObject counterpartyAlias, AmountObject amount, String description, String urlRedirect) {
    return create(counterpartyAlias, amount, description, urlRedirect, null, null, null);
  }

  public static BunqResponse<Integer> create(PointerObject counterpartyAlias, AmountObject amount, String description, String urlRedirect, String timeExpiry) {
    return create(counterpartyAlias, amount, description, urlRedirect, timeExpiry, null, null);
  }

  public static BunqResponse<Integer> create(PointerObject counterpartyAlias, AmountObject amount, String description, String urlRedirect, String timeExpiry, String status) {
    return create(counterpartyAlias, amount, description, urlRedirect, timeExpiry, status, null);
  }

  /**
   */
  public static BunqResponse<PaymentServiceProviderIssuerTransactionApiObject> get(Integer paymentServiceProviderIssuerTransactionId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), paymentServiceProviderIssuerTransactionId), params, customHeaders);

    return fromJson(PaymentServiceProviderIssuerTransactionApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<PaymentServiceProviderIssuerTransactionApiObject> get() {
    return get(null, null, null);
  }

  public static BunqResponse<PaymentServiceProviderIssuerTransactionApiObject> get(Integer paymentServiceProviderIssuerTransactionId) {
    return get(paymentServiceProviderIssuerTransactionId, null, null);
  }

  public static BunqResponse<PaymentServiceProviderIssuerTransactionApiObject> get(Integer paymentServiceProviderIssuerTransactionId, Map<String, String> params) {
    return get(paymentServiceProviderIssuerTransactionId, params, null);
  }

  /**
   * @param status The status of the transaction. Can only be used for cancelling the transaction.
   */
  public static BunqResponse<Integer> update(Integer paymentServiceProviderIssuerTransactionId, String status, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_STATUS, status);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), paymentServiceProviderIssuerTransactionId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer paymentServiceProviderIssuerTransactionId) {
    return update(paymentServiceProviderIssuerTransactionId, null, null);
  }

  public static BunqResponse<Integer> update(Integer paymentServiceProviderIssuerTransactionId, String status) {
    return update(paymentServiceProviderIssuerTransactionId, status, null);
  }

  /**
   */
  public static BunqResponse<List<PaymentServiceProviderIssuerTransactionApiObject>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(PaymentServiceProviderIssuerTransactionApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<PaymentServiceProviderIssuerTransactionApiObject>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<PaymentServiceProviderIssuerTransactionApiObject>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The id of this transaction.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The time this transaction was created.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The time this transaction was last updated.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The public uuid used to identify this transaction.
   */
  public String getPublicUuid() {
    return this.publicUuid;
  }

  public void setPublicUuid(String publicUuid) {
    this.publicUuid = publicUuid;
  }

  /**
   * The counter party this transaction should be sent to.
   */
  public LabelMonetaryAccountObject getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(LabelMonetaryAccountObject counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * The money amount of this transaction
   */
  public AmountObject getAmount() {
    return this.amount;
  }

  public void setAmount(AmountObject amount) {
    this.amount = amount;
  }

  /**
   * The description of this transaction, to be shown to the user and to the counter party.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The url to which the user should be redirected once the transaction is accepted or rejected.
   */
  public String getUrlRedirect() {
    return this.urlRedirect;
  }

  public void setUrlRedirect(String urlRedirect) {
    this.urlRedirect = urlRedirect;
  }

  /**
   * The (optional) expiration time of the transaction. Defaults to 10 minutes.
   */
  public String getTimeExpiry() {
    return this.timeExpiry;
  }

  public void setTimeExpiry(String timeExpiry) {
    this.timeExpiry = timeExpiry;
  }

  /**
   * The status of the transaction. Can only be used for cancelling the transaction.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The monetary account this transaction is made from.
   */
  public LabelMonetaryAccountObject getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccountObject alias) {
    this.alias = alias;
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

    if (this.publicUuid != null) {
      return false;
    }

    if (this.counterpartyAlias != null) {
      return false;
    }

    if (this.amount != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.urlRedirect != null) {
      return false;
    }

    if (this.timeExpiry != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static PaymentServiceProviderIssuerTransactionApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(PaymentServiceProviderIssuerTransactionApiObject.class, reader);
  }

}
