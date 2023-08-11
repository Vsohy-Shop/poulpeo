package com.google.android.gms.internal.gtm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.ia */
public final class C5388ia extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        int i;
        String str;
        C5618xc xcVar;
        C5618xc xcVar2;
        int i2 = 1;
        C9713p.m20266a(true);
        if (rcVarArr.length >= 2) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        C5618xc xcVar3 = rcVarArr[0];
        C5618xc xcVar4 = C5618xc.f6732h;
        if (xcVar3 == xcVar4 || rcVarArr[1] == xcVar4) {
            return xcVar4;
        }
        String g = C5506q5.m8420g(xcVar3);
        String g2 = C5506q5.m8420g(rcVarArr[1]);
        if (rcVarArr.length <= 2 || (xcVar2 = rcVarArr[2]) == xcVar4 || !C5506q5.m8415b(xcVar2)) {
            i = 64;
        } else {
            i = 66;
        }
        if (rcVarArr.length > 3 && (xcVar = rcVarArr[3]) != xcVar4) {
            if (!(xcVar instanceof C5589vc)) {
                return xcVar4;
            }
            double e = C5506q5.m8418e(xcVar);
            if (Double.isInfinite(e) || e < 0.0d) {
                return xcVar4;
            }
            i2 = (int) e;
        }
        try {
            Matcher matcher = Pattern.compile(g2, i).matcher(g);
            if (!matcher.find() || matcher.groupCount() < i2) {
                str = null;
            } else {
                str = matcher.group(i2);
            }
            if (str == null) {
                return xcVar4;
            }
            return new C5315dd(str);
        } catch (PatternSyntaxException unused) {
            return C5618xc.f6732h;
        }
    }
}
