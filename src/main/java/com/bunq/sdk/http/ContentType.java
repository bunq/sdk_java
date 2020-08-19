package com.bunq.sdk.http;

import okhttp3.MediaType;

public enum ContentType {
    JSON("application/json; charset=utf-8");

    private final String contentType;

    /**
     *
     */
    ContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     *
     */
    public MediaType getMediaType() {
        return MediaType.parse(this.contentType);
    }
}
