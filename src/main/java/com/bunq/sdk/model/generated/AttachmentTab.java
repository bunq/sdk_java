package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.BunqResponse;
import com.bunq.sdk.model.generated.object.Attachment;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/**
 * This call is used to upload an attachment that will be accessible only through tabs. This can
 * be used for example to upload special promotions or other attachments. Attachments supported
 * are png, jpg and gif.
 */
public class AttachmentTab extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/attachment-tab";
  private static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/attachment-tab/%s";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "AttachmentTab";

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

  public static BunqResponse<Integer> create(ApiContext apiContext, byte[] bytes, Integer userId,
      Integer monetaryAccountId) {
    return create(apiContext, bytes, userId, monetaryAccountId, new HashMap<>());
  }

  /**
   * Upload a new attachment to use with a tab, and to read its metadata. Create a POST request
   * with a payload that contains the binary representation of the file, without any JSON
   * wrapping. Make sure you define the MIME type (i.e. image/jpeg) in the Content-Type header.
   * You are required to provide a description of the attachment using the
   * X-Bunq-Attachment-Description header.
   */
  public static BunqResponse<Integer> create(ApiContext apiContext, byte[] bytes, Integer userId,
      Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .post(String.format(ENDPOINT_URL_CREATE, userId, monetaryAccountId), bytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<AttachmentTab> get(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId, Integer attachmentTabId) {
    return get(apiContext, userId, monetaryAccountId, attachmentTabId, new HashMap<>());
  }

  /**
   * Get a specific attachment. The header of the response contains the content-type of the
   * attachment.
   */
  public static BunqResponse<AttachmentTab> get(ApiContext apiContext, Integer userId,
      Integer monetaryAccountId, Integer attachmentTabId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient
        .get(String.format(ENDPOINT_URL_READ, userId, monetaryAccountId, attachmentTabId),
            customHeaders);

    return fromJson(AttachmentTab.class, responseRaw, OBJECT_TYPE);
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

}
