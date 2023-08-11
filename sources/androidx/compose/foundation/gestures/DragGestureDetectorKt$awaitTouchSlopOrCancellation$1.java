package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", mo50610f = "DragGestureDetector.kt", mo50611l = {883, 933}, mo50612m = "awaitTouchSlopOrCancellation-jO51t88")
/* compiled from: DragGestureDetector.kt */
final class DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 extends C12737d {
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    DragGestureDetectorKt$awaitTouchSlopOrCancellation$1(C12074d<? super DragGestureDetectorKt$awaitTouchSlopOrCancellation$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m33056awaitTouchSlopOrCancellationjO51t88((AwaitPointerEventScope) null, 0, (C13088o<? super PointerInputChange, ? super Offset, C11921v>) null, this);
    }
}
