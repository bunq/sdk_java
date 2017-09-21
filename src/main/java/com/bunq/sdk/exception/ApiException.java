package com.bunq.sdk.exception;

public class ApiException extends RuntimeException {

  /**
   */
  private int responseCode;
  private String message;

  /**
   * @param message The error message of the failed request.
   * @param responseCode The response code of the failed request.
   */
  public ApiException(String message, int responseCode) {
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
