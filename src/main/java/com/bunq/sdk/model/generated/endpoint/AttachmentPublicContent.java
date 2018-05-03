package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.stream.JsonReader;

import java.util.Map;

/**
 * Fetch the raw content of a public attachment with given ID. The raw content is the binary
 * representation of a file, without any JSON wrapping.
 */
public class AttachmentPublicContent extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "attachment-public/%s/content";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "AttachmentPublicContent";

  /**
   * Get the raw content of a specific attachment.
   */
  public static BunqResponse<byte[]> list(String attachmentPublicUuid, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, attachmentPublicUuid), params, customHeaders);

    return new BunqResponse<>(responseRaw.getBodyBytes(), responseRaw.getHeaders());
  }
  public static BunqResponse<byte[]> list() {
    return list(null, null, null);
  }
  public static BunqResponse<byte[]> list(String attachmentPublicUuid) {
    return list(attachmentPublicUuid, null, null);
  }
  public static BunqResponse<byte[]> list(String attachmentPublicUuid, Map<String, String> params) {
    return list(attachmentPublicUuid, params, null);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static AttachmentPublicContent fromJsonReader(JsonReader reader) {
    return fromJsonReader(AttachmentPublicContent.class, reader);
  }

}
