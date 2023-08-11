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
public final class ChipBorder {
    private final long borderColor;
    private final float borderWidth;
    private final long disabledBorderColor;

    public /* synthetic */ ChipBorder(long j, long j2, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, f);
    }

    @Composable
    public final State<BorderStroke> borderStroke$material3_release(boolean z, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1899621712);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899621712, i, -1, "androidx.compose.material3.ChipBorder.borderStroke (Chip.kt:2055)");
        }
        float f = this.borderWidth;
        if (z) {
            j = this.borderColor;
        } else {
            j = this.disabledBorderColor;
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
        if (obj == null || !(obj instanceof ChipBorder)) {
            return false;
        }
        ChipBorder chipBorder = (ChipBorder) obj;
        if (Color.m35672equalsimpl0(this.borderColor, chipBorder.borderColor) && Color.m35672equalsimpl0(this.disabledBorderColor, chipBorder.disabledBorderColor) && C1232Dp.m38473equalsimpl0(this.borderWidth, chipBorder.borderWidth)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Color.m35678hashCodeimpl(this.borderColor) * 31) + Color.m35678hashCodeimpl(this.disabledBorderColor)) * 31) + C1232Dp.m38474hashCodeimpl(this.borderWidth);
    }

    private ChipBorder(long j, long j2, float f) {
        this.borderColor = j;
        this.disabledBorderColor = j2;
        this.borderWidth = f;
    }
}
