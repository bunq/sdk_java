package com.bunq.sdk.exception;

public class UnauthorizedException extends ApiException {

  public UnauthorizedException(String message, int responseCode) {
    super(message, responseCode);
  }

}
