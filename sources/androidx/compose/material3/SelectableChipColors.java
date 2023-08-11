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
@ExperimentalMaterial3Api
/* compiled from: Chip.kt */
public final class SelectableChipColors {
    private final long containerColor;
    private final long disabledContainerColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledSelectedContainerColor;
    private final long disabledTrailingIconColor;
    private final long labelColor;
    private final long leadingIconColor;
    private final long selectedContainerColor;
    private final long selectedLabelColor;
    private final long selectedLeadingIconColor;
    private final long selectedTrailingIconColor;
    private final long trailingIconColor;

    public /* synthetic */ SelectableChipColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13);
    }

    @Composable
    public final State<Color> containerColor$material3_release(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-2126903408);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2126903408, i, -1, "androidx.compose.material3.SelectableChipColors.containerColor (Chip.kt:1884)");
        }
        if (!z) {
            if (z2) {
                j = this.disabledSelectedContainerColor;
            } else {
                j = this.disabledContainerColor;
            }
        } else if (!z2) {
            j = this.containerColor;
        } else {
            j = this.selectedContainerColor;
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
        if (obj == null || !(obj instanceof SelectableChipColors)) {
            return false;
        }
        SelectableChipColors selectableChipColors = (SelectableChipColors) obj;
        if (Color.m35672equalsimpl0(this.containerColor, selectableChipColors.containerColor) && Color.m35672equalsimpl0(this.labelColor, selectableChipColors.labelColor) && Color.m35672equalsimpl0(this.leadingIconColor, selectableChipColors.leadingIconColor) && Color.m35672equalsimpl0(this.trailingIconColor, selectableChipColors.trailingIconColor) && Color.m35672equalsimpl0(this.disabledContainerColor, selectableChipColors.disabledContainerColor) && Color.m35672equalsimpl0(this.disabledLabelColor, selectableChipColors.disabledLabelColor) && Color.m35672equalsimpl0(this.disabledLeadingIconColor, selectableChipColors.disabledLeadingIconColor) && Color.m35672equalsimpl0(this.disabledTrailingIconColor, selectableChipColors.disabledTrailingIconColor) && Color.m35672equalsimpl0(this.selectedContainerColor, selectableChipColors.selectedContainerColor) && Color.m35672equalsimpl0(this.disabledSelectedContainerColor, selectableChipColors.disabledSelectedContainerColor) && Color.m35672equalsimpl0(this.selectedLabelColor, selectableChipColors.selectedLabelColor) && Color.m35672equalsimpl0(this.selectedLeadingIconColor, selectableChipColors.selectedLeadingIconColor) && Color.m35672equalsimpl0(this.selectedTrailingIconColor, selectableChipColors.selectedTrailingIconColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((Color.m35678hashCodeimpl(this.containerColor) * 31) + Color.m35678hashCodeimpl(this.labelColor)) * 31) + Color.m35678hashCodeimpl(this.leadingIconColor)) * 31) + Color.m35678hashCodeimpl(this.trailingIconColor)) * 31) + Color.m35678hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m35678hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m35678hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m35678hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m35678hashCodeimpl(this.selectedContainerColor)) * 31) + Color.m35678hashCodeimpl(this.disabledSelectedContainerColor)) * 31) + Color.m35678hashCodeimpl(this.selectedLabelColor)) * 31) + Color.m35678hashCodeimpl(this.selectedLeadingIconColor)) * 31) + Color.m35678hashCodeimpl(this.selectedTrailingIconColor);
    }

    @Composable
    public final State<Color> labelColor$material3_release(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-829231549);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-829231549, i, -1, "androidx.compose.material3.SelectableChipColors.labelColor (Chip.kt:1900)");
        }
        if (!z) {
            j = this.disabledLabelColor;
        } else if (!z2) {
            j = this.labelColor;
        } else {
            j = this.selectedLabelColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> leadingIconContentColor$material3_release(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1112029563);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1112029563, i, -1, "androidx.compose.material3.SelectableChipColors.leadingIconContentColor (Chip.kt:1916)");
        }
        if (!z) {
            j = this.disabledLeadingIconColor;
        } else if (!z2) {
            j = this.leadingIconColor;
        } else {
            j = this.selectedLeadingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> trailingIconContentColor$material3_release(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(963620819);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(963620819, i, -1, "androidx.compose.material3.SelectableChipColors.trailingIconContentColor (Chip.kt:1932)");
        }
        if (!z) {
            j = this.disabledTrailingIconColor;
        } else if (!z2) {
            j = this.trailingIconColor;
        } else {
            j = this.selectedTrailingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    private SelectableChipColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.containerColor = j;
        this.labelColor = j2;
        this.leadingIconColor = j3;
        this.trailingIconColor = j4;
        this.disabledContainerColor = j5;
        this.disabledLabelColor = j6;
        this.disabledLeadingIconColor = j7;
        this.disabledTrailingIconColor = j8;
        this.selectedContainerColor = j9;
        this.disabledSelectedContainerColor = j10;
        this.selectedLabelColor = j11;
        this.selectedLeadingIconColor = j12;
        this.selectedTrailingIconColor = j13;
    }
}
