package com.google.android.gms.internal.gtm;

import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.c6 */
public final class C5293c6 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C5528rc<?> rcVar;
        int i;
        boolean z2;
        boolean z3;
        C9713p.m20275j(rcVarArr);
        if (rcVarArr.length == 2 || rcVarArr.length == 3) {
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
        if (rcVarArr.length == 3) {
            rcVar = rcVarArr[2];
            i = 0;
        } else {
            if (size > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C9713p.m20278m(z2);
            rcVar = ycVar.mo33627l(0);
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i = 1;
                    break;
                } else if (ycVar.mo33628m(i2)) {
                    rcVar = ycVar.mo33627l(i2);
                    i = i2 + 1;
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < size) {
                z3 = true;
            } else {
                z3 = false;
            }
            C9713p.m20278m(z3);
        }
        while (i < size && i < ((List) ycVar.mo33142a()).size()) {
            if (ycVar.mo33628m(i)) {
                rcVar = ((C5491p5) wcVar.mo33142a()).mo33133a(b4Var, rcVar, (C5528rc) list.get(i), new C5589vc(Double.valueOf((double) i)), ycVar);
            }
            i++;
        }
        return rcVar;
    }
}
