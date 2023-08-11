package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.b6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6099b6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f7647b;

    /* renamed from: c */
    final /* synthetic */ C6264q6 f7648c;

    C6099b6(C6264q6 q6Var, AtomicReference atomicReference) {
        this.f7648c = q6Var;
        this.f7647b = atomicReference;
    }

    public final void run() {
        synchronized (this.f7647b) {
            try {
                this.f7647b.set(Boolean.valueOf(this.f7648c.f7899a.mo35211z().mo34873B(this.f7648c.f7899a.mo35180B().mo34810s(), C6084a3.f7553L)));
                this.f7647b.notify();
            } catch (Throwable th) {
                this.f7647b.notify();
                throw th;
            }
        }
    }
}
