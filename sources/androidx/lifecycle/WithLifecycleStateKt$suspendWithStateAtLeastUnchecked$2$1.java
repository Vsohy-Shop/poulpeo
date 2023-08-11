package androidx.lifecycle;

/* compiled from: WithLifecycleState.kt */
final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1 implements Runnable {
    final /* synthetic */ C2337xfdb59cc4 $observer;
    final /* synthetic */ Lifecycle $this_suspendWithStateAtLeastUnchecked;

    WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1(Lifecycle lifecycle, C2337xfdb59cc4 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
        this.$this_suspendWithStateAtLeastUnchecked = lifecycle;
        this.$observer = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
    }

    public final void run() {
        this.$this_suspendWithStateAtLeastUnchecked.addObserver(this.$observer);
    }
}
