package com.google.android.gms.internal.gtm;

import org.json.JSONArray;
import org.json.JSONException;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.c9 */
public final class C5296c9 extends C5521r5 {

    /* renamed from: a */
    private final int f5906a;

    /* renamed from: b */
    private final C5276b4 f5907b;

    public C5296c9(int i, C5276b4 b4Var) {
        this.f5906a = i;
        this.f5907b = b4Var;
    }

    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z = true;
        C9713p.m20266a(true);
        if (rcVarArr.length != 1) {
            z = false;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[0] instanceof C5315dd);
        try {
            C5476o5 g = C5298cb.m7834g(new JSONArray((String) rcVarArr[0].mo33142a()).getJSONArray(0));
            g.mo33427d(this.f5907b);
            C5528rc<?> a = g.mo33133a(b4Var, new C5528rc[0]);
            if (this.f5906a == 0) {
                return C5618xc.f6732h;
            }
            return a;
        } catch (JSONException e) {
            C5426l3.m8132b("Unable to convert Custom Pixie to instruction", e);
            return C5618xc.f6732h;
        }
    }
}
