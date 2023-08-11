package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.x5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6340x5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f8390b;

    /* renamed from: c */
    final /* synthetic */ boolean f8391c;

    /* renamed from: d */
    final /* synthetic */ C6264q6 f8392d;

    C6340x5(C6264q6 q6Var, AtomicReference atomicReference, boolean z) {
        this.f8392d = q6Var;
        this.f8390b = atomicReference;
        this.f8391c = z;
    }

    public final void run() {
        this.f8392d.f7899a.mo35189L().mo34828V(this.f8390b, this.f8391c);
    }
}
