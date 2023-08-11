package androidx.lifecycle;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", mo50610f = "Lifecycle.kt", mo50611l = {356}, mo50612m = "invokeSuspend")
/* compiled from: Lifecycle.kt */
final class LifecycleCoroutineScope$launchWhenStarted$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C13088o<C13995l0, C12074d<? super C11921v>, Object> $block;
    int label;
    final /* synthetic */ LifecycleCoroutineScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LifecycleCoroutineScope$launchWhenStarted$1(LifecycleCoroutineScope lifecycleCoroutineScope, C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super LifecycleCoroutineScope$launchWhenStarted$1> dVar) {
        super(2, dVar);
        this.this$0 = lifecycleCoroutineScope;
        this.$block = oVar;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new LifecycleCoroutineScope$launchWhenStarted$1(this.this$0, this.$block, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            Lifecycle lifecycle$lifecycle_common = this.this$0.getLifecycle$lifecycle_common();
            C13088o<C13995l0, C12074d<? super C11921v>, Object> oVar = this.$block;
            this.label = 1;
            if (PausingDispatcherKt.whenStarted(lifecycle$lifecycle_common, oVar, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((LifecycleCoroutineScope$launchWhenStarted$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
