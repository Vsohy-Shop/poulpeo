package com.google.android.gms.internal.gtm;

import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.a6 */
public final class C5263a6 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C9713p.m20275j(rcVarArr);
        if (rcVarArr.length == 1) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[0] instanceof C5632yc);
        List list = (List) rcVarArr[0].mo33142a();
        C5618xc xcVar = C5618xc.f6732h;
        if (!list.isEmpty()) {
            return (C5528rc) list.remove(list.size() - 1);
        }
        return xcVar;
    }
}
