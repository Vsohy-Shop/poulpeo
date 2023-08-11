package androidx.compose.material3;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* compiled from: Menu.kt */
public final class MenuItemColors {
    private final long disabledLeadingIconColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long leadingIconColor;
    private final long textColor;
    private final long trailingIconColor;

    public /* synthetic */ MenuItemColors(long j, long j2, long j3, long j4, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MenuItemColors)) {
            return false;
        }
        MenuItemColors menuItemColors = (MenuItemColors) obj;
        if (Color.m35672equalsimpl0(this.textColor, menuItemColors.textColor) && Color.m35672equalsimpl0(this.leadingIconColor, menuItemColors.leadingIconColor) && Color.m35672equalsimpl0(this.trailingIconColor, menuItemColors.trailingIconColor) && Color.m35672equalsimpl0(this.disabledTextColor, menuItemColors.disabledTextColor) && Color.m35672equalsimpl0(this.disabledLeadingIconColor, menuItemColors.disabledLeadingIconColor) && Color.m35672equalsimpl0(this.disabledTrailingIconColor, menuItemColors.disabledTrailingIconColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((Color.m35678hashCodeimpl(this.textColor) * 31) + Color.m35678hashCodeimpl(this.leadingIconColor)) * 31) + Color.m35678hashCodeimpl(this.trailingIconColor)) * 31) + Color.m35678hashCodeimpl(this.disabledTextColor)) * 31) + Color.m35678hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m35678hashCodeimpl(this.disabledTrailingIconColor);
    }

    @Composable
    public final State<Color> leadingIconColor$material3_release(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1521013607);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1521013607, i, -1, "androidx.compose.material3.MenuItemColors.leadingIconColor (Menu.kt:393)");
        }
        if (z) {
            j = this.leadingIconColor;
        } else {
            j = this.disabledLeadingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> textColor$material3_release(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1023108655);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1023108655, i, -1, "androidx.compose.material3.MenuItemColors.textColor (Menu.kt:383)");
        }
        if (z) {
            j = this.textColor;
        } else {
            j = this.disabledTextColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> trailingIconColor$material3_release(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1024062809);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1024062809, i, -1, "androidx.compose.material3.MenuItemColors.trailingIconColor (Menu.kt:403)");
        }
        if (z) {
            j = this.trailingIconColor;
        } else {
            j = this.disabledTrailingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    private MenuItemColors(long j, long j2, long j3, long j4, long j5, long j6) {
        this.textColor = j;
        this.leadingIconColor = j2;
        this.trailingIconColor = j3;
        this.disabledTextColor = j4;
        this.disabledLeadingIconColor = j5;
        this.disabledTrailingIconColor = j6;
    }
}
