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
public class CardLimit extends BunqModel {

  /**
   * The daily limit amount.
   */
  @Expose
  @SerializedName("daily_limit")
  private String dailyLimit;

  /**
   * Currency for the daily limit.
   */
  @Expose
  @SerializedName("currency")
  private String currency;

  /**
   * The type of transaction for the limit. Can be CARD_LIMIT_ATM, CARD_LIMIT_CONTACTLESS,
   * CARD_LIMIT_DIPPING or CARD_LIMIT_POS_ICC.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The id of the card limit entry.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  public CardLimit(String dailyLimit, String currency, String type) {
    this.dailyLimit = dailyLimit;
    this.currency = currency;
    this.type = type;
  }

  /**
   * The id of the card limit entry.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The daily limit amount.
   */
  public String getDailyLimit() {
    return this.dailyLimit;
  }

  public void setDailyLimit(String dailyLimit) {
    this.dailyLimit = dailyLimit;
  }

  /**
   * Currency for the daily limit.
   */
  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * The type of transaction for the limit. Can be CARD_LIMIT_ATM, CARD_LIMIT_CONTACTLESS,
   * CARD_LIMIT_DIPPING or CARD_LIMIT_POS_ICC.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   */
  public boolean areAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.dailyLimit != null) {
      return false;
    }

    if (this.currency != null) {
      return false;
    }

    if (this.type != null) {
      return false;
    }

    return true;
  }

}
