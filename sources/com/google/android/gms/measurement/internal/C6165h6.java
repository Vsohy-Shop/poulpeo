package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.h6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6165h6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f7845b;

    /* renamed from: c */
    final /* synthetic */ C6264q6 f7846c;

    C6165h6(C6264q6 q6Var, AtomicReference atomicReference) {
        this.f7846c = q6Var;
        this.f7845b = atomicReference;
    }

    public final void run() {
        synchronized (this.f7845b) {
            try {
                this.f7845b.set(Integer.valueOf(this.f7846c.f7899a.mo35211z().mo34884o(this.f7846c.f7899a.mo35180B().mo34810s(), C6084a3.f7556O)));
                this.f7845b.notify();
            } catch (Throwable th) {
                this.f7845b.notify();
                throw th;
            }
        }
    }
}
