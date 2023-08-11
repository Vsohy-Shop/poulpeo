package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import p201q5.C9254a;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.c9 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6113c9 implements Callable<String> {

    /* renamed from: b */
    final /* synthetic */ C6289s9 f7691b;

    /* renamed from: c */
    final /* synthetic */ C6157g9 f7692c;

    C6113c9(C6157g9 g9Var, C6289s9 s9Var) {
        this.f7692c = g9Var;
        this.f7691b = s9Var;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        if (this.f7692c.mo34913U((String) C9713p.m20275j(this.f7691b.f8207b)).mo43554k() && C9254a.m18988b(this.f7691b.f8228w).mo43554k()) {
            return this.f7692c.mo34910R(this.f7691b).mo35351f0();
        }
        this.f7692c.mo34920b().mo35079v().mo35037a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
