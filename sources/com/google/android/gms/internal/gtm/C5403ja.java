package com.google.android.gms.internal.gtm;

import android.os.Build;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.ja */
public final class C5403ja implements C5491p5 {
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
        int i = Build.VERSION.SDK_INT;
        StringBuilder sb = new StringBuilder(16);
        sb.append("5.06-");
        sb.append(i);
        return new C5315dd(sb.toString());
    }
}
