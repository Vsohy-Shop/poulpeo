package com.google.android.gms.measurement.internal;

import p023a5.C2206d;
import p023a5.C2207e;

/* renamed from: com.google.android.gms.measurement.internal.c4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C6108c4 {

    /* renamed from: a */
    final C6251p4 f7668a;

    C6108c4(C6157g9 g9Var) {
        this.f7668a = g9Var.mo34921b0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo34779a() {
        try {
            C2206d a = C2207e.m1805a(this.f7668a.mo34927f());
            if (a == null) {
                this.f7668a.mo34920b().mo35079v().mo35037a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a.mo23530e("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.f7668a.mo34920b().mo35079v().mo35038b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
