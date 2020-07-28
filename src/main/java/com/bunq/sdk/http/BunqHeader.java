package com.bunq.sdk.http;

import java.util.Collection;
import java.util.Map;

public enum BunqHeader {
  ATTACHMENT_DESCRIPTION("X-Bunq-Attachment-Description"),
  CACHE_CONTROL("Cache-Control", "no-cache"),
  CLIENT_AUTHENTICATION("X-Bunq-Client-Authentication"),
  CLIENT_ENCRYPTION_HMAC("X-Bunq-Client-Encryption-Hmac"),
  CLIENT_ENCRYPTION_IV("X-Bunq-Client-Encryption-Iv"),
  CLIENT_ENCRYPTION_KEY("X-Bunq-Client-Encryption-Key"),
  CLIENT_REQUEST_ID("X-Bunq-Client-Request-Id"),
  CLIENT_RESPONSE_ID("X-Bunq-Client-Response-Id", "Could not determine response id."),
  CLIENT_SIGNATURE("X-Bunq-Client-Signature"),
  CONTENT_TYPE("Content-Type"),
  GEOLOCATION("X-Bunq-Geolocation", "0 0 0 0 000"),
  LANGUAGE("X-Bunq-Language", "en_US"),
  REGION("X-Bunq-Region", "nl_NL"),
  SERVER_SIGNATURE("X-Bunq-Server-Signature"),
  USER_AGENT("User-Agent", "bunq-sdk-java/1.14.0");

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

  public static BunqHeader parseHeaderOrNull(String value) {
    for (BunqHeader header : values()) {
      if (header.equals(value)) {
        return header;
      }
    }

    return null;
  }

  public String getHeaderName() {
    return header;
  }

  public String getDefaultValue() {
    return defaultValue;
  }

  private String getHeaderValueOrDefault(String value) {
    if (value != null) {
      return value;
    }

    return getDefaultValue();
  }

  public void addTo(Map<String, String> headers, String value) {
    headers.put(getHeaderName(), getHeaderValueOrDefault(value));
  }

  public void addTo(BunqRequestBuilder requestBuilder) {
    addTo(requestBuilder, null);
  }

  public void addTo(BunqRequestBuilder requestBuilder, String value) {
    requestBuilder.addHeader(getHeaderName(), getHeaderValueOrDefault(value));
  }

  public boolean equals(String header) {
    return getHeaderName().equalsIgnoreCase(header);
  }

  public boolean isBunq() {
    return getHeaderName().startsWith(PREFIX);
  }

  private String findKeyOrNull(Collection<String> keys) {
    for (String key : keys) {
      if (this.equals(key)) {
        return key;
      }
    }

    return null;
  }

  public String getHeaderValueOrDefault(Map<String, String> headers) {
    String key = findKeyOrNull(headers.keySet());

    if (key != null && headers.get(key) != null) {
      return headers.get(key);
    }

    return getDefaultValue();
  }

}
