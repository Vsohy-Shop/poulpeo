package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.x5 */
public final class C5611x5 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C5618xc xcVar;
        String str;
        C9713p.m20275j(rcVarArr);
        if (rcVarArr.length == 1 || rcVarArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[0] instanceof C5632yc);
        List<C5528rc> list = (List) rcVarArr[0].mo33142a();
        if (rcVarArr.length < 2) {
            xcVar = C5618xc.f6732h;
        } else {
            xcVar = rcVarArr[1];
        }
        if (xcVar == C5618xc.f6732h) {
            str = ",";
        } else {
            str = C5506q5.m8420g(xcVar);
        }
        ArrayList arrayList = new ArrayList();
        for (C5528rc rcVar : list) {
            if (rcVar == C5618xc.f6731g || rcVar == C5618xc.f6732h) {
                arrayList.add("");
            } else {
                arrayList.add(C5506q5.m8420g(rcVar));
            }
        }
        return new C5315dd(TextUtils.join(str, arrayList));
    }
}
