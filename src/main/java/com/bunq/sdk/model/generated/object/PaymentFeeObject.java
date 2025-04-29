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
public class PaymentFeeObject extends BunqModel {

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
   * The id of the invoice related to possible payment fee.
   */
  @Expose
  @SerializedName("invoice_id")
  private Integer invoiceId;

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
   * The id of the invoice related to possible payment fee.
   */
  public Integer getInvoiceId() {
    return this.invoiceId;
  }

  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
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

    if (this.invoiceId != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static PaymentFeeObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(PaymentFeeObject.class, reader);
  }

}
