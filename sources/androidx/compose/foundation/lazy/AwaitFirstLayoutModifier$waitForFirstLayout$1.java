package androidx.compose.foundation.lazy;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.lazy.AwaitFirstLayoutModifier", mo50610f = "LazyListState.kt", mo50611l = {445}, mo50612m = "waitForFirstLayout")
/* compiled from: LazyListState.kt */
final class AwaitFirstLayoutModifier$waitForFirstLayout$1 extends C12737d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AwaitFirstLayoutModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AwaitFirstLayoutModifier$waitForFirstLayout$1(AwaitFirstLayoutModifier awaitFirstLayoutModifier, C12074d<? super AwaitFirstLayoutModifier$waitForFirstLayout$1> dVar) {
        super(dVar);
        this.this$0 = awaitFirstLayoutModifier;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.waitForFirstLayout(this);
    }
}
