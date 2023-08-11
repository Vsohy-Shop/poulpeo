package com.google.android.gms.internal.gtm;

import android.os.Build;
import androidx.core.p004os.EnvironmentCompat;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.t9 */
public final class C5556t9 implements C5491p5 {

    /* renamed from: a */
    private final String f6338a = Build.MANUFACTURER;

    /* renamed from: b */
    private final String f6339b = Build.MODEL;

    /* renamed from: a */
    public final C5528rc<?> mo33133a(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        boolean z2 = false;
        if (rcVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        if (rcVarArr.length == 0) {
            z2 = true;
        }
        C9713p.m20266a(z2);
        String str = this.f6338a;
        String str2 = this.f6339b;
        if (!str2.startsWith(str) && !str.equals(EnvironmentCompat.MEDIA_UNKNOWN)) {
            StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            str2 = sb.toString();
        }
        return new C5315dd(str2);
    }
}
