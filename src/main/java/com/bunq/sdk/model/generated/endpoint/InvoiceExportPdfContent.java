package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.stream.JsonReader;

import java.util.Map;

/**
 * Get a PDF export of an invoice.
 */
public class InvoiceExportPdfContent extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/invoice/%s/pdf-content";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "InvoiceExportPdfContent";

  /**
   */
  public static BunqResponse<byte[]> list(Integer invoiceId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), invoiceId), params, customHeaders);

    return new BunqResponse<>(responseRaw.getBodyBytes(), responseRaw.getHeaders());
  }

  public static BunqResponse<byte[]> list() {
    return list(null, null, null);
  }

  public static BunqResponse<byte[]> list(Integer invoiceId) {
    return list(invoiceId, null, null);
  }

  public static BunqResponse<byte[]> list(Integer invoiceId, Map<String, String> params) {
    return list(invoiceId, params, null);
  }

  /**
   */
  public static InvoiceExportPdfContent fromJsonReader(JsonReader reader) {
    return fromJsonReader(InvoiceExportPdfContent.class, reader);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

}
