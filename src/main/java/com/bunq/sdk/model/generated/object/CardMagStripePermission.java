package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 */
public class CardMagStripePermission extends BunqModel {

  /**
   * Expiry time of this rule.
   */
  @Expose
  @SerializedName("expiry_time")
  private String expiryTime;

  /**
   * Expiry time of this rule.
   */
  @Expose
  @SerializedName("expiry_time_field_for_request")
  private String expiryTimeFieldForRequest;

  public CardMagStripePermission() {
    this(null);
  }

  public CardMagStripePermission(String expiryTime) {
    this.expiryTimeFieldForRequest = expiryTime;
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
    if (this.expiryTime != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CardMagStripePermission fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardMagStripePermission.class, reader);
  }

}
