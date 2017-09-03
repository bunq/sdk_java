package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class MonetaryAccountProfileDrain extends BunqModel {

  /**
   * The status of the profile.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The goal balance.
   */
  @Expose
  @SerializedName("balance_preferred")
  private Amount balancePreferred;

  /**
   * The high threshold balance.
   */
  @Expose
  @SerializedName("balance_threshold_high")
  private Amount balanceThresholdHigh;

  /**
   * The savings monetary account.
   */
  @Expose
  @SerializedName("savings_account_alias")
  private MonetaryAccountReference savingsAccountAlias;

  public MonetaryAccountProfileDrain(String status, Amount balancePreferred, Amount balanceThresholdHigh, MonetaryAccountReference savingsAccountAlias) {
    this.status = status;
    this.balancePreferred = balancePreferred;
    this.balanceThresholdHigh = balanceThresholdHigh;
    this.savingsAccountAlias = savingsAccountAlias;
  }

  /**
   * The status of the profile.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The goal balance.
   */
  public Amount getBalancePreferred() {
    return this.balancePreferred;
  }

  public void setBalancePreferred(Amount balancePreferred) {
    this.balancePreferred = balancePreferred;
  }

  /**
   * The high threshold balance.
   */
  public Amount getBalanceThresholdHigh() {
    return this.balanceThresholdHigh;
  }

  public void setBalanceThresholdHigh(Amount balanceThresholdHigh) {
    this.balanceThresholdHigh = balanceThresholdHigh;
  }

  /**
   * The savings monetary account.
   */
  public MonetaryAccountReference getSavingsAccountAlias() {
    return this.savingsAccountAlias;
  }

  public void setSavingsAccountAlias(MonetaryAccountReference savingsAccountAlias) {
    this.savingsAccountAlias = savingsAccountAlias;
  }

}
