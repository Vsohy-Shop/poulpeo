package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import p231t4.C9713p;
import p296z3.C10812p;

/* renamed from: com.google.android.gms.internal.gtm.f */
public final class C5331f extends C5407k {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C5633z f5983d;

    public C5331f(C5437m mVar, C5467o oVar) {
        super(mVar);
        C9713p.m20275j(oVar);
        this.f5983d = new C5633z(mVar, oVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public final void mo33181P0() {
        this.f5983d.mo33309O0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R0 */
    public final void mo33199R0() {
        C10812p.m23065i();
        this.f5983d.mo33629R0();
    }

    /* renamed from: S0 */
    public final void mo33200S0() {
        this.f5983d.mo33630S0();
    }

    /* renamed from: T0 */
    public final long mo33201T0(C5485p pVar) {
        mo33310Q0();
        C9713p.m20275j(pVar);
        C10812p.m23065i();
        long T0 = this.f5983d.mo33631T0(pVar, true);
        if (T0 == 0) {
            this.f5983d.mo33633X0(pVar);
        }
        return T0;
    }

    /* renamed from: V0 */
    public final void mo33202V0(C5562u0 u0Var) {
        mo33310Q0();
        mo33282u0().mo45758d(new C5377i(this, u0Var));
    }

    /* renamed from: W0 */
    public final void mo33203W0(C5273b1 b1Var) {
        C9713p.m20275j(b1Var);
        mo33310Q0();
        mo33272R("Hit delivery requested", b1Var);
        mo33282u0().mo45758d(new C5362h(this, b1Var));
    }

    /* renamed from: X0 */
    public final void mo33204X0() {
        mo33310Q0();
        Context c = mo33276c();
        if (!C5454n1.m8216a(c) || !C5469o1.m8268a(c)) {
            mo33202V0((C5562u0) null);
            return;
        }
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(c, "com.google.android.gms.analytics.AnalyticsService"));
        c.startService(intent);
    }

    /* renamed from: Y0 */
    public final void mo33205Y0() {
        mo33310Q0();
        C10812p.m23065i();
        C5633z zVar = this.f5983d;
        C10812p.m23065i();
        zVar.mo33310Q0();
        zVar.mo33266I0("Service disconnected");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z0 */
    public final void mo33206Z0() {
        C10812p.m23065i();
        this.f5983d.mo33635a1();
    }
}
