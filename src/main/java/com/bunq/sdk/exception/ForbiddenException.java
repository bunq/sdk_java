package com.bunq.sdk.exception;

public class ForbiddenException extends BunqError {

  public ForbiddenException(String message, int responseCode) {
    super(message, responseCode);
  }
}
