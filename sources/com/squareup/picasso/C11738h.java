package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.squareup.picasso.C11751p;
import com.squareup.picasso.C11768u;
import okio.C13145j0;

/* renamed from: com.squareup.picasso.h */
/* compiled from: FileRequestHandler */
class C11738h extends C11731e {
    C11738h(Context context) {
        super(context);
    }

    /* renamed from: k */
    static int m25197k(Uri uri) {
        return new ExifInterface(uri.getPath()).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
    }

    /* renamed from: c */
    public boolean mo48661c(C11764s sVar) {
        return "file".equals(sVar.f18339d.getScheme());
    }

    /* renamed from: f */
    public C11768u.C11769a mo48662f(C11764s sVar, int i) {
        return new C11768u.C11769a((Bitmap) null, C13145j0.m29747l(mo48687j(sVar)), C11751p.C11757e.DISK, m25197k(sVar.f18339d));
    }
}
