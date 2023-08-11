package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.InputStream;
import p058d1.C7222g;
import p058d1.C7224i;
import p094g1.C7744c;
import p294z1.C10778a;

@RequiresApi(api = 28)
/* renamed from: com.bumptech.glide.load.resource.bitmap.s */
/* compiled from: InputStreamBitmapImageDecoderResourceDecoder */
public final class C4478s implements C7224i<InputStream, Bitmap> {

    /* renamed from: a */
    private final C4451d f4056a = new C4451d();

    @Nullable
    /* renamed from: c */
    public C7744c<Bitmap> mo31395a(@NonNull InputStream inputStream, int i, int i2, @NonNull C7222g gVar) {
        return this.f4056a.mo31395a(ImageDecoder.createSource(C10778a.m22918b(inputStream)), i, i2, gVar);
    }

    /* renamed from: d */
    public boolean mo31396b(@NonNull InputStream inputStream, @NonNull C7222g gVar) {
        return true;
    }
}
