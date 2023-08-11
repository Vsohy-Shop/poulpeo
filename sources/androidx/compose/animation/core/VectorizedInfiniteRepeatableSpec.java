package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.location.LocationRequestCompat;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: VectorizedAnimationSpec.kt */
public final class VectorizedInfiniteRepeatableSpec<V extends AnimationVector> implements VectorizedAnimationSpec<V> {
    public static final int $stable = 8;
    private final VectorizedDurationBasedAnimationSpec<V> animation;
    private final long durationNanos;
    private final long initialOffsetNanos;
    private final RepeatMode repeatMode;

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(vectorizedDurationBasedAnimationSpec, repeatMode2, j);
    }

    private final long repetitionPlayTimeNanos(long j) {
        long j2 = this.initialOffsetNanos;
        if (j + j2 <= 0) {
            return 0;
        }
        long j3 = j + j2;
        long j4 = this.durationNanos;
        long j5 = j3 / j4;
        if (this.repeatMode == RepeatMode.Restart || j5 % ((long) 2) == 0) {
            return j3 - (j5 * j4);
        }
        return ((j5 + 1) * j4) - j3;
    }

    private final V repetitionStartVelocity(long j, V v, V v2, V v3) {
        long j2 = this.initialOffsetNanos;
        long j3 = this.durationNanos;
        if (j + j2 <= j3) {
            return v2;
        }
        return getVelocityFromNanos(j3 - j2, v, v2, v3);
    }

    public long getDurationNanos(V v, V v2, V v3) {
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "targetValue");
        C12775o.m28639i(v3, "initialVelocity");
        return LocationRequestCompat.PASSIVE_INTERVAL;
    }

    public final long getDurationNanos$animation_core_release() {
        return this.durationNanos;
    }

    public V getValueFromNanos(long j, V v, V v2, V v3) {
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "targetValue");
        C12775o.m28639i(v3, "initialVelocity");
        return this.animation.getValueFromNanos(repetitionPlayTimeNanos(j), v, v2, repetitionStartVelocity(j, v, v3, v2));
    }

    public V getVelocityFromNanos(long j, V v, V v2, V v3) {
        C12775o.m28639i(v, "initialValue");
        C12775o.m28639i(v2, "targetValue");
        C12775o.m28639i(v3, "initialVelocity");
        return this.animation.getVelocityFromNanos(repetitionPlayTimeNanos(j), v, v2, repetitionStartVelocity(j, v, v3, v2));
    }

    public boolean isInfinite() {
        return true;
    }

    private VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode2, long j) {
        this.animation = vectorizedDurationBasedAnimationSpec;
        this.repeatMode = repeatMode2;
        this.durationNanos = ((long) (vectorizedDurationBasedAnimationSpec.getDelayMillis() + vectorizedDurationBasedAnimationSpec.getDurationMillis())) * AnimationKt.MillisToNanos;
        this.initialOffsetNanos = j * AnimationKt.MillisToNanos;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(vectorizedDurationBasedAnimationSpec, (i & 2) != 0 ? RepeatMode.Restart : repeatMode2, (i & 4) != 0 ? StartOffset.m32917constructorimpl$default(0, 0, 2, (DefaultConstructorMarker) null) : j, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(vectorizedDurationBasedAnimationSpec, (i & 2) != 0 ? RepeatMode.Restart : repeatMode2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode2) {
        this(vectorizedDurationBasedAnimationSpec, repeatMode2, StartOffset.m32917constructorimpl$default(0, 0, 2, (DefaultConstructorMarker) null), (DefaultConstructorMarker) null);
        C12775o.m28639i(vectorizedDurationBasedAnimationSpec, "animation");
        C12775o.m28639i(repeatMode2, "repeatMode");
    }
}
