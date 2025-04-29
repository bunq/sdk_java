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
public class CardBatchEntryObject extends BunqModel {

  /**
   * The ID of the card that needs to be updated.
   */
  @Expose
  @SerializedName("id_field_for_request")
  private Integer idFieldForRequest;

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
  private AmountObject cardLimitFieldForRequest;

  /**
   * The ATM spending limit for the card.
   */
  @Expose
  @SerializedName("card_limit_atm_field_for_request")
  private AmountObject cardLimitAtmFieldForRequest;

  /**
   * The countries for which to grant (temporary) permissions to use the card.
   */
  @Expose
  @SerializedName("country_permission_field_for_request")
  private List<CardCountryPermissionObject> countryPermissionFieldForRequest;

  /**
   * ID of the MA to be used as fallback for this card if insufficient balance. Fallback account
   * is removed if not supplied.
   */
  @Expose
  @SerializedName("monetary_account_id_fallback_field_for_request")
  private Integer monetaryAccountIdFallbackFieldForRequest;

  public CardBatchEntryObject() {
  this(null, null, null, null, null, null);
  }

  public CardBatchEntryObject(Integer id) {
  this(id, null, null, null, null, null);
  }

  public CardBatchEntryObject(Integer id, String status) {
  this(id, status, null, null, null, null);
  }

  public CardBatchEntryObject(Integer id, String status, AmountObject cardLimit) {
  this(id, status, cardLimit, null, null, null);
  }

  public CardBatchEntryObject(Integer id, String status, AmountObject cardLimit, AmountObject cardLimitAtm) {
  this(id, status, cardLimit, cardLimitAtm, null, null);
  }

  public CardBatchEntryObject(Integer id, String status, AmountObject cardLimit, AmountObject cardLimitAtm, List<CardCountryPermissionObject> countryPermission) {
  this(id, status, cardLimit, cardLimitAtm, countryPermission, null);
  }

  public CardBatchEntryObject(Integer id, String status, AmountObject cardLimit, AmountObject cardLimitAtm, List<CardCountryPermissionObject> countryPermission, Integer monetaryAccountIdFallback) {
    this.idFieldForRequest = id;
    this.statusFieldForRequest = status;
    this.cardLimitFieldForRequest = cardLimit;
    this.cardLimitAtmFieldForRequest = cardLimitAtm;
    this.countryPermissionFieldForRequest = countryPermission;
    this.monetaryAccountIdFallbackFieldForRequest = monetaryAccountIdFallback;
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static CardBatchEntryObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardBatchEntryObject.class, reader);
  }

}
