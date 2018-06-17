package com.bunq.sdk.model.core;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.generated.endpoint.MonetaryAccountBank;
import com.bunq.sdk.model.generated.endpoint.User;

import java.util.List;

public class UserContextHelper extends BunqModel {
  private static final String MONETARY_ACCOUNT_STATUS_ACTIVE = "ACTIVE";
  private static final int INDEX_FIRST = 0;

  private final ApiClient apiClient;

  public UserContextHelper(ApiContext apiContext) {
    this.apiClient = new ApiClient(apiContext);
  }

  private BunqResponseRaw getRawResponse(String url) {
    return this.apiClient.get(url, null, null);
  }

  public User getFirstUser() {
    BunqResponseRaw responseRaw = getRawResponse("user");
    BunqResponse<List<User>> response = fromJsonList(User.class, responseRaw);
    return response.getValue().get(INDEX_FIRST);
  }

  public MonetaryAccountBank getFirstActiveMonetaryAccountBank(Integer userId) {
    BunqResponseRaw responseRaw = getRawResponse(String.format("user/%s/monetary-account-bank", userId));
    BunqResponse<List<MonetaryAccountBank>> response = fromJsonList(MonetaryAccountBank.class, responseRaw, MonetaryAccountBank.class.getSimpleName());
    for (MonetaryAccountBank monetaryAccountBank : response.getValue()) {
      if (monetaryAccountBank.getStatus().equals(MONETARY_ACCOUNT_STATUS_ACTIVE)) {
        return monetaryAccountBank;
      }
    }
    return null;
  }

  @Override
  public boolean isAllFieldNull() {
    return true;
  }
}
