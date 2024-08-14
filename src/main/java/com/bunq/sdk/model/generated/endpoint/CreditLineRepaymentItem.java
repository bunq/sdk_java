package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Line items in a credit line repayment.
 */
public class CreditLineRepaymentItem extends BunqModel {

  /**
   * The amount.
   */
  @Expose
  @SerializedName("amount")
  private Amount amount;

  /**
   * The amount.
   */
  public Amount getAmount() {
    return this.amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.amount != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CreditLineRepaymentItem fromJsonReader(JsonReader reader) {
    return fromJsonReader(CreditLineRepaymentItem.class, reader);
  }

}
