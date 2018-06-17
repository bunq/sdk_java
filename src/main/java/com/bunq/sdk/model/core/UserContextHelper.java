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
  private static final String USER_ENDPOINT_URL_LISTING = "user";
  private static final String MONETARY_ENDPOINT_URL_READ = "user/%s/monetary-account-bank/%s";

  private final ApiClient apiClient;

  public UserContextHelper(ApiContext apiContext) {
    this.apiClient = new ApiClient(apiContext);
  }

  private BunqResponseRaw getRawResponse(String url) {
    return this.apiClient.get(url, null, null);
  }

  public User getFirstUser() {
    BunqResponseRaw responseRaw = getRawResponse(USER_ENDPOINT_URL_LISTING);
    BunqResponse<List<User>> response = fromJsonList(User.class, responseRaw);


    return response.getValue().stream().findFirst().orElse(null);
  }

  public MonetaryAccountBank getFirstActiveMonetaryAccountBank(Integer userId) {
    BunqResponseRaw responseRaw = getRawResponse(String.format(MONETARY_ENDPOINT_URL_READ, userId));
    BunqResponse<List<MonetaryAccountBank>> response = fromJsonList(MonetaryAccountBank.class, responseRaw, MonetaryAccountBank.class.getSimpleName());

    return response.getValue().stream()
            .filter(monetaryAccountBank->monetaryAccountBank.getStatus().equals(MONETARY_ACCOUNT_STATUS_ACTIVE))
            .findFirst()
            .orElse(null);
  }

  @Override
  public boolean isAllFieldNull() {
    return true;
  }
}
