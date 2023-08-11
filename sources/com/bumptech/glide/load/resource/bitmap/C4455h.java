package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import p058d1.C7222g;
import p058d1.C7224i;
import p094g1.C7744c;

@RequiresApi(api = 28)
/* renamed from: com.bumptech.glide.load.resource.bitmap.h */
/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder */
public final class C4455h implements C7224i<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C4451d f4013a = new C4451d();

    @Nullable
    /* renamed from: c */
    public C7744c<Bitmap> mo31395a(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull C7222g gVar) {
        return this.f4013a.mo31395a(ImageDecoder.createSource(byteBuffer), i, i2, gVar);
    }

    /* renamed from: d */
    public boolean mo31396b(@NonNull ByteBuffer byteBuffer, @NonNull C7222g gVar) {
        return true;
    }
}
