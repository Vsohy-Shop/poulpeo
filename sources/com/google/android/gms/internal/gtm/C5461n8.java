package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.n8 */
public final class C5461n8 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        int i;
        int i2 = 1;
        C9713p.m20266a(true);
        if (rcVarArr.length == 1 || rcVarArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[0] instanceof C5315dd);
        ArrayList arrayList = new ArrayList();
        if (rcVarArr.length == 1) {
            arrayList.add(rcVarArr[0]);
        } else {
            String str = (String) rcVarArr[0].mo33142a();
            String g = C5506q5.m8420g(rcVarArr[1]);
            boolean equals = g.equals("");
            if (equals) {
                i = 0;
            } else {
                i = -1;
            }
            String[] split = str.split(g, i);
            if (!equals || split.length <= 0 || !split[0].equals("")) {
                i2 = 0;
            }
            while (i2 < split.length) {
                arrayList.add(new C5315dd(split[i2]));
                i2++;
            }
        }
        return new C5632yc(arrayList);
    }
}
