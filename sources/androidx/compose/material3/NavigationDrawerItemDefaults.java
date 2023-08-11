package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
/* compiled from: NavigationDrawer.kt */
public final class NavigationDrawerItemDefaults {
    public static final int $stable = 0;
    public static final NavigationDrawerItemDefaults INSTANCE = new NavigationDrawerItemDefaults();
    private static final PaddingValues ItemPadding = PaddingKt.m33263PaddingValuesYgX7TsA$default(C1232Dp.m38468constructorimpl((float) 12), 0.0f, 2, (Object) null);

    private NavigationDrawerItemDefaults() {
    }

    @Composable
    /* renamed from: colors-oq7We08  reason: not valid java name */
    public final NavigationDrawerItemColors m34510colorsoq7We08(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, Composer composer, int i, int i2) {
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
        composer2.startReplaceableGroup(-1574983348);
        if ((i3 & 1) != 0) {
            j9 = ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getActiveIndicatorColor(), composer2, 6);
        } else {
            j9 = j;
        }
        if ((i3 & 2) != 0) {
            j10 = ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getContainerColor(), composer2, 6);
        } else {
            j10 = j2;
        }
        if ((i3 & 4) != 0) {
            j11 = ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getActiveIconColor(), composer2, 6);
        } else {
            j11 = j3;
        }
        if ((i3 & 8) != 0) {
            j12 = ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getInactiveIconColor(), composer2, 6);
        } else {
            j12 = j4;
        }
        if ((i3 & 16) != 0) {
            j13 = ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getActiveLabelTextColor(), composer2, 6);
        } else {
            j13 = j5;
        }
        if ((i3 & 32) != 0) {
            j14 = ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getInactiveLabelTextColor(), composer2, 6);
        } else {
            j14 = j6;
        }
        if ((i3 & 64) != 0) {
            j15 = j13;
        } else {
            j15 = j7;
        }
        if ((i3 & 128) != 0) {
            j16 = j14;
        } else {
            j16 = j8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1574983348, i, -1, "androidx.compose.material3.NavigationDrawerItemDefaults.colors (NavigationDrawer.kt:759)");
        }
        DefaultDrawerItemsColor defaultDrawerItemsColor = new DefaultDrawerItemsColor(j11, j12, j13, j14, j9, j10, j15, j16, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultDrawerItemsColor;
    }

    public final PaddingValues getItemPadding() {
        return ItemPadding;
    }
}
