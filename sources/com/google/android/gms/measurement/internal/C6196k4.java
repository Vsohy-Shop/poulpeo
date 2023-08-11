package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.k4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6196k4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f7917a;

    /* renamed from: b */
    final /* synthetic */ C6229n4 f7918b;

    public C6196k4(C6229n4 n4Var, String str) {
        this.f7918b = n4Var;
        C9713p.m20275j(str);
        this.f7917a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f7918b.f7899a.mo34920b().mo35075r().mo35038b(this.f7917a, th);
    }
}
