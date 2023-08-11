package com.google.android.gms.internal.gtm;

import android.content.Context;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.da */
public final class C5312da extends C5521r5 {

    /* renamed from: a */
    private final Context f5922a;

    /* renamed from: b */
    private final C5637z3 f5923b;

    public C5312da(Context context, C5637z3 z3Var) {
        this.f5922a = context;
        this.f5923b = z3Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C9713p.m20266a(true);
        if (rcVarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        Object obj = this.f5923b.mo33601a().mo33550d().get(C5506q5.m8420g(rcVarArr[0]));
        Object obj2 = obj;
        if (obj == null) {
            obj2 = obj;
            if (rcVarArr.length > 1) {
                obj2 = rcVarArr[1];
            }
        }
        return C5345fd.m7947k(obj2);
    }
}
