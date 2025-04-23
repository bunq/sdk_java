package com.bunq.sdk.model.generated.endpoint;

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

/**
 * Endpoint for interacting with the birdee investment portfolio balance..
 */
public class BirdeeInvestmentPortfolioBalanceApiObject extends BunqModel {

  /**
   * The current valuation of the portfolio, minus any amount pending withdrawal.
   */
  @Expose
  @SerializedName("amount_available")
  private AmountObject amountAvailable;

  /**
   * The total amount deposited.
   */
  @Expose
  @SerializedName("amount_deposit_total")
  private AmountObject amountDepositTotal;

  /**
   * The total amount withdrawn.
   */
  @Expose
  @SerializedName("amount_withdrawal_total")
  private AmountObject amountWithdrawalTotal;

  /**
   * The total fee amount.
   */
  @Expose
  @SerializedName("amount_fee_total")
  private AmountObject amountFeeTotal;

  /**
   * The difference between the netto deposited amount and the current valuation.
   */
  @Expose
  @SerializedName("amount_profit")
  private AmountObject amountProfit;

  /**
   * The amount that's sent to Birdee, but pending investment on the portfolio.
   */
  @Expose
  @SerializedName("amount_deposit_pending")
  private AmountObject amountDepositPending;

  /**
   * The amount that's sent to Birdee, but pending withdrawal.
   */
  @Expose
  @SerializedName("amount_withdrawal_pending")
  private AmountObject amountWithdrawalPending;

  /**
   * The current valuation of the portfolio, minus any amount pending withdrawal.
   */
  public AmountObject getAmountAvailable() {
    return this.amountAvailable;
  }

  public void setAmountAvailable(AmountObject amountAvailable) {
    this.amountAvailable = amountAvailable;
  }

  /**
   * The total amount deposited.
   */
  public AmountObject getAmountDepositTotal() {
    return this.amountDepositTotal;
  }

  public void setAmountDepositTotal(AmountObject amountDepositTotal) {
    this.amountDepositTotal = amountDepositTotal;
  }

  /**
   * The total amount withdrawn.
   */
  public AmountObject getAmountWithdrawalTotal() {
    return this.amountWithdrawalTotal;
  }

  public void setAmountWithdrawalTotal(AmountObject amountWithdrawalTotal) {
    this.amountWithdrawalTotal = amountWithdrawalTotal;
  }

  /**
   * The total fee amount.
   */
  public AmountObject getAmountFeeTotal() {
    return this.amountFeeTotal;
  }

  public void setAmountFeeTotal(AmountObject amountFeeTotal) {
    this.amountFeeTotal = amountFeeTotal;
  }

  /**
   * The difference between the netto deposited amount and the current valuation.
   */
  public AmountObject getAmountProfit() {
    return this.amountProfit;
  }

  public void setAmountProfit(AmountObject amountProfit) {
    this.amountProfit = amountProfit;
  }

  /**
   * The amount that's sent to Birdee, but pending investment on the portfolio.
   */
  public AmountObject getAmountDepositPending() {
    return this.amountDepositPending;
  }

  public void setAmountDepositPending(AmountObject amountDepositPending) {
    this.amountDepositPending = amountDepositPending;
  }

  /**
   * The amount that's sent to Birdee, but pending withdrawal.
   */
  public AmountObject getAmountWithdrawalPending() {
    return this.amountWithdrawalPending;
  }

  public void setAmountWithdrawalPending(AmountObject amountWithdrawalPending) {
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
  public static BirdeeInvestmentPortfolioBalanceApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(BirdeeInvestmentPortfolioBalanceApiObject.class, reader);
  }

}
