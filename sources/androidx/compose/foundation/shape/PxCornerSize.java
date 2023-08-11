package androidx.compose.foundation.shape;

import androidx.compose.p002ui.platform.InspectableValue;
import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.internal.C12775o;

/* compiled from: CornerSize.kt */
final class PxCornerSize implements CornerSize, InspectableValue {
    private final float size;

    public PxCornerSize(float f) {
        this.size = f;
    }

    private final float component1() {
        return this.size;
    }

    public static /* synthetic */ PxCornerSize copy$default(PxCornerSize pxCornerSize, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = pxCornerSize.size;
        }
        return pxCornerSize.copy(f);
    }

    public final PxCornerSize copy(float f) {
        return new PxCornerSize(f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PxCornerSize) && Float.compare(this.size, ((PxCornerSize) obj).size) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.hashCode(this.size);
    }

    /* renamed from: toPx-TmRCtEA  reason: not valid java name */
    public float m33624toPxTmRCtEA(long j, Density density) {
        C12775o.m28639i(density, "density");
        return this.size;
    }

    public String toString() {
        return "CornerSize(size = " + this.size + ".px)";
    }

    public String getValueOverride() {
        return this.size + "px";
    }
}
