package p106h1;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* renamed from: h1.e */
/* compiled from: BitmapPoolAdapter */
public class C7886e implements C7885d {
    /* renamed from: c */
    public void mo31429c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @NonNull
    /* renamed from: d */
    public Bitmap mo41602d(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @NonNull
    /* renamed from: e */
    public Bitmap mo41603e(int i, int i2, Bitmap.Config config) {
        return mo41602d(i, i2, config);
    }

    /* renamed from: b */
    public void mo41601b() {
    }

    /* renamed from: a */
    public void mo41600a(int i) {
    }
}
