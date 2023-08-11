package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@ExperimentalMaterialApi
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,753:1\n154#2:754\n154#2:755\n154#2:756\n154#2:757\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipDefaults\n*L\n370#1:754\n565#1:755\n570#1:756\n575#1:757\n*E\n"})
/* compiled from: Chip.kt */
public final class ChipDefaults {
    public static final int $stable = 0;
    public static final float ContentOpacity = 0.87f;
    public static final ChipDefaults INSTANCE = new ChipDefaults();
    public static final float LeadingIconOpacity = 0.54f;
    private static final float LeadingIconSize = C1232Dp.m38468constructorimpl((float) 20);
    private static final float MinHeight = C1232Dp.m38468constructorimpl((float) 32);
    public static final float OutlinedBorderOpacity = 0.12f;
    private static final float OutlinedBorderSize = C1232Dp.m38468constructorimpl((float) 1);
    private static final float SelectedIconSize = C1232Dp.m38468constructorimpl((float) 18);

    private ChipDefaults() {
    }

    @Composable
    /* renamed from: chipColors-5tl4gsc  reason: not valid java name */
    public final ChipColors m33935chipColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(1838505436);
        if ((i2 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j7 = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(materialTheme.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), materialTheme.getColors(composer2, 6).m33956getSurface0d7_KjU());
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = Color.m35670copywmQWz5c$default(j8, 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            j10 = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(materialTheme2.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer2, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), materialTheme2.getColors(composer2, 6).m33956getSurface0d7_KjU());
        } else {
            j10 = j4;
        }
        if ((i2 & 16) != 0) {
            j11 = Color.m35670copywmQWz5c$default(j8, ContentAlpha.INSTANCE.getDisabled(composer2, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j11 = j5;
        }
        if ((i2 & 32) != 0) {
            j12 = Color.m35670copywmQWz5c$default(j9, ContentAlpha.INSTANCE.getDisabled(composer2, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j12 = j6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1838505436, i, -1, "androidx.compose.material.ChipDefaults.chipColors (Chip.kt:384)");
        }
        DefaultChipColors defaultChipColors = new DefaultChipColors(j7, j8, j9, j10, j11, j12, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultChipColors;
    }

    @Composable
    /* renamed from: filterChipColors-J08w3-E  reason: not valid java name */
    public final SelectableChipColors m33936filterChipColorsJ08w3E(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, Composer composer, int i, int i2) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        Composer composer2 = composer;
        int i3 = i2;
        composer2.startReplaceableGroup(830140629);
        if ((i3 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j10 = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(materialTheme.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), materialTheme.getColors(composer2, 6).m33956getSurface0d7_KjU());
        } else {
            j10 = j;
        }
        if ((i3 & 2) != 0) {
            j11 = Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j11 = j2;
        }
        if ((i3 & 4) != 0) {
            j12 = Color.m35670copywmQWz5c$default(j11, 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j12 = j3;
        }
        if ((i3 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            j13 = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(materialTheme2.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer2, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), materialTheme2.getColors(composer2, 6).m33956getSurface0d7_KjU());
        } else {
            j13 = j4;
        }
        if ((i3 & 16) != 0) {
            j14 = Color.m35670copywmQWz5c$default(j11, ContentAlpha.INSTANCE.getDisabled(composer2, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j14 = j5;
        }
        if ((i3 & 32) != 0) {
            j15 = Color.m35670copywmQWz5c$default(j12, ContentAlpha.INSTANCE.getDisabled(composer2, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j15 = j6;
        }
        if ((i3 & 64) != 0) {
            j16 = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), j10);
        } else {
            j16 = j7;
        }
        if ((i3 & 128) != 0) {
            j17 = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, (Object) null), j11);
        } else {
            j17 = j8;
        }
        if ((i3 & 256) != 0) {
            j18 = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, (Object) null), j12);
        } else {
            j18 = j9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(830140629, i, -1, "androidx.compose.material.ChipDefaults.filterChipColors (Chip.kt:454)");
        }
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(j10, j11, j12, j13, j14, j15, j16, j17, j18, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSelectableChipColors;
    }

    /* renamed from: getLeadingIconSize-D9Ej5fM  reason: not valid java name */
    public final float m33937getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m33938getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    @Composable
    public final BorderStroke getOutlinedBorder(Composer composer, int i) {
        composer.startReplaceableGroup(-1650225597);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1650225597, i, -1, "androidx.compose.material.ChipDefaults.<get-outlinedBorder> (Chip.kt:542)");
        }
        BorderStroke r11 = BorderStrokeKt.m32976BorderStrokecXLIe8U(OutlinedBorderSize, Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m33951getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r11;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM  reason: not valid java name */
    public final float m33939getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    /* renamed from: getSelectedIconSize-D9Ej5fM  reason: not valid java name */
    public final float m33940getSelectedIconSizeD9Ej5fM() {
        return SelectedIconSize;
    }

    @Composable
    /* renamed from: outlinedChipColors-5tl4gsc  reason: not valid java name */
    public final ChipColors m33941outlinedChipColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        Composer composer2 = composer;
        int i3 = i;
        composer2.startReplaceableGroup(-1763922662);
        if ((i2 & 1) != 0) {
            j7 = MaterialTheme.INSTANCE.getColors(composer2, 6).m33956getSurface0d7_KjU();
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = Color.m35670copywmQWz5c$default(j8, 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            j10 = j7;
        } else {
            j10 = j4;
        }
        if ((i2 & 16) != 0) {
            j11 = Color.m35670copywmQWz5c$default(j8, ContentAlpha.INSTANCE.getDisabled(composer2, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j11 = j5;
        }
        if ((i2 & 32) != 0) {
            j12 = Color.m35670copywmQWz5c$default(j9, ContentAlpha.INSTANCE.getDisabled(composer2, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j12 = j6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1763922662, i3, -1, "androidx.compose.material.ChipDefaults.outlinedChipColors (Chip.kt:420)");
        }
        ChipColors r0 = m33935chipColors5tl4gsc(j7, j8, j9, j10, j11, j12, composer, (i3 & 14) | (i3 & 112) | (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }

    @Composable
    /* renamed from: outlinedFilterChipColors-J08w3-E  reason: not valid java name */
    public final SelectableChipColors m33942outlinedFilterChipColorsJ08w3E(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, Composer composer, int i, int i2) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        Composer composer2 = composer;
        int i3 = i2;
        composer2.startReplaceableGroup(346878099);
        if ((i3 & 1) != 0) {
            j10 = MaterialTheme.INSTANCE.getColors(composer2, 6).m33956getSurface0d7_KjU();
        } else {
            j10 = j;
        }
        if ((i3 & 2) != 0) {
            j11 = Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j11 = j2;
        }
        if ((i3 & 4) != 0) {
            j12 = Color.m35670copywmQWz5c$default(j11, 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j12 = j3;
        }
        if ((i3 & 8) != 0) {
            j13 = j10;
        } else {
            j13 = j4;
        }
        if ((i3 & 16) != 0) {
            j14 = Color.m35670copywmQWz5c$default(j11, ContentAlpha.INSTANCE.getDisabled(composer2, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j14 = j5;
        }
        if ((i3 & 32) != 0) {
            j15 = Color.m35670copywmQWz5c$default(j12, ContentAlpha.INSTANCE.getDisabled(composer2, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j15 = j6;
        }
        if ((i3 & 64) != 0) {
            j16 = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, (Object) null), j10);
        } else {
            j16 = j7;
        }
        if ((i3 & 128) != 0) {
            j17 = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, (Object) null), j11);
        } else {
            j17 = j8;
        }
        if ((i3 & 256) != 0) {
            j18 = ColorKt.m35716compositeOverOWjLjI(Color.m35670copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, 6).m33951getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, (Object) null), j12);
        } else {
            j18 = j9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(346878099, i, -1, "androidx.compose.material.ChipDefaults.outlinedFilterChipColors (Chip.kt:505)");
        }
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(j10, j11, j12, j13, j14, j15, j16, j17, j18, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSelectableChipColors;
    }
}
