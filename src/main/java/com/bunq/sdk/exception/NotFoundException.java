package com.bunq.sdk.exception;

public class NotFoundException extends ApiException {

  public NotFoundException(String message, int responseCode) {
    super(message, responseCode);
  }

}
