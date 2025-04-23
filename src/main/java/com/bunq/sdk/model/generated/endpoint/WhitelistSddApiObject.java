package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AmountObject;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccountObject;
import com.bunq.sdk.model.generated.object.LabelUserObject;
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
 * Depreciated route, replaced with whitelist-sdd-recurring
 */
public class WhitelistSddApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/whitelist-sdd/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/whitelist-sdd";

  /**
   * Field constants.
   */
  public static final String FIELD_MONETARY_ACCOUNT_PAYING_ID = "monetary_account_paying_id";
  public static final String FIELD_REQUEST_ID = "request_id";
  public static final String FIELD_MAXIMUM_AMOUNT_PER_MONTH = "maximum_amount_per_month";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "Whitelist";

  /**
   * The ID of the whitelist entry.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The account to which payments will come in before possibly being 'redirected' by the
   * whitelist.
   */
  @Expose
  @SerializedName("monetary_account_incoming_id")
  private Integer monetaryAccountIncomingId;

  /**
   * The account from which payments will be deducted when a transaction is matched with this
   * whitelist.
   */
  @Expose
  @SerializedName("monetary_account_paying_id")
  private Integer monetaryAccountPayingId;

  /**
   * The type of the SDD whitelist, can be CORE or B2B.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The status of the whitelist.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The credit scheme ID provided by the counterparty.
   */
  @Expose
  @SerializedName("credit_scheme_identifier")
  private String creditSchemeIdentifier;

  /**
   * The mandate ID provided by the counterparty.
   */
  @Expose
  @SerializedName("mandate_identifier")
  private String mandateIdentifier;

  /**
   * The account to which payments will be paid.
   */
  @Expose
  @SerializedName("counterparty_alias")
  private LabelMonetaryAccountObject counterpartyAlias;

  /**
   * The monthly maximum amount that can be deducted from the target account.
   */
  @Expose
  @SerializedName("maximum_amount_per_month")
  private AmountObject maximumAmountPerMonth;

  /**
   * The user who created the whitelist entry.
   */
  @Expose
  @SerializedName("user_alias_created")
  private LabelUserObject userAliasCreated;

  /**
   * ID of the monetary account of which you want to pay from.
   */
  @Expose
  @SerializedName("monetary_account_paying_id_field_for_request")
  private Integer monetaryAccountPayingIdFieldForRequest;

  /**
   * ID of the request for which you want to whitelist the originating SDD.
   */
  @Expose
  @SerializedName("request_id_field_for_request")
  private Integer requestIdFieldForRequest;

  /**
   * The maximum amount of money that is allowed to be deducted based on the whitelist.
   */
  @Expose
  @SerializedName("maximum_amount_per_month_field_for_request")
  private AmountObject maximumAmountPerMonthFieldForRequest;

  public WhitelistSddApiObject() {
  this(null, null, null);
  }

  public WhitelistSddApiObject(Integer monetaryAccountPayingId) {
  this(monetaryAccountPayingId, null, null);
  }

  public WhitelistSddApiObject(Integer monetaryAccountPayingId, Integer requestId) {
  this(monetaryAccountPayingId, requestId, null);
  }

  public WhitelistSddApiObject(Integer monetaryAccountPayingId, Integer requestId, AmountObject maximumAmountPerMonth) {
    this.monetaryAccountPayingIdFieldForRequest = monetaryAccountPayingId;
    this.requestIdFieldForRequest = requestId;
    this.maximumAmountPerMonthFieldForRequest = maximumAmountPerMonth;
  }  /**
   * Get a specific recurring SDD whitelist entry.
   */
  public static BunqResponse<WhitelistSddApiObject> get(Integer whitelistSddId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), whitelistSddId), params, customHeaders);

    return fromJson(WhitelistSddApiObject.class, responseRaw);
  }

  public static BunqResponse<WhitelistSddApiObject> get() {
    return get(null, null, null);
  }

  public static BunqResponse<WhitelistSddApiObject> get(Integer whitelistSddId) {
    return get(whitelistSddId, null, null);
  }

  public static BunqResponse<WhitelistSddApiObject> get(Integer whitelistSddId, Map<String, String> params) {
    return get(whitelistSddId, params, null);
  }

  /**
   * Get a listing of all recurring SDD whitelist entries for a target monetary account.
   */
  public static BunqResponse<List<WhitelistSddApiObject>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(WhitelistSddApiObject.class, responseRaw);
  }

  public static BunqResponse<List<WhitelistSddApiObject>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<WhitelistSddApiObject>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The ID of the whitelist entry.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The account to which payments will come in before possibly being 'redirected' by the
   * whitelist.
   */
  public Integer getMonetaryAccountIncomingId() {
    return this.monetaryAccountIncomingId;
  }

  public void setMonetaryAccountIncomingId(Integer monetaryAccountIncomingId) {
    this.monetaryAccountIncomingId = monetaryAccountIncomingId;
  }

  /**
   * The account from which payments will be deducted when a transaction is matched with this
   * whitelist.
   */
  public Integer getMonetaryAccountPayingId() {
    return this.monetaryAccountPayingId;
  }

  public void setMonetaryAccountPayingId(Integer monetaryAccountPayingId) {
    this.monetaryAccountPayingId = monetaryAccountPayingId;
  }

  /**
   * The type of the SDD whitelist, can be CORE or B2B.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The status of the whitelist.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The credit scheme ID provided by the counterparty.
   */
  public String getCreditSchemeIdentifier() {
    return this.creditSchemeIdentifier;
  }

  public void setCreditSchemeIdentifier(String creditSchemeIdentifier) {
    this.creditSchemeIdentifier = creditSchemeIdentifier;
  }

  /**
   * The mandate ID provided by the counterparty.
   */
  public String getMandateIdentifier() {
    return this.mandateIdentifier;
  }

  public void setMandateIdentifier(String mandateIdentifier) {
    this.mandateIdentifier = mandateIdentifier;
  }

  /**
   * The account to which payments will be paid.
   */
  public LabelMonetaryAccountObject getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(LabelMonetaryAccountObject counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * The monthly maximum amount that can be deducted from the target account.
   */
  public AmountObject getMaximumAmountPerMonth() {
    return this.maximumAmountPerMonth;
  }

  public void setMaximumAmountPerMonth(AmountObject maximumAmountPerMonth) {
    this.maximumAmountPerMonth = maximumAmountPerMonth;
  }

  /**
   * The user who created the whitelist entry.
   */
  public LabelUserObject getUserAliasCreated() {
    return this.userAliasCreated;
  }

  public void setUserAliasCreated(LabelUserObject userAliasCreated) {
    this.userAliasCreated = userAliasCreated;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.monetaryAccountIncomingId != null) {
      return false;
    }

    if (this.monetaryAccountPayingId != null) {
      return false;
    }

    if (this.type != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.creditSchemeIdentifier != null) {
      return false;
    }

    if (this.mandateIdentifier != null) {
      return false;
    }

    if (this.counterpartyAlias != null) {
      return false;
    }

    if (this.maximumAmountPerMonth != null) {
      return false;
    }

    if (this.userAliasCreated != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static WhitelistSddApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(WhitelistSddApiObject.class, reader);
  }

}
