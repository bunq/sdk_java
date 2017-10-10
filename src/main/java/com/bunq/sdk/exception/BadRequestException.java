package com.bunq.sdk.exception;

public class BadRequestException extends ApiException {

  public BadRequestException(String message, int responseCode) {
    super(message, responseCode);
  }

}
