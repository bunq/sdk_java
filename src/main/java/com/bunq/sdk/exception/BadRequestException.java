package com.bunq.sdk.exception;

public class BadRequestException extends BunqError {

  public BadRequestException(String message, int responseCode) {
    super(message, responseCode);
  }
}
