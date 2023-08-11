package com.google.android.gms.internal.gtm;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.ua */
public abstract class C5572ua extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C9713p.m20266a(true);
        if (rcVarArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        try {
            double c = C5506q5.m8416c(rcVarArr[0]);
            double c2 = C5506q5.m8416c(rcVarArr[1]);
            if (Double.isNaN(c) || Double.isNaN(c2)) {
                return new C5574uc(Boolean.FALSE);
            }
            return new C5574uc(Boolean.valueOf(mo33452c(c, c2)));
        } catch (IllegalArgumentException unused) {
            return new C5574uc(Boolean.FALSE);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo33452c(double d, double d2);
}
