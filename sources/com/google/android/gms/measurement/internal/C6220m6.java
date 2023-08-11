package com.google.android.gms.measurement.internal;

import p201q5.C9254a;

/* renamed from: com.google.android.gms.measurement.internal.m6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6220m6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C9254a f7981b;

    /* renamed from: c */
    final /* synthetic */ int f7982c;

    /* renamed from: d */
    final /* synthetic */ long f7983d;

    /* renamed from: e */
    final /* synthetic */ boolean f7984e;

    /* renamed from: f */
    final /* synthetic */ C6264q6 f7985f;

    C6220m6(C6264q6 q6Var, C9254a aVar, int i, long j, boolean z) {
        this.f7985f = q6Var;
        this.f7981b = aVar;
        this.f7982c = i;
        this.f7983d = j;
        this.f7984e = z;
    }

    public final void run() {
        this.f7985f.mo35232K(this.f7981b);
        C6264q6.m11040e0(this.f7985f, this.f7981b, this.f7982c, this.f7983d, false, this.f7984e);
    }
}
