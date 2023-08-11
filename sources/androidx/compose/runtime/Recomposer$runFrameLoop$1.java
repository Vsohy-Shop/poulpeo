package androidx.compose.runtime;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.runtime.Recomposer", mo50610f = "Recomposer.kt", mo50611l = {777, 784}, mo50612m = "runFrameLoop")
/* compiled from: Recomposer.kt */
final class Recomposer$runFrameLoop$1 extends C12737d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recomposer$runFrameLoop$1(Recomposer recomposer, C12074d<? super Recomposer$runFrameLoop$1> dVar) {
        super(dVar);
        this.this$0 = recomposer;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.runFrameLoop((MonotonicFrameClock) null, (ProduceFrameSignal) null, this);
    }
}
