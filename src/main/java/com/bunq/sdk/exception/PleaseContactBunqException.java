package com.bunq.sdk.exception;

public class PleaseContactBunqException extends ApiException {

  public PleaseContactBunqException(String message, int responseCode) {
    super(message, responseCode);
  }

}
