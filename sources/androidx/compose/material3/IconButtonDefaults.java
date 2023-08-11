package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilledIconButtonTokens;
import androidx.compose.material3.tokens.FilledTonalIconButtonTokens;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.material3.tokens.OutlinedIconButtonTokens;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: IconButton.kt */
public final class IconButtonDefaults {
    public static final int $stable = 0;
    public static final IconButtonDefaults INSTANCE = new IconButtonDefaults();

    private IconButtonDefaults() {
    }

    @Composable
    /* renamed from: filledIconButtonColors-ro_MJ88  reason: not valid java name */
    public final IconButtonColors m34456filledIconButtonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        Composer composer2 = composer;
        int i3 = i;
        composer2.startReplaceableGroup(-669858473);
        if ((i2 & 1) != 0) {
            j5 = ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getContainerColor(), composer2, 6);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.m34359contentColorForek8zF_U(j5, composer2, i3 & 14);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getDisabledContainerColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getDisabledColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-669858473, i3, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButton.kt:608)");
        }
        IconButtonColors iconButtonColors = new IconButtonColors(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconButtonColors;
    }

    @Composable
    /* renamed from: filledIconToggleButtonColors-5tl4gsc  reason: not valid java name */
    public final IconToggleButtonColors m34457filledIconToggleButtonColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        Composer composer2 = composer;
        int i3 = i;
        composer2.startReplaceableGroup(1887173701);
        if ((i2 & 1) != 0) {
            j7 = ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getUnselectedContainerColor(), composer2, 6);
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getToggleUnselectedColor(), composer2, 6);
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getDisabledContainerColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            j10 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getDisabledColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j10 = j4;
        }
        if ((i2 & 16) != 0) {
            j11 = ColorSchemeKt.toColor(FilledIconButtonTokens.INSTANCE.getSelectedContainerColor(), composer2, 6);
        } else {
            j11 = j5;
        }
        if ((i2 & 32) != 0) {
            j12 = ColorSchemeKt.m34359contentColorForek8zF_U(j11, composer2, (i3 >> 12) & 14);
        } else {
            j12 = j6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1887173701, i3, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButton.kt:635)");
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(j7, j8, j9, j10, j11, j12, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconToggleButtonColors;
    }

    @Composable
    /* renamed from: filledTonalIconButtonColors-ro_MJ88  reason: not valid java name */
    public final IconButtonColors m34458filledTonalIconButtonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        Composer composer2 = composer;
        int i3 = i;
        composer2.startReplaceableGroup(-18532843);
        if ((i2 & 1) != 0) {
            j5 = ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getContainerColor(), composer2, 6);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.m34359contentColorForek8zF_U(j5, composer2, i3 & 14);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getDisabledColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-18532843, i3, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButton.kt:666)");
        }
        IconButtonColors iconButtonColors = new IconButtonColors(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconButtonColors;
    }

    @Composable
    /* renamed from: filledTonalIconToggleButtonColors-5tl4gsc  reason: not valid java name */
    public final IconToggleButtonColors m34459filledTonalIconToggleButtonColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        Composer composer2 = composer;
        int i3 = i;
        composer2.startReplaceableGroup(-19426557);
        if ((i2 & 1) != 0) {
            j7 = ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getUnselectedContainerColor(), composer2, 6);
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = ColorSchemeKt.m34359contentColorForek8zF_U(j7, composer2, i3 & 14);
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            j10 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getDisabledColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j10 = j4;
        }
        if ((i2 & 16) != 0) {
            j11 = ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getSelectedContainerColor(), composer2, 6);
        } else {
            j11 = j5;
        }
        if ((i2 & 32) != 0) {
            j12 = ColorSchemeKt.toColor(FilledTonalIconButtonTokens.INSTANCE.getToggleSelectedColor(), composer2, 6);
        } else {
            j12 = j6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-19426557, i3, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButton.kt:693)");
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(j7, j8, j9, j10, j11, j12, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconToggleButtonColors;
    }

    @Composable
    public final Shape getFilledShape(Composer composer, int i) {
        composer.startReplaceableGroup(1265841879);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1265841879, i, -1, "androidx.compose.material3.IconButtonDefaults.<get-filledShape> (IconButton.kt:539)");
        }
        Shape shape = ShapesKt.toShape(FilledIconButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    public final Shape getOutlinedShape(Composer composer, int i) {
        composer.startReplaceableGroup(1327125527);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1327125527, i, -1, "androidx.compose.material3.IconButtonDefaults.<get-outlinedShape> (IconButton.kt:543)");
        }
        Shape shape = ShapesKt.toShape(OutlinedIconButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    /* renamed from: iconButtonColors-ro_MJ88  reason: not valid java name */
    public final IconButtonColors m34460iconButtonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(999008085);
        if ((i2 & 1) != 0) {
            j5 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ((Color) composer2.consume(ContentColorKt.getLocalContentColor())).m35681unboximpl();
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = Color.m35670copywmQWz5c$default(j6, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(999008085, i, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:555)");
        }
        IconButtonColors iconButtonColors = new IconButtonColors(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconButtonColors;
    }

    @Composable
    /* renamed from: iconToggleButtonColors-5tl4gsc  reason: not valid java name */
    public final IconToggleButtonColors m34461iconToggleButtonColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(-2020719549);
        if ((i2 & 1) != 0) {
            j7 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = ((Color) composer2.consume(ContentColorKt.getLocalContentColor())).m35681unboximpl();
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            j10 = Color.m35670copywmQWz5c$default(j8, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j10 = j4;
        }
        if ((i2 & 16) != 0) {
            j11 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j11 = j5;
        }
        if ((i2 & 32) != 0) {
            j12 = ColorSchemeKt.toColor(IconButtonTokens.INSTANCE.getSelectedIconColor(), composer2, 6);
        } else {
            j12 = j6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2020719549, i, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButton.kt:581)");
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(j7, j8, j9, j10, j11, j12, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconToggleButtonColors;
    }

    @Composable
    public final BorderStroke outlinedIconButtonBorder(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-511461558);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511461558, i, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonBorder (IconButton.kt:789)");
        }
        if (z) {
            composer.startReplaceableGroup(1252615072);
            j = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m35681unboximpl();
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1252615127);
            j = Color.m35670copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m35681unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            composer.endReplaceableGroup();
        }
        Color r9 = Color.m35661boximpl(j);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) r9);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = BorderStrokeKt.m32976BorderStrokecXLIe8U(OutlinedIconButtonTokens.INSTANCE.m35064getUnselectedOutlineWidthD9Ej5fM(), j);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        BorderStroke borderStroke = (BorderStroke) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return borderStroke;
    }

    @Composable
    /* renamed from: outlinedIconButtonColors-ro_MJ88  reason: not valid java name */
    public final IconButtonColors m34462outlinedIconButtonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(-1030517545);
        if ((i2 & 1) != 0) {
            j5 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ((Color) composer2.consume(ContentColorKt.getLocalContentColor())).m35681unboximpl();
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = Color.m35670copywmQWz5c$default(j6, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1030517545, i, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButton.kt:723)");
        }
        IconButtonColors iconButtonColors = new IconButtonColors(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconButtonColors;
    }

    @Composable
    public final BorderStroke outlinedIconToggleButtonBorder(boolean z, boolean z2, Composer composer, int i) {
        composer.startReplaceableGroup(1244729690);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1244729690, i, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonBorder (IconButton.kt:776)");
        }
        if (z2) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return null;
        }
        BorderStroke outlinedIconButtonBorder = outlinedIconButtonBorder(z, composer, (i & 14) | ((i >> 3) & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return outlinedIconButtonBorder;
    }

    @Composable
    /* renamed from: outlinedIconToggleButtonColors-5tl4gsc  reason: not valid java name */
    public final IconToggleButtonColors m34463outlinedIconToggleButtonColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        Composer composer2 = composer;
        int i3 = i;
        composer2.startReplaceableGroup(2130592709);
        if ((i2 & 1) != 0) {
            j7 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = ((Color) composer2.consume(ContentColorKt.getLocalContentColor())).m35681unboximpl();
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = Color.Companion.m35706getTransparent0d7_KjU();
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            j10 = Color.m35670copywmQWz5c$default(j8, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j10 = j4;
        }
        if ((i2 & 16) != 0) {
            j11 = ColorSchemeKt.toColor(OutlinedIconButtonTokens.INSTANCE.getSelectedContainerColor(), composer2, 6);
        } else {
            j11 = j5;
        }
        if ((i2 & 32) != 0) {
            j12 = ColorSchemeKt.m34359contentColorForek8zF_U(j11, composer2, (i3 >> 12) & 14);
        } else {
            j12 = j6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2130592709, i3, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButton.kt:749)");
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(j7, j8, j9, j10, j11, j12, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconToggleButtonColors;
    }
}
