package com.bunq.sdk.model.generated.endpoint;

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

/**
 * Endpoint for managing investment monetary accounts.
 */
public class MonetaryAccountInvestmentApiObject extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_CURRENCY = "currency";
  public static final String FIELD_PROVIDER = "provider";
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_DAILY_LIMIT = "daily_limit";
  public static final String FIELD_AVATAR_UUID = "avatar_uuid";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_SUB_STATUS = "sub_status";
  public static final String FIELD_REASON = "reason";
  public static final String FIELD_REASON_DESCRIPTION = "reason_description";
  public static final String FIELD_DISPLAY_NAME = "display_name";
  public static final String FIELD_SETTING = "setting";
  public static final String FIELD_BIRDEE_INVESTMENT_PORTFOLIO = "birdee_investment_portfolio";
  public static final String FIELD_MONETARY_ACCOUNT_DEPOSIT_INITIAL_ID = "monetary_account_deposit_initial_id";
  public static final String FIELD_AMOUNT_DEPOSIT_INITIAL = "amount_deposit_initial";

  /**
   * The id of the MonetaryAccountInvestment.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the MonetaryAccountInvestment's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the MonetaryAccountInvestment's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The Avatar of the MonetaryAccountInvestment.
   */
  @Expose
  @SerializedName("avatar")
  private AvatarObject avatar;

  /**
   * The currency of the MonetaryAccountInvestment as an ISO 4217 formatted currency code.
   */
  @Expose
  @SerializedName("currency")
  private String currency;

  /**
   * The description of the MonetaryAccountInvestment. Defaults to 'bunq account'.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The daily spending limit Amount of the MonetaryAccountInvestment. Defaults to 1000 EUR.
   * Currency must match the MonetaryAccountInvestment's currency. Limited to 10000 EUR.
   */
  @Expose
  @SerializedName("daily_limit")
  private AmountObject dailyLimit;

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
   * The MonetaryAccountInvestment's public UUID.
   */
  @Expose
  @SerializedName("public_uuid")
  private String publicUuid;

  /**
   * The status of the MonetaryAccountInvestment. Can be: ACTIVE, BLOCKED, CANCELLED or
   * PENDING_REOPEN
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The sub-status of the MonetaryAccountInvestment providing extra information regarding the
   * status. Will be NONE for ACTIVE or PENDING_REOPEN, COMPLETELY or ONLY_ACCEPTING_INCOMING for
   * BLOCKED and REDEMPTION_INVOLUNTARY, REDEMPTION_VOLUNTARY or PERMANENT for CANCELLED.
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
   * The id of the User who owns the MonetaryAccountInvestment.
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
   * The legal name of the user / company using this monetary account.
   */
  @Expose
  @SerializedName("display_name")
  private String displayName;

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
   * The Birdee investment portfolio.
   */
  @Expose
  @SerializedName("birdee_investment_portfolio")
  private BirdeeInvestmentPortfolioApiObject birdeeInvestmentPortfolio;

  /**
   * The budgets of the MonetaryAccount.
   */
  @Expose
  @SerializedName("budget")
  private List<MonetaryAccountBudgetApiObject> budget;

  /**
   * The users the account will be joint with.
   */
  @Expose
  @SerializedName("all_co_owner")
  private List<CoOwnerObject> allCoOwner;

  /**
   * The CoOwnerInvite when the MonetaryAccount is accessed by the User via a CoOwnerInvite.
   */
  @Expose
  @SerializedName("co_owner_invite")
  private CoOwnerInviteResponseApiObject coOwnerInvite;

  /**
   * The open banking account for information about the external account.
   */
  @Expose
  @SerializedName("open_banking_account")
  private OpenBankingAccountApiObject openBankingAccount;

  /**
   * The access of this Monetary Account.
   */
  @Expose
  @SerializedName("all_access")
  private List<MonetaryAccountAccessApiObject> allAccess;

  /**
   * The currency of the MonetaryAccountInvestment as an ISO 4217 formatted currency code.
   */
  @Expose
  @SerializedName("currency_field_for_request")
  private String currencyFieldForRequest;

  /**
   * The provider of the investment service.
   */
  @Expose
  @SerializedName("provider_field_for_request")
  private String providerFieldForRequest;

  /**
   * The description of the MonetaryAccountInvestment. Defaults to 'bunq account'.
   */
  @Expose
  @SerializedName("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The daily spending limit Amount of the MonetaryAccountInvestment. Defaults to 1000 EUR.
   * Currency must match the MonetaryAccountInvestment's currency. Limited to 10000 EUR.
   */
  @Expose
  @SerializedName("daily_limit_field_for_request")
  private AmountObject dailyLimitFieldForRequest;

  /**
   * The UUID of the Avatar of the MonetaryAccountInvestment.
   */
  @Expose
  @SerializedName("avatar_uuid_field_for_request")
  private String avatarUuidFieldForRequest;

  /**
   * The status of the MonetaryAccountInvestment. Ignored in POST requests (always set to ACTIVE)
   * can be CANCELLED or PENDING_REOPEN in PUT requests to cancel (close) or reopen the
   * MonetaryAccountInvestment. When updating the status and/or sub_status no other fields can be
   * updated in the same request (and vice versa).
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The sub-status of the MonetaryAccountInvestment providing extra information regarding the
   * status. Should be ignored for POST requests. In case of PUT requests with status CANCELLED it
   * can only be REDEMPTION_VOLUNTARY, while with status PENDING_REOPEN it can only be NONE. When
   * updating the status and/or sub_status no other fields can be updated in the same request (and
   * vice versa).
   */
  @Expose
  @SerializedName("sub_status_field_for_request")
  private String subStatusFieldForRequest;

  /**
   * The reason for voluntarily cancelling (closing) the MonetaryAccountInvestment, can only be
   * OTHER. Should only be specified if updating the status to CANCELLED.
   */
  @Expose
  @SerializedName("reason_field_for_request")
  private String reasonFieldForRequest;

  /**
   * The optional free-form reason for voluntarily cancelling (closing) the
   * MonetaryAccountInvestment. Can be any user provided message. Should only be specified if
   * updating the status to CANCELLED.
   */
  @Expose
  @SerializedName("reason_description_field_for_request")
  private String reasonDescriptionFieldForRequest;

  /**
   * The legal name of the user / company using this monetary account.
   */
  @Expose
  @SerializedName("display_name_field_for_request")
  private String displayNameFieldForRequest;

  /**
   * The settings of the MonetaryAccountInvestment.
   */
  @Expose
  @SerializedName("setting_field_for_request")
  private MonetaryAccountSettingObject settingFieldForRequest;

  /**
   * The Birdee investment portfolio.
   */
  @Expose
  @SerializedName("birdee_investment_portfolio_field_for_request")
  private BirdeeInvestmentPortfolioApiObject birdeeInvestmentPortfolioFieldForRequest;

  /**
   * ID of the MA to be used for the initial deposit to the investment account.
   */
  @Expose
  @SerializedName("monetary_account_deposit_initial_id_field_for_request")
  private Integer monetaryAccountDepositInitialIdFieldForRequest;

  /**
   * The amount to be transferred to the investment account as the initial deposit.
   */
  @Expose
  @SerializedName("amount_deposit_initial_field_for_request")
  private AmountObject amountDepositInitialFieldForRequest;

  public MonetaryAccountInvestmentApiObject() {
  this(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public MonetaryAccountInvestmentApiObject(String currency) {
  this(currency, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public MonetaryAccountInvestmentApiObject(String currency, String provider) {
  this(currency, provider, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public MonetaryAccountInvestmentApiObject(String currency, String provider, String description) {
  this(currency, provider, description, null, null, null, null, null, null, null, null, null, null, null);
  }

  public MonetaryAccountInvestmentApiObject(String currency, String provider, String description, AmountObject dailyLimit) {
  this(currency, provider, description, dailyLimit, null, null, null, null, null, null, null, null, null, null);
  }

  public MonetaryAccountInvestmentApiObject(String currency, String provider, String description, AmountObject dailyLimit, String avatarUuid) {
  this(currency, provider, description, dailyLimit, avatarUuid, null, null, null, null, null, null, null, null, null);
  }

  public MonetaryAccountInvestmentApiObject(String currency, String provider, String description, AmountObject dailyLimit, String avatarUuid, String status) {
  this(currency, provider, description, dailyLimit, avatarUuid, status, null, null, null, null, null, null, null, null);
  }

  public MonetaryAccountInvestmentApiObject(String currency, String provider, String description, AmountObject dailyLimit, String avatarUuid, String status, String subStatus) {
  this(currency, provider, description, dailyLimit, avatarUuid, status, subStatus, null, null, null, null, null, null, null);
  }

  public MonetaryAccountInvestmentApiObject(String currency, String provider, String description, AmountObject dailyLimit, String avatarUuid, String status, String subStatus, String reason) {
  this(currency, provider, description, dailyLimit, avatarUuid, status, subStatus, reason, null, null, null, null, null, null);
  }

  public MonetaryAccountInvestmentApiObject(String currency, String provider, String description, AmountObject dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription) {
  this(currency, provider, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, null, null, null, null, null);
  }

  public MonetaryAccountInvestmentApiObject(String currency, String provider, String description, AmountObject dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, String displayName) {
  this(currency, provider, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, displayName, null, null, null, null);
  }

  public MonetaryAccountInvestmentApiObject(String currency, String provider, String description, AmountObject dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, String displayName, MonetaryAccountSettingObject setting) {
  this(currency, provider, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, displayName, setting, null, null, null);
  }

  public MonetaryAccountInvestmentApiObject(String currency, String provider, String description, AmountObject dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, String displayName, MonetaryAccountSettingObject setting, BirdeeInvestmentPortfolioApiObject birdeeInvestmentPortfolio) {
  this(currency, provider, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, displayName, setting, birdeeInvestmentPortfolio, null, null);
  }

  public MonetaryAccountInvestmentApiObject(String currency, String provider, String description, AmountObject dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, String displayName, MonetaryAccountSettingObject setting, BirdeeInvestmentPortfolioApiObject birdeeInvestmentPortfolio, Integer monetaryAccountDepositInitialId) {
  this(currency, provider, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, displayName, setting, birdeeInvestmentPortfolio, monetaryAccountDepositInitialId, null);
  }

  public MonetaryAccountInvestmentApiObject(String currency, String provider, String description, AmountObject dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, String displayName, MonetaryAccountSettingObject setting, BirdeeInvestmentPortfolioApiObject birdeeInvestmentPortfolio, Integer monetaryAccountDepositInitialId, AmountObject amountDepositInitial) {
    this.currencyFieldForRequest = currency;
    this.providerFieldForRequest = provider;
    this.descriptionFieldForRequest = description;
    this.dailyLimitFieldForRequest = dailyLimit;
    this.avatarUuidFieldForRequest = avatarUuid;
    this.statusFieldForRequest = status;
    this.subStatusFieldForRequest = subStatus;
    this.reasonFieldForRequest = reason;
    this.reasonDescriptionFieldForRequest = reasonDescription;
    this.displayNameFieldForRequest = displayName;
    this.settingFieldForRequest = setting;
    this.birdeeInvestmentPortfolioFieldForRequest = birdeeInvestmentPortfolio;
    this.monetaryAccountDepositInitialIdFieldForRequest = monetaryAccountDepositInitialId;
    this.amountDepositInitialFieldForRequest = amountDepositInitial;
  }

  /**
   * The id of the MonetaryAccountInvestment.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the MonetaryAccountInvestment's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the MonetaryAccountInvestment's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The Avatar of the MonetaryAccountInvestment.
   */
  public AvatarObject getAvatar() {
    return this.avatar;
  }

  public void setAvatar(AvatarObject avatar) {
    this.avatar = avatar;
  }

  /**
   * The currency of the MonetaryAccountInvestment as an ISO 4217 formatted currency code.
   */
  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * The description of the MonetaryAccountInvestment. Defaults to 'bunq account'.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The daily spending limit Amount of the MonetaryAccountInvestment. Defaults to 1000 EUR.
   * Currency must match the MonetaryAccountInvestment's currency. Limited to 10000 EUR.
   */
  public AmountObject getDailyLimit() {
    return this.dailyLimit;
  }

  public void setDailyLimit(AmountObject dailyLimit) {
    this.dailyLimit = dailyLimit;
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
   * The MonetaryAccountInvestment's public UUID.
   */
  public String getPublicUuid() {
    return this.publicUuid;
  }

  public void setPublicUuid(String publicUuid) {
    this.publicUuid = publicUuid;
  }

  /**
   * The status of the MonetaryAccountInvestment. Can be: ACTIVE, BLOCKED, CANCELLED or
   * PENDING_REOPEN
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The sub-status of the MonetaryAccountInvestment providing extra information regarding the
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
   * The id of the User who owns the MonetaryAccountInvestment.
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
   * The legal name of the user / company using this monetary account.
   */
  public String getDisplayName() {
    return this.displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
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
   * The Birdee investment portfolio.
   */
  public BirdeeInvestmentPortfolioApiObject getBirdeeInvestmentPortfolio() {
    return this.birdeeInvestmentPortfolio;
  }

  public void setBirdeeInvestmentPortfolio(BirdeeInvestmentPortfolioApiObject birdeeInvestmentPortfolio) {
    this.birdeeInvestmentPortfolio = birdeeInvestmentPortfolio;
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
   * The users the account will be joint with.
   */
  public List<CoOwnerObject> getAllCoOwner() {
    return this.allCoOwner;
  }

  public void setAllCoOwner(List<CoOwnerObject> allCoOwner) {
    this.allCoOwner = allCoOwner;
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
   * The open banking account for information about the external account.
   */
  public OpenBankingAccountApiObject getOpenBankingAccount() {
    return this.openBankingAccount;
  }

  public void setOpenBankingAccount(OpenBankingAccountApiObject openBankingAccount) {
    this.openBankingAccount = openBankingAccount;
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

    if (this.userId != null) {
      return false;
    }

    if (this.monetaryAccountProfile != null) {
      return false;
    }

    if (this.displayName != null) {
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

    if (this.birdeeInvestmentPortfolio != null) {
      return false;
    }

    if (this.budget != null) {
      return false;
    }

    if (this.allCoOwner != null) {
      return false;
    }

    if (this.coOwnerInvite != null) {
      return false;
    }

    if (this.openBankingAccount != null) {
      return false;
    }

    if (this.allAccess != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MonetaryAccountInvestmentApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(MonetaryAccountInvestmentApiObject.class, reader);
  }

}
