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
public final class ChipColors {
    private final long containerColor;
    private final long disabledContainerColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconContentColor;
    private final long disabledTrailingIconContentColor;
    private final long labelColor;
    private final long leadingIconContentColor;
    private final long trailingIconContentColor;

    public /* synthetic */ ChipColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8);
    }

    @Composable
    public final State<Color> containerColor$material3_release(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-136683658);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-136683658, i, -1, "androidx.compose.material3.ChipColors.containerColor (Chip.kt:1785)");
        }
        if (z) {
            j = this.containerColor;
        } else {
            j = this.disabledContainerColor;
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
        if (obj == null || !(obj instanceof ChipColors)) {
            return false;
        }
        ChipColors chipColors = (ChipColors) obj;
        if (Color.m35672equalsimpl0(this.containerColor, chipColors.containerColor) && Color.m35672equalsimpl0(this.labelColor, chipColors.labelColor) && Color.m35672equalsimpl0(this.leadingIconContentColor, chipColors.leadingIconContentColor) && Color.m35672equalsimpl0(this.trailingIconContentColor, chipColors.trailingIconContentColor) && Color.m35672equalsimpl0(this.disabledContainerColor, chipColors.disabledContainerColor) && Color.m35672equalsimpl0(this.disabledLabelColor, chipColors.disabledLabelColor) && Color.m35672equalsimpl0(this.disabledLeadingIconContentColor, chipColors.disabledLeadingIconContentColor) && Color.m35672equalsimpl0(this.disabledTrailingIconContentColor, chipColors.disabledTrailingIconContentColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((Color.m35678hashCodeimpl(this.containerColor) * 31) + Color.m35678hashCodeimpl(this.labelColor)) * 31) + Color.m35678hashCodeimpl(this.leadingIconContentColor)) * 31) + Color.m35678hashCodeimpl(this.trailingIconContentColor)) * 31) + Color.m35678hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m35678hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m35678hashCodeimpl(this.disabledLeadingIconContentColor)) * 31) + Color.m35678hashCodeimpl(this.disabledTrailingIconContentColor);
    }

    @Composable
    public final State<Color> labelColor$material3_release(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(559848681);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(559848681, i, -1, "androidx.compose.material3.ChipColors.labelColor (Chip.kt:1795)");
        }
        if (z) {
            j = this.labelColor;
        } else {
            j = this.disabledLabelColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> leadingIconContentColor$material3_release(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(5136811);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(5136811, i, -1, "androidx.compose.material3.ChipColors.leadingIconContentColor (Chip.kt:1805)");
        }
        if (z) {
            j = this.leadingIconContentColor;
        } else {
            j = this.disabledLeadingIconContentColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> trailingIconContentColor$material3_release(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(96182905);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(96182905, i, -1, "androidx.compose.material3.ChipColors.trailingIconContentColor (Chip.kt:1817)");
        }
        if (z) {
            j = this.trailingIconContentColor;
        } else {
            j = this.disabledTrailingIconContentColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    private ChipColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.containerColor = j;
        this.labelColor = j2;
        this.leadingIconContentColor = j3;
        this.trailingIconContentColor = j4;
        this.disabledContainerColor = j5;
        this.disabledLabelColor = j6;
        this.disabledLeadingIconContentColor = j7;
        this.disabledTrailingIconContentColor = j8;
    }
}
