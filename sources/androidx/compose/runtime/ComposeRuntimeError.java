package androidx.compose.runtime;

import kotlin.jvm.internal.C12775o;

/* compiled from: Composer.kt */
public final class ComposeRuntimeError extends IllegalStateException {
    private final String message;

    public ComposeRuntimeError(String str) {
        C12775o.m28639i(str, "message");
        this.message = str;
    }

    public String getMessage() {
        return this.message;
    }
}
