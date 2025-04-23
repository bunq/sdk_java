package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class AmountObject extends BunqModel {

  /**
   * The amount formatted to two decimal places.
   */
  @Expose
  @SerializedName("value")
  private String value;

  /**
   * The currency of the amount. It is an ISO 4217 formatted currency code.
   */
  @Expose
  @SerializedName("currency")
  private String currency;

  /**
   * The amount formatted to two decimal places.
   */
  @Expose
  @SerializedName("value_field_for_request")
  private String valueFieldForRequest;

  /**
   * The currency of the amount. It is an ISO 4217 formatted currency code.
   */
  @Expose
  @SerializedName("currency_field_for_request")
  private String currencyFieldForRequest;

  public AmountObject() {
  this(null, null);
  }

  public AmountObject(String value) {
  this(value, null);
  }

  public AmountObject(String value, String currency) {
    this.valueFieldForRequest = value;
    this.currencyFieldForRequest = currency;
  }

  /**
   * The amount formatted to two decimal places.
   */
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /**
   * The currency of the amount. It is an ISO 4217 formatted currency code.
   */
  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.value != null) {
      return false;
    }

    if (this.currency != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static AmountObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(AmountObject.class, reader);
  }

}
