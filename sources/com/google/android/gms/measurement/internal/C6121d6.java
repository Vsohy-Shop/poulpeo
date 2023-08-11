package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.d6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6121d6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f7712b;

    /* renamed from: c */
    final /* synthetic */ String f7713c;

    /* renamed from: d */
    final /* synthetic */ String f7714d;

    /* renamed from: e */
    final /* synthetic */ boolean f7715e;

    /* renamed from: f */
    final /* synthetic */ C6264q6 f7716f;

    C6121d6(C6264q6 q6Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f7716f = q6Var;
        this.f7712b = atomicReference;
        this.f7713c = str2;
        this.f7714d = str3;
        this.f7715e = z;
    }

    public final void run() {
        this.f7716f.f7899a.mo35189L().mo34830X(this.f7712b, (String) null, this.f7713c, this.f7714d, this.f7715e);
    }
}
