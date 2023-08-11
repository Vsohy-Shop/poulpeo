package com.google.android.gms.internal.gtm;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.g8 */
public final class C5355g8 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C9713p.m20266a(true);
        if (rcVarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[0] instanceof C5315dd);
        StringBuilder sb = new StringBuilder((String) rcVarArr[0].mo33142a());
        for (int i = 1; i < rcVarArr.length; i++) {
            sb.append(C5506q5.m8420g(rcVarArr[i]));
        }
        return new C5315dd(sb.toString());
    }
}
