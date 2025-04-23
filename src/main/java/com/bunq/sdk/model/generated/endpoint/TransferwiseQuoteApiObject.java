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
 * Used to get quotes from Transferwise. These can be used to initiate payments.
 */
public class TransferwiseQuoteApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/transferwise-quote";
  protected static final String ENDPOINT_URL_READ = "user/%s/transferwise-quote/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_CURRENCY_SOURCE = "currency_source";
  public static final String FIELD_CURRENCY_TARGET = "currency_target";
  public static final String FIELD_AMOUNT_SOURCE = "amount_source";
  public static final String FIELD_AMOUNT_TARGET = "amount_target";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "TransferwiseQuote";

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
   * The expiration timestamp of the quote.
   */
  @Expose
  @SerializedName("time_expiry")
  private String timeExpiry;

  /**
   * The quote id Transferwise needs.
   */
  @Expose
  @SerializedName("quote_id")
  private String quoteId;

  /**
   * The source amount.
   */
  @Expose
  @SerializedName("amount_source")
  private AmountObject amountSource;

  /**
   * The target amount.
   */
  @Expose
  @SerializedName("amount_target")
  private AmountObject amountTarget;

  /**
   * The fee amount.
   */
  @Expose
  @SerializedName("amount_fee")
  private AmountObject amountFee;

  /**
   * The rate.
   */
  @Expose
  @SerializedName("rate")
  private String rate;

  /**
   * The estimated delivery time.
   */
  @Expose
  @SerializedName("time_delivery_estimate")
  private String timeDeliveryEstimate;

  /**
   * The source currency.
   */
  @Expose
  @SerializedName("currency_source_field_for_request")
  private String currencySourceFieldForRequest;

  /**
   * The target currency.
   */
  @Expose
  @SerializedName("currency_target_field_for_request")
  private String currencyTargetFieldForRequest;

  /**
   * The source amount. Required if target amount is left empty.
   */
  @Expose
  @SerializedName("amount_source_field_for_request")
  private AmountObject amountSourceFieldForRequest;

  /**
   * The target amount. Required if source amount is left empty.
   */
  @Expose
  @SerializedName("amount_target_field_for_request")
  private AmountObject amountTargetFieldForRequest;

  public TransferwiseQuoteApiObject() {
  this(null, null, null, null);
  }

  public TransferwiseQuoteApiObject(String currencySource) {
  this(currencySource, null, null, null);
  }

  public TransferwiseQuoteApiObject(String currencySource, String currencyTarget) {
  this(currencySource, currencyTarget, null, null);
  }

  public TransferwiseQuoteApiObject(String currencySource, String currencyTarget, AmountObject amountSource) {
  this(currencySource, currencyTarget, amountSource, null);
  }

  public TransferwiseQuoteApiObject(String currencySource, String currencyTarget, AmountObject amountSource, AmountObject amountTarget) {
    this.currencySourceFieldForRequest = currencySource;
    this.currencyTargetFieldForRequest = currencyTarget;
    this.amountSourceFieldForRequest = amountSource;
    this.amountTargetFieldForRequest = amountTarget;
  }  /**
   * @param currencySource The source currency.
   * @param currencyTarget The target currency.
   * @param amountSource The source amount. Required if target amount is left empty.
   * @param amountTarget The target amount. Required if source amount is left empty.
   */
  public static BunqResponse<Integer> create(String currencySource, String currencyTarget, AmountObject amountSource, AmountObject amountTarget, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_CURRENCY_SOURCE, currencySource);
requestMap.put(FIELD_CURRENCY_TARGET, currencyTarget);
requestMap.put(FIELD_AMOUNT_SOURCE, amountSource);
requestMap.put(FIELD_AMOUNT_TARGET, amountTarget);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String currencySource) {
    return create(currencySource, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String currencySource, String currencyTarget) {
    return create(currencySource, currencyTarget, null, null, null);
  }

  public static BunqResponse<Integer> create(String currencySource, String currencyTarget, AmountObject amountSource) {
    return create(currencySource, currencyTarget, amountSource, null, null);
  }

  public static BunqResponse<Integer> create(String currencySource, String currencyTarget, AmountObject amountSource, AmountObject amountTarget) {
    return create(currencySource, currencyTarget, amountSource, amountTarget, null);
  }

  /**
   */
  public static BunqResponse<TransferwiseQuoteApiObject> get(Integer transferwiseQuoteId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), transferwiseQuoteId), params, customHeaders);

    return fromJson(TransferwiseQuoteApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<TransferwiseQuoteApiObject> get() {
    return get(null, null, null);
  }

  public static BunqResponse<TransferwiseQuoteApiObject> get(Integer transferwiseQuoteId) {
    return get(transferwiseQuoteId, null, null);
  }

  public static BunqResponse<TransferwiseQuoteApiObject> get(Integer transferwiseQuoteId, Map<String, String> params) {
    return get(transferwiseQuoteId, params, null);
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
   * The expiration timestamp of the quote.
   */
  public String getTimeExpiry() {
    return this.timeExpiry;
  }

  public void setTimeExpiry(String timeExpiry) {
    this.timeExpiry = timeExpiry;
  }

  /**
   * The quote id Transferwise needs.
   */
  public String getQuoteId() {
    return this.quoteId;
  }

  public void setQuoteId(String quoteId) {
    this.quoteId = quoteId;
  }

  /**
   * The source amount.
   */
  public AmountObject getAmountSource() {
    return this.amountSource;
  }

  public void setAmountSource(AmountObject amountSource) {
    this.amountSource = amountSource;
  }

  /**
   * The target amount.
   */
  public AmountObject getAmountTarget() {
    return this.amountTarget;
  }

  public void setAmountTarget(AmountObject amountTarget) {
    this.amountTarget = amountTarget;
  }

  /**
   * The fee amount.
   */
  public AmountObject getAmountFee() {
    return this.amountFee;
  }

  public void setAmountFee(AmountObject amountFee) {
    this.amountFee = amountFee;
  }

  /**
   * The rate.
   */
  public String getRate() {
    return this.rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  /**
   * The estimated delivery time.
   */
  public String getTimeDeliveryEstimate() {
    return this.timeDeliveryEstimate;
  }

  public void setTimeDeliveryEstimate(String timeDeliveryEstimate) {
    this.timeDeliveryEstimate = timeDeliveryEstimate;
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

    if (this.timeExpiry != null) {
      return false;
    }

    if (this.quoteId != null) {
      return false;
    }

    if (this.amountSource != null) {
      return false;
    }

    if (this.amountTarget != null) {
      return false;
    }

    if (this.amountFee != null) {
      return false;
    }

    if (this.rate != null) {
      return false;
    }

    if (this.timeDeliveryEstimate != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static TransferwiseQuoteApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(TransferwiseQuoteApiObject.class, reader);
  }

}
