package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * Fetch the raw content of a statement export. The returned file format could be MT940, CSV or
 * PDF depending on the statement format specified during the statement creation. The doc won't
 * display the response of a request to get the content of a statement export.
 */
public class CustomerStatementExportContent extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/customer-statement/%s/content";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "CustomerStatementExportContent";

  public static BunqResponse<byte[]> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer customerStatementId) {
    return list(apiContext, userId, monetaryAccountId, customerStatementId, new HashMap<>());
  }

  /**
   */
  public static BunqResponse<byte[]> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer customerStatementId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId, customerStatementId), new HashMap<>(), customHeaders);

    return new BunqResponse<>(responseRaw.getBodyBytes(), responseRaw.getHeaders());
  }

}
