package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.BunqResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * This call returns the raw content of the QR code that links to this draft share invite. When
 * a bunq user scans this QR code with the bunq app the draft share invite will be shown on
 * his/her device.
 */
public class DraftShareInviteBankQrCodeContent extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_LISTING = "user/%s/draft-share-invite-bank/%s/qr-code-content";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "DraftShareInviteBankQrCodeContent";

  public static BunqResponse<byte[]> list(ApiContext apiContext, Integer userId,
      Integer draftShareInviteBankId) {
    return list(apiContext, userId, draftShareInviteBankId, new HashMap<>());
  }

  /**
   * Returns the raw content of the QR code that links to this draft share invite. The raw content
   * is the binary representation of a file, without any JSON wrapping.
   */
  public static BunqResponse<byte[]> list(ApiContext apiContext, Integer userId,
      Integer draftShareInviteBankId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_LISTING, userId, draftShareInviteBankId), customHeaders);

    return new BunqResponse<>(responseRaw.getBodyBytes(), responseRaw.getHeaders());
  }

}
