package androidx.compose.runtime;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.functions.Function1;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.runtime.PausableMonotonicFrameClock", mo50610f = "PausableMonotonicFrameClock.kt", mo50611l = {62, 63}, mo50612m = "withFrameNanos")
/* compiled from: PausableMonotonicFrameClock.kt */
final class PausableMonotonicFrameClock$withFrameNanos$1<R> extends C12737d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PausableMonotonicFrameClock this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PausableMonotonicFrameClock$withFrameNanos$1(PausableMonotonicFrameClock pausableMonotonicFrameClock, C12074d<? super PausableMonotonicFrameClock$withFrameNanos$1> dVar) {
        super(dVar);
        this.this$0 = pausableMonotonicFrameClock;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.withFrameNanos((Function1) null, this);
    }
}
