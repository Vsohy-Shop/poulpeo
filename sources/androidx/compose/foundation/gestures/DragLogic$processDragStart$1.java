package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.DragLogic", mo50610f = "Draggable.kt", mo50611l = {404, 407, 409}, mo50612m = "processDragStart")
/* compiled from: Draggable.kt */
final class DragLogic$processDragStart$1 extends C12737d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DragLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DragLogic$processDragStart$1(DragLogic dragLogic, C12074d<? super DragLogic$processDragStart$1> dVar) {
        super(dVar);
        this.this$0 = dragLogic;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.processDragStart((C13995l0) null, (DragEvent.DragStarted) null, this);
    }
}
