package com.bunq.sdk.http;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public enum BunqHeader {
    attachmentDescription("X-Bunq-Attachment-Description"),
    cacheControl("Cache-Control","no-cache"),
    contentType("Content-Type"),
    clientAuthentication("X-Bunq-Client-Authentication"),
    clientEncryptionHMAC("X-Bunq-Client-Encryption-Hmac"),
    clientEncryptionIV("X-Bunq-Client-Encryption-Iv"),
    clientEncryptionKey("X-Bunq-Client-Encryption-Key"),
    clientRequestId("X-Bunq-Client-Request-Id"),
    clientSignature("X-Bunq-Client-Signature"),
    clientResponseId("X-Bunq-Client-Response-Id","Could not determine response id."),
    geolocation("X-Bunq-Geolocation","0 0 0 0 000"),
    language("X-Bunq-Language","en_US"),
    region("X-Bunq-Region","nl_NL"),
    serverSignature("X-Bunq-Server-Signature"),
    userAgent("User-Agent","bunq-sdk-java/0.13.1");

    private static final String PREFIX = "X-Bunq-";

    private final String header;
    private final String defaultValue;

    BunqHeader(String header) {
        this(header,null);
    }

    BunqHeader(String header, String defaultValue) {
        this.header = header;
        this.defaultValue = defaultValue;
    }

    public static Optional<BunqHeader> parse(String value) {
        return Stream.of(values()).filter(h->h.equals(value)).findAny();
    }

    public String getHeader() {
        return header;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void addTo(Map<String,String> headers, String value) {
        headers.put(getHeader(),value!=null?value:getDefaultValue());
    }

    public void addTo(BunqRequestBuilder requestBuilder) {
        addTo(requestBuilder,null);
    }

    public void addTo(BunqRequestBuilder requestBuilder, String value) {
        requestBuilder.addHeader(getHeader(),value!=null?value:getDefaultValue());
    }

    public boolean equals(String header) {
        return getHeader().equalsIgnoreCase(header);
    }

    public boolean isBunq() {
        return getHeader().startsWith(PREFIX);
    }

    public String getOrDefault(Map<String,String> headers) {
        Optional<String> key = headers.keySet().stream().filter(this::equals).findAny();
        return key.map(headers::get).orElse(getDefaultValue());
    }
}