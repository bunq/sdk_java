package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AmountObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Cashback payout item details.
 */
public class CashbackPayoutItemApiObject extends BunqModel {

  /**
   * The status of the cashback payout item.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The amount of cashback earned.
   */
  @Expose
  @SerializedName("amount")
  private AmountObject amount;

  /**
   * The cashback rate.
   */
  @Expose
  @SerializedName("rate_applied")
  private String rateApplied;

  /**
   * The transaction category that this cashback is for.
   */
  @Expose
  @SerializedName("transaction_category")
  private AdditionalTransactionInformationCategoryApiObject transactionCategory;

  /**
   * The partner promotion that this cashback is for.
   */
  @Expose
  @SerializedName("user_partner_promotion")
  private UserPartnerPromotionCashbackApiObject userPartnerPromotion;

  /**
   * The status of the cashback payout item.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The amount of cashback earned.
   */
  public AmountObject getAmount() {
    return this.amount;
  }

  public void setAmount(AmountObject amount) {
    this.amount = amount;
  }

  /**
   * The cashback rate.
   */
  public String getRateApplied() {
    return this.rateApplied;
  }

  public void setRateApplied(String rateApplied) {
    this.rateApplied = rateApplied;
  }

  /**
   * The transaction category that this cashback is for.
   */
  public AdditionalTransactionInformationCategoryApiObject getTransactionCategory() {
    return this.transactionCategory;
  }

  public void setTransactionCategory(AdditionalTransactionInformationCategoryApiObject transactionCategory) {
    this.transactionCategory = transactionCategory;
  }

  /**
   * The partner promotion that this cashback is for.
   */
  public UserPartnerPromotionCashbackApiObject getUserPartnerPromotion() {
    return this.userPartnerPromotion;
  }

  public void setUserPartnerPromotion(UserPartnerPromotionCashbackApiObject userPartnerPromotion) {
    this.userPartnerPromotion = userPartnerPromotion;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.status != null) {
      return false;
    }

    if (this.amount != null) {
      return false;
    }

    if (this.rateApplied != null) {
      return false;
    }

    if (this.transactionCategory != null) {
      return false;
    }

    if (this.userPartnerPromotion != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CashbackPayoutItemApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(CashbackPayoutItemApiObject.class, reader);
  }

}
