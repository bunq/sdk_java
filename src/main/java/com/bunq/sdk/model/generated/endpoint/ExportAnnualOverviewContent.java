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
 * Fetch the raw content of an annual overview. The annual overview is always in PDF format. Doc
 * won't display the response of a request to get the content of an annual overview.
 */
public class ExportAnnualOverviewContent extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/export-annual-overview/%s/content";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "ExportAnnualOverviewContent";

  /**
   * Used to retrieve the raw content of an annual overview.
   */
  public static BunqResponse<byte[]> list(Integer exportAnnualOverviewId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), exportAnnualOverviewId), params, customHeaders);

    return new BunqResponse<>(responseRaw.getBodyBytes(), responseRaw.getHeaders());
  }

  public static BunqResponse<byte[]> list() {
    return list(null, null, null);
  }
  public static BunqResponse<byte[]> list(Integer exportAnnualOverviewId) {
    return list(exportAnnualOverviewId, null, null);
  }
  public static BunqResponse<byte[]> list(Integer exportAnnualOverviewId, Map<String, String> params) {
    return list(exportAnnualOverviewId, params, null);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static ExportAnnualOverviewContent fromJsonReader(JsonReader reader) {
    return fromJsonReader(ExportAnnualOverviewContent.class, reader);
  }

}
