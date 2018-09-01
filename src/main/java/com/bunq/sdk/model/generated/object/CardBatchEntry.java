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
public class CardBatchEntry extends BunqModel {

  /**
   * The ID of the card that needs to be updated.
   */
  @Expose
  @SerializedName("id_field_for_request")
  private Integer idFieldForRequest;

  /**
   * The activation code required to set status to ACTIVE initially. Can only set status to ACTIVE
   * using activation code when order_status is ACCEPTED_FOR_PRODUCTION and status is DEACTIVATED.
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
   * The limits to define for the card, among CARD_LIMIT_CONTACTLESS, CARD_LIMIT_ATM,
   * CARD_LIMIT_DIPPING and CARD_LIMIT_POS_ICC (e.g. 25 EUR for CARD_LIMIT_CONTACTLESS). All the
   * limits must be provided on update.
   */
  @Expose
  @SerializedName("limit_field_for_request")
  private List<CardLimit> limitFieldForRequest;

  /**
   * Whether or not it is allowed to use the mag stripe for the card.
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
   * ID of the MA to be used as fallback for this card if insufficient balance. Fallback account
   * is removed if not supplied.
   */
  @Expose
  @SerializedName("monetary_account_id_fallback_field_for_request")
  private Integer monetaryAccountIdFallbackFieldForRequest;

  public CardBatchEntry() {
  this(null, null, null, null, null, null, null);
  }

  public CardBatchEntry(Integer id) {
  this(id, null, null, null, null, null, null);
  }

  public CardBatchEntry(Integer id, String activationCode) {
  this(id, activationCode, null, null, null, null, null);
  }

  public CardBatchEntry(Integer id, String activationCode, String status) {
  this(id, activationCode, status, null, null, null, null);
  }

  public CardBatchEntry(Integer id, String activationCode, String status, List<CardLimit> limit) {
  this(id, activationCode, status, limit, null, null, null);
  }

  public CardBatchEntry(Integer id, String activationCode, String status, List<CardLimit> limit, CardMagStripePermission magStripePermission) {
  this(id, activationCode, status, limit, magStripePermission, null, null);
  }

  public CardBatchEntry(Integer id, String activationCode, String status, List<CardLimit> limit, CardMagStripePermission magStripePermission, List<CardCountryPermission> countryPermission) {
  this(id, activationCode, status, limit, magStripePermission, countryPermission, null);
  }

  public CardBatchEntry(Integer id, String activationCode, String status, List<CardLimit> limit, CardMagStripePermission magStripePermission, List<CardCountryPermission> countryPermission, Integer monetaryAccountIdFallback) {
    this.idFieldForRequest = id;
    this.activationCodeFieldForRequest = activationCode;
    this.statusFieldForRequest = status;
    this.limitFieldForRequest = limit;
    this.magStripePermissionFieldForRequest = magStripePermission;
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
  public static CardBatchEntry fromJsonReader(JsonReader reader) {
    return fromJsonReader(CardBatchEntry.class, reader);
  }

}
