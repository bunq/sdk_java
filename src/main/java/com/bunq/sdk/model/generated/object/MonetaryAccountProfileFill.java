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
public class MonetaryAccountProfileFill extends BunqModel {

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
   * The low threshold balance.
   */
  @Expose
  @SerializedName("balance_threshold_low")
  private Amount balanceThresholdLow;

  /**
   * The bank the fill is supposed to happen from, with BIC and bank name.
   */
  @Expose
  @SerializedName("issuer")
  private Issuer issuer;

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
  private Amount balancePreferredFieldForRequest;

  /**
   * The low threshold balance.
   */
  @Expose
  @SerializedName("balance_threshold_low_field_for_request")
  private Amount balanceThresholdLowFieldForRequest;

  /**
   * The bank the fill is supposed to happen from, with BIC and bank name.
   */
  @Expose
  @SerializedName("issuer_field_for_request")
  private Issuer issuerFieldForRequest;

  public MonetaryAccountProfileFill() {
  this(null, null, null, null);
  }

  public MonetaryAccountProfileFill(String status) {
  this(status, null, null, null);
  }

  public MonetaryAccountProfileFill(String status, Amount balancePreferred) {
  this(status, balancePreferred, null, null);
  }

  public MonetaryAccountProfileFill(String status, Amount balancePreferred, Amount balanceThresholdLow) {
  this(status, balancePreferred, balanceThresholdLow, null);
  }

  public MonetaryAccountProfileFill(String status, Amount balancePreferred, Amount balanceThresholdLow, Issuer issuer) {
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
  public Amount getBalancePreferred() {
    return this.balancePreferred;
  }

  public void setBalancePreferred(Amount balancePreferred) {
    this.balancePreferred = balancePreferred;
  }

  /**
   * The low threshold balance.
   */
  public Amount getBalanceThresholdLow() {
    return this.balanceThresholdLow;
  }

  public void setBalanceThresholdLow(Amount balanceThresholdLow) {
    this.balanceThresholdLow = balanceThresholdLow;
  }

  /**
   * The bank the fill is supposed to happen from, with BIC and bank name.
   */
  public Issuer getIssuer() {
    return this.issuer;
  }

  public void setIssuer(Issuer issuer) {
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
  public static MonetaryAccountProfileFill fromJsonReader(JsonReader reader) {
    return fromJsonReader(MonetaryAccountProfileFill.class, reader);
  }

}
