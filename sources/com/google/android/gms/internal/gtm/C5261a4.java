package com.google.android.gms.internal.gtm;

import android.content.Context;
import p254v5.C9942c;
import p254v5.C9951l;

/* renamed from: com.google.android.gms.internal.gtm.a4 */
public final class C5261a4 {

    /* renamed from: a */
    private final Context f5809a;

    /* renamed from: b */
    private final String f5810b;

    /* renamed from: c */
    private final C9951l f5811c;

    /* renamed from: d */
    private final C9942c f5812d;

    public C5261a4(Context context, C9951l lVar, C9942c cVar, String str) {
        this.f5809a = context.getApplicationContext();
        this.f5811c = lVar;
        this.f5812d = cVar;
        this.f5810b = str;
    }

    /* renamed from: a */
    public final C5580v3 mo33097a(C5299cc ccVar, C5420kc kcVar) {
        return new C5580v3(this.f5809a, this.f5810b, ccVar, kcVar, this.f5811c, this.f5812d);
    }
}
