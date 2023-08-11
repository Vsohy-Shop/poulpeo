package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12757e0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: AppBar.kt */
final class AppBarKt$settleAppBar$2 extends C12777p implements Function1<AnimationScope<Float, AnimationVector1D>, C11921v> {
    final /* synthetic */ C12757e0 $lastValue;
    final /* synthetic */ C12757e0 $remainingVelocity;
    final /* synthetic */ TopAppBarState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppBarKt$settleAppBar$2(C12757e0 e0Var, TopAppBarState topAppBarState, C12757e0 e0Var2) {
        super(1);
        this.$lastValue = e0Var;
        this.$state = topAppBarState;
        this.$remainingVelocity = e0Var2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AnimationScope<Float, AnimationVector1D>) (AnimationScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
        C12775o.m28639i(animationScope, "$this$animateDecay");
        float floatValue = animationScope.getValue().floatValue() - this.$lastValue.f20408b;
        float heightOffset = this.$state.getHeightOffset();
        this.$state.setHeightOffset(heightOffset + floatValue);
        float abs = Math.abs(heightOffset - this.$state.getHeightOffset());
        this.$lastValue.f20408b = animationScope.getValue().floatValue();
        this.$remainingVelocity.f20408b = animationScope.getVelocity().floatValue();
        if (Math.abs(floatValue - abs) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }
}
