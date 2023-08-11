package com.google.android.gms.internal.gtm;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.gtm.jd */
final class C5406jd extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f6073a;

    public C5406jd(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, (ReferenceQueue) null);
        if (th != null) {
            this.f6073a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C5406jd.class) {
            if (this == obj) {
                return true;
            }
            C5406jd jdVar = (C5406jd) obj;
            if (this.f6073a == jdVar.f6073a && get() == jdVar.get()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6073a;
    }
}
