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
 * This call returns the raw content of the QR code that links to this draft share invite. When
 * a bunq user scans this QR code with the bunq app the draft share invite will be shown on
 * his/her device.
 */
public class DraftShareInviteApiKeyQrCodeContent extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/draft-share-invite-api-key/%s/qr-code-content";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "DraftShareInviteApiKeyQrCodeContent";

  /**
   * Returns the raw content of the QR code that links to this draft share invite. The raw content
   * is the binary representation of a file, without any JSON wrapping.
   */
  public static BunqResponse<byte[]> list(Integer draftShareInviteApiKeyId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), draftShareInviteApiKeyId), params, customHeaders);

    return new BunqResponse<>(responseRaw.getBodyBytes(), responseRaw.getHeaders());
  }

  public static BunqResponse<byte[]> list() {
    return list(null, null, null);
  }
  public static BunqResponse<byte[]> list(Integer draftShareInviteApiKeyId) {
    return list(draftShareInviteApiKeyId, null, null);
  }
  public static BunqResponse<byte[]> list(Integer draftShareInviteApiKeyId, Map<String, String> params) {
    return list(draftShareInviteApiKeyId, params, null);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static DraftShareInviteApiKeyQrCodeContent fromJsonReader(JsonReader reader) {
    return fromJsonReader(DraftShareInviteApiKeyQrCodeContent.class, reader);
  }

}
