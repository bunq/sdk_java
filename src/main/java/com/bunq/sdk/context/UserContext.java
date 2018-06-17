package com.bunq.sdk.context;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.UserContextHelper;
import com.bunq.sdk.model.generated.endpoint.MonetaryAccountBank;
import com.bunq.sdk.model.generated.endpoint.User;
import com.bunq.sdk.model.generated.endpoint.UserCompany;
import com.bunq.sdk.model.generated.endpoint.UserPerson;

import java.util.List;

public class UserContext {

  /**
   * Error constants.
   */
  private static final String ERROR_UNEXPECTED_USER_INSTANCE = "\"%s\" is unexpected user instance.";
  private static final String ERROR_NO_ACTIVE_MONETARY_ACCOUNT_FOUND = "No active monetary account found.";
  private static final String ERROR_PRIMARY_MONETARY_ACCOUNT_IS_NOT_SET = "Primary monetaryAccount is not set.";

  private final ApiContext apiContext;
  private UserCompany userCompany;
  private UserPerson userPerson;
  private MonetaryAccountBank primaryMonetaryAccountBank;

  public UserContext(ApiContext apiContext) {
    this.apiContext = apiContext;
    refreshContext();
  }

  private void initUser(User user) {
    if (user!=null && user.getUserPerson()!=null) {
      this.userPerson = user.getUserPerson();
    } else if (user!=null && user.getUserCompany()!=null) {
      this.userCompany = user.getUserCompany();
    } else {
      throw new BunqException(ERROR_UNEXPECTED_USER_INSTANCE);
    }
  }

  private void initMainMonetaryAccount(MonetaryAccountBank monetaryAccountBank) {
    if(monetaryAccountBank == null) {
      throw new BunqException(ERROR_NO_ACTIVE_MONETARY_ACCOUNT_FOUND);
    }
    this.primaryMonetaryAccountBank = monetaryAccountBank;
  }

  public void refreshContext() {
    UserContextHelper helper = new UserContextHelper(this.apiContext);
    this.initUser(helper.getFirstUser());
    this.initMainMonetaryAccount(helper.getFirstActiveMonetaryAccountBank(getUserId()));
  }

  public Integer getUserId() {
    return this.apiContext.getSessionContext().getUserId();
  }

  public boolean isOnlyUserPersonSet() {
    return this.userCompany == null && this.userPerson != null;
  }

  public boolean isOnlyUserCompanySet() {
    return this.userPerson == null && this.userCompany != null;
  }

  public boolean isBothUserTypeSet() {
    return this.userPerson != null && this.userCompany != null;
  }

  public Integer getMainMonetaryAccountId() {
    if (this.primaryMonetaryAccountBank == null) {
      throw new BunqException(ERROR_PRIMARY_MONETARY_ACCOUNT_IS_NOT_SET);
    } else {
      return this.primaryMonetaryAccountBank.getId();
    }
  }

  public UserPerson getUserPerson() {
    return this.userPerson;
  }

  public UserCompany getUserCompany() {
    return this.userCompany;
  }

  public MonetaryAccountBank getPrimaryMonetaryAccountBank() {
    return this.primaryMonetaryAccountBank;
  }
}
