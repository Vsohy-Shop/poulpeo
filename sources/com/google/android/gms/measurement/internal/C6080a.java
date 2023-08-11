package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6080a implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f7529b;

    /* renamed from: c */
    final /* synthetic */ long f7530c;

    /* renamed from: d */
    final /* synthetic */ C6106c2 f7531d;

    C6080a(C6106c2 c2Var, String str, long j) {
        this.f7531d = c2Var;
        this.f7529b = str;
        this.f7530c = j;
    }

    public final void run() {
        C6106c2.m10481i(this.f7531d, this.f7529b, this.f7530c);
    }
}
