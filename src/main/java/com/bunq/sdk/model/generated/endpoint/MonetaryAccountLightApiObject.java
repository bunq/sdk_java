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
 * With MonetaryAccountLight is a monetary account for bunq light users. Through this endpoint
 * you can retrieve information regarding your existing MonetaryAccountLights and update
 * specific fields of an existing MonetaryAccountLight. Examples of fields that can be updated
 * are the description, the daily limit and the avatar of the account.
 */
public class MonetaryAccountLightApiObject extends BunqModel {

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
  public static final String FIELD_SETTING = "setting";

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
  private AvatarObject avatar;

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
   * The id of the User who owns the MonetaryAccountLight.
   */
  @Expose
  @SerializedName("user_id")
  private Integer userId;

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
   * The maximum balance Amount of the MonetaryAccountLight.
   */
  @Expose
  @SerializedName("balance_maximum")
  private AmountObject balanceMaximum;

  /**
   * The amount of the monthly budget used.
   */
  @Expose
  @SerializedName("budget_month_used")
  private AmountObject budgetMonthUsed;

  /**
   * The total amount of the monthly budget.
   */
  @Expose
  @SerializedName("budget_month_maximum")
  private AmountObject budgetMonthMaximum;

  /**
   * The amount of the yearly budget used.
   */
  @Expose
  @SerializedName("budget_year_used")
  private AmountObject budgetYearUsed;

  /**
   * The total amount of the yearly budget.
   */
  @Expose
  @SerializedName("budget_year_maximum")
  private AmountObject budgetYearMaximum;

  /**
   * The amount of the yearly withdrawal budget used.
   */
  @Expose
  @SerializedName("budget_withdrawal_year_used")
  private AmountObject budgetWithdrawalYearUsed;

  /**
   * The total amount of the yearly withdrawal budget.
   */
  @Expose
  @SerializedName("budget_withdrawal_year_maximum")
  private AmountObject budgetWithdrawalYearMaximum;

  /**
   * The settings of the MonetaryAccount.
   */
  @Expose
  @SerializedName("setting")
  private MonetaryAccountSettingObject setting;

  /**
   * The fulfillments for this MonetaryAccount.
   */
  @Expose
  @SerializedName("fulfillments")
  private List<FulfillmentApiObject> fulfillments;

  /**
   * The profiles of the account.
   */
  @Expose
  @SerializedName("monetary_account_profile")
  private List<MonetaryAccountProfileApiObject> monetaryAccountProfile;

  /**
   * The budgets of the MonetaryAccount.
   */
  @Expose
  @SerializedName("budget")
  private List<MonetaryAccountBudgetApiObject> budget;

  /**
   * The ids of the AutoSave.
   */
  @Expose
  @SerializedName("all_auto_save_id")
  private List<BunqIdObject> allAutoSaveId;

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
   * The Birdee investment portfolio.
   */
  @Expose
  @SerializedName("birdee_investment_portfolio")
  private BirdeeInvestmentPortfolioApiObject birdeeInvestmentPortfolio;

  /**
   * The currency of the MonetaryAccountLight as an ISO 4217 formatted currency code.
   */
  @Expose
  @SerializedName("currency_field_for_request")
  private String currencyFieldForRequest;

