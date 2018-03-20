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
  private static final String ERROR_PRIMARY_MONETARY_ACCOUNT_IS_NOT_SET = "Primary monetaryAccount is not set.";

  private static final String MONETARY_ACCOUNT_STATUS_ACTIVE = "ACTIVE";

  private UserCompany userCompany;
  private UserPerson userPerson;
  private MonetaryAccountBank primaryMonetaryAccountBank;
  private Integer userId;

  public UserContext(Integer userId) {
    BunqModel userObject = User.list().getValue().get(0).getReferencedObject();

    this.setUser(userObject);
    this.userId = userId;
  }

  private void setUser(BunqModel user) {
    if (user instanceof UserPerson) {
      this.userPerson = (UserPerson) user;
    } else if (user instanceof UserCompany) {
      this.userCompany = (UserCompany) user;
    } else {
      throw new BunqException(ERROR_UNEXPECTED_USER_INSTANCE);
    }
  }

  public void initMainMonetaryAccount() {
    List<MonetaryAccountBank> allMonetaryAccount =  MonetaryAccountBank.list().getValue();

    for (MonetaryAccountBank monetaryAccountBank : allMonetaryAccount) {
      if (monetaryAccountBank.getStatus().equals(MONETARY_ACCOUNT_STATUS_ACTIVE)) {
        this.primaryMonetaryAccountBank = monetaryAccountBank;

        return;
      }
    }

    throw new BunqException(ERROR_NO_ACTIVE_MONETARY_ACCOUNT_FOUND);
  }

  public Integer getUserId() {
    return this.userId;
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
