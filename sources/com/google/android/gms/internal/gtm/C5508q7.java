package com.google.android.gms.internal.gtm;

import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.q7 */
public final class C5508q7 extends C5521r5 {

    /* renamed from: a */
    public static final C5508q7 f6257a = new C5508q7();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C9713p.m20266a(true);
        if (rcVarArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C5632yc ycVar = rcVarArr[0];
        C5528rc<?> rcVar = rcVarArr[1];
        C9713p.m20266a(!C5345fd.m7946j(ycVar));
        C9713p.m20266a(true ^ C5345fd.m7946j(rcVar));
        String g = C5506q5.m8420g(rcVar);
        if (ycVar instanceof C5632yc) {
            if ("length".equals(g)) {
                return new C5574uc(Boolean.TRUE);
            }
            double c = C5506q5.m8416c(rcVar);
            if (c == Math.floor(c)) {
                int i = (int) c;
                if (g.equals(Integer.toString(i)) && i >= 0 && i < ((List) ycVar.mo33142a()).size()) {
                    return new C5574uc(Boolean.TRUE);
                }
            }
        } else if (ycVar instanceof C5315dd) {
            if ("length".equals(g)) {
                return new C5574uc(Boolean.TRUE);
            }
            double c2 = C5506q5.m8416c(rcVar);
            if (c2 == Math.floor(c2)) {
                int i2 = (int) c2;
                if (g.equals(Integer.toString(i2)) && i2 >= 0 && i2 < ((String) ((C5315dd) ycVar).mo33142a()).length()) {
                    return new C5574uc(Boolean.TRUE);
                }
            }
            return new C5574uc(Boolean.FALSE);
        }
        return new C5574uc(Boolean.valueOf(ycVar.mo33500c(g)));
    }
}
