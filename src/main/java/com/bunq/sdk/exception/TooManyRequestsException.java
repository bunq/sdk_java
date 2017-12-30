package com.bunq.sdk.exception;

public class TooManyRequestsException extends ApiException {

  public TooManyRequestsException(String message, int responseCode, String responseId) {
    super(message, responseCode, responseId);
  }

}
