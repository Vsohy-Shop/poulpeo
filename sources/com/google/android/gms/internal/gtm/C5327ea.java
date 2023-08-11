package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.provider.Settings;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.ea */
public final class C5327ea implements C5491p5 {

    /* renamed from: a */
    private final Context f5972a;

    public C5327ea(Context context) {
        this.f5972a = (Context) C9713p.m20275j(context);
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
        String string = Settings.Secure.getString(this.f5972a.getContentResolver(), "android_id");
        if (string != null) {
            return new C5315dd(string);
        }
        return C5618xc.f6732h;
    }
}
