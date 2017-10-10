package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class BudgetRestriction extends BunqModel {

  /**
   * The amount of the budget given to the invited user.
   */
  @Expose
  @SerializedName("amount")
  private Amount amount;

  /**
   * The duration for a budget restriction. Valid values are DAILY, WEEKLY, MONTHLY, YEARLY.
   */
  @Expose
  @SerializedName("frequency")
  private String frequency;

  /**
   * The amount of the budget given to the invited user.
   */
  public Amount getAmount() {
    return this.amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  /**
   * The duration for a budget restriction. Valid values are DAILY, WEEKLY, MONTHLY, YEARLY.
   */
  public String getFrequency() {
    return this.frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

}
