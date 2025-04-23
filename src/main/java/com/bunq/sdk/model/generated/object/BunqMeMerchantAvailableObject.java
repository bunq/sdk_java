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
public class BunqMeMerchantAvailableObject extends BunqModel {

  /**
   * A merchant type supported by bunq.me.
   */
  @Expose
  @SerializedName("merchant_type")
  private String merchantType;

  /**
   * Whether or not the merchant is available for the user.
   */
  @Expose
  @SerializedName("available")
  private Boolean available;

  /**
   * A merchant type supported by bunq.me.
   */
  public String getMerchantType() {
    return this.merchantType;
  }

  public void setMerchantType(String merchantType) {
    this.merchantType = merchantType;
  }

  /**
   * Whether or not the merchant is available for the user.
   */
  public Boolean getAvailable() {
    return this.available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.merchantType != null) {
      return false;
    }

    if (this.available != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static BunqMeMerchantAvailableObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(BunqMeMerchantAvailableObject.class, reader);
  }

}
