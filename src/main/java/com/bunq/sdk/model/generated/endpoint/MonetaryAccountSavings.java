package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.Avatar;
import com.bunq.sdk.model.generated.object.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * With MonetaryAccountSavings you can create a new savings account.
 */
public class MonetaryAccountSavings extends BunqModel {

    /**
     * Field constants.
     */
    public static final String FIELD_CURRENCY = "currency";
    public static final String FIELD_DESCRIPTION = "description";
    public static final String FIELD_DAILY_LIMIT = "daily_limit";
    public static final String FIELD_AVATAR_UUID = "avatar_uuid";
    public static final String FIELD_STATUS = "status";
    public static final String FIELD_SUB_STATUS = "sub_status";
    public static final String FIELD_REASON = "reason";
    public static final String FIELD_REASON_DESCRIPTION = "reason_description";
    public static final String FIELD_ALL_CO_OWNER = "all_co_owner";
    public static final String FIELD_SETTING = "setting";
    public static final String FIELD_SAVINGS_GOAL = "savings_goal";
    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account-savings";
    protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account-savings/%s";
    protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account-savings/%s";
    protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account-savings";
    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_GET = "MonetaryAccountSavings";

    /**
     * The id of the MonetaryAccountSavings.
     */
    @Expose
    @SerializedName("id")
    private Integer id;

    /**
     * The timestamp of the MonetaryAccountSavings's creation.
     */
    @Expose
    @SerializedName("created")
    private String created;

    /**
     * The timestamp of the MonetaryAccountSavings's last update.
     */
    @Expose
    @SerializedName("updated")
    private String updated;

    /**
     * The Avatar of the MonetaryAccountSavings.
     */
    @Expose
    @SerializedName("avatar")
    private Avatar avatar;

    /**
     * The currency of the MonetaryAccountSavings as an ISO 4217 formatted currency code.
     */
    @Expose
    @SerializedName("currency")
    private String currency;

    /**
     * The description of the MonetaryAccountSavings. Defaults to 'bunq account'.
     */
    @Expose
    @SerializedName("description")
    private String description;

    /**
     * The daily spending limit Amount of the MonetaryAccountSavings. Defaults to 1000 EUR. Currency
     * must match the MonetaryAccountSavings's currency. Limited to 10000 EUR.
     */
    @Expose
    @SerializedName("daily_limit")
    private Amount dailyLimit;

    /**
     * The maximum Amount the MonetaryAccountSavings can be 'in the red'. Must be 0 EUR or omitted.
     */
    @Expose
    @SerializedName("overdraft_limit")
    private Amount overdraftLimit;

    /**
     * The current available balance Amount of the MonetaryAccountSavings.
     */
    @Expose
    @SerializedName("balance")
    private Amount balance;

    /**
     * The Aliases for the MonetaryAccountSavings.
     */
    @Expose
    @SerializedName("alias")
    private List<Pointer> alias;

    /**
     * The MonetaryAccountSavings's public UUID.
     */
    @Expose
    @SerializedName("public_uuid")
    private String publicUuid;

    /**
     * The status of the MonetaryAccountSavings. Can be: ACTIVE, BLOCKED, CANCELLED or
     * PENDING_REOPEN
     */
    @Expose
    @SerializedName("status")
    private String status;

    /**
     * The sub-status of the MonetaryAccountSavings providing extra information regarding the
     * status. Will be NONE for ACTIVE or PENDING_REOPEN, COMPLETELY or ONLY_ACCEPTING_INCOMING for
     * BLOCKED and REDEMPTION_INVOLUNTARY, REDEMPTION_VOLUNTARY or PERMANENT for CANCELLED.
     */
    @Expose
    @SerializedName("sub_status")
    private String subStatus;

    /**
     * The reason for voluntarily cancelling (closing) the MonetaryAccountSavings, can only be
     * OTHER.
     */
    @Expose
    @SerializedName("reason")
    private String reason;

    /**
     * The optional free-form reason for voluntarily cancelling (closing) the
     * MonetaryAccountSavings. Can be any user provided message.
     */
    @Expose
    @SerializedName("reason_description")
    private String reasonDescription;

    /**
     * The users the account will be joint with.
     */
    @Expose
    @SerializedName("all_co_owner")
    private List<CoOwner> allCoOwner;

    /**
     * The id of the User who owns the MonetaryAccountSavings.
     */
    @Expose
    @SerializedName("user_id")
    private Integer userId;

