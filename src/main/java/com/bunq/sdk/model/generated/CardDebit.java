package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.generated.object.CardCountryPermission;
import com.bunq.sdk.model.generated.object.CardLimit;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.bunq.sdk.security.SecurityUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * With bunq it is possible to order debit cards that can then be connected with each one of the
 * monetary accounts the user has access to (including connected accounts).
 */
public class CardDebit extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_SECOND_LINE = "second_line";
  public static final String FIELD_NAME_ON_CARD = "name_on_card";
  public static final String FIELD_PIN_CODE = "pin_code";
  public static final String FIELD_ALIAS = "alias";
  public static final String FIELD_TYPE = "type";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/card-debit";

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
   * The timestamp when the card was crated.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp when the card was last updated.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The second line of text on the card
   */
  @Expose
  @SerializedName("second_line")
  private String secondLine;

  /**
   * The user's name as will be on the card
   */
  @Expose
  @SerializedName("name_on_card")
  private String nameOnCard;

  /**
   * The status to set for the card. After ordering the card it will be DEACTIVATED.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The order status of the card. After ordering the card it will be NEW_CARD_REQUEST_RECEIVED.
   */
  @Expose
  @SerializedName("order_status")
  private String orderStatus;

  /**
   * The expiry date of the card.
   */
  @Expose
  @SerializedName("expiry_date")
  private String expiryDate;

  /**
   * The limits to define for the card (e.g. 25 EUR for CARD_LIMIT_CONTACTLESS).
   */
  @Expose
  @SerializedName("limit")
  private List<CardLimit> limit;

  /**
   * The countries for which to grant (temporary) permissions to use the card.
   */
  @Expose
  @SerializedName("country_permission")
  private List<CardCountryPermission> countryPermission;

  /**
   * The label for the user who requested the card.
   */
  @Expose
  @SerializedName("alias")
  private LabelUser alias;

  public static CardDebit create(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId) {
    return create(apiContext, requestMap, userId, new HashMap<>());
  }

  /**
   * Create a new debit card request.
   */
  public static CardDebit create(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    requestBytes = SecurityUtils.encrypt(apiContext, requestBytes, customHeaders);
    byte[] responseBytes = apiClient
        .post(String.format(ENDPOINT_URL_CREATE, userId), requestBytes, customHeaders);

    return fromJson(CardDebit.class, new String(responseBytes), OBJECT_TYPE);
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
   * The timestamp when the card was crated.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp when the card was last updated.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
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
   * The user's name as will be on the card
   */
  public String getNameOnCard() {
    return this.nameOnCard;
  }

  public void setNameOnCard(String nameOnCard) {
    this.nameOnCard = nameOnCard;
  }

  /**
   * The status to set for the card. After ordering the card it will be DEACTIVATED.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The order status of the card. After ordering the card it will be NEW_CARD_REQUEST_RECEIVED.
   */
  public String getOrderStatus() {
    return this.orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  /**
   * The expiry date of the card.
   */
  public String getExpiryDate() {
    return this.expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  /**
   * The limits to define for the card (e.g. 25 EUR for CARD_LIMIT_CONTACTLESS).
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
  public List<CardCountryPermission> getCountryPermission() {
    return this.countryPermission;
  }

  public void setCountryPermission(List<CardCountryPermission> countryPermission) {
    this.countryPermission = countryPermission;
  }

  /**
   * The label for the user who requested the card.
   */
  public LabelUser getAlias() {
    return this.alias;
  }

  public void setAlias(LabelUser alias) {
    this.alias = alias;
  }

}
