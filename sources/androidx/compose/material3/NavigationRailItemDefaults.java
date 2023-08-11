package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: NavigationRail.kt */
public final class NavigationRailItemDefaults {
    public static final int $stable = 0;
    public static final NavigationRailItemDefaults INSTANCE = new NavigationRailItemDefaults();

    private NavigationRailItemDefaults() {
    }

    @Composable
    /* renamed from: colors-zjMxDiM  reason: not valid java name */
    public final NavigationRailItemColors m34522colorszjMxDiM(long j, long j2, long j3, long j4, long j5, Composer composer, int i, int i2) {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(1621601574);
        if ((i2 & 1) != 0) {
            j6 = ColorSchemeKt.toColor(NavigationRailTokens.INSTANCE.getActiveIconColor(), composer2, 6);
        } else {
            j6 = j;
        }
        if ((i2 & 2) != 0) {
            j7 = ColorSchemeKt.toColor(NavigationRailTokens.INSTANCE.getActiveLabelTextColor(), composer2, 6);
        } else {
            j7 = j2;
        }
        if ((i2 & 4) != 0) {
            j8 = ColorSchemeKt.toColor(NavigationRailTokens.INSTANCE.getActiveIndicatorColor(), composer2, 6);
        } else {
            j8 = j3;
        }
        if ((i2 & 8) != 0) {
            j9 = ColorSchemeKt.toColor(NavigationRailTokens.INSTANCE.getInactiveIconColor(), composer2, 6);
        } else {
            j9 = j4;
        }
        if ((i2 & 16) != 0) {
            j10 = ColorSchemeKt.toColor(NavigationRailTokens.INSTANCE.getInactiveLabelTextColor(), composer2, 6);
        } else {
            j10 = j5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1621601574, i, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:288)");
        }
        NavigationRailItemColors navigationRailItemColors = new NavigationRailItemColors(j6, j7, j8, j9, j10, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return navigationRailItemColors;
    }
}
