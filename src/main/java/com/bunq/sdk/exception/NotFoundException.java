package com.bunq.sdk.exception;

public class NotFoundException extends BunqError {

  public NotFoundException(String message, int responseCode) {
    super(message, responseCode);
  }
}
