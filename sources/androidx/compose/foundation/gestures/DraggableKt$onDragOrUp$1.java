package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.DraggableKt", mo50610f = "Draggable.kt", mo50611l = {470}, mo50612m = "onDragOrUp-Axegvzg")
/* compiled from: Draggable.kt */
final class DraggableKt$onDragOrUp$1 extends C12737d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    DraggableKt$onDragOrUp$1(C12074d<? super DraggableKt$onDragOrUp$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DraggableKt.m33082onDragOrUpAxegvzg((AwaitPointerEventScope) null, (Orientation) null, 0, (Function1<? super PointerInputChange, C11921v>) null, this);
    }
}
