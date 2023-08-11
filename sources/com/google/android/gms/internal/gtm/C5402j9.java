package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.PackageManager;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.j9 */
public final class C5402j9 implements C5491p5 {

    /* renamed from: a */
    private Context f6066a;

    public C5402j9(Context context) {
        this.f6066a = context;
    }

    /* renamed from: a */
    public final C5528rc<?> mo33133a(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        boolean z2 = true;
        if (rcVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        if (rcVarArr.length != 0) {
            z2 = false;
        }
        C9713p.m20266a(z2);
        try {
            PackageManager packageManager = this.f6066a.getPackageManager();
            return new C5315dd(packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f6066a.getPackageName(), 0)).toString());
        } catch (PackageManager.NameNotFoundException unused) {
            return new C5315dd("");
        }
    }
}
