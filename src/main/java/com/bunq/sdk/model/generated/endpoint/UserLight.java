package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.Avatar;
import com.bunq.sdk.model.generated.object.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.List;

/**
 * Show the authenticated user, if it is a light user.
 */
public class UserLight extends BunqModel {

    /**
     * Field constants.
     */
    public static final String FIELD_FIRST_NAME = "first_name";
    public static final String FIELD_MIDDLE_NAME = "middle_name";
    public static final String FIELD_LAST_NAME = "last_name";
    public static final String FIELD_PUBLIC_NICK_NAME = "public_nick_name";
    public static final String FIELD_ADDRESS_MAIN = "address_main";
    public static final String FIELD_ADDRESS_POSTAL = "address_postal";
    public static final String FIELD_AVATAR_UUID = "avatar_uuid";
    public static final String FIELD_SOCIAL_SECURITY_NUMBER = "social_security_number";
    public static final String FIELD_TAX_RESIDENT = "tax_resident";
    public static final String FIELD_DOCUMENT_TYPE = "document_type";
    public static final String FIELD_DOCUMENT_NUMBER = "document_number";
    public static final String FIELD_DOCUMENT_COUNTRY_OF_ISSUANCE = "document_country_of_issuance";
    public static final String FIELD_DOCUMENT_FRONT_ATTACHMENT_ID = "document_front_attachment_id";
    public static final String FIELD_DOCUMENT_BACK_ATTACHMENT_ID = "document_back_attachment_id";
    public static final String FIELD_DATE_OF_BIRTH = "date_of_birth";
    public static final String FIELD_PLACE_OF_BIRTH = "place_of_birth";
    public static final String FIELD_COUNTRY_OF_BIRTH = "country_of_birth";
    public static final String FIELD_NATIONALITY = "nationality";
    public static final String FIELD_LANGUAGE = "language";
    public static final String FIELD_REGION = "region";
    public static final String FIELD_GENDER = "gender";
    public static final String FIELD_STATUS = "status";
    public static final String FIELD_SUB_STATUS = "sub_status";
    public static final String FIELD_LEGAL_GUARDIAN_ALIAS = "legal_guardian_alias";
    public static final String FIELD_SESSION_TIMEOUT = "session_timeout";
    public static final String FIELD_DAILY_LIMIT_WITHOUT_CONFIRMATION_LOGIN = "daily_limit_without_confirmation_login";
    public static final String FIELD_NOTIFICATION_FILTERS = "notification_filters";

    /**
     * The id of the user.
     */
    @Expose
    @SerializedName("id")
    private Integer id;

    /**
     * The timestamp of the user object's creation.
     */
    @Expose
    @SerializedName("created")
    private String created;

    /**
     * The timestamp of the user object's last update.
     */
    @Expose
    @SerializedName("updated")
    private String updated;

    /**
     * The user's public UUID.
     */
    @Expose
    @SerializedName("public_uuid")
    private String publicUuid;

    /**
     * The user's first name.
     */
    @Expose
    @SerializedName("first_name")
    private String firstName;

    /**
     * The user's middle name.
     */
    @Expose
    @SerializedName("middle_name")
    private String middleName;

    /**
     * The user's last name.
     */
    @Expose
    @SerializedName("last_name")
    private String lastName;

    /**
     * The user's legal name.
     */
    @Expose
    @SerializedName("legal_name")
    private String legalName;

    /**
     * The display name for the user.
     */
    @Expose
    @SerializedName("display_name")
    private String displayName;

    /**
     * The public nick name for the user.
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
     * The user's social security number.
     */
    @Expose
    @SerializedName("social_security_number")
    private String socialSecurityNumber;

    /**
     * The user's tax residence numbers for different countries.
     */
    @Expose
    @SerializedName("tax_resident")
    private List<TaxResident> taxResident;

    /**
     * The type of identification document the user registered with.
     */
    @Expose
    @SerializedName("document_type")
    private String documentType;

    /**
     * The identification document number the user registered with.
     */
    @Expose
    @SerializedName("document_number")
    private String documentNumber;

