package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1", mo50610f = "PullRefreshState.kt", mo50611l = {185}, mo50612m = "invokeSuspend")
/* compiled from: PullRefreshState.kt */
final class PullRefreshState$animateIndicatorTo$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ float $offset;
    int label;
    final /* synthetic */ PullRefreshState this$0;

    @C12739f(mo50609c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1", mo50610f = "PullRefreshState.kt", mo50611l = {186}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1 */
    /* compiled from: PullRefreshState.kt */
    static final class C08271 extends C12746l implements Function1<C12074d<? super C11921v>, Object> {
        int label;

        public final C12074d<C11921v> create(C12074d<?> dVar) {
            return new C08271(pullRefreshState, f, dVar);
        }

        public final Object invoke(C12074d<? super C11921v> dVar) {
            return ((C08271) create(dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                float access$get_position = pullRefreshState.get_position();
                float f = f;
                final PullRefreshState pullRefreshState = pullRefreshState;
                C08281 r7 = new C13088o<Float, Float, C11921v>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                        return C11921v.f18618a;
                    }

                    public final void invoke(float f, float f2) {
                        pullRefreshState.set_position(f);
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.animate$default(access$get_position, f, 0.0f, (AnimationSpec) null, r7, this, 12, (Object) null) == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11921v.f18618a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PullRefreshState$animateIndicatorTo$1(PullRefreshState pullRefreshState, float f, C12074d<? super PullRefreshState$animateIndicatorTo$1> dVar) {
        super(2, dVar);
        this.this$0 = pullRefreshState;
        this.$offset = f;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new PullRefreshState$animateIndicatorTo$1(this.this$0, this.$offset, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            MutatorMutex access$getMutatorMutex$p = this.this$0.mutatorMutex;
            final PullRefreshState pullRefreshState = this.this$0;
            final float f = this.$offset;
            C08271 r5 = new C08271((C12074d<? super C08271>) null);
            this.label = 1;
            if (MutatorMutex.mutate$default(access$getMutatorMutex$p, (MutatePriority) null, r5, this, 1, (Object) null) == c) {
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
        return ((PullRefreshState$animateIndicatorTo$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
