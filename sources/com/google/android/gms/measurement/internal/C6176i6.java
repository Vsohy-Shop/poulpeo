package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.i6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6176i6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f7868b;

    /* renamed from: c */
    final /* synthetic */ C6264q6 f7869c;

    C6176i6(C6264q6 q6Var, AtomicReference atomicReference) {
        this.f7869c = q6Var;
        this.f7868b = atomicReference;
    }

    public final void run() {
        synchronized (this.f7868b) {
            try {
                this.f7868b.set(Double.valueOf(this.f7869c.f7899a.mo35211z().mo34880k(this.f7869c.f7899a.mo35180B().mo34810s(), C6084a3.f7557P)));
                this.f7868b.notify();
            } catch (Throwable th) {
                this.f7868b.notify();
                throw th;
            }
        }
    }
}
