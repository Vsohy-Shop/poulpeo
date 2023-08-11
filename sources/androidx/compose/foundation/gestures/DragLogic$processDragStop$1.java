package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.DragLogic", mo50610f = "Draggable.kt", mo50611l = {414, 417}, mo50612m = "processDragStop")
/* compiled from: Draggable.kt */
final class DragLogic$processDragStop$1 extends C12737d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DragLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DragLogic$processDragStop$1(DragLogic dragLogic, C12074d<? super DragLogic$processDragStop$1> dVar) {
        super(dVar);
        this.this$0 = dragLogic;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.processDragStop((C13995l0) null, (DragEvent.DragStopped) null, this);
    }
}
