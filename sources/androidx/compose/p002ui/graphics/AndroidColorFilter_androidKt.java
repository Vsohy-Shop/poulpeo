package androidx.compose.p002ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.graphics.AndroidColorFilter_androidKt */
/* compiled from: AndroidColorFilter.android.kt */
public final class AndroidColorFilter_androidKt {
    /* renamed from: actualColorMatrixColorFilter-jHG-Opc  reason: not valid java name */
    public static final ColorFilter m35527actualColorMatrixColorFilterjHGOpc(float[] fArr) {
        C12775o.m28639i(fArr, "colorMatrix");
        return new ColorFilter(new ColorMatrixColorFilter(fArr));
    }

    /* renamed from: actualLightingColorFilter--OWjLjI  reason: not valid java name */
    public static final ColorFilter m35528actualLightingColorFilterOWjLjI(long j, long j2) {
        return new ColorFilter(new LightingColorFilter(ColorKt.m35725toArgb8_81llA(j), ColorKt.m35725toArgb8_81llA(j2)));
    }

    /* renamed from: actualTintColorFilter-xETnrds  reason: not valid java name */
    public static final ColorFilter m35529actualTintColorFilterxETnrds(long j, int i) {
        ColorFilter colorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            colorFilter = BlendModeColorFilterHelper.INSTANCE.m35606BlendModeColorFilterxETnrds(j, i);
        } else {
            colorFilter = new PorterDuffColorFilter(ColorKt.m35725toArgb8_81llA(j), AndroidBlendMode_androidKt.m35515toPorterDuffModes9anfk8(i));
        }
        return new ColorFilter(colorFilter);
    }

    public static final ColorFilter asAndroidColorFilter(ColorFilter colorFilter) {
        C12775o.m28639i(colorFilter, "<this>");
        return colorFilter.getNativeColorFilter$ui_graphics_release();
    }

    public static final ColorFilter asComposeColorFilter(ColorFilter colorFilter) {
        C12775o.m28639i(colorFilter, "<this>");
        return new ColorFilter(colorFilter);
    }
}
