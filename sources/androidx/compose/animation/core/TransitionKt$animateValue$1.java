package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13089p;

/* compiled from: Transition.kt */
public final class TransitionKt$animateValue$1 extends C12777p implements C13089p<Transition.Segment<S>, Composer, Integer, SpringSpec<T>> {
    public static final TransitionKt$animateValue$1 INSTANCE = new TransitionKt$animateValue$1();

    public TransitionKt$animateValue$1() {
        super(3);
    }

    @Composable
    public final SpringSpec<T> invoke(Transition.Segment<S> segment, Composer composer, int i) {
        C12775o.m28639i(segment, "$this$null");
        composer.startReplaceableGroup(-895531546);
        SpringSpec<T> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, (Object) null, 7, (Object) null);
        composer.endReplaceableGroup();
        return spring$default;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
