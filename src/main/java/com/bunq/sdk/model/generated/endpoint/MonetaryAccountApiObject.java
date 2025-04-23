package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
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
import javax.lang.model.type.NullType;

/**
 * Used to show the MonetaryAccounts that you can access. Currently the only MonetaryAccount
 * type is MonetaryAccountBank. See also: monetary-account-bank.<br/><br/>Notification filters
 * can be set on a monetary account level to receive callbacks. For more information check the
 * <a href="/api/2/page/callbacks">dedicated callbacks page</a>.
 */
public class MonetaryAccountApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "MonetaryAccount";

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
   */
  @Expose
  @SerializedName("MonetaryAccountLight")
  private MonetaryAccountLightApiObject monetaryAccountLight;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountBank")
  private MonetaryAccountBankApiObject monetaryAccountBank;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountExternal")
  private MonetaryAccountExternalApiObject monetaryAccountExternal;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountInvestment")
  private MonetaryAccountInvestmentApiObject monetaryAccountInvestment;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountJoint")
  private MonetaryAccountJointApiObject monetaryAccountJoint;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountSavings")
  private MonetaryAccountSavingsApiObject monetaryAccountSavings;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountSwitchService")
  private MonetaryAccountSwitchServiceApiObject monetaryAccountSwitchService;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountExternalSavings")
  private MonetaryAccountExternalSavingsApiObject monetaryAccountExternalSavings;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountCard")
  private MonetaryAccountCardApiObject monetaryAccountCard;

  /**
   * Get a specific MonetaryAccount.
   */
  public static BunqResponse<MonetaryAccountApiObject> get(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJson(MonetaryAccountApiObject.class, responseRaw);
  }

  public static BunqResponse<MonetaryAccountApiObject> get() {
    return get(null, null, null);
  }

  public static BunqResponse<MonetaryAccountApiObject> get(Integer monetaryAccountId) {
    return get(monetaryAccountId, null, null);
  }

  public static BunqResponse<MonetaryAccountApiObject> get(Integer monetaryAccountId, Map<String, String> params) {
    return get(monetaryAccountId, params, null);
  }

  /**
   * Get a collection of all your MonetaryAccounts.
   */
  public static BunqResponse<List<MonetaryAccountApiObject>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(MonetaryAccountApiObject.class, responseRaw);
  }

  public static BunqResponse<List<MonetaryAccountApiObject>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<MonetaryAccountApiObject>> list(Map<String, String> params) {
    return list(params, null);
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
  public MonetaryAccountLightApiObject getMonetaryAccountLight() {
    return this.monetaryAccountLight;
  }

  public void setMonetaryAccountLight(MonetaryAccountLightApiObject monetaryAccountLight) {
    this.monetaryAccountLight = monetaryAccountLight;
  }

  /**
   */
  public MonetaryAccountBankApiObject getMonetaryAccountBank() {
    return this.monetaryAccountBank;
  }

  public void setMonetaryAccountBank(MonetaryAccountBankApiObject monetaryAccountBank) {
    this.monetaryAccountBank = monetaryAccountBank;
  }

  /**
   */
  public MonetaryAccountExternalApiObject getMonetaryAccountExternal() {
    return this.monetaryAccountExternal;
  }

  public void setMonetaryAccountExternal(MonetaryAccountExternalApiObject monetaryAccountExternal) {
    this.monetaryAccountExternal = monetaryAccountExternal;
  }

  /**
   */
  public MonetaryAccountInvestmentApiObject getMonetaryAccountInvestment() {
    return this.monetaryAccountInvestment;
  }

  public void setMonetaryAccountInvestment(MonetaryAccountInvestmentApiObject monetaryAccountInvestment) {
    this.monetaryAccountInvestment = monetaryAccountInvestment;
  }

  /**
   */
  public MonetaryAccountJointApiObject getMonetaryAccountJoint() {
    return this.monetaryAccountJoint;
  }

  public void setMonetaryAccountJoint(MonetaryAccountJointApiObject monetaryAccountJoint) {
    this.monetaryAccountJoint = monetaryAccountJoint;
  }

  /**
   */
  public MonetaryAccountSavingsApiObject getMonetaryAccountSavings() {
    return this.monetaryAccountSavings;
  }

  public void setMonetaryAccountSavings(MonetaryAccountSavingsApiObject monetaryAccountSavings) {
    this.monetaryAccountSavings = monetaryAccountSavings;
  }

  /**
   */
  public MonetaryAccountSwitchServiceApiObject getMonetaryAccountSwitchService() {
    return this.monetaryAccountSwitchService;
  }

  public void setMonetaryAccountSwitchService(MonetaryAccountSwitchServiceApiObject monetaryAccountSwitchService) {
    this.monetaryAccountSwitchService = monetaryAccountSwitchService;
  }

  /**
   */
  public MonetaryAccountExternalSavingsApiObject getMonetaryAccountExternalSavings() {
    return this.monetaryAccountExternalSavings;
  }

  public void setMonetaryAccountExternalSavings(MonetaryAccountExternalSavingsApiObject monetaryAccountExternalSavings) {
    this.monetaryAccountExternalSavings = monetaryAccountExternalSavings;
  }

  /**
   */
  public MonetaryAccountCardApiObject getMonetaryAccountCard() {
    return this.monetaryAccountCard;
  }

  public void setMonetaryAccountCard(MonetaryAccountCardApiObject monetaryAccountCard) {
    this.monetaryAccountCard = monetaryAccountCard;
  }

  /**
   */
  public boolean isAllFieldNull() {
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

    if (this.monetaryAccountLight != null) {
      return false;
    }

    if (this.monetaryAccountBank != null) {
      return false;
    }

    if (this.monetaryAccountExternal != null) {
      return false;
    }

    if (this.monetaryAccountInvestment != null) {
      return false;
    }

    if (this.monetaryAccountJoint != null) {
      return false;
    }

    if (this.monetaryAccountSavings != null) {
      return false;
    }

    if (this.monetaryAccountSwitchService != null) {
      return false;
    }

    if (this.monetaryAccountExternalSavings != null) {
      return false;
    }

    if (this.monetaryAccountCard != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static MonetaryAccountApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(MonetaryAccountApiObject.class, reader);
  }

}
