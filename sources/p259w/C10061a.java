package p259w;

import android.graphics.Bitmap;
import android.os.Build;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nBitmaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 2 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,51:1\n28#2:52\n*S KotlinDebug\n*F\n+ 1 Bitmaps.kt\ncoil/util/-Bitmaps\n*L\n45#1:52\n*E\n"})
/* renamed from: w.a */
/* compiled from: Bitmaps.kt */
public final class C10061a {
    /* renamed from: a */
    public static final int m21120a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                return m21121b(bitmap.getConfig()) * bitmap.getWidth() * bitmap.getHeight();
            }
        } else {
            throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
        }
    }

    /* renamed from: b */
    public static final int m21121b(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
            return 2;
        }
        if (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) {
            return 4;
        }
        return 8;
    }

    /* renamed from: c */
    public static final Bitmap.Config m21122c(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            return Bitmap.Config.ARGB_8888;
        }
        return config;
    }

    /* renamed from: d */
    public static final boolean m21123d(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.HARDWARE) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final Bitmap.Config m21124e(Bitmap.Config config) {
        if (config == null || m21123d(config)) {
            return Bitmap.Config.ARGB_8888;
        }
        return config;
    }
}
