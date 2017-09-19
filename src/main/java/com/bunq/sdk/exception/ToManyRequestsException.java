package com.bunq.sdk.exception;

public class ToManyRequestsException extends ApiException {

  public ToManyRequestsException(String message, int responseCode) {
    super(message, responseCode);
  }

}
