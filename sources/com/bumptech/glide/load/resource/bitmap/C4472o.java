package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.C4362b;
import java.security.MessageDigest;
import p058d1.C7226k;
import p094g1.C7744c;
import p106h1.C7885d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.o */
/* compiled from: DrawableTransformation */
public class C4472o implements C7226k<Drawable> {

    /* renamed from: b */
    private final C7226k<Bitmap> f4041b;

    /* renamed from: c */
    private final boolean f4042c;

    public C4472o(C7226k<Bitmap> kVar, boolean z) {
        this.f4041b = kVar;
        this.f4042c = z;
    }

    /* renamed from: d */
    private C7744c<Drawable> m5431d(Context context, C7744c<Bitmap> cVar) {
        return C4479t.m5459c(context.getResources(), cVar);
    }

    /* renamed from: a */
    public void mo31272a(@NonNull MessageDigest messageDigest) {
        this.f4041b.mo31272a(messageDigest);
    }

    @NonNull
    /* renamed from: b */
    public C7744c<Drawable> mo31430b(@NonNull Context context, @NonNull C7744c<Drawable> cVar, int i, int i2) {
        C7885d f = C4362b.m5041c(context).mo31177f();
        Drawable drawable = cVar.get();
        C7744c<Bitmap> a = C4470n.m5428a(f, drawable, i, i2);
        if (a != null) {
            C7744c<Bitmap> b = this.f4041b.mo31430b(context, a, i, i2);
            if (!b.equals(a)) {
                return m5431d(context, b);
            }
            b.recycle();
            return cVar;
        } else if (!this.f4042c) {
            return cVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4472o) {
            return this.f4041b.equals(((C4472o) obj).f4041b);
        }
        return false;
    }

    public int hashCode() {
        return this.f4041b.hashCode();
    }

    /* renamed from: c */
    public C7226k<BitmapDrawable> mo31431c() {
        return this;
    }
}
