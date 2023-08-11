package com.google.android.gms.internal.gtm;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.r6 */
public final class C5522r6 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        boolean z2 = true;
        C9713p.m20266a(true);
        if (rcVarArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C5315dd ddVar = rcVarArr[0];
        C5315dd ddVar2 = rcVarArr[1];
        if ((ddVar instanceof C5285bd) || (ddVar instanceof C5632yc) || (ddVar instanceof C5604wc)) {
            ddVar = new C5315dd(C5506q5.m8420g(ddVar));
        }
        if ((ddVar2 instanceof C5285bd) || (ddVar2 instanceof C5632yc) || (ddVar2 instanceof C5604wc)) {
            ddVar2 = new C5315dd(C5506q5.m8420g(ddVar2));
        }
        if (((!(ddVar instanceof C5315dd) || !(ddVar2 instanceof C5315dd)) && (Double.isNaN(C5506q5.m8416c(ddVar)) || Double.isNaN(C5506q5.m8416c(ddVar2)))) || C5506q5.m8417d(ddVar, ddVar2)) {
            z2 = false;
        }
        return new C5574uc(Boolean.valueOf(z2));
    }
}
