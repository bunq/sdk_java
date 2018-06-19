package com.bunq.sdk.http;

import okhttp3.Response;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BunqBasicHeader {
  /**
   * String format constants for signing data
   */
  private static final String DELIMITER_HEADER_NAME_AND_VALUE = ": ";
  private static final String NEWLINE = "\n";

  private final BunqHeader name;
  private final String value;

  public static BunqBasicHeader get(BunqHeader header,Response response) {
    return new BunqBasicHeader(header, response.header(header.getHeader()));
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

  private String forSigning() {
    return getName().getHeader()+DELIMITER_HEADER_NAME_AND_VALUE+getValue();
  }

  public static String collectForSigning(Stream<BunqBasicHeader> headers) {
    return headers
            .map(BunqBasicHeader::forSigning)
            .sorted()
            .collect(Collectors.joining(NEWLINE));
  }
}