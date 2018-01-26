package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * Create a batch of tab items.
 */
public class TabItemShopBatch extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/cash-register/%s/tab/%s/tab-item-batch";

  /**
   * Field constants.
   */
  public static final String FIELD_TAB_ITEMS = "tab_items";

  /**
   * Object type.
   */

  /**
   * The list of tab items in the batch.
   */
  @Expose
  @SerializedName("tab_items")
  private List<TabItemShop> tabItems;

  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, String tabUuid) {
    return create(apiContext, requestMap, userId, monetaryAccountId, cashRegisterId, tabUuid, new HashMap<>());
  }

  /**
   * Create tab items as a batch.
   */
  public static BunqResponse<Integer> create(ApiContext apiContext, Map<String, Object> requestMap, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, String tabUuid, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, userId, monetaryAccountId, cashRegisterId, tabUuid), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  /**
   * The list of tab items in the batch.
   */
  public List<TabItemShop> getTabItems() {
    return this.tabItems;
  }

  public void setTabItems(List<TabItemShop> tabItems) {
    this.tabItems = tabItems;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.tabItems != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static TabItemShopBatch fromJsonReader(JsonReader reader) {
    return fromJsonReader(TabItemShopBatch.class, reader);
  }

}
