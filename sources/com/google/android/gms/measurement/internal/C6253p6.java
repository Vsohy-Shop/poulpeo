package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C5785i1;

/* renamed from: com.google.android.gms.measurement.internal.p6 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.0.0 */
final class C6253p6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C5785i1 f8122b;

    /* renamed from: c */
    final /* synthetic */ C6290t f8123c;

    /* renamed from: d */
    final /* synthetic */ String f8124d;

    /* renamed from: e */
    final /* synthetic */ AppMeasurementDynamiteService f8125e;

    C6253p6(AppMeasurementDynamiteService appMeasurementDynamiteService, C5785i1 i1Var, C6290t tVar, String str) {
        this.f8125e = appMeasurementDynamiteService;
        this.f8122b = i1Var;
        this.f8123c = tVar;
        this.f8124d = str;
    }

    public final void run() {
        this.f8125e.f7527a.mo35189L().mo34832p(this.f8122b, this.f8123c, this.f8124d);
    }
}
