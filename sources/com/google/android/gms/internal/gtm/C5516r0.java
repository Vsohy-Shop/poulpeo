package com.google.android.gms.internal.gtm;

import android.os.Looper;

/* renamed from: com.google.android.gms.internal.gtm.r0 */
final class C5516r0 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C5501q0 f6264b;

    C5516r0(C5501q0 q0Var) {
        this.f6264b = q0Var;
    }

    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f6264b.f6249a.mo33332g().mo45758d(this);
            return;
        }
        boolean g = this.f6264b.mo33471g();
        long unused = this.f6264b.f6251c = 0;
        if (g) {
            this.f6264b.mo33092c();
        }
    }
}
