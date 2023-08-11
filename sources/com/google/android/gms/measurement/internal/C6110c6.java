package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.c6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6110c6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f7672b;

    /* renamed from: c */
    final /* synthetic */ String f7673c;

    /* renamed from: d */
    final /* synthetic */ String f7674d;

    /* renamed from: e */
    final /* synthetic */ C6264q6 f7675e;

    C6110c6(C6264q6 q6Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f7675e = q6Var;
        this.f7672b = atomicReference;
        this.f7673c = str2;
        this.f7674d = str3;
    }

    public final void run() {
        this.f7675e.f7899a.mo35189L().mo34827U(this.f7672b, (String) null, this.f7673c, this.f7674d);
    }
}
