package com.bunq.sdk.exception;

public class TooManyRequestsException extends ApiException {

  public TooManyRequestsException(String message, int responseCode) {
    super(message, responseCode);
  }

}
