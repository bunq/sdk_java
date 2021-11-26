package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
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
public class CustomerLimit extends BunqModel {

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
  private Integer limitMonetaryAccount;

  /**
   * The amount of additional monetary accounts you can create.
   */
  @Expose
  @SerializedName("limit_monetary_account_remaining")
  private Integer limitMonetaryAccountRemaining;

  /**
   * The limit of Maestro cards.
   */
  @Expose
  @SerializedName("limit_card_debit_maestro")
  private Integer limitCardDebitMaestro;

  /**
   * The limit of MasterCard cards.
   */
  @Expose
  @SerializedName("limit_card_debit_mastercard")
  private Integer limitCardDebitMastercard;

  /**
   * DEPRECTATED: The limit of wildcards, e.g. Maestro or MasterCard cards.
   */
  @Expose
  @SerializedName("limit_card_debit_wildcard")
  private Integer limitCardDebitWildcard;

  /**
   * The limit of wildcards, e.g. Maestro or MasterCard cards.
   */
  @Expose
  @SerializedName("limit_card_wildcard")
  private Integer limitCardWildcard;

  /**
   * The limit of free replacement cards.
   */
  @Expose
  @SerializedName("limit_card_replacement")
  private Integer limitCardReplacement;

  /**
   * The maximum amount a user is allowed to spend in a month.
   */
  @Expose
  @SerializedName("limit_amount_monthly")
  private Amount limitAmountMonthly;

  /**
   * The amount the user has spent in the last month.
   */
  @Expose
  @SerializedName("spent_amount_monthly")
  private Amount spentAmountMonthly;

  /**
   * Get all limits for the authenticated user.
   */
  public static BunqResponse<List<CustomerLimit>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(CustomerLimit.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<CustomerLimit>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<CustomerLimit>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The limit of monetary accounts.
   */
  public Integer getLimitMonetaryAccount() {
    return this.limitMonetaryAccount;
  }

  public void setLimitMonetaryAccount(Integer limitMonetaryAccount) {
    this.limitMonetaryAccount = limitMonetaryAccount;
  }

  /**
   * The amount of additional monetary accounts you can create.
   */
  public Integer getLimitMonetaryAccountRemaining() {
    return this.limitMonetaryAccountRemaining;
  }

  public void setLimitMonetaryAccountRemaining(Integer limitMonetaryAccountRemaining) {
    this.limitMonetaryAccountRemaining = limitMonetaryAccountRemaining;
  }

  /**
   * The limit of Maestro cards.
   */
  public Integer getLimitCardDebitMaestro() {
    return this.limitCardDebitMaestro;
  }

  public void setLimitCardDebitMaestro(Integer limitCardDebitMaestro) {
    this.limitCardDebitMaestro = limitCardDebitMaestro;
  }

  /**
   * The limit of MasterCard cards.
   */
  public Integer getLimitCardDebitMastercard() {
    return this.limitCardDebitMastercard;
  }

  public void setLimitCardDebitMastercard(Integer limitCardDebitMastercard) {
    this.limitCardDebitMastercard = limitCardDebitMastercard;
  }

  /**
   * DEPRECTATED: The limit of wildcards, e.g. Maestro or MasterCard cards.
   */
  public Integer getLimitCardDebitWildcard() {
    return this.limitCardDebitWildcard;
  }

  public void setLimitCardDebitWildcard(Integer limitCardDebitWildcard) {
    this.limitCardDebitWildcard = limitCardDebitWildcard;
  }

  /**
   * The limit of wildcards, e.g. Maestro or MasterCard cards.
   */
  public Integer getLimitCardWildcard() {
    return this.limitCardWildcard;
  }

  public void setLimitCardWildcard(Integer limitCardWildcard) {
    this.limitCardWildcard = limitCardWildcard;
  }

  /**
   * The limit of free replacement cards.
   */
  public Integer getLimitCardReplacement() {
    return this.limitCardReplacement;
  }

  public void setLimitCardReplacement(Integer limitCardReplacement) {
    this.limitCardReplacement = limitCardReplacement;
  }

  /**
   * The maximum amount a user is allowed to spend in a month.
   */
  public Amount getLimitAmountMonthly() {
    return this.limitAmountMonthly;
  }

  public void setLimitAmountMonthly(Amount limitAmountMonthly) {
    this.limitAmountMonthly = limitAmountMonthly;
  }

  /**
   * The amount the user has spent in the last month.
   */
  public Amount getSpentAmountMonthly() {
    return this.spentAmountMonthly;
  }

  public void setSpentAmountMonthly(Amount spentAmountMonthly) {
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
  public static CustomerLimit fromJsonReader(JsonReader reader) {
    return fromJsonReader(CustomerLimit.class, reader);
  }

}
