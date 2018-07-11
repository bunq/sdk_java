package com.bunq.sdk.http;

public class BunqBasicHeader implements Comparable<BunqBasicHeader> {
  private String name;
  private String value;

  /**
   */
  public BunqBasicHeader(String name, String value) {
    this.name = name;
    this.value = value;
  }

  /**
   */
  public String getName() {
    return name;
  }

  /**
   */
  public String getValue() {
    return value;
  }

  @Override
  public int compareTo(BunqBasicHeader o) {
    return getName().compareTo(o.getName());
  }

}
