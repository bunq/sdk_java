package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.*;
import com.bunq.sdk.security.SecurityUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public static final String FIELD_CARD_LIMIT = "card_limit";
    public static final String FIELD_CARD_LIMIT_ATM = "card_limit_atm";
    public static final String FIELD_MAG_STRIPE_PERMISSION = "mag_stripe_permission";
    public static final String FIELD_COUNTRY_PERMISSION = "country_permission";
    public static final String FIELD_PIN_CODE_ASSIGNMENT = "pin_code_assignment";
    public static final String FIELD_PRIMARY_ACCOUNT_NUMBERS_VIRTUAL = "primary_account_numbers_virtual";
    public static final String FIELD_PRIMARY_ACCOUNT_NUMBERS = "primary_account_numbers";
    public static final String FIELD_MONETARY_ACCOUNT_ID_FALLBACK = "monetary_account_id_fallback";
    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_UPDATE = "user/%s/card/%s";
    protected static final String ENDPOINT_URL_READ = "user/%s/card/%s";
    protected static final String ENDPOINT_URL_LISTING = "user/%s/card";
    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_PUT = "CardDebit";
    protected static final String OBJECT_TYPE_GET = "CardDebit";

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
     * Array of PANs, status, description and account id for online cards.
     */
    @Expose
    @SerializedName("primary_account_numbers_virtual")
    private List<CardVirtualPrimaryAccountNumber> primaryAccountNumbersVirtual;

    /**
     * Array of PANs and their attributes.
     */
    @Expose
    @SerializedName("primary_account_numbers")
    private List<CardPrimaryAccountNumber> primaryAccountNumbers;

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
     * DEPRECATED: Whether or not it is allowed to use the mag stripe for the card.
     */
    @Expose
    @SerializedName("mag_stripe_permission_field_for_request")
    private CardMagStripePermission magStripePermissionFieldForRequest;

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
     * Array of PANs, status, description and account id for online cards.
     */
    @Expose
    @SerializedName("primary_account_numbers_virtual_field_for_request")
    private List<CardVirtualPrimaryAccountNumber> primaryAccountNumbersVirtualFieldForRequest;

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

    public Card() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public Card(String pinCode) {
        this(pinCode, null, null, null, null, null, null, null, null, null, null);
    }

    public Card(String pinCode, String activationCode) {
        this(pinCode, activationCode, null, null, null, null, null, null, null, null, null);
    }

    public Card(String pinCode, String activationCode, String status) {
        this(pinCode, activationCode, status, null, null, null, null, null, null, null, null);
    }

    public Card(String pinCode, String activationCode, String status, Amount cardLimit) {
        this(pinCode, activationCode, status, cardLimit, null, null, null, null, null, null, null);
    }

    public Card(String pinCode, String activationCode, String status, Amount cardLimit, Amount cardLimitAtm) {
        this(pinCode, activationCode, status, cardLimit, cardLimitAtm, null, null, null, null, null, null);
    }

    public Card(String pinCode, String activationCode, String status, Amount cardLimit, Amount cardLimitAtm, CardMagStripePermission magStripePermission) {
        this(pinCode, activationCode, status, cardLimit, cardLimitAtm, magStripePermission, null, null, null, null, null);
    }

    public Card(String pinCode, String activationCode, String status, Amount cardLimit, Amount cardLimitAtm, CardMagStripePermission magStripePermission, List<CardCountryPermission> countryPermission) {
        this(pinCode, activationCode, status, cardLimit, cardLimitAtm, magStripePermission, countryPermission, null, null, null, null);
    }

    public Card(String pinCode, String activationCode, String status, Amount cardLimit, Amount cardLimitAtm, CardMagStripePermission magStripePermission, List<CardCountryPermission> countryPermission, List<CardPinAssignment> pinCodeAssignment) {
        this(pinCode, activationCode, status, cardLimit, cardLimitAtm, magStripePermission, countryPermission, pinCodeAssignment, null, null, null);
    }

    public Card(String pinCode, String activationCode, String status, Amount cardLimit, Amount cardLimitAtm, CardMagStripePermission magStripePermission, List<CardCountryPermission> countryPermission, List<CardPinAssignment> pinCodeAssignment, List<CardVirtualPrimaryAccountNumber> primaryAccountNumbersVirtual) {
        this(pinCode, activationCode, status, cardLimit, cardLimitAtm, magStripePermission, countryPermission, pinCodeAssignment, primaryAccountNumbersVirtual, null, null);
    }

    public Card(String pinCode, String activationCode, String status, Amount cardLimit, Amount cardLimitAtm, CardMagStripePermission magStripePermission, List<CardCountryPermission> countryPermission, List<CardPinAssignment> pinCodeAssignment, List<CardVirtualPrimaryAccountNumber> primaryAccountNumbersVirtual, List<CardPrimaryAccountNumber> primaryAccountNumbers) {
        this(pinCode, activationCode, status, cardLimit, cardLimitAtm, magStripePermission, countryPermission, pinCodeAssignment, primaryAccountNumbersVirtual, primaryAccountNumbers, null);
    }

    public Card(String pinCode, String activationCode, String status, Amount cardLimit, Amount cardLimitAtm, CardMagStripePermission magStripePermission, List<CardCountryPermission> countryPermission, List<CardPinAssignment> pinCodeAssignment, List<CardVirtualPrimaryAccountNumber> primaryAccountNumbersVirtual, List<CardPrimaryAccountNumber> primaryAccountNumbers, Integer monetaryAccountIdFallback) {
        this.pinCodeFieldForRequest = pinCode;
        this.activationCodeFieldForRequest = activationCode;
        this.statusFieldForRequest = status;
        this.cardLimitFieldForRequest = cardLimit;
        this.cardLimitAtmFieldForRequest = cardLimitAtm;
        this.magStripePermissionFieldForRequest = magStripePermission;
        this.countryPermissionFieldForRequest = countryPermission;
        this.pinCodeAssignmentFieldForRequest = pinCodeAssignment;
        this.primaryAccountNumbersVirtualFieldForRequest = primaryAccountNumbersVirtual;
        this.primaryAccountNumbersFieldForRequest = primaryAccountNumbers;
        this.monetaryAccountIdFallbackFieldForRequest = monetaryAccountIdFallback;
    }

    /**
     * Update the card details. Allow to change pin code, status, limits, country permissions and
     * the monetary account connected to the card. When the card has been received, it can be also
     * activated through this endpoint.
     *
     * @param pinCode                      The plaintext pin code. Requests require encryption to be enabled.
     * @param activationCode               DEPRECATED: Activate a card by setting status to ACTIVE when the
     *                                     order_status is ACCEPTED_FOR_PRODUCTION.
     * @param status                       The status to set for the card. Can be ACTIVE, DEACTIVATED, LOST, STOLEN or
     *                                     CANCELLED, and can only be set to LOST/STOLEN/CANCELLED when order status is
     *                                     ACCEPTED_FOR_PRODUCTION/DELIVERED_TO_CUSTOMER/CARD_UPDATE_REQUESTED/CARD_UPDATE_SENT/CARD_UPDATE_ACCEPTED.
     *                                     Can only be set to DEACTIVATED after initial activation, i.e. order_status is
     *                                     DELIVERED_TO_CUSTOMER/CARD_UPDATE_REQUESTED/CARD_UPDATE_SENT/CARD_UPDATE_ACCEPTED. Mind that
     *                                     all the possible choices (apart from ACTIVE and DEACTIVATED) are permanent and cannot be
     *                                     changed after.
     * @param cardLimit                    The spending limit for the card.
     * @param cardLimitAtm                 The ATM spending limit for the card.
     * @param magStripePermission          DEPRECATED: Whether or not it is allowed to use the mag stripe for
     *                                     the card.
     * @param countryPermission            The countries for which to grant (temporary) permissions to use the
     *                                     card.
     * @param pinCodeAssignment            Array of Types, PINs, account IDs assigned to the card.
     * @param primaryAccountNumbersVirtual Array of PANs, status, description and account id for
     *                                     online cards.
     * @param primaryAccountNumbers        Array of PANs and their attributes.
     * @param monetaryAccountIdFallback    ID of the MA to be used as fallback for this card if
     *                                     insufficient balance. Fallback account is removed if not supplied.
     */
    public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode, String status, Amount cardLimit, Amount cardLimitAtm, CardMagStripePermission magStripePermission, List<CardCountryPermission> countryPermission, List<CardPinAssignment> pinCodeAssignment, List<CardVirtualPrimaryAccountNumber> primaryAccountNumbersVirtual, List<CardPrimaryAccountNumber> primaryAccountNumbers, Integer monetaryAccountIdFallback, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_PIN_CODE, pinCode);
        requestMap.put(FIELD_ACTIVATION_CODE, activationCode);
        requestMap.put(FIELD_STATUS, status);
        requestMap.put(FIELD_CARD_LIMIT, cardLimit);
        requestMap.put(FIELD_CARD_LIMIT_ATM, cardLimitAtm);
        requestMap.put(FIELD_MAG_STRIPE_PERMISSION, magStripePermission);
        requestMap.put(FIELD_COUNTRY_PERMISSION, countryPermission);
        requestMap.put(FIELD_PIN_CODE_ASSIGNMENT, pinCodeAssignment);
        requestMap.put(FIELD_PRIMARY_ACCOUNT_NUMBERS_VIRTUAL, primaryAccountNumbersVirtual);
        requestMap.put(FIELD_PRIMARY_ACCOUNT_NUMBERS, primaryAccountNumbers);
        requestMap.put(FIELD_MONETARY_ACCOUNT_ID_FALLBACK, monetaryAccountIdFallback);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        requestBytes = SecurityUtils.encrypt(getApiContext(), requestBytes, customHeaders);
        BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), cardId), requestBytes, customHeaders);

        return fromJson(Card.class, responseRaw, OBJECT_TYPE_PUT);
    }

    public static BunqResponse<Card> update(Integer cardId) {
        return update(cardId, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Card> update(Integer cardId, String pinCode) {
        return update(cardId, pinCode, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode) {
        return update(cardId, pinCode, activationCode, null, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode, String status) {
        return update(cardId, pinCode, activationCode, status, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode, String status, Amount cardLimit) {
        return update(cardId, pinCode, activationCode, status, cardLimit, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode, String status, Amount cardLimit, Amount cardLimitAtm) {
        return update(cardId, pinCode, activationCode, status, cardLimit, cardLimitAtm, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode, String status, Amount cardLimit, Amount cardLimitAtm, CardMagStripePermission magStripePermission) {
        return update(cardId, pinCode, activationCode, status, cardLimit, cardLimitAtm, magStripePermission, null, null, null, null, null, null);
    }

    public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode, String status, Amount cardLimit, Amount cardLimitAtm, CardMagStripePermission magStripePermission, List<CardCountryPermission> countryPermission) {
        return update(cardId, pinCode, activationCode, status, cardLimit, cardLimitAtm, magStripePermission, countryPermission, null, null, null, null, null);
    }

    public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode, String status, Amount cardLimit, Amount cardLimitAtm, CardMagStripePermission magStripePermission, List<CardCountryPermission> countryPermission, List<CardPinAssignment> pinCodeAssignment) {
        return update(cardId, pinCode, activationCode, status, cardLimit, cardLimitAtm, magStripePermission, countryPermission, pinCodeAssignment, null, null, null, null);
    }

    public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode, String status, Amount cardLimit, Amount cardLimitAtm, CardMagStripePermission magStripePermission, List<CardCountryPermission> countryPermission, List<CardPinAssignment> pinCodeAssignment, List<CardVirtualPrimaryAccountNumber> primaryAccountNumbersVirtual) {
        return update(cardId, pinCode, activationCode, status, cardLimit, cardLimitAtm, magStripePermission, countryPermission, pinCodeAssignment, primaryAccountNumbersVirtual, null, null, null);
    }

    public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode, String status, Amount cardLimit, Amount cardLimitAtm, CardMagStripePermission magStripePermission, List<CardCountryPermission> countryPermission, List<CardPinAssignment> pinCodeAssignment, List<CardVirtualPrimaryAccountNumber> primaryAccountNumbersVirtual, List<CardPrimaryAccountNumber> primaryAccountNumbers) {
        return update(cardId, pinCode, activationCode, status, cardLimit, cardLimitAtm, magStripePermission, countryPermission, pinCodeAssignment, primaryAccountNumbersVirtual, primaryAccountNumbers, null, null);
    }

    public static BunqResponse<Card> update(Integer cardId, String pinCode, String activationCode, String status, Amount cardLimit, Amount cardLimitAtm, CardMagStripePermission magStripePermission, List<CardCountryPermission> countryPermission, List<CardPinAssignment> pinCodeAssignment, List<CardVirtualPrimaryAccountNumber> primaryAccountNumbersVirtual, List<CardPrimaryAccountNumber> primaryAccountNumbers, Integer monetaryAccountIdFallback) {
        return update(cardId, pinCode, activationCode, status, cardLimit, cardLimitAtm, magStripePermission, countryPermission, pinCodeAssignment, primaryAccountNumbersVirtual, primaryAccountNumbers, monetaryAccountIdFallback, null);
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
     *
     */
    public static Card fromJsonReader(JsonReader reader) {
        return fromJsonReader(Card.class, reader);
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
     * Array of PANs, status, description and account id for online cards.
     */
    public List<CardVirtualPrimaryAccountNumber> getPrimaryAccountNumbersVirtual() {
        return this.primaryAccountNumbersVirtual;
    }

    public void setPrimaryAccountNumbersVirtual(List<CardVirtualPrimaryAccountNumber> primaryAccountNumbersVirtual) {
        this.primaryAccountNumbersVirtual = primaryAccountNumbersVirtual;
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
     *
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

        if (this.primaryAccountNumberFourDigit != null) {
            return false;
        }

        if (this.primaryAccountNumbersVirtual != null) {
            return false;
        }

        if (this.primaryAccountNumbers != null) {
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

}
