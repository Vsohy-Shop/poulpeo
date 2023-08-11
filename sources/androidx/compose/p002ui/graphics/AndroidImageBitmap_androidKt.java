package androidx.compose.p002ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.p002ui.graphics.ImageBitmapConfig;
import androidx.compose.p002ui.graphics.colorspace.ColorSpace;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.graphics.AndroidImageBitmap_androidKt */
/* compiled from: AndroidImageBitmap.android.kt */
public final class AndroidImageBitmap_androidKt {
    /* renamed from: ActualImageBitmap-x__-hDU  reason: not valid java name */
    public static final ImageBitmap m35531ActualImageBitmapx__hDU(int i, int i2, int i3, boolean z, ColorSpace colorSpace) {
        Bitmap bitmap;
        C12775o.m28639i(colorSpace, "colorSpace");
        Bitmap.Config r0 = m35532toBitmapConfig1JJdX4A(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmap = Api26Bitmap.m35569createBitmapx__hDU$ui_graphics_release(i, i2, i3, z, colorSpace);
        } else {
            bitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, r0);
            C12775o.m28638h(bitmap, "createBitmap(\n          …   bitmapConfig\n        )");
            bitmap.setHasAlpha(z);
        }
        return new AndroidImageBitmap(bitmap);
    }

    public static final Bitmap asAndroidBitmap(ImageBitmap imageBitmap) {
        C12775o.m28639i(imageBitmap, "<this>");
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).getBitmap$ui_graphics_release();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final ImageBitmap asImageBitmap(Bitmap bitmap) {
        C12775o.m28639i(bitmap, "<this>");
        return new AndroidImageBitmap(bitmap);
    }

    /* renamed from: toBitmapConfig-1JJdX4A  reason: not valid java name */
    public static final Bitmap.Config m35532toBitmapConfig1JJdX4A(int i) {
        ImageBitmapConfig.Companion companion = ImageBitmapConfig.Companion;
        if (ImageBitmapConfig.m35883equalsimpl0(i, companion.m35888getArgb8888_sVssgQ())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (ImageBitmapConfig.m35883equalsimpl0(i, companion.m35887getAlpha8_sVssgQ())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (ImageBitmapConfig.m35883equalsimpl0(i, companion.m35891getRgb565_sVssgQ())) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && ImageBitmapConfig.m35883equalsimpl0(i, companion.m35889getF16_sVssgQ())) {
            return Bitmap.Config.RGBA_F16;
        }
        if (i2 < 26 || !ImageBitmapConfig.m35883equalsimpl0(i, companion.m35890getGpu_sVssgQ())) {
            return Bitmap.Config.ARGB_8888;
        }
        return Bitmap.Config.HARDWARE;
    }

    public static final int toImageConfig(Bitmap.Config config) {
        C12775o.m28639i(config, "<this>");
        if (config == Bitmap.Config.ALPHA_8) {
            return ImageBitmapConfig.Companion.m35887getAlpha8_sVssgQ();
        }
        if (config == Bitmap.Config.RGB_565) {
            return ImageBitmapConfig.Companion.m35891getRgb565_sVssgQ();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return ImageBitmapConfig.Companion.m35888getArgb8888_sVssgQ();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && config == Bitmap.Config.RGBA_F16) {
            return ImageBitmapConfig.Companion.m35889getF16_sVssgQ();
        }
        if (i < 26 || config != Bitmap.Config.HARDWARE) {
            return ImageBitmapConfig.Companion.m35888getArgb8888_sVssgQ();
        }
        return ImageBitmapConfig.Companion.m35890getGpu_sVssgQ();
    }
}
