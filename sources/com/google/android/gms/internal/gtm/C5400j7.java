package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.j7 */
public final class C5400j7 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C9713p.m20266a(true);
        ArrayList arrayList = new ArrayList();
        for (C5618xc xcVar : rcVarArr) {
            if (!(xcVar instanceof C5618xc) || xcVar == C5618xc.f6732h || xcVar == C5618xc.f6731g) {
                z = true;
            } else {
                z = false;
            }
            C9713p.m20266a(z);
            arrayList.add(xcVar);
        }
        return new C5632yc(arrayList);
    }
}