    /**
     * The country which issued the identification document the user registered with.
     */
    @Expose
    @SerializedName("document_country_of_issuance")
    private String documentCountryOfIssuance;

    /**
     * The user's main address.
     */
    @Expose
    @SerializedName("address_main")
    private Address addressMain;

    /**
     * The user's postal address.
     */
    @Expose
    @SerializedName("address_postal")
    private Address addressPostal;

    /**
     * The user's date of birth. Accepts ISO8601 date formats.
     */
    @Expose
    @SerializedName("date_of_birth")
    private String dateOfBirth;

    /**
     * The user's place of birth.
     */
    @Expose
    @SerializedName("place_of_birth")
    private String placeOfBirth;

    /**
     * The user's country of birth. Formatted as a SO 3166-1 alpha-2 country code.
     */
    @Expose
    @SerializedName("country_of_birth")
    private String countryOfBirth;

    /**
     * The user's nationality. Formatted as a SO 3166-1 alpha-2 country code.
     */
    @Expose
    @SerializedName("nationality")
    private String nationality;

    /**
     * The user's preferred language. Formatted as a ISO 639-1 language code plus a ISO 3166-1
     * alpha-2 country code, seperated by an underscore.
     */
    @Expose
    @SerializedName("language")
    private String language;

    /**
     * The user's preferred region. Formatted as a ISO 639-1 language code plus a ISO 3166-1 alpha-2
     * country code, seperated by an underscore.
     */
    @Expose
    @SerializedName("region")
    private String region;

    /**
     * The user's gender. Can be MALE, FEMALE or UNKNOWN.
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
     * The user status. The user status. Can be: ACTIVE, BLOCKED, SIGNUP, DENIED or ABORTED.
     */
    @Expose
    @SerializedName("status")
    private String status;

    /**
     * The user sub-status. Can be: NONE, FACE_RESET, APPROVAL, APPROVAL_PARENT, AWAITING_PARENT,
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
     * UserLight.
     */
    @Expose
    @SerializedName("notification_filters")
    private List<NotificationFilter> notificationFilters;

    /**
     * The user's first name.
     */
    @Expose
    @SerializedName("first_name_field_for_request")
    private String firstNameFieldForRequest;

    /**
     * The user's middle name.
     */
    @Expose
    @SerializedName("middle_name_field_for_request")
    private String middleNameFieldForRequest;

    /**
     * The user's last name.
     */
    @Expose
    @SerializedName("last_name_field_for_request")
    private String lastNameFieldForRequest;

    /**
     * The user's public nick name.
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
     * The user's postal address.
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
     * The user's social security number.
     */
    @Expose
    @SerializedName("social_security_number_field_for_request")
    private String socialSecurityNumberFieldForRequest;

    /**
     * The user's tax residence numbers for different countries.
     */
    @Expose
    @SerializedName("tax_resident_field_for_request")
    private List<TaxResident> taxResidentFieldForRequest;

    /**
     * The type of identification document the user registered with.
     */
    @Expose
    @SerializedName("document_type_field_for_request")
    private String documentTypeFieldForRequest;

    /**
     * The identification document number the user registered with.
     */
    @Expose
    @SerializedName("document_number_field_for_request")
    private String documentNumberFieldForRequest;

    /**
     * The country which issued the identification document the user registered with.
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
     * The user's date of birth. Accepts ISO8601 date formats.
     */
    @Expose
    @SerializedName("date_of_birth_field_for_request")
    private String dateOfBirthFieldForRequest;

    /**
     * The user's place of birth.
     */
    @Expose
    @SerializedName("place_of_birth_field_for_request")
    private String placeOfBirthFieldForRequest;

    /**
     * The user's country of birth. Formatted as a SO 3166-1 alpha-2 country code.
     */
    @Expose
    @SerializedName("country_of_birth_field_for_request")
    private String countryOfBirthFieldForRequest;

