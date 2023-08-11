package com.google.android.gms.internal.gtm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.l8 */
public final class C5431l8 extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        String str;
        C9713p.m20266a(true);
        if (rcVarArr.length == 1 || rcVarArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C9713p.m20266a(rcVarArr[0] instanceof C5315dd);
        String str2 = (String) rcVarArr[0].mo33142a();
        if (rcVarArr.length < 2) {
            str = "";
        } else {
            str = C5506q5.m8420g(rcVarArr[1]);
        }
        Matcher matcher = Pattern.compile(str).matcher(str2);
        if (matcher.find()) {
            return new C5589vc(Double.valueOf((double) matcher.start()));
        }
        return new C5589vc(Double.valueOf(-1.0d));
    }
}
