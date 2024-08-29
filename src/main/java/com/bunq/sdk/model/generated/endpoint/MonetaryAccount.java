package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.BunqId;
import com.bunq.sdk.model.generated.object.CoOwner;
import com.bunq.sdk.model.generated.object.MonetaryAccountSetting;
import com.bunq.sdk.model.generated.object.Pointer;
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
public class MonetaryAccount extends BunqModel {

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
  private List<Pointer> alias;

  /**
   * The current available balance amount of the MonetaryAccount.
   */
  @Expose
  @SerializedName("balance")
  private Amount balance;

  /**
   * The profiles of the account.
   */
  @Expose
  @SerializedName("monetary_account_profile")
  private List<MonetaryAccountProfile> monetaryAccountProfile;

  /**
   * The settings of the MonetaryAccount.
   */
  @Expose
  @SerializedName("setting")
  private MonetaryAccountSetting setting;

  /**
   * The budgets of the MonetaryAccount.
   */
  @Expose
  @SerializedName("budget")
  private List<MonetaryAccountBudget> budget;

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
  private ShareInviteMonetaryAccountResponse share;

  /**
   * The ids of the AutoSave.
   */
  @Expose
  @SerializedName("all_auto_save_id")
  private List<BunqId> allAutoSaveId;

  /**
   * The fulfillments for this MonetaryAccount.
   */
  @Expose
  @SerializedName("fulfillments")
  private List<Fulfillment> fulfillments;

  /**
   * The RelationUser when the MonetaryAccount is accessed by the User via a share/connect.
   */
  @Expose
  @SerializedName("relation_user")
  private RelationUser relationUser;

  /**
   * The users the account will be joint with.
   */
  @Expose
  @SerializedName("all_co_owner")
  private List<CoOwner> allCoOwner;

  /**
   * The CoOwnerInvite when the MonetaryAccount is accessed by the User via a CoOwnerInvite.
   */
  @Expose
  @SerializedName("co_owner_invite")
  private CoOwnerInviteResponse coOwnerInvite;

  /**
   * The open banking account for information about the external account.
   */
  @Expose
  @SerializedName("open_banking_account")
  private OpenBankingAccount openBankingAccount;

  /**
   * The Birdee investment portfolio.
   */
  @Expose
  @SerializedName("birdee_investment_portfolio")
  private BirdeeInvestmentPortfolio birdeeInvestmentPortfolio;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountLight")
  private MonetaryAccountLight monetaryAccountLight;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountBank")
  private MonetaryAccountBank monetaryAccountBank;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountExternal")
  private MonetaryAccountExternal monetaryAccountExternal;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountInvestment")
  private MonetaryAccountInvestment monetaryAccountInvestment;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountJoint")
  private MonetaryAccountJoint monetaryAccountJoint;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountSavings")
  private MonetaryAccountSavings monetaryAccountSavings;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountSwitchService")
  private MonetaryAccountSwitchService monetaryAccountSwitchService;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountExternalSavings")
  private MonetaryAccountExternalSavings monetaryAccountExternalSavings;

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountCard")
  private MonetaryAccountCard monetaryAccountCard;

  /**
   * Get a specific MonetaryAccount.
   */
  public static BunqResponse<MonetaryAccount> get(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJson(MonetaryAccount.class, responseRaw);
  }

  public static BunqResponse<MonetaryAccount> get() {
    return get(null, null, null);
  }

  public static BunqResponse<MonetaryAccount> get(Integer monetaryAccountId) {
    return get(monetaryAccountId, null, null);
  }

  public static BunqResponse<MonetaryAccount> get(Integer monetaryAccountId, Map<String, String> params) {
    return get(monetaryAccountId, params, null);
  }

