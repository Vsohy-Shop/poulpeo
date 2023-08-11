package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C5785i1;

/* renamed from: com.google.android.gms.measurement.internal.p5 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.0.0 */
final class C6252p5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C5785i1 f8120b;

    /* renamed from: c */
    final /* synthetic */ AppMeasurementDynamiteService f8121c;

    C6252p5(AppMeasurementDynamiteService appMeasurementDynamiteService, C5785i1 i1Var) {
        this.f8121c = appMeasurementDynamiteService;
        this.f8120b = i1Var;
    }

    public final void run() {
        this.f8121c.f7527a.mo35189L().mo34824R(this.f8120b);
    }
}
