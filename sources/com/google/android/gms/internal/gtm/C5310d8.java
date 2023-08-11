package com.google.android.gms.internal.gtm;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.d8 */
public final class C5310d8 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        boolean z2;
        double d;
        boolean z3 = true;
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
        if ((Double.isInfinite(c) && c2 == 0.0d) || (c == 0.0d && Double.isInfinite(c2))) {
            return new C5589vc(Double.valueOf(Double.NaN));
        }
        if (!Double.isInfinite(c) && !Double.isInfinite(c2)) {
            return new C5589vc(Double.valueOf(c * c2));
        }
        if (((double) Double.compare(c, 0.0d)) < 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (((double) Double.compare(c2, 0.0d)) >= 0.0d) {
            z3 = false;
        }
        if (z3 ^ z2) {
            d = Double.NEGATIVE_INFINITY;
        } else {
            d = Double.POSITIVE_INFINITY;
        }
        return new C5589vc(Double.valueOf(d));
    }
}
