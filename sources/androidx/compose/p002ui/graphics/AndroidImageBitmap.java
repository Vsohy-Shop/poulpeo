package androidx.compose.p002ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.compose.p002ui.graphics.colorspace.ColorSpace;
import androidx.compose.p002ui.graphics.colorspace.ColorSpaces;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.graphics.AndroidImageBitmap */
/* compiled from: AndroidImageBitmap.android.kt */
public final class AndroidImageBitmap implements ImageBitmap {
    private final Bitmap bitmap;

    public AndroidImageBitmap(Bitmap bitmap2) {
        C12775o.m28639i(bitmap2, "bitmap");
        this.bitmap = bitmap2;
    }

    public final Bitmap getBitmap$ui_graphics_release() {
        return this.bitmap;
    }

    public ColorSpace getColorSpace() {
        if (Build.VERSION.SDK_INT < 26) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        Api26Bitmap api26Bitmap = Api26Bitmap.INSTANCE;
        return Api26Bitmap.composeColorSpace$ui_graphics_release(this.bitmap);
    }

    /* renamed from: getConfig-_sVssgQ  reason: not valid java name */
    public int m35530getConfig_sVssgQ() {
        Bitmap.Config config = this.bitmap.getConfig();
        C12775o.m28638h(config, "bitmap.config");
        return AndroidImageBitmap_androidKt.toImageConfig(config);
    }

    public boolean getHasAlpha() {
        return this.bitmap.hasAlpha();
    }

    public int getHeight() {
        return this.bitmap.getHeight();
    }

    public int getWidth() {
        return this.bitmap.getWidth();
    }

    public void prepareToDraw() {
        this.bitmap.prepareToDraw();
    }

    public void readPixels(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr2 = iArr;
        C12775o.m28639i(iArr, "buffer");
        Bitmap asAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(this);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 26 && asAndroidBitmap.getConfig() == Bitmap.Config.HARDWARE) {
            asAndroidBitmap = asAndroidBitmap.copy(Bitmap.Config.ARGB_8888, false);
            z = true;
        }
        boolean z2 = z;
        asAndroidBitmap.getPixels(iArr, i5, i6, i, i2, i3, i4);
        if (z2) {
            asAndroidBitmap.recycle();
        }
    }
}
