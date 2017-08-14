package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to view TabResultResponse objects belonging to a tab. A TabResultResponse is an object
 * that holds details on a tab which has been paid from the provided monetary account.
 */
public class TabResultResponse extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/tab-result-response/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/tab-result-response";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "TabResultResponse";

  /**
   * The Tab details.
   */
  @Expose
  @SerializedName("tab")
  private Tab tab;

  /**
   * The payment made for the Tab.
   */
  @Expose
  @SerializedName("payment")
  private Payment payment;

  public static BunqResponse<TabResultResponse> get(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId, Integer tabResultResponseId) {
    return get(apiContext, userId, monetaryAccountId, tabResultResponseId, new HashMap<>());
  }

  /**
   * Used to view a single TabResultResponse belonging to a tab.
   */
  public static BunqResponse<TabResultResponse> get(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId, Integer tabResultResponseId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_READ, userId, monetaryAccountId, tabResultResponseId),
            customHeaders);

    return fromJson(TabResultResponse.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<List<TabResultResponse>> list(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId) {
    return list(apiContext, userId, monetaryAccountId, new HashMap<>());
  }

  /**
   * Used to view a list of TabResultResponse objects belonging to a tab.
   */
  public static BunqResponse<List<TabResultResponse>> list(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId), customHeaders);

    return fromJsonList(TabResultResponse.class, responseRaw, OBJECT_TYPE);
  }

  /**
   * The Tab details.
   */
  public Tab getTab() {
    return this.tab;
  }

  public void setTab(Tab tab) {
    this.tab = tab;
  }

  /**
   * The payment made for the Tab.
   */
  public Payment getPayment() {
    return this.payment;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
  }

}
