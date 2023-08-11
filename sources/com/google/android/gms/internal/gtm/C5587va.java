package com.google.android.gms.internal.gtm;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.va */
public final class C5587va extends C5521r5 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        int i;
        C9713p.m20266a(true);
        boolean z2 = false;
        if (rcVarArr.length == 2 || rcVarArr.length == 3) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        String g = C5506q5.m8420g(rcVarArr[0]);
        String g2 = C5506q5.m8420g(rcVarArr[1]);
        if (rcVarArr.length >= 3) {
            z2 = "true".equalsIgnoreCase(C5506q5.m8420g(rcVarArr[2]));
        }
        if (z2) {
            i = 66;
        } else {
            i = 64;
        }
        try {
            return new C5574uc(Boolean.valueOf(Pattern.compile(g2, i).matcher(g).find()));
        } catch (PatternSyntaxException unused) {
            return new C5574uc(Boolean.FALSE);
        }
    }
}