    /**
     * The profile of the account.
     */
    @Expose
    @SerializedName("monetary_account_profile")
    private MonetaryAccountProfile monetaryAccountProfile;

    /**
     * The settings of the MonetaryAccountSavings.
     */
    @Expose
    @SerializedName("setting")
    private MonetaryAccountSetting setting;

    /**
     * The Savings Goal set for this MonetaryAccountSavings.
     */
    @Expose
    @SerializedName("savings_goal")
    private Amount savingsGoal;

    /**
     * The progress in percentages for the Savings Goal set for this MonetaryAccountSavings.
     */
    @Expose
    @SerializedName("savings_goal_progress")
    private BigDecimal savingsGoalProgress;

    /**
     * The ids of the AutoSave.
     */
    @Expose
    @SerializedName("all_auto_save_id")
    private List<BunqId> allAutoSaveId;

    /**
     * The currency of the MonetaryAccountSavings as an ISO 4217 formatted currency code.
     */
    @Expose
    @SerializedName("currency_field_for_request")
    private String currencyFieldForRequest;

    /**
     * The description of the MonetaryAccountSavings. Defaults to 'bunq account'.
     */
    @Expose
    @SerializedName("description_field_for_request")
    private String descriptionFieldForRequest;

    /**
     * The daily spending limit Amount of the MonetaryAccountSavings. Defaults to 1000 EUR. Currency
     * must match the MonetaryAccountSavings's currency. Limited to 10000 EUR.
     */
    @Expose
    @SerializedName("daily_limit_field_for_request")
    private Amount dailyLimitFieldForRequest;

    /**
     * The UUID of the Avatar of the MonetaryAccountSavings.
     */
    @Expose
    @SerializedName("avatar_uuid_field_for_request")
    private String avatarUuidFieldForRequest;

    /**
     * The status of the MonetaryAccountSavings. Ignored in POST requests (always set to ACTIVE) can
     * be CANCELLED or PENDING_REOPEN in PUT requests to cancel (close) or reopen the
     * MonetaryAccountSavings. When updating the status and/or sub_status no other fields can be
     * updated in the same request (and vice versa).
     */
    @Expose
    @SerializedName("status_field_for_request")
    private String statusFieldForRequest;

    /**
     * The sub-status of the MonetaryAccountSavings providing extra information regarding the
     * status. Should be ignored for POST requests. In case of PUT requests with status CANCELLED it
     * can only be REDEMPTION_VOLUNTARY, while with status PENDING_REOPEN it can only be NONE. When
     * updating the status and/or sub_status no other fields can be updated in the same request (and
     * vice versa).
     */
    @Expose
    @SerializedName("sub_status_field_for_request")
    private String subStatusFieldForRequest;

    /**
     * The reason for voluntarily cancelling (closing) the MonetaryAccountSavings, can only be
     * OTHER. Should only be specified if updating the status to CANCELLED.
     */
    @Expose
    @SerializedName("reason_field_for_request")
    private String reasonFieldForRequest;

    /**
     * The optional free-form reason for voluntarily cancelling (closing) the
     * MonetaryAccountSavings. Can be any user provided message. Should only be specified if
     * updating the status to CANCELLED.
     */
    @Expose
    @SerializedName("reason_description_field_for_request")
    private String reasonDescriptionFieldForRequest;

    /**
     * The users the account will be joint with.
     */
    @Expose
    @SerializedName("all_co_owner_field_for_request")
    private List<CoOwner> allCoOwnerFieldForRequest;

    /**
     * The settings of the MonetaryAccountSavings.
     */
    @Expose
    @SerializedName("setting_field_for_request")
    private MonetaryAccountSetting settingFieldForRequest;

    /**
     * The Savings Goal set for this MonetaryAccountSavings.
     */
    @Expose
    @SerializedName("savings_goal_field_for_request")
    private Amount savingsGoalFieldForRequest;

    public MonetaryAccountSavings() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public MonetaryAccountSavings(String currency) {
        this(currency, null, null, null, null, null, null, null, null, null, null);
    }

    public MonetaryAccountSavings(String currency, String description) {
        this(currency, description, null, null, null, null, null, null, null, null, null);
    }

    public MonetaryAccountSavings(String currency, String description, Amount dailyLimit) {
        this(currency, description, dailyLimit, null, null, null, null, null, null, null, null);
    }

