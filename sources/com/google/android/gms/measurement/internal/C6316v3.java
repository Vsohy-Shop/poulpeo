package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.v3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6316v3 {

    /* renamed from: a */
    private final String f8305a;

    /* renamed from: b */
    private final long f8306b;

    /* renamed from: c */
    private boolean f8307c;

    /* renamed from: d */
    private long f8308d;

    /* renamed from: e */
    final /* synthetic */ C6360z3 f8309e;

    public C6316v3(C6360z3 z3Var, String str, long j) {
        this.f8309e = z3Var;
        C9713p.m20271f(str);
        this.f8305a = str;
        this.f8306b = j;
    }

    @WorkerThread
    /* renamed from: a */
    public final long mo35384a() {
        if (!this.f8307c) {
            this.f8307c = true;
            this.f8308d = this.f8309e.mo35423o().getLong(this.f8305a, this.f8306b);
        }
        return this.f8308d;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo35385b(long j) {
        SharedPreferences.Editor edit = this.f8309e.mo35423o().edit();
        edit.putLong(this.f8305a, j);
        edit.apply();
        this.f8308d = j;
    }
}
