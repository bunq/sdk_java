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
  private Integer monetaryAccountId;

  public CardPinAssignment(String type, String pinCode, Integer monetaryAccountId) {
    this.type = type;
    this.pinCode = pinCode;
    this.monetaryAccountId = monetaryAccountId;
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
  public Integer getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(Integer monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.type != null) {
      return false;
    }

    if (this.monetaryAccountId != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CardPinAssignment fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardPinAssignment.class, reader);
  }

}
