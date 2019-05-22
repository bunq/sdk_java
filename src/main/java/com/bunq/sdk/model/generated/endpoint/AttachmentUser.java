package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.Attachment;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.Map;

/**
 * This call is used to upload an attachment that is accessible only by a specific user. This
 * can be used for example to upload passport scans or other documents. Attachments supported
 * are png, jpg and gif.
 */
public class AttachmentUser extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_READ = "user/%s/attachment/%s";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "AttachmentUser";

  /**
   * The id of the attachment.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

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
  private Attachment attachment;

  /**
   * Get a specific attachment. The header of the response contains the content-type of the
   * attachment.
   */
  public static BunqResponse<AttachmentUser> get(Integer attachmentUserId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), attachmentUserId), params, customHeaders);

    return fromJson(AttachmentUser.class, responseRaw);
  }

  public static BunqResponse<AttachmentUser> get() {
    return get(null, null, null);
  }

  public static BunqResponse<AttachmentUser> get(Integer attachmentUserId) {
    return get(attachmentUserId, null, null);
  }

  public static BunqResponse<AttachmentUser> get(Integer attachmentUserId, Map<String, String> params) {
    return get(attachmentUserId, params, null);
  }

  /**
   */
  public static AttachmentUser fromJsonReader(JsonReader reader) {
    return fromJsonReader(AttachmentUser.class, reader);
  }

  /**
   * The id of the attachment.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
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
  public Attachment getAttachment() {
    return this.attachment;
  }

  public void setAttachment(Attachment attachment) {
    this.attachment = attachment;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
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

}
