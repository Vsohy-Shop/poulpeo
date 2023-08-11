package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13970h;
import p466yf.C13995l0;
import p466yf.C14054y1;

@C12739f(mo50609c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", mo50610f = "PausingDispatcher.kt", mo50611l = {203}, mo50612m = "invokeSuspend")
/* compiled from: PausingDispatcher.kt */
final class PausingDispatcherKt$whenStateAtLeast$2 extends C12746l implements C13088o<C13995l0, C12074d<? super T>, Object> {
    final /* synthetic */ C13088o<C13995l0, C12074d<? super T>, Object> $block;
    final /* synthetic */ Lifecycle.State $minState;
    final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, C13088o<? super C13995l0, ? super C12074d<? super T>, ? extends Object> oVar, C12074d<? super PausingDispatcherKt$whenStateAtLeast$2> dVar) {
        super(2, dVar);
        this.$this_whenStateAtLeast = lifecycle;
        this.$minState = state;
        this.$block = oVar;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, dVar);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    public final Object invokeSuspend(Object obj) {
        LifecycleController lifecycleController;
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            C14054y1 y1Var = (C14054y1) ((C13995l0) this.L$0).getCoroutineContext().get(C14054y1.f22970b0);
            if (y1Var != null) {
                PausingDispatcher pausingDispatcher = new PausingDispatcher();
                LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, y1Var);
                try {
                    C13088o<C13995l0, C12074d<? super T>, Object> oVar = this.$block;
                    this.L$0 = lifecycleController2;
                    this.label = 1;
                    obj = C13970h.m32378g(pausingDispatcher, oVar, this);
                    if (obj == c) {
                        return c;
                    }
                    lifecycleController = lifecycleController2;
                } catch (Throwable th) {
                    th = th;
                    lifecycleController = lifecycleController2;
                    lifecycleController.finish();
                    throw th;
                }
            } else {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
        } else if (i == 1) {
            lifecycleController = (LifecycleController) this.L$0;
            try {
                C11910n.m25701b(obj);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        lifecycleController.finish();
        return obj;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super T> dVar) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
