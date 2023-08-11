package com.google.android.gms.internal.gtm;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.f8 */
public final class C5340f8 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C9713p.m20266a(true);
        int i = 0;
        if (rcVarArr.length == 1 || rcVarArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[0] instanceof C5315dd);
        String str = (String) rcVarArr[0].mo33142a();
        if (rcVarArr.length == 2) {
            i = (int) C5506q5.m8418e(rcVarArr[1]);
        }
        if (i < 0 || i >= str.length()) {
            return new C5315dd("");
        }
        return new C5315dd(String.valueOf(str.charAt(i)));
    }
}
