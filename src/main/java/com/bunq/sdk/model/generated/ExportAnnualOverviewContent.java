package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.BunqResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Fetch the raw content of an annual overview. The annual overview is always in PDF format. Doc
 * won't display the response of a request to get the content of an annual overview.
 */
public class ExportAnnualOverviewContent extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_LISTING = "user/%s/export-annual-overview/%s/content";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "ExportAnnualOverviewContent";

  public static BunqResponse<byte[]> list(ApiContext apiContext, Integer userId,
      Integer exportAnnualOverviewId) {
    return list(apiContext, userId, exportAnnualOverviewId, new HashMap<>());
  }

  /**
   * Used to retrieve the raw content of an annual overview.
   */
  public static BunqResponse<byte[]> list(ApiContext apiContext, Integer userId,
      Integer exportAnnualOverviewId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_LISTING, userId, exportAnnualOverviewId), customHeaders);

    return new BunqResponse<>(responseRaw.getBodyBytes(), responseRaw.getHeaders());
  }

}
