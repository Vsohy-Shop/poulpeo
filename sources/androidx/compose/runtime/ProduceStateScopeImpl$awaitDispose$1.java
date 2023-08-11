package androidx.compose.runtime;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;

@C12739f(mo50609c = "androidx.compose.runtime.ProduceStateScopeImpl", mo50610f = "ProduceState.kt", mo50611l = {225}, mo50612m = "awaitDispose")
/* compiled from: ProduceState.kt */
final class ProduceStateScopeImpl$awaitDispose$1 extends C12737d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProduceStateScopeImpl<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProduceStateScopeImpl$awaitDispose$1(ProduceStateScopeImpl<T> produceStateScopeImpl, C12074d<? super ProduceStateScopeImpl$awaitDispose$1> dVar) {
        super(dVar);
        this.this$0 = produceStateScopeImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitDispose((C13074a<C11921v>) null, this);
    }
}
