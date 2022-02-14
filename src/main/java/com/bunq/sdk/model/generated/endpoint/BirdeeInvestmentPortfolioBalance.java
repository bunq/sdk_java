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
 * Endpoint for interacting with the birdee investment portfolio balance..
 */
public class BirdeeInvestmentPortfolioBalance extends BunqModel {

  /**
   * The current valuation of the portfolio, minus any amount pending withdrawal.
   */
  @Expose
  @SerializedName("amount_available")
  private Amount amountAvailable;

  /**
   * The total amount deposited.
   */
  @Expose
  @SerializedName("amount_deposit_total")
  private Amount amountDepositTotal;

  /**
   * The total amount withdrawn.
   */
  @Expose
  @SerializedName("amount_withdrawal_total")
  private Amount amountWithdrawalTotal;

  /**
   * The total fee amount.
   */
  @Expose
  @SerializedName("amount_fee_total")
  private Amount amountFeeTotal;

  /**
   * The difference between the netto deposited amount and the current valuation.
   */
  @Expose
  @SerializedName("amount_profit")
  private Amount amountProfit;

  /**
   * The amount that's sent to Birdee, but pending investment on the portfolio.
   */
  @Expose
  @SerializedName("amount_deposit_pending")
  private Amount amountDepositPending;

  /**
   * The amount that's sent to Birdee, but pending withdrawal.
   */
  @Expose
  @SerializedName("amount_withdrawal_pending")
  private Amount amountWithdrawalPending;

  /**
   * The current valuation of the portfolio, minus any amount pending withdrawal.
   */
  public Amount getAmountAvailable() {
    return this.amountAvailable;
  }

  public void setAmountAvailable(Amount amountAvailable) {
    this.amountAvailable = amountAvailable;
  }

  /**
   * The total amount deposited.
   */
  public Amount getAmountDepositTotal() {
    return this.amountDepositTotal;
  }

  public void setAmountDepositTotal(Amount amountDepositTotal) {
    this.amountDepositTotal = amountDepositTotal;
  }

  /**
   * The total amount withdrawn.
   */
  public Amount getAmountWithdrawalTotal() {
    return this.amountWithdrawalTotal;
  }

  public void setAmountWithdrawalTotal(Amount amountWithdrawalTotal) {
    this.amountWithdrawalTotal = amountWithdrawalTotal;
  }

  /**
   * The total fee amount.
   */
  public Amount getAmountFeeTotal() {
    return this.amountFeeTotal;
  }

  public void setAmountFeeTotal(Amount amountFeeTotal) {
    this.amountFeeTotal = amountFeeTotal;
  }

  /**
   * The difference between the netto deposited amount and the current valuation.
   */
  public Amount getAmountProfit() {
    return this.amountProfit;
  }

  public void setAmountProfit(Amount amountProfit) {
    this.amountProfit = amountProfit;
  }

  /**
   * The amount that's sent to Birdee, but pending investment on the portfolio.
   */
  public Amount getAmountDepositPending() {
    return this.amountDepositPending;
  }

  public void setAmountDepositPending(Amount amountDepositPending) {
    this.amountDepositPending = amountDepositPending;
  }

  /**
   * The amount that's sent to Birdee, but pending withdrawal.
   */
  public Amount getAmountWithdrawalPending() {
    return this.amountWithdrawalPending;
  }

  public void setAmountWithdrawalPending(Amount amountWithdrawalPending) {
    this.amountWithdrawalPending = amountWithdrawalPending;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.amountAvailable != null) {
      return false;
    }

    if (this.amountDepositTotal != null) {
      return false;
    }

    if (this.amountWithdrawalTotal != null) {
      return false;
    }

    if (this.amountFeeTotal != null) {
      return false;
    }

    if (this.amountProfit != null) {
      return false;
    }

    if (this.amountDepositPending != null) {
      return false;
    }

    if (this.amountWithdrawalPending != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static BirdeeInvestmentPortfolioBalance fromJsonReader(JsonReader reader) {
    return fromJsonReader(BirdeeInvestmentPortfolioBalance.class, reader);
  }

}
