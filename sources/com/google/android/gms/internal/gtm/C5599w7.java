package com.google.android.gms.internal.gtm;

import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.w7 */
public final class C5599w7 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        boolean z2;
        C9713p.m20266a(true);
        if (rcVarArr.length == 3) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[1] instanceof C5632yc);
        C9713p.m20266a(rcVarArr[2] instanceof C5632yc);
        C5528rc<?> rcVar = rcVarArr[0];
        List list = (List) rcVarArr[1].mo33142a();
        List list2 = (List) rcVarArr[2].mo33142a();
        if (list2.size() <= list.size() + 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9713p.m20266a(z2);
        boolean z3 = false;
        for (int i = 0; i < list.size(); i++) {
            if (z3 || C5506q5.m8421h(rcVar, C5345fd.m7937a(b4Var, (C5528rc) list.get(i)))) {
                C5528rc<?> a = C5345fd.m7937a(b4Var, (C5528rc) list2.get(i));
                if (!(a instanceof C5618xc)) {
                    z3 = true;
                } else if (a == C5618xc.f6730f || ((C5618xc) a).mo33621i()) {
                    return a;
                } else {
                    if (a == C5618xc.f6729e) {
                        return C5618xc.f6732h;
                    }
                }
            }
        }
        if (list.size() < list2.size()) {
            C5528rc<?> a2 = C5345fd.m7937a(b4Var, (C5528rc) list2.get(list2.size() - 1));
            if ((a2 instanceof C5618xc) && (a2 == C5618xc.f6730f || ((C5618xc) a2).mo33621i())) {
                return a2;
            }
        }
        return C5618xc.f6732h;
    }
}
