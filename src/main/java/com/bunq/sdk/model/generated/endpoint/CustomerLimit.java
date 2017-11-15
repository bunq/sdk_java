package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
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
  private static final String ENDPOINT_URL_LISTING = "user/%s/limit";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "CustomerLimit";

  /**
   * The limit of monetary accounts.
   */
  @Expose
  @SerializedName("limit_monetary_account")
  private Integer limitMonetaryAccount;

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
   * The limit of wildcards, e.g. Maestro or MasterCard cards.
   */
  @Expose
  @SerializedName("limit_card_debit_wildcard")
  private Integer limitCardDebitWildcard;

  /**
   * The limit of free replacement cards.
   */
  @Expose
  @SerializedName("limit_card_debit_replacement")
  private Integer limitCardDebitReplacement;

  public static BunqResponse<List<CustomerLimit>> list(ApiContext apiContext, Integer userId) {
    return list(apiContext, userId, new HashMap<>());
  }

  public static BunqResponse<List<CustomerLimit>> list(ApiContext apiContext, Integer userId, Map<String, String> params) {
    return list(apiContext, userId, params, new HashMap<>());
  }

  /**
   * Get all limits for the authenticated user.
   */
  public static BunqResponse<List<CustomerLimit>> list(ApiContext apiContext, Integer userId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId), params, customHeaders);

    return fromJsonList(CustomerLimit.class, responseRaw, OBJECT_TYPE);
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
   * The limit of wildcards, e.g. Maestro or MasterCard cards.
   */
  public Integer getLimitCardDebitWildcard() {
    return this.limitCardDebitWildcard;
  }

  public void setLimitCardDebitWildcard(Integer limitCardDebitWildcard) {
    this.limitCardDebitWildcard = limitCardDebitWildcard;
  }

  /**
   * The limit of free replacement cards.
   */
  public Integer getLimitCardDebitReplacement() {
    return this.limitCardDebitReplacement;
  }

  public void setLimitCardDebitReplacement(Integer limitCardDebitReplacement) {
    this.limitCardDebitReplacement = limitCardDebitReplacement;
  }

}
