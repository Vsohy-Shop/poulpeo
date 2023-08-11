package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import android.text.TextUtils;
import p296z3.C10812p;

/* renamed from: com.google.android.gms.internal.gtm.k1 */
public final class C5409k1 extends C5407k {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public SharedPreferences f6078d;

    /* renamed from: e */
    private long f6079e;

    /* renamed from: f */
    private long f6080f = -1;

    /* renamed from: g */
    private final C5439m1 f6081g = new C5439m1(this, "monitoring", C5592w0.f6415P.mo33605a().longValue());

    protected C5409k1(C5437m mVar) {
        super(mVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public final void mo33181P0() {
        this.f6078d = mo33276c().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    /* renamed from: S0 */
    public final long mo33311S0() {
        C10812p.m23065i();
        mo33310Q0();
        if (this.f6079e == 0) {
            long j = this.f6078d.getLong("first_run", 0);
            if (j != 0) {
                this.f6079e = j;
            } else {
                long a = mo33279k0().mo33547a();
                SharedPreferences.Editor edit = this.f6078d.edit();
                edit.putLong("first_run", a);
                if (!edit.commit()) {
                    mo33269L0("Failed to commit first run time");
                }
                this.f6079e = a;
            }
        }
        return this.f6079e;
    }

    /* renamed from: T0 */
    public final C5487p1 mo33312T0() {
        return new C5487p1(mo33279k0(), mo33311S0());
    }

    /* renamed from: U0 */
    public final long mo33313U0() {
        C10812p.m23065i();
        mo33310Q0();
        if (this.f6080f == -1) {
            this.f6080f = this.f6078d.getLong("last_dispatch", 0);
        }
        return this.f6080f;
    }

    /* renamed from: V0 */
    public final void mo33314V0() {
        C10812p.m23065i();
        mo33310Q0();
        long a = mo33279k0().mo33547a();
        SharedPreferences.Editor edit = this.f6078d.edit();
        edit.putLong("last_dispatch", a);
        edit.apply();
        this.f6080f = a;
    }

    /* renamed from: W0 */
    public final String mo33315W0() {
        C10812p.m23065i();
        mo33310Q0();
        String string = this.f6078d.getString("installation_campaign", (String) null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    /* renamed from: X0 */
    public final C5439m1 mo33316X0() {
        return this.f6081g;
    }
}
