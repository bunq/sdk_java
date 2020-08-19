package com.bunq.sdk.exception;

/**
 * Exception of last resort.
 */
public class UncaughtExceptionError extends Error {

    private static final String ERROR_UNCAUGHT_EXCEPTION = "Uncaught exception \"%s\".";

    /**
     * @param exception Exception which went through all the protection levels of SDK.
     */
    public UncaughtExceptionError(Exception exception) {
        super(String.format(ERROR_UNCAUGHT_EXCEPTION, exception.getMessage()));
    }
}
