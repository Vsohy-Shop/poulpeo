package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C5785i1;

/* renamed from: com.google.android.gms.measurement.internal.p9 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.0.0 */
final class C6256p9 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C5785i1 f8128b;

    /* renamed from: c */
    final /* synthetic */ AppMeasurementDynamiteService f8129c;

    C6256p9(AppMeasurementDynamiteService appMeasurementDynamiteService, C5785i1 i1Var) {
        this.f8129c = appMeasurementDynamiteService;
        this.f8128b = i1Var;
    }

    public final void run() {
        this.f8129c.f7527a.mo35191N().mo35117C(this.f8128b, this.f8129c.f7527a.mo35203n());
    }
}
