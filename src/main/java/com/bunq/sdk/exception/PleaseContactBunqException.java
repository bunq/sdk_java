package com.bunq.sdk.exception;

public class PleaseContactBunqException extends ApiException {

  public PleaseContactBunqException(String message, int responseCode, String responseId) {
    super(message, responseCode, responseId);
  }

}
