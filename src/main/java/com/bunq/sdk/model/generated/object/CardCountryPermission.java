package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

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

  /**
   * The id of the card country permission entry.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  public CardCountryPermission(String country) {
    this.country = country;
    this.expiryTime = expiryTime;
  }

  /**
   * The id of the card country permission entry.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
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

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.country != null) {
      return false;
    }

    if (this.expiryTime != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CardCountryPermission fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardCountryPermission.class, reader);
  }

}
