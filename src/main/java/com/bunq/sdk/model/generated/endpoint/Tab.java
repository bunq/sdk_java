package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.exception.BunqException;
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
 * Once your CashRegister has been activated you can use it to create Tabs. A Tab is a template
 * for a payment. In contrast to requests a Tab is not pointed towards a specific user. Any user
 * can pay the Tab as long as it is made visible by you. The creation of a Tab happens with
 * /tab-usage-single or /tab-usage-multiple. A TabUsageSingle is a Tab that can be paid once. A
 * TabUsageMultiple is a Tab that can be paid multiple times by different users.
 */
public class Tab extends BunqModel {

  /**
   * Error constants.
   */
  private static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/cash-register/%s/tab/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/cash-register/%s/tab";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "Tab";

  /**
   */
  @Expose
  @SerializedName("TabUsageSingle")
  private TabUsageSingle tabUsageSingle;

  /**
   */
  @Expose
  @SerializedName("TabUsageMultiple")
  private TabUsageMultiple tabUsageMultiple;

  public static BunqResponse<Tab> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, String tabUuid) {
    return get(apiContext, userId, monetaryAccountId, cashRegisterId, tabUuid, new HashMap<>());
  }

  /**
   * Get a specific tab. This returns a TabUsageSingle or TabUsageMultiple.
   */
  public static BunqResponse<Tab> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, String tabUuid, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userId, monetaryAccountId, cashRegisterId, tabUuid), new HashMap<>(), customHeaders);

    return fromJson(Tab.class, responseRaw);
  }

  public static BunqResponse<List<Tab>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId) {
    return list(apiContext, userId, monetaryAccountId, cashRegisterId, new HashMap<>());
  }

  public static BunqResponse<List<Tab>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, Map<String, String> params) {
    return list(apiContext, userId, monetaryAccountId, cashRegisterId, params, new HashMap<>());
  }

  /**
   * Get a collection of tabs.
   */
  public static BunqResponse<List<Tab>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId, cashRegisterId), params, customHeaders);

    return fromJsonList(Tab.class, responseRaw);
  }

  /**
   */
  public TabUsageSingle getTabUsageSingle() {
    return this.tabUsageSingle;
  }

  public void setTabUsageSingle(TabUsageSingle tabUsageSingle) {
    this.tabUsageSingle = tabUsageSingle;
  }

  /**
   */
  public TabUsageMultiple getTabUsageMultiple() {
    return this.tabUsageMultiple;
  }

  public void setTabUsageMultiple(TabUsageMultiple tabUsageMultiple) {
    this.tabUsageMultiple = tabUsageMultiple;
  }

  /**
   */
  public BunqModel getReferencedObject() {
    if (this.tabUsageSingle != null) {
      return this.tabUsageSingle;
    }

    if (this.tabUsageMultiple != null) {
      return this.tabUsageMultiple;
    }

    throw new BunqException(ERROR_NULL_FIELDS);
  }

}
