package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.CardCountryPermission;
import com.bunq.sdk.model.generated.object.CardLimit;
import com.bunq.sdk.model.generated.object.CardPinAssignment;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.bunq.sdk.model.generated.object.Pointer;
import com.bunq.sdk.security.SecurityUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * With bunq it is possible to order debit cards that can then be connected with each one of the
 * monetary accounts the user has access to (including connected accounts).
 */
public class CardDebit extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/card-debit";

  /**
   * Field constants.
   */
  public static final String FIELD_SECOND_LINE = "second_line";
  public static final String FIELD_NAME_ON_CARD = "name_on_card";
  public static final String FIELD_ALIAS = "alias";
  public static final String FIELD_TYPE = "type";
  public static final String FIELD_PIN_CODE_ASSIGNMENT = "pin_code_assignment";
  public static final String FIELD_MONETARY_ACCOUNT_ID_FALLBACK = "monetary_account_id_fallback";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_POST = "CardDebit";

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
   * The public UUID of the card.
   */
  @Expose
  @SerializedName("public_uuid")
  private String publicUuid;

  /**
   * The type of the card. Can be MAESTRO, MASTERCARD.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The sub_type of card.
   */
  @Expose
  @SerializedName("sub_type")
  private String subType;

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
   * The last 4 digits of the PAN of the card.
   */
  @Expose
  @SerializedName("primary_account_number_four_digit")
  private String primaryAccountNumberFourDigit;

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
   * The monetary account this card was ordered on and the label user that owns the card.
   */
  @Expose
  @SerializedName("label_monetary_account_ordered")
  private LabelMonetaryAccount labelMonetaryAccountOrdered;

  /**
   * The monetary account that this card is currently linked to and the label user viewing it.
   */
  @Expose
  @SerializedName("label_monetary_account_current")
  private LabelMonetaryAccount labelMonetaryAccountCurrent;

  /**
   * The label for the user who requested the card.
   */
  @Expose
  @SerializedName("alias")
  private LabelUser alias;

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

  /**
   * The country that is domestic to the card. Defaults to country of residence of user.
   */
  @Expose
  @SerializedName("country")
  private String country;

  /**
   * The second line of text on the card, used as name/description for it. It can contain at most
   * 17 characters and it can be empty.
   */
  @Expose
  @SerializedName("second_line_field_for_request")
  private String secondLineFieldForRequest;

  /**
   * The user's name as it will be on the card. Check 'card-name' for the available card names for
   * a user.
   */
  @Expose
  @SerializedName("name_on_card_field_for_request")
  private String nameOnCardFieldForRequest;

  /**
   * The pointer to the monetary account that will be connected at first with the card. Its IBAN
   * code is also the one that will be printed on the card itself. The pointer must be of type
   * IBAN.
   */
  @Expose
  @SerializedName("alias_field_for_request")
  private Pointer aliasFieldForRequest;

  /**
   * The type of card to order. Can be MAESTRO or MASTERCARD.
   */
  @Expose
  @SerializedName("type_field_for_request")
  private String typeFieldForRequest;

  /**
   * Array of Types, PINs, account IDs assigned to the card.
   */
  @Expose
  @SerializedName("pin_code_assignment_field_for_request")
  private List<CardPinAssignment> pinCodeAssignmentFieldForRequest;

  /**
   * ID of the MA to be used as fallback for this card if insufficient balance. Fallback account
   * is removed if not supplied.
   */
  @Expose
  @SerializedName("monetary_account_id_fallback_field_for_request")
  private Integer monetaryAccountIdFallbackFieldForRequest;

  public CardDebit() {
    this(null, null, null, null, null, null);
  }

  public CardDebit(String secondLine) {
    this(secondLine, null, null, null, null, null);
  }

  public CardDebit(String secondLine, String nameOnCard) {
    this(secondLine, nameOnCard, null, null, null, null);
  }

  public CardDebit(String secondLine, String nameOnCard, Pointer alias) {
    this(secondLine, nameOnCard, alias, null, null, null);
  }

  public CardDebit(String secondLine, String nameOnCard, Pointer alias, String type) {
    this(secondLine, nameOnCard, alias, type, null, null);
  }

  public CardDebit(String secondLine, String nameOnCard, Pointer alias, String type, List<CardPinAssignment> pinCodeAssignment) {
    this(secondLine, nameOnCard, alias, type, pinCodeAssignment, null);
  }

  public CardDebit(String secondLine, String nameOnCard, Pointer alias, String type, List<CardPinAssignment> pinCodeAssignment, Integer monetaryAccountIdFallback) {
    this.secondLineFieldForRequest = secondLine;
    this.nameOnCardFieldForRequest = nameOnCard;
    this.aliasFieldForRequest = alias;
    this.typeFieldForRequest = type;
    this.pinCodeAssignmentFieldForRequest = pinCodeAssignment;
    this.monetaryAccountIdFallbackFieldForRequest = monetaryAccountIdFallback;
  }

  /**
   * Create a new debit card request.
   * @param secondLine The second line of text on the card, used as name/description for it. It
   * can contain at most 17 characters and it can be empty.
   * @param nameOnCard The user's name as it will be on the card. Check 'card-name' for the
   * available card names for a user.
   * @param alias The pointer to the monetary account that will be connected at first with the
   * card. Its IBAN code is also the one that will be printed on the card itself. The pointer must
   * be of type IBAN.
   * @param type The type of card to order. Can be MAESTRO or MASTERCARD.
   * @param pinCodeAssignment Array of Types, PINs, account IDs assigned to the card.
   * @param monetaryAccountIdFallback ID of the MA to be used as fallback for this card if
   * insufficient balance. Fallback account is removed if not supplied.
   */
  public static BunqResponse<CardDebit> create(String secondLine, String nameOnCard, Pointer alias, String type, List<CardPinAssignment> pinCodeAssignment, Integer monetaryAccountIdFallback, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_SECOND_LINE, secondLine);
    requestMap.put(FIELD_NAME_ON_CARD, nameOnCard);
    requestMap.put(FIELD_ALIAS, alias);
    requestMap.put(FIELD_TYPE, type);
    requestMap.put(FIELD_PIN_CODE_ASSIGNMENT, pinCodeAssignment);
    requestMap.put(FIELD_MONETARY_ACCOUNT_ID_FALLBACK, monetaryAccountIdFallback);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    requestBytes = SecurityUtils.encrypt(getApiContext(), requestBytes, customHeaders);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return fromJson(CardDebit.class, responseRaw, OBJECT_TYPE_POST);
  }

  public static BunqResponse<CardDebit> create() {
    return create(null, null, null, null, null, null, null);
  }

  public static BunqResponse<CardDebit> create(String secondLine) {
    return create(secondLine, null, null, null, null, null, null);
  }

  public static BunqResponse<CardDebit> create(String secondLine, String nameOnCard) {
    return create(secondLine, nameOnCard, null, null, null, null, null);
  }

  public static BunqResponse<CardDebit> create(String secondLine, String nameOnCard, Pointer alias) {
    return create(secondLine, nameOnCard, alias, null, null, null, null);
  }

  public static BunqResponse<CardDebit> create(String secondLine, String nameOnCard, Pointer alias, String type) {
    return create(secondLine, nameOnCard, alias, type, null, null, null);
  }

  public static BunqResponse<CardDebit> create(String secondLine, String nameOnCard, Pointer alias, String type, List<CardPinAssignment> pinCodeAssignment) {
    return create(secondLine, nameOnCard, alias, type, pinCodeAssignment, null, null);
  }

  public static BunqResponse<CardDebit> create(String secondLine, String nameOnCard, Pointer alias, String type, List<CardPinAssignment> pinCodeAssignment, Integer monetaryAccountIdFallback) {
    return create(secondLine, nameOnCard, alias, type, pinCodeAssignment, monetaryAccountIdFallback, null);
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
   * The public UUID of the card.
   */
  public String getPublicUuid() {
    return this.publicUuid;
  }

  public void setPublicUuid(String publicUuid) {
    this.publicUuid = publicUuid;
  }

  /**
   * The type of the card. Can be MAESTRO, MASTERCARD.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The sub_type of card.
   */
  public String getSubType() {
    return this.subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
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
   * The last 4 digits of the PAN of the card.
   */
  public String getPrimaryAccountNumberFourDigit() {
    return this.primaryAccountNumberFourDigit;
  }

  public void setPrimaryAccountNumberFourDigit(String primaryAccountNumberFourDigit) {
    this.primaryAccountNumberFourDigit = primaryAccountNumberFourDigit;
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
   * The monetary account this card was ordered on and the label user that owns the card.
   */
  public LabelMonetaryAccount getLabelMonetaryAccountOrdered() {
    return this.labelMonetaryAccountOrdered;
  }

  public void setLabelMonetaryAccountOrdered(LabelMonetaryAccount labelMonetaryAccountOrdered) {
    this.labelMonetaryAccountOrdered = labelMonetaryAccountOrdered;
  }

  /**
   * The monetary account that this card is currently linked to and the label user viewing it.
   */
  public LabelMonetaryAccount getLabelMonetaryAccountCurrent() {
    return this.labelMonetaryAccountCurrent;
  }

  public void setLabelMonetaryAccountCurrent(LabelMonetaryAccount labelMonetaryAccountCurrent) {
    this.labelMonetaryAccountCurrent = labelMonetaryAccountCurrent;
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

  /**
   * The country that is domestic to the card. Defaults to country of residence of user.
   */
  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.created != null) {
      return false;
    }

    if (this.updated != null) {
      return false;
    }

    if (this.publicUuid != null) {
      return false;
    }

    if (this.type != null) {
      return false;
    }

    if (this.subType != null) {
      return false;
    }

    if (this.secondLine != null) {
      return false;
    }

    if (this.nameOnCard != null) {
      return false;
    }

    if (this.primaryAccountNumberFourDigit != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.orderStatus != null) {
      return false;
    }

    if (this.expiryDate != null) {
      return false;
    }

    if (this.limit != null) {
      return false;
    }

    if (this.countryPermission != null) {
      return false;
    }

    if (this.labelMonetaryAccountOrdered != null) {
      return false;
    }

    if (this.labelMonetaryAccountCurrent != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.pinCodeAssignment != null) {
      return false;
    }

    if (this.monetaryAccountIdFallback != null) {
      return false;
    }

    if (this.country != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CardDebit fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardDebit.class, reader);
  }

}
