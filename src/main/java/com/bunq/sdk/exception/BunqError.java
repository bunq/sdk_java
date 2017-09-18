package com.bunq.sdk.exception;

public class BunqError extends RuntimeException {
  private int responseCode;
  private String message;

  public BunqError(){super();}

  public BunqError(String message, int responseCode) {
    super(message);

    this.responseCode = responseCode;
    this.message = message;
  }

  public int getResponseCode() {
    return responseCode;
  }

  @Override
  public String getMessage() {
    return message;
  }
}
