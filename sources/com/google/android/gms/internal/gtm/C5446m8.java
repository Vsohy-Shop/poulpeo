package com.google.android.gms.internal.gtm;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.m8 */
public final class C5446m8 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        double d;
        double d2;
        double d3;
        C5618xc xcVar;
        C9713p.m20266a(true);
        if (rcVarArr.length <= 0 || rcVarArr.length > 3) {
            z = false;
        } else {
            z = true;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[0] instanceof C5315dd);
        String str = (String) rcVarArr[0].mo33142a();
        if (rcVarArr.length < 2) {
            d = 0.0d;
        } else {
            d = C5506q5.m8418e(rcVarArr[1]);
        }
        double length = (double) str.length();
        if (rcVarArr.length == 3 && (xcVar = rcVarArr[2]) != C5618xc.f6732h) {
            length = C5506q5.m8418e(xcVar);
        }
        if (d < 0.0d) {
            d2 = Math.max(((double) str.length()) + d, 0.0d);
        } else {
            d2 = Math.min(d, (double) str.length());
        }
        int i = (int) d2;
        if (length < 0.0d) {
            d3 = Math.max(((double) str.length()) + length, 0.0d);
        } else {
            d3 = Math.min(length, (double) str.length());
        }
        return new C5315dd(str.substring(i, Math.max(0, ((int) d3) - i) + i));
    }
}
