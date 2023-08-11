package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.g6 */
public final class C5353g6 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        int i;
        C9713p.m20275j(rcVarArr);
        if (rcVarArr.length == 2 || rcVarArr.length == 3) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[0] instanceof C5632yc);
        C5632yc ycVar = rcVarArr[0];
        int e = (int) C5506q5.m8418e(rcVarArr[1]);
        if (e < 0) {
            i = Math.max(((List) ycVar.mo33142a()).size() + e, 0);
        } else {
            i = Math.min(e, ((List) ycVar.mo33142a()).size());
        }
        int size = ((List) ycVar.mo33142a()).size();
        if (rcVarArr.length == 3) {
            int e2 = (int) C5506q5.m8418e(rcVarArr[2]);
            if (e2 < 0) {
                size = Math.max(e2 + ((List) ycVar.mo33142a()).size(), 0);
            } else {
                size = Math.min(e2, ((List) ycVar.mo33142a()).size());
            }
        }
        return new C5632yc(new ArrayList(((List) ycVar.mo33142a()).subList(i, Math.max(i, size))));
    }
}
