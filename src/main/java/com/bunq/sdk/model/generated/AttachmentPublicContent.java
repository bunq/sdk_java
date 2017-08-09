package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import java.util.HashMap;
import java.util.Map;

/**
 * Fetch the raw content of a public attachment with given ID. The raw content is the binary
 * representation of a file, without any JSON wrapping.
 */
public class AttachmentPublicContent extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_LISTING = "attachment-public/%s/content";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "AttachmentPublicContent";

  public static BunqResponse<byte[]> list(ApiContext apiContext, String attachmentPublicUuid) {
    return list(apiContext, attachmentPublicUuid, new HashMap<>());
  }

  /**
   * Get the raw content of a specific attachment.
   */
  public static BunqResponse<byte[]> list(ApiContext apiContext, String attachmentPublicUuid,
      Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_LISTING, attachmentPublicUuid), customHeaders);

    return new BunqResponse<>(responseRaw.getBodyBytes(), responseRaw.getHeaders());
  }

}
