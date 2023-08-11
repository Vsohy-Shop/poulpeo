package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.unit.C1232Dp;
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
public final class SelectableChipBorder {
    private final long borderColor;
    private final float borderWidth;
    private final long disabledBorderColor;
    private final long disabledSelectedBorderColor;
    private final long selectedBorderColor;
    private final float selectedBorderWidth;

    public /* synthetic */ SelectableChipBorder(long j, long j2, long j3, long j4, float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, f, f2);
    }

    @Composable
    public final State<BorderStroke> borderStroke$material3_release(boolean z, boolean z2, Composer composer, int i) {
        long j;
        float f;
        composer.startReplaceableGroup(670222826);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(670222826, i, -1, "androidx.compose.material3.SelectableChipBorder.borderStroke (Chip.kt:2002)");
        }
        if (z) {
            if (z2) {
                j = this.selectedBorderColor;
            } else {
                j = this.borderColor;
            }
        } else if (z2) {
            j = this.disabledSelectedBorderColor;
        } else {
            j = this.disabledBorderColor;
        }
        if (z2) {
            f = this.selectedBorderWidth;
        } else {
            f = this.borderWidth;
        }
        State<BorderStroke> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(BorderStrokeKt.m32976BorderStrokecXLIe8U(f, j), composer, 0);
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
        if (obj == null || !(obj instanceof SelectableChipBorder)) {
            return false;
        }
        SelectableChipBorder selectableChipBorder = (SelectableChipBorder) obj;
        if (Color.m35672equalsimpl0(this.borderColor, selectableChipBorder.borderColor) && Color.m35672equalsimpl0(this.selectedBorderColor, selectableChipBorder.selectedBorderColor) && Color.m35672equalsimpl0(this.disabledBorderColor, selectableChipBorder.disabledBorderColor) && Color.m35672equalsimpl0(this.disabledSelectedBorderColor, selectableChipBorder.disabledSelectedBorderColor) && C1232Dp.m38473equalsimpl0(this.borderWidth, selectableChipBorder.borderWidth) && C1232Dp.m38473equalsimpl0(this.selectedBorderWidth, selectableChipBorder.selectedBorderWidth)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((Color.m35678hashCodeimpl(this.borderColor) * 31) + Color.m35678hashCodeimpl(this.selectedBorderColor)) * 31) + Color.m35678hashCodeimpl(this.disabledBorderColor)) * 31) + Color.m35678hashCodeimpl(this.disabledSelectedBorderColor)) * 31) + C1232Dp.m38474hashCodeimpl(this.borderWidth)) * 31) + C1232Dp.m38474hashCodeimpl(this.selectedBorderWidth);
    }

    private SelectableChipBorder(long j, long j2, long j3, long j4, float f, float f2) {
        this.borderColor = j;
        this.selectedBorderColor = j2;
        this.disabledBorderColor = j3;
        this.disabledSelectedBorderColor = j4;
        this.borderWidth = f;
        this.selectedBorderWidth = f2;
    }
}
