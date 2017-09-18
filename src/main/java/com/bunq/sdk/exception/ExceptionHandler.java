package com.bunq.sdk.exception;

import java.util.List;

public class ExceptionHandler {

//  HTTP error response codes constants.
  private static final int HTTP_RESPONSE_CODE_BAD_REQUEST = 400;
  private static final int HTTP_RESPONSE_CODE_UNAUTHORIZED = 401;
  private static final int HTTP_RESPONSE_CODE_FORBIDDEN = 403;
  private static final int HTTP_RESPONSE_CODE_NOT_FOUND = 404;
  private static final int HTTP_RESPONSE_CODE_METHOD_NOT_ALLOWED = 405;
  private static final int HTTP_RESPONSE_CODE_TOO_MANY_REQUESTS = 429;
  private static final int HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR = 500;

//  Some glue to glue the error message together.
  private static final String GLUE_ERROR_MESSAGES = "\n";

  /**
   *
   * @param responseCode The HTTP response code related to the request.
   * @param messages  The error message related to the exception that should be raised.
   *
   * @return The exception that belongs to this status code.
   */
  public static BunqError createExceptionForResponse(int responseCode, List<String> messages){
    String error_message = concatenateMessages(messages);

    if (responseCode == HTTP_RESPONSE_CODE_BAD_REQUEST){
      return new BadRequestException(error_message, responseCode);
    }
    if (responseCode == HTTP_RESPONSE_CODE_UNAUTHORIZED){
      return new UnauthorizedException(error_message, responseCode);
    }
    if (responseCode == HTTP_RESPONSE_CODE_FORBIDDEN){
      return new ForbiddenException(error_message, responseCode);
    }
    if (responseCode == HTTP_RESPONSE_CODE_NOT_FOUND){
      return new NotFoundException(error_message, responseCode);
    }
    if (responseCode == HTTP_RESPONSE_CODE_METHOD_NOT_ALLOWED){
      return new MethodNotAllowedException(error_message, responseCode);
    }
    if (responseCode == HTTP_RESPONSE_CODE_TOO_MANY_REQUESTS){
      return new ToManyRequestsException(error_message, responseCode);
    }
    if (responseCode == HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR){
      return new PleaseContactBunqException(error_message, responseCode);
    }

    return new ApiException(error_message, responseCode);

  }

  private static String concatenateMessages(List<String> messages) {
    return String.join(GLUE_ERROR_MESSAGES, messages);
  }
}
