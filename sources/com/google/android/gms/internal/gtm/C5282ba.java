package com.google.android.gms.internal.gtm;

import java.util.Locale;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.ba */
public final class C5282ba implements C5491p5 {
    /* renamed from: a */
    public final C5528rc<?> mo33133a(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        boolean z;
        boolean z2 = true;
        if (rcVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        if (rcVarArr.length != 0) {
            z2 = false;
        }
        C9713p.m20266a(z2);
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return new C5315dd("");
        }
        String language = locale.getLanguage();
        if (language == null) {
            return new C5315dd("");
        }
        return new C5315dd(language.toLowerCase());
    }
}
