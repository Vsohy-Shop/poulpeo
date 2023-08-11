package com.google.android.gms.internal.gtm;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.i8 */
public final class C5386i8 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        double d;
        C9713p.m20266a(true);
        if (rcVarArr.length == 2 || rcVarArr.length == 3) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[0] instanceof C5315dd);
        String str = (String) rcVarArr[0].mo33142a();
        String g = C5506q5.m8420g(rcVarArr[1]);
        if (rcVarArr.length != 3 || Double.isNaN(C5506q5.m8416c(rcVarArr[2]))) {
            d = Double.POSITIVE_INFINITY;
        } else {
            d = C5506q5.m8418e(rcVarArr[2]);
        }
        return new C5589vc(Double.valueOf((double) str.lastIndexOf(g, (int) Math.min(Math.max(d, 0.0d), (double) str.length()))));
    }
}
