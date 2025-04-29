package com.bunq.sdk.model.generated.endpoint;

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
 * Endpoint to specify that a user signed up using a promotion code.
 */
public class UserPartnerPromotionCashbackApiObject extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_PROMOTION_CODE = "promotion_code";

  /**
   * The status of the user partner promotion.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The number of transactions that are still eligible for this promotion.
   */
  @Expose
  @SerializedName("number_of_transaction_remaining")
  private Integer numberOfTransactionRemaining;

  /**
   * The promotion that the user signed up with.
   */
  @Expose
  @SerializedName("partner_promotion")
  private PartnerPromotionCashbackApiObject partnerPromotion;

  /**
   * The promotion code used in signup to indicate the partner that referred the user.
   */
  @Expose
  @SerializedName("promotion_code_field_for_request")
  private String promotionCodeFieldForRequest;

  public UserPartnerPromotionCashbackApiObject() {
  this(null);
  }

  public UserPartnerPromotionCashbackApiObject(String promotionCode) {
    this.promotionCodeFieldForRequest = promotionCode;
  }

  /**
   * The status of the user partner promotion.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The number of transactions that are still eligible for this promotion.
   */
  public Integer getNumberOfTransactionRemaining() {
    return this.numberOfTransactionRemaining;
  }

  public void setNumberOfTransactionRemaining(Integer numberOfTransactionRemaining) {
    this.numberOfTransactionRemaining = numberOfTransactionRemaining;
  }

  /**
   * The promotion that the user signed up with.
   */
  public PartnerPromotionCashbackApiObject getPartnerPromotion() {
    return this.partnerPromotion;
  }

  public void setPartnerPromotion(PartnerPromotionCashbackApiObject partnerPromotion) {
    this.partnerPromotion = partnerPromotion;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.status != null) {
      return false;
    }

    if (this.numberOfTransactionRemaining != null) {
      return false;
    }

    if (this.partnerPromotion != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static UserPartnerPromotionCashbackApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(UserPartnerPromotionCashbackApiObject.class, reader);
  }

}
