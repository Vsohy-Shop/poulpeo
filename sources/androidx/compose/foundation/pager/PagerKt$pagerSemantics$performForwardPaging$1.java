package androidx.compose.foundation.pager;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performForwardPaging$1", mo50610f = "Pager.kt", mo50611l = {744}, mo50612m = "invokeSuspend")
/* compiled from: Pager.kt */
final class PagerKt$pagerSemantics$performForwardPaging$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ PagerState $state;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagerKt$pagerSemantics$performForwardPaging$1(PagerState pagerState, C12074d<? super PagerKt$pagerSemantics$performForwardPaging$1> dVar) {
        super(2, dVar);
        this.$state = pagerState;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new PagerKt$pagerSemantics$performForwardPaging$1(this.$state, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            PagerState pagerState = this.$state;
            this.label = 1;
            if (PagerStateKt.animateToNextPage(pagerState, this) == c) {
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
        return ((PagerKt$pagerSemantics$performForwardPaging$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
