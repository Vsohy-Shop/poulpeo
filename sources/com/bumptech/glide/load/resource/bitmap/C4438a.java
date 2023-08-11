package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import p058d1.C7222g;
import p058d1.C7224i;
import p094g1.C7744c;
import p294z1.C10791j;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a */
/* compiled from: BitmapDrawableDecoder */
public class C4438a<DataType> implements C7224i<DataType, BitmapDrawable> {

    /* renamed from: a */
    private final C7224i<DataType, Bitmap> f3992a;

    /* renamed from: b */
    private final Resources f3993b;

    public C4438a(@NonNull Resources resources, @NonNull C7224i<DataType, Bitmap> iVar) {
        this.f3993b = (Resources) C10791j.m22948d(resources);
        this.f3992a = (C7224i) C10791j.m22948d(iVar);
    }

    /* renamed from: a */
    public C7744c<BitmapDrawable> mo31395a(@NonNull DataType datatype, int i, int i2, @NonNull C7222g gVar) {
        return C4479t.m5459c(this.f3993b, this.f3992a.mo31395a(datatype, i, i2, gVar));
    }

    /* renamed from: b */
    public boolean mo31396b(@NonNull DataType datatype, @NonNull C7222g gVar) {
        return this.f3992a.mo31396b(datatype, gVar);
    }
}
