package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import kotlin.jvm.internal.C12775o;

/* compiled from: Decoy.kt */
public final class DecoyKt {
    @ComposeCompilerApi
    public static final Void illegalDecoyCallException(String str) {
        C12775o.m28639i(str, "fName");
        throw new IllegalStateException("Function " + str + " should have been replaced by compiler.");
    }
}
