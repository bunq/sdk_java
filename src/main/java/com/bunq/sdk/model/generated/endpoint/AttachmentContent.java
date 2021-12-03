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
 * Fetch the raw content of an attachment.
 */
public class AttachmentContent extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "attachment-content/%s";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "AttachmentContent";

  /**
   */
  public static BunqResponse<AttachmentContent> get(String attachmentContentUuid, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, attachmentContentUuid), params, customHeaders);

    return fromJson(AttachmentContent.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<AttachmentContent> get() {
    return get(null, null, null);
  }

  public static BunqResponse<AttachmentContent> get(String attachmentContentUuid) {
    return get(attachmentContentUuid, null, null);
  }

  public static BunqResponse<AttachmentContent> get(String attachmentContentUuid, Map<String, String> params) {
    return get(attachmentContentUuid, params, null);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static AttachmentContent fromJsonReader(JsonReader reader) {
    return fromJsonReader(AttachmentContent.class, reader);
  }

}
