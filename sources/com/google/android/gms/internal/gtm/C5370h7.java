package com.google.android.gms.internal.gtm;

import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.h7 */
public final class C5370h7 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z = true;
        C9713p.m20266a(true);
        if (rcVarArr.length != 1) {
            z = false;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[0] instanceof C5632yc);
        for (C5528rc a : (List) rcVarArr[0].mo33142a()) {
            C5528rc<?> a2 = C5345fd.m7937a(b4Var, a);
            if ((a2 instanceof C5618xc) && (a2 == C5618xc.f6729e || a2 == C5618xc.f6730f || ((C5618xc) a2).mo33621i())) {
                return a2;
            }
        }
        return C5618xc.f6732h;
    }
}
