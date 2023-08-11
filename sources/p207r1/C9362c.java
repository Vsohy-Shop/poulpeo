package p207r1;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.resource.bitmap.C4452e;
import p058d1.C7222g;
import p094g1.C7744c;
import p106h1.C7885d;
import p197q1.C9102c;

/* renamed from: r1.c */
/* compiled from: DrawableBytesTranscoder */
public final class C9362c implements C9364e<Drawable, byte[]> {

    /* renamed from: a */
    private final C7885d f13921a;

    /* renamed from: b */
    private final C9364e<Bitmap, byte[]> f13922b;

    /* renamed from: c */
    private final C9364e<C9102c, byte[]> f13923c;

    public C9362c(@NonNull C7885d dVar, @NonNull C9364e<Bitmap, byte[]> eVar, @NonNull C9364e<C9102c, byte[]> eVar2) {
        this.f13921a = dVar;
        this.f13922b = eVar;
        this.f13923c = eVar2;
    }

    @Nullable
    /* renamed from: a */
    public C7744c<byte[]> mo43787a(@NonNull C7744c<Drawable> cVar, @NonNull C7222g gVar) {
        Drawable drawable = cVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f13922b.mo43787a(C4452e.m5369c(((BitmapDrawable) drawable).getBitmap(), this.f13921a), gVar);
        }
        if (drawable instanceof C9102c) {
            return this.f13923c.mo43787a(m19374b(cVar), gVar);
        }
        return null;
    }

    @NonNull
    /* renamed from: b */
    private static C7744c<C9102c> m19374b(@NonNull C7744c<Drawable> cVar) {
        return cVar;
    }
}
