package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.v4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6317v4 implements Callable<List<C6212l9>> {

    /* renamed from: b */
    final /* synthetic */ String f8310b;

    /* renamed from: c */
    final /* synthetic */ String f8311c;

    /* renamed from: d */
    final /* synthetic */ String f8312d;

    /* renamed from: e */
    final /* synthetic */ C6175i5 f8313e;

    C6317v4(C6175i5 i5Var, String str, String str2, String str3) {
        this.f8313e = i5Var;
        this.f8310b = str;
        this.f8311c = str2;
        this.f8312d = str3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.f8313e.f7865a.mo34926e();
        return this.f8313e.f7865a.mo34914V().mo35018f0(this.f8310b, this.f8311c, this.f8312d);
    }
}
