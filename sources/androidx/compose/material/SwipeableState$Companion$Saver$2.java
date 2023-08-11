package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: Swipeable.kt */
final class SwipeableState$Companion$Saver$2 extends C12777p implements Function1<T, SwipeableState<T>> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1<T, Boolean> $confirmStateChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableState$Companion$Saver$2(AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function1) {
        super(1);
        this.$animationSpec = animationSpec;
        this.$confirmStateChange = function1;
    }

    public final SwipeableState<T> invoke(T t) {
        C12775o.m28639i(t, "it");
        return new SwipeableState<>(t, this.$animationSpec, this.$confirmStateChange);
    }
}
