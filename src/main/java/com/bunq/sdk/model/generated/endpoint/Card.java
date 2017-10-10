package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.CardCountryPermission;
import com.bunq.sdk.model.generated.object.CardLimit;
import com.bunq.sdk.model.generated.object.CardMagStripePermission;
import com.bunq.sdk.model.generated.object.CardPinAssignment;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.bunq.sdk.security.SecurityUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * Endpoint for retrieving details for the cards the user has access to.
 */
public class Card extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_PIN_CODE = "pin_code";
  public static final String FIELD_ACTIVATION_CODE = "activation_code";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_LIMIT = "limit";
  public static final String FIELD_MAG_STRIPE_PERMISSION = "mag_stripe_permission";
  public static final String FIELD_COUNTRY_PERMISSION = "country_permission";
  public static final String FIELD_MONETARY_ACCOUNT_CURRENT_ID = "monetary_account_current_id";
  public static final String FIELD_PIN_CODE_ASSIGNMENT = "pin_code_assignment";
  public static final String FIELD_MONETARY_ACCOUNT_ID_FALLBACK = "monetary_account_id_fallback";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_UPDATE = "user/%s/card/%s";
  private static final String ENDPOINT_URL_READ = "user/%s/card/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/card";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "CardDebit";

  /**
   * The id of the card.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the card's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the card's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The public UUID of the card.
   */
  @Expose
  @SerializedName("public_uuid")
  private String publicUuid;

  /**
   * The second line of text on the card
   */
  @Expose
  @SerializedName("second_line")
  private String secondLine;

  /**
   * The status to set for the card. Can be ACTIVE, DEACTIVATED, LOST, STOLEN, CANCELLED, EXPIRED
   * or PIN_TRIES_EXCEEDED.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The sub-status of the card. Can be NONE or REPLACED.
   */
  @Expose
  @SerializedName("sub_status")
  private String subStatus;

  /**
   * The order status of the card. Can be CARD_UPDATE_REQUESTED, CARD_UPDATE_SENT,
   * CARD_UPDATE_ACCEPTED, ACCEPTED_FOR_PRODUCTION or DELIVERED_TO_CUSTOMER.
   */
  @Expose
  @SerializedName("order_status")
  private String orderStatus;

  /**
   * Expiry date of the card.
   */
  @Expose
  @SerializedName("expiry_date")
  private String expiryDate;

  /**
   * The user's name on the card.
   */
  @Expose
  @SerializedName("name_on_card")
  private String nameOnCard;

  /**
   * The last 4 digits of the PAN of the card.
   */
  @Expose
  @SerializedName("primary_account_number_four_digit")
  private String primaryAccountNumberFourDigit;

  /**
   * The limits to define for the card, among CARD_LIMIT_CONTACTLESS, CARD_LIMIT_ATM,
   * CARD_LIMIT_DIPPING and CARD_LIMIT_POS_ICC (e.g. 25 EUR for CARD_LIMIT_CONTACTLESS)
   */
  @Expose
  @SerializedName("limit")
  private List<CardLimit> limit;

  /**
   * The countries for which to grant (temporary) permissions to use the card.
   */
  @Expose
  @SerializedName("mag_stripe_permission")
  private CardMagStripePermission magStripePermission;

  /**
   * The countries for which to grant (temporary) permissions to use the card.
   */
  @Expose
  @SerializedName("country_permission")
  private List<CardCountryPermission> countryPermission;

  /**
   * The monetary account this card was ordered on and the label user that owns the card.
   */
  @Expose
  @SerializedName("label_monetary_account_ordered")
  private MonetaryAccountReference labelMonetaryAccountOrdered;

  /**
   * The monetary account that this card is currently linked to and the label user viewing it.
   */
  @Expose
  @SerializedName("label_monetary_account_current")
  private MonetaryAccountReference labelMonetaryAccountCurrent;

  /**
   * Array of Types, PINs, account IDs assigned to the card.
   */
  @Expose
  @SerializedName("pin_code_assignment")
  private List<CardPinAssignment> pinCodeAssignment;

  /**
   * ID of the MA to be used as fallback for this card if insufficient balance. Fallback account
   * is removed if not supplied.
   */
  @Expose
  @SerializedName("monetary_account_id_fallback")
  private Integer monetaryAccountIdFallback;

  public static BunqResponse<Card> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer cardId) {
    return update(apiContext, requestMap, userId, cardId, new HashMap<>());
  }

  /**
   * Update the card details. Allow to change pin code, status, limits, country permissions and
   * the monetary account connected to the card. When the card has been received, it can be also
   * activated through this endpoint.
   */
  public static BunqResponse<Card> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer cardId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    requestBytes = SecurityUtils.encrypt(apiContext, requestBytes, customHeaders);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, userId, cardId), requestBytes, customHeaders);

    return fromJson(Card.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<Card> get(ApiContext apiContext, Integer userId, Integer cardId) {
    return get(apiContext, userId, cardId, new HashMap<>());
  }

  /**
   * Return the details of a specific card.
   */
  public static BunqResponse<Card> get(ApiContext apiContext, Integer userId, Integer cardId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userId, cardId), new HashMap<>(), customHeaders);

    return fromJson(Card.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<List<Card>> list(ApiContext apiContext, Integer userId) {
    return list(apiContext, userId, new HashMap<>());
  }

  public static BunqResponse<List<Card>> list(ApiContext apiContext, Integer userId, Map<String, String> params) {
    return list(apiContext, userId, params, new HashMap<>());
  }

  /**
   * Return all the cards available to the user.
   */
  public static BunqResponse<List<Card>> list(ApiContext apiContext, Integer userId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId), params, customHeaders);

    return fromJsonList(Card.class, responseRaw, OBJECT_TYPE);
  }

  /**
   * The id of the card.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the card's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the card's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The public UUID of the card.
   */
  public String getPublicUuid() {
    return this.publicUuid;
  }

  public void setPublicUuid(String publicUuid) {
    this.publicUuid = publicUuid;
  }

  /**
   * The second line of text on the card
   */
  public String getSecondLine() {
    return this.secondLine;
  }

  public void setSecondLine(String secondLine) {
    this.secondLine = secondLine;
  }

  /**
   * The status to set for the card. Can be ACTIVE, DEACTIVATED, LOST, STOLEN, CANCELLED, EXPIRED
   * or PIN_TRIES_EXCEEDED.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The sub-status of the card. Can be NONE or REPLACED.
   */
  public String getSubStatus() {
    return this.subStatus;
  }

  public void setSubStatus(String subStatus) {
    this.subStatus = subStatus;
  }

  /**
   * The order status of the card. Can be CARD_UPDATE_REQUESTED, CARD_UPDATE_SENT,
   * CARD_UPDATE_ACCEPTED, ACCEPTED_FOR_PRODUCTION or DELIVERED_TO_CUSTOMER.
   */
  public String getOrderStatus() {
    return this.orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  /**
   * Expiry date of the card.
   */
  public String getExpiryDate() {
    return this.expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  /**
   * The user's name on the card.
   */
  public String getNameOnCard() {
    return this.nameOnCard;
  }

  public void setNameOnCard(String nameOnCard) {
    this.nameOnCard = nameOnCard;
  }

  /**
   * The last 4 digits of the PAN of the card.
   */
  public String getPrimaryAccountNumberFourDigit() {
    return this.primaryAccountNumberFourDigit;
  }

  public void setPrimaryAccountNumberFourDigit(String primaryAccountNumberFourDigit) {
    this.primaryAccountNumberFourDigit = primaryAccountNumberFourDigit;
  }

  /**
   * The limits to define for the card, among CARD_LIMIT_CONTACTLESS, CARD_LIMIT_ATM,
   * CARD_LIMIT_DIPPING and CARD_LIMIT_POS_ICC (e.g. 25 EUR for CARD_LIMIT_CONTACTLESS)
   */
  public List<CardLimit> getLimit() {
    return this.limit;
  }

  public void setLimit(List<CardLimit> limit) {
    this.limit = limit;
  }

  /**
   * The countries for which to grant (temporary) permissions to use the card.
   */
  public CardMagStripePermission getMagStripePermission() {
    return this.magStripePermission;
  }

  public void setMagStripePermission(CardMagStripePermission magStripePermission) {
    this.magStripePermission = magStripePermission;
  }

  /**
   * The countries for which to grant (temporary) permissions to use the card.
   */
  public List<CardCountryPermission> getCountryPermission() {
    return this.countryPermission;
  }

  public void setCountryPermission(List<CardCountryPermission> countryPermission) {
    this.countryPermission = countryPermission;
  }

  /**
   * The monetary account this card was ordered on and the label user that owns the card.
   */
  public MonetaryAccountReference getLabelMonetaryAccountOrdered() {
    return this.labelMonetaryAccountOrdered;
  }

  public void setLabelMonetaryAccountOrdered(MonetaryAccountReference labelMonetaryAccountOrdered) {
    this.labelMonetaryAccountOrdered = labelMonetaryAccountOrdered;
  }

  /**
   * The monetary account that this card is currently linked to and the label user viewing it.
   */
  public MonetaryAccountReference getLabelMonetaryAccountCurrent() {
    return this.labelMonetaryAccountCurrent;
  }

  public void setLabelMonetaryAccountCurrent(MonetaryAccountReference labelMonetaryAccountCurrent) {
    this.labelMonetaryAccountCurrent = labelMonetaryAccountCurrent;
  }

  /**
   * Array of Types, PINs, account IDs assigned to the card.
   */
  public List<CardPinAssignment> getPinCodeAssignment() {
    return this.pinCodeAssignment;
  }

  public void setPinCodeAssignment(List<CardPinAssignment> pinCodeAssignment) {
    this.pinCodeAssignment = pinCodeAssignment;
  }

  /**
   * ID of the MA to be used as fallback for this card if insufficient balance. Fallback account
   * is removed if not supplied.
   */
  public Integer getMonetaryAccountIdFallback() {
    return this.monetaryAccountIdFallback;
  }

  public void setMonetaryAccountIdFallback(Integer monetaryAccountIdFallback) {
    this.monetaryAccountIdFallback = monetaryAccountIdFallback;
  }

}
