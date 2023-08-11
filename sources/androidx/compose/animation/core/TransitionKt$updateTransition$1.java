package androidx.compose.animation.core;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: Transition.kt */
final class TransitionKt$updateTransition$1 extends C12777p implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ Transition<T> $transition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TransitionKt$updateTransition$1(Transition<T> transition) {
        super(1);
        this.$transition = transition;
    }

    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        C12775o.m28639i(disposableEffectScope, "$this$DisposableEffect");
        return new TransitionKt$updateTransition$1$invoke$$inlined$onDispose$1(this.$transition);
    }
}
