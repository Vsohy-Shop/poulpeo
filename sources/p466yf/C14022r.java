package p466yf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: yf.r */
/* compiled from: CompletionState.kt */
public final class C14022r extends C13932b0 {

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f22946c = AtomicIntegerFieldUpdater.newUpdater(C14022r.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14022r(p355hf.C12074d<?> r3, java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L_0x001d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L_0x001d:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p466yf.C14022r.<init>(hf.d, java.lang.Throwable, boolean):void");
    }

    /* renamed from: c */
    public final boolean mo53803c() {
        return f22946c.compareAndSet(this, 0, 1);
    }
}
