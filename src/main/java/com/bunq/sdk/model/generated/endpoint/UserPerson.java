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
import com.bunq.sdk.model.generated.object.NotificationFilter;
import com.bunq.sdk.model.generated.object.Pointer;
import com.bunq.sdk.model.generated.object.TaxResident;
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
 * With UserPerson you can retrieve information regarding the authenticated UserPerson and
 * update specific fields.<br/><br/>Notification filters can be set on a UserPerson level to
 * receive callbacks. For more information check the <a href="/api/1/page/callbacks">dedicated
 * callbacks page</a>.
 */
public class UserPerson extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user-person/%s";
  protected static final String ENDPOINT_URL_UPDATE = "user-person/%s";

  /**
   * Field constants.
   */
  public static final String FIELD_SUBSCRIPTION_TYPE = "subscription_type";
  public static final String FIELD_FIRST_NAME = "first_name";
  public static final String FIELD_MIDDLE_NAME = "middle_name";
  public static final String FIELD_LAST_NAME = "last_name";
  public static final String FIELD_PUBLIC_NICK_NAME = "public_nick_name";
  public static final String FIELD_ADDRESS_MAIN = "address_main";
  public static final String FIELD_ADDRESS_POSTAL = "address_postal";
  public static final String FIELD_AVATAR_UUID = "avatar_uuid";
  public static final String FIELD_TAX_RESIDENT = "tax_resident";
  public static final String FIELD_DOCUMENT_TYPE = "document_type";
  public static final String FIELD_DOCUMENT_NUMBER = "document_number";
  public static final String FIELD_DOCUMENT_COUNTRY_OF_ISSUANCE = "document_country_of_issuance";
  public static final String FIELD_DOCUMENT_FRONT_ATTACHMENT_ID = "document_front_attachment_id";
  public static final String FIELD_DOCUMENT_BACK_ATTACHMENT_ID = "document_back_attachment_id";
  public static final String FIELD_DATE_OF_BIRTH = "date_of_birth";
  public static final String FIELD_NATIONALITY = "nationality";
  public static final String FIELD_ALL_NATIONALITY = "all_nationality";
  public static final String FIELD_LANGUAGE = "language";
  public static final String FIELD_REGION = "region";
  public static final String FIELD_GENDER = "gender";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_SUB_STATUS = "sub_status";
  public static final String FIELD_LEGAL_GUARDIAN_ALIAS = "legal_guardian_alias";
  public static final String FIELD_SESSION_TIMEOUT = "session_timeout";
  public static final String FIELD_DAILY_LIMIT_WITHOUT_CONFIRMATION_LOGIN = "daily_limit_without_confirmation_login";
  public static final String FIELD_DISPLAY_NAME = "display_name";
  public static final String FIELD_SIGNUP_TRACK_TYPE = "signup_track_type";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "UserPerson";

  /**
   * The id of the modified person object.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the person object's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the person object's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The person's public UUID.
   */
  @Expose
  @SerializedName("public_uuid")
  private String publicUuid;

  /**
   * The person's first name.
   */
  @Expose
  @SerializedName("first_name")
  private String firstName;

  /**
   * The person's middle name.
   */
  @Expose
  @SerializedName("middle_name")
  private String middleName;

  /**
   * The person's last name.
   */
  @Expose
  @SerializedName("last_name")
  private String lastName;

  /**
   * The person's legal name.
   */
  @Expose
  @SerializedName("legal_name")
  private String legalName;

  /**
   * The display name for the person.
   */
  @Expose
  @SerializedName("display_name")
  private String displayName;

  /**
   * The public nick name for the person.
   */
  @Expose
  @SerializedName("public_nick_name")
  private String publicNickName;

  /**
   * The aliases of the user.
   */
  @Expose
  @SerializedName("alias")
  private List<Pointer> alias;

  /**
   * The user's tax residence numbers for different countries.
   */
  @Expose
  @SerializedName("tax_resident")
  private List<TaxResident> taxResident;

  /**
   * The person's main address.
   */
  @Expose
  @SerializedName("address_main")
  private Address addressMain;

  /**
   * The person's postal address.
   */
  @Expose
  @SerializedName("address_postal")
  private Address addressPostal;

  /**
   * The person's date of birth. Accepts ISO8601 date formats.
   */
  @Expose
  @SerializedName("date_of_birth")
  private String dateOfBirth;

  /**
   * The person's place of birth.
   */
  @Expose
  @SerializedName("place_of_birth")
  private String placeOfBirth;

  /**
   * The person's country of birth. Formatted as a SO 3166-1 alpha-2 country code.
   */
  @Expose
  @SerializedName("country_of_birth")
  private String countryOfBirth;

  /**
   * The person's nationality. Formatted as a SO 3166-1 alpha-2 country code.
   */
  @Expose
  @SerializedName("nationality")
  private String nationality;

  /**
   * All of the person's nationalities.
   */
  @Expose
  @SerializedName("all_nationality")
  private List<String> allNationality;

  /**
   * The person's preferred language. Formatted as a ISO 639-1 language code plus a ISO 3166-1
   * alpha-2 country code, seperated by an underscore.
   */
  @Expose
  @SerializedName("language")
  private String language;

  /**
   * The person's preferred region. Formatted as a ISO 639-1 language code plus a ISO 3166-1
   * alpha-2 country code, seperated by an underscore.
   */
  @Expose
  @SerializedName("region")
  private String region;

  /**
   * The person's gender. Can be MALE, FEMALE or UNKNOWN.
   */
  @Expose
  @SerializedName("gender")
  private String gender;

  /**
   * The user's avatar.
   */
  @Expose
  @SerializedName("avatar")
  private Avatar avatar;

  /**
   * The version of the terms of service accepted by the user.
   */
  @Expose
  @SerializedName("version_terms_of_service")
  private String versionTermsOfService;

  /**
   * The user status. The user status. Can be: ACTIVE, BLOCKED, SIGNUP, RECOVERY, DENIED or
   * ABORTED.
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
   * The setting for the session timeout of the user in seconds.
   */
  @Expose
  @SerializedName("session_timeout")
  private Integer sessionTimeout;

  /**
   * The amount the user can pay in the session without asking for credentials.
   */
  @Expose
  @SerializedName("daily_limit_without_confirmation_login")
  private Amount dailyLimitWithoutConfirmationLogin;

  /**
   * The types of notifications that will result in a push notification or URL callback for this
   * UserPerson.
   */
  @Expose
  @SerializedName("notification_filters")
  private List<NotificationFilter> notificationFilters;

  /**
   * The relations for this user.
   */
  @Expose
  @SerializedName("relations")
  private List<RelationUser> relations;

  /**
   * The subscription type the user should start on.
   */
  @Expose
  @SerializedName("subscription_type_field_for_request")
  private String subscriptionTypeFieldForRequest;

  /**
   * The person's first name.
   */
  @Expose
  @SerializedName("first_name_field_for_request")
  private String firstNameFieldForRequest;

  /**
   * The person's middle name.
   */
  @Expose
  @SerializedName("middle_name_field_for_request")
  private String middleNameFieldForRequest;

  /**
   * The person's last name.
   */
  @Expose
  @SerializedName("last_name_field_for_request")
  private String lastNameFieldForRequest;

  /**
   * The person's public nick name.
   */
  @Expose
  @SerializedName("public_nick_name_field_for_request")
  private String publicNickNameFieldForRequest;

  /**
   * The user's main address.
   */
  @Expose
  @SerializedName("address_main_field_for_request")
  private Address addressMainFieldForRequest;

  /**
   * The person's postal address.
   */
  @Expose
  @SerializedName("address_postal_field_for_request")
  private Address addressPostalFieldForRequest;

  /**
   * The public UUID of the user's avatar.
   */
  @Expose
  @SerializedName("avatar_uuid_field_for_request")
  private String avatarUuidFieldForRequest;

  /**
   * The user's tax residence numbers for different countries.
   */
  @Expose
  @SerializedName("tax_resident_field_for_request")
  private List<TaxResident> taxResidentFieldForRequest;

  /**
   * The type of identification document the person registered with.
   */
  @Expose
  @SerializedName("document_type_field_for_request")
  private String documentTypeFieldForRequest;

  /**
   * The identification document number the person registered with.
   */
  @Expose
  @SerializedName("document_number_field_for_request")
  private String documentNumberFieldForRequest;

  /**
   * The country which issued the identification document the person registered with.
   */
  @Expose
  @SerializedName("document_country_of_issuance_field_for_request")
  private String documentCountryOfIssuanceFieldForRequest;

  /**
   * The reference to the uploaded picture/scan of the front side of the identification document.
   */
  @Expose
  @SerializedName("document_front_attachment_id_field_for_request")
  private Integer documentFrontAttachmentIdFieldForRequest;

  /**
   * The reference to the uploaded picture/scan of the back side of the identification document.
   */
  @Expose
  @SerializedName("document_back_attachment_id_field_for_request")
  private Integer documentBackAttachmentIdFieldForRequest;

  /**
   * The person's date of birth. Accepts ISO8601 date formats.
   */
  @Expose
  @SerializedName("date_of_birth_field_for_request")
  private String dateOfBirthFieldForRequest;

  /**
   * DEPRECATED. The person's nationality. Formatted as a SO 3166-1 alpha-2 country code.
   */
  @Expose
  @SerializedName("nationality_field_for_request")
  private String nationalityFieldForRequest;

  /**
   * All of the person's nationalities.
   */
  @Expose
  @SerializedName("all_nationality_field_for_request")
  private List<String> allNationalityFieldForRequest;

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
   * The person's gender. Can be: MALE, FEMALE and UNKNOWN.
   */
  @Expose
  @SerializedName("gender_field_for_request")
  private String genderFieldForRequest;

  /**
   * The user status. You are not allowed to update the status via PUT.
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The user sub-status. Can be updated to SUBMIT if status is RECOVERY.
   */
  @Expose
  @SerializedName("sub_status_field_for_request")
  private String subStatusFieldForRequest;

  /**
   * The legal guardian of the user. Required for minors.
   */
  @Expose
  @SerializedName("legal_guardian_alias_field_for_request")
  private Pointer legalGuardianAliasFieldForRequest;

  /**
   * The setting for the session timeout of the user in seconds.
   */
  @Expose
  @SerializedName("session_timeout_field_for_request")
  private Integer sessionTimeoutFieldForRequest;

  /**
   * The amount the user can pay in the session without asking for credentials.
   */
  @Expose
  @SerializedName("daily_limit_without_confirmation_login_field_for_request")
  private Amount dailyLimitWithoutConfirmationLoginFieldForRequest;

  /**
   * The person's legal name. Available legal names can be listed via the
   * 'user/{user_id}/legal-name' endpoint.
   */
  @Expose
  @SerializedName("display_name_field_for_request")
  private String displayNameFieldForRequest;

  /**
   * The type of signup track the user is following.
   */
  @Expose
  @SerializedName("signup_track_type_field_for_request")
  private String signupTrackTypeFieldForRequest;

  public UserPerson() {
  this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType) {
  this(subscriptionType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName) {
  this(subscriptionType, firstName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName) {
  this(subscriptionType, firstName, middleName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName) {
  this(subscriptionType, firstName, middleName, lastName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName) {
  this(subscriptionType, firstName, middleName, lastName, publicNickName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName, Address addressMain) {
  this(subscriptionType, firstName, middleName, lastName, publicNickName, addressMain, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal) {
  this(subscriptionType, firstName, middleName, lastName, publicNickName, addressMain, addressPostal, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid) {
  this(subscriptionType, firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident) {
  this(subscriptionType, firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType) {
  this(subscriptionType, firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber) {
  this(subscriptionType, firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance) {
  this(subscriptionType, firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId) {
  this(subscriptionType, firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId) {
  this(subscriptionType, firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth) {
  this(subscriptionType, firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality) {
  this(subscriptionType, firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, nationality, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality, List<String> allNationality) {
  this(subscriptionType, firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, nationality, allNationality, null, null, null, null, null, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality, List<String> allNationality, String language) {
  this(subscriptionType, firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, nationality, allNationality, language, null, null, null, null, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality, List<String> allNationality, String language, String region) {
  this(subscriptionType, firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, nationality, allNationality, language, region, null, null, null, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality, List<String> allNationality, String language, String region, String gender) {
  this(subscriptionType, firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, nationality, allNationality, language, region, gender, null, null, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality, List<String> allNationality, String language, String region, String gender, String status) {
  this(subscriptionType, firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, nationality, allNationality, language, region, gender, status, null, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality, List<String> allNationality, String language, String region, String gender, String status, String subStatus) {
  this(subscriptionType, firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, nationality, allNationality, language, region, gender, status, subStatus, null, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality, List<String> allNationality, String language, String region, String gender, String status, String subStatus, Pointer legalGuardianAlias) {
  this(subscriptionType, firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, nationality, allNationality, language, region, gender, status, subStatus, legalGuardianAlias, null, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality, List<String> allNationality, String language, String region, String gender, String status, String subStatus, Pointer legalGuardianAlias, Integer sessionTimeout) {
  this(subscriptionType, firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, nationality, allNationality, language, region, gender, status, subStatus, legalGuardianAlias, sessionTimeout, null, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality, List<String> allNationality, String language, String region, String gender, String status, String subStatus, Pointer legalGuardianAlias, Integer sessionTimeout, Amount dailyLimitWithoutConfirmationLogin) {
  this(subscriptionType, firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, nationality, allNationality, language, region, gender, status, subStatus, legalGuardianAlias, sessionTimeout, dailyLimitWithoutConfirmationLogin, null, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality, List<String> allNationality, String language, String region, String gender, String status, String subStatus, Pointer legalGuardianAlias, Integer sessionTimeout, Amount dailyLimitWithoutConfirmationLogin, String displayName) {
  this(subscriptionType, firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, nationality, allNationality, language, region, gender, status, subStatus, legalGuardianAlias, sessionTimeout, dailyLimitWithoutConfirmationLogin, displayName, null);
  }

  public UserPerson(String subscriptionType, String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality, List<String> allNationality, String language, String region, String gender, String status, String subStatus, Pointer legalGuardianAlias, Integer sessionTimeout, Amount dailyLimitWithoutConfirmationLogin, String displayName, String signupTrackType) {
    this.subscriptionTypeFieldForRequest = subscriptionType;
    this.firstNameFieldForRequest = firstName;
    this.middleNameFieldForRequest = middleName;
    this.lastNameFieldForRequest = lastName;
    this.publicNickNameFieldForRequest = publicNickName;
    this.addressMainFieldForRequest = addressMain;
    this.addressPostalFieldForRequest = addressPostal;
    this.avatarUuidFieldForRequest = avatarUuid;
    this.taxResidentFieldForRequest = taxResident;
    this.documentTypeFieldForRequest = documentType;
    this.documentNumberFieldForRequest = documentNumber;
    this.documentCountryOfIssuanceFieldForRequest = documentCountryOfIssuance;
    this.documentFrontAttachmentIdFieldForRequest = documentFrontAttachmentId;
    this.documentBackAttachmentIdFieldForRequest = documentBackAttachmentId;
    this.dateOfBirthFieldForRequest = dateOfBirth;
    this.nationalityFieldForRequest = nationality;
    this.allNationalityFieldForRequest = allNationality;
    this.languageFieldForRequest = language;
    this.regionFieldForRequest = region;
    this.genderFieldForRequest = gender;
    this.statusFieldForRequest = status;
    this.subStatusFieldForRequest = subStatus;
    this.legalGuardianAliasFieldForRequest = legalGuardianAlias;
    this.sessionTimeoutFieldForRequest = sessionTimeout;
    this.dailyLimitWithoutConfirmationLoginFieldForRequest = dailyLimitWithoutConfirmationLogin;
    this.displayNameFieldForRequest = displayName;
    this.signupTrackTypeFieldForRequest = signupTrackType;
  }  /**
   * Get a specific person.
   */
  public static BunqResponse<UserPerson> get(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId()), params, customHeaders);

    return fromJson(UserPerson.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<UserPerson> get() {
    return get(null, null);
  }

  public static BunqResponse<UserPerson> get(Map<String, String> params) {
    return get(params, null);
  }

  /**
   * Modify a specific person object's data.
   * @param firstName The person's first name.
   * @param middleName The person's middle name.
   * @param lastName The person's last name.
   * @param publicNickName The person's public nick name.
   * @param addressMain The user's main address.
   * @param addressPostal The person's postal address.
   * @param avatarUuid The public UUID of the user's avatar.
   * @param taxResident The user's tax residence numbers for different countries.
   * @param documentType The type of identification document the person registered with.
   * @param documentNumber The identification document number the person registered with.
   * @param documentCountryOfIssuance The country which issued the identification document the
   * person registered with.
   * @param documentFrontAttachmentId The reference to the uploaded picture/scan of the front side
   * of the identification document.
   * @param documentBackAttachmentId The reference to the uploaded picture/scan of the back side
   * of the identification document.
   * @param dateOfBirth The person's date of birth. Accepts ISO8601 date formats.
   * @param nationality DEPRECATED. The person's nationality. Formatted as a SO 3166-1 alpha-2
   * country code.
   * @param allNationality All of the person's nationalities.
   * @param language The person's preferred language. Formatted as a ISO 639-1 language code plus
   * a ISO 3166-1 alpha-2 country code, seperated by an underscore.
   * @param region The person's preferred region. Formatted as a ISO 639-1 language code plus a
   * ISO 3166-1 alpha-2 country code, seperated by an underscore.
   * @param gender The person's gender. Can be: MALE, FEMALE and UNKNOWN.
   * @param status The user status. You are not allowed to update the status via PUT.
   * @param subStatus The user sub-status. Can be updated to SUBMIT if status is RECOVERY.
   * @param legalGuardianAlias The legal guardian of the user. Required for minors.
   * @param sessionTimeout The setting for the session timeout of the user in seconds.
   * @param dailyLimitWithoutConfirmationLogin The amount the user can pay in the session without
   * asking for credentials.
   * @param displayName The person's legal name. Available legal names can be listed via the
   * 'user/{user_id}/legal-name' endpoint.
   */
  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality, List<String> allNationality, String language, String region, String gender, String status, String subStatus, Pointer legalGuardianAlias, Integer sessionTimeout, Amount dailyLimitWithoutConfirmationLogin, String displayName, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_FIRST_NAME, firstName);
requestMap.put(FIELD_MIDDLE_NAME, middleName);
requestMap.put(FIELD_LAST_NAME, lastName);
requestMap.put(FIELD_PUBLIC_NICK_NAME, publicNickName);
requestMap.put(FIELD_ADDRESS_MAIN, addressMain);
requestMap.put(FIELD_ADDRESS_POSTAL, addressPostal);
requestMap.put(FIELD_AVATAR_UUID, avatarUuid);
requestMap.put(FIELD_TAX_RESIDENT, taxResident);
requestMap.put(FIELD_DOCUMENT_TYPE, documentType);
requestMap.put(FIELD_DOCUMENT_NUMBER, documentNumber);
requestMap.put(FIELD_DOCUMENT_COUNTRY_OF_ISSUANCE, documentCountryOfIssuance);
requestMap.put(FIELD_DOCUMENT_FRONT_ATTACHMENT_ID, documentFrontAttachmentId);
requestMap.put(FIELD_DOCUMENT_BACK_ATTACHMENT_ID, documentBackAttachmentId);
requestMap.put(FIELD_DATE_OF_BIRTH, dateOfBirth);
requestMap.put(FIELD_NATIONALITY, nationality);
requestMap.put(FIELD_ALL_NATIONALITY, allNationality);
requestMap.put(FIELD_LANGUAGE, language);
requestMap.put(FIELD_REGION, region);
requestMap.put(FIELD_GENDER, gender);
requestMap.put(FIELD_STATUS, status);
requestMap.put(FIELD_SUB_STATUS, subStatus);
requestMap.put(FIELD_LEGAL_GUARDIAN_ALIAS, legalGuardianAlias);
requestMap.put(FIELD_SESSION_TIMEOUT, sessionTimeout);
requestMap.put(FIELD_DAILY_LIMIT_WITHOUT_CONFIRMATION_LOGIN, dailyLimitWithoutConfirmationLogin);
requestMap.put(FIELD_DISPLAY_NAME, displayName);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId()), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(String firstName) {
    return update(firstName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName) {
    return update(firstName, middleName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName) {
    return update(firstName, middleName, lastName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName) {
    return update(firstName, middleName, lastName, publicNickName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName, Address addressMain) {
    return update(firstName, middleName, lastName, publicNickName, addressMain, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal) {
    return update(firstName, middleName, lastName, publicNickName, addressMain, addressPostal, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid) {
    return update(firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident) {
    return update(firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType) {
    return update(firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber) {
    return update(firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance) {
    return update(firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId) {
    return update(firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId) {
    return update(firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth) {
    return update(firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality) {
    return update(firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, nationality, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality, List<String> allNationality) {
    return update(firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, nationality, allNationality, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality, List<String> allNationality, String language) {
    return update(firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, nationality, allNationality, language, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality, List<String> allNationality, String language, String region) {
    return update(firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, nationality, allNationality, language, region, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality, List<String> allNationality, String language, String region, String gender) {
    return update(firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, nationality, allNationality, language, region, gender, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality, List<String> allNationality, String language, String region, String gender, String status) {
    return update(firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, nationality, allNationality, language, region, gender, status, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality, List<String> allNationality, String language, String region, String gender, String status, String subStatus) {
    return update(firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, nationality, allNationality, language, region, gender, status, subStatus, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality, List<String> allNationality, String language, String region, String gender, String status, String subStatus, Pointer legalGuardianAlias) {
    return update(firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, nationality, allNationality, language, region, gender, status, subStatus, legalGuardianAlias, null, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality, List<String> allNationality, String language, String region, String gender, String status, String subStatus, Pointer legalGuardianAlias, Integer sessionTimeout) {
    return update(firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, nationality, allNationality, language, region, gender, status, subStatus, legalGuardianAlias, sessionTimeout, null, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality, List<String> allNationality, String language, String region, String gender, String status, String subStatus, Pointer legalGuardianAlias, Integer sessionTimeout, Amount dailyLimitWithoutConfirmationLogin) {
    return update(firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, nationality, allNationality, language, region, gender, status, subStatus, legalGuardianAlias, sessionTimeout, dailyLimitWithoutConfirmationLogin, null, null);
  }

  public static BunqResponse<Integer> update(String firstName, String middleName, String lastName, String publicNickName, Address addressMain, Address addressPostal, String avatarUuid, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String dateOfBirth, String nationality, List<String> allNationality, String language, String region, String gender, String status, String subStatus, Pointer legalGuardianAlias, Integer sessionTimeout, Amount dailyLimitWithoutConfirmationLogin, String displayName) {
    return update(firstName, middleName, lastName, publicNickName, addressMain, addressPostal, avatarUuid, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, dateOfBirth, nationality, allNationality, language, region, gender, status, subStatus, legalGuardianAlias, sessionTimeout, dailyLimitWithoutConfirmationLogin, displayName, null);
  }

  /**
   * The id of the modified person object.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the person object's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the person object's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The person's public UUID.
   */
  public String getPublicUuid() {
    return this.publicUuid;
  }

  public void setPublicUuid(String publicUuid) {
    this.publicUuid = publicUuid;
  }

  /**
   * The person's first name.
   */
  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * The person's middle name.
   */
  public String getMiddleName() {
    return this.middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  /**
   * The person's last name.
   */
  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * The person's legal name.
   */
  public String getLegalName() {
    return this.legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }

  /**
   * The display name for the person.
   */
  public String getDisplayName() {
    return this.displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * The public nick name for the person.
   */
  public String getPublicNickName() {
    return this.publicNickName;
  }

  public void setPublicNickName(String publicNickName) {
    this.publicNickName = publicNickName;
  }

  /**
   * The aliases of the user.
   */
  public List<Pointer> getAlias() {
    return this.alias;
  }

  public void setAlias(List<Pointer> alias) {
    this.alias = alias;
  }

  /**
   * The user's tax residence numbers for different countries.
   */
  public List<TaxResident> getTaxResident() {
    return this.taxResident;
  }

  public void setTaxResident(List<TaxResident> taxResident) {
    this.taxResident = taxResident;
  }

  /**
   * The person's main address.
   */
  public Address getAddressMain() {
    return this.addressMain;
  }

  public void setAddressMain(Address addressMain) {
    this.addressMain = addressMain;
  }

  /**
   * The person's postal address.
   */
  public Address getAddressPostal() {
    return this.addressPostal;
  }

  public void setAddressPostal(Address addressPostal) {
    this.addressPostal = addressPostal;
  }

  /**
   * The person's date of birth. Accepts ISO8601 date formats.
   */
  public String getDateOfBirth() {
    return this.dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  /**
   * The person's place of birth.
   */
  public String getPlaceOfBirth() {
    return this.placeOfBirth;
  }

  public void setPlaceOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }

  /**
   * The person's country of birth. Formatted as a SO 3166-1 alpha-2 country code.
   */
  public String getCountryOfBirth() {
    return this.countryOfBirth;
  }

  public void setCountryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
  }

  /**
   * The person's nationality. Formatted as a SO 3166-1 alpha-2 country code.
   */
  public String getNationality() {
    return this.nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  /**
   * All of the person's nationalities.
   */
  public List<String> getAllNationality() {
    return this.allNationality;
  }

  public void setAllNationality(List<String> allNationality) {
    this.allNationality = allNationality;
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
   * The person's gender. Can be MALE, FEMALE or UNKNOWN.
   */
  public String getGender() {
    return this.gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  /**
   * The user's avatar.
   */
  public Avatar getAvatar() {
    return this.avatar;
  }

  public void setAvatar(Avatar avatar) {
    this.avatar = avatar;
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
   * The user status. The user status. Can be: ACTIVE, BLOCKED, SIGNUP, RECOVERY, DENIED or
   * ABORTED.
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
   * The setting for the session timeout of the user in seconds.
   */
  public Integer getSessionTimeout() {
    return this.sessionTimeout;
  }

  public void setSessionTimeout(Integer sessionTimeout) {
    this.sessionTimeout = sessionTimeout;
  }

  /**
   * The amount the user can pay in the session without asking for credentials.
   */
  public Amount getDailyLimitWithoutConfirmationLogin() {
    return this.dailyLimitWithoutConfirmationLogin;
  }

  public void setDailyLimitWithoutConfirmationLogin(Amount dailyLimitWithoutConfirmationLogin) {
    this.dailyLimitWithoutConfirmationLogin = dailyLimitWithoutConfirmationLogin;
  }

  /**
   * The types of notifications that will result in a push notification or URL callback for this
   * UserPerson.
   */
  public List<NotificationFilter> getNotificationFilters() {
    return this.notificationFilters;
  }

  public void setNotificationFilters(List<NotificationFilter> notificationFilters) {
    this.notificationFilters = notificationFilters;
  }

  /**
   * The relations for this user.
   */
  public List<RelationUser> getRelations() {
    return this.relations;
  }

  public void setRelations(List<RelationUser> relations) {
    this.relations = relations;
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

    if (this.firstName != null) {
      return false;
    }

    if (this.middleName != null) {
      return false;
    }

    if (this.lastName != null) {
      return false;
    }

    if (this.legalName != null) {
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

    if (this.taxResident != null) {
      return false;
    }

    if (this.addressMain != null) {
      return false;
    }

    if (this.addressPostal != null) {
      return false;
    }

    if (this.dateOfBirth != null) {
      return false;
    }

    if (this.placeOfBirth != null) {
      return false;
    }

    if (this.countryOfBirth != null) {
      return false;
    }

    if (this.nationality != null) {
      return false;
    }

    if (this.allNationality != null) {
      return false;
    }

    if (this.language != null) {
      return false;
    }

    if (this.region != null) {
      return false;
    }

    if (this.gender != null) {
      return false;
    }

    if (this.avatar != null) {
      return false;
    }

    if (this.versionTermsOfService != null) {
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

    if (this.relations != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static UserPerson fromJsonReader(JsonReader reader) {
    return fromJsonReader(UserPerson.class, reader);
  }

}
