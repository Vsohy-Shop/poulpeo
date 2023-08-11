package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.w6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6330w6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ Bundle f8363b;

    /* renamed from: c */
    final /* synthetic */ C6319v6 f8364c;

    /* renamed from: d */
    final /* synthetic */ C6319v6 f8365d;

    /* renamed from: e */
    final /* synthetic */ long f8366e;

    /* renamed from: f */
    final /* synthetic */ C6111c7 f8367f;

    C6330w6(C6111c7 c7Var, Bundle bundle, C6319v6 v6Var, C6319v6 v6Var2, long j) {
        this.f8367f = c7Var;
        this.f8363b = bundle;
        this.f8364c = v6Var;
        this.f8365d = v6Var2;
        this.f8366e = j;
    }

    public final void run() {
        C6111c7.m10499x(this.f8367f, this.f8363b, this.f8364c, this.f8365d, this.f8366e);
    }
}
