package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.v5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6318v5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f8314b;

    /* renamed from: c */
    final /* synthetic */ String f8315c;

    /* renamed from: d */
    final /* synthetic */ long f8316d;

    /* renamed from: e */
    final /* synthetic */ Bundle f8317e;

    /* renamed from: f */
    final /* synthetic */ boolean f8318f;

    /* renamed from: g */
    final /* synthetic */ boolean f8319g;

    /* renamed from: h */
    final /* synthetic */ boolean f8320h;

    /* renamed from: i */
    final /* synthetic */ String f8321i;

    /* renamed from: j */
    final /* synthetic */ C6264q6 f8322j;

    C6318v5(C6264q6 q6Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f8322j = q6Var;
        this.f8314b = str;
        this.f8315c = str2;
        this.f8316d = j;
        this.f8317e = bundle;
        this.f8318f = z;
        this.f8319g = z2;
        this.f8320h = z3;
        this.f8321i = str3;
    }

    public final void run() {
        this.f8322j.mo35259w(this.f8314b, this.f8315c, this.f8316d, this.f8317e, this.f8318f, this.f8319g, this.f8320h, this.f8321i);
    }
}