    public MonetaryAccountSavings(String currency, String description, Amount dailyLimit, String avatarUuid) {
        this(currency, description, dailyLimit, avatarUuid, null, null, null, null, null, null, null);
    }

    public MonetaryAccountSavings(String currency, String description, Amount dailyLimit, String avatarUuid, String status) {
        this(currency, description, dailyLimit, avatarUuid, status, null, null, null, null, null, null);
    }

    public MonetaryAccountSavings(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus) {
        this(currency, description, dailyLimit, avatarUuid, status, subStatus, null, null, null, null, null);
    }

    public MonetaryAccountSavings(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason) {
        this(currency, description, dailyLimit, avatarUuid, status, subStatus, reason, null, null, null, null);
    }

    public MonetaryAccountSavings(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription) {
        this(currency, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, null, null, null);
    }

    public MonetaryAccountSavings(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, List<CoOwner> allCoOwner) {
        this(currency, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, allCoOwner, null, null);
    }

    public MonetaryAccountSavings(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, List<CoOwner> allCoOwner, MonetaryAccountSetting setting) {
        this(currency, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, allCoOwner, setting, null);
    }

    public MonetaryAccountSavings(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, List<CoOwner> allCoOwner, MonetaryAccountSetting setting, Amount savingsGoal) {
        this.currencyFieldForRequest = currency;
        this.descriptionFieldForRequest = description;
        this.dailyLimitFieldForRequest = dailyLimit;
        this.avatarUuidFieldForRequest = avatarUuid;
        this.statusFieldForRequest = status;
        this.subStatusFieldForRequest = subStatus;
        this.reasonFieldForRequest = reason;
        this.reasonDescriptionFieldForRequest = reasonDescription;
        this.allCoOwnerFieldForRequest = allCoOwner;
        this.settingFieldForRequest = setting;
        this.savingsGoalFieldForRequest = savingsGoal;
    }

    /**
     * Create new MonetaryAccountSavings.
     *
     * @param currency          The currency of the MonetaryAccountSavings as an ISO 4217 formatted currency
     *                          code.
     * @param description       The description of the MonetaryAccountSavings. Defaults to 'bunq account'.
     * @param dailyLimit        The daily spending limit Amount of the MonetaryAccountSavings. Defaults to
     *                          1000 EUR. Currency must match the MonetaryAccountSavings's currency. Limited to 10000 EUR.
     * @param avatarUuid        The UUID of the Avatar of the MonetaryAccountSavings.
     * @param status            The status of the MonetaryAccountSavings. Ignored in POST requests (always set
     *                          to ACTIVE) can be CANCELLED or PENDING_REOPEN in PUT requests to cancel (close) or reopen the
     *                          MonetaryAccountSavings. When updating the status and/or sub_status no other fields can be
     *                          updated in the same request (and vice versa).
     * @param subStatus         The sub-status of the MonetaryAccountSavings providing extra information
     *                          regarding the status. Should be ignored for POST requests. In case of PUT requests with
     *                          status CANCELLED it can only be REDEMPTION_VOLUNTARY, while with status PENDING_REOPEN it can
     *                          only be NONE. When updating the status and/or sub_status no other fields can be updated in
     *                          the same request (and vice versa).
     * @param reason            The reason for voluntarily cancelling (closing) the MonetaryAccountSavings, can
     *                          only be OTHER. Should only be specified if updating the status to CANCELLED.
     * @param reasonDescription The optional free-form reason for voluntarily cancelling (closing)
     *                          the MonetaryAccountSavings. Can be any user provided message. Should only be specified if
     *                          updating the status to CANCELLED.
     * @param allCoOwner        The users the account will be joint with.
     * @param setting           The settings of the MonetaryAccountSavings.
     * @param savingsGoal       The Savings Goal set for this MonetaryAccountSavings.
     */
    public static BunqResponse<Integer> create(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, List<CoOwner> allCoOwner, MonetaryAccountSetting setting, Amount savingsGoal, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_CURRENCY, currency);
        requestMap.put(FIELD_DESCRIPTION, description);
        requestMap.put(FIELD_DAILY_LIMIT, dailyLimit);
        requestMap.put(FIELD_AVATAR_UUID, avatarUuid);
        requestMap.put(FIELD_STATUS, status);
        requestMap.put(FIELD_SUB_STATUS, subStatus);
        requestMap.put(FIELD_REASON, reason);
        requestMap.put(FIELD_REASON_DESCRIPTION, reasonDescription);
        requestMap.put(FIELD_ALL_CO_OWNER, allCoOwner);
        requestMap.put(FIELD_SETTING, setting);
        requestMap.put(FIELD_SAVINGS_GOAL, savingsGoal);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