  /**
   * The description of the MonetaryAccountLight. Defaults to 'bunq account'.
   */
  @Expose
  @SerializedName("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The daily spending limit Amount of the MonetaryAccountLight. Defaults to 1000 EUR. Currency
   * must match the MonetaryAccountLight's currency. Limited to 10000 EUR.
   */
  @Expose
  @SerializedName("daily_limit_field_for_request")
  private AmountObject dailyLimitFieldForRequest;

  /**
   * The UUID of the Avatar of the MonetaryAccountLight.
   */
  @Expose
  @SerializedName("avatar_uuid_field_for_request")
  private String avatarUuidFieldForRequest;

  /**
   * The status of the MonetaryAccountLight. Ignored in POST requests (always set to ACTIVE) can
   * be CANCELLED or PENDING_REOPEN in PUT requests to cancel (close) or reopen the
   * MonetaryAccountLight. When updating the status and/or sub_status no other fields can be
   * updated in the same request (and vice versa).
   */
  @Expose
  @SerializedName("status_field_for_request")
  private String statusFieldForRequest;

  /**
   * The sub-status of the MonetaryAccountLight providing extra information regarding the status.
   * Should be ignored for POST requests and can only be REDEMPTION_VOLUNTARY for PUT requests
   * with status CANCELLED. When updating the status and/or sub_status no other fields can be
   * updated in the same request (and vice versa).
   */
  @Expose
  @SerializedName("sub_status_field_for_request")
  private String subStatusFieldForRequest;

  /**
   * The reason for voluntarily cancelling (closing) the MonetaryAccountBank, can only be OTHER.
   * Should only be specified if updating the status to CANCELLED.
   */
  @Expose
  @SerializedName("reason_field_for_request")
  private String reasonFieldForRequest;

  /**
   * The optional free-form reason for voluntarily cancelling (closing) the MonetaryAccountBank.
   * Can be any user provided message. Should only be specified if updating the status to
   * CANCELLED.
   */
  @Expose
  @SerializedName("reason_description_field_for_request")
  private String reasonDescriptionFieldForRequest;

  /**
   * The settings of the MonetaryAccountLight.
   */
  @Expose
  @SerializedName("setting_field_for_request")
  private MonetaryAccountSettingObject settingFieldForRequest;

  public MonetaryAccountLightApiObject() {
  this(null, null, null, null, null, null, null, null, null);
  }

  public MonetaryAccountLightApiObject(String currency) {
  this(currency, null, null, null, null, null, null, null, null);
  }

  public MonetaryAccountLightApiObject(String currency, String description) {
  this(currency, description, null, null, null, null, null, null, null);
  }

  public MonetaryAccountLightApiObject(String currency, String description, AmountObject dailyLimit) {
  this(currency, description, dailyLimit, null, null, null, null, null, null);
  }

  public MonetaryAccountLightApiObject(String currency, String description, AmountObject dailyLimit, String avatarUuid) {
  this(currency, description, dailyLimit, avatarUuid, null, null, null, null, null);
  }

  public MonetaryAccountLightApiObject(String currency, String description, AmountObject dailyLimit, String avatarUuid, String status) {
  this(currency, description, dailyLimit, avatarUuid, status, null, null, null, null);
  }

  public MonetaryAccountLightApiObject(String currency, String description, AmountObject dailyLimit, String avatarUuid, String status, String subStatus) {
  this(currency, description, dailyLimit, avatarUuid, status, subStatus, null, null, null);
  }

  public MonetaryAccountLightApiObject(String currency, String description, AmountObject dailyLimit, String avatarUuid, String status, String subStatus, String reason) {
  this(currency, description, dailyLimit, avatarUuid, status, subStatus, reason, null, null);
  }

  public MonetaryAccountLightApiObject(String currency, String description, AmountObject dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription) {
  this(currency, description, dailyLimit, avatarUuid, status, subStatus, reason, reasonDescription, null);
  }

  public MonetaryAccountLightApiObject(String currency, String description, AmountObject dailyLimit, String avatarUuid, String status, String subStatus, String reason, String reasonDescription, MonetaryAccountSettingObject setting) {
    this.currencyFieldForRequest = currency;
    this.descriptionFieldForRequest = description;
    this.dailyLimitFieldForRequest = dailyLimit;
    this.avatarUuidFieldForRequest = avatarUuid;
    this.statusFieldForRequest = status;
    this.subStatusFieldForRequest = subStatus;
    this.reasonFieldForRequest = reason;
    this.reasonDescriptionFieldForRequest = reasonDescription;
    this.settingFieldForRequest = setting;
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
  public AvatarObject getAvatar() {
    return this.avatar;
  }

  public void setAvatar(AvatarObject avatar) {
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
   * The id of the User who owns the MonetaryAccountLight.
   */
  public Integer getUserId() {
    return this.userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
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
   * The maximum balance Amount of the MonetaryAccountLight.
   */
  public AmountObject getBalanceMaximum() {
    return this.balanceMaximum;
  }

  public void setBalanceMaximum(AmountObject balanceMaximum) {
    this.balanceMaximum = balanceMaximum;
  }

  /**
   * The amount of the monthly budget used.
   */
  public AmountObject getBudgetMonthUsed() {
    return this.budgetMonthUsed;
  }

  public void setBudgetMonthUsed(AmountObject budgetMonthUsed) {
    this.budgetMonthUsed = budgetMonthUsed;
  }

  /**
   * The total amount of the monthly budget.
   */
  public AmountObject getBudgetMonthMaximum() {
    return this.budgetMonthMaximum;
  }

  public void setBudgetMonthMaximum(AmountObject budgetMonthMaximum) {
    this.budgetMonthMaximum = budgetMonthMaximum;
  }

  /**
   * The amount of the yearly budget used.
   */
  public AmountObject getBudgetYearUsed() {
    return this.budgetYearUsed;
  }

  public void setBudgetYearUsed(AmountObject budgetYearUsed) {
    this.budgetYearUsed = budgetYearUsed;
  }

  /**
   * The total amount of the yearly budget.
   */
  public AmountObject getBudgetYearMaximum() {
    return this.budgetYearMaximum;
  }

  public void setBudgetYearMaximum(AmountObject budgetYearMaximum) {
    this.budgetYearMaximum = budgetYearMaximum;
  }

  /**
   * The amount of the yearly withdrawal budget used.
   */
  public AmountObject getBudgetWithdrawalYearUsed() {
    return this.budgetWithdrawalYearUsed;
  }

  public void setBudgetWithdrawalYearUsed(AmountObject budgetWithdrawalYearUsed) {
    this.budgetWithdrawalYearUsed = budgetWithdrawalYearUsed;
  }

  /**
   * The total amount of the yearly withdrawal budget.
   */
  public AmountObject getBudgetWithdrawalYearMaximum() {
    return this.budgetWithdrawalYearMaximum;
  }

  public void setBudgetWithdrawalYearMaximum(AmountObject budgetWithdrawalYearMaximum) {
    this.budgetWithdrawalYearMaximum = budgetWithdrawalYearMaximum;
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
   * The fulfillments for this MonetaryAccount.
   */
  public List<FulfillmentApiObject> getFulfillments() {
    return this.fulfillments;
  }

  public void setFulfillments(List<FulfillmentApiObject> fulfillments) {
    this.fulfillments = fulfillments;
  }

  /**
   * The profiles of the account.
   */
  public List<MonetaryAccountProfileApiObject> getMonetaryAccountProfile() {
    return this.monetaryAccountProfile;
  }

  public void setMonetaryAccountProfile(List<MonetaryAccountProfileApiObject> monetaryAccountProfile) {
    this.monetaryAccountProfile = monetaryAccountProfile;
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
   * The ids of the AutoSave.
   */
  public List<BunqIdObject> getAllAutoSaveId() {
    return this.allAutoSaveId;
  }

  public void setAllAutoSaveId(List<BunqIdObject> allAutoSaveId) {
    this.allAutoSaveId = allAutoSaveId;
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
   * The Birdee investment portfolio.
   */
  public BirdeeInvestmentPortfolioApiObject getBirdeeInvestmentPortfolio() {
    return this.birdeeInvestmentPortfolio;
  }

  public void setBirdeeInvestmentPortfolio(BirdeeInvestmentPortfolioApiObject birdeeInvestmentPortfolio) {
    this.birdeeInvestmentPortfolio = birdeeInvestmentPortfolio;
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

    if (this.userId != null) {
      return false;
    }

    if (this.share != null) {
      return false;
    }

    if (this.relationUser != null) {
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

    if (this.setting != null) {
      return false;
    }

    if (this.fulfillments != null) {
      return false;
    }

    if (this.monetaryAccountProfile != null) {
      return false;
    }

    if (this.budget != null) {
      return false;
    }

    if (this.allAutoSaveId != null) {
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

    if (this.birdeeInvestmentPortfolio != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MonetaryAccountLightApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(MonetaryAccountLightApiObject.class, reader);
  }

}