  /**
   * Get a collection of all your MonetaryAccounts.
   */
  public static BunqResponse<List<MonetaryAccount>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(MonetaryAccount.class, responseRaw);
  }

  public static BunqResponse<List<MonetaryAccount>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<MonetaryAccount>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   * The aliases for the MonetaryAccount.
   */
  public List<Pointer> getAlias() {
    return this.alias;
  }

  public void setAlias(List<Pointer> alias) {
    this.alias = alias;
  }

  /**
   * The current available balance amount of the MonetaryAccount.
   */
  public Amount getBalance() {
    return this.balance;
  }

  public void setBalance(Amount balance) {
    this.balance = balance;
  }

  /**
   * The profiles of the account.
   */
  public List<MonetaryAccountProfile> getMonetaryAccountProfile() {
    return this.monetaryAccountProfile;
  }

  public void setMonetaryAccountProfile(List<MonetaryAccountProfile> monetaryAccountProfile) {
    this.monetaryAccountProfile = monetaryAccountProfile;
  }

  /**
   * The settings of the MonetaryAccount.
   */
  public MonetaryAccountSetting getSetting() {
    return this.setting;
  }

  public void setSetting(MonetaryAccountSetting setting) {
    this.setting = setting;
  }

  /**
   * The budgets of the MonetaryAccount.
   */
  public List<MonetaryAccountBudget> getBudget() {
    return this.budget;
  }

  public void setBudget(List<MonetaryAccountBudget> budget) {
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
  public ShareInviteMonetaryAccountResponse getShare() {
    return this.share;
  }

  public void setShare(ShareInviteMonetaryAccountResponse share) {
    this.share = share;
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
   * The fulfillments for this MonetaryAccount.
   */
  public List<Fulfillment> getFulfillments() {
    return this.fulfillments;
  }

  public void setFulfillments(List<Fulfillment> fulfillments) {
    this.fulfillments = fulfillments;
  }

  /**
   * The RelationUser when the MonetaryAccount is accessed by the User via a share/connect.
   */
  public RelationUser getRelationUser() {
    return this.relationUser;
  }

  public void setRelationUser(RelationUser relationUser) {
    this.relationUser = relationUser;
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
   * The CoOwnerInvite when the MonetaryAccount is accessed by the User via a CoOwnerInvite.
   */
  public CoOwnerInviteResponse getCoOwnerInvite() {
    return this.coOwnerInvite;
  }

  public void setCoOwnerInvite(CoOwnerInviteResponse coOwnerInvite) {
    this.coOwnerInvite = coOwnerInvite;
  }

  /**
   * The open banking account for information about the external account.
   */
  public OpenBankingAccount getOpenBankingAccount() {
    return this.openBankingAccount;
  }

  public void setOpenBankingAccount(OpenBankingAccount openBankingAccount) {
    this.openBankingAccount = openBankingAccount;
  }

  /**
   * The Birdee investment portfolio.
   */
  public BirdeeInvestmentPortfolio getBirdeeInvestmentPortfolio() {
    return this.birdeeInvestmentPortfolio;
  }

  public void setBirdeeInvestmentPortfolio(BirdeeInvestmentPortfolio birdeeInvestmentPortfolio) {
    this.birdeeInvestmentPortfolio = birdeeInvestmentPortfolio;
  }

  /**
   */
  public MonetaryAccountLight getMonetaryAccountLight() {
    return this.monetaryAccountLight;
  }

  public void setMonetaryAccountLight(MonetaryAccountLight monetaryAccountLight) {
    this.monetaryAccountLight = monetaryAccountLight;
  }

  /**
   */
  public MonetaryAccountBank getMonetaryAccountBank() {
    return this.monetaryAccountBank;
  }

  public void setMonetaryAccountBank(MonetaryAccountBank monetaryAccountBank) {
    this.monetaryAccountBank = monetaryAccountBank;
  }

  /**
   */
  public MonetaryAccountExternal getMonetaryAccountExternal() {
    return this.monetaryAccountExternal;
  }

  public void setMonetaryAccountExternal(MonetaryAccountExternal monetaryAccountExternal) {
    this.monetaryAccountExternal = monetaryAccountExternal;
  }

  /**
   */
  public MonetaryAccountInvestment getMonetaryAccountInvestment() {
    return this.monetaryAccountInvestment;
  }

  public void setMonetaryAccountInvestment(MonetaryAccountInvestment monetaryAccountInvestment) {
    this.monetaryAccountInvestment = monetaryAccountInvestment;
  }

  /**
   */
  public MonetaryAccountJoint getMonetaryAccountJoint() {
    return this.monetaryAccountJoint;
  }

  public void setMonetaryAccountJoint(MonetaryAccountJoint monetaryAccountJoint) {
    this.monetaryAccountJoint = monetaryAccountJoint;
  }

  /**
   */
  public MonetaryAccountSavings getMonetaryAccountSavings() {
    return this.monetaryAccountSavings;
  }

  public void setMonetaryAccountSavings(MonetaryAccountSavings monetaryAccountSavings) {
    this.monetaryAccountSavings = monetaryAccountSavings;
  }

  /**
   */
  public MonetaryAccountSwitchService getMonetaryAccountSwitchService() {
    return this.monetaryAccountSwitchService;
  }

  public void setMonetaryAccountSwitchService(MonetaryAccountSwitchService monetaryAccountSwitchService) {
    this.monetaryAccountSwitchService = monetaryAccountSwitchService;
  }

  /**
   */
  public MonetaryAccountExternalSavings getMonetaryAccountExternalSavings() {
    return this.monetaryAccountExternalSavings;
  }

  public void setMonetaryAccountExternalSavings(MonetaryAccountExternalSavings monetaryAccountExternalSavings) {
    this.monetaryAccountExternalSavings = monetaryAccountExternalSavings;
  }

  /**
   */
  public MonetaryAccountCard getMonetaryAccountCard() {
    return this.monetaryAccountCard;
  }

  public void setMonetaryAccountCard(MonetaryAccountCard monetaryAccountCard) {
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
  public static MonetaryAccount fromJsonReader(JsonReader reader) {
    return fromJsonReader(MonetaryAccount.class, reader);
  }

}
