package com.bunq.sdk.model.core;

/**
 * Enum for the OAuth authorization grant.
 */
public enum OauthGrantType {

  AUTHORIZATION_CODE(
      "authorization_code"
  );

  private final String grantType;

  OauthGrantType(String grantType) {
    this.grantType = grantType;
  }

  public String toString() {
    return this.grantType;
  }

}
