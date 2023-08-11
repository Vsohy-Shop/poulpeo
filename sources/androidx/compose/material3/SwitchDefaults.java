package androidx.compose.material3;

import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.p002ui.unit.C1232Dp;
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
    private static final float IconSize = C1232Dp.m38468constructorimpl((float) 16);

    private SwitchDefaults() {
    }

    @Composable
    /* renamed from: colors-V1nXRL4  reason: not valid java name */
    public final SwitchColors m34618colorsV1nXRL4(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, Composer composer, int i, int i2, int i3) {
        Composer composer2 = composer;
        int i4 = i3;
        composer2.startReplaceableGroup(1937926421);
        long color = (i4 & 1) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getSelectedHandleColor(), composer2, 6) : j;
        long color2 = (i4 & 2) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getSelectedTrackColor(), composer2, 6) : j2;
        long r12 = (i4 & 4) != 0 ? Color.Companion.m35706getTransparent0d7_KjU() : j3;
        long color3 = (i4 & 8) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getSelectedIconColor(), composer2, 6) : j4;
        long color4 = (i4 & 16) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getUnselectedHandleColor(), composer2, 6) : j5;
        long color5 = (i4 & 32) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getUnselectedTrackColor(), composer2, 6) : j6;
        long color6 = (i4 & 64) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getUnselectedFocusTrackOutlineColor(), composer2, 6) : j7;
        long color7 = (i4 & 128) != 0 ? ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getUnselectedIconColor(), composer2, 6) : j8;
        long r24 = (i4 & 256) != 0 ? ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledSelectedHandleColor(), composer2, 6), 1.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer2, 6).m34323getSurface0d7_KjU()) : j9;
        long r26 = (i4 & 512) != 0 ? ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledSelectedTrackColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer2, 6).m34323getSurface0d7_KjU()) : j10;
        long r28 = (i4 & 1024) != 0 ? Color.Companion.m35706getTransparent0d7_KjU() : j11;
        long r30 = (i4 & 2048) != 0 ? ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledSelectedIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer2, 6).m34323getSurface0d7_KjU()) : j12;
        long r32 = (i4 & 4096) != 0 ? ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledUnselectedHandleColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer2, 6).m34323getSurface0d7_KjU()) : j13;
        long r34 = (i4 & 8192) != 0 ? ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledUnselectedTrackColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer2, 6).m34323getSurface0d7_KjU()) : j14;
        long r36 = (i4 & 16384) != 0 ? ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledUnselectedTrackOutlineColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer2, 6).m34323getSurface0d7_KjU()) : j15;
        long r38 = (i4 & 32768) != 0 ? ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(SwitchTokens.INSTANCE.getDisabledUnselectedIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), MaterialTheme.INSTANCE.getColorScheme(composer2, 6).m34323getSurface0d7_KjU()) : j16;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1937926421, i, i2, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:279)");
        }
        SwitchColors switchColors = new SwitchColors(color, color2, r12, color3, color4, color5, color6, color7, r24, r26, r28, r30, r32, r34, r36, r38, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return switchColors;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m34619getIconSizeD9Ej5fM() {
        return IconSize;
    }
}
