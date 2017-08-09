package com.bunq.sdk.model;

import java.util.Map;

public class BunqResponse<T> {

  private T value;
  private Map<String, String> headers;

  public BunqResponse(T value, Map<String, String> headers) {
    this.value = value;
    this.headers = headers;
  }

  public T getValue() {
    return value;
  }

  public Map<String, String> getHeaders() {
    return headers;
  }

}
