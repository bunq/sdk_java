package com.bunq.sdk.context;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.BunqModel;
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

  private final ApiContext apiContext;
  private final UserCompany userCompany;
  private final UserPerson userPerson;
  private final MonetaryAccountBank primaryMonetaryAccountBank;

  public UserContext(ApiContext apiContext) {
    this.apiContext = apiContext;
    User user = User.getFirst(this.apiContext);
    if (user.getUserPerson()!=null) {
      this.userPerson = user.getUserPerson();
      this.userCompany = null;
    } else if (user.getUserCompany()!=null) {
      this.userCompany = user.getUserCompany();
      this.userPerson = null;
    } else {
      throw new BunqException(ERROR_UNEXPECTED_USER_INSTANCE);
    }
    MonetaryAccountBank monetaryAccountBank = MonetaryAccountBank.getFirstActive(this.apiContext);
    if(monetaryAccountBank!=null) {
      this.primaryMonetaryAccountBank = monetaryAccountBank;
    }
    else {
      throw new BunqException(ERROR_NO_ACTIVE_MONETARY_ACCOUNT_FOUND);
    }
  }

  public ApiContext getApiContext() {
    return apiContext;
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

  public Integer getMainMonetaryAccountId() {
    return this.primaryMonetaryAccountBank.getId();
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
