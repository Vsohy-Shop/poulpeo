package com.google.android.gms.internal.gtm;

import android.content.Context;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.f9 */
public final class C5341f9 implements C5491p5 {

    /* renamed from: a */
    private final C5274b2 f5989a;

    public C5341f9(Context context) {
        this(C5274b2.m7780j(context));
    }

    /* renamed from: a */
    public final C5528rc<?> mo33133a(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        boolean z2 = true;
        if (rcVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        if (rcVarArr.length != 0) {
            z2 = false;
        }
        C9713p.m20266a(z2);
        String e = this.f5989a.mo33119e();
        if (e == null) {
            return C5618xc.f6732h;
        }
        return new C5315dd(e);
    }

    private C5341f9(C5274b2 b2Var) {
        this.f5989a = b2Var;
    }
}
