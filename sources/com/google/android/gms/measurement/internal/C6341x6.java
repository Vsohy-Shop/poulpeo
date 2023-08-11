package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.x6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6341x6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C6319v6 f8393b;

    /* renamed from: c */
    final /* synthetic */ C6319v6 f8394c;

    /* renamed from: d */
    final /* synthetic */ long f8395d;

    /* renamed from: e */
    final /* synthetic */ boolean f8396e;

    /* renamed from: f */
    final /* synthetic */ C6111c7 f8397f;

    C6341x6(C6111c7 c7Var, C6319v6 v6Var, C6319v6 v6Var2, long j, boolean z) {
        this.f8397f = c7Var;
        this.f8393b = v6Var;
        this.f8394c = v6Var2;
        this.f8395d = j;
        this.f8396e = z;
    }

    public final void run() {
        this.f8397f.m10494p(this.f8393b, this.f8394c, this.f8395d, this.f8396e, (Bundle) null);
    }
}
