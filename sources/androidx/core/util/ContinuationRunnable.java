package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C12775o;
import p336ef.C11907m;
import p336ef.C11921v;
import p355hf.C12074d;

/* compiled from: Runnable.kt */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    private final C12074d<C11921v> continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContinuationRunnable(C12074d<? super C11921v> dVar) {
        super(false);
        C12775o.m28639i(dVar, "continuation");
        this.continuation = dVar;
    }

    public void run() {
        if (compareAndSet(false, true)) {
            C12074d<C11921v> dVar = this.continuation;
            C11907m.C11908a aVar = C11907m.f18600b;
            dVar.resumeWith(C11907m.m25696a(C11921v.f18618a));
        }
    }

    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
