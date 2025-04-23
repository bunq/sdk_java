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
 * Manage Partner Cashback Promotions.
 */
public class PartnerPromotionCashbackApiObject extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_PROMOTION_CODE = "promotion_code";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_DATE_START = "date_start";
  public static final String FIELD_DATE_END = "date_end";
  public static final String FIELD_CURRENCY = "currency";
  public static final String FIELD_AMOUNT_CASHBACK_PER_TRANSACTION_MAXIMUM = "amount_cashback_per_transaction_maximum";
  public static final String FIELD_NUMBER_OF_TRANSACTION_MAXIMUM = "number_of_transaction_maximum";
  public static final String FIELD_AMOUNT_TRANSACTION_MINIMUM = "amount_transaction_minimum";
  public static final String FIELD_URL_TOGETHER = "url_together";
  public static final String FIELD_DEEPLINK = "deeplink";
  public static final String FIELD_PARTNER_NAME = "partner_name";
  public static final String FIELD_PARTNER_AVATAR_UUID = "partner_avatar_uuid";
  public static final String FIELD_PROMOTION_TITLE_SHORT = "promotion_title_short";
  public static final String FIELD_PROMOTION_TITLE_LONG = "promotion_title_long";
  public static final String FIELD_PROMOTION_DESCRIPTION = "promotion_description";
  public static final String FIELD_ALL_PARTNER_IDENTIFIER = "all_partner_identifier";

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
   * The promotion code used in signup to indicate the partner that referred the user.
   */
  @Expose
  @SerializedName("promotion_code_field_for_request")
  private String promotionCodeFieldForRequest;

  /**
   * The status of the cashback promotion.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The internal description displayed in the admin.
   */
  @Expose
  @SerializedName("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The date this cashback promotion starts.
   */
  @Expose
  @SerializedName("date_start_field_for_request")
  private String dateStartFieldForRequest;

  /**
   * The date this cashback promotion ends.
   */
  @Expose
  @SerializedName("date_end_field_for_request")
  private String dateEndFieldForRequest;

  /**
   * The currency of the cashback promotion.
   */
  @Expose
  @SerializedName("currency_field_for_request")
  private String currencyFieldForRequest;

  /**
   * The amount of cashback per transaction, will not be higher than the amount of the
   * transaction.
   */
  @Expose
  @SerializedName("amount_cashback_per_transaction_maximum_field_for_request")
  private AmountObject amountCashbackPerTransactionMaximumFieldForRequest;

  /**
   * The maximum number of transactions that can be made.
   */
  @Expose
  @SerializedName("number_of_transaction_maximum_field_for_request")
  private Integer numberOfTransactionMaximumFieldForRequest;

  /**
   * The minimum amount of a transaction.
   */
  @Expose
  @SerializedName("amount_transaction_minimum_field_for_request")
  private AmountObject amountTransactionMinimumFieldForRequest;

  /**
   * The URL to the Together page with FAQs about this promotion.
   */
  @Expose
  @SerializedName("url_together_field_for_request")
  private String urlTogetherFieldForRequest;

  /**
   * The deeplink to the cashback promotion.
   */
  @Expose
  @SerializedName("deeplink_field_for_request")
  private String deeplinkFieldForRequest;

  /**
   * The name of the partner to display.
   */
  @Expose
  @SerializedName("partner_name_field_for_request")
  private String partnerNameFieldForRequest;

  /**
   * The ID of the avatar of the partner.
   */
  @Expose
  @SerializedName("partner_avatar_uuid_field_for_request")
  private String partnerAvatarUuidFieldForRequest;

  /**
   * The short title of the promotion.
   */
  @Expose
  @SerializedName("promotion_title_short_field_for_request")
  private List<String> promotionTitleShortFieldForRequest;

  /**
   * The long title of the promotion.
   */
  @Expose
  @SerializedName("promotion_title_long_field_for_request")
  private List<String> promotionTitleLongFieldForRequest;

  /**
   * The description of the promotion.
   */
  @Expose
  @SerializedName("promotion_description_field_for_request")
  private List<String> promotionDescriptionFieldForRequest;

  /**
   * The identifiers to match the partner when payments are made to it.
   */
  @Expose
  @SerializedName("all_partner_identifier_field_for_request")
  private List<String> allPartnerIdentifierFieldForRequest;

  public PartnerPromotionCashbackApiObject() {
  this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public PartnerPromotionCashbackApiObject(String promotionCode) {
  this(promotionCode, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public PartnerPromotionCashbackApiObject(String promotionCode, String description) {
  this(promotionCode, description, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public PartnerPromotionCashbackApiObject(String promotionCode, String description, String dateStart) {
  this(promotionCode, description, dateStart, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public PartnerPromotionCashbackApiObject(String promotionCode, String description, String dateStart, String dateEnd) {
  this(promotionCode, description, dateStart, dateEnd, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public PartnerPromotionCashbackApiObject(String promotionCode, String description, String dateStart, String dateEnd, String currency) {
  this(promotionCode, description, dateStart, dateEnd, currency, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public PartnerPromotionCashbackApiObject(String promotionCode, String description, String dateStart, String dateEnd, String currency, AmountObject amountCashbackPerTransactionMaximum) {
  this(promotionCode, description, dateStart, dateEnd, currency, amountCashbackPerTransactionMaximum, null, null, null, null, null, null, null, null, null, null, null);
  }

  public PartnerPromotionCashbackApiObject(String promotionCode, String description, String dateStart, String dateEnd, String currency, AmountObject amountCashbackPerTransactionMaximum, Integer numberOfTransactionMaximum) {
  this(promotionCode, description, dateStart, dateEnd, currency, amountCashbackPerTransactionMaximum, numberOfTransactionMaximum, null, null, null, null, null, null, null, null, null, null);
  }

  public PartnerPromotionCashbackApiObject(String promotionCode, String description, String dateStart, String dateEnd, String currency, AmountObject amountCashbackPerTransactionMaximum, Integer numberOfTransactionMaximum, AmountObject amountTransactionMinimum) {
  this(promotionCode, description, dateStart, dateEnd, currency, amountCashbackPerTransactionMaximum, numberOfTransactionMaximum, amountTransactionMinimum, null, null, null, null, null, null, null, null, null);
  }

  public PartnerPromotionCashbackApiObject(String promotionCode, String description, String dateStart, String dateEnd, String currency, AmountObject amountCashbackPerTransactionMaximum, Integer numberOfTransactionMaximum, AmountObject amountTransactionMinimum, String deeplink) {
  this(promotionCode, description, dateStart, dateEnd, currency, amountCashbackPerTransactionMaximum, numberOfTransactionMaximum, amountTransactionMinimum, deeplink, null, null, null, null, null, null, null, null);
  }

  public PartnerPromotionCashbackApiObject(String promotionCode, String description, String dateStart, String dateEnd, String currency, AmountObject amountCashbackPerTransactionMaximum, Integer numberOfTransactionMaximum, AmountObject amountTransactionMinimum, String deeplink, String partnerName) {
  this(promotionCode, description, dateStart, dateEnd, currency, amountCashbackPerTransactionMaximum, numberOfTransactionMaximum, amountTransactionMinimum, deeplink, partnerName, null, null, null, null, null, null, null);
  }

  public PartnerPromotionCashbackApiObject(String promotionCode, String description, String dateStart, String dateEnd, String currency, AmountObject amountCashbackPerTransactionMaximum, Integer numberOfTransactionMaximum, AmountObject amountTransactionMinimum, String deeplink, String partnerName, String partnerAvatarUuid) {
  this(promotionCode, description, dateStart, dateEnd, currency, amountCashbackPerTransactionMaximum, numberOfTransactionMaximum, amountTransactionMinimum, deeplink, partnerName, partnerAvatarUuid, null, null, null, null, null, null);
  }

  public PartnerPromotionCashbackApiObject(String promotionCode, String description, String dateStart, String dateEnd, String currency, AmountObject amountCashbackPerTransactionMaximum, Integer numberOfTransactionMaximum, AmountObject amountTransactionMinimum, String deeplink, String partnerName, String partnerAvatarUuid, List<String> promotionTitleShort) {
  this(promotionCode, description, dateStart, dateEnd, currency, amountCashbackPerTransactionMaximum, numberOfTransactionMaximum, amountTransactionMinimum, deeplink, partnerName, partnerAvatarUuid, promotionTitleShort, null, null, null, null, null);
  }

  public PartnerPromotionCashbackApiObject(String promotionCode, String description, String dateStart, String dateEnd, String currency, AmountObject amountCashbackPerTransactionMaximum, Integer numberOfTransactionMaximum, AmountObject amountTransactionMinimum, String deeplink, String partnerName, String partnerAvatarUuid, List<String> promotionTitleShort, List<String> promotionTitleLong) {
  this(promotionCode, description, dateStart, dateEnd, currency, amountCashbackPerTransactionMaximum, numberOfTransactionMaximum, amountTransactionMinimum, deeplink, partnerName, partnerAvatarUuid, promotionTitleShort, promotionTitleLong, null, null, null, null);
  }

  public PartnerPromotionCashbackApiObject(String promotionCode, String description, String dateStart, String dateEnd, String currency, AmountObject amountCashbackPerTransactionMaximum, Integer numberOfTransactionMaximum, AmountObject amountTransactionMinimum, String deeplink, String partnerName, String partnerAvatarUuid, List<String> promotionTitleShort, List<String> promotionTitleLong, List<String> promotionDescription) {
  this(promotionCode, description, dateStart, dateEnd, currency, amountCashbackPerTransactionMaximum, numberOfTransactionMaximum, amountTransactionMinimum, deeplink, partnerName, partnerAvatarUuid, promotionTitleShort, promotionTitleLong, promotionDescription, null, null, null);
  }

  public PartnerPromotionCashbackApiObject(String promotionCode, String description, String dateStart, String dateEnd, String currency, AmountObject amountCashbackPerTransactionMaximum, Integer numberOfTransactionMaximum, AmountObject amountTransactionMinimum, String deeplink, String partnerName, String partnerAvatarUuid, List<String> promotionTitleShort, List<String> promotionTitleLong, List<String> promotionDescription, String status) {
  this(promotionCode, description, dateStart, dateEnd, currency, amountCashbackPerTransactionMaximum, numberOfTransactionMaximum, amountTransactionMinimum, deeplink, partnerName, partnerAvatarUuid, promotionTitleShort, promotionTitleLong, promotionDescription, status, null, null);
  }

  public PartnerPromotionCashbackApiObject(String promotionCode, String description, String dateStart, String dateEnd, String currency, AmountObject amountCashbackPerTransactionMaximum, Integer numberOfTransactionMaximum, AmountObject amountTransactionMinimum, String deeplink, String partnerName, String partnerAvatarUuid, List<String> promotionTitleShort, List<String> promotionTitleLong, List<String> promotionDescription, String status, String urlTogether) {
  this(promotionCode, description, dateStart, dateEnd, currency, amountCashbackPerTransactionMaximum, numberOfTransactionMaximum, amountTransactionMinimum, deeplink, partnerName, partnerAvatarUuid, promotionTitleShort, promotionTitleLong, promotionDescription, status, urlTogether, null);
  }

  public PartnerPromotionCashbackApiObject(String promotionCode, String description, String dateStart, String dateEnd, String currency, AmountObject amountCashbackPerTransactionMaximum, Integer numberOfTransactionMaximum, AmountObject amountTransactionMinimum, String deeplink, String partnerName, String partnerAvatarUuid, List<String> promotionTitleShort, List<String> promotionTitleLong, List<String> promotionDescription, String status, String urlTogether, List<String> allPartnerIdentifier) {
    this.promotionCodeFieldForRequest = promotionCode;
    this.statusFieldForRequest = status;
    this.descriptionFieldForRequest = description;
    this.dateStartFieldForRequest = dateStart;
    this.dateEndFieldForRequest = dateEnd;
    this.currencyFieldForRequest = currency;
    this.amountCashbackPerTransactionMaximumFieldForRequest = amountCashbackPerTransactionMaximum;
    this.numberOfTransactionMaximumFieldForRequest = numberOfTransactionMaximum;
    this.amountTransactionMinimumFieldForRequest = amountTransactionMinimum;
    this.urlTogetherFieldForRequest = urlTogether;
    this.deeplinkFieldForRequest = deeplink;
    this.partnerNameFieldForRequest = partnerName;
    this.partnerAvatarUuidFieldForRequest = partnerAvatarUuid;
    this.promotionTitleShortFieldForRequest = promotionTitleShort;
    this.promotionTitleLongFieldForRequest = promotionTitleLong;
    this.promotionDescriptionFieldForRequest = promotionDescription;
    this.allPartnerIdentifierFieldForRequest = allPartnerIdentifier;
  }

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
