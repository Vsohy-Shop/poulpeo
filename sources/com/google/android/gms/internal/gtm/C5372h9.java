package com.google.android.gms.internal.gtm;

import android.content.Context;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.h9 */
public final class C5372h9 extends C5521r5 {

    /* renamed from: a */
    private final Context f6029a;

    /* renamed from: b */
    private final C5637z3 f6030b;

    public C5372h9(Context context, C5637z3 z3Var) {
        this.f6029a = (Context) C9713p.m20275j(context);
        this.f6030b = z3Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        C5618xc xcVar;
        C5618xc xcVar2;
        C9713p.m20266a(true);
        if (rcVarArr.length == 0 || rcVarArr[0] == (xcVar = C5618xc.f6732h)) {
            return new C5315dd("");
        }
        Object obj = this.f6030b.mo33601a().mo33550d().get("_ldl");
        if (obj == null) {
            return new C5315dd("");
        }
        C5528rc<?> k = C5345fd.m7947k(obj);
        if (!(k instanceof C5315dd)) {
            return new C5315dd("");
        }
        String str = (String) ((C5315dd) k).mo33142a();
        if (!C5411k3.m8118b(str, "conv").equals(C5506q5.m8420g(rcVarArr[0]))) {
            return new C5315dd("");
        }
        String str2 = null;
        if (rcVarArr.length > 1 && (xcVar2 = rcVarArr[1]) != xcVar) {
            str2 = C5506q5.m8420g(xcVar2);
        }
        String b = C5411k3.m8118b(str, str2);
        if (b != null) {
            return new C5315dd(b);
        }
        return new C5315dd("");
    }
}
