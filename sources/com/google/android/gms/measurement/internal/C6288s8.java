package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.measurement.C5649a1;

/* renamed from: com.google.android.gms.measurement.internal.s8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6288s8 extends C6349y3 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f8203c;

    /* renamed from: d */
    protected final C6277r8 f8204d = new C6277r8(this);

    /* renamed from: e */
    protected final C6266q8 f8205e = new C6266q8(this);

    /* renamed from: f */
    protected final C6233n8 f8206f = new C6233n8(this);

    C6288s8(C6251p4 p4Var) {
        super(p4Var);
    }

    /* renamed from: q */
    static /* bridge */ /* synthetic */ void m11108q(C6288s8 s8Var, long j) {
        s8Var.mo34778h();
        s8Var.m11110s();
        s8Var.f7899a.mo34920b().mo35079v().mo35038b("Activity paused, time", Long.valueOf(j));
        s8Var.f8206f.mo35113a(j);
        if (s8Var.f7899a.mo35211z().mo34875D()) {
            s8Var.f8205e.mo35265b(j);
        }
    }

    /* renamed from: r */
    static /* bridge */ /* synthetic */ void m11109r(C6288s8 s8Var, long j) {
        s8Var.mo34778h();
        s8Var.m11110s();
        s8Var.f7899a.mo34920b().mo35079v().mo35038b("Activity resumed, time", Long.valueOf(j));
        if (s8Var.f7899a.mo35211z().mo34875D() || s8Var.f7899a.mo35184F().f8447q.mo35301b()) {
            s8Var.f8205e.mo35266c(j);
        }
        s8Var.f8206f.mo35114b();
        C6277r8 r8Var = s8Var.f8204d;
        r8Var.f8181a.mo34778h();
        if (r8Var.f8181a.f7899a.mo35204o()) {
            r8Var.mo35284b(r8Var.f8181a.f7899a.mo34922c().mo33547a(), false);
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: s */
    public final void m11110s() {
        mo34778h();
        if (this.f8203c == null) {
            this.f8203c = new C5649a1(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo34789n() {
        return false;
    }
}
