package com.bunq.sdk.exception;

public class ToManyRequestsException extends BunqError {

  public ToManyRequestsException(String message, int responseCode) {
    super(message, responseCode);
  }
}
