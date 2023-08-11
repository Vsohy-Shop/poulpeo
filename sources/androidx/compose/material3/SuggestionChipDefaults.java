package androidx.compose.material3;

import androidx.compose.material3.tokens.SuggestionChipTokens;
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
public final class SuggestionChipDefaults {
    public static final int $stable = 0;
    private static final float Height;
    public static final SuggestionChipDefaults INSTANCE = new SuggestionChipDefaults();
    private static final float IconSize;

    static {
        SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
        Height = suggestionChipTokens.m35176getContainerHeightD9Ej5fM();
        IconSize = suggestionChipTokens.m35185getLeadingIconSizeD9Ej5fM();
    }

    private SuggestionChipDefaults() {
    }

    @Composable
    /* renamed from: elevatedSuggestionChipColors-5tl4gsc  reason: not valid java name */
    public final ChipColors m34595elevatedSuggestionChipColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(1269423125);
        if ((i2 & 1) != 0) {
            j7 = ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getElevatedContainerColor(), composer2, 6);
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getLabelTextColor(), composer2, 6);
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = MaterialTheme.INSTANCE.getColorScheme(composer2, 6).m34313getOnSurfaceVariant0d7_KjU();
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            j10 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getElevatedDisabledContainerColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j10 = j4;
        }
        if ((i2 & 16) != 0) {
            j11 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getDisabledLabelTextColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j11 = j5;
        }
        if ((i2 & 32) != 0) {
            j12 = Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer2, 6).m34312getOnSurface0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j12 = j6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1269423125, i, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1249)");
        }
        Color.Companion companion = Color.Companion;
        ChipColors chipColors = new ChipColors(j7, j8, j9, companion.m35707getUnspecified0d7_KjU(), j10, j11, j12, companion.m35707getUnspecified0d7_KjU(), (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColors;
    }

    @Composable
    /* renamed from: elevatedSuggestionChipElevation-aqJV_2Y  reason: not valid java name */
    public final ChipElevation m34596elevatedSuggestionChipElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        composer.startReplaceableGroup(1118088467);
        if ((i2 & 1) != 0) {
            f7 = SuggestionChipTokens.INSTANCE.m35178getElevatedContainerElevationD9Ej5fM();
        } else {
            f7 = f;
        }
        if ((i2 & 2) != 0) {
            f8 = SuggestionChipTokens.INSTANCE.m35182getElevatedPressedContainerElevationD9Ej5fM();
        } else {
            f8 = f2;
        }
        if ((i2 & 4) != 0) {
            f9 = SuggestionChipTokens.INSTANCE.m35180getElevatedFocusContainerElevationD9Ej5fM();
        } else {
            f9 = f3;
        }
        if ((i2 & 8) != 0) {
            f10 = SuggestionChipTokens.INSTANCE.m35181getElevatedHoverContainerElevationD9Ej5fM();
        } else {
            f10 = f4;
        }
        if ((i2 & 16) != 0) {
            f11 = SuggestionChipTokens.INSTANCE.m35177getDraggedContainerElevationD9Ej5fM();
        } else {
            f11 = f5;
        }
        if ((i2 & 32) != 0) {
            f12 = SuggestionChipTokens.INSTANCE.m35179getElevatedDisabledContainerElevationD9Ej5fM();
        } else {
            f12 = f6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1118088467, i, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipElevation (Chip.kt:1286)");
        }
        ChipElevation chipElevation = new ChipElevation(f7, f8, f9, f10, f11, f12, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }

    /* renamed from: getHeight-D9Ej5fM  reason: not valid java name */
    public final float m34597getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m34598getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    public final Shape getShape(Composer composer, int i) {
        composer.startReplaceableGroup(641188183);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(641188183, i, -1, "androidx.compose.material3.SuggestionChipDefaults.<get-shape> (Chip.kt:1303)");
        }
        Shape shape = ShapesKt.toShape(SuggestionChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    /* renamed from: suggestionChipBorder-d_3_b6Q  reason: not valid java name */
    public final ChipBorder m34599suggestionChipBorderd_3_b6Q(long j, long j2, float f, Composer composer, int i, int i2) {
        long j3;
        long j4;
        float f2;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(439283919);
        if ((i2 & 1) != 0) {
            j3 = ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), composer2, 6);
        } else {
            j3 = j;
        }
        if ((i2 & 2) != 0) {
            j4 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j4 = j2;
        }
        if ((i2 & 4) != 0) {
            f2 = SuggestionChipTokens.INSTANCE.m35184getFlatOutlineWidthD9Ej5fM();
        } else {
            f2 = f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(439283919, i, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1226)");
        }
        ChipBorder chipBorder = new ChipBorder(j3, j4, f2, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipBorder;
    }

    @Composable
    /* renamed from: suggestionChipColors-5tl4gsc  reason: not valid java name */
    public final ChipColors m34600suggestionChipColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(1882647883);
        if ((i2 & 1) != 0) {
            j7 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getLabelTextColor(), composer2, 6);
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getLeadingIconColor(), composer2, 6);
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            j10 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j10 = j4;
        }
        if ((i2 & 16) != 0) {
            j11 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getDisabledLabelTextColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j11 = j5;
        }
        if ((i2 & 32) != 0) {
            j12 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(SuggestionChipTokens.INSTANCE.getDisabledLeadingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j12 = j6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1882647883, i, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1169)");
        }
        Color.Companion companion = Color.Companion;
        ChipColors chipColors = new ChipColors(j7, j8, j9, companion.m35707getUnspecified0d7_KjU(), j10, j11, j12, companion.m35707getUnspecified0d7_KjU(), (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColors;
    }

    @Composable
    /* renamed from: suggestionChipElevation-aqJV_2Y  reason: not valid java name */
    public final ChipElevation m34601suggestionChipElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        composer.startReplaceableGroup(1929994057);
        if ((i2 & 1) != 0) {
            f7 = SuggestionChipTokens.INSTANCE.m35183getFlatContainerElevationD9Ej5fM();
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
            f11 = SuggestionChipTokens.INSTANCE.m35177getDraggedContainerElevationD9Ej5fM();
        } else {
            f11 = f5;
        }
        if ((i2 & 32) != 0) {
            f12 = f7;
        } else {
            f12 = f6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1929994057, i, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipElevation (Chip.kt:1202)");
        }
        ChipElevation chipElevation = new ChipElevation(f7, f8, f9, f10, f11, f12, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }
}
