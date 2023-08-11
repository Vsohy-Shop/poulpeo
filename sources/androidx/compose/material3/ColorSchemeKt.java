package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ColorScheme.kt */
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;
    private static final ProvidableCompositionLocal<ColorScheme> LocalColorScheme = CompositionLocalKt.staticCompositionLocalOf(ColorSchemeKt$LocalColorScheme$1.INSTANCE);

    /* compiled from: ColorScheme.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 28;
            iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 29;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: applyTonalElevation-Hht5A8o  reason: not valid java name */
    public static final long m34357applyTonalElevationHht5A8o(ColorScheme colorScheme, long j, float f) {
        C12775o.m28639i(colorScheme, "$this$applyTonalElevation");
        if (Color.m35672equalsimpl0(j, colorScheme.m34323getSurface0d7_KjU())) {
            return m34364surfaceColorAtElevation3ABfNKs(colorScheme, f);
        }
        return j;
    }

    /* renamed from: contentColorFor-4WTKRHQ  reason: not valid java name */
    public static final long m34358contentColorFor4WTKRHQ(ColorScheme colorScheme, long j) {
        C12775o.m28639i(colorScheme, "$this$contentColorFor");
        if (Color.m35672equalsimpl0(j, colorScheme.m34318getPrimary0d7_KjU())) {
            return colorScheme.m34308getOnPrimary0d7_KjU();
        }
        if (Color.m35672equalsimpl0(j, colorScheme.m34321getSecondary0d7_KjU())) {
            return colorScheme.m34310getOnSecondary0d7_KjU();
        }
        if (Color.m35672equalsimpl0(j, colorScheme.m34326getTertiary0d7_KjU())) {
            return colorScheme.m34314getOnTertiary0d7_KjU();
        }
        if (Color.m35672equalsimpl0(j, colorScheme.m34299getBackground0d7_KjU())) {
            return colorScheme.m34305getOnBackground0d7_KjU();
        }
        if (Color.m35672equalsimpl0(j, colorScheme.m34300getError0d7_KjU())) {
            return colorScheme.m34306getOnError0d7_KjU();
        }
        if (Color.m35672equalsimpl0(j, colorScheme.m34323getSurface0d7_KjU())) {
            return colorScheme.m34312getOnSurface0d7_KjU();
        }
        if (Color.m35672equalsimpl0(j, colorScheme.m34325getSurfaceVariant0d7_KjU())) {
            return colorScheme.m34313getOnSurfaceVariant0d7_KjU();
        }
        if (Color.m35672equalsimpl0(j, colorScheme.m34319getPrimaryContainer0d7_KjU())) {
            return colorScheme.m34309getOnPrimaryContainer0d7_KjU();
        }
        if (Color.m35672equalsimpl0(j, colorScheme.m34322getSecondaryContainer0d7_KjU())) {
            return colorScheme.m34311getOnSecondaryContainer0d7_KjU();
        }
        if (Color.m35672equalsimpl0(j, colorScheme.m34327getTertiaryContainer0d7_KjU())) {
            return colorScheme.m34315getOnTertiaryContainer0d7_KjU();
        }
        if (Color.m35672equalsimpl0(j, colorScheme.m34301getErrorContainer0d7_KjU())) {
            return colorScheme.m34307getOnErrorContainer0d7_KjU();
        }
        if (Color.m35672equalsimpl0(j, colorScheme.m34304getInverseSurface0d7_KjU())) {
            return colorScheme.m34302getInverseOnSurface0d7_KjU();
        }
        return Color.Companion.m35707getUnspecified0d7_KjU();
    }

    @ReadOnlyComposable
    @Composable
    /* renamed from: contentColorFor-ek8zF_U  reason: not valid java name */
    public static final long m34359contentColorForek8zF_U(long j, Composer composer, int i) {
        boolean z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:473)");
        }
        long r3 = m34358contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j);
        if (r3 != Color.Companion.m35707getUnspecified0d7_KjU()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            r3 = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m35681unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return r3;
    }

    /* renamed from: darkColorScheme-G1PFc-w  reason: not valid java name */
    public static final ColorScheme m34360darkColorSchemeG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, (DefaultConstructorMarker) null);
    }

    /* renamed from: darkColorScheme-G1PFc-w$default  reason: not valid java name */
    public static /* synthetic */ ColorScheme m34361darkColorSchemeG1PFcw$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i, Object obj) {
        int i2 = i;
        long r1 = (i2 & 1) != 0 ? ColorDarkTokens.INSTANCE.m34821getPrimary0d7_KjU() : j;
        return m34360darkColorSchemeG1PFcw(r1, (i2 & 2) != 0 ? ColorDarkTokens.INSTANCE.m34811getOnPrimary0d7_KjU() : j2, (i2 & 4) != 0 ? ColorDarkTokens.INSTANCE.m34822getPrimaryContainer0d7_KjU() : j3, (i2 & 8) != 0 ? ColorDarkTokens.INSTANCE.m34812getOnPrimaryContainer0d7_KjU() : j4, (i2 & 16) != 0 ? ColorDarkTokens.INSTANCE.m34806getInversePrimary0d7_KjU() : j5, (i2 & 32) != 0 ? ColorDarkTokens.INSTANCE.m34824getSecondary0d7_KjU() : j6, (i2 & 64) != 0 ? ColorDarkTokens.INSTANCE.m34813getOnSecondary0d7_KjU() : j7, (i2 & 128) != 0 ? ColorDarkTokens.INSTANCE.m34825getSecondaryContainer0d7_KjU() : j8, (i2 & 256) != 0 ? ColorDarkTokens.INSTANCE.m34814getOnSecondaryContainer0d7_KjU() : j9, (i2 & 512) != 0 ? ColorDarkTokens.INSTANCE.m34829getTertiary0d7_KjU() : j10, (i2 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m34817getOnTertiary0d7_KjU() : j11, (i2 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m34830getTertiaryContainer0d7_KjU() : j12, (i2 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m34818getOnTertiaryContainer0d7_KjU() : j13, (i2 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m34802getBackground0d7_KjU() : j14, (i2 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m34808getOnBackground0d7_KjU() : j15, (i2 & 32768) != 0 ? ColorDarkTokens.INSTANCE.m34826getSurface0d7_KjU() : j16, (i2 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m34815getOnSurface0d7_KjU() : j17, (i2 & 131072) != 0 ? ColorDarkTokens.INSTANCE.m34828getSurfaceVariant0d7_KjU() : j18, (i2 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m34816getOnSurfaceVariant0d7_KjU() : j19, (i2 & 524288) != 0 ? r1 : j20, (i2 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m34807getInverseSurface0d7_KjU() : j21, (i2 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m34805getInverseOnSurface0d7_KjU() : j22, (i2 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m34803getError0d7_KjU() : j23, (i2 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m34809getOnError0d7_KjU() : j24, (i2 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m34804getErrorContainer0d7_KjU() : j25, (i2 & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m34810getOnErrorContainer0d7_KjU() : j26, (i2 & 67108864) != 0 ? ColorDarkTokens.INSTANCE.m34819getOutline0d7_KjU() : j27, (i2 & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m34820getOutlineVariant0d7_KjU() : j28, (i2 & 268435456) != 0 ? ColorDarkTokens.INSTANCE.m34823getScrim0d7_KjU() : j29);
    }

    public static final long fromToken(ColorScheme colorScheme, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        C12775o.m28639i(colorScheme, "<this>");
        C12775o.m28639i(colorSchemeKeyTokens, "value");
        switch (WhenMappings.$EnumSwitchMapping$0[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return colorScheme.m34299getBackground0d7_KjU();
            case 2:
                return colorScheme.m34300getError0d7_KjU();
            case 3:
                return colorScheme.m34301getErrorContainer0d7_KjU();
            case 4:
                return colorScheme.m34302getInverseOnSurface0d7_KjU();
            case 5:
                return colorScheme.m34303getInversePrimary0d7_KjU();
            case 6:
                return colorScheme.m34304getInverseSurface0d7_KjU();
            case 7:
                return colorScheme.m34305getOnBackground0d7_KjU();
            case 8:
                return colorScheme.m34306getOnError0d7_KjU();
            case 9:
                return colorScheme.m34307getOnErrorContainer0d7_KjU();
            case 10:
                return colorScheme.m34308getOnPrimary0d7_KjU();
            case 11:
                return colorScheme.m34309getOnPrimaryContainer0d7_KjU();
            case 12:
                return colorScheme.m34310getOnSecondary0d7_KjU();
            case 13:
                return colorScheme.m34311getOnSecondaryContainer0d7_KjU();
            case 14:
                return colorScheme.m34312getOnSurface0d7_KjU();
            case 15:
                return colorScheme.m34313getOnSurfaceVariant0d7_KjU();
            case 16:
                return colorScheme.m34324getSurfaceTint0d7_KjU();
            case 17:
                return colorScheme.m34314getOnTertiary0d7_KjU();
            case 18:
                return colorScheme.m34315getOnTertiaryContainer0d7_KjU();
            case 19:
                return colorScheme.m34316getOutline0d7_KjU();
            case 20:
                return colorScheme.m34317getOutlineVariant0d7_KjU();
            case 21:
                return colorScheme.m34318getPrimary0d7_KjU();
            case 22:
                return colorScheme.m34319getPrimaryContainer0d7_KjU();
            case 23:
                return colorScheme.m34320getScrim0d7_KjU();
            case 24:
                return colorScheme.m34321getSecondary0d7_KjU();
            case 25:
                return colorScheme.m34322getSecondaryContainer0d7_KjU();
            case 26:
                return colorScheme.m34323getSurface0d7_KjU();
            case 27:
                return colorScheme.m34325getSurfaceVariant0d7_KjU();
            case 28:
                return colorScheme.m34326getTertiary0d7_KjU();
            case 29:
                return colorScheme.m34327getTertiaryContainer0d7_KjU();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ProvidableCompositionLocal<ColorScheme> getLocalColorScheme() {
        return LocalColorScheme;
    }

    /* renamed from: lightColorScheme-G1PFc-w  reason: not valid java name */
    public static final ColorScheme m34362lightColorSchemeG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, (DefaultConstructorMarker) null);
    }

    /* renamed from: lightColorScheme-G1PFc-w$default  reason: not valid java name */
    public static /* synthetic */ ColorScheme m34363lightColorSchemeG1PFcw$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i, Object obj) {
        int i2 = i;
        long r1 = (i2 & 1) != 0 ? ColorLightTokens.INSTANCE.m34850getPrimary0d7_KjU() : j;
        return m34362lightColorSchemeG1PFcw(r1, (i2 & 2) != 0 ? ColorLightTokens.INSTANCE.m34840getOnPrimary0d7_KjU() : j2, (i2 & 4) != 0 ? ColorLightTokens.INSTANCE.m34851getPrimaryContainer0d7_KjU() : j3, (i2 & 8) != 0 ? ColorLightTokens.INSTANCE.m34841getOnPrimaryContainer0d7_KjU() : j4, (i2 & 16) != 0 ? ColorLightTokens.INSTANCE.m34835getInversePrimary0d7_KjU() : j5, (i2 & 32) != 0 ? ColorLightTokens.INSTANCE.m34853getSecondary0d7_KjU() : j6, (i2 & 64) != 0 ? ColorLightTokens.INSTANCE.m34842getOnSecondary0d7_KjU() : j7, (i2 & 128) != 0 ? ColorLightTokens.INSTANCE.m34854getSecondaryContainer0d7_KjU() : j8, (i2 & 256) != 0 ? ColorLightTokens.INSTANCE.m34843getOnSecondaryContainer0d7_KjU() : j9, (i2 & 512) != 0 ? ColorLightTokens.INSTANCE.m34858getTertiary0d7_KjU() : j10, (i2 & 1024) != 0 ? ColorLightTokens.INSTANCE.m34846getOnTertiary0d7_KjU() : j11, (i2 & 2048) != 0 ? ColorLightTokens.INSTANCE.m34859getTertiaryContainer0d7_KjU() : j12, (i2 & 4096) != 0 ? ColorLightTokens.INSTANCE.m34847getOnTertiaryContainer0d7_KjU() : j13, (i2 & 8192) != 0 ? ColorLightTokens.INSTANCE.m34831getBackground0d7_KjU() : j14, (i2 & 16384) != 0 ? ColorLightTokens.INSTANCE.m34837getOnBackground0d7_KjU() : j15, (i2 & 32768) != 0 ? ColorLightTokens.INSTANCE.m34855getSurface0d7_KjU() : j16, (i2 & 65536) != 0 ? ColorLightTokens.INSTANCE.m34844getOnSurface0d7_KjU() : j17, (i2 & 131072) != 0 ? ColorLightTokens.INSTANCE.m34857getSurfaceVariant0d7_KjU() : j18, (i2 & 262144) != 0 ? ColorLightTokens.INSTANCE.m34845getOnSurfaceVariant0d7_KjU() : j19, (i2 & 524288) != 0 ? r1 : j20, (i2 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m34836getInverseSurface0d7_KjU() : j21, (i2 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m34834getInverseOnSurface0d7_KjU() : j22, (i2 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m34832getError0d7_KjU() : j23, (i2 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m34838getOnError0d7_KjU() : j24, (i2 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m34833getErrorContainer0d7_KjU() : j25, (i2 & 33554432) != 0 ? ColorLightTokens.INSTANCE.m34839getOnErrorContainer0d7_KjU() : j26, (i2 & 67108864) != 0 ? ColorLightTokens.INSTANCE.m34848getOutline0d7_KjU() : j27, (i2 & 134217728) != 0 ? ColorLightTokens.INSTANCE.m34849getOutlineVariant0d7_KjU() : j28, (i2 & 268435456) != 0 ? ColorLightTokens.INSTANCE.m34852getScrim0d7_KjU() : j29);
    }

    /* renamed from: surfaceColorAtElevation-3ABfNKs  reason: not valid java name */
    public static final long m34364surfaceColorAtElevation3ABfNKs(ColorScheme colorScheme, float f) {
        C12775o.m28639i(colorScheme, "$this$surfaceColorAtElevation");
        if (C1232Dp.m38473equalsimpl0(f, C1232Dp.m38468constructorimpl((float) 0))) {
            return colorScheme.m34323getSurface0d7_KjU();
        }
        return ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(colorScheme.m34324getSurfaceTint0d7_KjU(), ((((float) Math.log((double) (f + ((float) 1)))) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null), colorScheme.m34323getSurface0d7_KjU());
    }

    @ReadOnlyComposable
    @Composable
    public static final long toColor(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i) {
        C12775o.m28639i(colorSchemeKeyTokens, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1330949347, i, -1, "androidx.compose.material3.toColor (ColorScheme.kt:611)");
        }
        long fromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fromToken;
    }

    public static final void updateColorSchemeFrom(ColorScheme colorScheme, ColorScheme colorScheme2) {
        C12775o.m28639i(colorScheme, "<this>");
        C12775o.m28639i(colorScheme2, "other");
        colorScheme.m34347setPrimary8_81llA$material3_release(colorScheme2.m34318getPrimary0d7_KjU());
        colorScheme.m34337setOnPrimary8_81llA$material3_release(colorScheme2.m34308getOnPrimary0d7_KjU());
        colorScheme.m34348setPrimaryContainer8_81llA$material3_release(colorScheme2.m34319getPrimaryContainer0d7_KjU());
        colorScheme.m34338setOnPrimaryContainer8_81llA$material3_release(colorScheme2.m34309getOnPrimaryContainer0d7_KjU());
        colorScheme.m34332setInversePrimary8_81llA$material3_release(colorScheme2.m34303getInversePrimary0d7_KjU());
        colorScheme.m34350setSecondary8_81llA$material3_release(colorScheme2.m34321getSecondary0d7_KjU());
        colorScheme.m34339setOnSecondary8_81llA$material3_release(colorScheme2.m34310getOnSecondary0d7_KjU());
        colorScheme.m34351setSecondaryContainer8_81llA$material3_release(colorScheme2.m34322getSecondaryContainer0d7_KjU());
        colorScheme.m34340setOnSecondaryContainer8_81llA$material3_release(colorScheme2.m34311getOnSecondaryContainer0d7_KjU());
        colorScheme.m34355setTertiary8_81llA$material3_release(colorScheme2.m34326getTertiary0d7_KjU());
        colorScheme.m34343setOnTertiary8_81llA$material3_release(colorScheme2.m34314getOnTertiary0d7_KjU());
        colorScheme.m34356setTertiaryContainer8_81llA$material3_release(colorScheme2.m34327getTertiaryContainer0d7_KjU());
        colorScheme.m34344setOnTertiaryContainer8_81llA$material3_release(colorScheme2.m34315getOnTertiaryContainer0d7_KjU());
        colorScheme.m34328setBackground8_81llA$material3_release(colorScheme2.m34299getBackground0d7_KjU());
        colorScheme.m34334setOnBackground8_81llA$material3_release(colorScheme2.m34305getOnBackground0d7_KjU());
        colorScheme.m34352setSurface8_81llA$material3_release(colorScheme2.m34323getSurface0d7_KjU());
        colorScheme.m34341setOnSurface8_81llA$material3_release(colorScheme2.m34312getOnSurface0d7_KjU());
        colorScheme.m34354setSurfaceVariant8_81llA$material3_release(colorScheme2.m34325getSurfaceVariant0d7_KjU());
        colorScheme.m34342setOnSurfaceVariant8_81llA$material3_release(colorScheme2.m34313getOnSurfaceVariant0d7_KjU());
        colorScheme.m34353setSurfaceTint8_81llA$material3_release(colorScheme2.m34324getSurfaceTint0d7_KjU());
        colorScheme.m34333setInverseSurface8_81llA$material3_release(colorScheme2.m34304getInverseSurface0d7_KjU());
        colorScheme.m34331setInverseOnSurface8_81llA$material3_release(colorScheme2.m34302getInverseOnSurface0d7_KjU());
        colorScheme.m34329setError8_81llA$material3_release(colorScheme2.m34300getError0d7_KjU());
        colorScheme.m34335setOnError8_81llA$material3_release(colorScheme2.m34306getOnError0d7_KjU());
        colorScheme.m34330setErrorContainer8_81llA$material3_release(colorScheme2.m34301getErrorContainer0d7_KjU());
        colorScheme.m34336setOnErrorContainer8_81llA$material3_release(colorScheme2.m34307getOnErrorContainer0d7_KjU());
        colorScheme.m34345setOutline8_81llA$material3_release(colorScheme2.m34316getOutline0d7_KjU());
        colorScheme.m34346setOutlineVariant8_81llA$material3_release(colorScheme2.m34317getOutlineVariant0d7_KjU());
        colorScheme.m34349setScrim8_81llA$material3_release(colorScheme2.m34320getScrim0d7_KjU());
    }
}
