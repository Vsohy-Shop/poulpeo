package com.google.android.gms.internal.gtm;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.ha */
public final class C5373ha extends C5521r5 {

    /* renamed from: a */
    private static final C5589vc f6031a = new C5589vc(Double.valueOf(0.0d));

    /* renamed from: b */
    private static final C5589vc f6032b = new C5589vc(Double.valueOf(2.147483647E9d));

    /* renamed from: c */
    private static boolean m8007c(C5528rc<?> rcVar) {
        if (!(rcVar instanceof C5589vc) || Double.isNaN(((Double) ((C5589vc) rcVar).mo33142a()).doubleValue())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        C5589vc vcVar;
        C5589vc vcVar2;
        double d;
        double d2;
        C9713p.m20266a(true);
        if (rcVarArr.length > 0) {
            vcVar = rcVarArr[0];
        } else {
            vcVar = f6031a;
        }
        if (rcVarArr.length > 1) {
            vcVar2 = rcVarArr[1];
        } else {
            vcVar2 = f6032b;
        }
        if (!m8007c(vcVar) || !m8007c(vcVar2) || !C5506q5.m8417d(vcVar, vcVar2)) {
            d2 = 0.0d;
            d = 2.147483647E9d;
        } else {
            d2 = ((Double) vcVar.mo33142a()).doubleValue();
            d = ((Double) vcVar2.mo33142a()).doubleValue();
        }
        return new C5589vc(Double.valueOf((double) Math.round((Math.random() * (d - d2)) + d2)));
    }
}
