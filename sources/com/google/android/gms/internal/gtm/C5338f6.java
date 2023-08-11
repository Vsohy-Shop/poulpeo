package com.google.android.gms.internal.gtm;

import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.f6 */
public final class C5338f6 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        C9713p.m20275j(rcVarArr);
        boolean z = true;
        if (rcVarArr.length != 1) {
            z = false;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[0] instanceof C5632yc);
        C5618xc xcVar = C5618xc.f6732h;
        List list = (List) rcVarArr[0].mo33142a();
        if (!list.isEmpty()) {
            return (C5528rc) list.remove(0);
        }
        return xcVar;
    }
}
