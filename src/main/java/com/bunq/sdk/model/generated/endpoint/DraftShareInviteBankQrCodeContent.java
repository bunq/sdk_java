package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.stream.JsonReader;

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
  protected static final String ENDPOINT_URL_LISTING = "user/%s/draft-share-invite-bank/%s/qr-code-content";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "DraftShareInviteBankQrCodeContent";

  /**
   * Returns the raw content of the QR code that links to this draft share invite. The raw content
   * is the binary representation of a file, without any JSON wrapping.
   */
  public static BunqResponse<byte[]> list(Integer draftShareInviteBankId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), draftShareInviteBankId), params, customHeaders);

    return new BunqResponse<>(responseRaw.getBodyBytes(), responseRaw.getHeaders());
  }

  public static BunqResponse<byte[]> list() {
    return list(null, null, null);
  }
  public static BunqResponse<byte[]> list(Integer draftShareInviteBankId) {
    return list(draftShareInviteBankId, null, null);
  }
  public static BunqResponse<byte[]> list(Integer draftShareInviteBankId, Map<String, String> params) {
    return list(draftShareInviteBankId, params, null);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static DraftShareInviteBankQrCodeContent fromJsonReader(JsonReader reader) {
    return fromJsonReader(DraftShareInviteBankQrCodeContent.class, reader);
  }

}
