package com.bunq.sdk.exception;

public class ApiException extends RuntimeException {

  private int responseCode;
  private String responseId;

  public ApiException(String message, int responseCode, String responseId) {
    super(message);

    this.responseCode = responseCode;
    this.responseId = responseId;
  }

  public int getResponseCode() {
    return responseCode;
  }

  public String getResponseId() {
    return responseId;
  }

}
