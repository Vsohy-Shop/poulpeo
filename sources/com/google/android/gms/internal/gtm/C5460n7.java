package com.google.android.gms.internal.gtm;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.n7 */
public final class C5460n7 implements C5491p5 {
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
        if (rcVarArr.length != 1) {
            z2 = false;
        }
        C9713p.m20266a(z2);
        C9713p.m20266a(rcVarArr[0] instanceof C5315dd);
        C5528rc<?> e = b4Var.mo33125e((String) rcVarArr[0].mo33142a());
        if (e instanceof C5300cd) {
            throw new IllegalStateException("Illegal Statement type encountered in Get.");
        } else if (!(e instanceof C5618xc) || e == C5618xc.f6732h || e == C5618xc.f6731g) {
            return e;
        } else {
            throw new IllegalStateException("Illegal InternalType encountered in Get.");
        }
    }
}
