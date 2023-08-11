package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.C11751p;
import com.squareup.picasso.C11768u;

/* renamed from: com.squareup.picasso.v */
/* compiled from: ResourceRequestHandler */
class C11770v extends C11768u {

    /* renamed from: a */
    private final Context f18390a;

    C11770v(Context context) {
        this.f18390a = context;
    }

    /* renamed from: j */
    private static Bitmap m25279j(Resources resources, int i, C11764s sVar) {
        BitmapFactory.Options d = C11768u.m25268d(sVar);
        if (C11768u.m25269g(d)) {
            BitmapFactory.decodeResource(resources, i, d);
            C11768u.m25267b(sVar.f18343h, sVar.f18344i, d, sVar);
        }
        return BitmapFactory.decodeResource(resources, i, d);
    }

    /* renamed from: c */
    public boolean mo48661c(C11764s sVar) {
        if (sVar.f18340e != 0) {
            return true;
        }
        return "android.resource".equals(sVar.f18339d.getScheme());
    }

    /* renamed from: f */
    public C11768u.C11769a mo48662f(C11764s sVar, int i) {
        Resources m = C11774x.m25307m(this.f18390a, sVar);
        return new C11768u.C11769a(m25279j(m, C11774x.m25306l(m, sVar), sVar), C11751p.C11757e.DISK);
    }
}
