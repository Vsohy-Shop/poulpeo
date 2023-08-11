package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import androidx.compose.p002ui.input.pointer.util.VelocityTracker;
import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.functions.Function1;
import p355hf.C12074d;
import p404of.C13074a;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.DraggableKt", mo50610f = "Draggable.kt", mo50611l = {316, 325, 478, 528}, mo50612m = "awaitDownAndSlop")
/* compiled from: Draggable.kt */
final class DraggableKt$awaitDownAndSlop$1 extends C12737d {
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;

    DraggableKt$awaitDownAndSlop$1(C12074d<? super DraggableKt$awaitDownAndSlop$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DraggableKt.awaitDownAndSlop((AwaitPointerEventScope) null, (State<? extends Function1<? super PointerInputChange, Boolean>>) null, (State<? extends C13074a<Boolean>>) null, (VelocityTracker) null, (Orientation) null, this);
    }
}
