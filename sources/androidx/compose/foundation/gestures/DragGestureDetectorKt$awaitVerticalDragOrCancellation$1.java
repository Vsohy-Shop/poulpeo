package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", mo50610f = "DragGestureDetector.kt", mo50611l = {876}, mo50612m = "awaitVerticalDragOrCancellation-rnUCldI")
/* compiled from: DragGestureDetector.kt */
final class DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 extends C12737d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    DragGestureDetectorKt$awaitVerticalDragOrCancellation$1(C12074d<? super DragGestureDetectorKt$awaitVerticalDragOrCancellation$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m33057awaitVerticalDragOrCancellationrnUCldI((AwaitPointerEventScope) null, 0, this);
    }
}
