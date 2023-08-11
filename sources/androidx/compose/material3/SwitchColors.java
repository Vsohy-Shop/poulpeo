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
/* compiled from: Switch.kt */
public final class SwitchColors {
    private final long checkedBorderColor;
    private final long checkedIconColor;
    private final long checkedThumbColor;
    private final long checkedTrackColor;
    private final long disabledCheckedBorderColor;
    private final long disabledCheckedIconColor;
    private final long disabledCheckedThumbColor;
    private final long disabledCheckedTrackColor;
    private final long disabledUncheckedBorderColor;
    private final long disabledUncheckedIconColor;
    private final long disabledUncheckedThumbColor;
    private final long disabledUncheckedTrackColor;
    private final long uncheckedBorderColor;
    private final long uncheckedIconColor;
    private final long uncheckedThumbColor;
    private final long uncheckedTrackColor;

    public /* synthetic */ SwitchColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16);
    }

    @Composable
    public final State<Color> borderColor$material3_release(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(462653665);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(462653665, i, -1, "androidx.compose.material3.SwitchColors.borderColor (Switch.kt:402)");
        }
        if (z) {
            if (z2) {
                j = this.checkedBorderColor;
            } else {
                j = this.uncheckedBorderColor;
            }
        } else if (z2) {
            j = this.disabledCheckedBorderColor;
        } else {
            j = this.disabledUncheckedBorderColor;
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
        if (obj == null || !(obj instanceof SwitchColors)) {
            return false;
        }
        SwitchColors switchColors = (SwitchColors) obj;
        if (Color.m35672equalsimpl0(this.checkedThumbColor, switchColors.checkedThumbColor) && Color.m35672equalsimpl0(this.checkedTrackColor, switchColors.checkedTrackColor) && Color.m35672equalsimpl0(this.checkedBorderColor, switchColors.checkedBorderColor) && Color.m35672equalsimpl0(this.checkedIconColor, switchColors.checkedIconColor) && Color.m35672equalsimpl0(this.uncheckedThumbColor, switchColors.uncheckedThumbColor) && Color.m35672equalsimpl0(this.uncheckedTrackColor, switchColors.uncheckedTrackColor) && Color.m35672equalsimpl0(this.uncheckedBorderColor, switchColors.uncheckedBorderColor) && Color.m35672equalsimpl0(this.uncheckedIconColor, switchColors.uncheckedIconColor) && Color.m35672equalsimpl0(this.disabledCheckedThumbColor, switchColors.disabledCheckedThumbColor) && Color.m35672equalsimpl0(this.disabledCheckedTrackColor, switchColors.disabledCheckedTrackColor) && Color.m35672equalsimpl0(this.disabledCheckedBorderColor, switchColors.disabledCheckedBorderColor) && Color.m35672equalsimpl0(this.disabledCheckedIconColor, switchColors.disabledCheckedIconColor) && Color.m35672equalsimpl0(this.disabledUncheckedThumbColor, switchColors.disabledUncheckedThumbColor) && Color.m35672equalsimpl0(this.disabledUncheckedTrackColor, switchColors.disabledUncheckedTrackColor) && Color.m35672equalsimpl0(this.disabledUncheckedBorderColor, switchColors.disabledUncheckedBorderColor) && Color.m35672equalsimpl0(this.disabledUncheckedIconColor, switchColors.disabledUncheckedIconColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Color.m35678hashCodeimpl(this.checkedThumbColor) * 31) + Color.m35678hashCodeimpl(this.checkedTrackColor)) * 31) + Color.m35678hashCodeimpl(this.checkedBorderColor)) * 31) + Color.m35678hashCodeimpl(this.checkedIconColor)) * 31) + Color.m35678hashCodeimpl(this.uncheckedThumbColor)) * 31) + Color.m35678hashCodeimpl(this.uncheckedTrackColor)) * 31) + Color.m35678hashCodeimpl(this.uncheckedBorderColor)) * 31) + Color.m35678hashCodeimpl(this.uncheckedIconColor)) * 31) + Color.m35678hashCodeimpl(this.disabledCheckedThumbColor)) * 31) + Color.m35678hashCodeimpl(this.disabledCheckedTrackColor)) * 31) + Color.m35678hashCodeimpl(this.disabledCheckedBorderColor)) * 31) + Color.m35678hashCodeimpl(this.disabledCheckedIconColor)) * 31) + Color.m35678hashCodeimpl(this.disabledUncheckedThumbColor)) * 31) + Color.m35678hashCodeimpl(this.disabledUncheckedTrackColor)) * 31) + Color.m35678hashCodeimpl(this.disabledUncheckedBorderColor)) * 31) + Color.m35678hashCodeimpl(this.disabledUncheckedIconColor);
    }

    @Composable
    public final State<Color> iconColor$material3_release(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-153383122);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-153383122, i, -1, "androidx.compose.material3.SwitchColors.iconColor (Switch.kt:419)");
        }
        if (z) {
            if (z2) {
                j = this.checkedIconColor;
            } else {
                j = this.uncheckedIconColor;
            }
        } else if (z2) {
            j = this.disabledCheckedIconColor;
        } else {
            j = this.disabledUncheckedIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> thumbColor$material3_release(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1539933265);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1539933265, i, -1, "androidx.compose.material3.SwitchColors.thumbColor (Switch.kt:368)");
        }
        if (z) {
            if (z2) {
                j = this.checkedThumbColor;
            } else {
                j = this.uncheckedThumbColor;
            }
        } else if (z2) {
            j = this.disabledCheckedThumbColor;
        } else {
            j = this.disabledUncheckedThumbColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> trackColor$material3_release(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(961511844);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(961511844, i, -1, "androidx.compose.material3.SwitchColors.trackColor (Switch.kt:385)");
        }
        if (z) {
            if (z2) {
                j = this.checkedTrackColor;
            } else {
                j = this.uncheckedTrackColor;
            }
        } else if (z2) {
            j = this.disabledCheckedTrackColor;
        } else {
            j = this.disabledUncheckedTrackColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    private SwitchColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.checkedThumbColor = j;
        this.checkedTrackColor = j2;
        this.checkedBorderColor = j3;
        this.checkedIconColor = j4;
        this.uncheckedThumbColor = j5;
        this.uncheckedTrackColor = j6;
        this.uncheckedBorderColor = j7;
        this.uncheckedIconColor = j8;
        this.disabledCheckedThumbColor = j9;
        this.disabledCheckedTrackColor = j10;
        this.disabledCheckedBorderColor = j11;
        this.disabledCheckedIconColor = j12;
        this.disabledUncheckedThumbColor = j13;
        this.disabledUncheckedTrackColor = j14;
        this.disabledUncheckedBorderColor = j15;
        this.disabledUncheckedIconColor = j16;
    }
}
