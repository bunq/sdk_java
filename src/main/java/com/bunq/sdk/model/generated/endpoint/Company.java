package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.Address;
import com.bunq.sdk.model.generated.object.Ubo;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create and manage companies.
 */
public class Company extends BunqModel {

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
    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_CREATE = "user/%s/company";
    protected static final String ENDPOINT_URL_READ = "user/%s/company/%s";
    protected static final String ENDPOINT_URL_LISTING = "user/%s/company";
    protected static final String ENDPOINT_URL_UPDATE = "user/%s/company/%s";
    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_GET = "UserCompany";

    /**
     *
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

    public Company() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public Company(String name) {
        this(name, null, null, null, null, null, null, null, null);
    }

    public Company(String name, Address addressMain) {
        this(name, addressMain, null, null, null, null, null, null, null);
    }

    public Company(String name, Address addressMain, Address addressPostal) {
        this(name, addressMain, addressPostal, null, null, null, null, null, null);
    }

    public Company(String name, Address addressMain, Address addressPostal, String country) {
        this(name, addressMain, addressPostal, country, null, null, null, null, null);
    }

    public Company(String name, Address addressMain, Address addressPostal, String country, String legalForm) {
        this(name, addressMain, addressPostal, country, legalForm, null, null, null, null);
    }

    public Company(String name, Address addressMain, Address addressPostal, String country, String legalForm, List<Ubo> ubo) {
        this(name, addressMain, addressPostal, country, legalForm, ubo, null, null, null);
    }

    public Company(String name, Address addressMain, Address addressPostal, String country, String legalForm, List<Ubo> ubo, String chamberOfCommerceNumber) {
        this(name, addressMain, addressPostal, country, legalForm, ubo, chamberOfCommerceNumber, null, null);
    }

    public Company(String name, Address addressMain, Address addressPostal, String country, String legalForm, List<Ubo> ubo, String chamberOfCommerceNumber, String subscriptionType) {
        this(name, addressMain, addressPostal, country, legalForm, ubo, chamberOfCommerceNumber, subscriptionType, null);
    }

    public Company(String name, Address addressMain, Address addressPostal, String country, String legalForm, List<Ubo> ubo, String chamberOfCommerceNumber, String subscriptionType, String avatarUuid) {
        this.nameFieldForRequest = name;
        this.addressMainFieldForRequest = addressMain;
        this.addressPostalFieldForRequest = addressPostal;
        this.countryFieldForRequest = country;
        this.uboFieldForRequest = ubo;
        this.chamberOfCommerceNumberFieldForRequest = chamberOfCommerceNumber;
        this.legalFormFieldForRequest = legalForm;
        this.subscriptionTypeFieldForRequest = subscriptionType;
        this.avatarUuidFieldForRequest = avatarUuid;
    }

    /**
     * @param name                    The company name.
     * @param addressMain             The company's main address.
     * @param addressPostal           The company's postal address.
     * @param country                 The country where the company is registered.
     * @param legalForm               The company's legal form.
     * @param ubo                     The names and birth dates of the company's ultimate beneficiary owners. Minimum
     *                                zero, maximum four.
     * @param chamberOfCommerceNumber The company's chamber of commerce number.
     * @param subscriptionType        The subscription type for the company.
     * @param avatarUuid              The public UUID of the company's avatar.
     */
    public static BunqResponse<Integer> create(String name, Address addressMain, Address addressPostal, String country, String legalForm, List<Ubo> ubo, String chamberOfCommerceNumber, String subscriptionType, String avatarUuid, Map<String, String> customHeaders) {
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

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

        return processForId(responseRaw);
    }

    public static BunqResponse<Integer> create() {
        return create(null, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(String name) {
        return create(name, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(String name, Address addressMain) {
        return create(name, addressMain, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(String name, Address addressMain, Address addressPostal) {
        return create(name, addressMain, addressPostal, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(String name, Address addressMain, Address addressPostal, String country) {
        return create(name, addressMain, addressPostal, country, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(String name, Address addressMain, Address addressPostal, String country, String legalForm) {
        return create(name, addressMain, addressPostal, country, legalForm, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(String name, Address addressMain, Address addressPostal, String country, String legalForm, List<Ubo> ubo) {
        return create(name, addressMain, addressPostal, country, legalForm, ubo, null, null, null, null);
    }

    public static BunqResponse<Integer> create(String name, Address addressMain, Address addressPostal, String country, String legalForm, List<Ubo> ubo, String chamberOfCommerceNumber) {
        return create(name, addressMain, addressPostal, country, legalForm, ubo, chamberOfCommerceNumber, null, null, null);
    }

    public static BunqResponse<Integer> create(String name, Address addressMain, Address addressPostal, String country, String legalForm, List<Ubo> ubo, String chamberOfCommerceNumber, String subscriptionType) {
        return create(name, addressMain, addressPostal, country, legalForm, ubo, chamberOfCommerceNumber, subscriptionType, null, null);
    }

    public static BunqResponse<Integer> create(String name, Address addressMain, Address addressPostal, String country, String legalForm, List<Ubo> ubo, String chamberOfCommerceNumber, String subscriptionType, String avatarUuid) {
        return create(name, addressMain, addressPostal, country, legalForm, ubo, chamberOfCommerceNumber, subscriptionType, avatarUuid, null);
    }

    /**
     *
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
     *
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
     *
     */
    public static Company fromJsonReader(JsonReader reader) {
        return fromJsonReader(Company.class, reader);
    }

    /**
     *
     */
    public UserCompany getUserCompany() {
        return this.userCompany;
    }

    public void setUserCompany(UserCompany userCompany) {
        this.userCompany = userCompany;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.userCompany != null) {
            return false;
        }

        return true;
    }

}
