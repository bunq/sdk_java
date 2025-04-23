package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AmountObject;
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
 * Endpoint to create a quote for currency conversions.
 */
public class CurrencyConversionQuoteApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/currency-conversion-quote";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/currency-conversion-quote/%s";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/currency-conversion-quote/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_AMOUNT = "amount";
  public static final String FIELD_CURRENCY_SOURCE = "currency_source";
  public static final String FIELD_CURRENCY_TARGET = "currency_target";
  public static final String FIELD_ORDER_TYPE = "order_type";
  public static final String FIELD_COUNTERPARTY_ALIAS = "counterparty_alias";
  public static final String FIELD_STATUS = "status";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "CurrencyConversionQuote";
  protected static final String OBJECT_TYPE_PUT = "";

  /**
   * The id of the quote.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the quote's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the quote's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The status of the quote.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The amount to convert.
   */
  @Expose
  @SerializedName("amount_source")
  private AmountObject amountSource;

  /**
   * The amount to convert to.
   */
  @Expose
  @SerializedName("amount_target")
  private AmountObject amountTarget;

  /**
   * The conversion rate.
   */
  @Expose
  @SerializedName("rate")
  private String rate;

  /**
   * Timestamp for when this quote expires and the user should request a new one.
   */
  @Expose
  @SerializedName("time_expiry")
  private String timeExpiry;

  /**
   * The amount to convert.
   */
  @Expose
  @SerializedName("amount_field_for_request")
  private AmountObject amountFieldForRequest;

  /**
   * The currency we are converting.
   */
  @Expose
  @SerializedName("currency_source_field_for_request")
  private String currencySourceFieldForRequest;

  /**
   * The currency we are converting towards.
   */
  @Expose
  @SerializedName("currency_target_field_for_request")
  private String currencyTargetFieldForRequest;

  /**
   * The type of the quote, SELL or BUY.
   */
  @Expose
  @SerializedName("order_type_field_for_request")
  private String orderTypeFieldForRequest;

  /**
   * The Alias of the party we are transferring the money to.
   */
  @Expose
  @SerializedName("counterparty_alias_field_for_request")
  private PointerObject counterpartyAliasFieldForRequest;

  /**
   * The status of the quote.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  public CurrencyConversionQuoteApiObject() {
  this(null, null, null, null, null, null);
  }

  public CurrencyConversionQuoteApiObject(AmountObject amount) {
  this(amount, null, null, null, null, null);
  }

  public CurrencyConversionQuoteApiObject(AmountObject amount, String currencySource) {
  this(amount, currencySource, null, null, null, null);
  }

  public CurrencyConversionQuoteApiObject(AmountObject amount, String currencySource, String currencyTarget) {
  this(amount, currencySource, currencyTarget, null, null, null);
  }

  public CurrencyConversionQuoteApiObject(AmountObject amount, String currencySource, String currencyTarget, String orderType) {
  this(amount, currencySource, currencyTarget, orderType, null, null);
  }

  public CurrencyConversionQuoteApiObject(AmountObject amount, String currencySource, String currencyTarget, String orderType, PointerObject counterpartyAlias) {
  this(amount, currencySource, currencyTarget, orderType, counterpartyAlias, null);
  }

  public CurrencyConversionQuoteApiObject(AmountObject amount, String currencySource, String currencyTarget, String orderType, PointerObject counterpartyAlias, String status) {
    this.amountFieldForRequest = amount;
    this.currencySourceFieldForRequest = currencySource;
    this.currencyTargetFieldForRequest = currencyTarget;
    this.orderTypeFieldForRequest = orderType;
    this.counterpartyAliasFieldForRequest = counterpartyAlias;
    this.statusFieldForRequest = status;
  }  /**
   * @param amount The amount to convert.
   * @param currencySource The currency we are converting.
   * @param currencyTarget The currency we are converting towards.
   * @param orderType The type of the quote, SELL or BUY.
   * @param counterpartyAlias The Alias of the party we are transferring the money to.
   * @param status The status of the quote.
   */
  public static BunqResponse<Integer> create(AmountObject amount, String currencySource, String currencyTarget, String orderType, PointerObject counterpartyAlias, Integer monetaryAccountId, String status, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_AMOUNT, amount);
