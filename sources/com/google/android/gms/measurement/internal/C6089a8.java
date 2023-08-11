package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.a8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6089a8 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C6112c8 f7630b;

    C6089a8(C6112c8 c8Var) {
        this.f7630b = c8Var;
    }

    public final void run() {
        C6123d8 d8Var = this.f7630b.f7690d;
        Context f = d8Var.f7899a.mo34927f();
        this.f7630b.f7690d.f7899a.mo34924d();
        C6123d8.m10539M(d8Var, new ComponentName(f, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
