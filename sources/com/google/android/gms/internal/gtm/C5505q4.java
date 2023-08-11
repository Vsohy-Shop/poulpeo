package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import p254v5.C9949j;

/* renamed from: com.google.android.gms.internal.gtm.q4 */
final class C5505q4 extends C9949j {

    /* renamed from: a */
    final /* synthetic */ C5472o4 f6256a;

    C5505q4(C5472o4 o4Var) {
        this.f6256a = o4Var;
    }

    /* renamed from: w */
    public final void mo33479w(String str, String str2, Bundle bundle, long j) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
        sb.append(str);
        sb.append("+gtm");
        this.f6256a.f6199e.execute(new C5520r4(this, str2, bundle, sb.toString(), j, str));
    }
}
