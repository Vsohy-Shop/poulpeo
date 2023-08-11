package com.google.android.gms.internal.gtm;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.d7 */
public final class C5309d7 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        String str;
        C9713p.m20266a(true);
        if (rcVarArr.length == 1) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(!(rcVarArr[0] instanceof C5300cd));
        C9713p.m20266a(true ^ C5345fd.m7946j(rcVarArr[0]));
        C5618xc xcVar = rcVarArr[0];
        if (xcVar == C5618xc.f6732h) {
            str = "undefined";
        } else if (xcVar instanceof C5574uc) {
            str = TypedValues.Custom.S_BOOLEAN;
        } else if (xcVar instanceof C5589vc) {
            str = "number";
        } else if (xcVar instanceof C5315dd) {
            str = TypedValues.Custom.S_STRING;
        } else if (xcVar instanceof C5604wc) {
            str = "function";
        } else {
            str = "object";
        }
        return new C5315dd(str);
    }
}
