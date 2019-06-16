package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 *
 */
public class AttachmentPublic extends BunqModel {

    /**
     * The uuid of the attachment.
     */
    @Expose
    @SerializedName("uuid")
    private String uuid;

    /**
     * The description of the attachment.
     */
    @Expose
    @SerializedName("description")
    private String description;

    /**
     * The content type of the attachment's file.
     */
    @Expose
    @SerializedName("content_type")
    private String contentType;

    /**
     *
     */
    public static AttachmentPublic fromJsonReader(JsonReader reader) {
        return fromJsonReader(AttachmentPublic.class, reader);
    }

    /**
     * The uuid of the attachment.
     */
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * The description of the attachment.
     */
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The content type of the attachment's file.
     */
    public String getContentType() {
        return this.contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.uuid != null) {
            return false;
        }

        if (this.description != null) {
            return false;
        }

        if (this.contentType != null) {
            return false;
        }

        return true;
    }

}
