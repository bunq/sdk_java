package com.bunq.sdk.model.core;

/**
 * Enum for the OAuth response type.
 */
public enum OauthResponseType {

  CODE(
      "code"
  );

  private final String responseType;

  OauthResponseType(String responseType) {
    this.responseType = responseType;
  }

  public String toString() {
    return this.responseType;
  }

}
