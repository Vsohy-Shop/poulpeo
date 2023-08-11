package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.PackageManager;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.k9 */
public final class C5417k9 implements C5491p5 {

    /* renamed from: a */
    private final Context f6094a;

    public C5417k9(Context context) {
        this.f6094a = (Context) C9713p.m20275j(context);
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
            return new C5589vc(Double.valueOf((double) this.f6094a.getPackageManager().getPackageInfo(this.f6094a.getPackageName(), 0).versionCode));
        } catch (PackageManager.NameNotFoundException e) {
            String packageName = this.f6094a.getPackageName();
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 25 + String.valueOf(message).length());
            sb.append("Package name ");
            sb.append(packageName);
            sb.append(" not found. ");
            sb.append(message);
            C5426l3.m8135e(sb.toString());
            return C5618xc.f6732h;
        }
    }
}
