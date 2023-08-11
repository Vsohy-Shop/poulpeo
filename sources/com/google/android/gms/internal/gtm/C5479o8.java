package com.google.android.gms.internal.gtm;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.o8 */
public final class C5479o8 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C5618xc xcVar;
        C5618xc xcVar2;
        C9713p.m20266a(true);
        if (rcVarArr.length <= 0 || rcVarArr.length > 3) {
            z = false;
        } else {
            z = true;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[0] instanceof C5315dd);
        String str = (String) rcVarArr[0].mo33142a();
        if (rcVarArr.length < 2) {
            xcVar = C5618xc.f6732h;
        } else {
            xcVar = rcVarArr[1];
        }
        int e = (int) C5506q5.m8418e(xcVar);
        int length = str.length();
        if (rcVarArr.length == 3 && (xcVar2 = rcVarArr[2]) != C5618xc.f6732h) {
            length = (int) C5506q5.m8418e(C5345fd.m7937a(b4Var, xcVar2));
        }
        int min = Math.min(Math.max(e, 0), str.length());
        int min2 = Math.min(Math.max(length, 0), str.length());
        return new C5315dd(str.substring(Math.min(min, min2), Math.max(min, min2)));
    }
}
