package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.Address;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Avatar;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.bunq.sdk.model.generated.object.NotificationFilter;
import com.bunq.sdk.model.generated.object.Pointer;
import com.bunq.sdk.model.generated.object.Ubo;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
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
public class UserCompany extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_READ = "user-company/%s";
  private static final String ENDPOINT_URL_UPDATE = "user-company/%s";

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
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_SUB_STATUS = "sub_status";
  public static final String FIELD_SESSION_TIMEOUT = "session_timeout";
  public static final String FIELD_DAILY_LIMIT_WITHOUT_CONFIRMATION_LOGIN = "daily_limit_without_confirmation_login";
  public static final String FIELD_COUNTER_BANK_IBAN = "counter_bank_iban";
  public static final String FIELD_NOTIFICATION_FILTERS = "notification_filters";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "UserCompany";

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
  private List<Pointer> alias;

  /**
   * The company's chamber of commerce number.
   */
  @Expose
  @SerializedName("chamber_of_commerce_number")
  private String chamberOfCommerceNumber;

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
  private Avatar avatar;

  /**
   * The company's main address.
   */
  @Expose
  @SerializedName("address_main")
  private Address addressMain;

  /**
   * The company's postal address.
   */
  @Expose
  @SerializedName("address_postal")
  private Address addressPostal;

  /**
   * The version of the terms of service accepted by the user.
   */
  @Expose
  @SerializedName("version_terms_of_service")
  private String versionTermsOfService;

  /**
   * The existing bunq user alias for the company's director.
   */
  @Expose
  @SerializedName("director_alias")
  private LabelUser directorAlias;

  /**
   * The person's preferred language. Formatted as a ISO 639-1 language code plus a ISO 3166-1
   * alpha-2 country code, seperated by an underscore.
   */
  @Expose
  @SerializedName("language")
  private String language;

  /**
   * The country as an ISO 3166-1 alpha-2 country code..
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
  private List<Ubo> ubo;

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
  private Amount dailyLimitWithoutConfirmationLogin;

  /**
   * The types of notifications that will result in a push notification or URL callback for this
   * UserCompany.
   */
  @Expose
  @SerializedName("notification_filters")
  private List<NotificationFilter> notificationFilters;

  /**
   * The customer profile of the company.
   */
  @Expose
  @SerializedName("customer")
  private Customer customer;

  /**
   * The customer limits of the company.
   */
  @Expose
  @SerializedName("customer_limit")
  private CustomerLimit customerLimit;

  /**
   * The subscription of the company.
   */
  @Expose
  @SerializedName("billing_contract")
  private List<BillingContractSubscription> billingContract;

  public static BunqResponse<UserCompany> get(ApiContext apiContext, Integer userCompanyId) {
    return get(apiContext, userCompanyId, new HashMap<>());
  }

  /**
   * Get a specific company.
   */
  public static BunqResponse<UserCompany> get(ApiContext apiContext, Integer userCompanyId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userCompanyId), new HashMap<>(), customHeaders);

    return fromJson(UserCompany.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userCompanyId) {
    return update(apiContext, requestMap, userCompanyId, new HashMap<>());
  }

  /**
   * Modify a specific company's data.
   */
  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userCompanyId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, userCompanyId), requestBytes, customHeaders);

    return processForId(responseRaw);
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
  public List<Pointer> getAlias() {
    return this.alias;
  }

  public void setAlias(List<Pointer> alias) {
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
  public Avatar getAvatar() {
    return this.avatar;
  }

  public void setAvatar(Avatar avatar) {
    this.avatar = avatar;
  }

  /**
   * The company's main address.
   */
  public Address getAddressMain() {
    return this.addressMain;
  }

  public void setAddressMain(Address addressMain) {
    this.addressMain = addressMain;
  }

  /**
   * The company's postal address.
   */
  public Address getAddressPostal() {
    return this.addressPostal;
  }

  public void setAddressPostal(Address addressPostal) {
    this.addressPostal = addressPostal;
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
   * The existing bunq user alias for the company's director.
   */
  public LabelUser getDirectorAlias() {
    return this.directorAlias;
  }

  public void setDirectorAlias(LabelUser directorAlias) {
    this.directorAlias = directorAlias;
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
   * The country as an ISO 3166-1 alpha-2 country code..
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
  public List<Ubo> getUbo() {
    return this.ubo;
  }

  public void setUbo(List<Ubo> ubo) {
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
  public Amount getDailyLimitWithoutConfirmationLogin() {
    return this.dailyLimitWithoutConfirmationLogin;
  }

  public void setDailyLimitWithoutConfirmationLogin(Amount dailyLimitWithoutConfirmationLogin) {
    this.dailyLimitWithoutConfirmationLogin = dailyLimitWithoutConfirmationLogin;
  }

  /**
   * The types of notifications that will result in a push notification or URL callback for this
   * UserCompany.
   */
  public List<NotificationFilter> getNotificationFilters() {
    return this.notificationFilters;
  }

  public void setNotificationFilters(List<NotificationFilter> notificationFilters) {
    this.notificationFilters = notificationFilters;
  }

  /**
   * The customer profile of the company.
   */
  public Customer getCustomer() {
    return this.customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * The customer limits of the company.
   */
  public CustomerLimit getCustomerLimit() {
    return this.customerLimit;
  }

  public void setCustomerLimit(CustomerLimit customerLimit) {
    this.customerLimit = customerLimit;
  }

  /**
   * The subscription of the company.
   */
  public List<BillingContractSubscription> getBillingContract() {
    return this.billingContract;
  }

  public void setBillingContract(List<BillingContractSubscription> billingContract) {
    this.billingContract = billingContract;
  }

  /**
   */
  public boolean areAllFieldNull() {
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

    if (this.versionTermsOfService != null) {
      return false;
    }

    if (this.directorAlias != null) {
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

    return true;
  }

}
