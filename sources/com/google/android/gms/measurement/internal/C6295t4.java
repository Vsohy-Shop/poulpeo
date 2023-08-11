package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.t4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6295t4 implements Callable<List<C6212l9>> {

    /* renamed from: b */
    final /* synthetic */ String f8241b;

    /* renamed from: c */
    final /* synthetic */ String f8242c;

    /* renamed from: d */
    final /* synthetic */ String f8243d;

    /* renamed from: e */
    final /* synthetic */ C6175i5 f8244e;

    C6295t4(C6175i5 i5Var, String str, String str2, String str3) {
        this.f8244e = i5Var;
        this.f8241b = str;
        this.f8242c = str2;
        this.f8243d = str3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.f8244e.f7865a.mo34926e();
        return this.f8244e.f7865a.mo34914V().mo35018f0(this.f8241b, this.f8242c, this.f8243d);
    }
}
