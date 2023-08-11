package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.os.RemoteException;
import java.util.Collections;
import p231t4.C9713p;
import p275x4.C10393b;
import p296z3.C10812p;

/* renamed from: com.google.android.gms.internal.gtm.q */
public final class C5500q extends C5407k {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C5530s f6244d = new C5530s(this);

    /* renamed from: e */
    private C5288c1 f6245e;

    /* renamed from: f */
    private final C5501q0 f6246f;

    /* renamed from: g */
    private final C5487p1 f6247g;

    protected C5500q(C5437m mVar) {
        super(mVar);
        this.f6247g = new C5487p1(mVar.mo33329d());
        this.f6246f = new C5515r(this, mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: U0 */
    public final void m8372U0(ComponentName componentName) {
        C10812p.m23065i();
        if (this.f6245e != null) {
            this.f6245e = null;
            mo33257A("Disconnected from device AnalyticsService", componentName);
            mo33284w0().mo33205Y0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y0 */
    public final void m8376Y0(C5288c1 c1Var) {
        C10812p.m23065i();
        this.f6245e = c1Var;
        m8378b1();
        mo33284w0().mo33199R0();
    }

    /* renamed from: b1 */
    private final void m8378b1() {
        this.f6247g.mo33443b();
        this.f6246f.mo33472h(C5592w0.f6410K.mo33605a().longValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: c1 */
    public final void m8379c1() {
        C10812p.m23065i();
        if (mo33467T0()) {
            mo33266I0("Inactivity, disconnecting from device AnalyticsService");
            mo33466S0();
        }
    }

    /* renamed from: R0 */
    public final boolean mo33465R0() {
        C10812p.m23065i();
        mo33310Q0();
        if (this.f6245e != null) {
            return true;
        }
        C5288c1 a = this.f6244d.mo33505a();
        if (a == null) {
            return false;
        }
        this.f6245e = a;
        m8378b1();
        return true;
    }

    /* renamed from: S0 */
    public final void mo33466S0() {
        C10812p.m23065i();
        mo33310Q0();
        try {
            C10393b.m21775b().mo45088c(mo33276c(), this.f6244d);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.f6245e != null) {
            this.f6245e = null;
            mo33284w0().mo33205Y0();
        }
    }

    /* renamed from: T0 */
    public final boolean mo33467T0() {
        C10812p.m23065i();
        mo33310Q0();
        if (this.f6245e != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a1 */
    public final boolean mo33468a1(C5273b1 b1Var) {
        String str;
        C9713p.m20275j(b1Var);
        C10812p.m23065i();
        mo33310Q0();
        C5288c1 c1Var = this.f6245e;
        if (c1Var == null) {
            return false;
        }
        if (b1Var.mo33114j()) {
            str = C5468o0.m8262h();
        } else {
            str = C5468o0.m8263i();
        }
        try {
            c1Var.mo33153f2(b1Var.mo33109e(), b1Var.mo33112h(), str, Collections.emptyList());
            m8378b1();
            return true;
        } catch (RemoteException unused) {
            mo33266I0("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public final void mo33181P0() {
    }
}
