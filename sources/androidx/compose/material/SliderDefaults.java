package androidx.compose.material;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: Slider.kt */
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final float DisabledActiveTrackAlpha = 0.32f;
    public static final float DisabledInactiveTrackAlpha = 0.12f;
    public static final float DisabledTickAlpha = 0.12f;
    public static final SliderDefaults INSTANCE = new SliderDefaults();
    public static final float InactiveTrackAlpha = 0.24f;
    public static final float TickAlpha = 0.54f;

    private SliderDefaults() {
    }

    @Composable
    /* renamed from: colors-q0g_0yA  reason: not valid java name */
    public final SliderColors m34100colorsq0g_0yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, Composer composer, int i, int i2, int i3) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        Composer composer2 = composer;
        int i4 = i;
        int i5 = i3;
        composer2.startReplaceableGroup(436017687);
        if ((i5 & 1) != 0) {
            j11 = MaterialTheme.INSTANCE.getColors(composer2, 6).m33952getPrimary0d7_KjU();
        } else {
            j11 = j;
        }
        if ((i5 & 2) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j12 = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(materialTheme.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null), materialTheme.getColors(composer2, 6).m33956getSurface0d7_KjU());
        } else {
            j12 = j2;
        }
        if ((i5 & 4) != 0) {
            j13 = MaterialTheme.INSTANCE.getColors(composer2, 6).m33952getPrimary0d7_KjU();
        } else {
            j13 = j3;
        }
        if ((i5 & 8) != 0) {
            j14 = Color.m35670copywmQWz5c$default(j13, 0.24f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j14 = j4;
        }
        if ((i5 & 16) != 0) {
            j15 = Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j15 = j5;
        }
        if ((i5 & 32) != 0) {
            j16 = Color.m35670copywmQWz5c$default(j15, 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j16 = j6;
        }
        if ((i5 & 64) != 0) {
            j17 = Color.m35670copywmQWz5c$default(ColorsKt.m33970contentColorForek8zF_U(j13, composer2, (i4 >> 6) & 14), 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j17 = j7;
        }
        if ((i5 & 128) != 0) {
            j18 = Color.m35670copywmQWz5c$default(j13, 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j18 = j8;
        }
        if ((i5 & 256) != 0) {
            j19 = Color.m35670copywmQWz5c$default(j17, 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j19 = j9;
        }
        if ((i5 & 512) != 0) {
            j20 = Color.m35670copywmQWz5c$default(j16, 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j20 = j10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(436017687, i4, i2, "androidx.compose.material.SliderDefaults.colors (Slider.kt:478)");
        }
        DefaultSliderColors defaultSliderColors = new DefaultSliderColors(j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSliderColors;
    }
}
