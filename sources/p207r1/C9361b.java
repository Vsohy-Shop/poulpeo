package p207r1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.resource.bitmap.C4479t;
import p058d1.C7222g;
import p094g1.C7744c;
import p294z1.C10791j;

/* renamed from: r1.b */
/* compiled from: BitmapDrawableTranscoder */
public class C9361b implements C9364e<Bitmap, BitmapDrawable> {

    /* renamed from: a */
    private final Resources f13920a;

    public C9361b(@NonNull Resources resources) {
        this.f13920a = (Resources) C10791j.m22948d(resources);
    }

    @Nullable
    /* renamed from: a */
    public C7744c<BitmapDrawable> mo43787a(@NonNull C7744c<Bitmap> cVar, @NonNull C7222g gVar) {
        return C4479t.m5459c(this.f13920a, cVar);
    }
}
