package com.google.android.gms.internal.gtm;

import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.p7 */
public final class C5493p7 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C5528rc<?> l;
        C9713p.m20266a(true);
        boolean z2 = false;
        if (rcVarArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C5632yc ycVar = rcVarArr[0];
        C5528rc<?> rcVar = rcVarArr[1];
        boolean z3 = ycVar instanceof C5315dd;
        if (z3 || !C5345fd.m7945i(ycVar)) {
            z2 = true;
        }
        C9713p.m20266a(z2);
        C9713p.m20266a(!C5345fd.m7946j(ycVar));
        C9713p.m20266a(true ^ C5345fd.m7946j(rcVar));
        String g = C5506q5.m8420g(rcVar);
        if (ycVar instanceof C5632yc) {
            C5632yc ycVar2 = ycVar;
            if ("length".equals(g)) {
                return new C5589vc(Double.valueOf((double) ((List) ycVar2.mo33142a()).size()));
            }
            double c = C5506q5.m8416c(rcVar);
            if (c == Math.floor(c)) {
                int i = (int) c;
                if (g.equals(Integer.toString(i)) && (l = ycVar2.mo33627l(i)) != C5618xc.f6732h) {
                    return l;
                }
            }
        } else if (z3) {
            C5315dd ddVar = (C5315dd) ycVar;
            if ("length".equals(g)) {
                return new C5589vc(Double.valueOf((double) ((String) ddVar.mo33142a()).length()));
            }
            double c2 = C5506q5.m8416c(rcVar);
            if (c2 == Math.floor(c2)) {
                int i2 = (int) c2;
                if (g.equals(Integer.toString(i2))) {
                    return ddVar.mo33180j(i2);
                }
            }
            return C5618xc.f6732h;
        }
        return ycVar.mo33143d(g);
    }
}
