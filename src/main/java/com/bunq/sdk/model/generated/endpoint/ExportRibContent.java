package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.stream.JsonReader;

import java.util.Map;

/**
 * Fetch the raw content of an RIB. The RIB is always in PDF format.
 */
public class ExportRibContent extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/export-rib/%s/content";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "ExportRibContent";

  /**
   * Used to retrieve the raw content of an RIB.
   */
  public static BunqResponse<byte[]> list(Integer exportRibId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), exportRibId), params, customHeaders);

    return new BunqResponse<>(responseRaw.getBodyBytes(), responseRaw.getHeaders());
  }

  public static BunqResponse<byte[]> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<byte[]> list(Integer exportRibId) {
    return list(exportRibId, null, null, null);
  }

  public static BunqResponse<byte[]> list(Integer exportRibId, Integer monetaryAccountId) {
    return list(exportRibId, monetaryAccountId, null, null);
  }

  public static BunqResponse<byte[]> list(Integer exportRibId, Integer monetaryAccountId, Map<String, String> params) {
    return list(exportRibId, monetaryAccountId, params, null);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static ExportRibContent fromJsonReader(JsonReader reader) {
    return fromJsonReader(ExportRibContent.class, reader);
  }

}
