package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C5785i1;

/* renamed from: com.google.android.gms.measurement.internal.o9 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.0.0 */
final class C6245o9 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C5785i1 f8062b;

    /* renamed from: c */
    final /* synthetic */ String f8063c;

    /* renamed from: d */
    final /* synthetic */ String f8064d;

    /* renamed from: e */
    final /* synthetic */ AppMeasurementDynamiteService f8065e;

    C6245o9(AppMeasurementDynamiteService appMeasurementDynamiteService, C5785i1 i1Var, String str, String str2) {
        this.f8065e = appMeasurementDynamiteService;
        this.f8062b = i1Var;
        this.f8063c = str;
        this.f8064d = str2;
    }

    public final void run() {
        this.f8065e.f7527a.mo35189L().mo34826T(this.f8062b, this.f8063c, this.f8064d);
    }
}
