package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a0 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6081a0 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f7532b;

    /* renamed from: c */
    final /* synthetic */ long f7533c;

    /* renamed from: d */
    final /* synthetic */ C6106c2 f7534d;

    C6081a0(C6106c2 c2Var, String str, long j) {
        this.f7534d = c2Var;
        this.f7532b = str;
        this.f7533c = j;
    }

    public final void run() {
        C6106c2.m10482j(this.f7534d, this.f7532b, this.f7533c);
    }
}
