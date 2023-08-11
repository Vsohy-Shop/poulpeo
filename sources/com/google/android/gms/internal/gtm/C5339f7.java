package com.google.android.gms.internal.gtm;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.f7 */
public final class C5339f7 extends C5521r5 {
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
        C9713p.m20266a(rcVarArr[0] instanceof C5315dd);
        String str2 = (String) rcVarArr[0].mo33142a();
        if (b4Var.mo33121a(str2)) {
            b4Var.mo33124d(str2, rcVarArr[1]);
            return rcVarArr[1];
        }
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str = "Attempting to assign to undefined variable ".concat(valueOf);
        } else {
            str = new String("Attempting to assign to undefined variable ");
        }
        throw new IllegalStateException(str);
    }
}
