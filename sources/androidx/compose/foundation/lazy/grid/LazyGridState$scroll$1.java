package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.lazy.grid.LazyGridState", mo50610f = "LazyGridState.kt", mo50611l = {273, 274}, mo50612m = "scroll")
/* compiled from: LazyGridState.kt */
final class LazyGridState$scroll$1 extends C12737d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LazyGridState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyGridState$scroll$1(LazyGridState lazyGridState, C12074d<? super LazyGridState$scroll$1> dVar) {
        super(dVar);
        this.this$0 = lazyGridState;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.scroll((MutatePriority) null, (C13088o<? super ScrollScope, ? super C12074d<? super C11921v>, ? extends Object>) null, this);
    }
}
