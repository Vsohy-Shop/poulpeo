package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.ScrollingLogic", mo50610f = "Scrollable.kt", mo50611l = {419, 421}, mo50612m = "onDragStopped-sF-c-tU")
/* compiled from: Scrollable.kt */
final class ScrollingLogic$onDragStopped$1 extends C12737d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollingLogic$onDragStopped$1(ScrollingLogic scrollingLogic, C12074d<? super ScrollingLogic$onDragStopped$1> dVar) {
        super(dVar);
        this.this$0 = scrollingLogic;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m33136onDragStoppedsFctU(0, this);
    }
}
