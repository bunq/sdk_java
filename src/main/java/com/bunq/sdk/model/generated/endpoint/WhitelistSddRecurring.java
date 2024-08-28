package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.bunq.sdk.model.generated.object.LabelUser;
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
 * Whitelist a recurring SDD so that when another recurrence comes in, it is automatically
 * accepted.
 */
public class WhitelistSddRecurring extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/whitelist-sdd-recurring/%s";
  protected static final String ENDPOINT_URL_CREATE = "user/%s/whitelist-sdd-recurring";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/whitelist-sdd-recurring/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/whitelist-sdd-recurring/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/whitelist-sdd-recurring";

  /**
   * Field constants.
   */
  public static final String FIELD_MONETARY_ACCOUNT_PAYING_ID = "monetary_account_paying_id";
  public static final String FIELD_REQUEST_ID = "request_id";
  public static final String FIELD_MAXIMUM_AMOUNT_PER_MONTH = "maximum_amount_per_month";
  public static final String FIELD_MAXIMUM_AMOUNT_PER_PAYMENT = "maximum_amount_per_payment";
  public static final String FIELD_ROUTING_TYPE = "routing_type";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "WhitelistSddRecurring";

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
  private LabelMonetaryAccount counterpartyAlias;

  /**
   * The monthly maximum amount that can be deducted from the target account.
   */
  @Expose
  @SerializedName("maximum_amount_per_month")
  private Amount maximumAmountPerMonth;

  /**
   * The maximum amount per payment that can be deducted from the target account.
   */
  @Expose
  @SerializedName("maximum_amount_per_payment")
  private Amount maximumAmountPerPayment;

  /**
   * The user who created the whitelist entry.
   */
  @Expose
  @SerializedName("user_alias_created")
  private LabelUser userAliasCreated;

  /**
   * The type of routing for this whitelist.
   */
  @Expose
  @SerializedName("routing_type")
  private String routingType;

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
   * The maximum amount of money that is allowed to be deducted per month based on the whitelist.
   */
  @Expose
  @SerializedName("maximum_amount_per_month_field_for_request")
  private Amount maximumAmountPerMonthFieldForRequest;

  /**
   * The maximum amount of money that is allowed to be deducted per payment based on the
   * whitelist.
   */
  @Expose
  @SerializedName("maximum_amount_per_payment_field_for_request")
  private Amount maximumAmountPerPaymentFieldForRequest;

  /**
   * The type of routing for this whitelist. Should be changed to non-optional
   * CIT/technical#12806.
   */
  @Expose
  @SerializedName("routing_type_field_for_request")
  private String routingTypeFieldForRequest;

  public WhitelistSddRecurring() {
  this(null, null, null, null, null);
  }

  public WhitelistSddRecurring(Integer monetaryAccountPayingId) {
  this(monetaryAccountPayingId, null, null, null, null);
  }

  public WhitelistSddRecurring(Integer monetaryAccountPayingId, Integer requestId) {
  this(monetaryAccountPayingId, requestId, null, null, null);
  }

  public WhitelistSddRecurring(Integer monetaryAccountPayingId, Integer requestId, Amount maximumAmountPerMonth) {
  this(monetaryAccountPayingId, requestId, maximumAmountPerMonth, null, null);
  }

  public WhitelistSddRecurring(Integer monetaryAccountPayingId, Integer requestId, Amount maximumAmountPerMonth, Amount maximumAmountPerPayment) {
  this(monetaryAccountPayingId, requestId, maximumAmountPerMonth, maximumAmountPerPayment, null);
  }

  public WhitelistSddRecurring(Integer monetaryAccountPayingId, Integer requestId, Amount maximumAmountPerMonth, Amount maximumAmountPerPayment, String routingType) {
    this.monetaryAccountPayingIdFieldForRequest = monetaryAccountPayingId;
    this.requestIdFieldForRequest = requestId;
    this.maximumAmountPerMonthFieldForRequest = maximumAmountPerMonth;
    this.maximumAmountPerPaymentFieldForRequest = maximumAmountPerPayment;
    this.routingTypeFieldForRequest = routingType;
  }  /**
   * Get a specific recurring SDD whitelist entry.
   */
  public static BunqResponse<WhitelistSddRecurring> get(Integer whitelistSddRecurringId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), whitelistSddRecurringId), params, customHeaders);

    return fromJson(WhitelistSddRecurring.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<WhitelistSddRecurring> get() {
    return get(null, null, null);
  }

  public static BunqResponse<WhitelistSddRecurring> get(Integer whitelistSddRecurringId) {
    return get(whitelistSddRecurringId, null, null);
  }

  public static BunqResponse<WhitelistSddRecurring> get(Integer whitelistSddRecurringId, Map<String, String> params) {
    return get(whitelistSddRecurringId, params, null);
  }

  /**
   * Create a new recurring SDD whitelist entry.
   * @param monetaryAccountPayingId ID of the monetary account of which you want to pay from.
   * @param requestId ID of the request for which you want to whitelist the originating SDD.
   * @param maximumAmountPerMonth The maximum amount of money that is allowed to be deducted per
   * month based on the whitelist.
   * @param maximumAmountPerPayment The maximum amount of money that is allowed to be deducted per
   * payment based on the whitelist.
   * @param routingType The type of routing for this whitelist. Should be changed to non-optional
   * CIT/technical#12806.
   */
  public static BunqResponse<Integer> create(Integer monetaryAccountPayingId, Integer requestId, Amount maximumAmountPerMonth, Amount maximumAmountPerPayment, String routingType, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_MONETARY_ACCOUNT_PAYING_ID, monetaryAccountPayingId);
requestMap.put(FIELD_REQUEST_ID, requestId);
requestMap.put(FIELD_MAXIMUM_AMOUNT_PER_MONTH, maximumAmountPerMonth);
requestMap.put(FIELD_MAXIMUM_AMOUNT_PER_PAYMENT, maximumAmountPerPayment);
requestMap.put(FIELD_ROUTING_TYPE, routingType);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer monetaryAccountPayingId) {
    return create(monetaryAccountPayingId, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer monetaryAccountPayingId, Integer requestId) {
    return create(monetaryAccountPayingId, requestId, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer monetaryAccountPayingId, Integer requestId, Amount maximumAmountPerMonth) {
    return create(monetaryAccountPayingId, requestId, maximumAmountPerMonth, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer monetaryAccountPayingId, Integer requestId, Amount maximumAmountPerMonth, Amount maximumAmountPerPayment) {
    return create(monetaryAccountPayingId, requestId, maximumAmountPerMonth, maximumAmountPerPayment, null, null);
  }

  public static BunqResponse<Integer> create(Integer monetaryAccountPayingId, Integer requestId, Amount maximumAmountPerMonth, Amount maximumAmountPerPayment, String routingType) {
    return create(monetaryAccountPayingId, requestId, maximumAmountPerMonth, maximumAmountPerPayment, routingType, null);
  }

  /**
   * @param monetaryAccountPayingId ID of the monetary account of which you want to pay from.
   * @param maximumAmountPerMonth The maximum amount of money that is allowed to be deducted per
   * month based on the whitelist.
   * @param maximumAmountPerPayment The maximum amount of money that is allowed to be deducted per
   * payment based on the whitelist.
   * @param routingType The type of routing for this whitelist. Should be changed to non-optional
   * CIT/technical#12806.
   */
  public static BunqResponse<Integer> update(Integer whitelistSddRecurringId, Integer monetaryAccountPayingId, Amount maximumAmountPerMonth, Amount maximumAmountPerPayment, String routingType, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_MONETARY_ACCOUNT_PAYING_ID, monetaryAccountPayingId);
requestMap.put(FIELD_MAXIMUM_AMOUNT_PER_MONTH, maximumAmountPerMonth);
requestMap.put(FIELD_MAXIMUM_AMOUNT_PER_PAYMENT, maximumAmountPerPayment);
requestMap.put(FIELD_ROUTING_TYPE, routingType);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), whitelistSddRecurringId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer whitelistSddRecurringId) {
    return update(whitelistSddRecurringId, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer whitelistSddRecurringId, Integer monetaryAccountPayingId) {
    return update(whitelistSddRecurringId, monetaryAccountPayingId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer whitelistSddRecurringId, Integer monetaryAccountPayingId, Amount maximumAmountPerMonth) {
    return update(whitelistSddRecurringId, monetaryAccountPayingId, maximumAmountPerMonth, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer whitelistSddRecurringId, Integer monetaryAccountPayingId, Amount maximumAmountPerMonth, Amount maximumAmountPerPayment) {
    return update(whitelistSddRecurringId, monetaryAccountPayingId, maximumAmountPerMonth, maximumAmountPerPayment, null, null);
  }

  public static BunqResponse<Integer> update(Integer whitelistSddRecurringId, Integer monetaryAccountPayingId, Amount maximumAmountPerMonth, Amount maximumAmountPerPayment, String routingType) {
    return update(whitelistSddRecurringId, monetaryAccountPayingId, maximumAmountPerMonth, maximumAmountPerPayment, routingType, null);
  }

  /**
   */
  public static BunqResponse<WhitelistSddRecurring> delete(Integer whitelistSddRecurringId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), whitelistSddRecurringId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<WhitelistSddRecurring> delete(Integer whitelistSddRecurringId) {
    return delete(whitelistSddRecurringId, null);
  }

  /**
   * Get a listing of all recurring SDD whitelist entries for a target monetary account.
   */
  public static BunqResponse<List<WhitelistSddRecurring>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(WhitelistSddRecurring.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<WhitelistSddRecurring>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<WhitelistSddRecurring>> list(Map<String, String> params) {
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
  public LabelMonetaryAccount getCounterpartyAlias() {
    return this.counterpartyAlias;
  }

  public void setCounterpartyAlias(LabelMonetaryAccount counterpartyAlias) {
    this.counterpartyAlias = counterpartyAlias;
  }

  /**
   * The monthly maximum amount that can be deducted from the target account.
   */
  public Amount getMaximumAmountPerMonth() {
    return this.maximumAmountPerMonth;
  }

  public void setMaximumAmountPerMonth(Amount maximumAmountPerMonth) {
    this.maximumAmountPerMonth = maximumAmountPerMonth;
  }

  /**
   * The maximum amount per payment that can be deducted from the target account.
   */
  public Amount getMaximumAmountPerPayment() {
    return this.maximumAmountPerPayment;
  }

  public void setMaximumAmountPerPayment(Amount maximumAmountPerPayment) {
    this.maximumAmountPerPayment = maximumAmountPerPayment;
  }

  /**
   * The user who created the whitelist entry.
   */
  public LabelUser getUserAliasCreated() {
    return this.userAliasCreated;
  }

  public void setUserAliasCreated(LabelUser userAliasCreated) {
    this.userAliasCreated = userAliasCreated;
  }

  /**
   * The type of routing for this whitelist.
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

    if (this.maximumAmountPerPayment != null) {
      return false;
    }

    if (this.userAliasCreated != null) {
      return false;
    }

    if (this.routingType != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static WhitelistSddRecurring fromJsonReader(JsonReader reader) {
    return fromJsonReader(WhitelistSddRecurring.class, reader);
  }

}
