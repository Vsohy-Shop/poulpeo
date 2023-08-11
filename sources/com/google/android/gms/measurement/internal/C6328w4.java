package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.w4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6328w4 implements Callable<List<C6103c>> {

    /* renamed from: b */
    final /* synthetic */ String f8354b;

    /* renamed from: c */
    final /* synthetic */ String f8355c;

    /* renamed from: d */
    final /* synthetic */ String f8356d;

    /* renamed from: e */
    final /* synthetic */ C6175i5 f8357e;

    C6328w4(C6175i5 i5Var, String str, String str2, String str3) {
        this.f8357e = i5Var;
        this.f8354b = str;
        this.f8355c = str2;
        this.f8356d = str3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.f8357e.f7865a.mo34926e();
        return this.f8357e.f7865a.mo34914V().mo35015c0(this.f8354b, this.f8355c, this.f8356d);
    }
}
