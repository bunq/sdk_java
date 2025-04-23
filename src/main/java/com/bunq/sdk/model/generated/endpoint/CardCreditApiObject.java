package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AmountObject;
import com.bunq.sdk.model.generated.object.CardCountryPermissionObject;
import com.bunq.sdk.model.generated.object.CardPinAssignmentObject;
import com.bunq.sdk.model.generated.object.CardPrimaryAccountNumberObject;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccountObject;
import com.bunq.sdk.model.generated.object.PointerObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * With bunq it is possible to order credit cards that can then be connected with each one of
 * the monetary accounts the user has access to (including connected accounts).
 */
public class CardCreditApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/card-credit";

  /**
   * Field constants.
   */
  public static final String FIELD_FIRST_LINE = "first_line";
  public static final String FIELD_SECOND_LINE = "second_line";
  public static final String FIELD_NAME_ON_CARD = "name_on_card";
  public static final String FIELD_PREFERRED_NAME_ON_CARD = "preferred_name_on_card";
  public static final String FIELD_ALIAS = "alias";
  public static final String FIELD_TYPE = "type";
  public static final String FIELD_PRODUCT_TYPE = "product_type";
  public static final String FIELD_PIN_CODE_ASSIGNMENT = "pin_code_assignment";
  public static final String FIELD_MONETARY_ACCOUNT_ID_FALLBACK = "monetary_account_id_fallback";
  public static final String FIELD_ORDER_STATUS = "order_status";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_POST = "CardCredit";

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
   * DEPRECATED. ID of the user who is owner of the card.
   */
  @Expose
  @SerializedName("user_id")
  private Integer userId;

  /**
   * ID of the user who is owner of the card.
   */
  @Expose
  @SerializedName("user_owner_id")
  private Integer userOwnerId;

  /**
   * ID of the user who is holder of the card.
   */
  @Expose
  @SerializedName("user_holder_id")
  private Integer userHolderId;

  /**
   * The type of the card. Can be MAESTRO, MASTERCARD.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The sub-type of the card.
   */
  @Expose
  @SerializedName("sub_type")
  private String subType;

  /**
   * The product type of the card.
   */
  @Expose
  @SerializedName("product_type")
  private String productType;

  /**
   * The product sub-type of the card.
   */
  @Expose
  @SerializedName("product_sub_type")
  private String productSubType;

  /**
   * The first line of text on the card
   */
  @Expose
  @SerializedName("first_line")
  private String firstLine;

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
   * The order status of the card. Can be NEW_CARD_REQUEST_RECEIVED, CARD_REQUEST_PENDING,
   * SENT_FOR_PRODUCTION, ACCEPTED_FOR_PRODUCTION, DELIVERED_TO_CUSTOMER, CARD_UPDATE_REQUESTED,
   * CARD_UPDATE_PENDING, CARD_UPDATE_SENT, CARD_UPDATE_ACCEPTED, VIRTUAL_DELIVERY,
   * NEW_CARD_REQUEST_PENDING_USER_APPROVAL, SENT_FOR_DELIVERY or NEW_CARD_REQUEST_CANCELLED.
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
   * The user's preferred name on the card.
   */
  @Expose
  @SerializedName("preferred_name_on_card")
  private String preferredNameOnCard;

  /**
   * Array of PANs and their attributes.
   */
  @Expose
  @SerializedName("primary_account_numbers")
  private List<CardPrimaryAccountNumberObject> primaryAccountNumbers;

  /**
   * The payment account reference number associated with the card.
   */
  @Expose
  @SerializedName("payment_account_reference")
  private String paymentAccountReference;

  /**
   * The spending limit for the card.
   */
  @Expose
  @SerializedName("card_limit")
  private AmountObject cardLimit;

  /**
   * The ATM spending limit for the card.
   */
  @Expose
  @SerializedName("card_limit_atm")
  private AmountObject cardLimitAtm;

  /**
   * The countries for which to grant (temporary) permissions to use the card.
   */
  @Expose
  @SerializedName("country_permission")
  private List<CardCountryPermissionObject> countryPermission;

  /**
   * The monetary account this card was ordered on and the label user that owns the card.
   */
  @Expose
  @SerializedName("label_monetary_account_ordered")
  private LabelMonetaryAccountObject labelMonetaryAccountOrdered;

  /**
   * The monetary account that this card is currently linked to and the label user viewing it.
   */
  @Expose
  @SerializedName("label_monetary_account_current")
  private LabelMonetaryAccountObject labelMonetaryAccountCurrent;

  /**
   * Current monetary account (only for prepaid credit cards).
   */
  @Expose
  @SerializedName("monetary_account")
  private MonetaryAccountApiObject monetaryAccount;

  /**
   * Array of Types, PINs, account IDs assigned to the card.
   */
  @Expose
  @SerializedName("pin_code_assignment")
  private List<CardPinAssignmentObject> pinCodeAssignment;

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
   * A tracking link provided by our shipment provider.
   */
  @Expose
  @SerializedName("card_shipment_tracking_url")
  private String cardShipmentTrackingUrl;

  /**
   * Whether this card is eligible for a free replacement.
   */
  @Expose
  @SerializedName("is_card_eligible_for_free_replacement")
  private Boolean isCardEligibleForFreeReplacement;

  /**
   * The card replacement for this card.
   */
  @Expose
  @SerializedName("card_replacement")
  private CardReplacementApiObject cardReplacement;

  /**
   * The generated CVC2 code for this card.
   */
  @Expose
  @SerializedName("card_generated_cvc2")
  private CardGeneratedCvc2ApiObject cardGeneratedCvc2;

  /**
   * Whether this card is a limited edition metal card.
   */
  @Expose
  @SerializedName("is_limited_edition")
  private Boolean isLimitedEdition;

  /**
   * The date for the member since field on the black metal card.
   */
  @Expose
  @SerializedName("card_metal_member_since_date")
  private String cardMetalMemberSinceDate;

  /**
   * Details of this card belonging to a company, if applicable.
   */
  @Expose
  @SerializedName("company_employee_card")
  private CompanyEmployeeCardApiObject companyEmployeeCard;

  /**
   * The first line of text on the card, used as name/description for it. It can contain at most
   * 17 characters and it can be empty.
   */
  @Expose
  @SerializedName("first_line_field_for_request")
  private String firstLineFieldForRequest;

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
   * The user's preferred name that can be put on the card.
   */
  @Expose
  @SerializedName("preferred_name_on_card_field_for_request")
  private String preferredNameOnCardFieldForRequest;

  /**
   * The pointer to the monetary account that will be connected at first with the card. Its IBAN
   * code is also the one that will be printed on the card itself. The pointer must be of type
   * IBAN.
   */
  @Expose
  @SerializedName("alias_field_for_request")
  private PointerObject aliasFieldForRequest;

  /**
   * The type of card to order. Can be MASTERCARD.
   */
  @Expose
  @SerializedName("type_field_for_request")
  private String typeFieldForRequest;

  /**
   * The product type of the card to order.
   */
  @Expose
  @SerializedName("product_type_field_for_request")
  private String productTypeFieldForRequest;

  /**
   * Array of Types, PINs, account IDs assigned to the card.
   */
  @Expose
  @SerializedName("pin_code_assignment_field_for_request")
  private List<CardPinAssignmentObject> pinCodeAssignmentFieldForRequest;

  /**
   * ID of the MA to be used as fallback for this card if insufficient balance. Fallback account
   * is removed if not supplied.
   */
  @Expose
  @SerializedName("monetary_account_id_fallback_field_for_request")
  private Integer monetaryAccountIdFallbackFieldForRequest;

  /**
   * The order status of this card. Can be CARD_REQUEST_PENDING or VIRTUAL_DELIVERY.
   */
  @Expose
  @SerializedName("order_status_field_for_request")
  private String orderStatusFieldForRequest;

  public CardCreditApiObject() {
  this(null, null, null, null, null, null, null, null, null, null);
  }

  public CardCreditApiObject(String secondLine) {
  this(secondLine, null, null, null, null, null, null, null, null, null);
  }

  public CardCreditApiObject(String secondLine, String nameOnCard) {
  this(secondLine, nameOnCard, null, null, null, null, null, null, null, null);
  }

  public CardCreditApiObject(String secondLine, String nameOnCard, String type) {
  this(secondLine, nameOnCard, type, null, null, null, null, null, null, null);
  }

  public CardCreditApiObject(String secondLine, String nameOnCard, String type, String productType) {
  this(secondLine, nameOnCard, type, productType, null, null, null, null, null, null);
  }

  public CardCreditApiObject(String secondLine, String nameOnCard, String type, String productType, String firstLine) {
  this(secondLine, nameOnCard, type, productType, firstLine, null, null, null, null, null);
  }

  public CardCreditApiObject(String secondLine, String nameOnCard, String type, String productType, String firstLine, String preferredNameOnCard) {
  this(secondLine, nameOnCard, type, productType, firstLine, preferredNameOnCard, null, null, null, null);
  }

  public CardCreditApiObject(String secondLine, String nameOnCard, String type, String productType, String firstLine, String preferredNameOnCard, PointerObject alias) {
  this(secondLine, nameOnCard, type, productType, firstLine, preferredNameOnCard, alias, null, null, null);
  }

  public CardCreditApiObject(String secondLine, String nameOnCard, String type, String productType, String firstLine, String preferredNameOnCard, PointerObject alias, List<CardPinAssignmentObject> pinCodeAssignment) {
  this(secondLine, nameOnCard, type, productType, firstLine, preferredNameOnCard, alias, pinCodeAssignment, null, null);
  }

  public CardCreditApiObject(String secondLine, String nameOnCard, String type, String productType, String firstLine, String preferredNameOnCard, PointerObject alias, List<CardPinAssignmentObject> pinCodeAssignment, Integer monetaryAccountIdFallback) {
  this(secondLine, nameOnCard, type, productType, firstLine, preferredNameOnCard, alias, pinCodeAssignment, monetaryAccountIdFallback, null);
  }

  public CardCreditApiObject(String secondLine, String nameOnCard, String type, String productType, String firstLine, String preferredNameOnCard, PointerObject alias, List<CardPinAssignmentObject> pinCodeAssignment, Integer monetaryAccountIdFallback, String orderStatus) {
    this.firstLineFieldForRequest = firstLine;
    this.secondLineFieldForRequest = secondLine;
    this.nameOnCardFieldForRequest = nameOnCard;
    this.preferredNameOnCardFieldForRequest = preferredNameOnCard;
    this.aliasFieldForRequest = alias;
    this.typeFieldForRequest = type;
    this.productTypeFieldForRequest = productType;
    this.pinCodeAssignmentFieldForRequest = pinCodeAssignment;
    this.monetaryAccountIdFallbackFieldForRequest = monetaryAccountIdFallback;
    this.orderStatusFieldForRequest = orderStatus;
  }  /**
   * Create a new credit card request.
   * @param secondLine The second line of text on the card, used as name/description for it. It
   * can contain at most 17 characters and it can be empty.
   * @param nameOnCard The user's name as it will be on the card. Check 'card-name' for the
   * available card names for a user.
   * @param type The type of card to order. Can be MASTERCARD.
   * @param productType The product type of the card to order.
   * @param firstLine The first line of text on the card, used as name/description for it. It can
   * contain at most 17 characters and it can be empty.
   * @param preferredNameOnCard The user's preferred name that can be put on the card.
   * @param alias The pointer to the monetary account that will be connected at first with the
   * card. Its IBAN code is also the one that will be printed on the card itself. The pointer must
   * be of type IBAN.
   * @param pinCodeAssignment Array of Types, PINs, account IDs assigned to the card.
   * @param monetaryAccountIdFallback ID of the MA to be used as fallback for this card if
   * insufficient balance. Fallback account is removed if not supplied.
   * @param orderStatus The order status of this card. Can be CARD_REQUEST_PENDING or
   * VIRTUAL_DELIVERY.
   */
  public static BunqResponse<CardCreditApiObject> create(String secondLine, String nameOnCard, String type, String productType, String firstLine, String preferredNameOnCard, PointerObject alias, List<CardPinAssignmentObject> pinCodeAssignment, Integer monetaryAccountIdFallback, String orderStatus, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_FIRST_LINE, firstLine);
