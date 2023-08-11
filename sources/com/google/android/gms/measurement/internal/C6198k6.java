package com.google.android.gms.measurement.internal;

import p201q5.C9254a;

/* renamed from: com.google.android.gms.measurement.internal.k6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6198k6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C9254a f7920b;

    /* renamed from: c */
    final /* synthetic */ long f7921c;

    /* renamed from: d */
    final /* synthetic */ int f7922d;

    /* renamed from: e */
    final /* synthetic */ long f7923e;

    /* renamed from: f */
    final /* synthetic */ boolean f7924f;

    /* renamed from: g */
    final /* synthetic */ C6264q6 f7925g;

    C6198k6(C6264q6 q6Var, C9254a aVar, long j, int i, long j2, boolean z) {
        this.f7925g = q6Var;
        this.f7920b = aVar;
        this.f7921c = j;
        this.f7922d = i;
        this.f7923e = j2;
        this.f7924f = z;
    }

    public final void run() {
        this.f7925g.mo35232K(this.f7920b);
        this.f7925g.mo35262z(this.f7921c, false);
        C6264q6.m11040e0(this.f7925g, this.f7920b, this.f7922d, this.f7923e, true, this.f7924f);
    }
}
