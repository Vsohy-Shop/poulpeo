package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.MenuTokens;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: Menu.kt */
public final class MenuDefaults {
    public static final int $stable = 0;
    private static final PaddingValues DropdownMenuItemContentPadding = PaddingKt.m33262PaddingValuesYgX7TsA(MenuKt.DropdownMenuItemHorizontalPadding, C1232Dp.m38468constructorimpl((float) 0));
    public static final MenuDefaults INSTANCE = new MenuDefaults();

    private MenuDefaults() {
    }

    public final PaddingValues getDropdownMenuItemContentPadding() {
        return DropdownMenuItemContentPadding;
    }

    @Composable
    /* renamed from: itemColors-5tl4gsc  reason: not valid java name */
    public final MenuItemColors m34486itemColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(-1278543580);
        if ((i2 & 1) != 0) {
            j7 = ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemLabelTextColor(), composer2, 6);
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemLeadingIconColor(), composer2, 6);
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemTrailingIconColor(), composer2, 6);
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            j10 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemDisabledLabelTextColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j10 = j4;
        }
        if ((i2 & 16) != 0) {
            j11 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemDisabledLeadingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j11 = j5;
        }
        if ((i2 & 32) != 0) {
            j12 = Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemDisabledTrailingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j12 = j6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1278543580, i, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:234)");
        }
        MenuItemColors menuItemColors = new MenuItemColors(j7, j8, j9, j10, j11, j12, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return menuItemColors;
    }
}
