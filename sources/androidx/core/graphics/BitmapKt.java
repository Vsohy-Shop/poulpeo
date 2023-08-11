package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import com.appboy.Constants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: Bitmap.kt */
public final class BitmapKt {
    public static final Bitmap applyCanvas(Bitmap bitmap, Function1<? super Canvas, C11921v> function1) {
        C12775o.m28639i(bitmap, "<this>");
        C12775o.m28639i(function1, "block");
        function1.invoke(new Canvas(bitmap));
        return bitmap;
    }

    public static final boolean contains(Bitmap bitmap, Point point) {
        int i;
        C12775o.m28639i(bitmap, "<this>");
        C12775o.m28639i(point, Constants.APPBOY_PUSH_PRIORITY_KEY);
        int width = bitmap.getWidth();
        int i2 = point.x;
        return (i2 >= 0 && i2 < width) && (i = point.y) >= 0 && i < bitmap.getHeight();
    }

    public static final Bitmap createBitmap(int i, int i2, Bitmap.Config config) {
        C12775o.m28639i(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        C12775o.m28638h(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i, int i2, Bitmap.Config config, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        C12775o.m28639i(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        C12775o.m28638h(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    public static final int get(Bitmap bitmap, int i, int i2) {
        C12775o.m28639i(bitmap, "<this>");
        return bitmap.getPixel(i, i2);
    }

    public static final Bitmap scale(Bitmap bitmap, int i, int i2, boolean z) {
        C12775o.m28639i(bitmap, "<this>");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, z);
        C12775o.m28638h(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    public static /* synthetic */ Bitmap scale$default(Bitmap bitmap, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = true;
        }
        C12775o.m28639i(bitmap, "<this>");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, z);
        C12775o.m28638h(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    public static final void set(Bitmap bitmap, int i, int i2, @ColorInt int i3) {
        C12775o.m28639i(bitmap, "<this>");
        bitmap.setPixel(i, i2, i3);
    }

    public static final boolean contains(Bitmap bitmap, PointF pointF) {
        C12775o.m28639i(bitmap, "<this>");
        C12775o.m28639i(pointF, Constants.APPBOY_PUSH_PRIORITY_KEY);
        float f = pointF.x;
        if (f >= 0.0f && f < ((float) bitmap.getWidth())) {
            float f2 = pointF.y;
            return f2 >= 0.0f && f2 < ((float) bitmap.getHeight());
        }
    }

    @RequiresApi(26)
    public static final Bitmap createBitmap(int i, int i2, Bitmap.Config config, boolean z, ColorSpace colorSpace) {
        C12775o.m28639i(config, "config");
        C12775o.m28639i(colorSpace, "colorSpace");
        Bitmap a = Bitmap.createBitmap(i, i2, config, z, colorSpace);
        C12775o.m28638h(a, "createBitmap(width, heig…ig, hasAlpha, colorSpace)");
        return a;
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i, int i2, Bitmap.Config config, boolean z, ColorSpace colorSpace, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i3 & 8) != 0) {
            z = true;
        }
        if ((i3 & 16) != 0) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            C12775o.m28638h(colorSpace, "get(ColorSpace.Named.SRGB)");
        }
        C12775o.m28639i(config, "config");
        C12775o.m28639i(colorSpace, "colorSpace");
        Bitmap a = Bitmap.createBitmap(i, i2, config, z, colorSpace);
        C12775o.m28638h(a, "createBitmap(width, heig…ig, hasAlpha, colorSpace)");
        return a;
    }
}
