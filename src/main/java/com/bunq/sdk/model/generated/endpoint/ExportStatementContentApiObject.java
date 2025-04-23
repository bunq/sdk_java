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
 * Fetch the raw content of a statement export. The returned file format could be MT940, CSV or
 * PDF depending on the statement format specified during the statement creation. The doc won't
 * display the response of a request to get the content of a statement export.
 */
public class ExportStatementContentApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/customer-statement/%s/content";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "ExportStatementContent";

  /**
   */
  public static BunqResponse<byte[]> list(Integer customerStatementId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), customerStatementId), params, customHeaders);

    return new BunqResponse<>(responseRaw.getBodyBytes(), responseRaw.getHeaders());
  }

  public static BunqResponse<byte[]> list() {
    return list(null, null, null, null);
  }
  public static BunqResponse<byte[]> list(Integer customerStatementId) {
    return list(customerStatementId, null, null, null);
  }
  public static BunqResponse<byte[]> list(Integer customerStatementId, Integer monetaryAccountId) {
    return list(customerStatementId, monetaryAccountId, null, null);
  }
  public static BunqResponse<byte[]> list(Integer customerStatementId, Integer monetaryAccountId, Map<String, String> params) {
    return list(customerStatementId, monetaryAccountId, params, null);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static ExportStatementContentApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(ExportStatementContentApiObject.class, reader);
  }

}
