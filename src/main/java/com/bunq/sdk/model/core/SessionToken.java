package com.bunq.sdk.model.core;

public class SessionToken extends BunqModel {

  private String token;

  protected SessionToken() {
  }

  @Override
  public boolean isAllFieldNull() {
    if (this.token == null) {
      return false;
    }

    return true;
  }

  public SessionToken(String token) {
    this.token = token;
  }

  public String getToken() {
    return token;
  }

}