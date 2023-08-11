package androidx.compose.material3;

import androidx.compose.material3.tokens.FilterChipTokens;
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
public final class FilterChipDefaults {
    public static final int $stable = 0;
    private static final float Height;
    public static final FilterChipDefaults INSTANCE = new FilterChipDefaults();
    private static final float IconSize;

    static {
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        Height = filterChipTokens.m34979getContainerHeightD9Ej5fM();
        IconSize = filterChipTokens.m34995getIconSizeD9Ej5fM();
    }

    private FilterChipDefaults() {
    }

    @Composable
    /* renamed from: elevatedFilterChipColors-XqyqHi0  reason: not valid java name */
    public final SelectableChipColors m34436elevatedFilterChipColorsXqyqHi0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, Composer composer, int i, int i2, int i3) {
        long j13;
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
        Composer composer2 = composer;
        int i4 = i3;
        composer2.startReplaceableGroup(-915841711);
        if ((i4 & 1) != 0) {
            j13 = ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getElevatedUnselectedContainerColor(), composer2, 6);
        } else {
            j13 = j;
        }
        if ((i4 & 2) != 0) {
            j14 = ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getUnselectedLabelTextColor(), composer2, 6);
        } else {
            j14 = j2;
        }
        if ((i4 & 4) != 0) {
            j15 = ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getUnselectedIconColor(), composer2, 6);
        } else {
            j15 = j3;
        }
        if ((i4 & 8) != 0) {
            j16 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getElevatedDisabledContainerColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j16 = j4;
        }
        if ((i4 & 16) != 0) {
            j17 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getDisabledLabelTextColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j17 = j5;
        }
        if ((i4 & 32) != 0) {
            j18 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getDisabledIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j18 = j6;
        }
        if ((i4 & 64) != 0) {
            j19 = j18;
        } else {
            j19 = j7;
        }
        if ((i4 & 128) != 0) {
            j20 = ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getElevatedSelectedContainerColor(), composer2, 6);
        } else {
            j20 = j8;
        }
        if ((i4 & 256) != 0) {
            j21 = j16;
        } else {
            j21 = j9;
        }
        if ((i4 & 512) != 0) {
            j22 = ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getSelectedLabelTextColor(), composer2, 6);
        } else {
            j22 = j10;
        }
        if ((i4 & 1024) != 0) {
            j23 = ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getSelectedIconColor(), composer2, 6);
        } else {
            j23 = j11;
        }
        if ((i4 & 2048) != 0) {
            j24 = j23;
        } else {
            j24 = j12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-915841711, i, i2, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:937)");
        }
        SelectableChipColors selectableChipColors = new SelectableChipColors(j13, j14, j15, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipColors;
    }

    @Composable
    /* renamed from: elevatedFilterChipElevation-aqJV_2Y  reason: not valid java name */
    public final SelectableChipElevation m34437elevatedFilterChipElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        composer.startReplaceableGroup(684803697);
        if ((i2 & 1) != 0) {
            f7 = FilterChipTokens.INSTANCE.m34981getElevatedContainerElevationD9Ej5fM();
        } else {
            f7 = f;
        }
        if ((i2 & 2) != 0) {
            f8 = FilterChipTokens.INSTANCE.m34985getElevatedPressedContainerElevationD9Ej5fM();
        } else {
            f8 = f2;
        }
        if ((i2 & 4) != 0) {
            f9 = FilterChipTokens.INSTANCE.m34983getElevatedFocusContainerElevationD9Ej5fM();
        } else {
            f9 = f3;
        }
        if ((i2 & 8) != 0) {
            f10 = FilterChipTokens.INSTANCE.m34984getElevatedHoverContainerElevationD9Ej5fM();
        } else {
            f10 = f4;
        }
        if ((i2 & 16) != 0) {
            f11 = FilterChipTokens.INSTANCE.m34980getDraggedContainerElevationD9Ej5fM();
        } else {
            f11 = f5;
        }
        if ((i2 & 32) != 0) {
            f12 = FilterChipTokens.INSTANCE.m34982getElevatedDisabledContainerElevationD9Ej5fM();
        } else {
            f12 = f6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(684803697, i, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipElevation (Chip.kt:982)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(f7, f8, f9, f10, f11, f12, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipElevation;
    }

    @Composable
    /* renamed from: filterChipBorder-gHcDVlo  reason: not valid java name */
    public final SelectableChipBorder m34438filterChipBordergHcDVlo(long j, long j2, long j3, long j4, float f, float f2, Composer composer, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        float f3;
        float f4;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(-1884534961);
        if ((i2 & 1) != 0) {
            j5 = ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getFlatUnselectedOutlineColor(), composer2, 6);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getFlatDisabledUnselectedOutlineColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j8 = j4;
        }
        if ((i2 & 16) != 0) {
            f3 = FilterChipTokens.INSTANCE.m34993getFlatUnselectedOutlineWidthD9Ej5fM();
        } else {
            f3 = f;
        }
        if ((i2 & 32) != 0) {
            f4 = FilterChipTokens.INSTANCE.m34989getFlatSelectedOutlineWidthD9Ej5fM();
        } else {
            f4 = f2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1884534961, i, -1, "androidx.compose.material3.FilterChipDefaults.filterChipBorder (Chip.kt:901)");
        }
        SelectableChipBorder selectableChipBorder = new SelectableChipBorder(j5, j6, j7, j8, f3, f4, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipBorder;
    }

    @Composable
    /* renamed from: filterChipColors-XqyqHi0  reason: not valid java name */
    public final SelectableChipColors m34439filterChipColorsXqyqHi0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, Composer composer, int i, int i2, int i3) {
        long j13;
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
        Composer composer2 = composer;
        int i4 = i3;
        composer2.startReplaceableGroup(-1831479801);
        if ((i4 & 1) != 0) {
            j13 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j13 = j;
        }
        if ((i4 & 2) != 0) {
            j14 = ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getUnselectedLabelTextColor(), composer2, 6);
        } else {
            j14 = j2;
        }
        if ((i4 & 4) != 0) {
            j15 = ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getUnselectedIconColor(), composer2, 6);
        } else {
            j15 = j3;
        }
        if ((i4 & 8) != 0) {
            j16 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j16 = j4;
        }
        if ((i4 & 16) != 0) {
            j17 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getDisabledLabelTextColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j17 = j5;
        }
        if ((i4 & 32) != 0) {
            j18 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getDisabledIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j18 = j6;
        }
        if ((i4 & 64) != 0) {
            j19 = j18;
        } else {
            j19 = j7;
        }
        if ((i4 & 128) != 0) {
            j20 = ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getFlatSelectedContainerColor(), composer2, 6);
        } else {
            j20 = j8;
        }
        if ((i4 & 256) != 0) {
            j21 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getFlatDisabledSelectedContainerColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j21 = j9;
        }
        if ((i4 & 512) != 0) {
            j22 = ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getSelectedLabelTextColor(), composer2, 6);
        } else {
            j22 = j10;
        }
        if ((i4 & 1024) != 0) {
            j23 = ColorSchemeKt.toColor(FilterChipTokens.INSTANCE.getSelectedIconColor(), composer2, 6);
        } else {
            j23 = j11;
        }
        if ((i4 & 2048) != 0) {
            j24 = j23;
        } else {
            j24 = j12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1831479801, i, i2, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:825)");
        }
        SelectableChipColors selectableChipColors = new SelectableChipColors(j13, j14, j15, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipColors;
    }

    @Composable
    /* renamed from: filterChipElevation-aqJV_2Y  reason: not valid java name */
    public final SelectableChipElevation m34440filterChipElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        composer.startReplaceableGroup(-757972185);
        if ((i2 & 1) != 0) {
            f7 = FilterChipTokens.INSTANCE.m34986getFlatContainerElevationD9Ej5fM();
        } else {
            f7 = f;
        }
        if ((i2 & 2) != 0) {
            f8 = FilterChipTokens.INSTANCE.m34990getFlatSelectedPressedContainerElevationD9Ej5fM();
        } else {
            f8 = f2;
        }
        if ((i2 & 4) != 0) {
            f9 = FilterChipTokens.INSTANCE.m34987getFlatSelectedFocusContainerElevationD9Ej5fM();
        } else {
            f9 = f3;
        }
        if ((i2 & 8) != 0) {
            f10 = FilterChipTokens.INSTANCE.m34988getFlatSelectedHoverContainerElevationD9Ej5fM();
        } else {
            f10 = f4;
        }
        if ((i2 & 16) != 0) {
            f11 = FilterChipTokens.INSTANCE.m34980getDraggedContainerElevationD9Ej5fM();
        } else {
            f11 = f5;
        }
        if ((i2 & 32) != 0) {
            f12 = f7;
        } else {
            f12 = f6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-757972185, i, -1, "androidx.compose.material3.FilterChipDefaults.filterChipElevation (Chip.kt:871)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(f7, f8, f9, f10, f11, f12, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipElevation;
    }

    /* renamed from: getHeight-D9Ej5fM  reason: not valid java name */
    public final float m34441getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m34442getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @Composable
    public final Shape getShape(Composer composer, int i) {
        composer.startReplaceableGroup(-1598643637);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1598643637, i, -1, "androidx.compose.material3.FilterChipDefaults.<get-shape> (Chip.kt:999)");
        }
        Shape shape = ShapesKt.toShape(FilterChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }
}
