package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", mo50610f = "Pager.kt", mo50611l = {690}, mo50612m = "performFling")
/* compiled from: Pager.kt */
final class PagerWrapperFlingBehavior$performFling$1 extends C12737d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PagerWrapperFlingBehavior this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagerWrapperFlingBehavior$performFling$1(PagerWrapperFlingBehavior pagerWrapperFlingBehavior, C12074d<? super PagerWrapperFlingBehavior$performFling$1> dVar) {
        super(dVar);
        this.this$0 = pagerWrapperFlingBehavior;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.performFling((ScrollScope) null, 0.0f, this);
    }
}
