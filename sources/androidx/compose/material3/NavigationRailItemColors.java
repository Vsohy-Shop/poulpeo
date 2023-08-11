package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

@Stable
/* compiled from: NavigationRail.kt */
public final class NavigationRailItemColors {
    private final long selectedIconColor;
    private final long selectedIndicatorColor;
    private final long selectedTextColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    public /* synthetic */ NavigationRailItemColors(long j, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavigationRailItemColors)) {
            return false;
        }
        NavigationRailItemColors navigationRailItemColors = (NavigationRailItemColors) obj;
        if (Color.m35672equalsimpl0(this.selectedIconColor, navigationRailItemColors.selectedIconColor) && Color.m35672equalsimpl0(this.unselectedIconColor, navigationRailItemColors.unselectedIconColor) && Color.m35672equalsimpl0(this.selectedTextColor, navigationRailItemColors.selectedTextColor) && Color.m35672equalsimpl0(this.unselectedTextColor, navigationRailItemColors.unselectedTextColor) && Color.m35672equalsimpl0(this.selectedIndicatorColor, navigationRailItemColors.selectedIndicatorColor)) {
            return true;
        }
        return false;
    }

    @Composable
    public final long getIndicatorColor(Composer composer, int i) {
        composer.startReplaceableGroup(618271448);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(618271448, i, -1, "androidx.compose.material3.NavigationRailItemColors.<get-indicatorColor> (NavigationRail.kt:341)");
        }
        long j = this.selectedIndicatorColor;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }

    public int hashCode() {
        return (((((((Color.m35678hashCodeimpl(this.selectedIconColor) * 31) + Color.m35678hashCodeimpl(this.unselectedIconColor)) * 31) + Color.m35678hashCodeimpl(this.selectedTextColor)) * 31) + Color.m35678hashCodeimpl(this.unselectedTextColor)) * 31) + Color.m35678hashCodeimpl(this.selectedIndicatorColor);
    }

    @Composable
    public final State<Color> iconColor$material3_release(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(665215869);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(665215869, i, -1, "androidx.compose.material3.NavigationRailItemColors.iconColor (NavigationRail.kt:318)");
        }
        if (z) {
            j = this.selectedIconColor;
        } else {
            j = this.unselectedIconColor;
        }
        State<Color> r10 = SingleValueAnimationKt.m32872animateColorAsStateKTwxG1Y(j, AnimationSpecKt.tween$default(150, 0, (Easing) null, 6, (Object) null), (Function1<? super Color, C11921v>) null, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r10;
    }

    @Composable
    public final State<Color> textColor$material3_release(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(253888561);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(253888561, i, -1, "androidx.compose.material3.NavigationRailItemColors.textColor (NavigationRail.kt:331)");
        }
        if (z) {
            j = this.selectedTextColor;
        } else {
            j = this.unselectedTextColor;
        }
        State<Color> r10 = SingleValueAnimationKt.m32872animateColorAsStateKTwxG1Y(j, AnimationSpecKt.tween$default(150, 0, (Easing) null, 6, (Object) null), (Function1<? super Color, C11921v>) null, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r10;
    }

    private NavigationRailItemColors(long j, long j2, long j3, long j4, long j5) {
        this.selectedIconColor = j;
        this.selectedTextColor = j2;
        this.selectedIndicatorColor = j3;
        this.unselectedIconColor = j4;
        this.unselectedTextColor = j5;
    }
}
