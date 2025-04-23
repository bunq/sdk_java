package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AmountObject;
import com.bunq.sdk.model.generated.object.AvatarObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Read the publicly available information of a partner’s promotion.
 */
public class PartnerPromotionCashbackApiObject extends BunqModel {

  /**
   * The public UUID of the cashback promotion.
   */
  @Expose
  @SerializedName("public_uuid")
  private String publicUuid;

  /**
   * The status of the cashback promotion.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The promotion code used in signup to indicate the partner that referred the user.
   */
  @Expose
  @SerializedName("promotion_code")
  private String promotionCode;

  /**
   * The amount of cashback per transaction, will not be higher than the amount of the
   * transaction.
   */
  @Expose
  @SerializedName("amount_cashback_per_transaction_maximum")
  private AmountObject amountCashbackPerTransactionMaximum;

  /**
   * The maximum number of transactions that can be made.
   */
  @Expose
  @SerializedName("number_of_transaction_maximum")
  private Integer numberOfTransactionMaximum;

  /**
   * The minimum amount of a transaction.
   */
  @Expose
  @SerializedName("amount_transaction_minimum")
  private AmountObject amountTransactionMinimum;

  /**
   * The URL to the Together page with FAQs about this promotion.
   */
  @Expose
  @SerializedName("url_together")
  private String urlTogether;

  /**
   * The deeplink to the cashback promotion.
   */
  @Expose
  @SerializedName("deeplink")
  private String deeplink;

  /**
   * The name of the partner.
   */
  @Expose
  @SerializedName("partner_name")
  private String partnerName;

  /**
   * The avatar of the partner.
   */
  @Expose
  @SerializedName("partner_avatar")
  private AvatarObject partnerAvatar;

  /**
   * The short title of the promotion.
   */
  @Expose
  @SerializedName("promotion_title_short")
  private List<String> promotionTitleShort;

  /**
   * The long title of the promotion.
   */
  @Expose
  @SerializedName("promotion_title_long")
  private List<String> promotionTitleLong;

  /**
   * The description of the promotion.
   */
  @Expose
  @SerializedName("promotion_description")
  private List<String> promotionDescription;

  /**
   * The public UUID of the cashback promotion.
   */
  public String getPublicUuid() {
    return this.publicUuid;
  }

  public void setPublicUuid(String publicUuid) {
    this.publicUuid = publicUuid;
  }

  /**
   * The status of the cashback promotion.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The promotion code used in signup to indicate the partner that referred the user.
   */
  public String getPromotionCode() {
    return this.promotionCode;
  }

  public void setPromotionCode(String promotionCode) {
    this.promotionCode = promotionCode;
  }

  /**
   * The amount of cashback per transaction, will not be higher than the amount of the
   * transaction.
   */
  public AmountObject getAmountCashbackPerTransactionMaximum() {
    return this.amountCashbackPerTransactionMaximum;
  }

  public void setAmountCashbackPerTransactionMaximum(AmountObject amountCashbackPerTransactionMaximum) {
    this.amountCashbackPerTransactionMaximum = amountCashbackPerTransactionMaximum;
  }

  /**
   * The maximum number of transactions that can be made.
   */
  public Integer getNumberOfTransactionMaximum() {
    return this.numberOfTransactionMaximum;
  }

  public void setNumberOfTransactionMaximum(Integer numberOfTransactionMaximum) {
    this.numberOfTransactionMaximum = numberOfTransactionMaximum;
  }

  /**
   * The minimum amount of a transaction.
   */
  public AmountObject getAmountTransactionMinimum() {
    return this.amountTransactionMinimum;
  }

  public void setAmountTransactionMinimum(AmountObject amountTransactionMinimum) {
    this.amountTransactionMinimum = amountTransactionMinimum;
  }

  /**
   * The URL to the Together page with FAQs about this promotion.
   */
  public String getUrlTogether() {
    return this.urlTogether;
  }

  public void setUrlTogether(String urlTogether) {
    this.urlTogether = urlTogether;
  }

  /**
   * The deeplink to the cashback promotion.
   */
  public String getDeeplink() {
    return this.deeplink;
  }

  public void setDeeplink(String deeplink) {
    this.deeplink = deeplink;
  }

  /**
   * The name of the partner.
   */
  public String getPartnerName() {
    return this.partnerName;
  }

  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }

  /**
   * The avatar of the partner.
   */
  public AvatarObject getPartnerAvatar() {
    return this.partnerAvatar;
  }

  public void setPartnerAvatar(AvatarObject partnerAvatar) {
    this.partnerAvatar = partnerAvatar;
  }

  /**
   * The short title of the promotion.
   */
  public List<String> getPromotionTitleShort() {
    return this.promotionTitleShort;
  }

  public void setPromotionTitleShort(List<String> promotionTitleShort) {
    this.promotionTitleShort = promotionTitleShort;
  }

  /**
   * The long title of the promotion.
   */
  public List<String> getPromotionTitleLong() {
    return this.promotionTitleLong;
  }

  public void setPromotionTitleLong(List<String> promotionTitleLong) {
    this.promotionTitleLong = promotionTitleLong;
  }

  /**
   * The description of the promotion.
   */
  public List<String> getPromotionDescription() {
    return this.promotionDescription;
  }

  public void setPromotionDescription(List<String> promotionDescription) {
    this.promotionDescription = promotionDescription;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.publicUuid != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.promotionCode != null) {
      return false;
    }

    if (this.amountCashbackPerTransactionMaximum != null) {
      return false;
    }

    if (this.numberOfTransactionMaximum != null) {
      return false;
    }

    if (this.amountTransactionMinimum != null) {
      return false;
    }

    if (this.urlTogether != null) {
      return false;
    }

    if (this.deeplink != null) {
      return false;
    }

    if (this.partnerName != null) {
      return false;
    }

    if (this.partnerAvatar != null) {
      return false;
    }

    if (this.promotionTitleShort != null) {
      return false;
    }

    if (this.promotionTitleLong != null) {
      return false;
    }

    if (this.promotionDescription != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static PartnerPromotionCashbackApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(PartnerPromotionCashbackApiObject.class, reader);
  }

}
