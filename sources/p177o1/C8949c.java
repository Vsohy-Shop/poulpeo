package p177o1;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p094g1.C7744c;

/* renamed from: o1.c */
/* compiled from: NonOwnedDrawableResource */
final class C8949c extends C8948b<Drawable> {
    private C8949c(Drawable drawable) {
        super(drawable);
    }

    @Nullable
    /* renamed from: c */
    static C7744c<Drawable> m18155c(@Nullable Drawable drawable) {
        if (drawable != null) {
            return new C8949c(drawable);
        }
        return null;
    }

    @NonNull
    /* renamed from: a */
    public Class<Drawable> mo31365a() {
        return this.f12986b.getClass();
    }

    public int getSize() {
        return Math.max(1, this.f12986b.getIntrinsicWidth() * this.f12986b.getIntrinsicHeight() * 4);
    }

    public void recycle() {
    }
}
