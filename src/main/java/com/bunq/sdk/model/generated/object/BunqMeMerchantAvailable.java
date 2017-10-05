package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class BunqMeMerchantAvailable extends BunqModel {

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

}
