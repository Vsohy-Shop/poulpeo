package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2\n*L\n1#1,873:1\n*E\n"})
@C12739f(mo50609c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", mo50610f = "DragGestureDetector.kt", mo50611l = {876}, mo50612m = "drag-VnAYq1g")
/* compiled from: DragGestureDetector.kt */
final class DragGestureDetectorKt$drag$2 extends C12737d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;

    DragGestureDetectorKt$drag$2(C12074d<? super DragGestureDetectorKt$drag$2> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m33060dragVnAYq1g((AwaitPointerEventScope) null, 0, (Function1<? super PointerInputChange, C11921v>) null, (Function1<? super PointerInputChange, Float>) null, (Function1<? super PointerInputChange, Boolean>) null, this);
    }
}
