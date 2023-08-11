package androidx.compose.material3;

import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.util.MathHelpersKt;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;

@Immutable
@ExperimentalMaterial3Api
/* compiled from: Swipeable.kt */
public final class FractionalThreshold implements ThresholdConfig {
    private final float fraction;

    public FractionalThreshold(float f) {
        this.fraction = f;
    }

    private final float component1() {
        return this.fraction;
    }

    public static /* synthetic */ FractionalThreshold copy$default(FractionalThreshold fractionalThreshold, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = fractionalThreshold.fraction;
        }
        return fractionalThreshold.copy(f);
    }

    public float computeThreshold(Density density, float f, float f2) {
        C12775o.m28639i(density, "<this>");
        return MathHelpersKt.lerp(f, f2, this.fraction);
    }

    public final FractionalThreshold copy(float f) {
        return new FractionalThreshold(f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FractionalThreshold) && C12775o.m28634d(Float.valueOf(this.fraction), Float.valueOf(((FractionalThreshold) obj).fraction))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.hashCode(this.fraction);
    }

    public String toString() {
        return "FractionalThreshold(fraction=" + this.fraction + ')';
    }
}
