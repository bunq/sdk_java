package com.bunq.sdk.exception;

public class MethodNotAllowedException extends ApiException {

  public MethodNotAllowedException(String message, int responseCode) {
    super(message, responseCode);
  }

}
