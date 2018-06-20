package com.bunq.sdk.http;

import okhttp3.Response;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BunqBasicHeader {
  /**
   * String format constants for signing data
   */
  private static final String DELIMITER_HEADER_NAME_AND_VALUE = ": ";
  private static final String NEWLINE = "\n";

  private final BunqHeader name;
  private final String value;

  public static BunqBasicHeader get(BunqHeader header, Response response) {
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
    return getName().getHeader() + DELIMITER_HEADER_NAME_AND_VALUE + getValue();
  }

  public static String collectForSigning(
          Collection<BunqBasicHeader> basicHeaders,
          BunqHeader exclude,
          Collection<BunqHeader> includes) {
    List<String> headersForSigning = new ArrayList<String>();

    for (BunqBasicHeader basicHeader:basicHeaders) {
      BunqHeader header = basicHeader.getName();

      if (header.equals(exclude)) {
        continue;
      }

      if (header.isBunq() || includes.contains(header)) {
        headersForSigning.add(basicHeader.forSigning());
      }
    }

    Collections.sort(headersForSigning);

    StringBuffer stringBuffer = new StringBuffer();

    for (String header:headersForSigning) {
      stringBuffer.append(header);
      stringBuffer.append(NEWLINE);
    }

    return stringBuffer.toString();
  }
}
