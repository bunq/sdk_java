package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
   * The status of the card pin assignment.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * Routing type.
   */
  @Expose
  @SerializedName("routing_type")
  private String routingType;

  /**
   * PIN type. Can be PRIMARY, SECONDARY or TERTIARY
   */
  @Expose
  @SerializedName("type_field_for_request")
  private String typeFieldForRequest;

  /**
   * Routing type. Can be MANUAL or AUTOMATIC
   */
  @Expose
  @SerializedName("routing_type_field_for_request")
  private String routingTypeFieldForRequest;

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
  this(null, null, null, null);
  }

  public CardPinAssignment(String type) {
  this(type, null, null, null);
  }

  public CardPinAssignment(String type, String routingType) {
  this(type, routingType, null, null);
  }

  public CardPinAssignment(String type, String routingType, String pinCode) {
  this(type, routingType, pinCode, null);
  }

  public CardPinAssignment(String type, String routingType, String pinCode, Integer monetaryAccountId) {
    this.typeFieldForRequest = type;
    this.routingTypeFieldForRequest = routingType;
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
   * The status of the card pin assignment.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Routing type.
   */
  public String getRoutingType() {
    return this.routingType;
  }

  public void setRoutingType(String routingType) {
    this.routingType = routingType;
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

    if (this.status != null) {
      return false;
    }

    if (this.routingType != null) {
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
