package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import p058d1.C7222g;
import p058d1.C7224i;
import p094g1.C7744c;
import p294z1.C10792k;

/* renamed from: com.bumptech.glide.load.resource.bitmap.z */
/* compiled from: UnitBitmapDecoder */
public final class C4488z implements C7224i<Bitmap, Bitmap> {
    /* renamed from: c */
    public C7744c<Bitmap> mo31395a(@NonNull Bitmap bitmap, int i, int i2, @NonNull C7222g gVar) {
        return new C4489a(bitmap);
    }

    /* renamed from: d */
    public boolean mo31396b(@NonNull Bitmap bitmap, @NonNull C7222g gVar) {
        return true;
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.z$a */
    /* compiled from: UnitBitmapDecoder */
    private static final class C4489a implements C7744c<Bitmap> {

        /* renamed from: b */
        private final Bitmap f4077b;

        C4489a(@NonNull Bitmap bitmap) {
            this.f4077b = bitmap;
        }

        @NonNull
        /* renamed from: a */
        public Class<Bitmap> mo31365a() {
            return Bitmap.class;
        }

        @NonNull
        /* renamed from: b */
        public Bitmap get() {
            return this.f4077b;
        }

        public int getSize() {
            return C10792k.m22956g(this.f4077b);
        }

        public void recycle() {
        }
    }
}
