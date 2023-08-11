package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.provider.Settings;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.r9 */
public final class C5525r9 implements C5491p5 {

    /* renamed from: a */
    private final Context f6285a;

    public C5525r9(Context context) {
        this.f6285a = context;
    }

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
        String string = Settings.Secure.getString(this.f6285a.getContentResolver(), "android_id");
        if (string == null) {
            string = "";
        }
        return new C5315dd(string);
    }
}
