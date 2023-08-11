package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.i6 */
public final class C5384i6 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C5604wc wcVar;
        C9713p.m20275j(rcVarArr);
        if (rcVarArr.length == 1 || rcVarArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[0] instanceof C5632yc);
        C5632yc ycVar = rcVarArr[0];
        if (rcVarArr.length == 2) {
            C9713p.m20266a(rcVarArr[1] instanceof C5604wc);
            wcVar = rcVarArr[1];
        } else {
            wcVar = new C5604wc(new C5429l6());
        }
        Collections.sort((List) ycVar.mo33142a(), new C5414k6(this, wcVar, b4Var));
        return rcVarArr[0];
    }
}
