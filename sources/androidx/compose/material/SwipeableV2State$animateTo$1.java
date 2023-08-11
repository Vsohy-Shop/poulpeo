package androidx.compose.material;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.material.SwipeableV2State", mo50610f = "SwipeableV2.kt", mo50611l = {335}, mo50612m = "animateTo")
/* compiled from: SwipeableV2.kt */
final class SwipeableV2State$animateTo$1 extends C12737d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeableV2State<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableV2State$animateTo$1(SwipeableV2State<T> swipeableV2State, C12074d<? super SwipeableV2State$animateTo$1> dVar) {
        super(dVar);
        this.this$0 = swipeableV2State;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.animateTo(null, 0.0f, this);
    }
}
