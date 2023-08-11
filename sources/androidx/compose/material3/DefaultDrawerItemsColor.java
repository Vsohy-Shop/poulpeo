package androidx.compose.material3;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: NavigationDrawer.kt */
final class DefaultDrawerItemsColor implements NavigationDrawerItemColors {
    private final long selectedBadgeColor;
    private final long selectedContainerColor;
    private final long selectedIconColor;
    private final long selectedTextColor;
    private final long unselectedBadgeColor;
    private final long unselectedContainerColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    public /* synthetic */ DefaultDrawerItemsColor(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8);
    }

    @Composable
    public State<Color> badgeColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-561675044);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-561675044, i, -1, "androidx.compose.material3.DefaultDrawerItemsColor.badgeColor (NavigationDrawer.kt:815)");
        }
        if (z) {
            j = this.selectedBadgeColor;
        } else {
            j = this.unselectedBadgeColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public State<Color> containerColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-433512770);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-433512770, i, -1, "androidx.compose.material3.DefaultDrawerItemsColor.containerColor (NavigationDrawer.kt:808)");
        }
        if (z) {
            j = this.selectedContainerColor;
        } else {
            j = this.unselectedContainerColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultDrawerItemsColor)) {
            return false;
        }
        DefaultDrawerItemsColor defaultDrawerItemsColor = (DefaultDrawerItemsColor) obj;
        if (Color.m35672equalsimpl0(this.selectedIconColor, defaultDrawerItemsColor.selectedIconColor) && Color.m35672equalsimpl0(this.unselectedIconColor, defaultDrawerItemsColor.unselectedIconColor) && Color.m35672equalsimpl0(this.selectedTextColor, defaultDrawerItemsColor.selectedTextColor) && Color.m35672equalsimpl0(this.unselectedTextColor, defaultDrawerItemsColor.unselectedTextColor) && Color.m35672equalsimpl0(this.selectedContainerColor, defaultDrawerItemsColor.selectedContainerColor) && Color.m35672equalsimpl0(this.unselectedContainerColor, defaultDrawerItemsColor.unselectedContainerColor) && Color.m35672equalsimpl0(this.selectedBadgeColor, defaultDrawerItemsColor.selectedBadgeColor) && Color.m35672equalsimpl0(this.unselectedBadgeColor, defaultDrawerItemsColor.unselectedBadgeColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getSelectedBadgeColor-0d7_KjU  reason: not valid java name */
    public final long m34386getSelectedBadgeColor0d7_KjU() {
        return this.selectedBadgeColor;
    }

    /* renamed from: getSelectedContainerColor-0d7_KjU  reason: not valid java name */
    public final long m34387getSelectedContainerColor0d7_KjU() {
        return this.selectedContainerColor;
    }

    /* renamed from: getSelectedIconColor-0d7_KjU  reason: not valid java name */
    public final long m34388getSelectedIconColor0d7_KjU() {
        return this.selectedIconColor;
    }

    /* renamed from: getSelectedTextColor-0d7_KjU  reason: not valid java name */
    public final long m34389getSelectedTextColor0d7_KjU() {
        return this.selectedTextColor;
    }

    /* renamed from: getUnselectedBadgeColor-0d7_KjU  reason: not valid java name */
    public final long m34390getUnselectedBadgeColor0d7_KjU() {
        return this.unselectedBadgeColor;
    }

    /* renamed from: getUnselectedContainerColor-0d7_KjU  reason: not valid java name */
    public final long m34391getUnselectedContainerColor0d7_KjU() {
        return this.unselectedContainerColor;
    }

    /* renamed from: getUnselectedIconColor-0d7_KjU  reason: not valid java name */
    public final long m34392getUnselectedIconColor0d7_KjU() {
        return this.unselectedIconColor;
    }

    /* renamed from: getUnselectedTextColor-0d7_KjU  reason: not valid java name */
    public final long m34393getUnselectedTextColor0d7_KjU() {
        return this.unselectedTextColor;
    }

    public int hashCode() {
        return (((((((((((((Color.m35678hashCodeimpl(this.selectedIconColor) * 31) + Color.m35678hashCodeimpl(this.unselectedIconColor)) * 31) + Color.m35678hashCodeimpl(this.selectedTextColor)) * 31) + Color.m35678hashCodeimpl(this.unselectedTextColor)) * 31) + Color.m35678hashCodeimpl(this.selectedContainerColor)) * 31) + Color.m35678hashCodeimpl(this.unselectedContainerColor)) * 31) + Color.m35678hashCodeimpl(this.selectedBadgeColor)) * 31) + Color.m35678hashCodeimpl(this.unselectedBadgeColor);
    }

    @Composable
    public State<Color> iconColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1141354218);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1141354218, i, -1, "androidx.compose.material3.DefaultDrawerItemsColor.iconColor (NavigationDrawer.kt:798)");
        }
        if (z) {
            j = this.selectedIconColor;
        } else {
            j = this.unselectedIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public State<Color> textColor(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1275109558);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1275109558, i, -1, "androidx.compose.material3.DefaultDrawerItemsColor.textColor (NavigationDrawer.kt:803)");
        }
        if (z) {
            j = this.selectedTextColor;
        } else {
            j = this.unselectedTextColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    private DefaultDrawerItemsColor(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.selectedIconColor = j;
        this.unselectedIconColor = j2;
        this.selectedTextColor = j3;
        this.unselectedTextColor = j4;
        this.selectedContainerColor = j5;
        this.unselectedContainerColor = j6;
        this.selectedBadgeColor = j7;
        this.unselectedBadgeColor = j8;
    }
}
