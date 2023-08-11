package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", mo50610f = "Lifecycle.kt", mo50611l = {}, mo50612m = "invokeSuspend")
/* compiled from: Lifecycle.kt */
final class LifecycleCoroutineScopeImpl$register$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LifecycleCoroutineScopeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LifecycleCoroutineScopeImpl$register$1(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, C12074d<? super LifecycleCoroutineScopeImpl$register$1> dVar) {
        super(2, dVar);
        this.this$0 = lifecycleCoroutineScopeImpl;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.this$0, dVar);
        lifecycleCoroutineScopeImpl$register$1.L$0 = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C12150d.m26492c();
        if (this.label == 0) {
            C11910n.m25701b(obj);
            C13995l0 l0Var = (C13995l0) this.L$0;
            if (this.this$0.getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
                this.this$0.getLifecycle$lifecycle_common().addObserver(this.this$0);
            } else {
                C13944d2.m32238e(l0Var.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
            }
            return C11921v.f18618a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((LifecycleCoroutineScopeImpl$register$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
