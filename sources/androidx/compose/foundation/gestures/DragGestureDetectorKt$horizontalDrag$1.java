package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", mo50610f = "DragGestureDetector.kt", mo50611l = {882}, mo50612m = "horizontalDrag-jO51t88")
/* compiled from: DragGestureDetector.kt */
final class DragGestureDetectorKt$horizontalDrag$1 extends C12737d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    DragGestureDetectorKt$horizontalDrag$1(C12074d<? super DragGestureDetectorKt$horizontalDrag$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m33063horizontalDragjO51t88((AwaitPointerEventScope) null, 0, (Function1<? super PointerInputChange, C11921v>) null, this);
    }
}
