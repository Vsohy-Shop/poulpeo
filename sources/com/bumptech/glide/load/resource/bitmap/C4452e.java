package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p094g1.C7743b;
import p094g1.C7744c;
import p106h1.C7885d;
import p294z1.C10791j;
import p294z1.C10792k;

/* renamed from: com.bumptech.glide.load.resource.bitmap.e */
/* compiled from: BitmapResource */
public class C4452e implements C7744c<Bitmap>, C7743b {

    /* renamed from: b */
    private final Bitmap f4010b;

    /* renamed from: c */
    private final C7885d f4011c;

    public C4452e(@NonNull Bitmap bitmap, @NonNull C7885d dVar) {
        this.f4010b = (Bitmap) C10791j.m22949e(bitmap, "Bitmap must not be null");
        this.f4011c = (C7885d) C10791j.m22949e(dVar, "BitmapPool must not be null");
    }

    @Nullable
    /* renamed from: c */
    public static C4452e m5369c(@Nullable Bitmap bitmap, @NonNull C7885d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new C4452e(bitmap, dVar);
    }

    @NonNull
    /* renamed from: a */
    public Class<Bitmap> mo31365a() {
        return Bitmap.class;
    }

    @NonNull
    /* renamed from: b */
    public Bitmap get() {
        return this.f4010b;
    }

    public int getSize() {
        return C10792k.m22956g(this.f4010b);
    }

    public void initialize() {
        this.f4010b.prepareToDraw();
    }

    public void recycle() {
        this.f4011c.mo31429c(this.f4010b);
    }
}
