package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.t3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6294t3 {

    /* renamed from: a */
    private final String f8236a;

    /* renamed from: b */
    private final boolean f8237b;

    /* renamed from: c */
    private boolean f8238c;

    /* renamed from: d */
    private boolean f8239d;

    /* renamed from: e */
    final /* synthetic */ C6360z3 f8240e;

    public C6294t3(C6360z3 z3Var, String str, boolean z) {
        this.f8240e = z3Var;
        C9713p.m20271f(str);
        this.f8236a = str;
        this.f8237b = z;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo35300a(boolean z) {
        SharedPreferences.Editor edit = this.f8240e.mo35423o().edit();
        edit.putBoolean(this.f8236a, z);
        edit.apply();
        this.f8239d = z;
    }

    @WorkerThread
    /* renamed from: b */
    public final boolean mo35301b() {
        if (!this.f8238c) {
            this.f8238c = true;
            this.f8239d = this.f8240e.mo35423o().getBoolean(this.f8236a, this.f8237b);
        }
        return this.f8239d;
    }
}
