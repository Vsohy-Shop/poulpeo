package com.google.android.gms.internal.gtm;

import android.content.Context;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.g9 */
public final class C5356g9 implements C5491p5 {

    /* renamed from: a */
    private final C5274b2 f6011a;

    public C5356g9(Context context) {
        this(C5274b2.m7780j(context));
    }

    /* renamed from: a */
    public final C5528rc<?> mo33133a(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        boolean z2 = false;
        if (rcVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        if (rcVarArr.length == 0) {
            z2 = true;
        }
        C9713p.m20266a(z2);
        return new C5574uc(Boolean.valueOf(!this.f6011a.mo33118a()));
    }

    private C5356g9(C5274b2 b2Var) {
        this.f6011a = b2Var;
    }
}
