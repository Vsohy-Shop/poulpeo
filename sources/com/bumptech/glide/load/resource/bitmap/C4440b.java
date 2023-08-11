package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.File;
import p058d1.C7216c;
import p058d1.C7222g;
import p058d1.C7225j;
import p094g1.C7744c;
import p106h1.C7885d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b */
/* compiled from: BitmapDrawableEncoder */
public class C4440b implements C7225j<BitmapDrawable> {

    /* renamed from: a */
    private final C7885d f3994a;

    /* renamed from: b */
    private final C7225j<Bitmap> f3995b;

    public C4440b(C7885d dVar, C7225j<Bitmap> jVar) {
        this.f3994a = dVar;
        this.f3995b = jVar;
    }

    @NonNull
    /* renamed from: b */
    public C7216c mo31398b(@NonNull C7222g gVar) {
        return this.f3995b.mo31398b(gVar);
    }

    /* renamed from: c */
    public boolean mo31397a(@NonNull C7744c<BitmapDrawable> cVar, @NonNull File file, @NonNull C7222g gVar) {
        return this.f3995b.mo31397a(new C4452e(cVar.get().getBitmap(), this.f3994a), file, gVar);
    }
}
