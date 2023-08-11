package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.C11751p;
import com.squareup.picasso.C11768u;
import okio.C13145j0;

/* renamed from: com.squareup.picasso.b */
/* compiled from: AssetRequestHandler */
class C11722b extends C11768u {

    /* renamed from: d */
    private static final int f18198d = 22;

    /* renamed from: a */
    private final Context f18199a;

    /* renamed from: b */
    private final Object f18200b = new Object();

    /* renamed from: c */
    private AssetManager f18201c;

    C11722b(Context context) {
        this.f18199a = context;
    }

    /* renamed from: j */
    static String m25134j(C11764s sVar) {
        return sVar.f18339d.toString().substring(f18198d);
    }

    /* renamed from: c */
    public boolean mo48661c(C11764s sVar) {
        Uri uri = sVar.f18339d;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C11768u.C11769a mo48662f(C11764s sVar, int i) {
        if (this.f18201c == null) {
            synchronized (this.f18200b) {
                if (this.f18201c == null) {
                    this.f18201c = this.f18199a.getAssets();
                }
            }
        }
        return new C11768u.C11769a(C13145j0.m29747l(this.f18201c.open(m25134j(sVar))), C11751p.C11757e.DISK);
    }
}
