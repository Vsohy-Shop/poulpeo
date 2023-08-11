package com.google.android.gms.internal.gtm;

import java.util.HashMap;
import java.util.Map;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.a9 */
public final class C5266a9 extends C5521r5 {

    /* renamed from: a */
    private final C5281b9 f5816a;

    public C5266a9(C5281b9 b9Var) {
        this.f5816a = b9Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        C5618xc xcVar;
        C9713p.m20275j(rcVarArr);
        if (rcVarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[0] instanceof C5315dd);
        String str = (String) rcVarArr[0].mo33142a();
        HashMap hashMap = new HashMap();
        if (rcVarArr.length >= 2 && (xcVar = rcVarArr[1]) != C5618xc.f6732h) {
            C9713p.m20266a(xcVar instanceof C5285bd);
            for (Map.Entry entry : ((Map) rcVarArr[1].mo33142a()).entrySet()) {
                C9713p.m20278m(!(entry.getValue() instanceof C5300cd));
                C9713p.m20278m(!C5345fd.m7946j((C5528rc) entry.getValue()));
                hashMap.put((String) entry.getKey(), ((C5528rc) entry.getValue()).mo33142a());
            }
        }
        return C5345fd.m7947k(this.f5816a.mo33132a(str, hashMap));
    }
}
