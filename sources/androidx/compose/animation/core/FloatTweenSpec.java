package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: FloatAnimationSpec.kt */
public final class FloatTweenSpec implements FloatAnimationSpec {
    public static final int $stable = 0;
    private final int delay;
    private final int duration;
    private final Easing easing;

    public FloatTweenSpec() {
        this(0, 0, (Easing) null, 7, (DefaultConstructorMarker) null);
    }

    private final long clampPlayTime(long j) {
        return C13537l.m30888o(j - ((long) this.delay), 0, (long) this.duration);
    }

    public final int getDelay() {
        return this.delay;
    }

    public final int getDuration() {
        return this.duration;
    }

    public long getDurationNanos(float f, float f2, float f3) {
        return ((long) (this.delay + this.duration)) * AnimationKt.MillisToNanos;
    }

    public float getValueFromNanos(long j, float f, float f2, float f3) {
        float f4;
        long clampPlayTime = clampPlayTime(j / AnimationKt.MillisToNanos);
        int i = this.duration;
        if (i == 0) {
            f4 = 1.0f;
        } else {
            f4 = ((float) clampPlayTime) / ((float) i);
        }
        return VectorConvertersKt.lerp(f, f2, this.easing.transform(C13537l.m30885l(f4, 0.0f, 1.0f)));
    }

    public float getVelocityFromNanos(long j, float f, float f2, float f3) {
        long clampPlayTime = clampPlayTime(j / AnimationKt.MillisToNanos);
        int i = (clampPlayTime > 0 ? 1 : (clampPlayTime == 0 ? 0 : -1));
        if (i < 0) {
            return 0.0f;
        }
        if (i == 0) {
            return f3;
        }
        return (getValueFromNanos(clampPlayTime * AnimationKt.MillisToNanos, f, f2, f3) - getValueFromNanos((clampPlayTime - 1) * AnimationKt.MillisToNanos, f, f2, f3)) * 1000.0f;
    }

    public FloatTweenSpec(int i, int i2, Easing easing2) {
        C12775o.m28639i(easing2, "easing");
        this.duration = i;
        this.delay = i2;
        this.easing = easing2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FloatTweenSpec(int i, int i2, Easing easing2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? AnimationConstants.DefaultDurationMillis : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? EasingKt.getFastOutSlowInEasing() : easing2);
    }
}
