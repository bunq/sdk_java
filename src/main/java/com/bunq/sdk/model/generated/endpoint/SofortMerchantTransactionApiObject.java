package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AmountObject;
import com.bunq.sdk.model.generated.object.ErrorObject;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccountObject;
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
 * View for requesting Sofort transactions and polling their status.
 */
public class SofortMerchantTransactionApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/sofort-merchant-transaction/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/sofort-merchant-transaction";

  /**
   * Field constants.
   */
  public static final String FIELD_AMOUNT_REQUESTED = "amount_requested";
  public static final String FIELD_ISSUER = "issuer";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "SofortMerchantTransaction";

  /**
   * The id of the monetary account this sofort merchant transaction links to.
   */
  @Expose
  @SerializedName("monetary_account_id")
  private Integer monetaryAccountId;

  /**
   * The alias of the monetary account to add money to.
   */
  @Expose
  @SerializedName("alias")
  private LabelMonetaryAccountObject alias;

  /**
   * The alias of the monetary account the money comes from.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private LabelMonetaryAccountObject counterpartyAlias;

  /**
   * In case of a successful transaction, the amount of money that will be transferred.
   */
  @Expose
  @SerializedName("amount_guaranteed")
  private AmountObject amountGuaranteed;

  /**
   * The requested amount of money to add.
   */
  @Expose
  @SerializedName("amount_requested")
  private AmountObject amountRequested;

  /**
   * The BIC of the issuer.
   */
  @Expose
  @SerializedName("issuer")
  private String issuer;

  /**
   * The URL to visit to 
   */
  @Expose
  @SerializedName("issuer_authentication_url")
  private String issuerAuthenticationUrl;

  /**
   * The status of the transaction.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The error message of the transaction.
   */
  @Expose
  @SerializedName("error_message")
  private List<ErrorObject> errorMessage;

  /**
   * The 'transaction ID' of the Sofort transaction.
   */
  @Expose
  @SerializedName("transaction_identifier")
  private String transactionIdentifier;

  /**
   * The requested amount of money to add.
   */
  @Expose
  @SerializedName("amount_requested_field_for_request")
  private AmountObject amountRequestedFieldForRequest;

  /**
   * The BIC of the issuing bank to ask for money.
   */
  @Expose
  @SerializedName("issuer_field_for_request")
  private String issuerFieldForRequest;

  public SofortMerchantTransactionApiObject() {
  this(null, null);
  }

  public SofortMerchantTransactionApiObject(AmountObject amountRequested) {
  this(amountRequested, null);
  }

  public SofortMerchantTransactionApiObject(AmountObject amountRequested, String issuer) {
    this.amountRequestedFieldForRequest = amountRequested;
    this.issuerFieldForRequest = issuer;
  }  /**
   */
  public static BunqResponse<SofortMerchantTransactionApiObject> get(Integer sofortMerchantTransactionId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), sofortMerchantTransactionId), params, customHeaders);

    return fromJson(SofortMerchantTransactionApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<SofortMerchantTransactionApiObject> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<SofortMerchantTransactionApiObject> get(Integer sofortMerchantTransactionId) {
    return get(sofortMerchantTransactionId, null, null, null);
  }

  public static BunqResponse<SofortMerchantTransactionApiObject> get(Integer sofortMerchantTransactionId, Integer monetaryAccountId) {
    return get(sofortMerchantTransactionId, monetaryAccountId, null, null);
  }

  public static BunqResponse<SofortMerchantTransactionApiObject> get(Integer sofortMerchantTransactionId, Integer monetaryAccountId, Map<String, String> params) {
    return get(sofortMerchantTransactionId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<List<SofortMerchantTransactionApiObject>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(SofortMerchantTransactionApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<SofortMerchantTransactionApiObject>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<SofortMerchantTransactionApiObject>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<SofortMerchantTransactionApiObject>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   * The id of the monetary account this sofort merchant transaction links to.
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
  public LabelMonetaryAccountObject getAlias() {
    return this.alias;
  }

  public void setAlias(LabelMonetaryAccountObject alias) {
    this.alias = alias;
  }

  /**
   * The alias of the monetary account the money comes from.
   */
  public LabelMonetaryAccountObject getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(LabelMonetaryAccountObject counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * In case of a successful transaction, the amount of money that will be transferred.
   */
  public AmountObject getAmountGuaranteed() {
    return this.amountGuaranteed;
  }

  public void setAmountGuaranteed(AmountObject amountGuaranteed) {
    this.amountGuaranteed = amountGuaranteed;
  }

  /**
   * The requested amount of money to add.
   */
  public AmountObject getAmountRequested() {
    return this.amountRequested;
  }

  public void setAmountRequested(AmountObject amountRequested) {
    this.amountRequested = amountRequested;
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
   * The URL to visit to 
   */
  public String getIssuerAuthenticationUrl() {
    return this.issuerAuthenticationUrl;
  }

  public void setIssuerAuthenticationUrl(String issuerAuthenticationUrl) {
    this.issuerAuthenticationUrl = issuerAuthenticationUrl;
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
   * The error message of the transaction.
   */
  public List<ErrorObject> getErrorMessage() {
    return this.errorMessage;
  }

  public void setErrorMessage(List<ErrorObject> errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * The 'transaction ID' of the Sofort transaction.
   */
  public String getTransactionIdentifier() {
    return this.transactionIdentifier;
  }

  public void setTransactionIdentifier(String transactionIdentifier) {
    this.transactionIdentifier = transactionIdentifier;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.monetaryAccountId != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.counterpartyAlias != null) {
      return false;
    }

    if (this.amountGuaranteed != null) {
      return false;
    }

    if (this.amountRequested != null) {
      return false;
    }

    if (this.issuer != null) {
      return false;
    }

    if (this.issuerAuthenticationUrl != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.errorMessage != null) {
      return false;
    }

    if (this.transactionIdentifier != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static SofortMerchantTransactionApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(SofortMerchantTransactionApiObject.class, reader);
  }

}
