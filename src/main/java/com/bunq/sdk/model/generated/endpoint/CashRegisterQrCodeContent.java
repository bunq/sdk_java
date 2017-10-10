package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
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
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/cash-register/%s/qr-code/%s/content";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "CashRegisterQrCodeContent";

  public static BunqResponse<byte[]> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, Integer qrCodeId) {
    return list(apiContext, userId, monetaryAccountId, cashRegisterId, qrCodeId, new HashMap<>());
  }

  /**
   * Show the raw contents of a QR code
   */
  public static BunqResponse<byte[]> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer cashRegisterId, Integer qrCodeId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId, cashRegisterId, qrCodeId), new HashMap<>(), customHeaders);

    return new BunqResponse<>(responseRaw.getBodyBytes(), responseRaw.getHeaders());
  }

}
