package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Pointer;
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
public class CurrencyConversionQuote extends BunqModel {

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
  private Amount amountSource;

  /**
   * The amount to convert to.
   */
  @Expose
  @SerializedName("amount_target")
  private Amount amountTarget;

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
  private Amount amountFieldForRequest;

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
  private Pointer counterpartyAliasFieldForRequest;

  /**
   * The status of the quote.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  public CurrencyConversionQuote() {
  this(null, null, null, null, null, null);
  }

  public CurrencyConversionQuote(Amount amount) {
  this(amount, null, null, null, null, null);
  }

  public CurrencyConversionQuote(Amount amount, String currencySource) {
  this(amount, currencySource, null, null, null, null);
  }

  public CurrencyConversionQuote(Amount amount, String currencySource, String currencyTarget) {
  this(amount, currencySource, currencyTarget, null, null, null);
  }

  public CurrencyConversionQuote(Amount amount, String currencySource, String currencyTarget, Pointer counterpartyAlias) {
  this(amount, currencySource, currencyTarget, counterpartyAlias, null, null);
  }

  public CurrencyConversionQuote(Amount amount, String currencySource, String currencyTarget, Pointer counterpartyAlias, String orderType) {
  this(amount, currencySource, currencyTarget, counterpartyAlias, orderType, null);
  }

  public CurrencyConversionQuote(Amount amount, String currencySource, String currencyTarget, Pointer counterpartyAlias, String orderType, String status) {
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
   * @param counterpartyAlias The Alias of the party we are transferring the money to.
   * @param orderType The type of the quote, SELL or BUY.
   * @param status The status of the quote.
   */
  public static BunqResponse<Integer> create(Amount amount, String currencySource, String currencyTarget, Pointer counterpartyAlias, Integer monetaryAccountId, String orderType, String status, Map<String, String> customHeaders) {
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

  public static BunqResponse<Integer> create(Amount amount) {
    return create(amount, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amount, String currencySource) {
    return create(amount, currencySource, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amount, String currencySource, String currencyTarget) {
    return create(amount, currencySource, currencyTarget, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amount, String currencySource, String currencyTarget, Pointer counterpartyAlias) {
    return create(amount, currencySource, currencyTarget, counterpartyAlias, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amount, String currencySource, String currencyTarget, Pointer counterpartyAlias, Integer monetaryAccountId) {
    return create(amount, currencySource, currencyTarget, counterpartyAlias, monetaryAccountId, null, null, null);
  }

  public static BunqResponse<Integer> create(Amount amount, String currencySource, String currencyTarget, Pointer counterpartyAlias, Integer monetaryAccountId, String orderType) {
    return create(amount, currencySource, currencyTarget, counterpartyAlias, monetaryAccountId, orderType, null, null);
  }

  public static BunqResponse<Integer> create(Amount amount, String currencySource, String currencyTarget, Pointer counterpartyAlias, Integer monetaryAccountId, String orderType, String status) {
    return create(amount, currencySource, currencyTarget, counterpartyAlias, monetaryAccountId, orderType, status, null);
  }

  /**
   */
  public static BunqResponse<CurrencyConversionQuote> get(Integer currencyConversionQuoteId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), currencyConversionQuoteId), params, customHeaders);

    return fromJson(CurrencyConversionQuote.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<CurrencyConversionQuote> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<CurrencyConversionQuote> get(Integer currencyConversionQuoteId) {
    return get(currencyConversionQuoteId, null, null, null);
  }

  public static BunqResponse<CurrencyConversionQuote> get(Integer currencyConversionQuoteId, Integer monetaryAccountId) {
    return get(currencyConversionQuoteId, monetaryAccountId, null, null);
  }

  public static BunqResponse<CurrencyConversionQuote> get(Integer currencyConversionQuoteId, Integer monetaryAccountId, Map<String, String> params) {
    return get(currencyConversionQuoteId, monetaryAccountId, params, null);
  }

  /**
   * @param status The status of the quote.
   */
  public static BunqResponse<CurrencyConversionQuote> update(Integer currencyConversionQuoteId, Integer monetaryAccountId, String status, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_STATUS, status);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), currencyConversionQuoteId), requestBytes, customHeaders);

    return fromJson(CurrencyConversionQuote.class, responseRaw, OBJECT_TYPE_PUT);
  }

  public static BunqResponse<CurrencyConversionQuote> update(Integer currencyConversionQuoteId) {
    return update(currencyConversionQuoteId, null, null, null);
  }

  public static BunqResponse<CurrencyConversionQuote> update(Integer currencyConversionQuoteId, Integer monetaryAccountId) {
    return update(currencyConversionQuoteId, monetaryAccountId, null, null);
  }

  public static BunqResponse<CurrencyConversionQuote> update(Integer currencyConversionQuoteId, Integer monetaryAccountId, String status) {
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
  public Amount getAmountSource() {
    return this.amountSource;
  }

  public void setAmountSource(Amount amountSource) {
    this.amountSource = amountSource;
  }

  /**
   * The amount to convert to.
   */
  public Amount getAmountTarget() {
    return this.amountTarget;
  }

  public void setAmountTarget(Amount amountTarget) {
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
  public static CurrencyConversionQuote fromJsonReader(JsonReader reader) {
    return fromJsonReader(CurrencyConversionQuote.class, reader);
  }

}
