package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector1D;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: UpdatableAnimationState.kt */
final class UpdatableAnimationState$animateToZero$3 extends C12777p implements Function1<Long, C11921v> {
    final /* synthetic */ Function1<Float, C11921v> $beforeFrame;
    final /* synthetic */ float $durationScale;
    final /* synthetic */ UpdatableAnimationState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UpdatableAnimationState$animateToZero$3(UpdatableAnimationState updatableAnimationState, float f, Function1<? super Float, C11921v> function1) {
        super(1);
        this.this$0 = updatableAnimationState;
        this.$durationScale = f;
        this.$beforeFrame = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return C11921v.f18618a;
    }

    public final void invoke(long j) {
        long j2;
        if (this.this$0.lastFrameTime == Long.MIN_VALUE) {
            this.this$0.lastFrameTime = j;
        }
        AnimationVector1D animationVector1D = new AnimationVector1D(this.this$0.getValue());
        if (this.$durationScale == 0.0f) {
            j2 = UpdatableAnimationState.Companion.getRebasableAnimationSpec().getDurationNanos(new AnimationVector1D(this.this$0.getValue()), UpdatableAnimationState.Companion.getZeroVector(), this.this$0.lastVelocity);
        } else {
            j2 = C13265c.m30136e(((float) (j - this.this$0.lastFrameTime)) / this.$durationScale);
        }
        long j3 = j2;
        AnimationVector1D animationVector1D2 = animationVector1D;
        float value = UpdatableAnimationState.Companion.getRebasableAnimationSpec().getValueFromNanos(j3, animationVector1D2, UpdatableAnimationState.Companion.getZeroVector(), this.this$0.lastVelocity).getValue();
        this.this$0.lastVelocity = UpdatableAnimationState.Companion.getRebasableAnimationSpec().getVelocityFromNanos(j3, animationVector1D2, UpdatableAnimationState.Companion.getZeroVector(), this.this$0.lastVelocity);
        this.this$0.lastFrameTime = j;
        this.this$0.setValue(value);
        this.$beforeFrame.invoke(Float.valueOf(this.this$0.getValue() - value));
    }
}