        return processForId(responseRaw);
    }

    public static BunqResponse<Integer> create() {
        return create(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(String currency) {
        return create(currency, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(String currency, String description) {
        return create(currency, description, null, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(String currency, String description, Amount dailyLimit) {
        return create(currency, description, dailyLimit, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(String currency, String description, Amount dailyLimit, String avatarUuid) {
        return create(currency, description, dailyLimit, avatarUuid, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(String currency, String description, Amount dailyLimit, String avatarUuid, String status) {
        return create(currency, description, dailyLimit, avatarUuid, status, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus) {
        return create(currency, description, dailyLimit, avatarUuid, status, subStatus, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason) {
        return create(currency, description, dailyLimit, avatarUuid, status, subStatus, reason, null, null, null, null, null);
    }

    public static BunqResponse<Integer> create(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription) {
        return create(currency, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, null, null, null, null);
    }

    public static BunqResponse<Integer> create(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, List<CoOwner> allCoOwner) {
        return create(currency, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, allCoOwner, null, null, null);
    }

    public static BunqResponse<Integer> create(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, List<CoOwner> allCoOwner, MonetaryAccountSetting setting) {
        return create(currency, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, allCoOwner, setting, null, null);
    }

    public static BunqResponse<Integer> create(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, List<CoOwner> allCoOwner, MonetaryAccountSetting setting, Amount savingsGoal) {
        return create(currency, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, allCoOwner, setting, savingsGoal, null);
    }

    /**
     * Get a specific MonetaryAccountSavings.
     */
    public static BunqResponse<MonetaryAccountSavings> get(Integer monetaryAccountSavingsId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), monetaryAccountSavingsId), params, customHeaders);

        return fromJson(MonetaryAccountSavings.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<MonetaryAccountSavings> get() {
        return get(null, null, null);
    }

    public static BunqResponse<MonetaryAccountSavings> get(Integer monetaryAccountSavingsId) {
        return get(monetaryAccountSavingsId, null, null);
    }

    public static BunqResponse<MonetaryAccountSavings> get(Integer monetaryAccountSavingsId, Map<String, String> params) {
        return get(monetaryAccountSavingsId, params, null);
    }

    /**
     * Update a specific existing MonetaryAccountSavings.
     *
     * @param description       The description of the MonetaryAccountSavings. Defaults to 'bunq account'.
     * @param dailyLimit        The daily spending limit Amount of the MonetaryAccountSavings. Defaults to
     *                          1000 EUR. Currency must match the MonetaryAccountSavings's currency. Limited to 10000 EUR.
     * @param avatarUuid        The UUID of the Avatar of the MonetaryAccountSavings.
     * @param status            The status of the MonetaryAccountSavings. Ignored in POST requests (always set
     *                          to ACTIVE) can be CANCELLED or PENDING_REOPEN in PUT requests to cancel (close) or reopen the
     *                          MonetaryAccountSavings. When updating the status and/or sub_status no other fields can be
     *                          updated in the same request (and vice versa).
     * @param subStatus         The sub-status of the MonetaryAccountSavings providing extra information
     *                          regarding the status. Should be ignored for POST requests. In case of PUT requests with
     *                          status CANCELLED it can only be REDEMPTION_VOLUNTARY, while with status PENDING_REOPEN it can
     *                          only be NONE. When updating the status and/or sub_status no other fields can be updated in
     *                          the same request (and vice versa).
     * @param reason            The reason for voluntarily cancelling (closing) the MonetaryAccountSavings, can
     *                          only be OTHER. Should only be specified if updating the status to CANCELLED.
     * @param reasonDescription The optional free-form reason for voluntarily cancelling (closing)
     *                          the MonetaryAccountSavings. Can be any user provided message. Should only be specified if
     *                          updating the status to CANCELLED.
     * @param setting           The settings of the MonetaryAccountSavings.
     * @param savingsGoal       The Savings Goal set for this MonetaryAccountSavings.
     */
    public static BunqResponse<Integer> update(Integer monetaryAccountSavingsId, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, MonetaryAccountSetting setting, Amount savingsGoal, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());

        if (customHeaders == null) {
            customHeaders = new HashMap<>();
        }

        HashMap<String, Object> requestMap = new HashMap<>();
        requestMap.put(FIELD_DESCRIPTION, description);
        requestMap.put(FIELD_DAILY_LIMIT, dailyLimit);
        requestMap.put(FIELD_AVATAR_UUID, avatarUuid);
        requestMap.put(FIELD_STATUS, status);
        requestMap.put(FIELD_SUB_STATUS, subStatus);
        requestMap.put(FIELD_REASON, reason);
        requestMap.put(FIELD_REASON_DESCRIPTION, reasonDescription);
        requestMap.put(FIELD_SETTING, setting);
        requestMap.put(FIELD_SAVINGS_GOAL, savingsGoal);

        byte[] requestBytes = determineAllRequestByte(requestMap);
        BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), monetaryAccountSavingsId), requestBytes, customHeaders);

        return processForId(responseRaw);
    }

    public static BunqResponse<Integer> update(Integer monetaryAccountSavingsId) {
        return update(monetaryAccountSavingsId, null, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer monetaryAccountSavingsId, String description) {
        return update(monetaryAccountSavingsId, description, null, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer monetaryAccountSavingsId, String description, Amount dailyLimit) {
        return update(monetaryAccountSavingsId, description, dailyLimit, null, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer monetaryAccountSavingsId, String description, Amount dailyLimit, String avatarUuid) {
        return update(monetaryAccountSavingsId, description, dailyLimit, avatarUuid, null, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer monetaryAccountSavingsId, String description, Amount dailyLimit, String avatarUuid, String status) {
        return update(monetaryAccountSavingsId, description, dailyLimit, avatarUuid, status, null, null, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer monetaryAccountSavingsId, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus) {
        return update(monetaryAccountSavingsId, description, dailyLimit, avatarUuid, status, subStatus, null, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer monetaryAccountSavingsId, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason) {
        return update(monetaryAccountSavingsId, description, dailyLimit, avatarUuid, status, subStatus, reason, null, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer monetaryAccountSavingsId, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription) {
        return update(monetaryAccountSavingsId, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, null, null, null);
    }

    public static BunqResponse<Integer> update(Integer monetaryAccountSavingsId, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, MonetaryAccountSetting setting) {
        return update(monetaryAccountSavingsId, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, setting, null, null);
    }

    public static BunqResponse<Integer> update(Integer monetaryAccountSavingsId, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, MonetaryAccountSetting setting, Amount savingsGoal) {
        return update(monetaryAccountSavingsId, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, setting, savingsGoal, null);
    }

    /**
     * Gets a listing of all MonetaryAccountSavingss of a given user.
     */
    public static BunqResponse<List<MonetaryAccountSavings>> list(Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

        return fromJsonList(MonetaryAccountSavings.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<List<MonetaryAccountSavings>> list() {
        return list(null, null);
    }

    public static BunqResponse<List<MonetaryAccountSavings>> list(Map<String, String> params) {
        return list(params, null);
    }

    /**
     *
     */
    public static MonetaryAccountSavings fromJsonReader(JsonReader reader) {
        return fromJsonReader(MonetaryAccountSavings.class, reader);
    }

    /**
     * The id of the MonetaryAccountSavings.
     */
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The timestamp of the MonetaryAccountSavings's creation.
     */
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * The timestamp of the MonetaryAccountSavings's last update.
     */
    public String getUpdated() {
        return this.updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    /**
     * The Avatar of the MonetaryAccountSavings.
     */
    public Avatar getAvatar() {
        return this.avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    /**
     * The currency of the MonetaryAccountSavings as an ISO 4217 formatted currency code.
     */
    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * The description of the MonetaryAccountSavings. Defaults to 'bunq account'.
     */
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The daily spending limit Amount of the MonetaryAccountSavings. Defaults to 1000 EUR. Currency
     * must match the MonetaryAccountSavings's currency. Limited to 10000 EUR.
     */
    public Amount getDailyLimit() {
        return this.dailyLimit;
    }

    public void setDailyLimit(Amount dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    /**
     * The maximum Amount the MonetaryAccountSavings can be 'in the red'. Must be 0 EUR or omitted.
     */
    public Amount getOverdraftLimit() {
        return this.overdraftLimit;
    }

    public void setOverdraftLimit(Amount overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * The current available balance Amount of the MonetaryAccountSavings.
     */
    public Amount getBalance() {
        return this.balance;
    }

    public void setBalance(Amount balance) {
        this.balance = balance;
    }

    /**
     * The Aliases for the MonetaryAccountSavings.
     */
    public List<Pointer> getAlias() {
        return this.alias;
    }

    public void setAlias(List<Pointer> alias) {
        this.alias = alias;
    }

    /**
     * The MonetaryAccountSavings's public UUID.
     */
    public String getPublicUuid() {
        return this.publicUuid;
    }

    public void setPublicUuid(String publicUuid) {
        this.publicUuid = publicUuid;
    }

    /**
     * The status of the MonetaryAccountSavings. Can be: ACTIVE, BLOCKED, CANCELLED or
     * PENDING_REOPEN
     */
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * The sub-status of the MonetaryAccountSavings providing extra information regarding the
     * status. Will be NONE for ACTIVE or PENDING_REOPEN, COMPLETELY or ONLY_ACCEPTING_INCOMING for
     * BLOCKED and REDEMPTION_INVOLUNTARY, REDEMPTION_VOLUNTARY or PERMANENT for CANCELLED.
     */
    public String getSubStatus() {
        return this.subStatus;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    /**
     * The reason for voluntarily cancelling (closing) the MonetaryAccountSavings, can only be
     * OTHER.
     */
    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * The optional free-form reason for voluntarily cancelling (closing) the
     * MonetaryAccountSavings. Can be any user provided message.
     */
    public String getReasonDescription() {
        return this.reasonDescription;
    }

    public void setReasonDescription(String reasonDescription) {
        this.reasonDescription = reasonDescription;
    }

    /**
     * The users the account will be joint with.
     */
    public List<CoOwner> getAllCoOwner() {
        return this.allCoOwner;
    }

    public void setAllCoOwner(List<CoOwner> allCoOwner) {
        this.allCoOwner = allCoOwner;
    }

    /**
     * The id of the User who owns the MonetaryAccountSavings.
     */
    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * The profile of the account.
     */
    public MonetaryAccountProfile getMonetaryAccountProfile() {
        return this.monetaryAccountProfile;
    }

    public void setMonetaryAccountProfile(MonetaryAccountProfile monetaryAccountProfile) {
        this.monetaryAccountProfile = monetaryAccountProfile;
    }

    /**
     * The settings of the MonetaryAccountSavings.
     */
    public MonetaryAccountSetting getSetting() {
        return this.setting;
    }

    public void setSetting(MonetaryAccountSetting setting) {
        this.setting = setting;
    }

    /**
     * The Savings Goal set for this MonetaryAccountSavings.
     */
    public Amount getSavingsGoal() {
        return this.savingsGoal;
    }

    public void setSavingsGoal(Amount savingsGoal) {
        this.savingsGoal = savingsGoal;
    }

    /**
     * The progress in percentages for the Savings Goal set for this MonetaryAccountSavings.
     */
    public BigDecimal getSavingsGoalProgress() {
        return this.savingsGoalProgress;
    }

    public void setSavingsGoalProgress(BigDecimal savingsGoalProgress) {
        this.savingsGoalProgress = savingsGoalProgress;
    }

    /**
     * The ids of the AutoSave.
     */
    public List<BunqId> getAllAutoSaveId() {
        return this.allAutoSaveId;
    }

    public void setAllAutoSaveId(List<BunqId> allAutoSaveId) {
        this.allAutoSaveId = allAutoSaveId;
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

        if (this.avatar != null) {
            return false;
        }

        if (this.currency != null) {
            return false;
        }

        if (this.description != null) {
            return false;
        }

        if (this.dailyLimit != null) {
            return false;
        }

        if (this.overdraftLimit != null) {
            return false;
        }

        if (this.balance != null) {
            return false;
        }

        if (this.alias != null) {
            return false;
        }

        if (this.publicUuid != null) {
            return false;
        }

        if (this.status != null) {
            return false;
        }

        if (this.subStatus != null) {
            return false;
        }

        if (this.reason != null) {
            return false;
        }

        if (this.reasonDescription != null) {
            return false;
        }

        if (this.allCoOwner != null) {
            return false;
        }

        if (this.userId != null) {
            return false;
        }

        if (this.monetaryAccountProfile != null) {
            return false;
        }

        if (this.setting != null) {
            return false;
        }

        if (this.savingsGoal != null) {
            return false;
        }

        if (this.savingsGoalProgress != null) {
            return false;
        }

        if (this.allAutoSaveId != null) {
            return false;
        }

        return true;
    }

}
