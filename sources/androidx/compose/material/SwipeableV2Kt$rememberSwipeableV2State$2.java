package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p404of.C13074a;

/* compiled from: SwipeableV2.kt */
final class SwipeableV2Kt$rememberSwipeableV2State$2 extends C12777p implements C13074a<SwipeableV2State<T>> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1<T, Boolean> $confirmValueChange;
    final /* synthetic */ T $initialValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableV2Kt$rememberSwipeableV2State$2(T t, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function1) {
        super(0);
        this.$initialValue = t;
        this.$animationSpec = animationSpec;
        this.$confirmValueChange = function1;
    }

    public final SwipeableV2State<T> invoke() {
        T t = this.$initialValue;
        AnimationSpec<Float> animationSpec = this.$animationSpec;
        Function1<T, Boolean> function1 = this.$confirmValueChange;
        SwipeableV2Defaults swipeableV2Defaults = SwipeableV2Defaults.INSTANCE;
        return new SwipeableV2State(t, animationSpec, function1, swipeableV2Defaults.getPositionalThreshold(), swipeableV2Defaults.m34146getVelocityThresholdD9Ej5fM(), (DefaultConstructorMarker) null);
    }
}
