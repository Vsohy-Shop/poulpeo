package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.t7 */
public final class C5554t7 implements C5491p5 {
    /* renamed from: a */
    public final C5528rc<?> mo33133a(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        if (rcVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        ArrayList arrayList = new ArrayList(rcVarArr.length);
        for (C5528rc<?> add : rcVarArr) {
            arrayList.add(add);
        }
        return new C5632yc(arrayList);
    }
}
