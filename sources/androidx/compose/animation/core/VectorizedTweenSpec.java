package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: VectorizedAnimationSpec.kt */
public final class VectorizedTweenSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private final VectorizedFloatAnimationSpec<V> anim;
    private final int delayMillis;
    private final int durationMillis;
    private final Easing easing;

    public VectorizedTweenSpec() {
        this(0, 0, (Easing) null, 7, (DefaultConstructorMarker) null);
    }

    public int getDelayMillis() {
        return this.delayMillis;
    }

    public int getDurationMillis() {
        return this.durationMillis;
    }

    public final Easing getEasing() {
        return this.easing;
    }

    public V getValueFromNanos(long j, V v, V v2, V v3) {
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "targetValue");
        C12775o.m28639i(v3, "initialVelocity");
        return this.anim.getValueFromNanos(j, v, v2, v3);
    }

    public V getVelocityFromNanos(long j, V v, V v2, V v3) {
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "targetValue");
        C12775o.m28639i(v3, "initialVelocity");
        return this.anim.getVelocityFromNanos(j, v, v2, v3);
    }

    public VectorizedTweenSpec(int i, int i2, Easing easing2) {
        C12775o.m28639i(easing2, "easing");
        this.durationMillis = i;
        this.delayMillis = i2;
        this.easing = easing2;
        this.anim = new VectorizedFloatAnimationSpec<>((FloatAnimationSpec) new FloatTweenSpec(getDurationMillis(), getDelayMillis(), easing2));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VectorizedTweenSpec(int i, int i2, Easing easing2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? AnimationConstants.DefaultDurationMillis : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? EasingKt.getFastOutSlowInEasing() : easing2);
    }
}
