package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Address;
import com.bunq.sdk.model.generated.object.CompanyVatNumber;
import com.bunq.sdk.model.generated.object.Ubo;
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
 * Create and manage companies.
 */
public class Company extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/company";
  protected static final String ENDPOINT_URL_READ = "user/%s/company/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/company";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/company/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_NAME = "name";
  public static final String FIELD_ADDRESS_MAIN = "address_main";
  public static final String FIELD_ADDRESS_POSTAL = "address_postal";
  public static final String FIELD_COUNTRY = "country";
  public static final String FIELD_UBO = "ubo";
  public static final String FIELD_CHAMBER_OF_COMMERCE_NUMBER = "chamber_of_commerce_number";
  public static final String FIELD_LEGAL_FORM = "legal_form";
  public static final String FIELD_SUBSCRIPTION_TYPE = "subscription_type";
  public static final String FIELD_AVATAR_UUID = "avatar_uuid";
  public static final String FIELD_VAT_NUMBER = "vat_number";
  public static final String FIELD_VAT_NUMBERS = "vat_numbers";
  public static final String FIELD_SIGNUP_TRACK_TYPE = "signup_track_type";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "UserCompany";

  /**
   */
  @Expose
  @SerializedName("UserCompany")
  private UserCompany userCompany;

  /**
   * The company name.
   */
  @Expose
  @SerializedName("name_field_for_request")
  private String nameFieldForRequest;

  /**
   * The company's main address.
   */
  @Expose
  @SerializedName("address_main_field_for_request")
  private Address addressMainFieldForRequest;

  /**
   * The company's postal address.
   */
  @Expose
  @SerializedName("address_postal_field_for_request")
  private Address addressPostalFieldForRequest;

  /**
   * The country where the company is registered.
   */
  @Expose
  @SerializedName("country_field_for_request")
  private String countryFieldForRequest;

  /**
   * The names and birth dates of the company's ultimate beneficiary owners. Minimum zero, maximum
   * four.
   */
  @Expose
  @SerializedName("ubo_field_for_request")
  private List<Ubo> uboFieldForRequest;

  /**
   * The company's chamber of commerce number.
   */
  @Expose
  @SerializedName("chamber_of_commerce_number_field_for_request")
  private String chamberOfCommerceNumberFieldForRequest;

  /**
   * The company's legal form.
   */
  @Expose
  @SerializedName("legal_form_field_for_request")
  private String legalFormFieldForRequest;

  /**
   * The subscription type for the company.
   */
  @Expose
  @SerializedName("subscription_type_field_for_request")
  private String subscriptionTypeFieldForRequest;

  /**
   * The public UUID of the company's avatar.
   */
  @Expose
  @SerializedName("avatar_uuid_field_for_request")
  private String avatarUuidFieldForRequest;

  /**
   * DEPRECATED All the vat numbers of the company
   */
  @Expose
  @SerializedName("vat_number_field_for_request")
  private CompanyVatNumber vatNumberFieldForRequest;

  /**
   * All the vat numbers of the company
   */
  @Expose
  @SerializedName("vat_numbers_field_for_request")
  private List<CompanyVatNumber> vatNumbersFieldForRequest;

  /**
   * The type of signup track the user is following.
   */
  @Expose
  @SerializedName("signup_track_type_field_for_request")
  private String signupTrackTypeFieldForRequest;

  public Company() {
  this(null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public Company(String name) {
  this(name, null, null, null, null, null, null, null, null, null, null, null);
  }

  public Company(String name, Address addressMain) {
  this(name, addressMain, null, null, null, null, null, null, null, null, null, null);
  }

  public Company(String name, Address addressMain, Address addressPostal) {
  this(name, addressMain, addressPostal, null, null, null, null, null, null, null, null, null);
  }

  public Company(String name, Address addressMain, Address addressPostal, String country) {
  this(name, addressMain, addressPostal, country, null, null, null, null, null, null, null, null);
  }

  public Company(String name, Address addressMain, Address addressPostal, String country, String legalForm) {
  this(name, addressMain, addressPostal, country, legalForm, null, null, null, null, null, null, null);
  }

  public Company(String name, Address addressMain, Address addressPostal, String country, String legalForm, String subscriptionType) {
  this(name, addressMain, addressPostal, country, legalForm, subscriptionType, null, null, null, null, null, null);
  }

  public Company(String name, Address addressMain, Address addressPostal, String country, String legalForm, String subscriptionType, List<Ubo> ubo) {
  this(name, addressMain, addressPostal, country, legalForm, subscriptionType, ubo, null, null, null, null, null);
  }

  public Company(String name, Address addressMain, Address addressPostal, String country, String legalForm, String subscriptionType, List<Ubo> ubo, String chamberOfCommerceNumber) {
  this(name, addressMain, addressPostal, country, legalForm, subscriptionType, ubo, chamberOfCommerceNumber, null, null, null, null);
  }

  public Company(String name, Address addressMain, Address addressPostal, String country, String legalForm, String subscriptionType, List<Ubo> ubo, String chamberOfCommerceNumber, String avatarUuid) {
  this(name, addressMain, addressPostal, country, legalForm, subscriptionType, ubo, chamberOfCommerceNumber, avatarUuid, null, null, null);
  }

  public Company(String name, Address addressMain, Address addressPostal, String country, String legalForm, String subscriptionType, List<Ubo> ubo, String chamberOfCommerceNumber, String avatarUuid, CompanyVatNumber vatNumber) {
  this(name, addressMain, addressPostal, country, legalForm, subscriptionType, ubo, chamberOfCommerceNumber, avatarUuid, vatNumber, null, null);
  }

  public Company(String name, Address addressMain, Address addressPostal, String country, String legalForm, String subscriptionType, List<Ubo> ubo, String chamberOfCommerceNumber, String avatarUuid, CompanyVatNumber vatNumber, List<CompanyVatNumber> vatNumbers) {
  this(name, addressMain, addressPostal, country, legalForm, subscriptionType, ubo, chamberOfCommerceNumber, avatarUuid, vatNumber, vatNumbers, null);
  }

  public Company(String name, Address addressMain, Address addressPostal, String country, String legalForm, String subscriptionType, List<Ubo> ubo, String chamberOfCommerceNumber, String avatarUuid, CompanyVatNumber vatNumber, List<CompanyVatNumber> vatNumbers, String signupTrackType) {
    this.nameFieldForRequest = name;
    this.addressMainFieldForRequest = addressMain;
    this.addressPostalFieldForRequest = addressPostal;
    this.countryFieldForRequest = country;
    this.uboFieldForRequest = ubo;
    this.chamberOfCommerceNumberFieldForRequest = chamberOfCommerceNumber;
    this.legalFormFieldForRequest = legalForm;
    this.subscriptionTypeFieldForRequest = subscriptionType;
    this.avatarUuidFieldForRequest = avatarUuid;
    this.vatNumberFieldForRequest = vatNumber;
    this.vatNumbersFieldForRequest = vatNumbers;
    this.signupTrackTypeFieldForRequest = signupTrackType;
  }  /**
   * @param name The company name.
   * @param addressMain The company's main address.
   * @param addressPostal The company's postal address.
   * @param country The country where the company is registered.
   * @param legalForm The company's legal form.
   * @param subscriptionType The subscription type for the company.
   * @param ubo The names and birth dates of the company's ultimate beneficiary owners. Minimum
   * zero, maximum four.
   * @param chamberOfCommerceNumber The company's chamber of commerce number.
   * @param avatarUuid The public UUID of the company's avatar.
   * @param vatNumber DEPRECATED All the vat numbers of the company
   * @param vatNumbers All the vat numbers of the company
   * @param signupTrackType The type of signup track the user is following.
   */
  public static BunqResponse<Integer> create(String name, Address addressMain, Address addressPostal, String country, String legalForm, String subscriptionType, List<Ubo> ubo, String chamberOfCommerceNumber, String avatarUuid, CompanyVatNumber vatNumber, List<CompanyVatNumber> vatNumbers, String signupTrackType, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_NAME, name);
requestMap.put(FIELD_ADDRESS_MAIN, addressMain);
requestMap.put(FIELD_ADDRESS_POSTAL, addressPostal);
requestMap.put(FIELD_COUNTRY, country);
requestMap.put(FIELD_UBO, ubo);
requestMap.put(FIELD_CHAMBER_OF_COMMERCE_NUMBER, chamberOfCommerceNumber);
requestMap.put(FIELD_LEGAL_FORM, legalForm);
requestMap.put(FIELD_SUBSCRIPTION_TYPE, subscriptionType);
requestMap.put(FIELD_AVATAR_UUID, avatarUuid);
requestMap.put(FIELD_VAT_NUMBER, vatNumber);
requestMap.put(FIELD_VAT_NUMBERS, vatNumbers);
requestMap.put(FIELD_SIGNUP_TRACK_TYPE, signupTrackType);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String name) {
    return create(name, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String name, Address addressMain) {
    return create(name, addressMain, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String name, Address addressMain, Address addressPostal) {
    return create(name, addressMain, addressPostal, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String name, Address addressMain, Address addressPostal, String country) {
    return create(name, addressMain, addressPostal, country, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String name, Address addressMain, Address addressPostal, String country, String legalForm) {
    return create(name, addressMain, addressPostal, country, legalForm, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String name, Address addressMain, Address addressPostal, String country, String legalForm, String subscriptionType) {
    return create(name, addressMain, addressPostal, country, legalForm, subscriptionType, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String name, Address addressMain, Address addressPostal, String country, String legalForm, String subscriptionType, List<Ubo> ubo) {
    return create(name, addressMain, addressPostal, country, legalForm, subscriptionType, ubo, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String name, Address addressMain, Address addressPostal, String country, String legalForm, String subscriptionType, List<Ubo> ubo, String chamberOfCommerceNumber) {
    return create(name, addressMain, addressPostal, country, legalForm, subscriptionType, ubo, chamberOfCommerceNumber, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String name, Address addressMain, Address addressPostal, String country, String legalForm, String subscriptionType, List<Ubo> ubo, String chamberOfCommerceNumber, String avatarUuid) {
    return create(name, addressMain, addressPostal, country, legalForm, subscriptionType, ubo, chamberOfCommerceNumber, avatarUuid, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String name, Address addressMain, Address addressPostal, String country, String legalForm, String subscriptionType, List<Ubo> ubo, String chamberOfCommerceNumber, String avatarUuid, CompanyVatNumber vatNumber) {
    return create(name, addressMain, addressPostal, country, legalForm, subscriptionType, ubo, chamberOfCommerceNumber, avatarUuid, vatNumber, null, null, null);
  }

  public static BunqResponse<Integer> create(String name, Address addressMain, Address addressPostal, String country, String legalForm, String subscriptionType, List<Ubo> ubo, String chamberOfCommerceNumber, String avatarUuid, CompanyVatNumber vatNumber, List<CompanyVatNumber> vatNumbers) {
    return create(name, addressMain, addressPostal, country, legalForm, subscriptionType, ubo, chamberOfCommerceNumber, avatarUuid, vatNumber, vatNumbers, null, null);
  }

  public static BunqResponse<Integer> create(String name, Address addressMain, Address addressPostal, String country, String legalForm, String subscriptionType, List<Ubo> ubo, String chamberOfCommerceNumber, String avatarUuid, CompanyVatNumber vatNumber, List<CompanyVatNumber> vatNumbers, String signupTrackType) {
    return create(name, addressMain, addressPostal, country, legalForm, subscriptionType, ubo, chamberOfCommerceNumber, avatarUuid, vatNumber, vatNumbers, signupTrackType, null);
  }

  /**
   */
  public static BunqResponse<Company> get(Integer companyId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), companyId), params, customHeaders);

    return fromJson(Company.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<Company> get() {
    return get(null, null, null);
  }

  public static BunqResponse<Company> get(Integer companyId) {
    return get(companyId, null, null);
  }

  public static BunqResponse<Company> get(Integer companyId, Map<String, String> params) {
    return get(companyId, params, null);
  }

  /**
   */
  public static BunqResponse<List<Company>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(Company.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<Company>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<Company>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * @param avatarUuid The public UUID of the company's avatar.
   */
  public static BunqResponse<Integer> update(Integer companyId, String avatarUuid, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_AVATAR_UUID, avatarUuid);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), companyId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer companyId) {
    return update(companyId, null, null);
  }

  public static BunqResponse<Integer> update(Integer companyId, String avatarUuid) {
    return update(companyId, avatarUuid, null);
  }

  /**
   */
  public UserCompany getUserCompany() {
    return this.userCompany;
  }

  public void setUserCompany(UserCompany userCompany) {
    this.userCompany = userCompany;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.userCompany != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static Company fromJsonReader(JsonReader reader) {
    return fromJsonReader(Company.class, reader);
  }

}
