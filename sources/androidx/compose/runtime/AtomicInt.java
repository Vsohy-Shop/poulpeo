package androidx.compose.runtime;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ActualJvm.jvm.kt */
public final class AtomicInt {
    private final AtomicInteger delegate;

    public AtomicInt(int i) {
        this.delegate = new AtomicInteger(i);
    }

    public final int add(int i) {
        return this.delegate.addAndGet(i);
    }

    public final int get() {
        return this.delegate.get();
    }

    public final AtomicInteger getDelegate() {
        return this.delegate;
    }

    public final void set(int i) {
        this.delegate.set(i);
    }
}
