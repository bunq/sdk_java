package com.bunq.sdk.exception;

public class UnknownApiErrorException extends ApiException {

    public UnknownApiErrorException(String message, int responseCode, String responseId) {
        super(message, responseCode, responseId);
    }
}
