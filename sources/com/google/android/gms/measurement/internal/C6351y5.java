package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.y5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6351y5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ long f8410b;

    /* renamed from: c */
    final /* synthetic */ C6264q6 f8411c;

    C6351y5(C6264q6 q6Var, long j) {
        this.f8411c = q6Var;
        this.f8410b = j;
    }

    public final void run() {
        this.f8411c.mo35262z(this.f8410b, true);
        this.f8411c.f7899a.mo35189L().mo34825S(new AtomicReference());
    }
}
