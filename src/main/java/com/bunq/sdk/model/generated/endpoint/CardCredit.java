package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.CardPinAssignment;
import com.bunq.sdk.model.generated.object.Pointer;
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
public class CardCredit extends BunqModel {

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
  private Pointer aliasFieldForRequest;

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
  private List<CardPinAssignment> pinCodeAssignmentFieldForRequest;

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

  public CardCredit() {
  this(null, null, null, null, null, null, null, null, null, null);
  }

  public CardCredit(String secondLine) {
  this(secondLine, null, null, null, null, null, null, null, null, null);
  }

  public CardCredit(String secondLine, String nameOnCard) {
  this(secondLine, nameOnCard, null, null, null, null, null, null, null, null);
  }

  public CardCredit(String secondLine, String nameOnCard, String type) {
  this(secondLine, nameOnCard, type, null, null, null, null, null, null, null);
  }

  public CardCredit(String secondLine, String nameOnCard, String type, String productType) {
  this(secondLine, nameOnCard, type, productType, null, null, null, null, null, null);
  }

  public CardCredit(String secondLine, String nameOnCard, String type, String productType, String firstLine) {
  this(secondLine, nameOnCard, type, productType, firstLine, null, null, null, null, null);
  }

  public CardCredit(String secondLine, String nameOnCard, String type, String productType, String firstLine, String preferredNameOnCard) {
  this(secondLine, nameOnCard, type, productType, firstLine, preferredNameOnCard, null, null, null, null);
  }

  public CardCredit(String secondLine, String nameOnCard, String type, String productType, String firstLine, String preferredNameOnCard, Pointer alias) {
  this(secondLine, nameOnCard, type, productType, firstLine, preferredNameOnCard, alias, null, null, null);
  }

  public CardCredit(String secondLine, String nameOnCard, String type, String productType, String firstLine, String preferredNameOnCard, Pointer alias, List<CardPinAssignment> pinCodeAssignment) {
  this(secondLine, nameOnCard, type, productType, firstLine, preferredNameOnCard, alias, pinCodeAssignment, null, null);
  }

  public CardCredit(String secondLine, String nameOnCard, String type, String productType, String firstLine, String preferredNameOnCard, Pointer alias, List<CardPinAssignment> pinCodeAssignment, Integer monetaryAccountIdFallback) {
  this(secondLine, nameOnCard, type, productType, firstLine, preferredNameOnCard, alias, pinCodeAssignment, monetaryAccountIdFallback, null);
  }

  public CardCredit(String secondLine, String nameOnCard, String type, String productType, String firstLine, String preferredNameOnCard, Pointer alias, List<CardPinAssignment> pinCodeAssignment, Integer monetaryAccountIdFallback, String orderStatus) {
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
  public static BunqResponse<CardCredit> create(String secondLine, String nameOnCard, String type, String productType, String firstLine, String preferredNameOnCard, Pointer alias, List<CardPinAssignment> pinCodeAssignment, Integer monetaryAccountIdFallback, String orderStatus, Map<String, String> customHeaders) {
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

    return fromJson(CardCredit.class, responseRaw, OBJECT_TYPE_POST);
  }

  public static BunqResponse<CardCredit> create() {
    return create(null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<CardCredit> create(String secondLine) {
    return create(secondLine, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<CardCredit> create(String secondLine, String nameOnCard) {
    return create(secondLine, nameOnCard, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<CardCredit> create(String secondLine, String nameOnCard, String type) {
    return create(secondLine, nameOnCard, type, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<CardCredit> create(String secondLine, String nameOnCard, String type, String productType) {
    return create(secondLine, nameOnCard, type, productType, null, null, null, null, null, null, null);
  }

  public static BunqResponse<CardCredit> create(String secondLine, String nameOnCard, String type, String productType, String firstLine) {
    return create(secondLine, nameOnCard, type, productType, firstLine, null, null, null, null, null, null);
  }

  public static BunqResponse<CardCredit> create(String secondLine, String nameOnCard, String type, String productType, String firstLine, String preferredNameOnCard) {
    return create(secondLine, nameOnCard, type, productType, firstLine, preferredNameOnCard, null, null, null, null, null);
  }

  public static BunqResponse<CardCredit> create(String secondLine, String nameOnCard, String type, String productType, String firstLine, String preferredNameOnCard, Pointer alias) {
    return create(secondLine, nameOnCard, type, productType, firstLine, preferredNameOnCard, alias, null, null, null, null);
  }

  public static BunqResponse<CardCredit> create(String secondLine, String nameOnCard, String type, String productType, String firstLine, String preferredNameOnCard, Pointer alias, List<CardPinAssignment> pinCodeAssignment) {
    return create(secondLine, nameOnCard, type, productType, firstLine, preferredNameOnCard, alias, pinCodeAssignment, null, null, null);
  }

  public static BunqResponse<CardCredit> create(String secondLine, String nameOnCard, String type, String productType, String firstLine, String preferredNameOnCard, Pointer alias, List<CardPinAssignment> pinCodeAssignment, Integer monetaryAccountIdFallback) {
    return create(secondLine, nameOnCard, type, productType, firstLine, preferredNameOnCard, alias, pinCodeAssignment, monetaryAccountIdFallback, null, null);
  }

  public static BunqResponse<CardCredit> create(String secondLine, String nameOnCard, String type, String productType, String firstLine, String preferredNameOnCard, Pointer alias, List<CardPinAssignment> pinCodeAssignment, Integer monetaryAccountIdFallback, String orderStatus) {
    return create(secondLine, nameOnCard, type, productType, firstLine, preferredNameOnCard, alias, pinCodeAssignment, monetaryAccountIdFallback, orderStatus, null);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static CardCredit fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardCredit.class, reader);
  }

}
