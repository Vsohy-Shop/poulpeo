package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.o8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.0.0 */
final class C6244o8 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C6267q9 f8060b;

    /* renamed from: c */
    final /* synthetic */ AppMeasurementDynamiteService f8061c;

    C6244o8(AppMeasurementDynamiteService appMeasurementDynamiteService, C6267q9 q9Var) {
        this.f8061c = appMeasurementDynamiteService;
        this.f8060b = q9Var;
    }

    public final void run() {
        this.f8061c.f7527a.mo35186I().mo35230I(this.f8060b);
    }
}
