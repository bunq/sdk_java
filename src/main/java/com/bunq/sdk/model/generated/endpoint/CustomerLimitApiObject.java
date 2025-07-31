package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AmountObject;
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
 * Show the limits for the authenticated user.
 */
public class CustomerLimitApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/limit";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "CustomerLimit";

  /**
   * The limit of monetary accounts.
   */
  @Expose
  @SerializedName("limit_monetary_account")
  private Long limitMonetaryAccount;

  /**
   * The amount of additional monetary accounts you can create.
   */
  @Expose
  @SerializedName("limit_monetary_account_remaining")
  private Long limitMonetaryAccountRemaining;

  /**
   * The limit of Maestro cards.
   */
  @Expose
  @SerializedName("limit_card_debit_maestro")
  private Long limitCardDebitMaestro;

  /**
   * The limit of MasterCard cards.
   */
  @Expose
  @SerializedName("limit_card_debit_mastercard")
  private Long limitCardDebitMastercard;

  /**
   * DEPRECTATED: The limit of wildcards, e.g. Maestro or MasterCard cards.
   */
  @Expose
  @SerializedName("limit_card_debit_wildcard")
  private Long limitCardDebitWildcard;

  /**
   * The limit of wildcards, e.g. Maestro or MasterCard cards.
   */
  @Expose
  @SerializedName("limit_card_wildcard")
  private Long limitCardWildcard;

  /**
   * The limit of free replacement cards.
   */
  @Expose
  @SerializedName("limit_card_replacement")
  private Long limitCardReplacement;

  /**
   * The maximum amount a user is allowed to spend in a month.
   */
  @Expose
  @SerializedName("limit_amount_monthly")
  private AmountObject limitAmountMonthly;

  /**
   * The amount the user has spent in the last month.
   */
  @Expose
  @SerializedName("spent_amount_monthly")
  private AmountObject spentAmountMonthly;

  /**
   * Get all limits for the authenticated user.
   */
  public static BunqResponse<List<CustomerLimitApiObject>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(CustomerLimitApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<CustomerLimitApiObject>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<CustomerLimitApiObject>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The limit of monetary accounts.
   */
  public Long getLimitMonetaryAccount() {
    return this.limitMonetaryAccount;
  }

  public void setLimitMonetaryAccount(Long limitMonetaryAccount) {
    this.limitMonetaryAccount = limitMonetaryAccount;
  }

  /**
   * The amount of additional monetary accounts you can create.
   */
  public Long getLimitMonetaryAccountRemaining() {
    return this.limitMonetaryAccountRemaining;
  }

  public void setLimitMonetaryAccountRemaining(Long limitMonetaryAccountRemaining) {
    this.limitMonetaryAccountRemaining = limitMonetaryAccountRemaining;
  }

  /**
   * The limit of Maestro cards.
   */
  public Long getLimitCardDebitMaestro() {
    return this.limitCardDebitMaestro;
  }

  public void setLimitCardDebitMaestro(Long limitCardDebitMaestro) {
    this.limitCardDebitMaestro = limitCardDebitMaestro;
  }

  /**
   * The limit of MasterCard cards.
   */
  public Long getLimitCardDebitMastercard() {
    return this.limitCardDebitMastercard;
  }

  public void setLimitCardDebitMastercard(Long limitCardDebitMastercard) {
    this.limitCardDebitMastercard = limitCardDebitMastercard;
  }

  /**
   * DEPRECTATED: The limit of wildcards, e.g. Maestro or MasterCard cards.
   */
  public Long getLimitCardDebitWildcard() {
    return this.limitCardDebitWildcard;
  }

  public void setLimitCardDebitWildcard(Long limitCardDebitWildcard) {
    this.limitCardDebitWildcard = limitCardDebitWildcard;
  }

  /**
   * The limit of wildcards, e.g. Maestro or MasterCard cards.
   */
  public Long getLimitCardWildcard() {
    return this.limitCardWildcard;
  }

  public void setLimitCardWildcard(Long limitCardWildcard) {
    this.limitCardWildcard = limitCardWildcard;
  }

  /**
   * The limit of free replacement cards.
   */
  public Long getLimitCardReplacement() {
    return this.limitCardReplacement;
  }

  public void setLimitCardReplacement(Long limitCardReplacement) {
    this.limitCardReplacement = limitCardReplacement;
  }

  /**
   * The maximum amount a user is allowed to spend in a month.
   */
  public AmountObject getLimitAmountMonthly() {
    return this.limitAmountMonthly;
  }

  public void setLimitAmountMonthly(AmountObject limitAmountMonthly) {
    this.limitAmountMonthly = limitAmountMonthly;
  }

  /**
   * The amount the user has spent in the last month.
   */
  public AmountObject getSpentAmountMonthly() {
    return this.spentAmountMonthly;
  }

  public void setSpentAmountMonthly(AmountObject spentAmountMonthly) {
    this.spentAmountMonthly = spentAmountMonthly;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.limitMonetaryAccount != null) {
      return false;
    }

    if (this.limitMonetaryAccountRemaining != null) {
      return false;
    }

    if (this.limitCardDebitMaestro != null) {
      return false;
    }

    if (this.limitCardDebitMastercard != null) {
      return false;
    }

    if (this.limitCardDebitWildcard != null) {
      return false;
    }

    if (this.limitCardWildcard != null) {
      return false;
    }

    if (this.limitCardReplacement != null) {
      return false;
    }

    if (this.limitAmountMonthly != null) {
      return false;
    }

    if (this.spentAmountMonthly != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CustomerLimitApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(CustomerLimitApiObject.class, reader);
  }

}
