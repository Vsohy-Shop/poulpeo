package com.google.android.gms.internal.gtm;

import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.y5 */
public final class C5625y5 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C5618xc xcVar;
        C9713p.m20275j(rcVarArr);
        if (rcVarArr.length <= 0 || rcVarArr.length > 3) {
            z = false;
        } else {
            z = true;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[0] instanceof C5632yc);
        C5632yc ycVar = rcVarArr[0];
        if (rcVarArr.length < 2) {
            xcVar = C5618xc.f6732h;
        } else {
            xcVar = rcVarArr[1];
        }
        List list = (List) ycVar.mo33142a();
        int size = list.size();
        int i = size - 1;
        if (rcVarArr.length == 3) {
            int e = (int) C5506q5.m8418e(rcVarArr[2]);
            if (e < 0) {
                i = size - Math.abs(e);
            } else {
                i = Math.min(e, i);
            }
        }
        while (true) {
            if (i >= 0) {
                if (ycVar.mo33628m(i) && C5506q5.m8421h(xcVar, (C5528rc) list.get(i))) {
                    break;
                }
                i--;
            } else {
                i = -1;
                break;
            }
        }
        return new C5589vc(Double.valueOf((double) i));
    }
}
