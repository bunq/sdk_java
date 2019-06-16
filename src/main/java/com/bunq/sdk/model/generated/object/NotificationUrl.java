package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 *
 */
public class NotificationUrl extends BunqModel {

    /**
     *
     */
    @Expose
    @SerializedName("target_url")
    private String targetUrl;

    /**
     *
     */
    @Expose
    @SerializedName("category")
    private String category;

    /**
     *
     */
    @Expose
    @SerializedName("event_type")
    private String eventType;

    /**
     *
     */
    @Expose
    @SerializedName("object")
    private NotificationAnchorObject object;

    /**
     *
     */
    public static NotificationUrl fromJsonReader(JsonReader reader) {
        return fromJsonReader(NotificationUrl.class, reader);
    }

    /**
     *
     */
    public String getTargetUrl() {
        return this.targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    /**
     *
     */
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     *
     */
    public String getEventType() {
        return this.eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     *
     */
    public NotificationAnchorObject getObject() {
        return this.object;
    }

    public void setObject(NotificationAnchorObject object) {
        this.object = object;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.targetUrl != null) {
            return false;
        }

        if (this.category != null) {
            return false;
        }

        if (this.eventType != null) {
            return false;
        }

        if (this.object != null) {
            return false;
        }

        return true;
    }

}
