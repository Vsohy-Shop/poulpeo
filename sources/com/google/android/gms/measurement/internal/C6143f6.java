package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.f6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6143f6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f7767b;

    /* renamed from: c */
    final /* synthetic */ C6264q6 f7768c;

    C6143f6(C6264q6 q6Var, AtomicReference atomicReference) {
        this.f7768c = q6Var;
        this.f7767b = atomicReference;
    }

    public final void run() {
        synchronized (this.f7767b) {
            try {
                this.f7767b.set(this.f7768c.f7899a.mo35211z().mo34893x(this.f7768c.f7899a.mo35180B().mo34810s(), C6084a3.f7554M));
                this.f7767b.notify();
            } catch (Throwable th) {
                this.f7767b.notify();
                throw th;
            }
        }
    }
}
