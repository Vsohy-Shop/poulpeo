package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C12775o;
import p336ef.C11907m;
import p355hf.C12074d;

/* compiled from: AndroidXConsumer.kt */
final class AndroidXContinuationConsumer<T> extends AtomicBoolean implements Consumer<T> {
    private final C12074d<T> continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidXContinuationConsumer(C12074d<? super T> dVar) {
        super(false);
        C12775o.m28639i(dVar, "continuation");
        this.continuation = dVar;
    }

    public void accept(T t) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(C11907m.m25696a(t));
        }
    }

    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