requestMap.put(FIELD_SECOND_LINE, secondLine);
requestMap.put(FIELD_NAME_ON_CARD, nameOnCard);
requestMap.put(FIELD_PREFERRED_NAME_ON_CARD, preferredNameOnCard);
requestMap.put(FIELD_ALIAS, alias);
requestMap.put(FIELD_TYPE, type);
requestMap.put(FIELD_PRODUCT_TYPE, productType);
requestMap.put(FIELD_PIN_CODE_ASSIGNMENT, pinCodeAssignment);
requestMap.put(FIELD_MONETARY_ACCOUNT_ID_FALLBACK, monetaryAccountIdFallback);
requestMap.put(FIELD_ORDER_STATUS, orderStatus);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return fromJson(CardCreditApiObject.class, responseRaw, OBJECT_TYPE_POST);
  }

  public static BunqResponse<CardCreditApiObject> create() {
    return create(null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<CardCreditApiObject> create(String secondLine) {
    return create(secondLine, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<CardCreditApiObject> create(String secondLine, String nameOnCard) {
    return create(secondLine, nameOnCard, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<CardCreditApiObject> create(String secondLine, String nameOnCard, String type) {
    return create(secondLine, nameOnCard, type, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<CardCreditApiObject> create(String secondLine, String nameOnCard, String type, String productType) {
    return create(secondLine, nameOnCard, type, productType, null, null, null, null, null, null, null);
  }

  public static BunqResponse<CardCreditApiObject> create(String secondLine, String nameOnCard, String type, String productType, String firstLine) {
    return create(secondLine, nameOnCard, type, productType, firstLine, null, null, null, null, null, null);
  }

  public static BunqResponse<CardCreditApiObject> create(String secondLine, String nameOnCard, String type, String productType, String firstLine, String preferredNameOnCard) {
    return create(secondLine, nameOnCard, type, productType, firstLine, preferredNameOnCard, null, null, null, null, null);
  }

  public static BunqResponse<CardCreditApiObject> create(String secondLine, String nameOnCard, String type, String productType, String firstLine, String preferredNameOnCard, PointerObject alias) {
    return create(secondLine, nameOnCard, type, productType, firstLine, preferredNameOnCard, alias, null, null, null, null);
  }

  public static BunqResponse<CardCreditApiObject> create(String secondLine, String nameOnCard, String type, String productType, String firstLine, String preferredNameOnCard, PointerObject alias, List<CardPinAssignmentObject> pinCodeAssignment) {
    return create(secondLine, nameOnCard, type, productType, firstLine, preferredNameOnCard, alias, pinCodeAssignment, null, null, null);
  }

  public static BunqResponse<CardCreditApiObject> create(String secondLine, String nameOnCard, String type, String productType, String firstLine, String preferredNameOnCard, PointerObject alias, List<CardPinAssignmentObject> pinCodeAssignment, Integer monetaryAccountIdFallback) {
    return create(secondLine, nameOnCard, type, productType, firstLine, preferredNameOnCard, alias, pinCodeAssignment, monetaryAccountIdFallback, null, null);
  }

  public static BunqResponse<CardCreditApiObject> create(String secondLine, String nameOnCard, String type, String productType, String firstLine, String preferredNameOnCard, PointerObject alias, List<CardPinAssignmentObject> pinCodeAssignment, Integer monetaryAccountIdFallback, String orderStatus) {
    return create(secondLine, nameOnCard, type, productType, firstLine, preferredNameOnCard, alias, pinCodeAssignment, monetaryAccountIdFallback, orderStatus, null);
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
   * DEPRECATED. ID of the user who is owner of the card.
   */
  public Integer getUserId() {
    return this.userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * ID of the user who is owner of the card.
   */
  public Integer getUserOwnerId() {
    return this.userOwnerId;
  }

  public void setUserOwnerId(Integer userOwnerId) {
    this.userOwnerId = userOwnerId;
  }

  /**
   * ID of the user who is holder of the card.
   */
  public Integer getUserHolderId() {
    return this.userHolderId;
  }

  public void setUserHolderId(Integer userHolderId) {
    this.userHolderId = userHolderId;
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
   * The sub-type of the card.
   */
  public String getSubType() {
    return this.subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

  /**
   * The product type of the card.
   */
  public String getProductType() {
    return this.productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  /**
   * The product sub-type of the card.
   */
  public String getProductSubType() {
    return this.productSubType;
  }

  public void setProductSubType(String productSubType) {
    this.productSubType = productSubType;
  }

  /**
   * The first line of text on the card
   */
  public String getFirstLine() {
    return this.firstLine;
  }

  public void setFirstLine(String firstLine) {
    this.firstLine = firstLine;
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
   * The order status of the card. Can be NEW_CARD_REQUEST_RECEIVED, CARD_REQUEST_PENDING,
   * SENT_FOR_PRODUCTION, ACCEPTED_FOR_PRODUCTION, DELIVERED_TO_CUSTOMER, CARD_UPDATE_REQUESTED,
   * CARD_UPDATE_PENDING, CARD_UPDATE_SENT, CARD_UPDATE_ACCEPTED, VIRTUAL_DELIVERY,
   * NEW_CARD_REQUEST_PENDING_USER_APPROVAL, SENT_FOR_DELIVERY or NEW_CARD_REQUEST_CANCELLED.
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
   * The user's preferred name on the card.
   */
  public String getPreferredNameOnCard() {
    return this.preferredNameOnCard;
  }

  public void setPreferredNameOnCard(String preferredNameOnCard) {
    this.preferredNameOnCard = preferredNameOnCard;
  }

  /**
   * Array of PANs and their attributes.
   */
  public List<CardPrimaryAccountNumberObject> getPrimaryAccountNumbers() {
    return this.primaryAccountNumbers;
  }

  public void setPrimaryAccountNumbers(List<CardPrimaryAccountNumberObject> primaryAccountNumbers) {
    this.primaryAccountNumbers = primaryAccountNumbers;
  }

  /**
   * The payment account reference number associated with the card.
   */
  public String getPaymentAccountReference() {
    return this.paymentAccountReference;
  }

  public void setPaymentAccountReference(String paymentAccountReference) {
    this.paymentAccountReference = paymentAccountReference;
  }

  /**
   * The spending limit for the card.
   */
  public AmountObject getCardLimit() {
    return this.cardLimit;
  }

  public void setCardLimit(AmountObject cardLimit) {
    this.cardLimit = cardLimit;
  }

  /**
   * The ATM spending limit for the card.
   */
  public AmountObject getCardLimitAtm() {
    return this.cardLimitAtm;
  }

  public void setCardLimitAtm(AmountObject cardLimitAtm) {
    this.cardLimitAtm = cardLimitAtm;
  }

  /**
   * The countries for which to grant (temporary) permissions to use the card.
   */
  public List<CardCountryPermissionObject> getCountryPermission() {
    return this.countryPermission;
  }

  public void setCountryPermission(List<CardCountryPermissionObject> countryPermission) {
    this.countryPermission = countryPermission;
  }

  /**
   * The monetary account this card was ordered on and the label user that owns the card.
   */
  public LabelMonetaryAccountObject getLabelMonetaryAccountOrdered() {
    return this.labelMonetaryAccountOrdered;
  }

  public void setLabelMonetaryAccountOrdered(LabelMonetaryAccountObject labelMonetaryAccountOrdered) {
    this.labelMonetaryAccountOrdered = labelMonetaryAccountOrdered;
  }

  /**
   * The monetary account that this card is currently linked to and the label user viewing it.
   */
  public LabelMonetaryAccountObject getLabelMonetaryAccountCurrent() {
    return this.labelMonetaryAccountCurrent;
  }

  public void setLabelMonetaryAccountCurrent(LabelMonetaryAccountObject labelMonetaryAccountCurrent) {
    this.labelMonetaryAccountCurrent = labelMonetaryAccountCurrent;
  }

  /**
   * Current monetary account (only for prepaid credit cards).
   */
  public MonetaryAccountApiObject getMonetaryAccount() {
    return this.monetaryAccount;
  }

  public void setMonetaryAccount(MonetaryAccountApiObject monetaryAccount) {
    this.monetaryAccount = monetaryAccount;
  }

  /**
   * Array of Types, PINs, account IDs assigned to the card.
   */
  public List<CardPinAssignmentObject> getPinCodeAssignment() {
    return this.pinCodeAssignment;
  }

  public void setPinCodeAssignment(List<CardPinAssignmentObject> pinCodeAssignment) {
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
   * A tracking link provided by our shipment provider.
   */
  public String getCardShipmentTrackingUrl() {
    return this.cardShipmentTrackingUrl;
  }

  public void setCardShipmentTrackingUrl(String cardShipmentTrackingUrl) {
    this.cardShipmentTrackingUrl = cardShipmentTrackingUrl;
  }

  /**
   * Whether this card is eligible for a free replacement.
   */
  public Boolean getIsCardEligibleForFreeReplacement() {
    return this.isCardEligibleForFreeReplacement;
  }

  public void setIsCardEligibleForFreeReplacement(Boolean isCardEligibleForFreeReplacement) {
    this.isCardEligibleForFreeReplacement = isCardEligibleForFreeReplacement;
  }

  /**
   * The card replacement for this card.
   */
  public CardReplacementApiObject getCardReplacement() {
    return this.cardReplacement;
  }

  public void setCardReplacement(CardReplacementApiObject cardReplacement) {
    this.cardReplacement = cardReplacement;
  }

  /**
   * The generated CVC2 code for this card.
   */
  public CardGeneratedCvc2ApiObject getCardGeneratedCvc2() {
    return this.cardGeneratedCvc2;
  }

  public void setCardGeneratedCvc2(CardGeneratedCvc2ApiObject cardGeneratedCvc2) {
    this.cardGeneratedCvc2 = cardGeneratedCvc2;
  }

  /**
   * Whether this card is a limited edition metal card.
   */
  public Boolean getIsLimitedEdition() {
    return this.isLimitedEdition;
  }

  public void setIsLimitedEdition(Boolean isLimitedEdition) {
    this.isLimitedEdition = isLimitedEdition;
  }

  /**
   * The date for the member since field on the black metal card.
   */
  public String getCardMetalMemberSinceDate() {
    return this.cardMetalMemberSinceDate;
  }

  public void setCardMetalMemberSinceDate(String cardMetalMemberSinceDate) {
    this.cardMetalMemberSinceDate = cardMetalMemberSinceDate;
  }

  /**
   * Details of this card belonging to a company, if applicable.
   */
  public CompanyEmployeeCardApiObject getCompanyEmployeeCard() {
    return this.companyEmployeeCard;
  }

  public void setCompanyEmployeeCard(CompanyEmployeeCardApiObject companyEmployeeCard) {
    this.companyEmployeeCard = companyEmployeeCard;
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

    if (this.userId != null) {
      return false;
    }

    if (this.userOwnerId != null) {
      return false;
    }

    if (this.userHolderId != null) {
      return false;
    }

    if (this.type != null) {
      return false;
    }

    if (this.subType != null) {
      return false;
    }

    if (this.productType != null) {
      return false;
    }

    if (this.productSubType != null) {
      return false;
    }

    if (this.firstLine != null) {
      return false;
    }

    if (this.secondLine != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.subStatus != null) {
      return false;
    }

    if (this.orderStatus != null) {
      return false;
    }

    if (this.expiryDate != null) {
      return false;
    }

    if (this.nameOnCard != null) {
      return false;
    }

    if (this.preferredNameOnCard != null) {
      return false;
    }

    if (this.primaryAccountNumbers != null) {
      return false;
    }

    if (this.paymentAccountReference != null) {
      return false;
    }

    if (this.cardLimit != null) {
      return false;
    }

    if (this.cardLimitAtm != null) {
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

    if (this.monetaryAccount != null) {
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

    if (this.cardShipmentTrackingUrl != null) {
      return false;
    }

    if (this.isCardEligibleForFreeReplacement != null) {
      return false;
    }

    if (this.cardReplacement != null) {
      return false;
    }

    if (this.cardGeneratedCvc2 != null) {
      return false;
    }

    if (this.isLimitedEdition != null) {
      return false;
    }

    if (this.cardMetalMemberSinceDate != null) {
      return false;
    }

    if (this.companyEmployeeCard != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CardCreditApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardCreditApiObject.class, reader);
  }

}
