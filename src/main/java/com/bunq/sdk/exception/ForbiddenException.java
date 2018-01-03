package com.bunq.sdk.exception;

public class ForbiddenException extends ApiException {

  public ForbiddenException(String message, int responseCode, String responseId) {
    super(message, responseCode, responseId);
  }

}
