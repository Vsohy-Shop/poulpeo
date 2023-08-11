package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p058d1.C7222g;
import p058d1.C7224i;
import p094g1.C7744c;
import p106h1.C7885d;
import p177o1.C8950d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.w */
/* compiled from: ResourceBitmapDecoder */
public class C4483w implements C7224i<Uri, Bitmap> {

    /* renamed from: a */
    private final C8950d f4066a;

    /* renamed from: b */
    private final C7885d f4067b;

    public C4483w(C8950d dVar, C7885d dVar2) {
        this.f4066a = dVar;
        this.f4067b = dVar2;
    }

    @Nullable
    /* renamed from: c */
    public C7744c<Bitmap> mo31395a(@NonNull Uri uri, int i, int i2, @NonNull C7222g gVar) {
        C7744c<Drawable> c = this.f4066a.mo31395a(uri, i, i2, gVar);
        if (c == null) {
            return null;
        }
        return C4470n.m5428a(this.f4067b, c.get(), i, i2);
    }

    /* renamed from: d */
    public boolean mo31396b(@NonNull Uri uri, @NonNull C7222g gVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
