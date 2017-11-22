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
public class Issuer extends BunqModel {

  /**
   * The BIC code.
   */
  @Expose
  @SerializedName("bic")
  private String bic;

  /**
   * The name of the bank.
   */
  @Expose
  @SerializedName("name")
  private String name;

  public Issuer(String bic) {
    this.bic = bic;
  }

  /**
   * The BIC code.
   */
  public String getBic() {
    return this.bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  /**
   * The name of the bank.
   */
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   */
  public boolean areAllFieldNull() {
    if (this.bic != null) {
      return false;
    }

    if (this.name != null) {
      return false;
    }

    return true;
  }

}
