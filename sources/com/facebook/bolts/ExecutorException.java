package com.facebook.bolts;

import kotlin.jvm.internal.C12775o;

/* compiled from: ExecutorException.kt */
public final class ExecutorException extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExecutorException(Exception exc) {
        super("An exception was thrown by an Executor", exc);
        C12775o.m28639i(exc, "e");
    }
}
