package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.gtm.r1 */
public final class C5517r1 extends C5407k {

    /* renamed from: d */
    private String f6265d;

    /* renamed from: e */
    private String f6266e;

    /* renamed from: f */
    private int f6267f;

    /* renamed from: g */
    protected boolean f6268g;

    /* renamed from: h */
    protected int f6269h;

    /* renamed from: i */
    private boolean f6270i;

    /* renamed from: j */
    private boolean f6271j;

    public C5517r1(C5437m mVar) {
        super(mVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public final void mo33181P0() {
        ApplicationInfo applicationInfo;
        int i;
        C5258a1 a1Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        Context c = mo33276c();
        try {
            applicationInfo = c.getPackageManager().getApplicationInfo(c.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            mo33262E0("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            mo33269L0("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null && (i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) > 0 && (a1Var = (C5258a1) new C5620y0(mo33278j0()).mo33345O0(i)) != null) {
            mo33266I0("Loading global XML config values");
            String str = a1Var.f5797a;
            boolean z5 = false;
            if (str != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f6266e = str;
                mo33272R("XML config - app name", str);
            }
            String str2 = a1Var.f5798b;
            if (str2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.f6265d = str2;
                mo33272R("XML config - app version", str2);
            }
            String str3 = a1Var.f5799c;
            if (str3 != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                String lowerCase = str3.toLowerCase(Locale.US);
                if ("verbose".equals(lowerCase)) {
                    i2 = 0;
                } else if ("info".equals(lowerCase)) {
                    i2 = 1;
                } else if ("warning".equals(lowerCase)) {
                    i2 = 2;
                } else if (MediaRouteProviderProtocol.SERVICE_DATA_ERROR.equals(lowerCase)) {
                    i2 = 3;
                } else {
                    i2 = -1;
                }
                if (i2 >= 0) {
                    this.f6267f = i2;
                    mo33257A("XML config - log level", Integer.valueOf(i2));
                }
            }
            int i3 = a1Var.f5800d;
            if (i3 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                this.f6269h = i3;
                this.f6268g = true;
                mo33272R("XML config - dispatch period (sec)", Integer.valueOf(i3));
            }
            int i4 = a1Var.f5801e;
            if (i4 != -1) {
                if (i4 == 1) {
                    z5 = true;
                }
                this.f6271j = z5;
                this.f6270i = true;
                mo33272R("XML config - dry run", Boolean.valueOf(z5));
            }
        }
    }

    /* renamed from: R0 */
    public final String mo33491R0() {
        mo33310Q0();
        return this.f6266e;
    }

    /* renamed from: S0 */
    public final String mo33492S0() {
        mo33310Q0();
        return this.f6265d;
    }

    /* renamed from: T0 */
    public final boolean mo33493T0() {
        mo33310Q0();
        return false;
    }

    /* renamed from: U0 */
    public final boolean mo33494U0() {
        mo33310Q0();
        return this.f6270i;
    }

    /* renamed from: V0 */
    public final boolean mo33495V0() {
        mo33310Q0();
        return this.f6271j;
    }
}
