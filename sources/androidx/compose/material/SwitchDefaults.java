package androidx.compose.material;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: Switch.kt */
public final class SwitchDefaults {
    public static final int $stable = 0;
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();

    private SwitchDefaults() {
    }

    @Composable
    /* renamed from: colors-SQMK_m0  reason: not valid java name */
    public final SwitchColors m34151colorsSQMK_m0(long j, long j2, float f, long j3, long j4, float f2, long j5, long j6, long j7, long j8, Composer composer, int i, int i2, int i3) {
        long j9;
        long j10;
        float f3;
        long j11;
        long j12;
        float f4;
        float f5;
        long j13;
        long j14;
        long j15;
        long j16;
        int i4;
        long j17;
        long j18;
        Composer composer2 = composer;
        int i5 = i3;
        composer2.startReplaceableGroup(-1032127534);
        if ((i5 & 1) != 0) {
            j9 = MaterialTheme.INSTANCE.getColors(composer2, 6).m33955getSecondaryVariant0d7_KjU();
        } else {
            j9 = j;
        }
        if ((i5 & 2) != 0) {
            j10 = j9;
        } else {
            j10 = j2;
        }
        if ((i5 & 4) != 0) {
            f3 = 0.54f;
        } else {
            f3 = f;
        }
        if ((i5 & 8) != 0) {
            j11 = MaterialTheme.INSTANCE.getColors(composer2, 6).m33956getSurface0d7_KjU();
        } else {
            j11 = j3;
        }
        if ((i5 & 16) != 0) {
            j12 = MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU();
        } else {
            j12 = j4;
        }
        if ((i5 & 32) != 0) {
            f4 = 0.38f;
        } else {
            f4 = f2;
        }
        if ((i5 & 64) != 0) {
            f5 = f3;
            j13 = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(j9, ContentAlpha.INSTANCE.getDisabled(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null), MaterialTheme.INSTANCE.getColors(composer2, 6).m33956getSurface0d7_KjU());
        } else {
            f5 = f3;
            j13 = j5;
        }
        if ((i5 & 128) != 0) {
            j14 = j9;
            j15 = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(j10, ContentAlpha.INSTANCE.getDisabled(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null), MaterialTheme.INSTANCE.getColors(composer2, 6).m33956getSurface0d7_KjU());
        } else {
            j14 = j9;
            j15 = j6;
        }
        if ((i5 & 256) != 0) {
            i4 = 6;
            j16 = j13;
            j17 = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(j11, ContentAlpha.INSTANCE.getDisabled(composer2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null), MaterialTheme.INSTANCE.getColors(composer2, 6).m33956getSurface0d7_KjU());
        } else {
            j16 = j13;
            i4 = 6;
            j17 = j7;
        }
        if ((i5 & 512) != 0) {
            j18 = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(j12, ContentAlpha.INSTANCE.getDisabled(composer2, i4), 0.0f, 0.0f, 0.0f, 14, (Object) null), MaterialTheme.INSTANCE.getColors(composer2, 6).m33956getSurface0d7_KjU());
        } else {
            j18 = j8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1032127534, i, i2, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:282)");
        }
        DefaultSwitchColors defaultSwitchColors = new DefaultSwitchColors(j14, Color.m35670copywmQWz5c$default(j10, f5, 0.0f, 0.0f, 0.0f, 14, (Object) null), j11, Color.m35670copywmQWz5c$default(j12, f4, 0.0f, 0.0f, 0.0f, 14, (Object) null), j16, Color.m35670copywmQWz5c$default(j15, f5, 0.0f, 0.0f, 0.0f, 14, (Object) null), j17, Color.m35670copywmQWz5c$default(j18, f4, 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSwitchColors;
    }
}
