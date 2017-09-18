package com.bunq.sdk.exception;

public class PleaseContactBunqException extends BunqError {

  public PleaseContactBunqException(String message, int responseCode) {
    super(message, responseCode);
  }
}
