package com.google.android.gms.internal.gtm;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.c7 */
public final class C5294c7 implements C5491p5 {
    /* renamed from: a */
    public final C5528rc<?> mo33133a(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        boolean z2;
        C5528rc<?> rcVar;
        if (rcVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        if (rcVarArr.length == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9713p.m20266a(z2);
        if (C5506q5.m8415b(C5345fd.m7937a(b4Var, rcVarArr[0]))) {
            rcVar = C5345fd.m7937a(b4Var, rcVarArr[1]);
        } else {
            rcVar = C5345fd.m7937a(b4Var, rcVarArr[2]);
        }
        if (!(rcVar instanceof C5618xc) || rcVar == C5618xc.f6732h || rcVar == C5618xc.f6731g) {
            return rcVar;
        }
        throw new IllegalArgumentException("Illegal InternalType passed to Ternary.");
    }
}
