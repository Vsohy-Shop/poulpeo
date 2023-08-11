package com.google.android.gms.internal.gtm;

import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.h6 */
public final class C5369h6 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C9713p.m20275j(rcVarArr);
        if (rcVarArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[0] instanceof C5632yc);
        C9713p.m20266a(rcVarArr[1] instanceof C5604wc);
        C5632yc ycVar = rcVarArr[0];
        C5604wc wcVar = rcVarArr[1];
        List list = (List) ycVar.mo33142a();
        int size = list.size();
        boolean z2 = false;
        int i = 0;
        while (!z2 && i < size && i < ((List) ycVar.mo33142a()).size()) {
            if (ycVar.mo33628m(i)) {
                z2 |= C5506q5.m8415b(((C5491p5) wcVar.mo33142a()).mo33133a(b4Var, (C5528rc) list.get(i), new C5589vc(Double.valueOf((double) i)), ycVar));
            }
            i++;
        }
        return new C5574uc(Boolean.valueOf(z2));
    }
}
