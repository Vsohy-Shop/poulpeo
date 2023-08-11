package androidx.compose.material3;

import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
/* compiled from: ListItem.kt */
public final class ListItemDefaults {
    public static final int $stable = 0;
    private static final float Elevation = ListTokens.INSTANCE.m35008getListItemContainerElevationD9Ej5fM();
    public static final ListItemDefaults INSTANCE = new ListItemDefaults();

    private ListItemDefaults() {
    }

    @Composable
    /* renamed from: colors-J08w3-E  reason: not valid java name */
    public final ListItemColors m34474colorsJ08w3E(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, Composer composer, int i, int i2) {
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
        composer2.startReplaceableGroup(-352515689);
        if ((i3 & 1) != 0) {
            j10 = ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemContainerColor(), composer2, 6);
        } else {
            j10 = j;
        }
        if ((i3 & 2) != 0) {
            j11 = ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemLabelTextColor(), composer2, 6);
        } else {
            j11 = j2;
        }
        if ((i3 & 4) != 0) {
            j12 = ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemLeadingIconColor(), composer2, 6);
        } else {
            j12 = j3;
        }
        if ((i3 & 8) != 0) {
            j13 = ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemOverlineColor(), composer2, 6);
        } else {
            j13 = j4;
        }
        if ((i3 & 16) != 0) {
            j14 = ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemSupportingTextColor(), composer2, 6);
        } else {
            j14 = j5;
        }
        if ((i3 & 32) != 0) {
            j15 = ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemTrailingIconColor(), composer2, 6);
        } else {
            j15 = j6;
        }
        if ((i3 & 64) != 0) {
            j16 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemDisabledLabelTextColor(), composer2, 6), 0.3f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j16 = j7;
        }
        if ((i3 & 128) != 0) {
            j17 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemDisabledLeadingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j17 = j8;
        }
        if ((i3 & 256) != 0) {
            j18 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemDisabledTrailingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j18 = j9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-352515689, i, -1, "androidx.compose.material3.ListItemDefaults.colors (ListItem.kt:400)");
        }
        ListItemColors listItemColors = new ListItemColors(j10, j11, j12, j13, j14, j15, j16, j17, j18, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return listItemColors;
    }

    @Composable
    public final long getContainerColor(Composer composer, int i) {
        composer.startReplaceableGroup(-1253579929);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1253579929, i, -1, "androidx.compose.material3.ListItemDefaults.<get-containerColor> (ListItem.kt:377)");
        }
        long color = ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    public final long getContentColor(Composer composer, int i) {
        composer.startReplaceableGroup(1076068327);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1076068327, i, -1, "androidx.compose.material3.ListItemDefaults.<get-contentColor> (ListItem.kt:380)");
        }
        long color = ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    /* renamed from: getElevation-D9Ej5fM  reason: not valid java name */
    public final float m34475getElevationD9Ej5fM() {
        return Elevation;
    }

    @Composable
    public final Shape getShape(Composer composer, int i) {
        composer.startReplaceableGroup(-496871597);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-496871597, i, -1, "androidx.compose.material3.ListItemDefaults.<get-shape> (ListItem.kt:374)");
        }
        Shape shape = ShapesKt.toShape(ListTokens.INSTANCE.getListItemContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }
}
