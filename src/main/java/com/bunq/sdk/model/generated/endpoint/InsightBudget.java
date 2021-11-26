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
 * Used to get insights budgets between given time range.
 */
public class InsightBudget extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/insight-budget";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "InsightBudget";

  /**
   */
  public static BunqResponse<List<InsightBudget>> list(Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

    return fromJsonList(InsightBudget.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<InsightBudget>> list() {
    return list(null, null);
  }

  public static BunqResponse<List<InsightBudget>> list(Map<String, String> params) {
    return list(params, null);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static InsightBudget fromJsonReader(JsonReader reader) {
    return fromJsonReader(InsightBudget.class, reader);
  }

}
