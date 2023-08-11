package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.g6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6154g6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f7795b;

    /* renamed from: c */
    final /* synthetic */ C6264q6 f7796c;

    C6154g6(C6264q6 q6Var, AtomicReference atomicReference) {
        this.f7796c = q6Var;
        this.f7795b = atomicReference;
    }

    public final void run() {
        synchronized (this.f7795b) {
            try {
                this.f7795b.set(Long.valueOf(this.f7796c.f7899a.mo35211z().mo34887r(this.f7796c.f7899a.mo35180B().mo34810s(), C6084a3.f7555N)));
                this.f7795b.notify();
            } catch (Throwable th) {
                this.f7795b.notify();
                throw th;
            }
        }
    }
}
