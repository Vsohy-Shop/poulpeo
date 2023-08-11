package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.h5 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6164h5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f7840b;

    /* renamed from: c */
    final /* synthetic */ String f7841c;

    /* renamed from: d */
    final /* synthetic */ String f7842d;

    /* renamed from: e */
    final /* synthetic */ long f7843e;

    /* renamed from: f */
    final /* synthetic */ C6175i5 f7844f;

    C6164h5(C6175i5 i5Var, String str, String str2, String str3, long j) {
        this.f7844f = i5Var;
        this.f7840b = str;
        this.f7841c = str2;
        this.f7842d = str3;
        this.f7843e = j;
    }

    public final void run() {
        String str = this.f7840b;
        if (str == null) {
            this.f7844f.f7865a.mo34921b0().mo35188K().mo34788G(this.f7841c, (C6319v6) null);
            return;
        }
        this.f7844f.f7865a.mo34921b0().mo35188K().mo34788G(this.f7841c, new C6319v6(this.f7842d, str, this.f7843e));
    }
}
