package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.C11751p;
import com.squareup.picasso.C11768u;
import java.io.InputStream;
import okio.C13145j0;

/* renamed from: com.squareup.picasso.e */
/* compiled from: ContentStreamRequestHandler */
class C11731e extends C11768u {

    /* renamed from: a */
    final Context f18232a;

    C11731e(Context context) {
        this.f18232a = context;
    }

    /* renamed from: c */
    public boolean mo48661c(C11764s sVar) {
        return "content".equals(sVar.f18339d.getScheme());
    }

    /* renamed from: f */
    public C11768u.C11769a mo48662f(C11764s sVar, int i) {
        return new C11768u.C11769a(C13145j0.m29747l(mo48687j(sVar)), C11751p.C11757e.DISK);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public InputStream mo48687j(C11764s sVar) {
        return this.f18232a.getContentResolver().openInputStream(sVar.f18339d);
    }
}
