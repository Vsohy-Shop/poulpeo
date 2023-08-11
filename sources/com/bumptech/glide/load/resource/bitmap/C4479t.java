package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p094g1.C7743b;
import p094g1.C7744c;
import p294z1.C10791j;

/* renamed from: com.bumptech.glide.load.resource.bitmap.t */
/* compiled from: LazyBitmapDrawableResource */
public final class C4479t implements C7744c<BitmapDrawable>, C7743b {

    /* renamed from: b */
    private final Resources f4057b;

    /* renamed from: c */
    private final C7744c<Bitmap> f4058c;

    private C4479t(@NonNull Resources resources, @NonNull C7744c<Bitmap> cVar) {
        this.f4057b = (Resources) C10791j.m22948d(resources);
        this.f4058c = (C7744c) C10791j.m22948d(cVar);
    }

    @Nullable
    /* renamed from: c */
    public static C7744c<BitmapDrawable> m5459c(@NonNull Resources resources, @Nullable C7744c<Bitmap> cVar) {
        if (cVar == null) {
            return null;
        }
        return new C4479t(resources, cVar);
    }

    @NonNull
    /* renamed from: a */
    public Class<BitmapDrawable> mo31365a() {
        return BitmapDrawable.class;
    }

    @NonNull
    /* renamed from: b */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f4057b, this.f4058c.get());
    }

    public int getSize() {
        return this.f4058c.getSize();
    }

    public void initialize() {
        C7744c<Bitmap> cVar = this.f4058c;
        if (cVar instanceof C7743b) {
            ((C7743b) cVar).initialize();
        }
    }

    public void recycle() {
        this.f4058c.recycle();
    }
}
