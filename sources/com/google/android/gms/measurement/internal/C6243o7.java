package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C5785i1;

/* renamed from: com.google.android.gms.measurement.internal.o7 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.0.0 */
final class C6243o7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C5785i1 f8055b;

    /* renamed from: c */
    final /* synthetic */ String f8056c;

    /* renamed from: d */
    final /* synthetic */ String f8057d;

    /* renamed from: e */
    final /* synthetic */ boolean f8058e;

    /* renamed from: f */
    final /* synthetic */ AppMeasurementDynamiteService f8059f;

    C6243o7(AppMeasurementDynamiteService appMeasurementDynamiteService, C5785i1 i1Var, String str, String str2, boolean z) {
        this.f8059f = appMeasurementDynamiteService;
        this.f8055b = i1Var;
        this.f8056c = str;
        this.f8057d = str2;
        this.f8058e = z;
    }

    public final void run() {
        this.f8059f.f7527a.mo35189L().mo34829W(this.f8055b, this.f8056c, this.f8057d, this.f8058e);
    }
}
