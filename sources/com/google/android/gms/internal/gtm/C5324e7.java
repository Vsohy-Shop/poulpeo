package com.google.android.gms.internal.gtm;

import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.e7 */
public final class C5324e7 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C9713p.m20266a(true);
        if (rcVarArr.length == 3) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[1] instanceof C5315dd);
        C9713p.m20266a(rcVarArr[2] instanceof C5632yc);
        C5528rc<?> rcVar = rcVarArr[0];
        String str = (String) rcVarArr[1].mo33142a();
        List list = (List) rcVarArr[2].mo33142a();
        if (rcVar.mo33500c(str)) {
            C5528rc<?> d = rcVar.mo33143d(str);
            if (d instanceof C5604wc) {
                return ((C5491p5) ((C5604wc) d).mo33142a()).mo33133a(b4Var, (C5528rc[]) list.toArray(new C5528rc[list.size()]));
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35);
            sb.append("Apply TypeError: ");
            sb.append(str);
            sb.append(" is not a function");
            throw new IllegalArgumentException(sb.toString());
        } else if (rcVar.mo33144e(str)) {
            C5491p5 f = rcVar.mo33146f(str);
            list.add(0, rcVar);
            return f.mo33133a(b4Var, (C5528rc[]) list.toArray(new C5528rc[list.size()]));
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40);
            sb2.append("Apply TypeError: object has no ");
            sb2.append(str);
            sb2.append(" property");
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
