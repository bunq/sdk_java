package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.CardCountryPermission;
import com.bunq.sdk.model.generated.object.CardPinAssignment;
import com.bunq.sdk.model.generated.object.CardPrimaryAccountNumber;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
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
 * Endpoint for retrieving details for the cards the user has access to.
 */
public class Card extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/card/%s";
  protected static final String ENDPOINT_URL_READ = "user/%s/card/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/card";

  /**
   * Field constants.
   */
  public static final String FIELD_PIN_CODE = "pin_code";
  public static final String FIELD_ACTIVATION_CODE = "activation_code";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_ORDER_STATUS = "order_status";
  public static final String FIELD_CARD_LIMIT = "card_limit";
  public static final String FIELD_CARD_LIMIT_ATM = "card_limit_atm";
  public static final String FIELD_COUNTRY_PERMISSION = "country_permission";
  public static final String FIELD_PIN_CODE_ASSIGNMENT = "pin_code_assignment";
  public static final String FIELD_PRIMARY_ACCOUNT_NUMBERS = "primary_account_numbers";
  public static final String FIELD_MONETARY_ACCOUNT_ID_FALLBACK = "monetary_account_id_fallback";
  public static final String FIELD_PREFERRED_NAME_ON_CARD = "preferred_name_on_card";
  public static final String FIELD_SECOND_LINE = "second_line";
  public static final String FIELD_CANCELLATION_REASON = "cancellation_reason";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_PUT = "Card";
  protected static final String OBJECT_TYPE_GET = "Card";

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
  private List<CardPrimaryAccountNumber> primaryAccountNumbers;

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
  private Amount cardLimit;

  /**
   * The ATM spending limit for the card.
   */
  @Expose
  @SerializedName("card_limit_atm")
  private Amount cardLimitAtm;

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
   * Current monetary account (only for prepaid credit cards).
   */
  @Expose
  @SerializedName("monetary_account")
  private MonetaryAccount monetaryAccount;

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
  private CardReplacement cardReplacement;

  /**
   * The generated CVC2 code for this card.
   */
  @Expose
  @SerializedName("card_generated_cvc2")
  private CardGeneratedCvc2 cardGeneratedCvc2;

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
  private CompanyEmployeeCard companyEmployeeCard;

  /**
   * The plaintext pin code. Requests require encryption to be enabled.
   */
  @Expose
  @SerializedName("pin_code_field_for_request")
  private String pinCodeFieldForRequest;

  /**
   * DEPRECATED: Activate a card by setting status to ACTIVE when the order_status is
   * ACCEPTED_FOR_PRODUCTION.
   */
  @Expose
  @SerializedName("activation_code_field_for_request")
  private String activationCodeFieldForRequest;

  /**
   * The status to set for the card. Can be ACTIVE, DEACTIVATED, LOST, STOLEN or CANCELLED, and
   * can only be set to LOST/STOLEN/CANCELLED when order status is
   * ACCEPTED_FOR_PRODUCTION/DELIVERED_TO_CUSTOMER/CARD_UPDATE_REQUESTED/CARD_UPDATE_SENT/CARD_UPDATE_ACCEPTED.
   * Can only be set to DEACTIVATED after initial activation, i.e. order_status is
   * DELIVERED_TO_CUSTOMER/CARD_UPDATE_REQUESTED/CARD_UPDATE_SENT/CARD_UPDATE_ACCEPTED. Mind that
   * all the possible choices (apart from ACTIVE and DEACTIVATED) are permanent and cannot be
   * changed after.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The order status to set for the card. Set to CARD_REQUEST_PENDING to get a virtual card
   * produced.
   */
  @Expose
  @SerializedName("order_status_field_for_request")
  private String orderStatusFieldForRequest;

  /**
   * The spending limit for the card.
   */
  @Expose
  @SerializedName("card_limit_field_for_request")
  private Amount cardLimitFieldForRequest;

  /**
   * The ATM spending limit for the card.
   */
  @Expose
  @SerializedName("card_limit_atm_field_for_request")
  private Amount cardLimitAtmFieldForRequest;

  /**
   * The countries for which to grant (temporary) permissions to use the card.
   */
  @Expose
  @SerializedName("country_permission_field_for_request")
  private List<CardCountryPermission> countryPermissionFieldForRequest;

  /**
   * Array of Types, PINs, account IDs assigned to the card.
   */
  @Expose
  @SerializedName("pin_code_assignment_field_for_request")
  private List<CardPinAssignment> pinCodeAssignmentFieldForRequest;

  /**
   * Array of PANs and their attributes.
   */
  @Expose
  @SerializedName("primary_account_numbers_field_for_request")
  private List<CardPrimaryAccountNumber> primaryAccountNumbersFieldForRequest;

  /**
   * ID of the MA to be used as fallback for this card if insufficient balance. Fallback account
   * is removed if not supplied.
   */
  @Expose
  @SerializedName("monetary_account_id_fallback_field_for_request")
  private Integer monetaryAccountIdFallbackFieldForRequest;

  /**
   * The user's preferred name as it will be on the card.
   */
  @Expose
  @SerializedName("preferred_name_on_card_field_for_request")
  private String preferredNameOnCardFieldForRequest;

  /**
   * The second line of text on the card
   */
  @Expose
  @SerializedName("second_line_field_for_request")
  private String secondLineFieldForRequest;

  /**
   * The reason for card cancellation.
   */
  @Expose
  @SerializedName("cancellation_reason_field_for_request")
  private String cancellationReasonFieldForRequest;

  public Card() {
  this(null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public Card(String pinCode) {
  this(pinCode, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public Card(String pinCode, String activationCode) {
  this(pinCode, activationCode, null, null, null, null, null, null, null, null, null, null, null);
  }

  public Card(String pinCode, String activationCode, String status) {
  this(pinCode, activationCode, status, null, null, null, null, null, null, null, null, null, null);
  }

  public Card(String pinCode, String activationCode, String status, String orderStatus) {
  this(pinCode, activationCode, status, orderStatus, null, null, null, null, null, null, null, null, null);
  }

  public Card(String pinCode, String activationCode, String status, String orderStatus, Amount cardLimit) {
  this(pinCode, activationCode, status, orderStatus, cardLimit, null, null, null, null, null, null, null, null);
  }

  public Card(String pinCode, String activationCode, String status, String orderStatus, Amount cardLimit, Amount cardLimitAtm) {
  this(pinCode, activationCode, status, orderStatus, cardLimit, cardLimitAtm, null, null, null, null, null, null, null);
  }

  public Card(String pinCode, String activationCode, String status, String orderStatus, Amount cardLimit, Amount cardLimitAtm, List<CardCountryPermission> countryPermission) {
  this(pinCode, activationCode, status, orderStatus, cardLimit, cardLimitAtm, countryPermission, null, null, null, null, null, null);
  }

  public Card(String pinCode, String activationCode, String status, String orderStatus, Amount cardLimit, Amount cardLimitAtm, List<CardCountryPermission> countryPermission, List<CardPinAssignment> pinCodeAssignment) {
  this(pinCode, activationCode, status, orderStatus, cardLimit, cardLimitAtm, countryPermission, pinCodeAssignment, null, null, null, null, null);
  }

  public Card(String pinCode, String activationCode, String status, String orderStatus, Amount cardLimit, Amount cardLimitAtm, List<CardCountryPermission> countryPermission, List<CardPinAssignment> pinCodeAssignment, List<CardPrimaryAccountNumber> primaryAccountNumbers) {
  this(pinCode, activationCode, status, orderStatus, cardLimit, cardLimitAtm, countryPermission, pinCodeAssignment, primaryAccountNumbers, null, null, null, null);
  }

  public Card(String pinCode, String activationCode, String status, String orderStatus, Amount cardLimit, Amount cardLimitAtm, List<CardCountryPermission> countryPermission, List<CardPinAssignment> pinCodeAssignment, List<CardPrimaryAccountNumber> primaryAccountNumbers, Integer monetaryAccountIdFallback) {
  this(pinCode, activationCode, status, orderStatus, cardLimit, cardLimitAtm, countryPermission, pinCodeAssignment, primaryAccountNumbers, monetaryAccountIdFallback, null, null, null);
  }

  public Card(String pinCode, String activationCode, String status, String orderStatus, Amount cardLimit, Amount cardLimitAtm, List<CardCountryPermission> countryPermission, List<CardPinAssignment> pinCodeAssignment, List<CardPrimaryAccountNumber> primaryAccountNumbers, Integer monetaryAccountIdFallback, String preferredNameOnCard) {
  this(pinCode, activationCode, status, orderStatus, cardLimit, cardLimitAtm, countryPermission, pinCodeAssignment, primaryAccountNumbers, monetaryAccountIdFallback, preferredNameOnCard, null, null);
  }

  public Card(String pinCode, String activationCode, String status, String orderStatus, Amount cardLimit, Amount cardLimitAtm, List<CardCountryPermission> countryPermission, List<CardPinAssignment> pinCodeAssignment, List<CardPrimaryAccountNumber> primaryAccountNumbers, Integer monetaryAccountIdFallback, String preferredNameOnCard, String secondLine) {
  this(pinCode, activationCode, status, orderStatus, cardLimit, cardLimitAtm, countryPermission, pinCodeAssignment, primaryAccountNumbers, monetaryAccountIdFallback, preferredNameOnCard, secondLine, null);
  }

  public Card(String pinCode, String activationCode, String status, String orderStatus, Amount cardLimit, Amount cardLimitAtm, List<CardCountryPermission> countryPermission, List<CardPinAssignment> pinCodeAssignment, List<CardPrimaryAccountNumber> primaryAccountNumbers, Integer monetaryAccountIdFallback, String preferredNameOnCard, String secondLine, String cancellationReason) {
    this.pinCodeFieldForRequest = pinCode;
    this.activationCodeFieldForRequest = activationCode;
    this.statusFieldForRequest = status;
    this.orderStatusFieldForRequest = orderStatus;
    this.cardLimitFieldForRequest = cardLimit;
    this.cardLimitAtmFieldForRequest = cardLimitAtm;
    this.countryPermissionFieldForRequest = countryPermission;
    this.pinCodeAssignmentFieldForRequest = pinCodeAssignment;
    this.primaryAccountNumbersFieldForRequest = primaryAccountNumbers;
    this.monetaryAccountIdFallbackFieldForRequest = monetaryAccountIdFallback;
    this.preferredNameOnCardFieldForRequest = preferredNameOnCard;
    this.secondLineFieldForRequest = secondLine;
    this.cancellationReasonFieldForRequest = cancellationReason;
  }  /**
   * Update the card details. Allow to change pin code, status, limits, country permissions and
   * the monetary account connected to the card. When the card has been received, it can be also
   * activated through this endpoint.
   * @param pinCode The plaintext pin code. Requests require encryption to be enabled.
   * @param activationCode DEPRECATED: Activate a card by setting status to ACTIVE when the
   * order_status is ACCEPTED_FOR_PRODUCTION.
   * @param status The status to set for the card. Can be ACTIVE, DEACTIVATED, LOST, STOLEN or
   * CANCELLED, and can only be set to LOST/STOLEN/CANCELLED when order status is
   * ACCEPTED_FOR_PRODUCTION/DELIVERED_TO_CUSTOMER/CARD_UPDATE_REQUESTED/CARD_UPDATE_SENT/CARD_UPDATE_ACCEPTED.
   * Can only be set to DEACTIVATED after initial activation, i.e. order_status is
   * DELIVERED_TO_CUSTOMER/CARD_UPDATE_REQUESTED/CARD_UPDATE_SENT/CARD_UPDATE_ACCEPTED. Mind that
   * all the possible choices (apart from ACTIVE and DEACTIVATED) are permanent and cannot be
   * changed after.
   * @param orderStatus The order status to set for the card. Set to CARD_REQUEST_PENDING to get a
   * virtual card produced.
   * @param cardLimit The spending limit for the card.
   * @param cardLimitAtm The ATM spending limit for the card.
   * @param countryPermission The countries for which to grant (temporary) permissions to use the
   * card.
   * @param pinCodeAssignment Array of Types, PINs, account IDs assigned to the card.
   * @param primaryAccountNumbers Array of PANs and their attributes.
   * @param monetaryAccountIdFallback ID of the MA to be used as fallback for this card if
   * insufficient balance. Fallback account is removed if not supplied.
   * @param preferredNameOnCard The user's preferred name as it will be on the card.
   * @param secondLine The second line of text on the card
   * @param cancellationReason The reason for card cancellation.
   */
  public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode, String status, String orderStatus, Amount cardLimit, Amount cardLimitAtm, List<CardCountryPermission> countryPermission, List<CardPinAssignment> pinCodeAssignment, List<CardPrimaryAccountNumber> primaryAccountNumbers, Integer monetaryAccountIdFallback, String preferredNameOnCard, String secondLine, String cancellationReason, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_PIN_CODE, pinCode);
requestMap.put(FIELD_ACTIVATION_CODE, activationCode);
requestMap.put(FIELD_STATUS, status);
requestMap.put(FIELD_ORDER_STATUS, orderStatus);
requestMap.put(FIELD_CARD_LIMIT, cardLimit);
requestMap.put(FIELD_CARD_LIMIT_ATM, cardLimitAtm);
requestMap.put(FIELD_COUNTRY_PERMISSION, countryPermission);
requestMap.put(FIELD_PIN_CODE_ASSIGNMENT, pinCodeAssignment);
requestMap.put(FIELD_PRIMARY_ACCOUNT_NUMBERS, primaryAccountNumbers);
requestMap.put(FIELD_MONETARY_ACCOUNT_ID_FALLBACK, monetaryAccountIdFallback);
requestMap.put(FIELD_PREFERRED_NAME_ON_CARD, preferredNameOnCard);
requestMap.put(FIELD_SECOND_LINE, secondLine);
requestMap.put(FIELD_CANCELLATION_REASON, cancellationReason);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), cardId), requestBytes, customHeaders);

    return fromJson(Card.class, responseRaw, OBJECT_TYPE_PUT);
  }

  public static BunqResponse<Card> update(Integer cardId) {
    return update(cardId, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Card> update(Integer cardId, String pinCode) {
    return update(cardId, pinCode, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode) {
    return update(cardId, pinCode, activationCode, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode, String status) {
    return update(cardId, pinCode, activationCode, status, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode, String status, String orderStatus) {
    return update(cardId, pinCode, activationCode, status, orderStatus, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode, String status, String orderStatus, Amount cardLimit) {
    return update(cardId, pinCode, activationCode, status, orderStatus, cardLimit, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode, String status, String orderStatus, Amount cardLimit, Amount cardLimitAtm) {
    return update(cardId, pinCode, activationCode, status, orderStatus, cardLimit, cardLimitAtm, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode, String status, String orderStatus, Amount cardLimit, Amount cardLimitAtm, List<CardCountryPermission> countryPermission) {
    return update(cardId, pinCode, activationCode, status, orderStatus, cardLimit, cardLimitAtm, countryPermission, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode, String status, String orderStatus, Amount cardLimit, Amount cardLimitAtm, List<CardCountryPermission> countryPermission, List<CardPinAssignment> pinCodeAssignment) {
    return update(cardId, pinCode, activationCode, status, orderStatus, cardLimit, cardLimitAtm, countryPermission, pinCodeAssignment, null, null, null, null, null, null);
  }

  public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode, String status, String orderStatus, Amount cardLimit, Amount cardLimitAtm, List<CardCountryPermission> countryPermission, List<CardPinAssignment> pinCodeAssignment, List<CardPrimaryAccountNumber> primaryAccountNumbers) {
    return update(cardId, pinCode, activationCode, status, orderStatus, cardLimit, cardLimitAtm, countryPermission, pinCodeAssignment, primaryAccountNumbers, null, null, null, null, null);
  }

  public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode, String status, String orderStatus, Amount cardLimit, Amount cardLimitAtm, List<CardCountryPermission> countryPermission, List<CardPinAssignment> pinCodeAssignment, List<CardPrimaryAccountNumber> primaryAccountNumbers, Integer monetaryAccountIdFallback) {
    return update(cardId, pinCode, activationCode, status, orderStatus, cardLimit, cardLimitAtm, countryPermission, pinCodeAssignment, primaryAccountNumbers, monetaryAccountIdFallback, null, null, null, null);
  }

  public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode, String status, String orderStatus, Amount cardLimit, Amount cardLimitAtm, List<CardCountryPermission> countryPermission, List<CardPinAssignment> pinCodeAssignment, List<CardPrimaryAccountNumber> primaryAccountNumbers, Integer monetaryAccountIdFallback, String preferredNameOnCard) {
    return update(cardId, pinCode, activationCode, status, orderStatus, cardLimit, cardLimitAtm, countryPermission, pinCodeAssignment, primaryAccountNumbers, monetaryAccountIdFallback, preferredNameOnCard, null, null, null);
  }

  public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode, String status, String orderStatus, Amount cardLimit, Amount cardLimitAtm, List<CardCountryPermission> countryPermission, List<CardPinAssignment> pinCodeAssignment, List<CardPrimaryAccountNumber> primaryAccountNumbers, Integer monetaryAccountIdFallback, String preferredNameOnCard, String secondLine) {
    return update(cardId, pinCode, activationCode, status, orderStatus, cardLimit, cardLimitAtm, countryPermission, pinCodeAssignment, primaryAccountNumbers, monetaryAccountIdFallback, preferredNameOnCard, secondLine, null, null);
  }

  public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode, String status, String orderStatus, Amount cardLimit, Amount cardLimitAtm, List<CardCountryPermission> countryPermission, List<CardPinAssignment> pinCodeAssignment, List<CardPrimaryAccountNumber> primaryAccountNumbers, Integer monetaryAccountIdFallback, String preferredNameOnCard, String secondLine, String cancellationReason) {
    return update(cardId, pinCode, activationCode, status, orderStatus, cardLimit, cardLimitAtm, countryPermission, pinCodeAssignment, primaryAccountNumbers, monetaryAccountIdFallback, preferredNameOnCard, secondLine, cancellationReason, null);
  }

  /**
   * Return the details of a specific card.
   */
  public static BunqResponse<Card> get(Integer cardId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), cardId), params, customHeaders);

    return fromJson(Card.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<Card> get() {
    return get(null, null, null);
  }

  public static BunqResponse<Card> get(Integer cardId) {
    return get(cardId, null, null);
  }

  public static BunqResponse<Card> get(Integer cardId, Map<String, String> params) {
    return get(cardId, params, null);
  }

  /**
   * Return all the cards available to the user.
   */
  public static BunqResponse<List<Card>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(Card.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<Card>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<Card>> list(Map<String, String> params) {
    return list(params, null);
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
  public List<CardPrimaryAccountNumber> getPrimaryAccountNumbers() {
    return this.primaryAccountNumbers;
  }

  public void setPrimaryAccountNumbers(List<CardPrimaryAccountNumber> primaryAccountNumbers) {
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
  public Amount getCardLimit() {
    return this.cardLimit;
  }

  public void setCardLimit(Amount cardLimit) {
    this.cardLimit = cardLimit;
  }

  /**
   * The ATM spending limit for the card.
   */
  public Amount getCardLimitAtm() {
    return this.cardLimitAtm;
  }

  public void setCardLimitAtm(Amount cardLimitAtm) {
    this.cardLimitAtm = cardLimitAtm;
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
   * Current monetary account (only for prepaid credit cards).
   */
  public MonetaryAccount getMonetaryAccount() {
    return this.monetaryAccount;
  }

  public void setMonetaryAccount(MonetaryAccount monetaryAccount) {
    this.monetaryAccount = monetaryAccount;
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
  public CardReplacement getCardReplacement() {
    return this.cardReplacement;
  }

  public void setCardReplacement(CardReplacement cardReplacement) {
    this.cardReplacement = cardReplacement;
  }

  /**
   * The generated CVC2 code for this card.
   */
  public CardGeneratedCvc2 getCardGeneratedCvc2() {
    return this.cardGeneratedCvc2;
  }

  public void setCardGeneratedCvc2(CardGeneratedCvc2 cardGeneratedCvc2) {
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
  public CompanyEmployeeCard getCompanyEmployeeCard() {
    return this.companyEmployeeCard;
  }

  public void setCompanyEmployeeCard(CompanyEmployeeCard companyEmployeeCard) {
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
  public static Card fromJsonReader(JsonReader reader) {
    return fromJsonReader(Card.class, reader);
  }

}
