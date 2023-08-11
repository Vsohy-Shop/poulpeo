package com.google.android.gms.internal.gtm;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.k8 */
public final class C5416k8 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C5528rc<?> rcVar;
        C9713p.m20266a(true);
        if (rcVarArr.length <= 0 || rcVarArr.length > 3) {
            z = false;
        } else {
            z = true;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[0] instanceof C5315dd);
        String str = (String) rcVarArr[0].mo33142a();
        if (rcVarArr.length == 1) {
            return new C5315dd(str);
        }
        String g = C5506q5.m8420g(rcVarArr[1]);
        if (rcVarArr.length < 3) {
            rcVar = C5618xc.f6732h;
        } else {
            rcVar = rcVarArr[2];
        }
        int indexOf = str.indexOf(g);
        if (indexOf == -1) {
            return new C5315dd(str);
        }
        if (rcVar instanceof C5604wc) {
            rcVar = ((C5491p5) ((C5604wc) rcVar).mo33142a()).mo33133a(b4Var, new C5315dd(g), new C5589vc(Double.valueOf((double) indexOf)), new C5315dd(str));
        }
        String g2 = C5506q5.m8420g(rcVar);
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + g.length());
        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + String.valueOf(g2).length() + String.valueOf(substring2).length());
        sb.append(substring);
        sb.append(g2);
        sb.append(substring2);
        return new C5315dd(sb.toString());
    }
}
