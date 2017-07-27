package com.bunq.sdk.exception;

import java.util.List;

/**
 * Exception triggered by API requests failed on the server side.
 */
public class ApiException extends RuntimeException {

  private static final String GLUE_ERROR_MESSAGES = "\n";

  private int responseCode;
  private List<String> messages;

  /**
   * @param responseCode The HTTP Response code of the failed request.
   * @param messages The list of messages related to this exception.
   */
  public ApiException(int responseCode, List<String> messages) {
    super(concatenateMessages(messages));
    this.responseCode = responseCode;
    this.messages = messages;
  }

  private static String concatenateMessages(List<String> messages) {
    return String.join(GLUE_ERROR_MESSAGES, messages);
  }

  public int getResponseCode() {
    return responseCode;
  }

  public List<String> getMessages() {
    return messages;
  }

}
