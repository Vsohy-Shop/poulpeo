package androidx.compose.material;

import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ExperimentalMaterialApi
@Immutable
/* compiled from: Swipeable.kt */
public final class FixedThreshold implements ThresholdConfig {
    public static final int $stable = 0;
    private final float offset;

    public /* synthetic */ FixedThreshold(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    /* renamed from: component1-D9Ej5fM  reason: not valid java name */
    private final float m34026component1D9Ej5fM() {
        return this.offset;
    }

    /* renamed from: copy-0680j_4$default  reason: not valid java name */
    public static /* synthetic */ FixedThreshold m34027copy0680j_4$default(FixedThreshold fixedThreshold, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = fixedThreshold.offset;
        }
        return fixedThreshold.m34028copy0680j_4(f);
    }

    public float computeThreshold(Density density, float f, float f2) {
        C12775o.m28639i(density, "<this>");
        return f + (density.m38449toPx0680j_4(this.offset) * Math.signum(f2 - f));
    }

    /* renamed from: copy-0680j_4  reason: not valid java name */
    public final FixedThreshold m34028copy0680j_4(float f) {
        return new FixedThreshold(f, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FixedThreshold) && C1232Dp.m38473equalsimpl0(this.offset, ((FixedThreshold) obj).offset)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C1232Dp.m38474hashCodeimpl(this.offset);
    }

    public String toString() {
        return "FixedThreshold(offset=" + C1232Dp.m38479toStringimpl(this.offset) + ')';
    }

    private FixedThreshold(float f) {
        this.offset = f;
    }
}
