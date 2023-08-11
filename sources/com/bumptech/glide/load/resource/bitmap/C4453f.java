package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import p058d1.C7222g;
import p058d1.C7224i;
import p094g1.C7744c;
import p294z1.C10778a;

/* renamed from: com.bumptech.glide.load.resource.bitmap.f */
/* compiled from: ByteBufferBitmapDecoder */
public class C4453f implements C7224i<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C4467m f4012a;

    public C4453f(C4467m mVar) {
        this.f4012a = mVar;
    }

    /* renamed from: c */
    public C7744c<Bitmap> mo31395a(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull C7222g gVar) {
        return this.f4012a.mo31422f(C10778a.m22922f(byteBuffer), i, i2, gVar);
    }

    /* renamed from: d */
    public boolean mo31396b(@NonNull ByteBuffer byteBuffer, @NonNull C7222g gVar) {
        return this.f4012a.mo31426q(byteBuffer);
    }
}
