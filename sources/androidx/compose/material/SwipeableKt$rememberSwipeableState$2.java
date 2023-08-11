package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: Swipeable.kt */
final class SwipeableKt$rememberSwipeableState$2 extends C12777p implements C13074a<SwipeableState<T>> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1<T, Boolean> $confirmStateChange;
    final /* synthetic */ T $initialValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableKt$rememberSwipeableState$2(T t, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function1) {
        super(0);
        this.$initialValue = t;
        this.$animationSpec = animationSpec;
        this.$confirmStateChange = function1;
    }

    public final SwipeableState<T> invoke() {
        return new SwipeableState<>(this.$initialValue, this.$animationSpec, this.$confirmStateChange);
    }
}
