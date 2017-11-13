package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * View for requesting iDEAL transactions and polling their status.
 */
public class IdealMerchantTransaction extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/ideal-merchant-transaction";
  private static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/ideal-merchant-transaction/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/ideal-merchant-transaction";

  /**
   * Field constants.
   */
  public static final String FIELD_AMOUNT_REQUESTED = "amount_requested";
  public static final String FIELD_ISSUER = "issuer";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "IdealMerchantTransaction";

  /**
   * The id of the monetary account this ideal merchant transaction links to.
   */
  @Expose
  @SerializedName("monetary_account_id")
  private Integer monetaryAccountId;

  /**
   * The alias of the monetary account to add money to.
   */
  @Expose
  @SerializedName("alias")
  private MonetaryAccountReference alias;

  /**
   * The alias of the monetary account the money comes from.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private MonetaryAccountReference counterpartyAlias;

  /**
   * In case of a successful transaction, the amount of money that will be transferred.
   */
  @Expose
  @SerializedName("amount_guaranteed")
  private Amount amountGuaranteed;

  /**
   * The requested amount of money to add.
   */
  @Expose
  @SerializedName("amount_requested")
  private Amount amountRequested;

  /**
   * When the transaction will expire.
   */
  @Expose
  @SerializedName("expiration")
  private String expiration;

  /**
   * The BIC of the issuer.
   */
  @Expose
  @SerializedName("issuer")
  private String issuer;

  /**
   * The Name of the issuer.
   */
  @Expose
  @SerializedName("issuer_name")
  private String issuerName;

  /**
   * The URL to visit to 
   */
  @Expose
  @SerializedName("issuer_authentication_url")
  private String issuerAuthenticationUrl;

  /**
   * The 'purchase ID' of the iDEAL transaction.
   */
  @Expose
  @SerializedName("purchase_identifier")
  private String purchaseIdentifier;

  /**
   * The status of the transaction.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * When the status was last updated.
   */
  @Expose
  @SerializedName("status_timestamp")
  private String statusTimestamp;

  /**
   * The 'transaction ID' of the iDEAL transaction.
   */
  @Expose
  @SerializedName("transaction_identifier")
  private String transactionIdentifier;

  /**
   * Whether or not chat messages are allowed.
   */
  @Expose
  @SerializedName("allow_chat")
  private Boolean allowChat;

  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId) {
    return create(apiContext, requestMap, userId, monetaryAccountId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, userId, monetaryAccountId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<IdealMerchantTransaction> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer idealMerchantTransactionId) {
    return get(apiContext, userId, monetaryAccountId, idealMerchantTransactionId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<IdealMerchantTransaction> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer idealMerchantTransactionId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userId, monetaryAccountId, idealMerchantTransactionId), new HashMap<>(), customHeaders);

    return fromJson(IdealMerchantTransaction.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<List<IdealMerchantTransaction>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId) {
    return list(apiContext, userId, monetaryAccountId, new HashMap<>());
  }

  public static BunqResponse<List<IdealMerchantTransaction>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Map<String, String> params) {
    return list(apiContext, userId, monetaryAccountId, params, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<List<IdealMerchantTransaction>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId), params, customHeaders);

    return fromJsonList(IdealMerchantTransaction.class, responseRaw, OBJECT_TYPE);
  }

  /**
   * The id of the monetary account this ideal merchant transaction links to.
   */
  public Integer getMonetaryAccountId() {
    return this.monetaryAccountId;
  }

  public void setMonetaryAccountId(Integer monetaryAccountId) {
    this.monetaryAccountId = monetaryAccountId;
  }

  /**
   * The alias of the monetary account to add money to.
   */
  public MonetaryAccountReference getAlias() {
    return this.alias;
  }

  public void setAlias(MonetaryAccountReference alias) {
    this.alias = alias;
  }

  /**
   * The alias of the monetary account the money comes from.
   */
  public MonetaryAccountReference getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(MonetaryAccountReference counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * In case of a successful transaction, the amount of money that will be transferred.
   */
  public Amount getAmountGuaranteed() {
    return this.amountGuaranteed;
  }

  public void setAmountGuaranteed(Amount amountGuaranteed) {
    this.amountGuaranteed = amountGuaranteed;
  }

  /**
   * The requested amount of money to add.
   */
  public Amount getAmountRequested() {
    return this.amountRequested;
  }

  public void setAmountRequested(Amount amountRequested) {
    this.amountRequested = amountRequested;
  }

  /**
   * When the transaction will expire.
   */
  public String getExpiration() {
    return this.expiration;
  }

  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }

  /**
   * The BIC of the issuer.
   */
  public String getIssuer() {
    return this.issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  /**
   * The Name of the issuer.
   */
  public String getIssuerName() {
    return this.issuerName;
  }

  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }

  /**
   * The URL to visit to 
   */
  public String getIssuerAuthenticationUrl() {
    return this.issuerAuthenticationUrl;
  }

  public void setIssuerAuthenticationUrl(String issuerAuthenticationUrl) {
    this.issuerAuthenticationUrl = issuerAuthenticationUrl;
  }

  /**
   * The 'purchase ID' of the iDEAL transaction.
   */
  public String getPurchaseIdentifier() {
    return this.purchaseIdentifier;
  }

  public void setPurchaseIdentifier(String purchaseIdentifier) {
    this.purchaseIdentifier = purchaseIdentifier;
  }

  /**
   * The status of the transaction.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * When the status was last updated.
   */
  public String getStatusTimestamp() {
    return this.statusTimestamp;
  }

  public void setStatusTimestamp(String statusTimestamp) {
    this.statusTimestamp = statusTimestamp;
  }

  /**
   * The 'transaction ID' of the iDEAL transaction.
   */
  public String getTransactionIdentifier() {
    return this.transactionIdentifier;
  }

  public void setTransactionIdentifier(String transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
  }

  /**
   * Whether or not chat messages are allowed.
   */
  public Boolean getAllowChat() {
    return this.allowChat;
  }

  public void setAllowChat(Boolean allowChat) {
    this.allowChat = allowChat;
  }

}
