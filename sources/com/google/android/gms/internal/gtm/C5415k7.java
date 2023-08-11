package com.google.android.gms.internal.gtm;

import java.util.HashMap;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.k7 */
public final class C5415k7 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        C9713p.m20266a(true);
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i < rcVarArr.length - 1) {
            String g = C5506q5.m8420g(rcVarArr[i]);
            C5618xc xcVar = rcVarArr[i + 1];
            if (!(xcVar instanceof C5618xc) || xcVar == C5618xc.f6731g || xcVar == C5618xc.f6732h) {
                hashMap.put(g, xcVar);
                i += 2;
            } else {
                throw new IllegalStateException("Illegal InternalType found in CreateObject.");
            }
        }
        return new C5285bd(hashMap);
    }
}
