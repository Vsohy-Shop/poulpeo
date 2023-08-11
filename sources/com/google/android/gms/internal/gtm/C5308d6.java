package com.google.android.gms.internal.gtm;

import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.d6 */
public final class C5308d6 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C5528rc<?> rcVar;
        int i;
        boolean z2;
        int i2;
        C5528rc<?> rcVar2;
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
            i = size - 1;
        } else {
            if (size > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C9713p.m20278m(z2);
            int i3 = size - 1;
            C5528rc<?> l = ycVar.mo33627l(i3);
            int i4 = size - 2;
            while (true) {
                if (i3 < 0) {
                    C5528rc<?> rcVar3 = l;
                    i2 = i4;
                    rcVar2 = rcVar3;
                    break;
                } else if (ycVar.mo33628m(i3)) {
                    rcVar2 = ycVar.mo33627l(i3);
                    i2 = i3 - 1;
                    break;
                } else {
                    i3--;
                }
            }
            if (i3 >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            C9713p.m20278m(z3);
            rcVar = rcVar2;
            i = i2;
        }
        while (i >= 0) {
            if (ycVar.mo33628m(i)) {
                rcVar = ((C5491p5) wcVar.mo33142a()).mo33133a(b4Var, rcVar, (C5528rc) list.get(i), new C5589vc(Double.valueOf((double) i)), ycVar);
            }
            i--;
        }
        return rcVar;
    }
}
