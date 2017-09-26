package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
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
  private static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "MonetaryAccount";

  /**
   */
  @Expose
  @SerializedName("MonetaryAccountBank")
  private MonetaryAccountBank monetaryAccountBank;

  public static BunqResponse<MonetaryAccount> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId) {
    return get(apiContext, userId, monetaryAccountId, new HashMap<>());
  }

  /**
   * Get a specific MonetaryAccount.
   */
  public static BunqResponse<MonetaryAccount> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userId, monetaryAccountId), new HashMap<>(), customHeaders);

    return fromJson(MonetaryAccount.class, responseRaw);
  }

  public static BunqResponse<List<MonetaryAccount>> list(ApiContext apiContext, Integer userId) {
    return list(apiContext, userId, new HashMap<>());
  }

  public static BunqResponse<List<MonetaryAccount>> list(ApiContext apiContext, Integer userId, Map<String, String> params) {
    return list(apiContext, userId, params, new HashMap<>());
  }

  /**
   * Get a collection of all your MonetaryAccounts.
   */
  public static BunqResponse<List<MonetaryAccount>> list(ApiContext apiContext, Integer userId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId), params, customHeaders);

    return fromJsonList(MonetaryAccount.class, responseRaw);
  }

  /**
   */
  public MonetaryAccountBank getMonetaryAccountBank() {
    return this.monetaryAccountBank;
  }

  public void setMonetaryAccountBank(MonetaryAccountBank monetaryAccountBank) {
    this.monetaryAccountBank = monetaryAccountBank;
  }

}
