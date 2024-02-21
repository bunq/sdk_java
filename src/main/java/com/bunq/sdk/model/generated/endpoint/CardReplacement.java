package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Address;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Endpoint for getting the Card Replacement of a card.
 */
public class CardReplacement extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_ADDRESS_MAIN = "address_main";
  public static final String FIELD_ADDRESS_POSTAL = "address_postal";

  /**
   * The status of the CardReplacement.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The original card that belongs to the CardReplacement.
   */
  @Expose
  @SerializedName("card_id")
  private Integer cardId;

  /**
   * The new card that replaces the original card in the CardReplacement.
   */
  @Expose
  @SerializedName("card_new_id")
  private Integer cardNewId;

  /**
   * The status of the CardReplacement.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The user's main address.
   */
  @Expose
  @SerializedName("address_main_field_for_request")
  private Address addressMainFieldForRequest;

  /**
   * The user's postal address.
   */
  @Expose
  @SerializedName("address_postal_field_for_request")
  private Address addressPostalFieldForRequest;

  public CardReplacement() {
  this(null, null, null);
  }

  public CardReplacement(String status) {
  this(status, null, null);
  }

  public CardReplacement(String status, Address addressMain) {
  this(status, addressMain, null);
  }

  public CardReplacement(String status, Address addressMain, Address addressPostal) {
    this.statusFieldForRequest = status;
    this.addressMainFieldForRequest = addressMain;
    this.addressPostalFieldForRequest = addressPostal;
  }

  /**
   * The status of the CardReplacement.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The original card that belongs to the CardReplacement.
   */
  public Integer getCardId() {
    return this.cardId;
  }

  public void setCardId(Integer cardId) {
    this.cardId = cardId;
  }

  /**
   * The new card that replaces the original card in the CardReplacement.
   */
  public Integer getCardNewId() {
    return this.cardNewId;
  }

  public void setCardNewId(Integer cardNewId) {
    this.cardNewId = cardNewId;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.status != null) {
      return false;
    }

    if (this.cardId != null) {
      return false;
    }

    if (this.cardNewId != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CardReplacement fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardReplacement.class, reader);
  }

}
