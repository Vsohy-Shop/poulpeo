package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.d9 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6124d9 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f7730b;

    /* renamed from: c */
    final /* synthetic */ String f7731c = "_err";

    /* renamed from: d */
    final /* synthetic */ Bundle f7732d;

    /* renamed from: e */
    final /* synthetic */ C6135e9 f7733e;

    C6124d9(C6135e9 e9Var, String str, String str2, Bundle bundle) {
        this.f7733e = e9Var;
        this.f7730b = str;
        this.f7732d = bundle;
    }

    public final void run() {
        this.f7733e.f7757a.mo34935j((C6290t) C9713p.m20275j(this.f7733e.f7757a.mo34930g0().mo35157w0(this.f7730b, this.f7731c, this.f7732d, "auto", this.f7733e.f7757a.mo34922c().mo33547a(), false, true)), this.f7730b);
    }
}
