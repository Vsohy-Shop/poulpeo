package com.google.android.gms.internal.gtm;

import java.io.UnsupportedEncodingException;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.w8 */
public final class C5600w8 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        C5528rc rcVar;
        C9713p.m20266a(true);
        if (rcVarArr.length > 0) {
            rcVar = (C5528rc) C9713p.m20275j(rcVarArr[0]);
        } else {
            rcVar = C5618xc.f6732h;
        }
        try {
            return new C5315dd(C5585v8.m8596c(C5506q5.m8420g(rcVar), ""));
        } catch (UnsupportedEncodingException unused) {
            return C5618xc.f6732h;
        }
    }
}
