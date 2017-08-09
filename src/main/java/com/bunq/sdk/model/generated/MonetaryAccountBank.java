package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Avatar;
import com.bunq.sdk.model.generated.object.MonetaryAccountSetting;
import com.bunq.sdk.model.generated.object.NotificationFilter;
import com.bunq.sdk.model.generated.object.Pointer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * With MonetaryAccountBank you can create a new bank account, retrieve information regarding
 * your existing MonetaryAccountBanks and update specific fields of an existing
 * MonetaryAccountBank. Examples of fields that can be updated are the description, the daily
 * limit and the avatar of the account.<br/><br/>Notification filters can be set on a monetary
 * account level to receive callbacks. For more information check the <a
 * href="/api/2/page/callbacks">dedicated callbacks page</a>.
 */
public class MonetaryAccountBank extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_CURRENCY = "currency";
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_DAILY_LIMIT = "daily_limit";
  public static final String FIELD_OVERDRAFT_LIMIT = "overdraft_limit";
  public static final String FIELD_ALIAS = "alias";
  public static final String FIELD_AVATAR_UUID = "avatar_uuid";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_SUB_STATUS = "sub_status";
  public static final String FIELD_REASON = "reason";
  public static final String FIELD_REASON_DESCRIPTION = "reason_description";
  public static final String FIELD_SHARE = "share";
  public static final String FIELD_NOTIFICATION_FILTERS = "notification_filters";
  public static final String FIELD_SETTING = "setting";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account-bank";
  private static final String ENDPOINT_URL_READ = "user/%s/monetary-account-bank/%s";
  private static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account-bank/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account-bank";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "MonetaryAccountBank";

  /**
   * The id of the MonetaryAccountBank.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the MonetaryAccountBank's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the MonetaryAccountBank's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The Avatar of the MonetaryAccountBank.
   */
  @Expose
  @SerializedName("avatar")
  private Avatar avatar;

  /**
   * The currency of the MonetaryAccountBank as an ISO 4217 formatted currency code.
   */
  @Expose
  @SerializedName("currency")
  private String currency;

  /**
   * The description of the MonetaryAccountBank. Defaults to 'bunq account'.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The daily spending limit Amount of the MonetaryAccountBank. Defaults to 1000 EUR. Currency
   * must match the MonetaryAccountBank's currency. Limited to 10000 EUR.
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
   * The maximum Amount the MonetaryAccountBank can be 'in the red'.
   */
  @Expose
  @SerializedName("overdraft_limit")
  private Amount overdraftLimit;

  /**
   * The current balance Amount of the MonetaryAccountBank.
   */
  @Expose
  @SerializedName("balance")
  private Amount balance;

  /**
   * The Aliases for the MonetaryAccountBank.
   */
  @Expose
  @SerializedName("alias")
  private List<Pointer> alias;

  /**
   * The MonetaryAccountBank's public UUID.
   */
  @Expose
  @SerializedName("public_uuid")
  private String publicUuid;

  /**
   * The status of the MonetaryAccountBank. Can be: ACTIVE, BLOCKED, CANCELLED or PENDING_REOPEN
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The sub-status of the MonetaryAccountBank providing extra information regarding the status.
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
   * The id of the User who owns the MonetaryAccountBank.
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
   * The types of notifications that will result in a push notification or URL callback for this
   * MonetaryAccountBank.
   */
  @Expose
  @SerializedName("notification_filters")
  private List<NotificationFilter> notificationFilters;

  /**
   * The settings of the MonetaryAccountBank.
   */
  @Expose
  @SerializedName("setting")
  private MonetaryAccountSetting setting;

  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId) {
    return create(apiContext, requestMap, userId, new HashMap<>());
  }

  /**
   * Create new MonetaryAccountBank.
   */
  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient
        .post(String.format(ENDPOINT_URL_CREATE, userId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<MonetaryAccountBank> get(ApiContext apiContext, Integer userId,
      Integer monetaryAccountBankId) {
    return get(apiContext, userId, monetaryAccountBankId, new HashMap<>());
  }

  /**
   * Get a specific MonetaryAccountBank.
   */
  public static BunqResponse<MonetaryAccountBank> get(ApiContext apiContext, Integer userId,
      Integer monetaryAccountBankId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_READ, userId, monetaryAccountBankId), customHeaders);

    return fromJson(MonetaryAccountBank.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer monetaryAccountBankId) {
    return update(apiContext, requestMap, userId, monetaryAccountBankId, new HashMap<>());
  }

  /**
   * Update a specific existing MonetaryAccountBank.
   */
  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap,
      Integer userId, Integer monetaryAccountBankId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient
        .put(String.format(ENDPOINT_URL_UPDATE, userId, monetaryAccountBankId), requestBytes,
            customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<List<MonetaryAccountBank>> list(ApiContext apiContext,
      Integer userId) {
    return list(apiContext, userId, new HashMap<>());
  }

  /**
   * Gets a listing of all MonetaryAccountBanks of a given user.
   */
  public static BunqResponse<List<MonetaryAccountBank>> list(ApiContext apiContext, Integer userId,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_LISTING, userId), customHeaders);

    return fromJsonList(MonetaryAccountBank.class, responseRaw, OBJECT_TYPE);
  }

  /**
   * The id of the MonetaryAccountBank.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the MonetaryAccountBank's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the MonetaryAccountBank's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The Avatar of the MonetaryAccountBank.
   */
  public Avatar getAvatar() {
    return this.avatar;
  }

  public void setAvatar(Avatar avatar) {
    this.avatar = avatar;
  }

  /**
   * The currency of the MonetaryAccountBank as an ISO 4217 formatted currency code.
   */
  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * The description of the MonetaryAccountBank. Defaults to 'bunq account'.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The daily spending limit Amount of the MonetaryAccountBank. Defaults to 1000 EUR. Currency
   * must match the MonetaryAccountBank's currency. Limited to 10000 EUR.
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
   * The maximum Amount the MonetaryAccountBank can be 'in the red'.
   */
  public Amount getOverdraftLimit() {
    return this.overdraftLimit;
  }

  public void setOverdraftLimit(Amount overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
  }

  /**
   * The current balance Amount of the MonetaryAccountBank.
   */
  public Amount getBalance() {
    return this.balance;
  }

  public void setBalance(Amount balance) {
    this.balance = balance;
  }

  /**
   * The Aliases for the MonetaryAccountBank.
   */
  public List<Pointer> getAlias() {
    return this.alias;
  }

  public void setAlias(List<Pointer> alias) {
    this.alias = alias;
  }

  /**
   * The MonetaryAccountBank's public UUID.
   */
  public String getPublicUuid() {
    return this.publicUuid;
  }

  public void setPublicUuid(String publicUuid) {
    this.publicUuid = publicUuid;
  }

  /**
   * The status of the MonetaryAccountBank. Can be: ACTIVE, BLOCKED, CANCELLED or PENDING_REOPEN
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The sub-status of the MonetaryAccountBank providing extra information regarding the status.
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
   * The id of the User who owns the MonetaryAccountBank.
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
   * The types of notifications that will result in a push notification or URL callback for this
   * MonetaryAccountBank.
   */
  public List<NotificationFilter> getNotificationFilters() {
    return this.notificationFilters;
  }

  public void setNotificationFilters(List<NotificationFilter> notificationFilters) {
    this.notificationFilters = notificationFilters;
  }

  /**
   * The settings of the MonetaryAccountBank.
   */
  public MonetaryAccountSetting getSetting() {
    return this.setting;
  }

  public void setSetting(MonetaryAccountSetting setting) {
    this.setting = setting;
  }

}
