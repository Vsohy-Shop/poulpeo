package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.n6 */
public final class C5459n6 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C9713p.m20275j(rcVarArr);
        if (rcVarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[0] instanceof C5632yc);
        C5632yc ycVar = rcVarArr[0];
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < rcVarArr.length; i++) {
            arrayList.add(rcVarArr[i]);
        }
        ((List) ycVar.mo33142a()).addAll(0, arrayList);
        return new C5589vc(Double.valueOf((double) ((List) ycVar.mo33142a()).size()));
    }
}
