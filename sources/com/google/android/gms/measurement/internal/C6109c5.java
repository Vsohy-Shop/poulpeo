package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c5 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6109c5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C6290t f7669b;

    /* renamed from: c */
    final /* synthetic */ String f7670c;

    /* renamed from: d */
    final /* synthetic */ C6175i5 f7671d;

    C6109c5(C6175i5 i5Var, C6290t tVar, String str) {
        this.f7671d = i5Var;
        this.f7669b = tVar;
        this.f7670c = str;
    }

    public final void run() {
        this.f7671d.f7865a.mo34926e();
        this.f7671d.f7865a.mo34935j(this.f7669b, this.f7670c);
    }
}
