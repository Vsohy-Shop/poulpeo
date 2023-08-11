package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.ka */
public final class C5418ka implements C5491p5 {

    /* renamed from: a */
    private Context f6095a;

    /* renamed from: b */
    private DisplayMetrics f6096b = new DisplayMetrics();

    public C5418ka(Context context) {
        this.f6095a = context;
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
        ((WindowManager) this.f6095a.getSystemService("window")).getDefaultDisplay().getMetrics(this.f6096b);
        return new C5315dd(this.f6096b.widthPixels + "x" + this.f6096b.heightPixels);
    }
}
