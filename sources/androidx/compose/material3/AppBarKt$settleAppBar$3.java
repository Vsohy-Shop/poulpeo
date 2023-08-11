package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: AppBar.kt */
final class AppBarKt$settleAppBar$3 extends C12777p implements Function1<AnimationScope<Float, AnimationVector1D>, C11921v> {
    final /* synthetic */ TopAppBarState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppBarKt$settleAppBar$3(TopAppBarState topAppBarState) {
        super(1);
        this.$state = topAppBarState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AnimationScope<Float, AnimationVector1D>) (AnimationScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
        C12775o.m28639i(animationScope, "$this$animateTo");
        this.$state.setHeightOffset(animationScope.getValue().floatValue());
    }
}
