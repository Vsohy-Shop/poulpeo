package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: AnimationSpec.kt */
public final class InfiniteRepeatableSpec<T> implements AnimationSpec<T> {
    public static final int $stable = 8;
    private final DurationBasedAnimationSpec<T> animation;
    private final long initialStartOffset;
    private final RepeatMode repeatMode;

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(durationBasedAnimationSpec, repeatMode2, j);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InfiniteRepeatableSpec)) {
            return false;
        }
        InfiniteRepeatableSpec infiniteRepeatableSpec = (InfiniteRepeatableSpec) obj;
        if (!C12775o.m28634d(infiniteRepeatableSpec.animation, this.animation) || infiniteRepeatableSpec.repeatMode != this.repeatMode || !StartOffset.m32919equalsimpl0(infiniteRepeatableSpec.initialStartOffset, this.initialStartOffset)) {
            return false;
        }
        return true;
    }

    public final DurationBasedAnimationSpec<T> getAnimation() {
        return this.animation;
    }

    /* renamed from: getInitialStartOffset-Rmkjzm4  reason: not valid java name */
    public final long m32899getInitialStartOffsetRmkjzm4() {
        return this.initialStartOffset;
    }

    public final RepeatMode getRepeatMode() {
        return this.repeatMode;
    }

    public int hashCode() {
        return (((this.animation.hashCode() * 31) + this.repeatMode.hashCode()) * 31) + StartOffset.m32922hashCodeimpl(this.initialStartOffset);
    }

    public <V extends AnimationVector> VectorizedAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        C12775o.m28639i(twoWayConverter, "converter");
        return new VectorizedInfiniteRepeatableSpec((VectorizedDurationBasedAnimationSpec) this.animation.vectorize(twoWayConverter), this.repeatMode, this.initialStartOffset, (DefaultConstructorMarker) null);
    }

    private InfiniteRepeatableSpec(DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode2, long j) {
        this.animation = durationBasedAnimationSpec;
        this.repeatMode = repeatMode2;
        this.initialStartOffset = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(durationBasedAnimationSpec, (i & 2) != 0 ? RepeatMode.Restart : repeatMode2, (i & 4) != 0 ? StartOffset.m32917constructorimpl$default(0, 0, 2, (DefaultConstructorMarker) null) : j, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(durationBasedAnimationSpec, (i & 2) != 0 ? RepeatMode.Restart : repeatMode2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode2) {
        this(durationBasedAnimationSpec, repeatMode2, StartOffset.m32917constructorimpl$default(0, 0, 2, (DefaultConstructorMarker) null), (DefaultConstructorMarker) null);
        C12775o.m28639i(durationBasedAnimationSpec, "animation");
        C12775o.m28639i(repeatMode2, "repeatMode");
    }
}
