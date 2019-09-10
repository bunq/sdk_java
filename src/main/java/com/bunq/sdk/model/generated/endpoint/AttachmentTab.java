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
 * This call is used to upload an attachment that will be accessible only through tabs. This can
 * be used for example to upload special promotions or other attachments. Attachments supported
 * are png, jpg and gif.
 */
public class AttachmentTab extends BunqModel {

    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/attachment-tab";
    protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/attachment-tab/%s";

    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_GET = "AttachmentTab";

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
     * Upload a new attachment to use with a tab, and to read its metadata. Create a POST request
     * with a payload that contains the binary representation of the file, without any JSON
     * wrapping. Make sure you define the MIME type (i.e. image/jpeg) in the Content-Type header.
     * You are required to provide a description of the attachment using the
     * X-Bunq-Attachment-Description header.
     */
    public static BunqResponse<Integer> create(Integer monetaryAccountId, Map<String, String> customHeaders, byte[] bytes) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), bytes, customHeaders);

        return processForId(responseRaw);
    }

    public static BunqResponse<Integer> create(byte[] bytes) {
        return create(null, null, bytes);
    }

    public static BunqResponse<Integer> create(Integer monetaryAccountId, byte[] bytes) {
        return create(monetaryAccountId, null, bytes);
    }

    /**
     * Get a specific attachment. The header of the response contains the content-type of the
     * attachment.
     */
    public static BunqResponse<AttachmentTab> get(Integer attachmentTabId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), attachmentTabId), params, customHeaders);

        return fromJson(AttachmentTab.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<AttachmentTab> get() {
        return get(null, null, null, null);
    }

    public static BunqResponse<AttachmentTab> get(Integer attachmentTabId) {
        return get(attachmentTabId, null, null, null);
    }

    public static BunqResponse<AttachmentTab> get(Integer attachmentTabId, Integer monetaryAccountId) {
        return get(attachmentTabId, monetaryAccountId, null, null);
    }

    public static BunqResponse<AttachmentTab> get(Integer attachmentTabId, Integer monetaryAccountId, Map<String, String> params) {
        return get(attachmentTabId, monetaryAccountId, params, null);
    }

    /**
     *
     */
    public static AttachmentTab fromJsonReader(JsonReader reader) {
        return fromJsonReader(AttachmentTab.class, reader);
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
     *
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
