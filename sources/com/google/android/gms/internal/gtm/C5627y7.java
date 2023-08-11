package com.google.android.gms.internal.gtm;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.y7 */
public final class C5627y7 implements C5491p5 {
    /* renamed from: a */
    public final C5528rc<?> mo33133a(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        boolean z2 = true;
        if (rcVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        if (rcVarArr.length <= 0) {
            z2 = false;
        }
        C9713p.m20266a(z2);
        for (C5315dd ddVar : rcVarArr) {
            C9713p.m20275j(ddVar);
            C9713p.m20266a(ddVar instanceof C5315dd);
            b4Var.mo33123c((String) ddVar.mo33142a(), C5618xc.f6732h);
        }
        return C5618xc.f6732h;
    }
}
