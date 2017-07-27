package com.bunq.sdk.model;

public class SessionToken extends BunqModel {

  private String token;

  protected SessionToken() {
  }

  public SessionToken(String token) {
    this.token = token;
  }

  public String getToken() {
    return token;
  }

}