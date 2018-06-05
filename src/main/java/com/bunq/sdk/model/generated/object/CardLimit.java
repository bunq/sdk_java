package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 */
public class CardLimit extends BunqModel {

  /**
   * The id of the card limit entry.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

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
   * The daily limit amount.
   */
  @Expose
  @SerializedName("daily_limit_field_for_request")
  private String dailyLimitFieldForRequest;

  /**
   * Currency for the daily limit.
   */
  @Expose
  @SerializedName("currency_field_for_request")
  private String currencyFieldForRequest;

  /**
   * The type of transaction for the limit. Can be CARD_LIMIT_ATM, CARD_LIMIT_CONTACTLESS,
   * CARD_LIMIT_DIPPING or CARD_LIMIT_POS_ICC.
   */
  @Expose
  @SerializedName("type_field_for_request")
  private String typeFieldForRequest;

  public CardLimit() {
    this(null, null, null);
  }

  public CardLimit(String dailyLimit) {
    this(dailyLimit, null, null);
  }

  public CardLimit(String dailyLimit, String currency) {
    this(dailyLimit, currency, null);
  }

  public CardLimit(String dailyLimit, String currency, String type) {
    this.dailyLimitFieldForRequest = dailyLimit;
    this.currencyFieldForRequest = currency;
    this.typeFieldForRequest = type;
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
  public boolean isAllFieldNull() {
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

  /**
   */
  public static CardLimit fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardLimit.class, reader);
  }

}
