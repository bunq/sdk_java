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
 * Fetch the raw content of a tab attachment with given ID. The raw content is the binary
 * representation of a file, without any JSON wrapping.
 */
public class AttachmentTabContent extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/attachment-tab/%s/content";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "AttachmentTabContent";

  /**
   * Get the raw content of a specific attachment.
   */
  public static BunqResponse<byte[]> list(Integer attachmentTabId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), attachmentTabId), params, customHeaders);

    return new BunqResponse<>(responseRaw.getBodyBytes(), responseRaw.getHeaders());
  }

  public static BunqResponse<byte[]> list() {
    return list(null, null, null, null);
  }
  public static BunqResponse<byte[]> list(Integer attachmentTabId) {
    return list(attachmentTabId, null, null, null);
  }
  public static BunqResponse<byte[]> list(Integer attachmentTabId, Integer monetaryAccountId) {
    return list(attachmentTabId, monetaryAccountId, null, null);
  }
  public static BunqResponse<byte[]> list(Integer attachmentTabId, Integer monetaryAccountId, Map<String, String> params) {
    return list(attachmentTabId, monetaryAccountId, params, null);
  }

  /**
   */
  public boolean isAllFieldNull() {
    return true;
  }

  /**
   */
  public static AttachmentTabContent fromJsonReader(JsonReader reader) {
    return fromJsonReader(AttachmentTabContent.class, reader);
  }

}
