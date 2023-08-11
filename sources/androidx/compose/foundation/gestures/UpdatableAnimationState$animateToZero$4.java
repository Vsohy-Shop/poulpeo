package androidx.compose.foundation.gestures;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: UpdatableAnimationState.kt */
final class UpdatableAnimationState$animateToZero$4 extends C12777p implements Function1<Long, C11921v> {
    final /* synthetic */ Function1<Float, C11921v> $beforeFrame;
    final /* synthetic */ UpdatableAnimationState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UpdatableAnimationState$animateToZero$4(UpdatableAnimationState updatableAnimationState, Function1<? super Float, C11921v> function1) {
        super(1);
        this.this$0 = updatableAnimationState;
        this.$beforeFrame = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return C11921v.f18618a;
    }

    public final void invoke(long j) {
        float value = this.this$0.getValue();
        this.this$0.setValue(0.0f);
        this.$beforeFrame.invoke(Float.valueOf(value));
    }
}
