package com.google.android.gms.internal.gtm;

import android.os.Handler;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.q0 */
abstract class C5501q0 {

    /* renamed from: d */
    private static volatile Handler f6248d;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C5437m f6249a;

    /* renamed from: b */
    private final Runnable f6250b = new C5516r0(this);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile long f6251c;

    C5501q0(C5437m mVar) {
        C9713p.m20275j(mVar);
        this.f6249a = mVar;
    }

    /* renamed from: b */
    private final Handler m8385b() {
        Handler handler;
        if (f6248d != null) {
            return f6248d;
        }
        synchronized (C5501q0.class) {
            if (f6248d == null) {
                f6248d = new C5259a2(this.f6249a.mo33328a().getMainLooper());
            }
            handler = f6248d;
        }
        return handler;
    }

    /* renamed from: a */
    public final void mo33469a() {
        this.f6251c = 0;
        m8385b().removeCallbacks(this.f6250b);
    }

    /* renamed from: c */
    public abstract void mo33092c();

    /* renamed from: f */
    public final long mo33470f() {
        if (this.f6251c == 0) {
            return 0;
        }
        return Math.abs(this.f6249a.mo33329d().mo33547a() - this.f6251c);
    }

    /* renamed from: g */
    public final boolean mo33471g() {
        if (this.f6251c != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void mo33472h(long j) {
        mo33469a();
        if (j >= 0) {
            this.f6251c = this.f6249a.mo33329d().mo33547a();
            if (!m8385b().postDelayed(this.f6250b, j)) {
                this.f6249a.mo33330e().mo33265H0("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: i */
    public final void mo33473i(long j) {
        if (mo33471g()) {
            long j2 = 0;
            if (j < 0) {
                mo33469a();
                return;
            }
            long abs = j - Math.abs(this.f6249a.mo33329d().mo33547a() - this.f6251c);
            if (abs >= 0) {
                j2 = abs;
            }
            m8385b().removeCallbacks(this.f6250b);
            if (!m8385b().postDelayed(this.f6250b, j2)) {
                this.f6249a.mo33330e().mo33265H0("Failed to adjust delayed post. time", Long.valueOf(j2));
            }
        }
    }
}