    /**
     * The user's nationality. Formatted as a SO 3166-1 alpha-2 country code.
     */
    @Expose
    @SerializedName("nationality_field_for_request")
    private String nationalityFieldForRequest;

    /**
     * The user's preferred language. Formatted as a ISO 639-1 language code plus a ISO 3166-1
     * alpha-2 country code, seperated by an underscore.
     */
    @Expose
    @SerializedName("language_field_for_request")
    private String languageFieldForRequest;

    /**
     * The user's preferred region. Formatted as a ISO 639-1 language code plus a ISO 3166-1 alpha-2
     * country code, seperated by an underscore.
     */
    @Expose
    @SerializedName("region_field_for_request")
    private String regionFieldForRequest;

    /**
     * The user's gender. Can be: MALE, FEMALE and UNKNOWN.
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
     * The user sub-status. Can be updated to SUBMIT to apply for a full bunq account.
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
     * The types of notifications that will result in a push notification or URL callback for this
     * UserLight.
     */
    @Expose
    @SerializedName("notification_filters_field_for_request")
    private List<NotificationFilter> notificationFiltersFieldForRequest;

    public UserLight() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public UserLight(String firstName) {
        this(firstName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public UserLight(String firstName, String lastName) {
        this(firstName, lastName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName) {
        this(firstName, lastName, publicNickName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain) {
        this(firstName, lastName, publicNickName, addressMain, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid) {
        this(firstName, lastName, publicNickName, addressMain, avatarUuid, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid, String dateOfBirth) {
        this(firstName, lastName, publicNickName, addressMain, avatarUuid, dateOfBirth, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid, String dateOfBirth, String language) {
        this(firstName, lastName, publicNickName, addressMain, avatarUuid, dateOfBirth, language, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid, String dateOfBirth, String language, String region) {
        this(firstName, lastName, publicNickName, addressMain, avatarUuid, dateOfBirth, language, region, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid, String dateOfBirth, String language, String region, String status) {
        this(firstName, lastName, publicNickName, addressMain, avatarUuid, dateOfBirth, language, region, status, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid, String dateOfBirth, String language, String region, String status, String subStatus) {
        this(firstName, lastName, publicNickName, addressMain, avatarUuid, dateOfBirth, language, region, status, subStatus, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid, String dateOfBirth, String language, String region, String status, String subStatus, Integer sessionTimeout) {
        this(firstName, lastName, publicNickName, addressMain, avatarUuid, dateOfBirth, language, region, status, subStatus, sessionTimeout, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid, String dateOfBirth, String language, String region, String status, String subStatus, Integer sessionTimeout, Amount dailyLimitWithoutConfirmationLogin) {
        this(firstName, lastName, publicNickName, addressMain, avatarUuid, dateOfBirth, language, region, status, subStatus, sessionTimeout, dailyLimitWithoutConfirmationLogin, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid, String dateOfBirth, String language, String region, String status, String subStatus, Integer sessionTimeout, Amount dailyLimitWithoutConfirmationLogin, String middleName) {
        this(firstName, lastName, publicNickName, addressMain, avatarUuid, dateOfBirth, language, region, status, subStatus, sessionTimeout, dailyLimitWithoutConfirmationLogin, middleName, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid, String dateOfBirth, String language, String region, String status, String subStatus, Integer sessionTimeout, Amount dailyLimitWithoutConfirmationLogin, String middleName, Address addressPostal) {
        this(firstName, lastName, publicNickName, addressMain, avatarUuid, dateOfBirth, language, region, status, subStatus, sessionTimeout, dailyLimitWithoutConfirmationLogin, middleName, addressPostal, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid, String dateOfBirth, String language, String region, String status, String subStatus, Integer sessionTimeout, Amount dailyLimitWithoutConfirmationLogin, String middleName, Address addressPostal, String socialSecurityNumber) {
        this(firstName, lastName, publicNickName, addressMain, avatarUuid, dateOfBirth, language, region, status, subStatus, sessionTimeout, dailyLimitWithoutConfirmationLogin, middleName, addressPostal, socialSecurityNumber, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid, String dateOfBirth, String language, String region, String status, String subStatus, Integer sessionTimeout, Amount dailyLimitWithoutConfirmationLogin, String middleName, Address addressPostal, String socialSecurityNumber, List<TaxResident> taxResident) {
        this(firstName, lastName, publicNickName, addressMain, avatarUuid, dateOfBirth, language, region, status, subStatus, sessionTimeout, dailyLimitWithoutConfirmationLogin, middleName, addressPostal, socialSecurityNumber, taxResident, null, null, null, null, null, null, null, null, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid, String dateOfBirth, String language, String region, String status, String subStatus, Integer sessionTimeout, Amount dailyLimitWithoutConfirmationLogin, String middleName, Address addressPostal, String socialSecurityNumber, List<TaxResident> taxResident, String documentType) {
        this(firstName, lastName, publicNickName, addressMain, avatarUuid, dateOfBirth, language, region, status, subStatus, sessionTimeout, dailyLimitWithoutConfirmationLogin, middleName, addressPostal, socialSecurityNumber, taxResident, documentType, null, null, null, null, null, null, null, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid, String dateOfBirth, String language, String region, String status, String subStatus, Integer sessionTimeout, Amount dailyLimitWithoutConfirmationLogin, String middleName, Address addressPostal, String socialSecurityNumber, List<TaxResident> taxResident, String documentType, String documentNumber) {
        this(firstName, lastName, publicNickName, addressMain, avatarUuid, dateOfBirth, language, region, status, subStatus, sessionTimeout, dailyLimitWithoutConfirmationLogin, middleName, addressPostal, socialSecurityNumber, taxResident, documentType, documentNumber, null, null, null, null, null, null, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid, String dateOfBirth, String language, String region, String status, String subStatus, Integer sessionTimeout, Amount dailyLimitWithoutConfirmationLogin, String middleName, Address addressPostal, String socialSecurityNumber, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance) {
        this(firstName, lastName, publicNickName, addressMain, avatarUuid, dateOfBirth, language, region, status, subStatus, sessionTimeout, dailyLimitWithoutConfirmationLogin, middleName, addressPostal, socialSecurityNumber, taxResident, documentType, documentNumber, documentCountryOfIssuance, null, null, null, null, null, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid, String dateOfBirth, String language, String region, String status, String subStatus, Integer sessionTimeout, Amount dailyLimitWithoutConfirmationLogin, String middleName, Address addressPostal, String socialSecurityNumber, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId) {
        this(firstName, lastName, publicNickName, addressMain, avatarUuid, dateOfBirth, language, region, status, subStatus, sessionTimeout, dailyLimitWithoutConfirmationLogin, middleName, addressPostal, socialSecurityNumber, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, null, null, null, null, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid, String dateOfBirth, String language, String region, String status, String subStatus, Integer sessionTimeout, Amount dailyLimitWithoutConfirmationLogin, String middleName, Address addressPostal, String socialSecurityNumber, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId) {
        this(firstName, lastName, publicNickName, addressMain, avatarUuid, dateOfBirth, language, region, status, subStatus, sessionTimeout, dailyLimitWithoutConfirmationLogin, middleName, addressPostal, socialSecurityNumber, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, null, null, null, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid, String dateOfBirth, String language, String region, String status, String subStatus, Integer sessionTimeout, Amount dailyLimitWithoutConfirmationLogin, String middleName, Address addressPostal, String socialSecurityNumber, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String placeOfBirth) {
        this(firstName, lastName, publicNickName, addressMain, avatarUuid, dateOfBirth, language, region, status, subStatus, sessionTimeout, dailyLimitWithoutConfirmationLogin, middleName, addressPostal, socialSecurityNumber, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, placeOfBirth, null, null, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid, String dateOfBirth, String language, String region, String status, String subStatus, Integer sessionTimeout, Amount dailyLimitWithoutConfirmationLogin, String middleName, Address addressPostal, String socialSecurityNumber, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String placeOfBirth, String countryOfBirth) {
        this(firstName, lastName, publicNickName, addressMain, avatarUuid, dateOfBirth, language, region, status, subStatus, sessionTimeout, dailyLimitWithoutConfirmationLogin, middleName, addressPostal, socialSecurityNumber, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, placeOfBirth, countryOfBirth, null, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid, String dateOfBirth, String language, String region, String status, String subStatus, Integer sessionTimeout, Amount dailyLimitWithoutConfirmationLogin, String middleName, Address addressPostal, String socialSecurityNumber, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String placeOfBirth, String countryOfBirth, String nationality) {
        this(firstName, lastName, publicNickName, addressMain, avatarUuid, dateOfBirth, language, region, status, subStatus, sessionTimeout, dailyLimitWithoutConfirmationLogin, middleName, addressPostal, socialSecurityNumber, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, placeOfBirth, countryOfBirth, nationality, null, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid, String dateOfBirth, String language, String region, String status, String subStatus, Integer sessionTimeout, Amount dailyLimitWithoutConfirmationLogin, String middleName, Address addressPostal, String socialSecurityNumber, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String placeOfBirth, String countryOfBirth, String nationality, String gender) {
        this(firstName, lastName, publicNickName, addressMain, avatarUuid, dateOfBirth, language, region, status, subStatus, sessionTimeout, dailyLimitWithoutConfirmationLogin, middleName, addressPostal, socialSecurityNumber, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, placeOfBirth, countryOfBirth, nationality, gender, null, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid, String dateOfBirth, String language, String region, String status, String subStatus, Integer sessionTimeout, Amount dailyLimitWithoutConfirmationLogin, String middleName, Address addressPostal, String socialSecurityNumber, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String placeOfBirth, String countryOfBirth, String nationality, String gender, Pointer legalGuardianAlias) {
        this(firstName, lastName, publicNickName, addressMain, avatarUuid, dateOfBirth, language, region, status, subStatus, sessionTimeout, dailyLimitWithoutConfirmationLogin, middleName, addressPostal, socialSecurityNumber, taxResident, documentType, documentNumber, documentCountryOfIssuance, documentFrontAttachmentId, documentBackAttachmentId, placeOfBirth, countryOfBirth, nationality, gender, legalGuardianAlias, null);
    }

    public UserLight(String firstName, String lastName, String publicNickName, Address addressMain, String avatarUuid, String dateOfBirth, String language, String region, String status, String subStatus, Integer sessionTimeout, Amount dailyLimitWithoutConfirmationLogin, String middleName, Address addressPostal, String socialSecurityNumber, List<TaxResident> taxResident, String documentType, String documentNumber, String documentCountryOfIssuance, Integer documentFrontAttachmentId, Integer documentBackAttachmentId, String placeOfBirth, String countryOfBirth, String nationality, String gender, Pointer legalGuardianAlias, List<NotificationFilter> notificationFilters) {
        this.firstNameFieldForRequest = firstName;
        this.middleNameFieldForRequest = middleName;
        this.lastNameFieldForRequest = lastName;
        this.publicNickNameFieldForRequest = publicNickName;
        this.addressMainFieldForRequest = addressMain;
        this.addressPostalFieldForRequest = addressPostal;
        this.avatarUuidFieldForRequest = avatarUuid;
        this.socialSecurityNumberFieldForRequest = socialSecurityNumber;
        this.taxResidentFieldForRequest = taxResident;
        this.documentTypeFieldForRequest = documentType;
        this.documentNumberFieldForRequest = documentNumber;
        this.documentCountryOfIssuanceFieldForRequest = documentCountryOfIssuance;
        this.documentFrontAttachmentIdFieldForRequest = documentFrontAttachmentId;
        this.documentBackAttachmentIdFieldForRequest = documentBackAttachmentId;
        this.dateOfBirthFieldForRequest = dateOfBirth;
        this.placeOfBirthFieldForRequest = placeOfBirth;
        this.countryOfBirthFieldForRequest = countryOfBirth;
        this.nationalityFieldForRequest = nationality;
        this.languageFieldForRequest = language;
        this.regionFieldForRequest = region;
        this.genderFieldForRequest = gender;
        this.statusFieldForRequest = status;
        this.subStatusFieldForRequest = subStatus;
        this.legalGuardianAliasFieldForRequest = legalGuardianAlias;
        this.sessionTimeoutFieldForRequest = sessionTimeout;
        this.dailyLimitWithoutConfirmationLoginFieldForRequest = dailyLimitWithoutConfirmationLogin;
        this.notificationFiltersFieldForRequest = notificationFilters;
    }

    /**
     *
     */
    public static UserLight fromJsonReader(JsonReader reader) {
        return fromJsonReader(UserLight.class, reader);
    }

    /**
     * The id of the user.
     */
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The timestamp of the user object's creation.
     */
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * The timestamp of the user object's last update.
     */
    public String getUpdated() {
        return this.updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    /**
     * The user's public UUID.
     */
    public String getPublicUuid() {
        return this.publicUuid;
    }

    public void setPublicUuid(String publicUuid) {
        this.publicUuid = publicUuid;
    }

    /**
     * The user's first name.
     */
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * The user's middle name.
     */
    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * The user's last name.
     */
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * The user's legal name.
     */
    public String getLegalName() {
        return this.legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    /**
     * The display name for the user.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * The public nick name for the user.
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
     * The user's social security number.
     */
    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
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
     * The type of identification document the user registered with.
     */
    public String getDocumentType() {
        return this.documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /**
     * The identification document number the user registered with.
     */
    public String getDocumentNumber() {
        return this.documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /**
     * The country which issued the identification document the user registered with.
     */
    public String getDocumentCountryOfIssuance() {
        return this.documentCountryOfIssuance;
    }

    public void setDocumentCountryOfIssuance(String documentCountryOfIssuance) {
        this.documentCountryOfIssuance = documentCountryOfIssuance;
    }

    /**
     * The user's main address.
     */
    public Address getAddressMain() {
        return this.addressMain;
    }

    public void setAddressMain(Address addressMain) {
        this.addressMain = addressMain;
    }

    /**
     * The user's postal address.
     */
    public Address getAddressPostal() {
        return this.addressPostal;
    }

    public void setAddressPostal(Address addressPostal) {
        this.addressPostal = addressPostal;
    }

    /**
     * The user's date of birth. Accepts ISO8601 date formats.
     */
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * The user's place of birth.
     */
    public String getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    /**
     * The user's country of birth. Formatted as a SO 3166-1 alpha-2 country code.
     */
    public String getCountryOfBirth() {
        return this.countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    /**
     * The user's nationality. Formatted as a SO 3166-1 alpha-2 country code.
     */
    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * The user's preferred language. Formatted as a ISO 639-1 language code plus a ISO 3166-1
     * alpha-2 country code, seperated by an underscore.
     */
    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * The user's preferred region. Formatted as a ISO 639-1 language code plus a ISO 3166-1 alpha-2
     * country code, seperated by an underscore.
     */
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * The user's gender. Can be MALE, FEMALE or UNKNOWN.
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
     * The user status. The user status. Can be: ACTIVE, BLOCKED, SIGNUP, DENIED or ABORTED.
     */
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * The user sub-status. Can be: NONE, FACE_RESET, APPROVAL, APPROVAL_PARENT, AWAITING_PARENT,
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
     * UserLight.
     */
    public List<NotificationFilter> getNotificationFilters() {
        return this.notificationFilters;
    }

    public void setNotificationFilters(List<NotificationFilter> notificationFilters) {
        this.notificationFilters = notificationFilters;
    }

    /**
     *
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

        if (this.socialSecurityNumber != null) {
            return false;
        }

        if (this.taxResident != null) {
            return false;
        }

        if (this.documentType != null) {
            return false;
        }

        if (this.documentNumber != null) {
            return false;
        }

        if (this.documentCountryOfIssuance != null) {
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

        return true;
    }

}
