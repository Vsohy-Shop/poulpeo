package com.google.android.gms.measurement.internal;

import p201q5.C9254a;

/* renamed from: com.google.android.gms.measurement.internal.l6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6209l6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C9254a f7951b;

    /* renamed from: c */
    final /* synthetic */ int f7952c;

    /* renamed from: d */
    final /* synthetic */ long f7953d;

    /* renamed from: e */
    final /* synthetic */ boolean f7954e;

    /* renamed from: f */
    final /* synthetic */ C6264q6 f7955f;

    C6209l6(C6264q6 q6Var, C9254a aVar, int i, long j, boolean z) {
        this.f7955f = q6Var;
        this.f7951b = aVar;
        this.f7952c = i;
        this.f7953d = j;
        this.f7954e = z;
    }

    public final void run() {
        this.f7955f.mo35232K(this.f7951b);
        C6264q6.m11040e0(this.f7955f, this.f7951b, this.f7952c, this.f7953d, false, this.f7954e);
    }
}
