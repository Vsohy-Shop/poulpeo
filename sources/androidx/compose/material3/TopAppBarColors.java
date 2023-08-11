package androidx.compose.material3;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ExperimentalMaterial3Api
@Stable
/* compiled from: AppBar.kt */
public final class TopAppBarColors {
    private final long actionIconContentColor;
    private final long containerColor;
    private final long navigationIconContentColor;
    private final long scrolledContainerColor;
    private final long titleContentColor;

    public /* synthetic */ TopAppBarColors(long j, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5);
    }

    @Composable
    /* renamed from: containerColor-XeAY9LY$material3_release  reason: not valid java name */
    public final long m34749containerColorXeAY9LY$material3_release(float f, Composer composer, int i) {
        composer.startReplaceableGroup(-1456204135);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1456204135, i, -1, "androidx.compose.material3.TopAppBarColors.containerColor (AppBar.kt:896)");
        }
        long r0 = ColorKt.m35722lerpjxsXWHM(this.containerColor, this.scrolledContainerColor, EasingKt.getFastOutLinearInEasing().transform(f));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TopAppBarColors)) {
            return false;
        }
        TopAppBarColors topAppBarColors = (TopAppBarColors) obj;
        if (Color.m35672equalsimpl0(this.containerColor, topAppBarColors.containerColor) && Color.m35672equalsimpl0(this.scrolledContainerColor, topAppBarColors.scrolledContainerColor) && Color.m35672equalsimpl0(this.navigationIconContentColor, topAppBarColors.navigationIconContentColor) && Color.m35672equalsimpl0(this.titleContentColor, topAppBarColors.titleContentColor) && Color.m35672equalsimpl0(this.actionIconContentColor, topAppBarColors.actionIconContentColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getActionIconContentColor-0d7_KjU$material3_release  reason: not valid java name */
    public final long m34750getActionIconContentColor0d7_KjU$material3_release() {
        return this.actionIconContentColor;
    }

    /* renamed from: getNavigationIconContentColor-0d7_KjU$material3_release  reason: not valid java name */
    public final long m34751getNavigationIconContentColor0d7_KjU$material3_release() {
        return this.navigationIconContentColor;
    }

    /* renamed from: getTitleContentColor-0d7_KjU$material3_release  reason: not valid java name */
    public final long m34752getTitleContentColor0d7_KjU$material3_release() {
        return this.titleContentColor;
    }

    public int hashCode() {
        return (((((((Color.m35678hashCodeimpl(this.containerColor) * 31) + Color.m35678hashCodeimpl(this.scrolledContainerColor)) * 31) + Color.m35678hashCodeimpl(this.navigationIconContentColor)) * 31) + Color.m35678hashCodeimpl(this.titleContentColor)) * 31) + Color.m35678hashCodeimpl(this.actionIconContentColor);
    }

    private TopAppBarColors(long j, long j2, long j3, long j4, long j5) {
        this.containerColor = j;
        this.scrolledContainerColor = j2;
        this.navigationIconContentColor = j3;
        this.titleContentColor = j4;
        this.actionIconContentColor = j5;
    }
}
