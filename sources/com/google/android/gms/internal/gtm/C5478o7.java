package com.google.android.gms.internal.gtm;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.o7 */
public final class C5478o7 implements C5491p5 {

    /* renamed from: a */
    private static C5580v3 f6216a;

    public C5478o7(C5580v3 v3Var) {
        f6216a = v3Var;
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
        if (rcVarArr.length != 1) {
            z2 = false;
        }
        C9713p.m20266a(z2);
        C9713p.m20266a(rcVarArr[0] instanceof C5315dd);
        return f6216a.mo33579h((String) rcVarArr[0].mo33142a());
    }
}
