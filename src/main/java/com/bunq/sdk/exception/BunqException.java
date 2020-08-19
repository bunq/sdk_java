package com.bunq.sdk.exception;

/**
 * Exception triggered by an error in SDK (client-side).
 */
public class BunqException extends RuntimeException {

    /**
     * @param message A custom error message.
     */
    public BunqException(String message) {
        super(message);
    }

    /**
     * @param message A custom error message.
     * @param cause An exception which caused this exception.
     */
    public BunqException(String message, Throwable cause) {
        super(message, cause);
    }
}
