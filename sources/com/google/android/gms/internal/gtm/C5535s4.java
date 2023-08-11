package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import p254v5.C9946g;

/* renamed from: com.google.android.gms.internal.gtm.s4 */
final class C5535s4 extends C9946g {

    /* renamed from: a */
    final /* synthetic */ C5472o4 f6307a;

    C5535s4(C5472o4 o4Var) {
        this.f6307a = o4Var;
    }

    /* renamed from: s */
    public final void mo33515s(String str, String str2, Bundle bundle, long j) {
        String str3 = str;
        if (!str.endsWith("+gtm")) {
            StringBuilder sb = new StringBuilder(str.length() + 4);
            sb.append(str);
            sb.append("+gtm");
            this.f6307a.f6199e.execute(new C5551t4(this, str2, bundle, sb.toString(), j, str));
            return;
        }
    }
}
