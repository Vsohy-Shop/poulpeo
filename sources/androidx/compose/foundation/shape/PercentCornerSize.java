package androidx.compose.foundation.shape;

import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.platform.InspectableValue;
import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.internal.C12775o;

/* compiled from: CornerSize.kt */
final class PercentCornerSize implements CornerSize, InspectableValue {
    private final float percent;

    public PercentCornerSize(float f) {
        this.percent = f;
        if (f < 0.0f || f > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    private final float component1() {
        return this.percent;
    }

    public static /* synthetic */ PercentCornerSize copy$default(PercentCornerSize percentCornerSize, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = percentCornerSize.percent;
        }
        return percentCornerSize.copy(f);
    }

    public final PercentCornerSize copy(float f) {
        return new PercentCornerSize(f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PercentCornerSize) && Float.compare(this.percent, ((PercentCornerSize) obj).percent) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.hashCode(this.percent);
    }

    /* renamed from: toPx-TmRCtEA  reason: not valid java name */
    public float m33623toPxTmRCtEA(long j, Density density) {
        C12775o.m28639i(density, "density");
        return Size.m35490getMinDimensionimpl(j) * (this.percent / 100.0f);
    }

    public String toString() {
        return "CornerSize(size = " + this.percent + "%)";
    }

    public String getValueOverride() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.percent);
        sb.append('%');
        return sb.toString();
    }
}
