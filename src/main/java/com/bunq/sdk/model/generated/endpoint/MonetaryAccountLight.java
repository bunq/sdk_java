package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Avatar;
import com.bunq.sdk.model.generated.object.MonetaryAccountSetting;
import com.bunq.sdk.model.generated.object.NotificationFilter;
import com.bunq.sdk.model.generated.object.Pointer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * With MonetaryAccountLight is a monetary account for bunq light users. Through this endpoint
 * you can retrieve information regarding your existing MonetaryAccountLights and update
 * specific fields of an existing MonetaryAccountLight. Examples of fields that can be updated
 * are the description, the daily limit and the avatar of the account.
 */
public class MonetaryAccountLight extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account-light";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account-light/%s";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account-light/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account-light";

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
  public static final String FIELD_NOTIFICATION_FILTERS = "notification_filters";
  public static final String FIELD_SETTING = "setting";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "MonetaryAccountLight";

  /**
   * The id of the MonetaryAccountLight.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the MonetaryAccountLight's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the MonetaryAccountLight's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The Avatar of the MonetaryAccountLight.
   */
  @Expose
  @SerializedName("avatar")
  private Avatar avatar;

  /**
   * The currency of the MonetaryAccountLight as an ISO 4217 formatted currency code.
   */
  @Expose
  @SerializedName("currency")
  private String currency;

  /**
   * The description of the MonetaryAccountLight. Defaults to 'bunq account'.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The daily spending limit Amount of the MonetaryAccountLight. Defaults to 1000 EUR. Currency
   * must match the MonetaryAccountLight's currency. Limited to 10000 EUR.
   */
  @Expose
  @SerializedName("daily_limit")
  private Amount dailyLimit;

  /**
   * Total Amount of money spent today. Timezone aware.
   */
  @Expose
  @SerializedName("daily_spent")
  private Amount dailySpent;

  /**
   * The current balance Amount of the MonetaryAccountLight.
   */
  @Expose
  @SerializedName("balance")
  private Amount balance;

  /**
   * The Aliases for the MonetaryAccountLight.
   */
  @Expose
  @SerializedName("alias")
  private List<Pointer> alias;

  /**
   * The MonetaryAccountLight's public UUID.
   */
  @Expose
  @SerializedName("public_uuid")
  private String publicUuid;

  /**
   * The status of the MonetaryAccountLight. Can be: ACTIVE, BLOCKED, CANCELLED or PENDING_REOPEN
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The sub-status of the MonetaryAccountLight providing extra information regarding the status.
   * Will be NONE for ACTIVE or PENDING_REOPEN, COMPLETELY or ONLY_ACCEPTING_INCOMING for BLOCKED
   * and REDEMPTION_INVOLUNTARY, REDEMPTION_VOLUNTARY or PERMANENT for CANCELLED.
   */
  @Expose
  @SerializedName("sub_status")
  private String subStatus;

  /**
   * The reason for voluntarily cancelling (closing) the MonetaryAccountBank, can only be OTHER.
   */
  @Expose
  @SerializedName("reason")
  private String reason;

  /**
   * The optional free-form reason for voluntarily cancelling (closing) the MonetaryAccountBank.
   * Can be any user provided message.
   */
  @Expose
  @SerializedName("reason_description")
  private String reasonDescription;

  /**
   * The id of the User who owns the MonetaryAccountLight.
   */
  @Expose
  @SerializedName("user_id")
  private Integer userId;

  /**
   * The maximum balance Amount of the MonetaryAccountLight.
   */
  @Expose
  @SerializedName("balance_maximum")
  private Amount balanceMaximum;

  /**
   * The amount of the monthly budget used.
   */
  @Expose
  @SerializedName("budget_month_used")
  private Amount budgetMonthUsed;

  /**
   * The total amount of the monthly budget.
   */
  @Expose
  @SerializedName("budget_month_maximum")
  private Amount budgetMonthMaximum;

  /**
   * The amount of the yearly budget used.
   */
  @Expose
  @SerializedName("budget_year_used")
  private Amount budgetYearUsed;

  /**
   * The total amount of the yearly budget.
   */
  @Expose
  @SerializedName("budget_year_maximum")
  private Amount budgetYearMaximum;

  /**
   * The amount of the yearly withdrawal budget used.
   */
  @Expose
  @SerializedName("budget_withdrawal_year_used")
  private Amount budgetWithdrawalYearUsed;

  /**
   * The total amount of the yearly withdrawal budget.
   */
  @Expose
  @SerializedName("budget_withdrawal_year_maximum")
  private Amount budgetWithdrawalYearMaximum;

  /**
   * The types of notifications that will result in a push notification or URL callback for this
   * MonetaryAccountLight.
   */
  @Expose
  @SerializedName("notification_filters")
  private List<NotificationFilter> notificationFilters;

  /**
   * The settings of the MonetaryAccountLight.
   */
  @Expose
  @SerializedName("setting")
  private MonetaryAccountSetting setting;

  /**
   * Create new MonetaryAccountLight.
   * @param currency The currency of the MonetaryAccountLight as an ISO 4217 formatted currency
   * code.
   * @param description The description of the MonetaryAccountLight. Defaults to 'bunq account'.
   * @param dailyLimit The daily spending limit Amount of the MonetaryAccountLight. Defaults to
   * 1000 EUR. Currency must match the MonetaryAccountLight's currency. Limited to 10000 EUR.
   * @param avatarUuid The UUID of the Avatar of the MonetaryAccountLight.
   * @param status The status of the MonetaryAccountLight. Ignored in POST requests (always set to
   * ACTIVE) can be CANCELLED or PENDING_REOPEN in PUT requests to cancel (close) or reopen the
   * MonetaryAccountLight. When updating the status and/or sub_status no other fields can be
   * updated in the same request (and vice versa).
   * @param subStatus The sub-status of the MonetaryAccountLight providing extra information
   * regarding the status. Should be ignored for POST requests and can only be
   * REDEMPTION_VOLUNTARY for PUT requests with status CANCELLED. When updating the status and/or
   * sub_status no other fields can be updated in the same request (and vice versa).
   * @param reason The reason for voluntarily cancelling (closing) the MonetaryAccountBank, can
   * only be OTHER. Should only be specified if updating the status to CANCELLED.
   * @param reasonDescription The optional free-form reason for voluntarily cancelling (closing)
   * the MonetaryAccountBank. Can be any user provided message. Should only be specified if
   * updating the status to CANCELLED.
   * @param notificationFilters The types of notifications that will result in a push notification
   * or URL callback for this MonetaryAccountLight.
   * @param setting The settings of the MonetaryAccountLight.
   */
  public static BunqResponse<Integer> create(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, List<NotificationFilter> notificationFilters, MonetaryAccountSetting setting, Map<String, String> customHeaders) {
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
requestMap.put(FIELD_NOTIFICATION_FILTERS, notificationFilters);
requestMap.put(FIELD_SETTING, setting);

    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return processForId(responseRaw);
  }
  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String currency) {
    return create(currency, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String currency, String description) {
    return create(currency, description, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String currency, String description, Amount dailyLimit) {
    return create(currency, description, dailyLimit, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String currency, String description, Amount dailyLimit, String avatarUuid) {
    return create(currency, description, dailyLimit, avatarUuid, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String currency, String description, Amount dailyLimit, String avatarUuid, String status) {
    return create(currency, description, dailyLimit, avatarUuid, status, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus) {
    return create(currency, description, dailyLimit, avatarUuid, status, subStatus, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason) {
    return create(currency, description, dailyLimit, avatarUuid, status, subStatus, reason, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription) {
    return create(currency, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, null, null, null);
  }

  public static BunqResponse<Integer> create(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, List<NotificationFilter> notificationFilters) {
    return create(currency, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, notificationFilters, null, null);
  }

  public static BunqResponse<Integer> create(String currency, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, List<NotificationFilter> notificationFilters, MonetaryAccountSetting setting) {
    return create(currency, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, notificationFilters, setting, null);
  }

  /**
   * Get a specific MonetaryAccountLight.
   */
  public static BunqResponse<MonetaryAccountLight> get(Integer monetaryAccountLightId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), monetaryAccountLightId), params, customHeaders);

    return fromJson(MonetaryAccountLight.class, responseRaw, OBJECT_TYPE_GET);
  }
  public static BunqResponse<MonetaryAccountLight> get() {
    return get(null, null, null);
  }

  public static BunqResponse<MonetaryAccountLight> get(Integer monetaryAccountLightId) {
    return get(monetaryAccountLightId, null, null);
  }

  public static BunqResponse<MonetaryAccountLight> get(Integer monetaryAccountLightId, Map<String, String> params) {
    return get(monetaryAccountLightId, params, null);
  }

  /**
   * Update a specific existing MonetaryAccountLight.
   * @param description The description of the MonetaryAccountLight. Defaults to 'bunq account'.
   * @param dailyLimit The daily spending limit Amount of the MonetaryAccountLight. Defaults to
   * 1000 EUR. Currency must match the MonetaryAccountLight's currency. Limited to 10000 EUR.
   * @param avatarUuid The UUID of the Avatar of the MonetaryAccountLight.
   * @param status The status of the MonetaryAccountLight. Ignored in POST requests (always set to
   * ACTIVE) can be CANCELLED or PENDING_REOPEN in PUT requests to cancel (close) or reopen the
   * MonetaryAccountLight. When updating the status and/or sub_status no other fields can be
   * updated in the same request (and vice versa).
   * @param subStatus The sub-status of the MonetaryAccountLight providing extra information
   * regarding the status. Should be ignored for POST requests and can only be
   * REDEMPTION_VOLUNTARY for PUT requests with status CANCELLED. When updating the status and/or
   * sub_status no other fields can be updated in the same request (and vice versa).
   * @param reason The reason for voluntarily cancelling (closing) the MonetaryAccountBank, can
   * only be OTHER. Should only be specified if updating the status to CANCELLED.
   * @param reasonDescription The optional free-form reason for voluntarily cancelling (closing)
   * the MonetaryAccountBank. Can be any user provided message. Should only be specified if
   * updating the status to CANCELLED.
   * @param notificationFilters The types of notifications that will result in a push notification
   * or URL callback for this MonetaryAccountLight.
   * @param setting The settings of the MonetaryAccountLight.
   */
  public static BunqResponse<Integer> update(Integer monetaryAccountLightId, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, List<NotificationFilter> notificationFilters, MonetaryAccountSetting setting, Map<String, String> customHeaders) {
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
requestMap.put(FIELD_NOTIFICATION_FILTERS, notificationFilters);
requestMap.put(FIELD_SETTING, setting);

    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), monetaryAccountLightId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update() {
    return update(null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer monetaryAccountLightId) {
    return update(monetaryAccountLightId, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer monetaryAccountLightId, String description) {
    return update(monetaryAccountLightId, description, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer monetaryAccountLightId, String description, Amount dailyLimit) {
    return update(monetaryAccountLightId, description, dailyLimit, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer monetaryAccountLightId, String description, Amount dailyLimit, String avatarUuid) {
    return update(monetaryAccountLightId, description, dailyLimit, avatarUuid, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer monetaryAccountLightId, String description, Amount dailyLimit, String avatarUuid, String status) {
    return update(monetaryAccountLightId, description, dailyLimit, avatarUuid, status, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer monetaryAccountLightId, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus) {
    return update(monetaryAccountLightId, description, dailyLimit, avatarUuid, status, subStatus, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer monetaryAccountLightId, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason) {
    return update(monetaryAccountLightId, description, dailyLimit, avatarUuid, status, subStatus, reason, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer monetaryAccountLightId, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription) {
    return update(monetaryAccountLightId, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer monetaryAccountLightId, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, List<NotificationFilter> notificationFilters) {
    return update(monetaryAccountLightId, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, notificationFilters, null, null);
  }

  public static BunqResponse<Integer> update(Integer monetaryAccountLightId, String description, Amount dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, List<NotificationFilter> notificationFilters, MonetaryAccountSetting setting) {
    return update(monetaryAccountLightId, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, notificationFilters, setting, null);
  }

  /**
   * Gets a listing of all MonetaryAccountLights of a given user.
   */
  public static BunqResponse<List<MonetaryAccountLight>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(MonetaryAccountLight.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<MonetaryAccountLight>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<MonetaryAccountLight>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The id of the MonetaryAccountLight.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the MonetaryAccountLight's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the MonetaryAccountLight's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The Avatar of the MonetaryAccountLight.
   */
  public Avatar getAvatar() {
    return this.avatar;
  }

  public void setAvatar(Avatar avatar) {
    this.avatar = avatar;
  }

  /**
   * The currency of the MonetaryAccountLight as an ISO 4217 formatted currency code.
   */
  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * The description of the MonetaryAccountLight. Defaults to 'bunq account'.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The daily spending limit Amount of the MonetaryAccountLight. Defaults to 1000 EUR. Currency
   * must match the MonetaryAccountLight's currency. Limited to 10000 EUR.
   */
  public Amount getDailyLimit() {
    return this.dailyLimit;
  }

  public void setDailyLimit(Amount dailyLimit) {
    this.dailyLimit = dailyLimit;
  }

  /**
   * Total Amount of money spent today. Timezone aware.
   */
  public Amount getDailySpent() {
    return this.dailySpent;
  }

  public void setDailySpent(Amount dailySpent) {
    this.dailySpent = dailySpent;
  }

  /**
   * The current balance Amount of the MonetaryAccountLight.
   */
  public Amount getBalance() {
    return this.balance;
  }

  public void setBalance(Amount balance) {
    this.balance = balance;
  }

  /**
   * The Aliases for the MonetaryAccountLight.
   */
  public List<Pointer> getAlias() {
    return this.alias;
  }

  public void setAlias(List<Pointer> alias) {
    this.alias = alias;
  }

  /**
   * The MonetaryAccountLight's public UUID.
   */
  public String getPublicUuid() {
    return this.publicUuid;
  }

  public void setPublicUuid(String publicUuid) {
    this.publicUuid = publicUuid;
  }

  /**
   * The status of the MonetaryAccountLight. Can be: ACTIVE, BLOCKED, CANCELLED or PENDING_REOPEN
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The sub-status of the MonetaryAccountLight providing extra information regarding the status.
   * Will be NONE for ACTIVE or PENDING_REOPEN, COMPLETELY or ONLY_ACCEPTING_INCOMING for BLOCKED
   * and REDEMPTION_INVOLUNTARY, REDEMPTION_VOLUNTARY or PERMANENT for CANCELLED.
   */
  public String getSubStatus() {
    return this.subStatus;
  }

  public void setSubStatus(String subStatus) {
    this.subStatus = subStatus;
  }

  /**
   * The reason for voluntarily cancelling (closing) the MonetaryAccountBank, can only be OTHER.
   */
  public String getReason() {
    return this.reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * The optional free-form reason for voluntarily cancelling (closing) the MonetaryAccountBank.
   * Can be any user provided message.
   */
  public String getReasonDescription() {
    return this.reasonDescription;
  }

  public void setReasonDescription(String reasonDescription) {
    this.reasonDescription = reasonDescription;
  }

  /**
   * The id of the User who owns the MonetaryAccountLight.
   */
  public Integer getUserId() {
    return this.userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * The maximum balance Amount of the MonetaryAccountLight.
   */
  public Amount getBalanceMaximum() {
    return this.balanceMaximum;
  }

  public void setBalanceMaximum(Amount balanceMaximum) {
    this.balanceMaximum = balanceMaximum;
  }

  /**
   * The amount of the monthly budget used.
   */
  public Amount getBudgetMonthUsed() {
    return this.budgetMonthUsed;
  }

  public void setBudgetMonthUsed(Amount budgetMonthUsed) {
    this.budgetMonthUsed = budgetMonthUsed;
  }

  /**
   * The total amount of the monthly budget.
   */
  public Amount getBudgetMonthMaximum() {
    return this.budgetMonthMaximum;
  }

  public void setBudgetMonthMaximum(Amount budgetMonthMaximum) {
    this.budgetMonthMaximum = budgetMonthMaximum;
  }

  /**
   * The amount of the yearly budget used.
   */
  public Amount getBudgetYearUsed() {
    return this.budgetYearUsed;
  }

  public void setBudgetYearUsed(Amount budgetYearUsed) {
    this.budgetYearUsed = budgetYearUsed;
  }

  /**
   * The total amount of the yearly budget.
   */
  public Amount getBudgetYearMaximum() {
    return this.budgetYearMaximum;
  }

  public void setBudgetYearMaximum(Amount budgetYearMaximum) {
    this.budgetYearMaximum = budgetYearMaximum;
  }

  /**
   * The amount of the yearly withdrawal budget used.
   */
  public Amount getBudgetWithdrawalYearUsed() {
    return this.budgetWithdrawalYearUsed;
  }

  public void setBudgetWithdrawalYearUsed(Amount budgetWithdrawalYearUsed) {
    this.budgetWithdrawalYearUsed = budgetWithdrawalYearUsed;
  }

  /**
   * The total amount of the yearly withdrawal budget.
   */
  public Amount getBudgetWithdrawalYearMaximum() {
    return this.budgetWithdrawalYearMaximum;
  }

  public void setBudgetWithdrawalYearMaximum(Amount budgetWithdrawalYearMaximum) {
    this.budgetWithdrawalYearMaximum = budgetWithdrawalYearMaximum;
  }

  /**
   * The types of notifications that will result in a push notification or URL callback for this
   * MonetaryAccountLight.
   */
  public List<NotificationFilter> getNotificationFilters() {
    return this.notificationFilters;
  }

  public void setNotificationFilters(List<NotificationFilter> notificationFilters) {
    this.notificationFilters = notificationFilters;
  }

  /**
   * The settings of the MonetaryAccountLight.
   */
  public MonetaryAccountSetting getSetting() {
    return this.setting;
  }

  public void setSetting(MonetaryAccountSetting setting) {
    this.setting = setting;
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

    if (this.dailySpent != null) {
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

    if (this.userId != null) {
      return false;
    }

    if (this.balanceMaximum != null) {
      return false;
    }

    if (this.budgetMonthUsed != null) {
      return false;
    }

    if (this.budgetMonthMaximum != null) {
      return false;
    }

    if (this.budgetYearUsed != null) {
      return false;
    }

    if (this.budgetYearMaximum != null) {
      return false;
    }

    if (this.budgetWithdrawalYearUsed != null) {
      return false;
    }

    if (this.budgetWithdrawalYearMaximum != null) {
      return false;
    }

    if (this.notificationFilters != null) {
      return false;
    }

    if (this.setting != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MonetaryAccountLight fromJsonReader(JsonReader reader) {
    return fromJsonReader(MonetaryAccountLight.class, reader);
  }

}
