package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12762g0;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", mo50610f = "Scrollable.kt", mo50611l = {442}, mo50612m = "invokeSuspend")
/* compiled from: Scrollable.kt */
final class ScrollingLogic$doFlingAnimation$2 extends C12746l implements C13088o<ScrollScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ long $available;
    final /* synthetic */ C12762g0 $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, C12762g0 g0Var, long j, C12074d<? super ScrollingLogic$doFlingAnimation$2> dVar) {
        super(2, dVar);
        this.this$0 = scrollingLogic;
        this.$result = g0Var;
        this.$available = j;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, dVar);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    public final Object invoke(ScrollScope scrollScope, C12074d<? super C11921v> dVar) {
        return ((ScrollingLogic$doFlingAnimation$2) create(scrollScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        ScrollingLogic scrollingLogic2;
        C12762g0 g0Var;
        long j;
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            ScrollingLogic$doFlingAnimation$2$scope$1 scrollingLogic$doFlingAnimation$2$scope$1 = new ScrollingLogic$doFlingAnimation$2$scope$1(this.this$0, new ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1(this.this$0, (ScrollScope) this.L$0));
            scrollingLogic2 = this.this$0;
            C12762g0 g0Var2 = this.$result;
            long j2 = this.$available;
            FlingBehavior flingBehavior = scrollingLogic2.getFlingBehavior();
            long j3 = g0Var2.f20418b;
            float reverseIfNeeded = scrollingLogic2.reverseIfNeeded(scrollingLogic2.m33141toFloatTH1AsA0(j2));
            this.L$0 = scrollingLogic2;
            this.L$1 = scrollingLogic2;
            this.L$2 = g0Var2;
            this.J$0 = j3;
            this.label = 1;
            obj = flingBehavior.performFling(scrollingLogic$doFlingAnimation$2$scope$1, reverseIfNeeded, this);
            if (obj == c) {
                return c;
            }
            g0Var = g0Var2;
            scrollingLogic = scrollingLogic2;
            j = j3;
        } else if (i == 1) {
            j = this.J$0;
            g0Var = (C12762g0) this.L$2;
            scrollingLogic2 = (ScrollingLogic) this.L$1;
            scrollingLogic = (ScrollingLogic) this.L$0;
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g0Var.f20418b = scrollingLogic2.m33144updateQWom1Mo(j, scrollingLogic.reverseIfNeeded(((Number) obj).floatValue()));
        return C11921v.f18618a;
    }
}
