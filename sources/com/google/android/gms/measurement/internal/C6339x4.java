package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.x4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6339x4 implements Callable<List<C6103c>> {

    /* renamed from: b */
    final /* synthetic */ String f8386b;

    /* renamed from: c */
    final /* synthetic */ String f8387c;

    /* renamed from: d */
    final /* synthetic */ String f8388d;

    /* renamed from: e */
    final /* synthetic */ C6175i5 f8389e;

    C6339x4(C6175i5 i5Var, String str, String str2, String str3) {
        this.f8389e = i5Var;
        this.f8386b = str;
        this.f8387c = str2;
        this.f8388d = str3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.f8389e.f7865a.mo34926e();
        return this.f8389e.f7865a.mo34914V().mo35015c0(this.f8386b, this.f8387c, this.f8388d);
    }
}
