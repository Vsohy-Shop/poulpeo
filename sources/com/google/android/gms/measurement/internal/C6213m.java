package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.internal.measurement.C5649a1;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.m */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
abstract class C6213m {

    /* renamed from: d */
    private static volatile Handler f7965d;

    /* renamed from: a */
    private final C6208l5 f7966a;

    /* renamed from: b */
    private final Runnable f7967b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile long f7968c;

    C6213m(C6208l5 l5Var) {
        C9713p.m20275j(l5Var);
        this.f7966a = l5Var;
        this.f7967b = new C6202l(this, l5Var);
    }

    /* renamed from: f */
    private final Handler m10881f() {
        Handler handler;
        if (f7965d != null) {
            return f7965d;
        }
        synchronized (C6213m.class) {
            if (f7965d == null) {
                f7965d = new C5649a1(this.f7966a.mo34927f().getMainLooper());
            }
            handler = f7965d;
        }
        return handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo35088b() {
        this.f7968c = 0;
        m10881f().removeCallbacks(this.f7967b);
    }

    /* renamed from: c */
    public abstract void mo35089c();

    /* renamed from: d */
    public final void mo35090d(long j) {
        mo35088b();
        if (j >= 0) {
            this.f7968c = this.f7966a.mo34922c().mo33547a();
            if (!m10881f().postDelayed(this.f7967b, j)) {
                this.f7966a.mo34920b().mo35075r().mo35038b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: e */
    public final boolean mo35091e() {
        if (this.f7968c != 0) {
            return true;
        }
        return false;
    }
}
