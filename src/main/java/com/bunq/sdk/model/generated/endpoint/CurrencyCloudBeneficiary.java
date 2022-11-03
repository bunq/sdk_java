package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
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
import javax.lang.model.type.NullType;

/**
 * Endpoint to manage CurrencyCloud beneficiaries.
 */
public class CurrencyCloudBeneficiary extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/currency-cloud-beneficiary";
  protected static final String ENDPOINT_URL_READ = "user/%s/currency-cloud-beneficiary/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/currency-cloud-beneficiary";

  /**
   * Field constants.
   */
  public static final String FIELD_NAME = "name";
  public static final String FIELD_COUNTRY = "country";
  public static final String FIELD_CURRENCY = "currency";
  public static final String FIELD_PAYMENT_TYPE = "payment_type";
  public static final String FIELD_LEGAL_ENTITY_TYPE = "legal_entity_type";
  public static final String FIELD_ALL_FIELD = "all_field";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "CurrencyCloudBeneficiary";

  /**
   * The id of the profile.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the beneficiaries creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the beneficiaries last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The name of the beneficiary.
   */
  @Expose
  @SerializedName("name")
  private String name;

  /**
   * The account number to display for the beneficiary.
   */
  @Expose
  @SerializedName("account_number")
  private String accountNumber;

  /**
   * The currency of the beneficiary.
   */
  @Expose
  @SerializedName("currency")
  private String currency;

  /**
   * The external identifier of the beneficiary.
   */
  @Expose
  @SerializedName("external_identifier")
  private String externalIdentifier;

  /**
   * The name of the beneficiary.
   */
  @Expose
  @SerializedName("name_field_for_request")
  private String nameFieldForRequest;

  /**
   * The country of the beneficiary.
   */
  @Expose
  @SerializedName("country_field_for_request")
  private String countryFieldForRequest;

  /**
   * The currency of the beneficiary.
   */
  @Expose
  @SerializedName("currency_field_for_request")
  private String currencyFieldForRequest;

  /**
   * The payment type this requirement is for.
   */
  @Expose
  @SerializedName("payment_type_field_for_request")
  private String paymentTypeFieldForRequest;

  /**
   * The legal entity type of the beneficiary.
   */
  @Expose
  @SerializedName("legal_entity_type_field_for_request")
  private String legalEntityTypeFieldForRequest;

  /**
   * All fields that were required by CurrencyCloud. Obtained through the
   * CurrencyCloudBeneficiaryRequirement listing.
   */
  @Expose
  @SerializedName("all_field_field_for_request")
  private List<String> allFieldFieldForRequest;

  public CurrencyCloudBeneficiary() {
  this(null, null, null, null, null, null);
  }

  public CurrencyCloudBeneficiary(String name) {
  this(name, null, null, null, null, null);
  }

  public CurrencyCloudBeneficiary(String name, String country) {
  this(name, country, null, null, null, null);
  }

  public CurrencyCloudBeneficiary(String name, String country, String currency) {
  this(name, country, currency, null, null, null);
  }

  public CurrencyCloudBeneficiary(String name, String country, String currency, String paymentType) {
  this(name, country, currency, paymentType, null, null);
  }

  public CurrencyCloudBeneficiary(String name, String country, String currency, String paymentType, String legalEntityType) {
  this(name, country, currency, paymentType, legalEntityType, null);
  }

  public CurrencyCloudBeneficiary(String name, String country, String currency, String paymentType, String legalEntityType, List<String> allField) {
    this.nameFieldForRequest = name;
    this.countryFieldForRequest = country;
    this.currencyFieldForRequest = currency;
    this.paymentTypeFieldForRequest = paymentType;
    this.legalEntityTypeFieldForRequest = legalEntityType;
    this.allFieldFieldForRequest = allField;
  }  /**
   * @param name The name of the beneficiary.
   * @param country The country of the beneficiary.
   * @param currency The currency of the beneficiary.
   * @param paymentType The payment type this requirement is for.
   * @param legalEntityType The legal entity type of the beneficiary.
   * @param allField All fields that were required by CurrencyCloud. Obtained through the
   * CurrencyCloudBeneficiaryRequirement listing.
   */
  public static BunqResponse<Integer> create(String name, String country, String currency, String paymentType, String legalEntityType, List<String> allField, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_NAME, name);
requestMap.put(FIELD_COUNTRY, country);
requestMap.put(FIELD_CURRENCY, currency);
requestMap.put(FIELD_PAYMENT_TYPE, paymentType);
requestMap.put(FIELD_LEGAL_ENTITY_TYPE, legalEntityType);
requestMap.put(FIELD_ALL_FIELD, allField);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String name) {
    return create(name, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String name, String country) {
    return create(name, country, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String name, String country, String currency) {
    return create(name, country, currency, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String name, String country, String currency, String paymentType) {
    return create(name, country, currency, paymentType, null, null, null);
  }

  public static BunqResponse<Integer> create(String name, String country, String currency, String paymentType, String legalEntityType) {
    return create(name, country, currency, paymentType, legalEntityType, null, null);
  }

  public static BunqResponse<Integer> create(String name, String country, String currency, String paymentType, String legalEntityType, List<String> allField) {
    return create(name, country, currency, paymentType, legalEntityType, allField, null);
  }

  /**
   */
  public static BunqResponse<CurrencyCloudBeneficiary> get(Integer currencyCloudBeneficiaryId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), currencyCloudBeneficiaryId), params, customHeaders);

    return fromJson(CurrencyCloudBeneficiary.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<CurrencyCloudBeneficiary> get() {
    return get(null, null, null);
  }

  public static BunqResponse<CurrencyCloudBeneficiary> get(Integer currencyCloudBeneficiaryId) {
    return get(currencyCloudBeneficiaryId, null, null);
  }

  public static BunqResponse<CurrencyCloudBeneficiary> get(Integer currencyCloudBeneficiaryId, Map<String, String> params) {
    return get(currencyCloudBeneficiaryId, params, null);
  }

  /**
   */
  public static BunqResponse<List<CurrencyCloudBeneficiary>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(CurrencyCloudBeneficiary.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<CurrencyCloudBeneficiary>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<CurrencyCloudBeneficiary>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The id of the profile.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the beneficiaries creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the beneficiaries last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The name of the beneficiary.
   */
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The account number to display for the beneficiary.
   */
  public String getAccountNumber() {
    return this.accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  /**
   * The currency of the beneficiary.
   */
  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * The external identifier of the beneficiary.
   */
  public String getExternalIdentifier() {
    return this.externalIdentifier;
  }

  public void setExternalIdentifier(String externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.created != null) {
      return false;
    }

    if (this.updated != null) {
      return false;
    }

    if (this.name != null) {
      return false;
    }

    if (this.accountNumber != null) {
      return false;
    }

    if (this.currency != null) {
      return false;
    }

    if (this.externalIdentifier != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static CurrencyCloudBeneficiary fromJsonReader(JsonReader reader) {
    return fromJsonReader(CurrencyCloudBeneficiary.class, reader);
  }

}
