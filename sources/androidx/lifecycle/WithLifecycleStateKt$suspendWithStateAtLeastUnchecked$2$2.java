package androidx.lifecycle;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p355hf.C12085h;
import p466yf.C13971h0;

/* compiled from: WithLifecycleState.kt */
final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2 extends C12777p implements Function1<Throwable, C11921v> {
    final /* synthetic */ C13971h0 $lifecycleDispatcher;
    final /* synthetic */ C2337xfdb59cc4 $observer;
    final /* synthetic */ Lifecycle $this_suspendWithStateAtLeastUnchecked;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2(C13971h0 h0Var, Lifecycle lifecycle, C2337xfdb59cc4 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
        super(1);
        this.$lifecycleDispatcher = h0Var;
        this.$this_suspendWithStateAtLeastUnchecked = lifecycle;
        this.$observer = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Throwable th) {
        C13971h0 h0Var = this.$lifecycleDispatcher;
        C12085h hVar = C12085h.f18916b;
        if (h0Var.isDispatchNeeded(hVar)) {
            C13971h0 h0Var2 = this.$lifecycleDispatcher;
            final Lifecycle lifecycle = this.$this_suspendWithStateAtLeastUnchecked;
            final C2337xfdb59cc4 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = this.$observer;
            h0Var2.dispatch(hVar, new Runnable() {
                public final void run() {
                    lifecycle.removeObserver(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
                }
            });
            return;
        }
        this.$this_suspendWithStateAtLeastUnchecked.removeObserver(this.$observer);
    }
}
