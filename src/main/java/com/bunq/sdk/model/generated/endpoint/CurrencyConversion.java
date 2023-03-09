package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
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
 * Endpoint for managing currency conversions.
 */
public class CurrencyConversion extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/currency-conversion";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/currency-conversion/%s";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "CurrencyConversion";

  /**
   * The id of the conversion.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the conversion's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the conversion's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The status of the conversion.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The expected delivery date of the conversion.
   */
  @Expose
  @SerializedName("date_delivery_expected")
  private String dateDeliveryExpected;

  /**
   * The rate of the conversion.
   */
  @Expose
  @SerializedName("rate")
  private String rate;

  /**
   * The amount of the conversion.
   */
  @Expose
  @SerializedName("amount")
  private Amount amount;

  /**
   * The amount of the counter conversion.
   */
  @Expose
  @SerializedName("counter_amount")
  private Amount counterAmount;

  /**
   * The group uuid of the conversion.
   */
  @Expose
  @SerializedName("group_uuid")
  private String groupUuid;

  /**
   * The type of this conversion.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The order type, buying or selling.
   */
  @Expose
  @SerializedName("order_type")
  private String orderType;

  /**
   * The label of the monetary account.
   */
  @Expose
  @SerializedName("label_monetary_account")
  private LabelMonetaryAccount labelMonetaryAccount;

  /**
   * The label of the counter monetary account.
   */
  @Expose
  @SerializedName("counter_label_monetary_account")
  private LabelMonetaryAccount counterLabelMonetaryAccount;

  /**
   * The payment associated with this conversion.
   */
  @Expose
  @SerializedName("payment")
  private Payment payment;

  /**
   */
  public static BunqResponse<List<CurrencyConversion>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(CurrencyConversion.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<CurrencyConversion>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<CurrencyConversion>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<CurrencyConversion>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<CurrencyConversion> get(Integer currencyConversionId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), currencyConversionId), params, customHeaders);

    return fromJson(CurrencyConversion.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<CurrencyConversion> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<CurrencyConversion> get(Integer currencyConversionId) {
    return get(currencyConversionId, null, null, null);
  }

  public static BunqResponse<CurrencyConversion> get(Integer currencyConversionId, Integer monetaryAccountId) {
    return get(currencyConversionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<CurrencyConversion> get(Integer currencyConversionId, Integer monetaryAccountId, Map<String, String> params) {
    return get(currencyConversionId, monetaryAccountId, params, null);
  }

  /**
   * The id of the conversion.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the conversion's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the conversion's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The status of the conversion.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The expected delivery date of the conversion.
   */
  public String getDateDeliveryExpected() {
    return this.dateDeliveryExpected;
  }

  public void setDateDeliveryExpected(String dateDeliveryExpected) {
    this.dateDeliveryExpected = dateDeliveryExpected;
  }

  /**
   * The rate of the conversion.
   */
  public String getRate() {
    return this.rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  /**
   * The amount of the conversion.
   */
  public Amount getAmount() {
    return this.amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  /**
   * The amount of the counter conversion.
   */
  public Amount getCounterAmount() {
    return this.counterAmount;
  }

  public void setCounterAmount(Amount counterAmount) {
    this.counterAmount = counterAmount;
  }

  /**
   * The group uuid of the conversion.
   */
  public String getGroupUuid() {
    return this.groupUuid;
  }

  public void setGroupUuid(String groupUuid) {
    this.groupUuid = groupUuid;
  }

  /**
   * The type of this conversion.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The order type, buying or selling.
   */
  public String getOrderType() {
    return this.orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  /**
   * The label of the monetary account.
   */
  public LabelMonetaryAccount getLabelMonetaryAccount() {
    return this.labelMonetaryAccount;
  }

  public void setLabelMonetaryAccount(LabelMonetaryAccount labelMonetaryAccount) {
    this.labelMonetaryAccount = labelMonetaryAccount;
  }

  /**
   * The label of the counter monetary account.
   */
  public LabelMonetaryAccount getCounterLabelMonetaryAccount() {
    return this.counterLabelMonetaryAccount;
  }

  public void setCounterLabelMonetaryAccount(LabelMonetaryAccount counterLabelMonetaryAccount) {
    this.counterLabelMonetaryAccount = counterLabelMonetaryAccount;
  }

  /**
   * The payment associated with this conversion.
   */
  public Payment getPayment() {
    return this.payment;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
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

    if (this.dateDeliveryExpected != null) {
      return false;
    }

    if (this.rate != null) {
      return false;
    }

    if (this.amount != null) {
      return false;
    }

    if (this.counterAmount != null) {
      return false;
    }

    if (this.groupUuid != null) {
      return false;
    }

    if (this.type != null) {
      return false;
    }

    if (this.orderType != null) {
      return false;
    }

    if (this.labelMonetaryAccount != null) {
      return false;
    }

    if (this.counterLabelMonetaryAccount != null) {
      return false;
    }

    if (this.payment != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CurrencyConversion fromJsonReader(JsonReader reader) {
    return fromJsonReader(CurrencyConversion.class, reader);
  }

}
