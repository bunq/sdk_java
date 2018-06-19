package com.bunq.sdk.model.core;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.generated.endpoint.MonetaryAccountBank;
import com.bunq.sdk.model.generated.endpoint.User;

import java.util.List;

public class UserContextHelper extends BunqModel {
  private static final String STATUS_ACTIVE = "ACTIVE";
  private static final String ERROR_NO_ACTIVE_MONETARY = "No active monetary account found.";
  private static final String USER_URL = "user";
  private static final String MONETARY_URL = "user/%s/monetary-account-bank";
  private static final Integer FIRST = 0;

  private final ApiClient apiClient;

  public UserContextHelper(ApiContext apiContext) {
    this.apiClient = new ApiClient(apiContext);
  }

  private BunqResponseRaw getRawResponse(String url) {
    return this.apiClient.get(url, null, null);
  }

  public User getFirstUser() {
    BunqResponseRaw responseRaw = getRawResponse(USER_URL);
    BunqResponse<List<User>> response = fromJsonList(User.class, responseRaw);

    return response.getValue().get(FIRST);
  }

  public MonetaryAccountBank getFirstActiveMonetaryAccountBankByUserId(Integer userId) {
    BunqResponseRaw responseRaw = getRawResponse(String.format(MONETARY_URL, userId));
    String wrapper = MonetaryAccountBank.class.getSimpleName();
    BunqResponse<List<MonetaryAccountBank>> response = fromJsonList(MonetaryAccountBank.class, responseRaw, wrapper);

    for (MonetaryAccountBank monetaryAccountBank:response.getValue()) {
      if (STATUS_ACTIVE.equals(monetaryAccountBank.getStatus())) {
        return monetaryAccountBank;
      }
    }
    throw new BunqException(ERROR_NO_ACTIVE_MONETARY);
  }

  @Override
  public boolean isAllFieldNull() {
    return true;
  }
}
