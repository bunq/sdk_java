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
 * Show the raw contents of a QR code. First you need to created a QR code using
 * ../cash-register/{id}/qr-code.
 */
public class CashRegisterQrCodeContent extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/cash-register/%s/qr-code/%s/content";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "CashRegisterQrCodeContent";

  /**
   * Show the raw contents of a QR code
   */
  public static BunqResponse<byte[]> list(Integer cashRegisterId, Integer qrCodeId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), cashRegisterId, qrCodeId), params, customHeaders);

    return new BunqResponse<>(responseRaw.getBodyBytes(), responseRaw.getHeaders());
  }

  public static BunqResponse<byte[]> list() {
    return list(null, null, null, null, null);
  }
  public static BunqResponse<byte[]> list(Integer cashRegisterId) {
    return list(cashRegisterId, null, null, null, null);
  }
  public static BunqResponse<byte[]> list(Integer cashRegisterId, Integer qrCodeId) {
    return list(cashRegisterId, qrCodeId, null, null, null);
  }
  public static BunqResponse<byte[]> list(Integer cashRegisterId, Integer qrCodeId, Integer monetaryAccountId) {
    return list(cashRegisterId, qrCodeId, monetaryAccountId, null, null);
  }
  public static BunqResponse<byte[]> list(Integer cashRegisterId, Integer qrCodeId, Integer monetaryAccountId, Map<String, String> params) {
    return list(cashRegisterId, qrCodeId, monetaryAccountId, params, null);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static CashRegisterQrCodeContent fromJsonReader(JsonReader reader) {
    return fromJsonReader(CashRegisterQrCodeContent.class, reader);
  }

}
