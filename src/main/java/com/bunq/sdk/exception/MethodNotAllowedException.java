package com.bunq.sdk.exception;

public class MethodNotAllowedException extends BunqError {

  public MethodNotAllowedException(String message, int responseCode) {
    super(message, responseCode);
  }
}
