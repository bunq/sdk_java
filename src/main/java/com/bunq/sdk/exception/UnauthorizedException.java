package com.bunq.sdk.exception;

public class UnauthorizedException extends ApiException {

    public UnauthorizedException(String message, int responseCode, String responseId) {
        super(message, responseCode, responseId);
    }
}
