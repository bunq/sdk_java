package com.bunq.sdk.exception;

public class UnauthorizedException extends BunqError {

  public UnauthorizedException(String message, int responseCode) {
    super(message, responseCode);
  }
}
