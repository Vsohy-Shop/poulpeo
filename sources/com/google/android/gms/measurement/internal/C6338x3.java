package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.x3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6338x3 {

    /* renamed from: a */
    private final String f8382a;

    /* renamed from: b */
    private boolean f8383b;

    /* renamed from: c */
    private String f8384c;

    /* renamed from: d */
    final /* synthetic */ C6360z3 f8385d;

    public C6338x3(C6360z3 z3Var, String str, String str2) {
        this.f8385d = z3Var;
        C9713p.m20271f(str);
        this.f8382a = str;
    }

    @WorkerThread
    /* renamed from: a */
    public final String mo35400a() {
        if (!this.f8383b) {
            this.f8383b = true;
            this.f8384c = this.f8385d.mo35423o().getString(this.f8382a, (String) null);
        }
        return this.f8384c;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo35401b(String str) {
        SharedPreferences.Editor edit = this.f8385d.mo35423o().edit();
        edit.putString(this.f8382a, str);
        edit.apply();
        this.f8384c = str;
    }
}