requestMap.put(FIELD_CURRENCY_SOURCE, currencySource);
requestMap.put(FIELD_CURRENCY_TARGET, currencyTarget);
requestMap.put(FIELD_ORDER_TYPE, orderType);
requestMap.put(FIELD_COUNTERPARTY_ALIAS, counterpartyAlias);
requestMap.put(FIELD_STATUS, status);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(AmountObject amount) {
    return create(amount, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(AmountObject amount, String currencySource) {
    return create(amount, currencySource, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(AmountObject amount, String currencySource, String currencyTarget) {
    return create(amount, currencySource, currencyTarget, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(AmountObject amount, String currencySource, String currencyTarget, String orderType) {
    return create(amount, currencySource, currencyTarget, orderType, null, null, null, null);
  }

  public static BunqResponse<Integer> create(AmountObject amount, String currencySource, String currencyTarget, String orderType, PointerObject counterpartyAlias) {
    return create(amount, currencySource, currencyTarget, orderType, counterpartyAlias, null, null, null);
  }

  public static BunqResponse<Integer> create(AmountObject amount, String currencySource, String currencyTarget, String orderType, PointerObject counterpartyAlias, Integer monetaryAccountId) {
    return create(amount, currencySource, currencyTarget, orderType, counterpartyAlias, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(AmountObject amount, String currencySource, String currencyTarget, String orderType, PointerObject counterpartyAlias, Integer monetaryAccountId, String status) {
    return create(amount, currencySource, currencyTarget, orderType, counterpartyAlias, monetaryAccountId, status, null);
  }

  /**
   */
  public static BunqResponse<CurrencyConversionQuoteApiObject> get(Integer currencyConversionQuoteId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), currencyConversionQuoteId), params, customHeaders);

    return fromJson(CurrencyConversionQuoteApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<CurrencyConversionQuoteApiObject> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<CurrencyConversionQuoteApiObject> get(Integer currencyConversionQuoteId) {
    return get(currencyConversionQuoteId, null, null, null);
  }

  public static BunqResponse<CurrencyConversionQuoteApiObject> get(Integer currencyConversionQuoteId, Integer monetaryAccountId) {
    return get(currencyConversionQuoteId, monetaryAccountId, null, null);
  }

  public static BunqResponse<CurrencyConversionQuoteApiObject> get(Integer currencyConversionQuoteId, Integer monetaryAccountId, Map<String, String> params) {
    return get(currencyConversionQuoteId, monetaryAccountId, params, null);
  }

  /**
   * @param status The status of the quote.
   */
  public static BunqResponse<CurrencyConversionQuoteApiObject> update(Integer currencyConversionQuoteId, Integer monetaryAccountId, String status, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_STATUS, status);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), currencyConversionQuoteId), requestBytes, customHeaders);

    return fromJson(CurrencyConversionQuoteApiObject.class, responseRaw, OBJECT_TYPE_PUT);
  }

  public static BunqResponse<CurrencyConversionQuoteApiObject> update(Integer currencyConversionQuoteId) {
    return update(currencyConversionQuoteId, null, null, null);
  }

  public static BunqResponse<CurrencyConversionQuoteApiObject> update(Integer currencyConversionQuoteId, Integer monetaryAccountId) {
    return update(currencyConversionQuoteId, monetaryAccountId, null, null);
  }

  public static BunqResponse<CurrencyConversionQuoteApiObject> update(Integer currencyConversionQuoteId, Integer monetaryAccountId, String status) {
    return update(currencyConversionQuoteId, monetaryAccountId, status, null);
  }

  /**
   * The id of the quote.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the quote's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the quote's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The status of the quote.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The amount to convert.
   */
  public AmountObject getAmountSource() {
    return this.amountSource;
  }

  public void setAmountSource(AmountObject amountSource) {
    this.amountSource = amountSource;
  }

  /**
   * The amount to convert to.
   */
  public AmountObject getAmountTarget() {
    return this.amountTarget;
  }

  public void setAmountTarget(AmountObject amountTarget) {
    this.amountTarget = amountTarget;
  }

  /**
   * The conversion rate.
   */
  public String getRate() {
    return this.rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  /**
   * Timestamp for when this quote expires and the user should request a new one.
   */
  public String getTimeExpiry() {
    return this.timeExpiry;
  }

  public void setTimeExpiry(String timeExpiry) {
    this.timeExpiry = timeExpiry;
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

    if (this.status != null) {
      return false;
    }

    if (this.amountSource != null) {
      return false;
    }

    if (this.amountTarget != null) {
      return false;
    }

    if (this.rate != null) {
      return false;
    }

    if (this.timeExpiry != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CurrencyConversionQuoteApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(CurrencyConversionQuoteApiObject.class, reader);
  }

}
