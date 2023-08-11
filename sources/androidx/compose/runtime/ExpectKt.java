package androidx.compose.runtime;

import kotlin.jvm.internal.C12775o;

/* compiled from: Expect.kt */
public final class ExpectKt {
    public static final <T> ThreadLocal<T> ThreadLocal() {
        return new ThreadLocal<>(ExpectKt$ThreadLocal$1.INSTANCE);
    }

    public static final int postIncrement(AtomicInt atomicInt) {
        C12775o.m28639i(atomicInt, "<this>");
        return atomicInt.add(1) - 1;
    }
}
