package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 */
public class CardPinAssignment extends BunqModel {

  /**
   * PIN type. Can be PRIMARY, SECONDARY or TERTIARY
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The ID of the monetary account to assign to this pin for the card.
   */
  @Expose
  @SerializedName("monetary_account_id")
  private Integer monetaryAccountId;

  /**
   * PIN type. Can be PRIMARY, SECONDARY or TERTIARY
   */
  @Expose
  @SerializedName("type_field_for_request")
  private String typeFieldForRequest;

  /**
   * The 4 digit PIN to be assigned to this account.
   */
  @Expose
  @SerializedName("pin_code_field_for_request")
  private String pinCodeFieldForRequest;

  /**
   * The ID of the monetary account to assign to this pin for the card.
   */
  @Expose
  @SerializedName("monetary_account_id_field_for_request")
  private Integer monetaryAccountIdFieldForRequest;

  public CardPinAssignment() {
    this(null, null, null);
  }

  public CardPinAssignment(String type) {
    this(type, null, null);
  }

  public CardPinAssignment(String type, String pinCode) {
    this(type, pinCode, null);
  }

  public CardPinAssignment(String type, String pinCode, Integer monetaryAccountId) {
    this.typeFieldForRequest = type;
    this.pinCodeFieldForRequest = pinCode;
    this.monetaryAccountIdFieldForRequest = monetaryAccountId;
  }

  /**
   * PIN type. Can be PRIMARY, SECONDARY or TERTIARY
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The ID of the monetary account to assign to this pin for the card.
   */
  public Integer getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(Integer monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.type != null) {
      return false;
    }

    if (this.monetaryAccountId != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CardPinAssignment fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardPinAssignment.class, reader);
  }

}
