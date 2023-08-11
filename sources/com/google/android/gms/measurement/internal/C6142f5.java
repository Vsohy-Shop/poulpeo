package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.f5 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6142f5 implements Callable<List<C6212l9>> {

    /* renamed from: b */
    final /* synthetic */ String f7765b;

    /* renamed from: c */
    final /* synthetic */ C6175i5 f7766c;

    C6142f5(C6175i5 i5Var, String str) {
        this.f7766c = i5Var;
        this.f7765b = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.f7766c.f7865a.mo34926e();
        return this.f7766c.f7865a.mo34914V().mo35017e0(this.f7765b);
    }
}
