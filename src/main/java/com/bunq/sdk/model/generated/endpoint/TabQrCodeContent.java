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
 * This call returns the raw content of the QR code that links to this Tab. When a bunq user
 * scans this QR code with the bunq app the Tab will be shown on his/her device.
 */
public class TabQrCodeContent extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/cash-register/%s/tab/%s/qr-code-content";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "TabQrCodeContent";

  /**
   * Returns the raw content of the QR code that links to this Tab. The raw content is the binary
   * representation of a file, without any JSON wrapping.
   */
  public static BunqResponse<byte[]> list(Integer cashRegisterId, String tabUuid, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId, tabUuid), params, customHeaders);

    return new BunqResponse<>(responseRaw.getBodyBytes(), responseRaw.getHeaders());
  }

  public static BunqResponse<byte[]> list() {
    return list(null, null, null, null, null);
  }
  public static BunqResponse<byte[]> list(Integer cashRegisterId) {
    return list(cashRegisterId, null, null, null, null);
  }
  public static BunqResponse<byte[]> list(Integer cashRegisterId, String tabUuid) {
    return list(cashRegisterId, tabUuid, null, null, null);
  }
  public static BunqResponse<byte[]> list(Integer cashRegisterId, String tabUuid, Integer monetaryAccountId) {
    return list(cashRegisterId, tabUuid, monetaryAccountId, null, null);
  }
  public static BunqResponse<byte[]> list(Integer cashRegisterId, String tabUuid, Integer monetaryAccountId, Map<String, String> params) {
    return list(cashRegisterId, tabUuid, monetaryAccountId, params, null);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static TabQrCodeContent fromJsonReader(JsonReader reader) {
    return fromJsonReader(TabQrCodeContent.class, reader);
  }

}
