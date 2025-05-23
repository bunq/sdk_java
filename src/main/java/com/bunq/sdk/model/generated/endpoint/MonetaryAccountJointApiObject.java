package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AmountObject;
import com.bunq.sdk.model.generated.object.AvatarObject;
import com.bunq.sdk.model.generated.object.BunqIdObject;
import com.bunq.sdk.model.generated.object.CoOwnerObject;
import com.bunq.sdk.model.generated.object.MonetaryAccountSettingObject;
import com.bunq.sdk.model.generated.object.PointerObject;
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
 * The endpoint for joint monetary accounts.
 */
public class MonetaryAccountJointApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account-joint";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account-joint/%s";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account-joint/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account-joint";

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
  public static final String FIELD_ALL_CO_OWNER = "all_co_owner";
  public static final String FIELD_SETTING = "setting";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "MonetaryAccountJoint";

  /**
   * The id of the MonetaryAccountJoint.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the MonetaryAccountJoint's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the MonetaryAccountJoint's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The Avatar of the MonetaryAccountJoint.
   */
  @Expose
  @SerializedName("avatar")
  private AvatarObject avatar;

  /**
   * The currency of the MonetaryAccountJoint as an ISO 4217 formatted currency code.
   */
  @Expose
  @SerializedName("currency")
  private String currency;

  /**
   * The description of the MonetaryAccountJoint. Defaults to 'bunq account'.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The daily spending limit Amount of the MonetaryAccountJoint. Defaults to 1000 EUR. Currency
   * must match the MonetaryAccountJoint's currency. Limited to 10000 EUR.
   */
  @Expose
  @SerializedName("daily_limit")
  private AmountObject dailyLimit;

  /**
   * The maximum Amount the MonetaryAccountJoint can be 'in the red'.
   */
  @Expose
  @SerializedName("overdraft_limit")
  private AmountObject overdraftLimit;

  /**
   * The current available balance amount of the MonetaryAccount.
   */
  @Expose
  @SerializedName("balance")
  private AmountObject balance;

  /**
   * The aliases for the MonetaryAccount.
   */
  @Expose
  @SerializedName("alias")
  private List<PointerObject> alias;

  /**
   * The MonetaryAccountJoint's public UUID.
   */
  @Expose
  @SerializedName("public_uuid")
  private String publicUuid;

  /**
   * The status of the MonetaryAccountJoint. Can be: ACTIVE, BLOCKED, CANCELLED or PENDING_REOPEN
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The sub-status of the MonetaryAccountJoint providing extra information regarding the status.
   * Will be NONE for ACTIVE or PENDING_REOPEN, COMPLETELY or ONLY_ACCEPTING_INCOMING for BLOCKED
   * and REDEMPTION_INVOLUNTARY, REDEMPTION_VOLUNTARY or PERMANENT for CANCELLED.
   */
  @Expose
  @SerializedName("sub_status")
  private String subStatus;

  /**
   * The reason for voluntarily cancelling (closing) the MonetaryAccount.
   */
  @Expose
  @SerializedName("reason")
  private String reason;

  /**
   * The optional free-form reason for voluntarily cancelling (closing) the MonetaryAccount. Can
   * be any user provided message.
   */
  @Expose
  @SerializedName("reason_description")
  private String reasonDescription;

  /**
   * The ShareInviteBankResponse when the MonetaryAccount is accessed by the User via a
   * share/connect.
   */
  @Expose
  @SerializedName("share")
  private ShareInviteMonetaryAccountResponseApiObject share;

  /**
   * The RelationUser when the MonetaryAccount is accessed by the User via a share/connect.
   */
  @Expose
  @SerializedName("relation_user")
  private RelationUserApiObject relationUser;

  /**
   * The users the account will be joint with.
   */
  @Expose
  @SerializedName("all_co_owner")
  private List<CoOwnerObject> allCoOwner;

  /**
   * The id of the User who owns the MonetaryAccountJoint.
   */
  @Expose
  @SerializedName("user_id")
  private Integer userId;

  /**
   * The profiles of the account.
   */
  @Expose
  @SerializedName("monetary_account_profile")
  private MonetaryAccountProfileApiObject monetaryAccountProfile;

  /**
   * The settings of the MonetaryAccount.
   */
  @Expose
  @SerializedName("setting")
  private MonetaryAccountSettingObject setting;

  /**
   * The ids of the AutoSave.
   */
  @Expose
  @SerializedName("all_auto_save_id")
  private List<BunqIdObject> allAutoSaveId;

  /**
   * The fulfillments for this MonetaryAccount.
   */
  @Expose
  @SerializedName("fulfillments")
  private List<FulfillmentApiObject> fulfillments;

  /**
   * The CoOwnerInvite when the MonetaryAccount is accessed by the User via a CoOwnerInvite.
   */
  @Expose
  @SerializedName("co_owner_invite")
  private CoOwnerInviteResponseApiObject coOwnerInvite;

  /**
   * The budgets of the MonetaryAccount.
   */
  @Expose
  @SerializedName("budget")
  private List<MonetaryAccountBudgetApiObject> budget;

  /**
   * The open banking account for information about the external account.
   */
  @Expose
  @SerializedName("open_banking_account")
  private OpenBankingAccountApiObject openBankingAccount;

  /**
   * The Birdee investment portfolio.
   */
  @Expose
  @SerializedName("birdee_investment_portfolio")
  private BirdeeInvestmentPortfolioApiObject birdeeInvestmentPortfolio;

  /**
   * The access of this Monetary Account.
   */
  @Expose
  @SerializedName("all_access")
  private List<MonetaryAccountAccessApiObject> allAccess;

  /**
   * The currency of the MonetaryAccountJoint as an ISO 4217 formatted currency code.
   */
  @Expose
  @SerializedName("currency_field_for_request")
  private String currencyFieldForRequest;

  /**
   * The description of the MonetaryAccountJoint. Defaults to 'bunq account'.
   */
  @Expose
  @SerializedName("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The daily spending limit Amount of the MonetaryAccountJoint. Defaults to 1000 EUR. Currency
   * must match the MonetaryAccountJoint's currency. Limited to 10000 EUR.
   */
  @Expose
  @SerializedName("daily_limit_field_for_request")
  private AmountObject dailyLimitFieldForRequest;

  /**
   * The maximum Amount the MonetaryAccountJoint can be 'in the red'. Must be 0 EUR or omitted.
   */
  @Expose
  @SerializedName("overdraft_limit_field_for_request")
  private AmountObject overdraftLimitFieldForRequest;

  /**
   * The Aliases to add to MonetaryAccountJoint. Must all be confirmed first. Can mostly be
   * ignored.
   */
  @Expose
  @SerializedName("alias_field_for_request")
  private List<PointerObject> aliasFieldForRequest;

  /**
   * The UUID of the Avatar of the MonetaryAccountJoint.
   */
  @Expose
  @SerializedName("avatar_uuid_field_for_request")
  private String avatarUuidFieldForRequest;

  /**
   * The status of the MonetaryAccountJoint. Ignored in POST requests (always set to ACTIVE) can
   * be CANCELLED or PENDING_REOPEN in PUT requests to cancel (close) or reopen the
   * MonetaryAccountJoint. When updating the status and/or sub_status no other fields can be
   * updated in the same request (and vice versa).
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The sub-status of the MonetaryAccountJoint providing extra information regarding the status.
   * Should be ignored for POST requests. In case of PUT requests with status CANCELLED it can
   * only be REDEMPTION_VOLUNTARY, while with status PENDING_REOPEN it can only be NONE. When
   * updating the status and/or sub_status no other fields can be updated in the same request (and
   * vice versa).
   */
  @Expose
  @SerializedName("sub_status_field_for_request")
  private String subStatusFieldForRequest;

  /**
   * The reason for voluntarily cancelling (closing) the MonetaryAccountJoint, can only be OTHER.
   * Should only be specified if updating the status to CANCELLED.
   */
  @Expose
  @SerializedName("reason_field_for_request")
  private String reasonFieldForRequest;

  /**
   * The optional free-form reason for voluntarily cancelling (closing) the MonetaryAccountJoint.
   * Can be any user provided message. Should only be specified if updating the status to
   * CANCELLED.
   */
  @Expose
  @SerializedName("reason_description_field_for_request")
  private String reasonDescriptionFieldForRequest;

  /**
   * The users the account will be joint with.
   */
  @Expose
  @SerializedName("all_co_owner_field_for_request")
  private List<CoOwnerObject> allCoOwnerFieldForRequest;

  /**
   * The settings of the MonetaryAccountJoint.
   */
  @Expose
  @SerializedName("setting_field_for_request")
  private MonetaryAccountSettingObject settingFieldForRequest;

  public MonetaryAccountJointApiObject() {
  this(null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public MonetaryAccountJointApiObject(String currency) {
  this(currency, null, null, null, null, null, null, null, null, null, null, null);
  }

  public MonetaryAccountJointApiObject(String currency, List<CoOwnerObject> allCoOwner) {
  this(currency, allCoOwner, null, null, null, null, null, null, null, null, null, null);
  }

  public MonetaryAccountJointApiObject(String currency, List<CoOwnerObject> allCoOwner, String description) {
  this(currency, allCoOwner, description, null, null, null, null, null, null, null, null, null);
  }

  public MonetaryAccountJointApiObject(String currency, List<CoOwnerObject> allCoOwner, String description, AmountObject dailyLimit) {
  this(currency, allCoOwner, description, dailyLimit, null, null, null, null, null, null, null, null);
  }

  public MonetaryAccountJointApiObject(String currency, List<CoOwnerObject> allCoOwner, String description, AmountObject dailyLimit, AmountObject overdraftLimit) {
  this(currency, allCoOwner, description, dailyLimit, overdraftLimit, null, null, null, null, null, null, null);
  }

  public MonetaryAccountJointApiObject(String currency, List<CoOwnerObject> allCoOwner, String description, AmountObject dailyLimit, AmountObject overdraftLimit, List<PointerObject> alias) {
  this(currency, allCoOwner, description, dailyLimit, overdraftLimit, alias, null, null, null, null, null, null);
  }

  public MonetaryAccountJointApiObject(String currency, List<CoOwnerObject> allCoOwner, String description, AmountObject dailyLimit, AmountObject overdraftLimit, List<PointerObject> alias, String avatarUuid) {
  this(currency, allCoOwner, description, dailyLimit, overdraftLimit, alias, avatarUuid, null, null, null, null, null);
  }

  public MonetaryAccountJointApiObject(String currency, List<CoOwnerObject> allCoOwner, String description, AmountObject dailyLimit, AmountObject overdraftLimit, List<PointerObject> alias, String avatarUuid, String status) {
  this(currency, allCoOwner, description, dailyLimit, overdraftLimit, alias, avatarUuid, status, null, null, null, null);
  }

  public MonetaryAccountJointApiObject(String currency, List<CoOwnerObject> allCoOwner, String description, AmountObject dailyLimit, AmountObject overdraftLimit, List<PointerObject> alias, String avatarUuid, String status, String subStatus) {
  this(currency, allCoOwner, description, dailyLimit, overdraftLimit, alias, avatarUuid, status, subStatus, null, null, null);
  }

  public MonetaryAccountJointApiObject(String currency, List<CoOwnerObject> allCoOwner, String description, AmountObject dailyLimit, AmountObject overdraftLimit, List<PointerObject> alias, String avatarUuid, String status, String subStatus, String reason) {
  this(currency, allCoOwner, description, dailyLimit, overdraftLimit, alias, avatarUuid, status, subStatus, reason, null, null);
  }

  public MonetaryAccountJointApiObject(String currency, List<CoOwnerObject> allCoOwner, String description, AmountObject dailyLimit, AmountObject overdraftLimit, List<PointerObject> alias, String avatarUuid, String status, String subStatus, String reason, String reasonDescription) {
  this(currency, allCoOwner, description, dailyLimit, overdraftLimit, alias, avatarUuid, status, subStatus, reason, reasonDescription, null);
  }

  public MonetaryAccountJointApiObject(String currency, List<CoOwnerObject> allCoOwner, String description, AmountObject dailyLimit, AmountObject overdraftLimit, List<PointerObject> alias, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, MonetaryAccountSettingObject setting) {
    this.currencyFieldForRequest = currency;
    this.descriptionFieldForRequest = description;
    this.dailyLimitFieldForRequest = dailyLimit;
    this.overdraftLimitFieldForRequest = overdraftLimit;
    this.aliasFieldForRequest = alias;
    this.avatarUuidFieldForRequest = avatarUuid;
    this.statusFieldForRequest = status;
    this.subStatusFieldForRequest = subStatus;
    this.reasonFieldForRequest = reason;
    this.reasonDescriptionFieldForRequest = reasonDescription;
    this.allCoOwnerFieldForRequest = allCoOwner;
    this.settingFieldForRequest = setting;
  }  /**
   * @param currency The currency of the MonetaryAccountJoint as an ISO 4217 formatted currency
   * code.
   * @param allCoOwner The users the account will be joint with.
   * @param description The description of the MonetaryAccountJoint. Defaults to 'bunq account'.
   * @param dailyLimit The daily spending limit Amount of the MonetaryAccountJoint. Defaults to
   * 1000 EUR. Currency must match the MonetaryAccountJoint's currency. Limited to 10000 EUR.
   * @param overdraftLimit The maximum Amount the MonetaryAccountJoint can be 'in the red'. Must
   * be 0 EUR or omitted.
   * @param alias The Aliases to add to MonetaryAccountJoint. Must all be confirmed first. Can
   * mostly be ignored.
   * @param avatarUuid The UUID of the Avatar of the MonetaryAccountJoint.
   * @param status The status of the MonetaryAccountJoint. Ignored in POST requests (always set to
   * ACTIVE) can be CANCELLED or PENDING_REOPEN in PUT requests to cancel (close) or reopen the
   * MonetaryAccountJoint. When updating the status and/or sub_status no other fields can be
   * updated in the same request (and vice versa).
   * @param subStatus The sub-status of the MonetaryAccountJoint providing extra information
   * regarding the status. Should be ignored for POST requests. In case of PUT requests with
   * status CANCELLED it can only be REDEMPTION_VOLUNTARY, while with status PENDING_REOPEN it can
   * only be NONE. When updating the status and/or sub_status no other fields can be updated in
   * the same request (and vice versa).
   * @param reason The reason for voluntarily cancelling (closing) the MonetaryAccountJoint, can
   * only be OTHER. Should only be specified if updating the status to CANCELLED.
   * @param reasonDescription The optional free-form reason for voluntarily cancelling (closing)
   * the MonetaryAccountJoint. Can be any user provided message. Should only be specified if
   * updating the status to CANCELLED.
   * @param setting The settings of the MonetaryAccountJoint.
   */
  public static BunqResponse<Integer> create(String currency, List<CoOwnerObject> allCoOwner, String description, AmountObject dailyLimit, AmountObject overdraftLimit, List<PointerObject> alias, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, MonetaryAccountSettingObject setting, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

  HashMap<String, Object> requestMap = new HashMap<>();
requestMap.put(FIELD_CURRENCY, currency);
requestMap.put(FIELD_DESCRIPTION, description);
requestMap.put(FIELD_DAILY_LIMIT, dailyLimit);
requestMap.put(FIELD_OVERDRAFT_LIMIT, overdraftLimit);
requestMap.put(FIELD_ALIAS, alias);
requestMap.put(FIELD_AVATAR_UUID, avatarUuid);
requestMap.put(FIELD_STATUS, status);
requestMap.put(FIELD_SUB_STATUS, subStatus);
requestMap.put(FIELD_REASON, reason);
requestMap.put(FIELD_REASON_DESCRIPTION, reasonDescription);
requestMap.put(FIELD_ALL_CO_OWNER, allCoOwner);
requestMap.put(FIELD_SETTING, setting);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId()), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String currency) {
    return create(currency, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String currency, List<CoOwnerObject> allCoOwner) {
    return create(currency, allCoOwner, null, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String currency, List<CoOwnerObject> allCoOwner, String description) {
    return create(currency, allCoOwner, description, null, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String currency, List<CoOwnerObject> allCoOwner, String description, AmountObject dailyLimit) {
    return create(currency, allCoOwner, description, dailyLimit, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String currency, List<CoOwnerObject> allCoOwner, String description, AmountObject dailyLimit, AmountObject overdraftLimit) {
    return create(currency, allCoOwner, description, dailyLimit, overdraftLimit, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String currency, List<CoOwnerObject> allCoOwner, String description, AmountObject dailyLimit, AmountObject overdraftLimit, List<PointerObject> alias) {
    return create(currency, allCoOwner, description, dailyLimit, overdraftLimit, alias, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String currency, List<CoOwnerObject> allCoOwner, String description, AmountObject dailyLimit, AmountObject overdraftLimit, List<PointerObject> alias, String avatarUuid) {
    return create(currency, allCoOwner, description, dailyLimit, overdraftLimit, alias, avatarUuid, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String currency, List<CoOwnerObject> allCoOwner, String description, AmountObject dailyLimit, AmountObject overdraftLimit, List<PointerObject> alias, String avatarUuid, String status) {
    return create(currency, allCoOwner, description, dailyLimit, overdraftLimit, alias, avatarUuid, status, null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String currency, List<CoOwnerObject> allCoOwner, String description, AmountObject dailyLimit, AmountObject overdraftLimit, List<PointerObject> alias, String avatarUuid, String status, String subStatus) {
    return create(currency, allCoOwner, description, dailyLimit, overdraftLimit, alias, avatarUuid, status, subStatus, null, null, null, null);
  }

  public static BunqResponse<Integer> create(String currency, List<CoOwnerObject> allCoOwner, String description, AmountObject dailyLimit, AmountObject overdraftLimit, List<PointerObject> alias, String avatarUuid, String status, String subStatus, String reason) {
    return create(currency, allCoOwner, description, dailyLimit, overdraftLimit, alias, avatarUuid, status, subStatus, reason, null, null, null);
  }

  public static BunqResponse<Integer> create(String currency, List<CoOwnerObject> allCoOwner, String description, AmountObject dailyLimit, AmountObject overdraftLimit, List<PointerObject> alias, String avatarUuid, String status, String subStatus, String reason, String reasonDescription) {
    return create(currency, allCoOwner, description, dailyLimit, overdraftLimit, alias, avatarUuid, status, subStatus, reason, reasonDescription, null, null);
  }

  public static BunqResponse<Integer> create(String currency, List<CoOwnerObject> allCoOwner, String description, AmountObject dailyLimit, AmountObject overdraftLimit, List<PointerObject> alias, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, MonetaryAccountSettingObject setting) {
    return create(currency, allCoOwner, description, dailyLimit, overdraftLimit, alias, avatarUuid, status, subStatus, reason, reasonDescription, setting, null);
  }

  /**
   */
  public static BunqResponse<MonetaryAccountJointApiObject> get(Integer monetaryAccountJointId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), monetaryAccountJointId), params, customHeaders);

    return fromJson(MonetaryAccountJointApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<MonetaryAccountJointApiObject> get() {
    return get(null, null, null);
  }

  public static BunqResponse<MonetaryAccountJointApiObject> get(Integer monetaryAccountJointId) {
    return get(monetaryAccountJointId, null, null);
  }

  public static BunqResponse<MonetaryAccountJointApiObject> get(Integer monetaryAccountJointId, Map<String, String> params) {
    return get(monetaryAccountJointId, params, null);
  }

  /**
   * @param description The description of the MonetaryAccountJoint. Defaults to 'bunq account'.
   * @param dailyLimit The daily spending limit Amount of the MonetaryAccountJoint. Defaults to
   * 1000 EUR. Currency must match the MonetaryAccountJoint's currency. Limited to 10000 EUR.
   * @param avatarUuid The UUID of the Avatar of the MonetaryAccountJoint.
   * @param status The status of the MonetaryAccountJoint. Ignored in POST requests (always set to
   * ACTIVE) can be CANCELLED or PENDING_REOPEN in PUT requests to cancel (close) or reopen the
   * MonetaryAccountJoint. When updating the status and/or sub_status no other fields can be
   * updated in the same request (and vice versa).
   * @param subStatus The sub-status of the MonetaryAccountJoint providing extra information
   * regarding the status. Should be ignored for POST requests. In case of PUT requests with
   * status CANCELLED it can only be REDEMPTION_VOLUNTARY, while with status PENDING_REOPEN it can
   * only be NONE. When updating the status and/or sub_status no other fields can be updated in
   * the same request (and vice versa).
   * @param reason The reason for voluntarily cancelling (closing) the MonetaryAccountJoint, can
   * only be OTHER. Should only be specified if updating the status to CANCELLED.
   * @param reasonDescription The optional free-form reason for voluntarily cancelling (closing)
   * the MonetaryAccountJoint. Can be any user provided message. Should only be specified if
   * updating the status to CANCELLED.
   * @param setting The settings of the MonetaryAccountJoint.
   */
  public static BunqResponse<Integer> update(Integer monetaryAccountJointId, String description, AmountObject dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, MonetaryAccountSettingObject setting, Map<String, String> customHeaders) {
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

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), monetaryAccountJointId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer monetaryAccountJointId) {
    return update(monetaryAccountJointId, null, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer monetaryAccountJointId, String description) {
    return update(monetaryAccountJointId, description, null, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer monetaryAccountJointId, String description, AmountObject dailyLimit) {
    return update(monetaryAccountJointId, description, dailyLimit, null, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer monetaryAccountJointId, String description, AmountObject dailyLimit, String avatarUuid) {
    return update(monetaryAccountJointId, description, dailyLimit, avatarUuid, null, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer monetaryAccountJointId, String description, AmountObject dailyLimit, String avatarUuid, String status) {
    return update(monetaryAccountJointId, description, dailyLimit, avatarUuid, status, null, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer monetaryAccountJointId, String description, AmountObject dailyLimit, String avatarUuid, String status, String subStatus) {
    return update(monetaryAccountJointId, description, dailyLimit, avatarUuid, status, subStatus, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer monetaryAccountJointId, String description, AmountObject dailyLimit, String avatarUuid, String status, String subStatus, String reason) {
    return update(monetaryAccountJointId, description, dailyLimit, avatarUuid, status, subStatus, reason, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer monetaryAccountJointId, String description, AmountObject dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription) {
    return update(monetaryAccountJointId, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, null, null);
  }

  public static BunqResponse<Integer> update(Integer monetaryAccountJointId, String description, AmountObject dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, MonetaryAccountSettingObject setting) {
    return update(monetaryAccountJointId, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, setting, null);
  }

  /**
   */
  public static BunqResponse<List<MonetaryAccountJointApiObject>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(MonetaryAccountJointApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<MonetaryAccountJointApiObject>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<MonetaryAccountJointApiObject>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The id of the MonetaryAccountJoint.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the MonetaryAccountJoint's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the MonetaryAccountJoint's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The Avatar of the MonetaryAccountJoint.
   */
  public AvatarObject getAvatar() {
    return this.avatar;
  }

  public void setAvatar(AvatarObject avatar) {
    this.avatar = avatar;
  }

  /**
   * The currency of the MonetaryAccountJoint as an ISO 4217 formatted currency code.
   */
  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * The description of the MonetaryAccountJoint. Defaults to 'bunq account'.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The daily spending limit Amount of the MonetaryAccountJoint. Defaults to 1000 EUR. Currency
   * must match the MonetaryAccountJoint's currency. Limited to 10000 EUR.
   */
  public AmountObject getDailyLimit() {
    return this.dailyLimit;
  }

  public void setDailyLimit(AmountObject dailyLimit) {
    this.dailyLimit = dailyLimit;
  }

  /**
   * The maximum Amount the MonetaryAccountJoint can be 'in the red'.
   */
  public AmountObject getOverdraftLimit() {
    return this.overdraftLimit;
  }

  public void setOverdraftLimit(AmountObject overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
  }

  /**
   * The current available balance amount of the MonetaryAccount.
   */
  public AmountObject getBalance() {
    return this.balance;
  }

  public void setBalance(AmountObject balance) {
    this.balance = balance;
  }

  /**
   * The aliases for the MonetaryAccount.
   */
  public List<PointerObject> getAlias() {
    return this.alias;
  }

  public void setAlias(List<PointerObject> alias) {
    this.alias = alias;
  }

  /**
   * The MonetaryAccountJoint's public UUID.
   */
  public String getPublicUuid() {
    return this.publicUuid;
  }

  public void setPublicUuid(String publicUuid) {
    this.publicUuid = publicUuid;
  }

  /**
   * The status of the MonetaryAccountJoint. Can be: ACTIVE, BLOCKED, CANCELLED or PENDING_REOPEN
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The sub-status of the MonetaryAccountJoint providing extra information regarding the status.
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
   * The reason for voluntarily cancelling (closing) the MonetaryAccount.
   */
  public String getReason() {
    return this.reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * The optional free-form reason for voluntarily cancelling (closing) the MonetaryAccount. Can
   * be any user provided message.
   */
  public String getReasonDescription() {
    return this.reasonDescription;
  }

  public void setReasonDescription(String reasonDescription) {
    this.reasonDescription = reasonDescription;
  }

  /**
   * The ShareInviteBankResponse when the MonetaryAccount is accessed by the User via a
   * share/connect.
   */
  public ShareInviteMonetaryAccountResponseApiObject getShare() {
    return this.share;
  }

  public void setShare(ShareInviteMonetaryAccountResponseApiObject share) {
    this.share = share;
  }

  /**
   * The RelationUser when the MonetaryAccount is accessed by the User via a share/connect.
   */
  public RelationUserApiObject getRelationUser() {
    return this.relationUser;
  }

  public void setRelationUser(RelationUserApiObject relationUser) {
    this.relationUser = relationUser;
  }

  /**
   * The users the account will be joint with.
   */
  public List<CoOwnerObject> getAllCoOwner() {
    return this.allCoOwner;
  }

  public void setAllCoOwner(List<CoOwnerObject> allCoOwner) {
    this.allCoOwner = allCoOwner;
  }

  /**
   * The id of the User who owns the MonetaryAccountJoint.
   */
  public Integer getUserId() {
    return this.userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * The profiles of the account.
   */
  public MonetaryAccountProfileApiObject getMonetaryAccountProfile() {
    return this.monetaryAccountProfile;
  }

  public void setMonetaryAccountProfile(MonetaryAccountProfileApiObject monetaryAccountProfile) {
    this.monetaryAccountProfile = monetaryAccountProfile;
  }

  /**
   * The settings of the MonetaryAccount.
   */
  public MonetaryAccountSettingObject getSetting() {
    return this.setting;
  }

  public void setSetting(MonetaryAccountSettingObject setting) {
    this.setting = setting;
  }

  /**
   * The ids of the AutoSave.
   */
  public List<BunqIdObject> getAllAutoSaveId() {
    return this.allAutoSaveId;
  }

  public void setAllAutoSaveId(List<BunqIdObject> allAutoSaveId) {
    this.allAutoSaveId = allAutoSaveId;
  }

  /**
   * The fulfillments for this MonetaryAccount.
   */
  public List<FulfillmentApiObject> getFulfillments() {
    return this.fulfillments;
  }

  public void setFulfillments(List<FulfillmentApiObject> fulfillments) {
    this.fulfillments = fulfillments;
  }

  /**
   * The CoOwnerInvite when the MonetaryAccount is accessed by the User via a CoOwnerInvite.
   */
  public CoOwnerInviteResponseApiObject getCoOwnerInvite() {
    return this.coOwnerInvite;
  }

  public void setCoOwnerInvite(CoOwnerInviteResponseApiObject coOwnerInvite) {
    this.coOwnerInvite = coOwnerInvite;
  }

  /**
   * The budgets of the MonetaryAccount.
   */
  public List<MonetaryAccountBudgetApiObject> getBudget() {
    return this.budget;
  }

  public void setBudget(List<MonetaryAccountBudgetApiObject> budget) {
    this.budget = budget;
  }

  /**
   * The open banking account for information about the external account.
   */
  public OpenBankingAccountApiObject getOpenBankingAccount() {
    return this.openBankingAccount;
  }

  public void setOpenBankingAccount(OpenBankingAccountApiObject openBankingAccount) {
    this.openBankingAccount = openBankingAccount;
  }

  /**
   * The Birdee investment portfolio.
   */
  public BirdeeInvestmentPortfolioApiObject getBirdeeInvestmentPortfolio() {
    return this.birdeeInvestmentPortfolio;
  }

  public void setBirdeeInvestmentPortfolio(BirdeeInvestmentPortfolioApiObject birdeeInvestmentPortfolio) {
    this.birdeeInvestmentPortfolio = birdeeInvestmentPortfolio;
  }

  /**
   * The access of this Monetary Account.
   */
  public List<MonetaryAccountAccessApiObject> getAllAccess() {
    return this.allAccess;
  }

  public void setAllAccess(List<MonetaryAccountAccessApiObject> allAccess) {
    this.allAccess = allAccess;
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

    if (this.share != null) {
      return false;
    }

    if (this.relationUser != null) {
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

    if (this.allAutoSaveId != null) {
      return false;
    }

    if (this.fulfillments != null) {
      return false;
    }

    if (this.coOwnerInvite != null) {
      return false;
    }

    if (this.budget != null) {
      return false;
    }

    if (this.openBankingAccount != null) {
      return false;
    }

    if (this.birdeeInvestmentPortfolio != null) {
      return false;
    }

    if (this.allAccess != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MonetaryAccountJointApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(MonetaryAccountJointApiObject.class, reader);
  }

}
