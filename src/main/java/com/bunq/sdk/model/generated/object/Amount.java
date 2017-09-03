package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 */
public class Amount extends BunqModel {

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

  public Amount(String value, String currency) {
    this.value = value;
    this.currency = currency;
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

}
