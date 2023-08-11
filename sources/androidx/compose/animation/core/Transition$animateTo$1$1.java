package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.animation.core.Transition$animateTo$1$1", mo50610f = "Transition.kt", mo50611l = {434}, mo50612m = "invokeSuspend")
/* compiled from: Transition.kt */
final class Transition$animateTo$1$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Transition<S> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Transition$animateTo$1$1(Transition<S> transition, C12074d<? super Transition$animateTo$1$1> dVar) {
        super(2, dVar);
        this.this$0 = transition;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        Transition$animateTo$1$1 transition$animateTo$1$1 = new Transition$animateTo$1$1(this.this$0, dVar);
        transition$animateTo$1$1.L$0 = obj;
        return transition$animateTo$1$1;
    }

    public final Object invokeSuspend(Object obj) {
        C13995l0 l0Var;
        C03391 r4;
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            l0Var = (C13995l0) this.L$0;
        } else if (i == 1) {
            l0Var = (C13995l0) this.L$0;
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        do {
            final float durationScale = SuspendAnimationKt.getDurationScale(l0Var.getCoroutineContext());
            final Transition<S> transition = this.this$0;
            r4 = new Function1<Long, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).longValue());
                    return C11921v.f18618a;
                }

                public final void invoke(long j) {
                    if (!transition.isSeeking()) {
                        transition.onFrame$animation_core_release(j / 1, durationScale);
                    }
                }
            };
            this.L$0 = l0Var;
            this.label = 1;
        } while (MonotonicFrameClockKt.withFrameNanos(r4, this) != c);
        return c;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((Transition$animateTo$1$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
