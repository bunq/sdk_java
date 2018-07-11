package com.bunq.sdk.http;

import com.sun.org.apache.xpath.internal.functions.FuncBoolean;
import okhttp3.Response;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BunqBasicHeader implements Comparable<BunqBasicHeader> {
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
          Collection<BunqBasicHeader> allBasicHeader,
          BunqHeader exclude,
          Collection<BunqHeader> allNonBunqHeaderToInclude) {
    List<String> allHeaderForSigning = new ArrayList<String>();

    for (BunqBasicHeader basicHeader:allBasicHeader) {
      addHeaderForSigningIfNeeded(basicHeader, allHeaderForSigning, allNonBunqHeaderToInclude);
    }

    Collections.sort(allHeaderForSigning);

    return  formatAllHeaderForSigning(allHeaderForSigning);
  }

  private static void addHeaderForSigningIfNeeded(
      BunqBasicHeader basicHeader,
      List<String> allHeaderForSigning,
      Collection<BunqHeader> allNonBunqHeaderToInclude
  ) {
    BunqHeader header = basicHeader.getName();

    if (header.isBunq() || allNonBunqHeaderToInclude.contains(header)) {
      allHeaderForSigning.add(basicHeader.forSigning());
    }
  }

  private static String formatAllHeaderForSigning(List<String> allHeaderForSigning) {
    StringBuilder stringBuilder = new StringBuilder();

    for (String header: allHeaderForSigning) {
      stringBuilder.append(header);
      stringBuilder.append(NEWLINE);
    }

    stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(NEWLINE));

    return stringBuilder.toString();
  }

  @Override
  public int compareTo(BunqBasicHeader o) {
    return getName().compareTo(o.getName());
  }

}
