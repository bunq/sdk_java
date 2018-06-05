package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

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
  @Expose
  @SerializedName("amount_field_for_request")
  private Amount amountFieldForRequest;

  /**
   * The duration for a budget restriction. Valid values are DAILY, WEEKLY, MONTHLY, YEARLY.
   */
  @Expose
  @SerializedName("frequency_field_for_request")
  private String frequencyFieldForRequest;

  public BudgetRestriction() {
    this(null, null);
  }

  public BudgetRestriction(Amount amount) {
    this(amount, null);
  }

  public BudgetRestriction(Amount amount, String frequency) {
    this.amountFieldForRequest = amount;
    this.frequencyFieldForRequest = frequency;
  }

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

  /**
   */
  public boolean isAllFieldNull() {
    if (this.amount != null) {
      return false;
    }

    if (this.frequency != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static BudgetRestriction fromJsonReader(JsonReader reader) {
    return fromJsonReader(BudgetRestriction.class, reader);
  }

}
