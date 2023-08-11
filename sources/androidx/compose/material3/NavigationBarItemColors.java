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
/* compiled from: NavigationBar.kt */
public final class NavigationBarItemColors {
    private final long selectedIconColor;
    private final long selectedIndicatorColor;
    private final long selectedTextColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    public /* synthetic */ NavigationBarItemColors(long j, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavigationBarItemColors)) {
            return false;
        }
        NavigationBarItemColors navigationBarItemColors = (NavigationBarItemColors) obj;
        if (Color.m35672equalsimpl0(this.selectedIconColor, navigationBarItemColors.selectedIconColor) && Color.m35672equalsimpl0(this.unselectedIconColor, navigationBarItemColors.unselectedIconColor) && Color.m35672equalsimpl0(this.selectedTextColor, navigationBarItemColors.selectedTextColor) && Color.m35672equalsimpl0(this.unselectedTextColor, navigationBarItemColors.unselectedTextColor) && Color.m35672equalsimpl0(this.selectedIndicatorColor, navigationBarItemColors.selectedIndicatorColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getIndicatorColor-0d7_KjU$material3_release  reason: not valid java name */
    public final long m34494getIndicatorColor0d7_KjU$material3_release() {
        return this.selectedIndicatorColor;
    }

    public int hashCode() {
        return (((((((Color.m35678hashCodeimpl(this.selectedIconColor) * 31) + Color.m35678hashCodeimpl(this.unselectedIconColor)) * 31) + Color.m35678hashCodeimpl(this.selectedTextColor)) * 31) + Color.m35678hashCodeimpl(this.unselectedTextColor)) * 31) + Color.m35678hashCodeimpl(this.selectedIndicatorColor);
    }

    @Composable
    public final State<Color> iconColor$material3_release(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1510597389);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1510597389, i, -1, "androidx.compose.material3.NavigationBarItemColors.iconColor (NavigationBar.kt:320)");
        }
        if (z) {
            j = this.selectedIconColor;
        } else {
            j = this.unselectedIconColor;
        }
        State<Color> r10 = SingleValueAnimationKt.m32872animateColorAsStateKTwxG1Y(j, AnimationSpecKt.tween$default(100, 0, (Easing) null, 6, (Object) null), (Function1<? super Color, C11921v>) null, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r10;
    }

    @Composable
    public final State<Color> textColor$material3_release(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1773887143);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1773887143, i, -1, "androidx.compose.material3.NavigationBarItemColors.textColor (NavigationBar.kt:333)");
        }
        if (z) {
            j = this.selectedTextColor;
        } else {
            j = this.unselectedTextColor;
        }
        State<Color> r10 = SingleValueAnimationKt.m32872animateColorAsStateKTwxG1Y(j, AnimationSpecKt.tween$default(100, 0, (Easing) null, 6, (Object) null), (Function1<? super Color, C11921v>) null, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r10;
    }

    private NavigationBarItemColors(long j, long j2, long j3, long j4, long j5) {
        this.selectedIconColor = j;
        this.selectedTextColor = j2;
        this.selectedIndicatorColor = j3;
        this.unselectedIconColor = j4;
        this.unselectedTextColor = j5;
    }
}
