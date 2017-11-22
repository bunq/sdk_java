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
public class CardPinAssignment extends BunqModel {

  /**
   * PIN type. Can be PRIMARY, SECONDARY or TERTIARY
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The 4 digit PIN to be assigned to this account.
   */
  @Expose
  @SerializedName("pin_code")
  private String pinCode;

  /**
   * The ID of the monetary account to assign to this pin for the card.
   */
  @Expose
  @SerializedName("monetary_account_id")
  private String monetaryAccountId;

  public CardPinAssignment(String type) {
    this.type = type;
  }

  /**
   * PIN type. Can be PRIMARY, SECONDARY or TERTIARY
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The ID of the monetary account to assign to this pin for the card.
   */
  public String getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(String monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   */
  public boolean areAllFieldNull() {
    if (this.type != null) {
      return false;
    }

    if (this.monetaryAccountId != null) {
      return false;
    }

    return true;
  }

}
