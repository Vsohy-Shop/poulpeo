package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.Stable;
import java.util.Arrays;
import kotlin.jvm.internal.C12775o;

@ExperimentalMaterial3Api
@Stable
/* compiled from: Slider.kt */
public final class SliderPositions {
    private final MutableState positionFraction$delegate;
    private final MutableState tickFractions$delegate;

    public SliderPositions(float f, float[] fArr) {
        C12775o.m28639i(fArr, "initialTickFractions");
        this.positionFraction$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.tickFractions$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fArr, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SliderPositions)) {
            return false;
        }
        SliderPositions sliderPositions = (SliderPositions) obj;
        if (getPositionFraction() == sliderPositions.getPositionFraction()) {
            z = true;
        } else {
            z = false;
        }
        if (z && Arrays.equals(getTickFractions(), sliderPositions.getTickFractions())) {
            return true;
        }
        return false;
    }

    public final float getPositionFraction() {
        return ((Number) this.positionFraction$delegate.getValue()).floatValue();
    }

    public final float[] getTickFractions() {
        return (float[]) this.tickFractions$delegate.getValue();
    }

    public int hashCode() {
        return (Float.hashCode(getPositionFraction()) * 31) + Arrays.hashCode(getTickFractions());
    }

    public final void setPositionFraction$material3_release(float f) {
        this.positionFraction$delegate.setValue(Float.valueOf(f));
    }

    public final void setTickFractions$material3_release(float[] fArr) {
        C12775o.m28639i(fArr, "<set-?>");
        this.tickFractions$delegate.setValue(fArr);
    }
}
