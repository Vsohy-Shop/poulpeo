package com.google.android.gms.internal.gtm;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.b8 */
public final class C5280b8 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        boolean z2;
        C5528rc<?>[] rcVarArr2 = rcVarArr;
        boolean z3 = true;
        C9713p.m20266a(true);
        if (rcVarArr2.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        double c = C5506q5.m8416c(rcVarArr2[0]);
        double c2 = C5506q5.m8416c(rcVarArr2[1]);
        if (Double.isNaN(c) || Double.isNaN(c2)) {
            return new C5589vc(Double.valueOf(Double.NaN));
        }
        if (Double.isInfinite(c) && Double.isInfinite(c2)) {
            return new C5589vc(Double.valueOf(Double.NaN));
        }
        double d = 0.0d;
        if (((double) Double.compare(c, 0.0d)) < 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (((double) Double.compare(c2, 0.0d)) >= 0.0d) {
            z3 = false;
        }
        boolean z4 = z2 ^ z3;
        double d2 = Double.NEGATIVE_INFINITY;
        if (Double.isInfinite(c) && !Double.isInfinite(c2)) {
            if (!z4) {
                d2 = Double.POSITIVE_INFINITY;
            }
            return new C5589vc(Double.valueOf(d2));
        } else if (Double.isInfinite(c) || !Double.isInfinite(c2)) {
            int i = (c > 0.0d ? 1 : (c == 0.0d ? 0 : -1));
            if (i == 0) {
                if (c2 == 0.0d) {
                    return new C5589vc(Double.valueOf(Double.NaN));
                }
                if (z4) {
                    d = -0.0d;
                }
                return new C5589vc(Double.valueOf(d));
            } else if (Double.isInfinite(c) || i == 0 || c2 != 0.0d) {
                return new C5589vc(Double.valueOf(c / c2));
            } else {
                if (!z4) {
                    d2 = Double.POSITIVE_INFINITY;
                }
                return new C5589vc(Double.valueOf(d2));
            }
        } else {
            if (z4) {
                d = -0.0d;
            }
            return new C5589vc(Double.valueOf(d));
        }
    }
}
