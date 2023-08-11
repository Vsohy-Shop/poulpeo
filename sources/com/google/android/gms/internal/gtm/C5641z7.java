package com.google.android.gms.internal.gtm;

import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.z7 */
public final class C5641z7 implements C5491p5 {
    /* renamed from: a */
    public final C5528rc<?> mo33133a(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        boolean z2;
        if (rcVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        if (rcVarArr.length == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9713p.m20266a(z2);
        C5528rc a = C5345fd.m7937a(b4Var, rcVarArr[3]);
        C9713p.m20266a(a instanceof C5632yc);
        List list = (List) ((C5632yc) a).mo33142a();
        C5574uc ucVar = rcVarArr[2];
        C9713p.m20266a(ucVar instanceof C5574uc);
        if (((Boolean) ucVar.mo33142a()).booleanValue()) {
            C5618xc c = C5345fd.m7939c(b4Var, list);
            if (c == C5618xc.f6729e) {
                return C5618xc.f6732h;
            }
            if (c.mo33621i()) {
                return c;
            }
        }
        while (C5506q5.m8415b(C5345fd.m7937a(b4Var, rcVarArr[0]))) {
            C5618xc c2 = C5345fd.m7939c(b4Var, list);
            if (c2 == C5618xc.f6729e) {
                return C5618xc.f6732h;
            }
            if (c2.mo33621i()) {
                return c2;
            }
            C5345fd.m7937a(b4Var, rcVarArr[1]);
        }
        return C5618xc.f6732h;
    }
}
