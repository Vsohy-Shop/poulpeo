package com.google.android.gms.internal.gtm;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.c8 */
public final class C5295c8 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        int i;
        C9713p.m20266a(true);
        if (rcVarArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        double c = C5506q5.m8416c(rcVarArr[0]);
        double c2 = C5506q5.m8416c(rcVarArr[1]);
        if (Double.isNaN(c) || Double.isNaN(c2)) {
            return new C5589vc(Double.valueOf(Double.NaN));
        }
        if (Double.isInfinite(c) || c2 == 0.0d) {
            return new C5589vc(Double.valueOf(Double.NaN));
        }
        if (!Double.isInfinite(c) && Double.isInfinite(c2)) {
            return new C5589vc(Double.valueOf(c));
        }
        if (c != 0.0d || i == 0 || Double.isInfinite(c2)) {
            return new C5589vc(Double.valueOf(c % c2));
        }
        return new C5589vc(Double.valueOf(c));
    }
}
