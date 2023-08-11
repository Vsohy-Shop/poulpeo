package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: VectorizedAnimationSpec.kt */
public final class VectorizedSnapSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 0;
    private final int delayMillis;

    public VectorizedSnapSpec() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public int getDelayMillis() {
        return this.delayMillis;
    }

    public int getDurationMillis() {
        return 0;
    }

    public V getValueFromNanos(long j, V v, V v2, V v3) {
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "targetValue");
        C12775o.m28639i(v3, "initialVelocity");
        if (j < ((long) getDelayMillis()) * AnimationKt.MillisToNanos) {
            return v;
        }
        return v2;
    }

    public V getVelocityFromNanos(long j, V v, V v2, V v3) {
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "targetValue");
        C12775o.m28639i(v3, "initialVelocity");
        return v3;
    }

    public VectorizedSnapSpec(int i) {
        this.delayMillis = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VectorizedSnapSpec(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
