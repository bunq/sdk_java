package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AttachmentObject;
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
 * This call is used to upload an attachment that can be referenced to in payment requests and
 * payments sent from a specific monetary account. Attachments supported are png, jpg and gif.
 */
public class AttachmentMonetaryAccountApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/attachment";

  /**
   * The attachment.
   */
  @Expose
  @SerializedName("attachment")
  private AttachmentObject attachment;

  /**
   * The ID of the attachment created.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * Create a new monetary account attachment. Create a POST request with a payload that contains
   * the binary representation of the file, without any JSON wrapping. Make sure you define the
   * MIME type (i.e. image/jpeg) in the Content-Type header. You are required to provide a
   * description of the attachment using the X-Bunq-Attachment-Description header.
   */
  public static BunqResponse<Integer> create(Integer monetaryAccountId, Map<String, String> customHeaders, byte[] bytes) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), bytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create( byte[] bytes) {
    return create(null, null, bytes);
  }

  public static BunqResponse<Integer> create(Integer monetaryAccountId, byte[] bytes) {
    return create(monetaryAccountId, null, bytes);
  }

  /**
   * The attachment.
   */
  public AttachmentObject getAttachment() {
    return this.attachment;
  }

  public void setAttachment(AttachmentObject attachment) {
    this.attachment = attachment;
  }

  /**
   * The ID of the attachment created.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.attachment != null) {
      return false;
    }

    if (this.id != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static AttachmentMonetaryAccountApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(AttachmentMonetaryAccountApiObject.class, reader);
  }

}
