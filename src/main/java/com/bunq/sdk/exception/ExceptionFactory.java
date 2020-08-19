package com.bunq.sdk.exception;

import java.util.List;

public class ExceptionFactory {

    /**
     * HTTP error response codes constants.
     */
    private static final int HTTP_RESPONSE_CODE_BAD_REQUEST = 400;
    private static final int HTTP_RESPONSE_CODE_UNAUTHORIZED = 401;
    private static final int HTTP_RESPONSE_CODE_FORBIDDEN = 403;
    private static final int HTTP_RESPONSE_CODE_NOT_FOUND = 404;
    private static final int HTTP_RESPONSE_CODE_METHOD_NOT_ALLOWED = 405;
    private static final int HTTP_RESPONSE_CODE_TOO_MANY_REQUESTS = 429;
    private static final int HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR = 500;

    /**
     * Some glue to glue the error message together.
     */
    private static final String SEPARATOR_ERROR_MESSAGES = "\n";

    /**
     * String format constants.
     */
    private static final String FORMAT_ERROR_MESSAGE = "Response id to help bunq debug: %s. \n Error message: %s";

    /**
     * @param responseCode The HTTP response code related to the request.
     * @param messages The error message related to the exception that should be thrown.
     * @return The exception that belongs to this status code.
     */
    public static ApiException createExceptionForResponse(int responseCode, List<String> messages, String responseId) {
        String error_message = concatenateAllMessage(messages, responseId);

        switch (responseCode) {
            case HTTP_RESPONSE_CODE_BAD_REQUEST:
                return new BadRequestException(error_message, responseCode, responseId);
            case HTTP_RESPONSE_CODE_UNAUTHORIZED:
                return new UnauthorizedException(error_message, responseCode, responseId);
            case HTTP_RESPONSE_CODE_FORBIDDEN:
                return new ForbiddenException(error_message, responseCode, responseId);
            case HTTP_RESPONSE_CODE_NOT_FOUND:
                return new NotFoundException(error_message, responseCode, responseId);
            case HTTP_RESPONSE_CODE_METHOD_NOT_ALLOWED:
                return new MethodNotAllowedException(error_message, responseCode, responseId);
            case HTTP_RESPONSE_CODE_TOO_MANY_REQUESTS:
                return new TooManyRequestsException(error_message, responseCode, responseId);
            case HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR:
                return new PleaseContactBunqException(error_message, responseCode, responseId);
            default:
                return new UnknownApiErrorException(error_message, responseCode, responseId);
        }
    }

    private static String concatenateAllMessage(List<String> messages, String responseId) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String message : messages) {
            stringBuilder.append(SEPARATOR_ERROR_MESSAGES);
            stringBuilder.append(message);
        }

        return String.format(FORMAT_ERROR_MESSAGE, responseId, stringBuilder.toString());
    }
}
