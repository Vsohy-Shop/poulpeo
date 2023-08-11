package com.google.android.gms.internal.gtm;

import android.content.Context;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.z9 */
public final class C5643z9 implements C5491p5 {

    /* renamed from: a */
    private Context f6760a;

    public C5643z9(Context context) {
        this.f6760a = (Context) C9713p.m20275j(context);
    }

    /* renamed from: a */
    public final C5528rc<?> mo33133a(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        String str;
        C5618xc xcVar;
        if (rcVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        if (rcVarArr.length <= 0 || (xcVar = rcVarArr[0]) == C5618xc.f6732h) {
            str = null;
        } else {
            str = C5506q5.m8420g(C5345fd.m7937a(b4Var, xcVar));
        }
        String a = C5411k3.m8117a(this.f6760a, str);
        if (a != null) {
            return new C5315dd(a);
        }
        return C5618xc.f6732h;
    }
}
