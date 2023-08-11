package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.concurrent.locks.Lock;
import p094g1.C7744c;
import p106h1.C7885d;
import p106h1.C7886e;

/* renamed from: com.bumptech.glide.load.resource.bitmap.n */
/* compiled from: DrawableToBitmapConverter */
final class C4470n {

    /* renamed from: a */
    private static final C7885d f4040a = new C4471a();

    @Nullable
    /* renamed from: a */
    static C7744c<Bitmap> m5428a(C7885d dVar, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = m5429b(dVar, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            dVar = f4040a;
        }
        return C4452e.m5369c(bitmap, dVar);
    }

    @Nullable
    /* renamed from: b */
    private static Bitmap m5429b(C7885d dVar, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        } else if (i2 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock c = C4486y.m5482c();
            c.lock();
            Bitmap d = dVar.mo41602d(i, i2, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(d);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap((Bitmap) null);
                return d;
            } finally {
                c.unlock();
            }
        } else {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.n$a */
    /* compiled from: DrawableToBitmapConverter */
    class C4471a extends C7886e {
        C4471a() {
        }

        /* renamed from: c */
        public void mo31429c(Bitmap bitmap) {
        }
    }
}
