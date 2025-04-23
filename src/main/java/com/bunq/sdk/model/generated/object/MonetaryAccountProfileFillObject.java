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
public class MonetaryAccountProfileFillObject extends BunqModel {

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
   * The low threshold balance.
   */
  @Expose
  @SerializedName("balance_threshold_low")
  private AmountObject balanceThresholdLow;

  /**
   * The bank the fill is supposed to happen from, with BIC and bank name.
   */
  @Expose
  @SerializedName("issuer")
  private IssuerObject issuer;

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
   * The low threshold balance.
   */
  @Expose
  @SerializedName("balance_threshold_low_field_for_request")
  private AmountObject balanceThresholdLowFieldForRequest;

  /**
   * The bank the fill is supposed to happen from, with BIC and bank name.
   */
  @Expose
  @SerializedName("issuer_field_for_request")
  private IssuerObject issuerFieldForRequest;

  public MonetaryAccountProfileFillObject() {
  this(null, null, null, null);
  }

  public MonetaryAccountProfileFillObject(String status) {
  this(status, null, null, null);
  }

  public MonetaryAccountProfileFillObject(String status, AmountObject balancePreferred) {
  this(status, balancePreferred, null, null);
  }

  public MonetaryAccountProfileFillObject(String status, AmountObject balancePreferred, AmountObject balanceThresholdLow) {
  this(status, balancePreferred, balanceThresholdLow, null);
  }

  public MonetaryAccountProfileFillObject(String status, AmountObject balancePreferred, AmountObject balanceThresholdLow, IssuerObject issuer) {
    this.statusFieldForRequest = status;
    this.balancePreferredFieldForRequest = balancePreferred;
    this.balanceThresholdLowFieldForRequest = balanceThresholdLow;
    this.issuerFieldForRequest = issuer;
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
   * The low threshold balance.
   */
  public AmountObject getBalanceThresholdLow() {
    return this.balanceThresholdLow;
  }

  public void setBalanceThresholdLow(AmountObject balanceThresholdLow) {
    this.balanceThresholdLow = balanceThresholdLow;
  }

  /**
   * The bank the fill is supposed to happen from, with BIC and bank name.
   */
  public IssuerObject getIssuer() {
    return this.issuer;
  }

  public void setIssuer(IssuerObject issuer) {
    this.issuer = issuer;
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

    if (this.balanceThresholdLow != null) {
      return false;
    }

    if (this.issuer != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MonetaryAccountProfileFillObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(MonetaryAccountProfileFillObject.class, reader);
  }

}
