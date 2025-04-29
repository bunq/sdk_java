package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AmountObject;
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
 * View for MonetaryAccountSwitchService
 */
public class MonetaryAccountSwitchServiceApiObject extends BunqModel {

  /**
   * The id of the monetary account.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the monetary account's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The description for the bank account.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The status of the account.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The sub-status of the account.
   */
  @Expose
  @SerializedName("sub_status")
  private String subStatus;

  /**
   * The aliases for the MonetaryAccount.
   */
  @Expose
  @SerializedName("alias")
  private List<PointerObject> alias;

  /**
   * The current available balance amount of the MonetaryAccount.
   */
  @Expose
  @SerializedName("balance")
  private AmountObject balance;

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
   * The budgets of the MonetaryAccount.
   */
  @Expose
  @SerializedName("budget")
  private List<MonetaryAccountBudgetApiObject> budget;

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
   * The access of this Monetary Account.
   */
  @Expose
  @SerializedName("all_access")
  private List<MonetaryAccountAccessApiObject> allAccess;

  /**
   * The id of the monetary account.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the monetary account's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The description for the bank account.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The status of the account.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The sub-status of the account.
   */
  public String getSubStatus() {
    return this.subStatus;
  }

  public void setSubStatus(String subStatus) {
    this.subStatus = subStatus;
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
   * The current available balance amount of the MonetaryAccount.
   */
  public AmountObject getBalance() {
    return this.balance;
  }

  public void setBalance(AmountObject balance) {
    this.balance = balance;
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
   * The budgets of the MonetaryAccount.
   */
  public List<MonetaryAccountBudgetApiObject> getBudget() {
    return this.budget;
  }

  public void setBudget(List<MonetaryAccountBudgetApiObject> budget) {
    this.budget = budget;
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

    if (this.description != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.subStatus != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.balance != null) {
      return false;
    }

    if (this.monetaryAccountProfile != null) {
      return false;
    }

    if (this.setting != null) {
      return false;
    }

    if (this.budget != null) {
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

    if (this.allAutoSaveId != null) {
      return false;
    }

    if (this.fulfillments != null) {
      return false;
    }

    if (this.relationUser != null) {
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

    if (this.allAccess != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MonetaryAccountSwitchServiceApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(MonetaryAccountSwitchServiceApiObject.class, reader);
  }

}
