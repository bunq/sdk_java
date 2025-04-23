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
 * This call is used to upload an attachment that can be referenced to as an avatar (through the
 * Avatar endpoint) or in a tab sent. Attachments supported are png, jpg and gif.
 */
public class AttachmentPublicApiObject extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "attachment-public";
  protected static final String ENDPOINT_URL_READ = "attachment-public/%s";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_POST = "Uuid";
  protected static final String OBJECT_TYPE_GET = "AttachmentPublic";

  /**
   * The UUID of the attachment.
   */
  @Expose
  @SerializedName("uuid")
  private String uuid;

  /**
   * The timestamp of the attachment's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the attachment's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The attachment.
   */
  @Expose
  @SerializedName("attachment")
  private AttachmentObject attachment;

  /**
   * Create a new public attachment. Create a POST request with a payload that contains a binary
   * representation of the file, without any JSON wrapping. Make sure you define the MIME type
   * (i.e. image/jpeg, or image/png) in the Content-Type header. You are required to provide a
   * description of the attachment using the X-Bunq-Attachment-Description header.
   */
  public static BunqResponse<String> create(Map<String, String> customHeaders, byte[] bytes) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.post(ENDPOINT_URL_CREATE, bytes, customHeaders);

    return processForUuid(responseRaw);
  }

  public static BunqResponse<String> create( byte[] bytes) {
    return create(null, bytes);
  }

  /**
   * Get a specific attachment's metadata through its UUID. The Content-Type header of the
   * response will describe the MIME type of the attachment file.
   */
  public static BunqResponse<AttachmentPublicApiObject> get(String attachmentPublicUuid, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, attachmentPublicUuid), params, customHeaders);

    return fromJson(AttachmentPublicApiObject.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<AttachmentPublicApiObject> get() {
    return get(null, null, null);
  }

  public static BunqResponse<AttachmentPublicApiObject> get(String attachmentPublicUuid) {
    return get(attachmentPublicUuid, null, null);
  }

  public static BunqResponse<AttachmentPublicApiObject> get(String attachmentPublicUuid, Map<String, String> params) {
    return get(attachmentPublicUuid, params, null);
  }

  /**
   * The UUID of the attachment.
   */
  public String getUuid() {
    return this.uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * The timestamp of the attachment's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the attachment's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
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
   */
  public boolean isAllFieldNull() {
    if (this.uuid != null) {
      return false;
    }

    if (this.created != null) {
      return false;
    }

    if (this.updated != null) {
      return false;
    }

    if (this.attachment != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static AttachmentPublicApiObject fromJsonReader(JsonReader reader) {
    return fromJsonReader(AttachmentPublicApiObject.class, reader);
  }

}
