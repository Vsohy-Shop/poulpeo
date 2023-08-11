package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.m7 */
public final class C5445m7 extends C5521r5 {
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C9713p.m20275j(rcVarArr);
        if (rcVarArr.length == 3) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[0] instanceof C5315dd);
        String str = (String) rcVarArr[0].mo33142a();
        C9713p.m20266a(b4Var.mo33121a(str));
        C5528rc<?> rcVar = rcVarArr[1];
        C9713p.m20275j(rcVar);
        C5632yc ycVar = rcVarArr[2];
        C9713p.m20266a(ycVar instanceof C5632yc);
        List list = (List) ycVar.mo33142a();
        Iterator<C5528rc<?>> g = rcVar.mo33147g();
        while (g.hasNext()) {
            b4Var.mo33124d(str, g.next());
            C5618xc c = C5345fd.m7939c(b4Var, list);
            if (c == C5618xc.f6729e) {
                return C5618xc.f6732h;
            }
            if (c.mo33621i()) {
                return c;
            }
        }
        return C5618xc.f6732h;
    }
}
