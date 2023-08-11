package androidx.compose.foundation.shape;

import androidx.compose.p002ui.platform.InspectableValue;
import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.internal.C12775o;

/* compiled from: CornerSize.kt */
public final class CornerSizeKt$ZeroCornerSize$1 implements CornerSize, InspectableValue {
    CornerSizeKt$ZeroCornerSize$1() {
    }

    public String getValueOverride() {
        return "ZeroCornerSize";
    }

    /* renamed from: toPx-TmRCtEA  reason: not valid java name */
    public float m33612toPxTmRCtEA(long j, Density density) {
        C12775o.m28639i(density, "density");
        return 0.0f;
    }

    public String toString() {
        return "ZeroCornerSize";
    }
}
