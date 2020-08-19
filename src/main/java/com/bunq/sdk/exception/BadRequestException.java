package com.bunq.sdk.exception;

public class BadRequestException extends ApiException {

    public BadRequestException(String message, int responseCode, String responseId) {
        super(message, responseCode, responseId);
    }
}
