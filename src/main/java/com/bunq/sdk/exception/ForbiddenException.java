package com.bunq.sdk.exception;

public class ForbiddenException extends ApiException {

  public ForbiddenException(String message, int responseCode) {
    super(message, responseCode);
  }

}
