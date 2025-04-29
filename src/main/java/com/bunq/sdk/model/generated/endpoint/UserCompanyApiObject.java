package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AddressObject;
import com.bunq.sdk.model.generated.object.AmountObject;
import com.bunq.sdk.model.generated.object.AvatarObject;
import com.bunq.sdk.model.generated.object.LabelUserObject;
import com.bunq.sdk.model.generated.object.NotificationFilterObject;
import com.bunq.sdk.model.generated.object.PointerObject;
import com.bunq.sdk.model.generated.object.TaxResidentObject;
import com.bunq.sdk.model.generated.object.UboObject;
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
 * With UserCompany you can retrieve information regarding the authenticated UserCompany and
 * update specific fields.<br/><br/>Notification filters can be set on a UserCompany level to
 * receive callbacks. For more information check the <a href="/api/1/page/callbacks">dedicated
 * callbacks page</a>.
 */
public class UserCompanyApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user-company/%s";
  protected static final String ENDPOINT_URL_UPDATE = "user-company/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_NAME = "name";
  public static final String FIELD_PUBLIC_NICK_NAME = "public_nick_name";
  public static final String FIELD_AVATAR_UUID = "avatar_uuid";
  public static final String FIELD_ADDRESS_MAIN = "address_main";
  public static final String FIELD_ADDRESS_POSTAL = "address_postal";
  public static final String FIELD_LANGUAGE = "language";
  public static final String FIELD_REGION = "region";
  public static final String FIELD_COUNTRY = "country";
  public static final String FIELD_UBO = "ubo";
  public static final String FIELD_CHAMBER_OF_COMMERCE_NUMBER = "chamber_of_commerce_number";
  public static final String FIELD_LEGAL_FORM = "legal_form";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_SUB_STATUS = "sub_status";
  public static final String FIELD_SESSION_TIMEOUT = "session_timeout";
  public static final String FIELD_DAILY_LIMIT_WITHOUT_CONFIRMATION_LOGIN = "daily_limit_without_confirmation_login";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "UserCompany";

  /**
   * The id of the modified company.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the company object's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the company object's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The company's public UUID.
   */
  @Expose
  @SerializedName("public_uuid")
  private String publicUuid;

  /**
   * The company name.
   */
  @Expose
  @SerializedName("name")
  private String name;

  /**
   * The company's display name.
   */
  @Expose
  @SerializedName("display_name")
  private String displayName;

  /**
   * The company's public nick name.
   */
  @Expose
  @SerializedName("public_nick_name")
  private String publicNickName;

  /**
   * The aliases of the account.
   */
  @Expose
  @SerializedName("alias")
  private List<PointerObject> alias;

  /**
   * The company's chamber of commerce number.
   */
  @Expose
  @SerializedName("chamber_of_commerce_number")
  private String chamberOfCommerceNumber;

  /**
   * The company's legal form.
   */
  @Expose
  @SerializedName("legal_form")
  private String legalForm;

  /**
   * The type of business entity.
   */
  @Expose
  @SerializedName("type_of_business_entity")
  private String typeOfBusinessEntity;

  /**
   * The sector of industry.
   */
  @Expose
  @SerializedName("sector_of_industry")
  private String sectorOfIndustry;

  /**
   * The company's other bank account IBAN, through which we verify it.
   */
  @Expose
  @SerializedName("counter_bank_iban")
  private String counterBankIban;

  /**
   * The company's avatar.
   */
  @Expose
  @SerializedName("avatar")
  private AvatarObject avatar;

  /**
   * The company's main address.
   */
  @Expose
  @SerializedName("address_main")
  private AddressObject addressMain;

  /**
   * The company's postal address.
   */
  @Expose
  @SerializedName("address_postal")
  private AddressObject addressPostal;

  /**
   * The company's shipping address.
   */
  @Expose
  @SerializedName("address_shipping")
  private AddressObject addressShipping;

  /**
   * The version of the terms of service accepted by the user.
   */
  @Expose
  @SerializedName("version_terms_of_service")
  private String versionTermsOfService;

  /**
   * The existing bunq aliases for the company's directors.
   */
  @Expose
  @SerializedName("directors")
  private List<LabelUserObject> directors;

  /**
   * The person's preferred language. Formatted as a ISO 639-1 language code plus a ISO 3166-1
   * alpha-2 country code, seperated by an underscore.
   */
  @Expose
  @SerializedName("language")
  private String language;

  /**
   * The country as an ISO 3166-1 alpha-2 country code.
   */
  @Expose
  @SerializedName("country")
  private String country;

  /**
   * The person's preferred region. Formatted as a ISO 639-1 language code plus a ISO 3166-1
   * alpha-2 country code, seperated by an underscore.
   */
  @Expose
  @SerializedName("region")
  private String region;

  /**
   * The names of the company's ultimate beneficiary owners. Minimum zero, maximum four.
   */
  @Expose
  @SerializedName("ubo")
  private List<UboObject> ubo;

  /**
   * The user status. Can be: ACTIVE, SIGNUP, RECOVERY.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The user sub-status. Can be: NONE, FACE_RESET, APPROVAL, APPROVAL_DIRECTOR, APPROVAL_PARENT,
   * APPROVAL_SUPPORT, COUNTER_IBAN, IDEAL or SUBMIT.
   */
  @Expose
  @SerializedName("sub_status")
  private String subStatus;

  /**
   * The setting for the session timeout of the company in seconds.
   */
  @Expose
  @SerializedName("session_timeout")
  private Integer sessionTimeout;

  /**
   * The amount the company can pay in the session without asking for credentials.
   */
  @Expose
  @SerializedName("daily_limit_without_confirmation_login")
  private AmountObject dailyLimitWithoutConfirmationLogin;

  /**
   * The types of notifications that will result in a push notification or URL callback for this
   * UserCompany.
   */
  @Expose
  @SerializedName("notification_filters")
  private List<NotificationFilterObject> notificationFilters;

  /**
   * The customer profile of the company.
   */
  @Expose
  @SerializedName("customer")
  private CustomerApiObject customer;

  /**
   * The customer limits of the company.
   */
  @Expose
  @SerializedName("customer_limit")
  private CustomerLimitApiObject customerLimit;

  /**
   * The subscription of the company.
   */
  @Expose
  @SerializedName("billing_contract")
  private List<BillingContractSubscriptionApiObject> billingContract;

  /**
   * The user deny reason.
   */
  @Expose
  @SerializedName("deny_reason")
  private String denyReason;

  /**
   * The relations for this user.
   */
  @Expose
  @SerializedName("relations")
  private List<RelationUserApiObject> relations;

  /**
   * The user's tax residence numbers for different countries.
   */
  @Expose
  @SerializedName("tax_resident")
  private List<TaxResidentObject> taxResident;

  /**
   * The company name.
   */
  @Expose
  @SerializedName("name_field_for_request")
  private String nameFieldForRequest;

  /**
   * The company's nick name.
   */
  @Expose
  @SerializedName("public_nick_name_field_for_request")
  private String publicNickNameFieldForRequest;

  /**
   * The public UUID of the company's avatar.
   */
  @Expose
  @SerializedName("avatar_uuid_field_for_request")
  private String avatarUuidFieldForRequest;

  /**
   * The user's main address.
   */
  @Expose
  @SerializedName("address_main_field_for_request")
  private AddressObject addressMainFieldForRequest;

  /**
   * The company's postal address.
   */
  @Expose
  @SerializedName("address_postal_field_for_request")
  private AddressObject addressPostalFieldForRequest;

  /**
   * The person's preferred language. Formatted as a ISO 639-1 language code plus a ISO 3166-1
   * alpha-2 country code, seperated by an underscore.
   */
  @Expose
  @SerializedName("language_field_for_request")
  private String languageFieldForRequest;

  /**
   * The person's preferred region. Formatted as a ISO 639-1 language code plus a ISO 3166-1
   * alpha-2 country code, seperated by an underscore.
   */
  @Expose
  @SerializedName("region_field_for_request")
  private String regionFieldForRequest;

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
  private List<UboObject> uboFieldForRequest;

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
   * The user status. Can be: ACTIVE, SIGNUP, RECOVERY.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The user sub-status. Can be: NONE, FACE_RESET, APPROVAL, APPROVAL_DIRECTOR, APPROVAL_PARENT,
   * APPROVAL_SUPPORT, COUNTER_IBAN, IDEAL or SUBMIT.
   */
  @Expose
  @SerializedName("sub_status_field_for_request")
  private String subStatusFieldForRequest;

  /**
   * The setting for the session timeout of the company in seconds.
   */
  @Expose
  @SerializedName("session_timeout_field_for_request")
  private Integer sessionTimeoutFieldForRequest;

  /**
   * The amount the company can pay in the session without asking for credentials.
   */
  @Expose
  @SerializedName("daily_limit_without_confirmation_login_field_for_request")
  private AmountObject dailyLimitWithoutConfirmationLoginFieldForRequest;

  public UserCompanyApiObject() {
  this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserCompanyApiObject(AddressObject addressMain) {
  this(addressMain, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserCompanyApiObject(AddressObject addressMain, String language) {
  this(addressMain, language, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserCompanyApiObject(AddressObject addressMain, String language, String region) {
  this(addressMain, language, region, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserCompanyApiObject(AddressObject addressMain, String language, String region, String name) {
  this(addressMain, language, region, name, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserCompanyApiObject(AddressObject addressMain, String language, String region, String name, String publicNickName) {
  this(addressMain, language, region, name, publicNickName, null, null, null, null, null, null, null, null, null, null);
  }

  public UserCompanyApiObject(AddressObject addressMain, String language, String region, String name, String publicNickName, String avatarUuid) {
  this(addressMain, language, region, name, publicNickName, avatarUuid, null, null, null, null, null, null, null, null, null);
  }

  public UserCompanyApiObject(AddressObject addressMain, String language, String region, String name, String publicNickName, String avatarUuid, AddressObject addressPostal) {
  this(addressMain, language, region, name, publicNickName, avatarUuid, addressPostal, null, null, null, null, null, null, null, null);
  }

  public UserCompanyApiObject(AddressObject addressMain, String language, String region, String name, String publicNickName, String avatarUuid, AddressObject addressPostal, String country) {
  this(addressMain, language, region, name, publicNickName, avatarUuid, addressPostal, country, null, null, null, null, null, null, null);
  }

  public UserCompanyApiObject(AddressObject addressMain, String language, String region, String name, String publicNickName, String avatarUuid, AddressObject addressPostal, String country, List<UboObject> ubo) {
  this(addressMain, language, region, name, publicNickName, avatarUuid, addressPostal, country, ubo, null, null, null, null, null, null);
  }

  public UserCompanyApiObject(AddressObject addressMain, String language, String region, String name, String publicNickName, String avatarUuid, AddressObject addressPostal, String country, List<UboObject> ubo, String chamberOfCommerceNumber) {
  this(addressMain, language, region, name, publicNickName, avatarUuid, addressPostal, country, ubo, chamberOfCommerceNumber, null, null, null, null, null);
  }

  public UserCompanyApiObject(AddressObject addressMain, String language, String region, String name, String publicNickName, String avatarUuid, AddressObject addressPostal, String country, List<UboObject> ubo, String chamberOfCommerceNumber, String legalForm) {
  this(addressMain, language, region, name, publicNickName, avatarUuid, addressPostal, country, ubo, chamberOfCommerceNumber, legalForm, null, null, null, null);
  }

  public UserCompanyApiObject(AddressObject addressMain, String language, String region, String name, String publicNickName, String avatarUuid, AddressObject addressPostal, String country, List<UboObject> ubo, String chamberOfCommerceNumber, String legalForm, String status) {
  this(addressMain, language, region, name, publicNickName, avatarUuid, addressPostal, country, ubo, chamberOfCommerceNumber, legalForm, status, null, null, null);
  }

  public UserCompanyApiObject(AddressObject addressMain, String language, String region, String name, String publicNickName, String avatarUuid, AddressObject addressPostal, String country, List<UboObject> ubo, String chamberOfCommerceNumber, String legalForm, String status, String subStatus) {
  this(addressMain, language, region, name, publicNickName, avatarUuid, addressPostal, country, ubo, chamberOfCommerceNumber, legalForm, status, subStatus, null, null);
  }

  public UserCompanyApiObject(AddressObject addressMain, String language, String region, String name, String publicNickName, String avatarUuid, AddressObject addressPostal, String country, List<UboObject> ubo, String chamberOfCommerceNumber, String legalForm, String status, String subStatus, Integer sessionTimeout) {
  this(addressMain, language, region, name, publicNickName, avatarUuid, addressPostal, country, ubo, chamberOfCommerceNumber, legalForm, status, subStatus, sessionTimeout, null);
  }

  public UserCompanyApiObject(AddressObject addressMain, String language, String region, String name, String publicNickName, String avatarUuid, AddressObject addressPostal, String country, List<UboObject> ubo, String chamberOfCommerceNumber, String legalForm, String status, String subStatus, Integer sessionTimeout, AmountObject dailyLimitWithoutConfirmationLogin) {
    this.nameFieldForRequest = name;
    this.publicNickNameFieldForRequest = publicNickName;
    this.avatarUuidFieldForRequest = avatarUuid;
    this.addressMainFieldForRequest = addressMain;
    this.addressPostalFieldForRequest = addressPostal;
    this.languageFieldForRequest = language;
    this.regionFieldForRequest = region;
    this.countryFieldForRequest = country;
    this.uboFieldForRequest = ubo;
    this.chamberOfCommerceNumberFieldForRequest = chamberOfCommerceNumber;
    this.legalFormFieldForRequest = legalForm;
    this.statusFieldForRequest = status;
    this.subStatusFieldForRequest = subStatus;
    this.sessionTimeoutFieldForRequest = sessionTimeout;
    this.dailyLimitWithoutConfirmationLoginFieldForRequest = dailyLimitWithoutConfirmationLogin;
  }  /**
   * Get a specific company.
   */
  public static BunqResponse<UserCompanyApiObject> get(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId()), params, customHeaders);

    return fromJson(UserCompanyApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<UserCompanyApiObject> get() {
    return get(null, null);
  }

  public static BunqResponse<UserCompanyApiObject> get(Map<String, String> params) {
    return get(params, null);
  }

  /**
   * Modify a specific company's data.
   * @param name The company name.
   * @param publicNickName The company's nick name.
   * @param avatarUuid The public UUID of the company's avatar.
   * @param addressMain The user's main address.
   * @param addressPostal The company's postal address.
   * @param language The person's preferred language. Formatted as a ISO 639-1 language code plus
   * a ISO 3166-1 alpha-2 country code, seperated by an underscore.
   * @param region The person's preferred region. Formatted as a ISO 639-1 language code plus a
   * ISO 3166-1 alpha-2 country code, seperated by an underscore.
   * @param country The country where the company is registered.
   * @param ubo The names and birth dates of the company's ultimate beneficiary owners. Minimum
   * zero, maximum four.
   * @param chamberOfCommerceNumber The company's chamber of commerce number.
   * @param legalForm The company's legal form.
   * @param status The user status. Can be: ACTIVE, SIGNUP, RECOVERY.
   * @param subStatus The user sub-status. Can be: NONE, FACE_RESET, APPROVAL, APPROVAL_DIRECTOR,
   * APPROVAL_PARENT, APPROVAL_SUPPORT, COUNTER_IBAN, IDEAL or SUBMIT.
   * @param sessionTimeout The setting for the session timeout of the company in seconds.
   * @param dailyLimitWithoutConfirmationLogin The amount the company can pay in the session
   * without asking for credentials.
   */
  public static BunqResponse<Integer> update(String name, String publicNickName, String avatarUuid, AddressObject addressMain, AddressObject addressPostal, String language, String region, String country, List<UboObject> ubo, String chamberOfCommerceNumber, String legalForm, String status, String subStatus, Integer sessionTimeout, AmountObject dailyLimitWithoutConfirmationLogin, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_NAME, name);
requestMap.put(FIELD_PUBLIC_NICK_NAME, publicNickName);
requestMap.put(FIELD_AVATAR_UUID, avatarUuid);
requestMap.put(FIELD_ADDRESS_MAIN, addressMain);
requestMap.put(FIELD_ADDRESS_POSTAL, addressPostal);
requestMap.put(FIELD_LANGUAGE, language);
requestMap.put(FIELD_REGION, region);
requestMap.put(FIELD_COUNTRY, country);
requestMap.put(FIELD_UBO, ubo);
requestMap.put(FIELD_CHAMBER_OF_COMMERCE_NUMBER, chamberOfCommerceNumber);
requestMap.put(FIELD_LEGAL_FORM, legalForm);
requestMap.put(FIELD_STATUS, status);
requestMap.put(FIELD_SUB_STATUS, subStatus);
requestMap.put(FIELD_SESSION_TIMEOUT, sessionTimeout);
requestMap.put(FIELD_DAILY_LIMIT_WITHOUT_CONFIRMATION_LOGIN, dailyLimitWithoutConfirmationLogin);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId()), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(String name) {
    return update(name, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String name, String publicNickName) {
    return update(name, publicNickName, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String name, String publicNickName, String avatarUuid) {
    return update(name, publicNickName, avatarUuid, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String name, String publicNickName, String avatarUuid, AddressObject addressMain) {
    return update(name, publicNickName, avatarUuid, addressMain, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String name, String publicNickName, String avatarUuid, AddressObject addressMain, AddressObject addressPostal) {
    return update(name, publicNickName, avatarUuid, addressMain, addressPostal, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String name, String publicNickName, String avatarUuid, AddressObject addressMain, AddressObject addressPostal, String language) {
    return update(name, publicNickName, avatarUuid, addressMain, addressPostal, language, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String name, String publicNickName, String avatarUuid, AddressObject addressMain, AddressObject addressPostal, String language, String region) {
    return update(name, publicNickName, avatarUuid, addressMain, addressPostal, language, region, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String name, String publicNickName, String avatarUuid, AddressObject addressMain, AddressObject addressPostal, String language, String region, String country) {
    return update(name, publicNickName, avatarUuid, addressMain, addressPostal, language, region, country, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String name, String publicNickName, String avatarUuid, AddressObject addressMain, AddressObject addressPostal, String language, String region, String country, List<UboObject> ubo) {
    return update(name, publicNickName, avatarUuid, addressMain, addressPostal, language, region, country, ubo, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String name, String publicNickName, String avatarUuid, AddressObject addressMain, AddressObject addressPostal, String language, String region, String country, List<UboObject> ubo, String chamberOfCommerceNumber) {
    return update(name, publicNickName, avatarUuid, addressMain, addressPostal, language, region, country, ubo, chamberOfCommerceNumber, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String name, String publicNickName, String avatarUuid, AddressObject addressMain, AddressObject addressPostal, String language, String region, String country, List<UboObject> ubo, String chamberOfCommerceNumber, String legalForm) {
    return update(name, publicNickName, avatarUuid, addressMain, addressPostal, language, region, country, ubo, chamberOfCommerceNumber, legalForm, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String name, String publicNickName, String avatarUuid, AddressObject addressMain, AddressObject addressPostal, String language, String region, String country, List<UboObject> ubo, String chamberOfCommerceNumber, String legalForm, String status) {
    return update(name, publicNickName, avatarUuid, addressMain, addressPostal, language, region, country, ubo, chamberOfCommerceNumber, legalForm, status, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String name, String publicNickName, String avatarUuid, AddressObject addressMain, AddressObject addressPostal, String language, String region, String country, List<UboObject> ubo, String chamberOfCommerceNumber, String legalForm, String status, String subStatus) {
    return update(name, publicNickName, avatarUuid, addressMain, addressPostal, language, region, country, ubo, chamberOfCommerceNumber, legalForm, status, subStatus, null, null, null);
  }

  public static BunqResponse<Integer> update(String name, String publicNickName, String avatarUuid, AddressObject addressMain, AddressObject addressPostal, String language, String region, String country, List<UboObject> ubo, String chamberOfCommerceNumber, String legalForm, String status, String subStatus, Integer sessionTimeout) {
    return update(name, publicNickName, avatarUuid, addressMain, addressPostal, language, region, country, ubo, chamberOfCommerceNumber, legalForm, status, subStatus, sessionTimeout, null, null);
  }

  public static BunqResponse<Integer> update(String name, String publicNickName, String avatarUuid, AddressObject addressMain, AddressObject addressPostal, String language, String region, String country, List<UboObject> ubo, String chamberOfCommerceNumber, String legalForm, String status, String subStatus, Integer sessionTimeout, AmountObject dailyLimitWithoutConfirmationLogin) {
    return update(name, publicNickName, avatarUuid, addressMain, addressPostal, language, region, country, ubo, chamberOfCommerceNumber, legalForm, status, subStatus, sessionTimeout, dailyLimitWithoutConfirmationLogin, null);
  }

  /**
   * The id of the modified company.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the company object's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the company object's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The company's public UUID.
   */
  public String getPublicUuid() {
    return this.publicUuid;
  }

  public void setPublicUuid(String publicUuid) {
    this.publicUuid = publicUuid;
  }

  /**
   * The company name.
   */
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The company's display name.
   */
  public String getDisplayName() {
    return this.displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * The company's public nick name.
   */
  public String getPublicNickName() {
    return this.publicNickName;
  }

  public void setPublicNickName(String publicNickName) {
    this.publicNickName = publicNickName;
  }

  /**
   * The aliases of the account.
   */
  public List<PointerObject> getAlias() {
    return this.alias;
  }

  public void setAlias(List<PointerObject> alias) {
    this.alias = alias;
  }

  /**
   * The company's chamber of commerce number.
   */
  public String getChamberOfCommerceNumber() {
    return this.chamberOfCommerceNumber;
  }

  public void setChamberOfCommerceNumber(String chamberOfCommerceNumber) {
    this.chamberOfCommerceNumber = chamberOfCommerceNumber;
  }

  /**
   * The company's legal form.
   */
  public String getLegalForm() {
    return this.legalForm;
  }

  public void setLegalForm(String legalForm) {
    this.legalForm = legalForm;
  }

  /**
   * The type of business entity.
   */
  public String getTypeOfBusinessEntity() {
    return this.typeOfBusinessEntity;
  }

  public void setTypeOfBusinessEntity(String typeOfBusinessEntity) {
    this.typeOfBusinessEntity = typeOfBusinessEntity;
  }

  /**
   * The sector of industry.
   */
  public String getSectorOfIndustry() {
    return this.sectorOfIndustry;
  }

  public void setSectorOfIndustry(String sectorOfIndustry) {
    this.sectorOfIndustry = sectorOfIndustry;
  }

  /**
   * The company's other bank account IBAN, through which we verify it.
   */
  public String getCounterBankIban() {
    return this.counterBankIban;
  }

  public void setCounterBankIban(String counterBankIban) {
    this.counterBankIban = counterBankIban;
  }

  /**
   * The company's avatar.
   */
  public AvatarObject getAvatar() {
    return this.avatar;
  }

  public void setAvatar(AvatarObject avatar) {
    this.avatar = avatar;
  }

  /**
   * The company's main address.
   */
  public AddressObject getAddressMain() {
    return this.addressMain;
  }

  public void setAddressMain(AddressObject addressMain) {
    this.addressMain = addressMain;
  }

  /**
   * The company's postal address.
   */
  public AddressObject getAddressPostal() {
    return this.addressPostal;
  }

  public void setAddressPostal(AddressObject addressPostal) {
    this.addressPostal = addressPostal;
  }

  /**
   * The company's shipping address.
   */
  public AddressObject getAddressShipping() {
    return this.addressShipping;
  }

  public void setAddressShipping(AddressObject addressShipping) {
    this.addressShipping = addressShipping;
  }

  /**
   * The version of the terms of service accepted by the user.
   */
  public String getVersionTermsOfService() {
    return this.versionTermsOfService;
  }

  public void setVersionTermsOfService(String versionTermsOfService) {
    this.versionTermsOfService = versionTermsOfService;
  }

  /**
   * The existing bunq aliases for the company's directors.
   */
  public List<LabelUserObject> getDirectors() {
    return this.directors;
  }

  public void setDirectors(List<LabelUserObject> directors) {
    this.directors = directors;
  }

  /**
   * The person's preferred language. Formatted as a ISO 639-1 language code plus a ISO 3166-1
   * alpha-2 country code, seperated by an underscore.
   */
  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * The country as an ISO 3166-1 alpha-2 country code.
   */
  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * The person's preferred region. Formatted as a ISO 639-1 language code plus a ISO 3166-1
   * alpha-2 country code, seperated by an underscore.
   */
  public String getRegion() {
    return this.region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * The names of the company's ultimate beneficiary owners. Minimum zero, maximum four.
   */
  public List<UboObject> getUbo() {
    return this.ubo;
  }

  public void setUbo(List<UboObject> ubo) {
    this.ubo = ubo;
  }

  /**
   * The user status. Can be: ACTIVE, SIGNUP, RECOVERY.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The user sub-status. Can be: NONE, FACE_RESET, APPROVAL, APPROVAL_DIRECTOR, APPROVAL_PARENT,
   * APPROVAL_SUPPORT, COUNTER_IBAN, IDEAL or SUBMIT.
   */
  public String getSubStatus() {
    return this.subStatus;
  }

  public void setSubStatus(String subStatus) {
    this.subStatus = subStatus;
  }

  /**
   * The setting for the session timeout of the company in seconds.
   */
  public Integer getSessionTimeout() {
    return this.sessionTimeout;
  }

  public void setSessionTimeout(Integer sessionTimeout) {
    this.sessionTimeout = sessionTimeout;
  }

  /**
   * The amount the company can pay in the session without asking for credentials.
   */
  public AmountObject getDailyLimitWithoutConfirmationLogin() {
    return this.dailyLimitWithoutConfirmationLogin;
  }

  public void setDailyLimitWithoutConfirmationLogin(AmountObject dailyLimitWithoutConfirmationLogin) {
    this.dailyLimitWithoutConfirmationLogin = dailyLimitWithoutConfirmationLogin;
  }

  /**
   * The types of notifications that will result in a push notification or URL callback for this
   * UserCompany.
   */
  public List<NotificationFilterObject> getNotificationFilters() {
    return this.notificationFilters;
  }

  public void setNotificationFilters(List<NotificationFilterObject> notificationFilters) {
    this.notificationFilters = notificationFilters;
  }

  /**
   * The customer profile of the company.
   */
  public CustomerApiObject getCustomer() {
    return this.customer;
  }

  public void setCustomer(CustomerApiObject customer) {
    this.customer = customer;
  }

  /**
   * The customer limits of the company.
   */
  public CustomerLimitApiObject getCustomerLimit() {
    return this.customerLimit;
  }

  public void setCustomerLimit(CustomerLimitApiObject customerLimit) {
    this.customerLimit = customerLimit;
  }

  /**
   * The subscription of the company.
   */
  public List<BillingContractSubscriptionApiObject> getBillingContract() {
    return this.billingContract;
  }

  public void setBillingContract(List<BillingContractSubscriptionApiObject> billingContract) {
    this.billingContract = billingContract;
  }

  /**
   * The user deny reason.
   */
  public String getDenyReason() {
    return this.denyReason;
  }

  public void setDenyReason(String denyReason) {
    this.denyReason = denyReason;
  }

  /**
   * The relations for this user.
   */
  public List<RelationUserApiObject> getRelations() {
    return this.relations;
  }

  public void setRelations(List<RelationUserApiObject> relations) {
    this.relations = relations;
  }

  /**
   * The user's tax residence numbers for different countries.
   */
  public List<TaxResidentObject> getTaxResident() {
    return this.taxResident;
  }

  public void setTaxResident(List<TaxResidentObject> taxResident) {
    this.taxResident = taxResident;
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

    if (this.publicUuid != null) {
      return false;
    }

    if (this.name != null) {
      return false;
    }

    if (this.displayName != null) {
      return false;
    }

    if (this.publicNickName != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.chamberOfCommerceNumber != null) {
      return false;
    }

    if (this.legalForm != null) {
      return false;
    }

    if (this.typeOfBusinessEntity != null) {
      return false;
    }

    if (this.sectorOfIndustry != null) {
      return false;
    }

    if (this.counterBankIban != null) {
      return false;
    }

    if (this.avatar != null) {
      return false;
    }

    if (this.addressMain != null) {
      return false;
    }

    if (this.addressPostal != null) {
      return false;
    }

    if (this.addressShipping != null) {
      return false;
    }

    if (this.versionTermsOfService != null) {
      return false;
    }

    if (this.directors != null) {
      return false;
    }

    if (this.language != null) {
      return false;
    }

    if (this.country != null) {
      return false;
    }

    if (this.region != null) {
      return false;
    }

    if (this.ubo != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.subStatus != null) {
      return false;
    }

    if (this.sessionTimeout != null) {
      return false;
    }

    if (this.dailyLimitWithoutConfirmationLogin != null) {
      return false;
    }

    if (this.notificationFilters != null) {
      return false;
    }

    if (this.customer != null) {
      return false;
    }

    if (this.customerLimit != null) {
      return false;
    }

    if (this.billingContract != null) {
      return false;
    }

    if (this.denyReason != null) {
      return false;
    }

    if (this.relations != null) {
      return false;
    }

    if (this.taxResident != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static UserCompanyApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(UserCompanyApiObject.class, reader);
  }

}
