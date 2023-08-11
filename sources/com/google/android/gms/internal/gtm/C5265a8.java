package com.google.android.gms.internal.gtm;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.a8 */
public final class C5265a8 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        String str;
        C9713p.m20266a(true);
        if (rcVarArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C5618xc xcVar = rcVarArr[0];
        C5618xc xcVar2 = rcVarArr[1];
        if ((!(xcVar instanceof C5618xc) || xcVar == C5618xc.f6732h || xcVar == C5618xc.f6731g) && (!(xcVar2 instanceof C5618xc) || xcVar2 == C5618xc.f6732h || xcVar2 == C5618xc.f6731g)) {
            if ((xcVar instanceof C5285bd) || (xcVar instanceof C5632yc) || (xcVar instanceof C5604wc)) {
                xcVar = new C5315dd(C5506q5.m8420g(xcVar));
            }
            if ((xcVar2 instanceof C5285bd) || (xcVar2 instanceof C5632yc) || (xcVar2 instanceof C5604wc)) {
                xcVar2 = new C5315dd(C5506q5.m8420g(xcVar2));
            }
            if (!(xcVar instanceof C5315dd) && !(xcVar2 instanceof C5315dd)) {
                return new C5589vc(Double.valueOf(C5506q5.m8414a(xcVar, xcVar2)));
            }
            String valueOf = String.valueOf(C5506q5.m8420g(xcVar));
            String valueOf2 = String.valueOf(C5506q5.m8420g(xcVar2));
            if (valueOf2.length() != 0) {
                str = valueOf.concat(valueOf2);
            } else {
                str = new String(valueOf);
            }
            return new C5315dd(str);
        }
        throw new IllegalArgumentException("Illegal InternalType passed to Add.");
    }
}
