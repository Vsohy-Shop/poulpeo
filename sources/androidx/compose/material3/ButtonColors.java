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
/* compiled from: Button.kt */
public final class ButtonColors {
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    public /* synthetic */ ButtonColors(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }

    @Composable
    public final State<Color> containerColor$material3_release(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-754887434);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-754887434, i, -1, "androidx.compose.material3.ButtonColors.containerColor (Button.kt:917)");
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

    @Composable
    public final State<Color> contentColor$material3_release(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-360303250);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-360303250, i, -1, "androidx.compose.material3.ButtonColors.contentColor (Button.kt:927)");
        }
        if (z) {
            j = this.contentColor;
        } else {
            j = this.disabledContentColor;
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
        if (obj == null || !(obj instanceof ButtonColors)) {
            return false;
        }
        ButtonColors buttonColors = (ButtonColors) obj;
        if (Color.m35672equalsimpl0(this.containerColor, buttonColors.containerColor) && Color.m35672equalsimpl0(this.contentColor, buttonColors.contentColor) && Color.m35672equalsimpl0(this.disabledContainerColor, buttonColors.disabledContainerColor) && Color.m35672equalsimpl0(this.disabledContentColor, buttonColors.disabledContentColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((Color.m35678hashCodeimpl(this.containerColor) * 31) + Color.m35678hashCodeimpl(this.contentColor)) * 31) + Color.m35678hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m35678hashCodeimpl(this.disabledContentColor);
    }

    private ButtonColors(long j, long j2, long j3, long j4) {
        this.containerColor = j;
        this.contentColor = j2;
        this.disabledContainerColor = j3;
        this.disabledContentColor = j4;
    }
}
