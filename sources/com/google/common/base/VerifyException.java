package com.google.common.base;

public class VerifyException extends RuntimeException {
    public VerifyException() {
    }

    public VerifyException(String str) {
        super(str);
    }

    public VerifyException(String str, Throwable th) {
        super(str, th);
    }
}
