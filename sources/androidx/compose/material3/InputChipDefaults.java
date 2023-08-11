package androidx.compose.material3;

import androidx.compose.material3.tokens.InputChipTokens;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
/* compiled from: Chip.kt */
public final class InputChipDefaults {
    public static final int $stable = 0;
    private static final float AvatarSize;
    private static final float Height;
    public static final InputChipDefaults INSTANCE = new InputChipDefaults();
    private static final float IconSize;

    static {
        InputChipTokens inputChipTokens = InputChipTokens.INSTANCE;
        Height = inputChipTokens.m35000getContainerHeightD9Ej5fM();
        IconSize = inputChipTokens.m35002getLeadingIconSizeD9Ej5fM();
        AvatarSize = inputChipTokens.m34998getAvatarSizeD9Ej5fM();
    }

    private InputChipDefaults() {
    }

    /* renamed from: getAvatarSize-D9Ej5fM  reason: not valid java name */
    public final float m34468getAvatarSizeD9Ej5fM() {
        return AvatarSize;
    }

    /* renamed from: getHeight-D9Ej5fM  reason: not valid java name */
    public final float m34469getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m34470getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    public final Shape getShape(Composer composer, int i) {
        composer.startReplaceableGroup(1052444143);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1052444143, i, -1, "androidx.compose.material3.InputChipDefaults.<get-shape> (Chip.kt:1138)");
        }
        Shape shape = ShapesKt.toShape(InputChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    /* renamed from: inputChipBorder-gHcDVlo  reason: not valid java name */
    public final SelectableChipBorder m34471inputChipBordergHcDVlo(long j, long j2, long j3, long j4, float f, float f2, Composer composer, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        float f3;
        float f4;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(-324924235);
        if ((i2 & 1) != 0) {
            j5 = ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getUnselectedOutlineColor(), composer2, 6);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getDisabledUnselectedOutlineColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j8 = j4;
        }
        if ((i2 & 16) != 0) {
            f3 = InputChipTokens.INSTANCE.m35005getUnselectedOutlineWidthD9Ej5fM();
        } else {
            f3 = f;
        }
        if ((i2 & 32) != 0) {
            f4 = InputChipTokens.INSTANCE.m35003getSelectedOutlineWidthD9Ej5fM();
        } else {
            f4 = f2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-324924235, i, -1, "androidx.compose.material3.InputChipDefaults.inputChipBorder (Chip.kt:1120)");
        }
        SelectableChipBorder selectableChipBorder = new SelectableChipBorder(j5, j6, j7, j8, f3, f4, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipBorder;
    }

    @Composable
    /* renamed from: inputChipColors-kwJvTHA  reason: not valid java name */
    public final SelectableChipColors m34472inputChipColorskwJvTHA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i, int i2, int i3) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        Composer composer2 = composer;
        int i4 = i3;
        composer2.startReplaceableGroup(1312840646);
        if ((i4 & 1) != 0) {
            j14 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j14 = j;
        }
        if ((i4 & 2) != 0) {
            j15 = ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getUnselectedLabelTextColor(), composer2, 6);
        } else {
            j15 = j2;
        }
        if ((i4 & 4) != 0) {
            j16 = ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getUnselectedLeadingIconColor(), composer2, 6);
        } else {
            j16 = j3;
        }
        if ((i4 & 8) != 0) {
            j17 = ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getUnselectedTrailingIconColor(), composer2, 6);
        } else {
            j17 = j4;
        }
        if ((i4 & 16) != 0) {
            j18 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j18 = j5;
        }
        if ((i4 & 32) != 0) {
            j19 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getDisabledLabelTextColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j19 = j6;
        }
        if ((i4 & 64) != 0) {
            j20 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getDisabledLeadingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j20 = j7;
        }
        if ((i4 & 128) != 0) {
            j21 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getDisabledTrailingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j21 = j8;
        }
        if ((i4 & 256) != 0) {
            j22 = ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getSelectedContainerColor(), composer2, 6);
        } else {
            j22 = j9;
        }
        if ((i4 & 512) != 0) {
            j23 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getDisabledSelectedContainerColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j23 = j10;
        }
        if ((i4 & 1024) != 0) {
            j24 = ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getSelectedLabelTextColor(), composer2, 6);
        } else {
            j24 = j11;
        }
        if ((i4 & 2048) != 0) {
            j25 = ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getSelectedLeadingIconColor(), composer2, 6);
        } else {
            j25 = j12;
        }
        if ((i4 & 4096) != 0) {
            j26 = ColorSchemeKt.toColor(InputChipTokens.INSTANCE.getSelectedTrailingIconColor(), composer2, 6);
        } else {
            j26 = j13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1312840646, i, i2, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1043)");
        }
        SelectableChipColors selectableChipColors = new SelectableChipColors(j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipColors;
    }

    @Composable
    /* renamed from: inputChipElevation-aqJV_2Y  reason: not valid java name */
    public final SelectableChipElevation m34473inputChipElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        composer.startReplaceableGroup(1745270109);
        if ((i2 & 1) != 0) {
            f7 = InputChipTokens.INSTANCE.m34999getContainerElevationD9Ej5fM();
        } else {
            f7 = f;
        }
        if ((i2 & 2) != 0) {
            f8 = f7;
        } else {
            f8 = f2;
        }
        if ((i2 & 4) != 0) {
            f9 = f7;
        } else {
            f9 = f3;
        }
        if ((i2 & 8) != 0) {
            f10 = f7;
        } else {
            f10 = f4;
        }
        if ((i2 & 16) != 0) {
            f11 = InputChipTokens.INSTANCE.m35001getDraggedContainerElevationD9Ej5fM();
        } else {
            f11 = f5;
        }
        if ((i2 & 32) != 0) {
            f12 = f7;
        } else {
            f12 = f6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1745270109, i, -1, "androidx.compose.material3.InputChipDefaults.inputChipElevation (Chip.kt:1091)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(f7, f8, f9, f10, f11, f12, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipElevation;
    }
}
