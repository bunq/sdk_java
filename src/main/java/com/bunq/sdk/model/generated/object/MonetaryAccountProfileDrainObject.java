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
public class MonetaryAccountProfileDrainObject extends BunqModel {

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
  private AmountObject balancePreferred;

  /**
   * The high threshold balance.
   */
  @Expose
  @SerializedName("balance_threshold_high")
  private AmountObject balanceThresholdHigh;

  /**
   * The savings monetary account.
   */
  @Expose
  @SerializedName("savings_account_alias")
  private LabelMonetaryAccountObject savingsAccountAlias;

  /**
   * The status of the profile.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The goal balance.
   */
  @Expose
  @SerializedName("balance_preferred_field_for_request")
  private AmountObject balancePreferredFieldForRequest;

  /**
   * The high threshold balance.
   */
  @Expose
  @SerializedName("balance_threshold_high_field_for_request")
  private AmountObject balanceThresholdHighFieldForRequest;

  /**
   * The savings monetary account.
   */
  @Expose
  @SerializedName("savings_account_alias_field_for_request")
  private PointerObject savingsAccountAliasFieldForRequest;

  public MonetaryAccountProfileDrainObject() {
  this(null, null, null, null);
  }

  public MonetaryAccountProfileDrainObject(String status) {
  this(status, null, null, null);
  }

  public MonetaryAccountProfileDrainObject(String status, AmountObject balancePreferred) {
  this(status, balancePreferred, null, null);
  }

  public MonetaryAccountProfileDrainObject(String status, AmountObject balancePreferred, AmountObject balanceThresholdHigh) {
  this(status, balancePreferred, balanceThresholdHigh, null);
  }

  public MonetaryAccountProfileDrainObject(String status, AmountObject balancePreferred, AmountObject balanceThresholdHigh, PointerObject savingsAccountAlias) {
    this.statusFieldForRequest = status;
    this.balancePreferredFieldForRequest = balancePreferred;
    this.balanceThresholdHighFieldForRequest = balanceThresholdHigh;
    this.savingsAccountAliasFieldForRequest = savingsAccountAlias;
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
  public AmountObject getBalancePreferred() {
    return this.balancePreferred;
  }

  public void setBalancePreferred(AmountObject balancePreferred) {
    this.balancePreferred = balancePreferred;
  }

  /**
   * The high threshold balance.
   */
  public AmountObject getBalanceThresholdHigh() {
    return this.balanceThresholdHigh;
  }

  public void setBalanceThresholdHigh(AmountObject balanceThresholdHigh) {
    this.balanceThresholdHigh = balanceThresholdHigh;
  }

  /**
   * The savings monetary account.
   */
  public LabelMonetaryAccountObject getSavingsAccountAlias() {
    return this.savingsAccountAlias;
  }

  public void setSavingsAccountAlias(LabelMonetaryAccountObject savingsAccountAlias) {
    this.savingsAccountAlias = savingsAccountAlias;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.status != null) {
      return false;
    }

    if (this.balancePreferred != null) {
      return false;
    }

    if (this.balanceThresholdHigh != null) {
      return false;
    }

    if (this.savingsAccountAlias != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MonetaryAccountProfileDrainObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(MonetaryAccountProfileDrainObject.class, reader);
  }

}
