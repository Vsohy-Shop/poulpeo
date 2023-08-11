package androidx.compose.runtime;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C12775o;
import p466yf.C13995l0;
import p466yf.C13999m0;

/* compiled from: Effects.kt */
public final class CompositionScopedCoroutineScopeCanceller implements RememberObserver {
    private final C13995l0 coroutineScope;

    public CompositionScopedCoroutineScopeCanceller(C13995l0 l0Var) {
        C12775o.m28639i(l0Var, "coroutineScope");
        this.coroutineScope = l0Var;
    }

    public final C13995l0 getCoroutineScope() {
        return this.coroutineScope;
    }

    public void onAbandoned() {
        C13999m0.m32450d(this.coroutineScope, (CancellationException) null, 1, (Object) null);
    }

    public void onForgotten() {
        C13999m0.m32450d(this.coroutineScope, (CancellationException) null, 1, (Object) null);
    }

    public void onRemembered() {
    }
}
