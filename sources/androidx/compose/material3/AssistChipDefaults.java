package androidx.compose.material3;

import androidx.compose.material3.tokens.AssistChipTokens;
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
public final class AssistChipDefaults {
    public static final int $stable = 0;
    private static final float Height;
    public static final AssistChipDefaults INSTANCE = new AssistChipDefaults();
    private static final float IconSize;

    static {
        AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
        Height = assistChipTokens.m34766getContainerHeightD9Ej5fM();
        IconSize = assistChipTokens.m34775getIconSizeD9Ej5fM();
    }

    private AssistChipDefaults() {
    }

    @Composable
    /* renamed from: assistChipBorder-d_3_b6Q  reason: not valid java name */
    public final ChipBorder m34257assistChipBorderd_3_b6Q(long j, long j2, float f, Composer composer, int i, int i2) {
        long j3;
        long j4;
        float f2;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(382372847);
        if ((i2 & 1) != 0) {
            j3 = ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getFlatOutlineColor(), composer2, 6);
        } else {
            j3 = j;
        }
        if ((i2 & 2) != 0) {
            j4 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j4 = j2;
        }
        if ((i2 & 4) != 0) {
            f2 = AssistChipTokens.INSTANCE.m34774getFlatOutlineWidthD9Ej5fM();
        } else {
            f2 = f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(382372847, i, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:708)");
        }
        ChipBorder chipBorder = new ChipBorder(j3, j4, f2, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipBorder;
    }

    @Composable
    /* renamed from: assistChipColors-oq7We08  reason: not valid java name */
    public final ChipColors m34258assistChipColorsoq7We08(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, Composer composer, int i, int i2) {
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        Composer composer2 = composer;
        int i3 = i2;
        composer2.startReplaceableGroup(-391745725);
        if ((i3 & 1) != 0) {
            j9 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j9 = j;
        }
        if ((i3 & 2) != 0) {
            j10 = ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getLabelTextColor(), composer2, 6);
        } else {
            j10 = j2;
        }
        if ((i3 & 4) != 0) {
            j11 = ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getIconColor(), composer2, 6);
        } else {
            j11 = j3;
        }
        if ((i3 & 8) != 0) {
            j12 = j11;
        } else {
            j12 = j4;
        }
        if ((i3 & 16) != 0) {
            j13 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j13 = j5;
        }
        if ((i3 & 32) != 0) {
            j14 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledLabelTextColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j14 = j6;
        }
        if ((i3 & 64) != 0) {
            j15 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j15 = j7;
        }
        if ((i3 & 128) != 0) {
            j16 = j15;
        } else {
            j16 = j8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-391745725, i, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:648)");
        }
        ChipColors chipColors = new ChipColors(j9, j10, j11, j12, j13, j14, j15, j16, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColors;
    }

    @Composable
    /* renamed from: assistChipElevation-aqJV_2Y  reason: not valid java name */
    public final ChipElevation m34259assistChipElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        composer.startReplaceableGroup(245366099);
        if ((i2 & 1) != 0) {
            f7 = AssistChipTokens.INSTANCE.m34773getFlatContainerElevationD9Ej5fM();
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
            f11 = AssistChipTokens.INSTANCE.m34767getDraggedContainerElevationD9Ej5fM();
        } else {
            f11 = f5;
        }
        if ((i2 & 32) != 0) {
            f12 = f7;
        } else {
            f12 = f6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(245366099, i, -1, "androidx.compose.material3.AssistChipDefaults.assistChipElevation (Chip.kt:684)");
        }
        ChipElevation chipElevation = new ChipElevation(f7, f8, f9, f10, f11, f12, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }

    @Composable
    /* renamed from: elevatedAssistChipColors-oq7We08  reason: not valid java name */
    public final ChipColors m34260elevatedAssistChipColorsoq7We08(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, Composer composer, int i, int i2) {
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        Composer composer2 = composer;
        int i3 = i2;
        composer2.startReplaceableGroup(-535762675);
        if ((i3 & 1) != 0) {
            j9 = ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getElevatedContainerColor(), composer2, 6);
        } else {
            j9 = j;
        }
        if ((i3 & 2) != 0) {
            j10 = ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getLabelTextColor(), composer2, 6);
        } else {
            j10 = j2;
        }
        if ((i3 & 4) != 0) {
            j11 = ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getIconColor(), composer2, 6);
        } else {
            j11 = j3;
        }
        if ((i3 & 8) != 0) {
            j12 = j11;
        } else {
            j12 = j4;
        }
        if ((i3 & 16) != 0) {
            j13 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getElevatedDisabledContainerColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j13 = j5;
        }
        if ((i3 & 32) != 0) {
            j14 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledLabelTextColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j14 = j6;
        }
        if ((i3 & 64) != 0) {
            j15 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j15 = j7;
        }
        if ((i3 & 128) != 0) {
            j16 = j15;
        } else {
            j16 = j8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-535762675, i, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:733)");
        }
        ChipColors chipColors = new ChipColors(j9, j10, j11, j12, j13, j14, j15, j16, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColors;
    }

    @Composable
    /* renamed from: elevatedAssistChipElevation-aqJV_2Y  reason: not valid java name */
    public final ChipElevation m34261elevatedAssistChipElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        composer.startReplaceableGroup(1457698077);
        if ((i2 & 1) != 0) {
            f7 = AssistChipTokens.INSTANCE.m34768getElevatedContainerElevationD9Ej5fM();
        } else {
            f7 = f;
        }
        if ((i2 & 2) != 0) {
            f8 = AssistChipTokens.INSTANCE.m34772getElevatedPressedContainerElevationD9Ej5fM();
        } else {
            f8 = f2;
        }
        if ((i2 & 4) != 0) {
            f9 = AssistChipTokens.INSTANCE.m34770getElevatedFocusContainerElevationD9Ej5fM();
        } else {
            f9 = f3;
        }
        if ((i2 & 8) != 0) {
            f10 = AssistChipTokens.INSTANCE.m34771getElevatedHoverContainerElevationD9Ej5fM();
        } else {
            f10 = f4;
        }
        if ((i2 & 16) != 0) {
            f11 = AssistChipTokens.INSTANCE.m34767getDraggedContainerElevationD9Ej5fM();
        } else {
            f11 = f5;
        }
        if ((i2 & 32) != 0) {
            f12 = AssistChipTokens.INSTANCE.m34769getElevatedDisabledContainerElevationD9Ej5fM();
        } else {
            f12 = f6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1457698077, i, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipElevation (Chip.kt:770)");
        }
        ChipElevation chipElevation = new ChipElevation(f7, f8, f9, f10, f11, f12, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }

    /* renamed from: getHeight-D9Ej5fM  reason: not valid java name */
    public final float m34262getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m34263getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    public final Shape getShape(Composer composer, int i) {
        composer.startReplaceableGroup(1988153916);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1988153916, i, -1, "androidx.compose.material3.AssistChipDefaults.<get-shape> (Chip.kt:787)");
        }
        Shape shape = ShapesKt.toShape(AssistChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }
}
