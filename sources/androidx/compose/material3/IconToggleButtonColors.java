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
/* compiled from: IconButton.kt */
public final class IconToggleButtonColors {
    private final long checkedContainerColor;
    private final long checkedContentColor;
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    public /* synthetic */ IconToggleButtonColors(long j, long j2, long j3, long j4, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6);
    }

    @Composable
    public final State<Color> containerColor$material3_release(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1175394478);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1175394478, i, -1, "androidx.compose.material3.IconToggleButtonColors.containerColor (IconButton.kt:886)");
        }
        if (!z) {
            j = this.disabledContainerColor;
        } else if (!z2) {
            j = this.containerColor;
        } else {
            j = this.checkedContainerColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m35661boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> contentColor$material3_release(boolean z, boolean z2, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1340854054);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1340854054, i, -1, "androidx.compose.material3.IconToggleButtonColors.contentColor (IconButton.kt:902)");
        }
        if (!z) {
            j = this.disabledContentColor;
        } else if (!z2) {
            j = this.contentColor;
        } else {
            j = this.checkedContentColor;
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
        if (obj == null || !(obj instanceof IconToggleButtonColors)) {
            return false;
        }
        IconToggleButtonColors iconToggleButtonColors = (IconToggleButtonColors) obj;
        if (Color.m35672equalsimpl0(this.containerColor, iconToggleButtonColors.containerColor) && Color.m35672equalsimpl0(this.contentColor, iconToggleButtonColors.contentColor) && Color.m35672equalsimpl0(this.disabledContainerColor, iconToggleButtonColors.disabledContainerColor) && Color.m35672equalsimpl0(this.disabledContentColor, iconToggleButtonColors.disabledContentColor) && Color.m35672equalsimpl0(this.checkedContainerColor, iconToggleButtonColors.checkedContainerColor) && Color.m35672equalsimpl0(this.checkedContentColor, iconToggleButtonColors.checkedContentColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((Color.m35678hashCodeimpl(this.containerColor) * 31) + Color.m35678hashCodeimpl(this.contentColor)) * 31) + Color.m35678hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m35678hashCodeimpl(this.disabledContentColor)) * 31) + Color.m35678hashCodeimpl(this.checkedContainerColor)) * 31) + Color.m35678hashCodeimpl(this.checkedContentColor);
    }

    private IconToggleButtonColors(long j, long j2, long j3, long j4, long j5, long j6) {
        this.containerColor = j;
        this.contentColor = j2;
        this.disabledContainerColor = j3;
        this.disabledContentColor = j4;
        this.checkedContainerColor = j5;
        this.checkedContentColor = j6;
    }
}
