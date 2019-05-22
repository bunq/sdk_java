package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.security.SecurityUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.Map;

/**
 * It is possible to order a card replacement with the bunq API.<br/><br/>You can order up to
 * one free card replacement per year. Additional replacement requests will be
 * billed.<br/><br/>The card replacement will have the same expiry date and the same pricing as
 * the old card, but it will have a new card number. You can change the description and optional
 * the PIN through the card replacement endpoint.
 */
public class CardReplace extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_NAME_ON_CARD = "name_on_card";
  public static final String FIELD_PIN_CODE = "pin_code";
  public static final String FIELD_SECOND_LINE = "second_line";
  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/card/%s/replace";
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
   * The plaintext pin code. Requests require encryption to be enabled.
   */
  @Expose
  @SerializedName("pin_code_field_for_request")
  private String pinCodeFieldForRequest;

  /**
   * The second line on the card.
   */
  @Expose
  @SerializedName("second_line_field_for_request")
  private String secondLineFieldForRequest;

  public CardReplace() {
    this(null, null, null);
  }

  public CardReplace(String nameOnCard) {
    this(nameOnCard, null, null);
  }

  public CardReplace(String nameOnCard, String pinCode) {
    this(nameOnCard, pinCode, null);
  }

  public CardReplace(String nameOnCard, String pinCode, String secondLine) {
    this.nameOnCardFieldForRequest = nameOnCard;
    this.pinCodeFieldForRequest = pinCode;
    this.secondLineFieldForRequest = secondLine;
  }

  /**
   * Request a card replacement.
   *
   * @param nameOnCard The user's name as it will be on the card. Check 'card-name' for the
   *                   available card names for a user.
   * @param pinCode    The plaintext pin code. Requests require encryption to be enabled.
   * @param secondLine The second line on the card.
   */
  public static BunqResponse<Integer> create(Integer cardId, String nameOnCard, String pinCode, String secondLine, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_NAME_ON_CARD, nameOnCard);
    requestMap.put(FIELD_PIN_CODE, pinCode);
    requestMap.put(FIELD_SECOND_LINE, secondLine);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    requestBytes = SecurityUtils.encrypt(getApiContext(), requestBytes, customHeaders);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), cardId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer cardId) {
    return create(cardId, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer cardId, String nameOnCard) {
    return create(cardId, nameOnCard, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer cardId, String nameOnCard, String pinCode) {
    return create(cardId, nameOnCard, pinCode, null, null);
  }

  public static BunqResponse<Integer> create(Integer cardId, String nameOnCard, String pinCode, String secondLine) {
    return create(cardId, nameOnCard, pinCode, secondLine, null);
  }

  /**
   */
  public static CardReplace fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardReplace.class, reader);
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

}
