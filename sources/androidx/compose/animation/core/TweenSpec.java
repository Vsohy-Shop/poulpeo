package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* compiled from: AnimationSpec.kt */
public final class TweenSpec<T> implements DurationBasedAnimationSpec<T> {
    private final int delay;
    private final int durationMillis;
    private final Easing easing;

    public TweenSpec() {
        this(0, 0, (Easing) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TweenSpec)) {
            return false;
        }
        TweenSpec tweenSpec = (TweenSpec) obj;
        if (tweenSpec.durationMillis == this.durationMillis && tweenSpec.delay == this.delay && C12775o.m28634d(tweenSpec.easing, this.easing)) {
            return true;
        }
        return false;
    }

    public final int getDelay() {
        return this.delay;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final Easing getEasing() {
        return this.easing;
    }

    public int hashCode() {
        return (((this.durationMillis * 31) + this.easing.hashCode()) * 31) + this.delay;
    }

    public TweenSpec(int i, int i2, Easing easing2) {
        C12775o.m28639i(easing2, "easing");
        this.durationMillis = i;
        this.delay = i2;
        this.easing = easing2;
    }

    public <V extends AnimationVector> VectorizedTweenSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        C12775o.m28639i(twoWayConverter, "converter");
        return new VectorizedTweenSpec<>(this.durationMillis, this.delay, this.easing);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TweenSpec(int i, int i2, Easing easing2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? AnimationConstants.DefaultDurationMillis : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? EasingKt.getFastOutSlowInEasing() : easing2);
    }
}
