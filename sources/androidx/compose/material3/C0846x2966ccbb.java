package androidx.compose.material3;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.material3.DragGestureDetectorCopyKt", mo50610f = "DragGestureDetectorCopy.kt", mo50611l = {144, 182}, mo50612m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE")
/* renamed from: androidx.compose.material3.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 */
/* compiled from: DragGestureDetectorCopy.kt */
final class C0846x2966ccbb extends C12737d {
    float F$0;
    float F$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    C0846x2966ccbb(C12074d<? super C0846x2966ccbb> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorCopyKt.m34396awaitHorizontalPointerSlopOrCancellationgDDlDlE((AwaitPointerEventScope) null, 0, 0, (C13088o<? super PointerInputChange, ? super Float, C11921v>) null, this);
    }
}
