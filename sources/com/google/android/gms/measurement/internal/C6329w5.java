package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.w5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6329w5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f8358b;

    /* renamed from: c */
    final /* synthetic */ String f8359c;

    /* renamed from: d */
    final /* synthetic */ Object f8360d;

    /* renamed from: e */
    final /* synthetic */ long f8361e;

    /* renamed from: f */
    final /* synthetic */ C6264q6 f8362f;

    C6329w5(C6264q6 q6Var, String str, String str2, Object obj, long j) {
        this.f8362f = q6Var;
        this.f8358b = str;
        this.f8359c = str2;
        this.f8360d = obj;
        this.f8361e = j;
    }

    public final void run() {
        this.f8362f.mo35235N(this.f8358b, this.f8359c, this.f8360d, this.f8361e);
    }
}
