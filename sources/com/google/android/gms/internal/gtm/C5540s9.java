package com.google.android.gms.internal.gtm;

import android.os.Build;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.s9 */
public final class C5540s9 implements C5491p5 {

    /* renamed from: a */
    private final String f6308a = Build.MODEL;

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
        return new C5315dd(this.f6308a);
    }
}
