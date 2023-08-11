package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.e6 */
public final class C5323e6 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        C9713p.m20275j(rcVarArr);
        boolean z = true;
        if (rcVarArr.length != 1) {
            z = false;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[0] instanceof C5632yc);
        Collections.reverse((List) rcVarArr[0].mo33142a());
        return rcVarArr[0];
    }
}
