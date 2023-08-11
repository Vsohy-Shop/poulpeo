package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.s5 */
public final class C5536s5 extends C5521r5 {
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
        ArrayList arrayList = new ArrayList();
        for (C5528rc add : (List) rcVarArr[0].mo33142a()) {
            arrayList.add(add);
        }
        for (int i = 1; i < rcVarArr.length; i++) {
            C5632yc ycVar = rcVarArr[i];
            if (ycVar instanceof C5632yc) {
                for (C5528rc add2 : (List) ycVar.mo33142a()) {
                    arrayList.add(add2);
                }
            } else {
                arrayList.add(ycVar);
            }
        }
        return new C5632yc(arrayList);
    }
}
