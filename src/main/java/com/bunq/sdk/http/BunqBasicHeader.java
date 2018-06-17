package com.bunq.sdk.http;

import okhttp3.Response;

public class BunqBasicHeader {
  private final BunqHeader name;
  private final String value;

  public static BunqBasicHeader get(BunqHeader header,Response response) {
    return new BunqBasicHeader(header,response.header(header.getHeader()));
  }

  public BunqBasicHeader(String name, String value) {
    this(BunqHeader.parse(name).get(),value);
  }

  public BunqBasicHeader(BunqHeader name, String value) {
    this.name = name;
    this.value = value;
  }

  public BunqHeader getName() {
    return name;
  }

  public String getValue() {
    return value;
  }
}
