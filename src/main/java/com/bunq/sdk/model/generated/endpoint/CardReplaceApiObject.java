package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.CardPinAssignmentObject;
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
 * It is possible to order a card replacement with the bunq API.<br/><br/>You can order up to
 * one free card replacement per year. Additional replacement requests will be
 * billed.<br/><br/>The card replacement will have the same expiry date and the same pricing as
 * the old card, but it will have a new card number. You can change the description and optional
 * the PIN through the card replacement endpoint.
 */
public class CardReplaceApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/card/%s/replace";

  /**
   * Field constants.
   */
  public static final String FIELD_NAME_ON_CARD = "name_on_card";
  public static final String FIELD_PREFERRED_NAME_ON_CARD = "preferred_name_on_card";
  public static final String FIELD_PIN_CODE_ASSIGNMENT = "pin_code_assignment";
  public static final String FIELD_SECOND_LINE = "second_line";

  /**
   * The id of the new card.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

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
   * Array of Types, PINs, account IDs assigned to the card.
   */
  @Expose
  @SerializedName("pin_code_assignment_field_for_request")
  private List<CardPinAssignmentObject> pinCodeAssignmentFieldForRequest;

  /**
   * The second line on the card.
   */
  @Expose
  @SerializedName("second_line_field_for_request")
  private String secondLineFieldForRequest;

  public CardReplaceApiObject() {
  this(null, null, null, null);
  }

  public CardReplaceApiObject(String nameOnCard) {
  this(nameOnCard, null, null, null);
  }

  public CardReplaceApiObject(String nameOnCard, String preferredNameOnCard) {
  this(nameOnCard, preferredNameOnCard, null, null);
  }

  public CardReplaceApiObject(String nameOnCard, String preferredNameOnCard, List<CardPinAssignmentObject> pinCodeAssignment) {
  this(nameOnCard, preferredNameOnCard, pinCodeAssignment, null);
  }

  public CardReplaceApiObject(String nameOnCard, String preferredNameOnCard, List<CardPinAssignmentObject> pinCodeAssignment, String secondLine) {
    this.nameOnCardFieldForRequest = nameOnCard;
    this.preferredNameOnCardFieldForRequest = preferredNameOnCard;
    this.pinCodeAssignmentFieldForRequest = pinCodeAssignment;
    this.secondLineFieldForRequest = secondLine;
  }  /**
   * Request a card replacement.
   * @param nameOnCard The user's name as it will be on the card. Check 'card-name' for the
   * available card names for a user.
   * @param preferredNameOnCard The user's preferred name that can be put on the card.
   * @param pinCodeAssignment Array of Types, PINs, account IDs assigned to the card.
   * @param secondLine The second line on the card.
   */
  public static BunqResponse<Integer> create(Integer cardId, String nameOnCard, String preferredNameOnCard, List<CardPinAssignmentObject> pinCodeAssignment, String secondLine, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_NAME_ON_CARD, nameOnCard);
requestMap.put(FIELD_PREFERRED_NAME_ON_CARD, preferredNameOnCard);
requestMap.put(FIELD_PIN_CODE_ASSIGNMENT, pinCodeAssignment);
requestMap.put(FIELD_SECOND_LINE, secondLine);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), cardId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer cardId) {
    return create(cardId, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer cardId, String nameOnCard) {
    return create(cardId, nameOnCard, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer cardId, String nameOnCard, String preferredNameOnCard) {
    return create(cardId, nameOnCard, preferredNameOnCard, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer cardId, String nameOnCard, String preferredNameOnCard, List<CardPinAssignmentObject> pinCodeAssignment) {
    return create(cardId, nameOnCard, preferredNameOnCard, pinCodeAssignment, null, null);
  }

  public static BunqResponse<Integer> create(Integer cardId, String nameOnCard, String preferredNameOnCard, List<CardPinAssignmentObject> pinCodeAssignment, String secondLine) {
    return create(cardId, nameOnCard, preferredNameOnCard, pinCodeAssignment, secondLine, null);
  }

  /**
   * The id of the new card.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CardReplaceApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardReplaceApiObject.class, reader);
  }

}
