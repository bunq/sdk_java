package com.bunq.sdk.http;

import java.util.Collection;
import java.util.Map;

public enum BunqHeader {
    attachmentDescription("X-Bunq-Attachment-Description"),
    cacheControl("Cache-Control", "no-cache"),
    contentType("Content-Type"),
    clientAuthentication("X-Bunq-Client-Authentication"),
    clientEncryptionHMAC("X-Bunq-Client-Encryption-Hmac"),
    clientEncryptionIV("X-Bunq-Client-Encryption-Iv"),
    clientEncryptionKey("X-Bunq-Client-Encryption-Key"),
    clientRequestId("X-Bunq-Client-Request-Id"),
    clientSignature("X-Bunq-Client-Signature"),
    clientResponseId("X-Bunq-Client-Response-Id", "Could not determine response id."),
    geolocation("X-Bunq-Geolocation", "0 0 0 0 000"),
    language("X-Bunq-Language", "en_US"),
    region("X-Bunq-Region", "nl_NL"),
    serverSignature("X-Bunq-Server-Signature"),
    userAgent("User-Agent", "bunq-sdk-java/0.13.1");

    private static final String PREFIX = "X-Bunq-";

    private final String header;
    private final String defaultValue;

    BunqHeader(String header) {
        this(header, null);
    }

    BunqHeader(String header, String defaultValue) {
        this.header = header;
        this.defaultValue = defaultValue;
    }

    public static BunqHeader parse(String value) {
        for (BunqHeader header:values()) {
            if (header.equals(value)) {
                return header;
            }
        }

        return null;
    }

    public String getHeader() {
        return header;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    private String getOrDefault(String value) {
        if (value != null) {
            return value;
        }

        return getDefaultValue();
    }

    public void addTo(Map<String, String> headers, String value) {
        headers.put(getHeader(), getOrDefault(value));
    }

    public void addTo(BunqRequestBuilder requestBuilder) {
        addTo(requestBuilder, null);
    }

    public void addTo(BunqRequestBuilder requestBuilder, String value) {
        requestBuilder.addHeader(getHeader(), getOrDefault(value));
    }

    public boolean equals(String header) {
        return getHeader().equalsIgnoreCase(header);
    }

    public boolean isBunq() {
        return getHeader().startsWith(PREFIX);
    }

    private String findKey(Collection<String> keys) {
        for (String key:keys) {
            if (this.equals(key)) {
                return key;
            }
        }

        return null;
    }

    public String getOrDefault(Map<String, String> headers) {
        String key = findKey(headers.keySet());
        if (key != null && headers.get(key) != null) {
            return headers.get(key);
        }
        return getDefaultValue();
    }
}
