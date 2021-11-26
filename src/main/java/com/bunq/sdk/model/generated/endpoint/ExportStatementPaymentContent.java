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
 * Fetch the raw content of a payment statement export.
 */
public class ExportStatementPaymentContent extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/event/%s/statement/%s/content";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "ExportStatementPayment";

  /**
   */
  public static BunqResponse<byte[]> list(Integer eventId, Integer statementId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), eventId, statementId), params, customHeaders);

    return new BunqResponse<>(responseRaw.getBodyBytes(), responseRaw.getHeaders());
  }

  public static BunqResponse<byte[]> list() {
    return list(null, null, null, null, null);
  }
  public static BunqResponse<byte[]> list(Integer eventId) {
    return list(eventId, null, null, null, null);
  }
  public static BunqResponse<byte[]> list(Integer eventId, Integer statementId) {
    return list(eventId, statementId, null, null, null);
  }
  public static BunqResponse<byte[]> list(Integer eventId, Integer statementId, Integer monetaryAccountId) {
    return list(eventId, statementId, monetaryAccountId, null, null);
  }
  public static BunqResponse<byte[]> list(Integer eventId, Integer statementId, Integer monetaryAccountId, Map<String, String> params) {
    return list(eventId, statementId, monetaryAccountId, params, null);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static ExportStatementPaymentContent fromJsonReader(JsonReader reader) {
    return fromJsonReader(ExportStatementPaymentContent.class, reader);
  }

}
