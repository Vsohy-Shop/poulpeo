package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* compiled from: Effects.kt */
final class DisposableEffectImpl implements RememberObserver {
    private final Function1<DisposableEffectScope, DisposableEffectResult> effect;
    private DisposableEffectResult onDispose;

    public DisposableEffectImpl(Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> function1) {
        C12775o.m28639i(function1, "effect");
        this.effect = function1;
    }

    public void onForgotten() {
        DisposableEffectResult disposableEffectResult = this.onDispose;
        if (disposableEffectResult != null) {
            disposableEffectResult.dispose();
        }
        this.onDispose = null;
    }

    public void onRemembered() {
        this.onDispose = this.effect.invoke(EffectsKt.InternalDisposableEffectScope);
    }

    public void onAbandoned() {
    }
}
