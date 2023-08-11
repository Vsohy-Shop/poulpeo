package com.google.android.gms.internal.gtm;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.v7 */
public final class C5584v7 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        C9713p.m20266a(true);
        if (rcVarArr.length == 3) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C5285bd bdVar = rcVarArr[0];
        C5528rc<?> rcVar = rcVarArr[1];
        C5528rc<?> rcVar2 = rcVarArr[2];
        if (bdVar != C5618xc.f6731g) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9713p.m20266a(z2);
        if (bdVar != C5618xc.f6732h) {
            z3 = true;
        } else {
            z3 = false;
        }
        C9713p.m20266a(z3);
        C9713p.m20266a(!C5345fd.m7946j(bdVar));
        C9713p.m20266a(!C5345fd.m7946j(rcVar));
        C9713p.m20266a(!C5345fd.m7946j(rcVar2));
        if (C5345fd.m7945i(bdVar)) {
            return rcVar2;
        }
        String g = C5506q5.m8420g(rcVar);
        if (bdVar instanceof C5285bd) {
            C5285bd bdVar2 = bdVar;
            if (!bdVar2.mo33148i()) {
                bdVar2.mo33499b(g, rcVar2);
            }
            return rcVar2;
        }
        if (bdVar instanceof C5632yc) {
            C5632yc ycVar = (C5632yc) bdVar;
            if ("length".equals(g)) {
                double c = C5506q5.m8416c(rcVar2);
                if (Double.isInfinite(c) || c != Math.floor(c)) {
                    z4 = false;
                }
                C9713p.m20266a(z4);
                ycVar.mo33625i((int) c);
                return rcVar2;
            }
            double c2 = C5506q5.m8416c(rcVar);
            if (!Double.isInfinite(c2) && c2 >= 0.0d) {
                int i = (int) c2;
                if (g.equals(Integer.toString(i))) {
                    ycVar.mo33626k(i, rcVar2);
                    return rcVar2;
                }
            }
        }
        bdVar.mo33499b(g, rcVar2);
        return rcVar2;
    }
}
