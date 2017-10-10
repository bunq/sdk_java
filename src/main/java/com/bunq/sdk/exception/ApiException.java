package com.bunq.sdk.exception;

public class ApiException extends RuntimeException {

  private int responseCode;

  public ApiException(String message, int responseCode) {
    super(message);

    this.responseCode = responseCode;
  }

  public int getResponseCode() {
    return responseCode;
  }

}
