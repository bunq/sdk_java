package com.bunq.sdk.context;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.UserContextHelper;
import com.bunq.sdk.model.generated.endpoint.*;

public class UserContext {
    /**
     * Error constants.
     */
    private static final String ERROR_UNEXPECTED_USER_INSTANCE = "\"%s\" is unexpected user instance.";
    private static final String ERROR_PRIMARY_MONETARY_ACCOUNT_IS_NOT_SET = "Primary monetaryAccount is not set";

    private final ApiContext apiContext;
    private UserCompanyApiObject userCompany;
    private UserPersonApiObject userPerson;
    private UserApiKeyApiObject userApiKey;
    private UserPaymentServiceProviderApiObject userPaymentServiceProvider;
    private MonetaryAccountBankApiObject primaryMonetaryAccountBank;

    public UserContext(ApiContext apiContext) {
        this.apiContext = apiContext;
        initUser(this.apiContext.getSessionContext().getUserReference());
    }

    private void initUser(BunqModel user) {
        if (user instanceof UserPersonApiObject) {
            this.userPerson = (UserPersonApiObject) user;
        } else if (user instanceof UserCompanyApiObject) {
            this.userCompany = (UserCompanyApiObject) user;
        } else if (user instanceof UserApiKeyApiObject) {
            this.userApiKey = (UserApiKeyApiObject) user;
        } else if (user instanceof UserPaymentServiceProviderApiObject) {
            this.userPaymentServiceProvider = (UserPaymentServiceProviderApiObject) user;
        } else {
            throw new BunqException(String.format(ERROR_UNEXPECTED_USER_INSTANCE, user.getClass().toString()));
        }
    }

    public void initMainMonetaryAccount(UserContextHelper helper) {
        if (this.userPaymentServiceProvider != null) {
            return;
        }

        this.primaryMonetaryAccountBank = helper.getFirstActiveMonetaryAccountBankByUserId(getUserId());
    }

    public void refreshContext() {
        UserContextHelper helper = new UserContextHelper(this.apiContext);
        this.initUser(helper.getFirstUser().getReferencedObject());
        this.initMainMonetaryAccount(helper);
    }

    public Integer getUserId() {
        return this.apiContext.getSessionContext().getUserId();
    }

    public boolean isOnlyUserPersonSet() {
        return this.userCompany == null && this.userApiKey == null && this.userPerson != null;
    }

    public boolean isOnlyUserCompanySet() {
        return this.userPerson == null && this.userApiKey == null && this.userCompany != null;
    }

    public boolean isOnlyUserApiKeySet() {
        return this.userPerson == null && this.userCompany == null && this.userApiKey != null;
    }

    public boolean areAllUserSet() {
        return this.userPerson != null && this.userCompany != null && this.userApiKey != null;
    }

    public Integer getMainMonetaryAccountId() {
        if (this.primaryMonetaryAccountBank == null) {
            throw new BunqException(ERROR_PRIMARY_MONETARY_ACCOUNT_IS_NOT_SET);
        } else {
            return this.primaryMonetaryAccountBank.getId();
        }
    }

    public UserPersonApiObject getUserPerson() {
        return this.userPerson;
    }

    public UserCompanyApiObject getUserCompany() {
        return this.userCompany;
    }

    public UserApiKeyApiObject getUserApiKey() {
        return userApiKey;
    }

    public MonetaryAccountBankApiObject getPrimaryMonetaryAccountBank() {
        return this.primaryMonetaryAccountBank;
    }
}
