package com.bunq.sdk.exception;


public class ApiException extends BunqError {

  public ApiException(String message, int responseCode) {
    super(message, responseCode);
  }
}
