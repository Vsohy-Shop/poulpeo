package androidx.compose.material;

import java.util.Map;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.material.SwipeableState", mo50610f = "Swipeable.kt", mo50611l = {159, 183, 186}, mo50612m = "processNewAnchors$material_release")
/* compiled from: Swipeable.kt */
final class SwipeableState$processNewAnchors$1 extends C12737d {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableState$processNewAnchors$1(SwipeableState<T> swipeableState, C12074d<? super SwipeableState$processNewAnchors$1> dVar) {
        super(dVar);
        this.this$0 = swipeableState;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.processNewAnchors$material_release((Map) null, (Map) null, this);
    }
}
