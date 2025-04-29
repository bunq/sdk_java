package com.bunq.sdk.model.core;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.generated.endpoint.MonetaryAccountBankApiObject;
import com.bunq.sdk.model.generated.endpoint.UserApiObject;

import java.util.List;

public class UserContextHelper extends BunqModel {

    /**
     * Error constants.
     */
    private static final String ERROR_NO_ACTIVE_MONETARY_ACCOUNT_BANK =
            "No active monetary account found.";

    /**
     * Endpoint constants.
     */
    private static final String ENDPOINT_USER = "user";
    private static final String ENDPOINT_MONETARY_ACCOUNT_BANK = "user/%s/monetary-account-bank";

    /**
     * Object type.
     */
    private static final String MONETARY_ACCOUNT_BANK_OBJECT_TYPE_GET = "MonetaryAccountBank";

    /**
     * The index of the first item in an array.
     */
    private static final Integer INDEX_FIRST = 0;

    /**
     * Status constants.
     */
    private static final String STATUS_ACTIVE = "ACTIVE";

    private final ApiClient apiClient;

    public UserContextHelper(ApiContext apiContext) {
        this.apiClient = new ApiClient(apiContext);
    }

    private BunqResponseRaw getRawResponse(String url) {
        return this.apiClient.get(url, null, null);
    }

    public UserApiObject getFirstUser() {
        BunqResponseRaw responseRaw = getRawResponse(ENDPOINT_USER);
        BunqResponse<List<UserApiObject>> response = fromJsonList(UserApiObject.class, responseRaw);

        return response.getValue().get(INDEX_FIRST);
    }

    public MonetaryAccountBankApiObject getFirstActiveMonetaryAccountBankByUserId(Integer userId) {
        BunqResponseRaw responseRaw = getRawResponse(
                String.format(ENDPOINT_MONETARY_ACCOUNT_BANK, userId)
        );

        BunqResponse<List<MonetaryAccountBankApiObject>> response = fromJsonList(
                MonetaryAccountBankApiObject.class,
                responseRaw,
                MONETARY_ACCOUNT_BANK_OBJECT_TYPE_GET
        );

        for (MonetaryAccountBankApiObject monetaryAccountBank : response.getValue()) {
            if (STATUS_ACTIVE.equals(monetaryAccountBank.getStatus())) {
                return monetaryAccountBank;
            }
        }

        throw new BunqException(ERROR_NO_ACTIVE_MONETARY_ACCOUNT_BANK);
    }

    @Override
    public boolean isAllFieldNull() {
        return true;
    }
}
