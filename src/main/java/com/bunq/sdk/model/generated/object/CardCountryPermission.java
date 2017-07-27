package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 */
public class CardCountryPermission extends BunqModel {

  /**
   * The country to allow transactions in (e.g. NL, DE).
   */
  @Expose
  @SerializedName("country")
  private String country;

  /**
   * Expiry time of this rule.
   */
  @Expose
  @SerializedName("expiry_time")
  private String expiryTime;

  public CardCountryPermission(String country) {
    this.country = country;
  }

  /**
   * The country to allow transactions in (e.g. NL, DE).
   */
  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Expiry time of this rule.
   */
  public String getExpiryTime() {
    return this.expiryTime;
  }

  public void setExpiryTime(String expiryTime) {
    this.expiryTime = expiryTime;
  }

}
